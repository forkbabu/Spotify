package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;

public abstract class AnnotatedWithParams extends AnnotatedMember {
    private static final long serialVersionUID = 1;
    protected final AnnotationMap[] _paramAnnotations;

    protected AnnotatedWithParams(TypeResolutionContext typeResolutionContext, AnnotationMap annotationMap, AnnotationMap[] annotationMapArr) {
        super(typeResolutionContext, annotationMap);
        this._paramAnnotations = annotationMapArr;
    }

    public abstract Object call();

    public abstract Object call(Object[] objArr);

    public abstract Object call1(Object obj);

    public final AnnotatedParameter getParameter(int i) {
        JavaType parameterType = getParameterType(i);
        TypeResolutionContext typeResolutionContext = this._typeContext;
        AnnotationMap[] annotationMapArr = this._paramAnnotations;
        return new AnnotatedParameter(this, parameterType, typeResolutionContext, (annotationMapArr == null || i < 0 || i >= annotationMapArr.length) ? null : annotationMapArr[i], i);
    }

    public abstract int getParameterCount();

    public abstract JavaType getParameterType(int i);

    public abstract Class<?> getRawParameterType(int i);

    protected AnnotatedWithParams(AnnotatedWithParams annotatedWithParams, AnnotationMap[] annotationMapArr) {
        super(annotatedWithParams);
        this._paramAnnotations = null;
    }
}
