package com.spotify.cosmos.android.cosmonaut.atoms;

import com.google.common.escape.Escaper;
import com.google.common.net.UrlEscapers;
import com.spotify.cosmos.android.cosmonaut.annotations.DELETE;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class PathAtom {
    private final List<IndexedAnnotation<Path>> mNamedPathIndex;
    private final String mUri;

    PathAtom(Method method) {
        this.mNamedPathIndex = createNamedPathIndex(method);
        this.mUri = parseUri(ReflectionUtil.findActionAnnotation(method));
    }

    /* access modifiers changed from: package-private */
    public String call(Object[] objArr) {
        HashMap hashMap = new HashMap(this.mNamedPathIndex.size());
        Escaper urlPathSegmentEscaper = UrlEscapers.urlPathSegmentEscaper();
        for (IndexedAnnotation<Path> indexedAnnotation : this.mNamedPathIndex) {
            String value = ((Path) indexedAnnotation.mAnnotation).value();
            String convertPathArg = convertPathArg(value, objArr[indexedAnnotation.mIndex]);
            if (!((Path) indexedAnnotation.mAnnotation).encoded()) {
                convertPathArg = urlPathSegmentEscaper.escape(convertPathArg);
            }
            hashMap.put(value, convertPathArg);
        }
        StringBuilder sb = new StringBuilder(this.mUri);
        for (Map.Entry entry : hashMap.entrySet()) {
            String H0 = je.H0(je.S0('{'), (String) entry.getKey(), '}');
            int indexOf = sb.indexOf(H0);
            sb.replace(indexOf, H0.length() + indexOf, (String) entry.getValue());
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public String convertPathArg(String str, Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        if (obj == null) {
            throw new IllegalArgumentException(je.y0("@Path argument ", str, " is null"));
        }
        StringBuilder a1 = je.a1("@Path argument ", str, " has unsupported type: ");
        a1.append(obj.getClass().getName());
        throw new IllegalArgumentException(a1.toString());
    }

    /* access modifiers changed from: package-private */
    public List<IndexedAnnotation<Path>> createNamedPathIndex(Method method) {
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        ArrayList arrayList = new ArrayList(parameterAnnotations.length);
        int length = parameterAnnotations.length;
        for (int i = 0; i < length; i++) {
            Path path = (Path) ReflectionUtil.findAnnotation(parameterAnnotations[i], Path.class);
            if (path != null) {
                arrayList.add(new IndexedAnnotation(path, i));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public String parseUri(Annotation annotation) {
        if (annotation instanceof GET) {
            return ((GET) annotation).value();
        }
        if (annotation instanceof POST) {
            return ((POST) annotation).value();
        }
        if (annotation instanceof SUB) {
            return ((SUB) annotation).value();
        }
        if (annotation instanceof DELETE) {
            return ((DELETE) annotation).value();
        }
        if (annotation instanceof PUT) {
            return ((PUT) annotation).value();
        }
        throw new IllegalArgumentException(String.valueOf(annotation.annotationType()));
    }
}
