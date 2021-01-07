package com.spotify.cosmos.android.cosmonaut.atoms;

import com.spotify.cosmos.android.cosmonaut.annotations.Header;
import com.spotify.cosmos.android.cosmonaut.annotations.HeaderMap;
import com.spotify.cosmos.android.cosmonaut.annotations.Headers;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class HeadersAtom {
    private final List<IndexedAnnotation<HeaderMap>> mDynamicHeaderMapsIndex;
    private final List<IndexedAnnotation<Header>> mDynamicHeadersIndex;
    private final Map<String, String> mStaticHeaders;

    HeadersAtom(Method method) {
        this.mStaticHeaders = createHeaders(method);
        this.mDynamicHeadersIndex = createDynamicHeadersIndex(method);
        this.mDynamicHeaderMapsIndex = createDynamicHeaderMapsIndex(method);
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> call(Object[] objArr) {
        HashMap hashMap = new HashMap(this.mStaticHeaders);
        for (IndexedAnnotation<Header> indexedAnnotation : this.mDynamicHeadersIndex) {
            Object obj = objArr[indexedAnnotation.mIndex];
            String value = ((Header) indexedAnnotation.mAnnotation).value();
            hashMap.put(value, convertHeaderArg(value, obj));
        }
        for (IndexedAnnotation<HeaderMap> indexedAnnotation2 : this.mDynamicHeaderMapsIndex) {
            Object obj2 = objArr[indexedAnnotation2.mIndex];
            if (obj2 == null) {
                throw new IllegalArgumentException("@HeaderMap argument is null");
            } else if (obj2 instanceof Map) {
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    String valueOf = String.valueOf(entry.getKey());
                    hashMap.put(valueOf, convertHeaderArg(valueOf, entry.getValue()));
                }
            } else {
                throw new IllegalArgumentException("@HeaderMap argument is not a java.util.Map");
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public String convertHeaderArg(String str, Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        if (obj == null) {
            throw new IllegalArgumentException(je.y0("@Header argument ", str, " is null"));
        }
        StringBuilder a1 = je.a1("@Header argument ", str, " has unsupported type: ");
        a1.append(obj.getClass().getName());
        throw new IllegalArgumentException(a1.toString());
    }

    /* access modifiers changed from: package-private */
    public List<IndexedAnnotation<HeaderMap>> createDynamicHeaderMapsIndex(Method method) {
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        ArrayList arrayList = new ArrayList(parameterAnnotations.length);
        int length = parameterAnnotations.length;
        for (int i = 0; i < length; i++) {
            HeaderMap headerMap = (HeaderMap) ReflectionUtil.findAnnotation(parameterAnnotations[i], HeaderMap.class);
            if (headerMap != null) {
                arrayList.add(new IndexedAnnotation(headerMap, i));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public List<IndexedAnnotation<Header>> createDynamicHeadersIndex(Method method) {
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        ArrayList arrayList = new ArrayList(parameterAnnotations.length);
        int length = parameterAnnotations.length;
        for (int i = 0; i < length; i++) {
            Header header = (Header) ReflectionUtil.findAnnotation(parameterAnnotations[i], Header.class);
            if (header != null) {
                arrayList.add(new IndexedAnnotation(header, i));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> createHeaders(Method method) {
        Headers headers = (Headers) method.getAnnotation(Headers.class);
        if (headers == null) {
            return Collections.emptyMap();
        }
        String[] value = headers.value();
        HashMap hashMap = new HashMap();
        for (String str : value) {
            int indexOf = str.indexOf(58);
            if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                throw new IllegalArgumentException('\"' + str + "\" is not in the form \"Name: Value\"");
            }
            String substring = str.substring(0, indexOf);
            String trim = str.substring(indexOf + 1).trim();
            if (!trim.isEmpty()) {
                hashMap.put(substring, trim);
            } else {
                throw new IllegalArgumentException('\"' + substring + "\" valuer is empty");
            }
        }
        return hashMap;
    }
}
