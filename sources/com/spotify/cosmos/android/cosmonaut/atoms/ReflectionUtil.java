package com.spotify.cosmos.android.cosmonaut.atoms;

import com.google.common.collect.ImmutableSet;
import com.spotify.cosmos.android.cosmonaut.annotations.DELETE;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

final class ReflectionUtil {
    private static final ImmutableSet<Class<? extends Annotation>> ACTIONS;

    static {
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        builder.mo53add((ImmutableSet.Builder) GET.class);
        builder.mo53add((ImmutableSet.Builder) POST.class);
        builder.mo53add((ImmutableSet.Builder) SUB.class);
        builder.mo53add((ImmutableSet.Builder) DELETE.class);
        builder.mo53add((ImmutableSet.Builder) PUT.class);
        ACTIONS = builder.build();
    }

    private ReflectionUtil() {
    }

    static String findAction(Method method) {
        return findActionAnnotation(method).annotationType().getSimpleName();
    }

    static Annotation findActionAnnotation(Method method) {
        Annotation[] annotations = method.getAnnotations();
        for (Annotation annotation : annotations) {
            if (ACTIONS.contains(annotation.annotationType())) {
                return annotation;
            }
        }
        throw new IllegalArgumentException(method + " does not declare one of " + ACTIONS + ", found " + Arrays.toString(annotations));
    }

    static <T> T findAnnotation(Annotation[] annotationArr, Class<T> cls) {
        for (Annotation annotation : annotationArr) {
            T t = (T) annotation;
            if (cls.isAssignableFrom(t.annotationType())) {
                return t;
            }
        }
        return null;
    }
}
