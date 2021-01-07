package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public abstract class Annotated {
    protected Annotated() {
    }

    @Override // java.lang.Object
    public abstract boolean equals(Object obj);

    /* renamed from: getAnnotated */
    public abstract AnnotatedElement mo14getAnnotated();

    public abstract <A extends Annotation> A getAnnotation(Class<A> cls);

    public abstract String getName();

    public abstract Class<?> getRawType();

    public abstract JavaType getType();

    @Override // java.lang.Object
    public abstract int hashCode();

    @Override // java.lang.Object
    public abstract String toString();
}
