package com.spotify.cosmos.android.cosmonaut.atoms;

import com.google.common.base.Optional;
import com.google.common.escape.Escaper;
import com.google.common.net.UrlEscapers;
import com.spotify.cosmos.android.cosmonaut.annotations.Query;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class QueryAtom {
    private final List<IndexedAnnotation<Query>> mNamedQueryIndex;
    private final Optional<IndexedAnnotation<QueryMap>> mQueryMapIndex;

    QueryAtom(Method method) {
        this.mNamedQueryIndex = createNamedQueryIndex(method);
        this.mQueryMapIndex = findQueryMapIndex(method);
    }

    static Map<String, Object> convertToTypedMap(Object obj) {
        return (Map) obj;
    }

    static boolean isClassAssignableFromType(Type type, Class<?> cls) {
        return (type instanceof Class) && cls.isAssignableFrom((Class) type);
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> call(Object[] objArr) {
        HashMap hashMap = new HashMap();
        fillQueryArguments(hashMap, objArr);
        fillQueryMapArguments(hashMap, objArr);
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public String convertQueryArg(String str, Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        StringBuilder a1 = je.a1("@Query argument ", str, " has unsupported type: ");
        a1.append(obj.getClass().getName());
        throw new IllegalArgumentException(a1.toString());
    }

    /* access modifiers changed from: package-private */
    public List<IndexedAnnotation<Query>> createNamedQueryIndex(Method method) {
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        ArrayList arrayList = new ArrayList(parameterAnnotations.length);
        int length = parameterAnnotations.length;
        for (int i = 0; i < length; i++) {
            Query query = (Query) ReflectionUtil.findAnnotation(parameterAnnotations[i], Query.class);
            if (query != null) {
                arrayList.add(new IndexedAnnotation(query, i));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void fillQueryArguments(Map<String, String> map, Object[] objArr) {
        Escaper urlFormParameterEscaper = UrlEscapers.urlFormParameterEscaper();
        for (IndexedAnnotation<Query> indexedAnnotation : this.mNamedQueryIndex) {
            Object obj = objArr[indexedAnnotation.mIndex];
            if (obj != null) {
                String value = ((Query) indexedAnnotation.mAnnotation).value();
                String convertQueryArg = convertQueryArg(value, obj);
                if (!((Query) indexedAnnotation.mAnnotation).encoded()) {
                    convertQueryArg = urlFormParameterEscaper.escape(convertQueryArg);
                }
                map.put(value, convertQueryArg(value, convertQueryArg));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void fillQueryMapArguments(Map<String, String> map, Object[] objArr) {
        Escaper urlFormParameterEscaper = UrlEscapers.urlFormParameterEscaper();
        if (this.mQueryMapIndex.isPresent()) {
            IndexedAnnotation<QueryMap> indexedAnnotation = this.mQueryMapIndex.get();
            Object obj = objArr[indexedAnnotation.mIndex];
            if (obj instanceof Map) {
                for (Map.Entry<String, Object> entry : convertToTypedMap(obj).entrySet()) {
                    String convertQueryArg = convertQueryArg(entry.getKey(), entry.getValue());
                    if (!((QueryMap) indexedAnnotation.mAnnotation).encoded()) {
                        convertQueryArg = urlFormParameterEscaper.escape(convertQueryArg);
                    }
                    map.put(entry.getKey(), convertQueryArg);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Optional<IndexedAnnotation<QueryMap>> findQueryMapIndex(Method method) {
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        int length = parameterAnnotations.length;
        for (int i = 0; i < length; i++) {
            QueryMap queryMap = (QueryMap) ReflectionUtil.findAnnotation(parameterAnnotations[i], QueryMap.class);
            if (queryMap != null) {
                if (isValidQueryMapArgumentType(method.getGenericParameterTypes()[i])) {
                    return Optional.of(new IndexedAnnotation(queryMap, i));
                } else {
                    throw new IllegalArgumentException("@QueryMap argument should be Map<String, Object> or Map<String, String>");
                }
            }
        }
        return Optional.absent();
    }

    /* access modifiers changed from: package-private */
    public boolean isValidQueryMapArgumentType(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments.length != 2 || !isClassAssignableFromType(rawType, Map.class) || !isClassAssignableFromType(actualTypeArguments[0], String.class)) {
            return false;
        }
        return true;
    }
}
