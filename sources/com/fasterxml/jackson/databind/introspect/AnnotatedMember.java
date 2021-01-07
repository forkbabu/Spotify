package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.util.HashMap;

public abstract class AnnotatedMember extends Annotated implements Serializable {
    private static final long serialVersionUID = 1;
    protected final transient AnnotationMap _annotations;
    protected final transient TypeResolutionContext _typeContext;

    protected AnnotatedMember(TypeResolutionContext typeResolutionContext, AnnotationMap annotationMap) {
        this._typeContext = typeResolutionContext;
        this._annotations = annotationMap;
    }

    public final void fixAccess(boolean z) {
        Member member = mo17getMember();
        if (member != null) {
            ClassUtil.checkAndFixAccess(member, z);
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        HashMap<Class<?>, Annotation> hashMap;
        AnnotationMap annotationMap = this._annotations;
        if (annotationMap == null || (hashMap = annotationMap._annotations) == null) {
            return null;
        }
        return (A) hashMap.get(cls);
    }

    public abstract Class<?> getDeclaringClass();

    public String getFullName() {
        return getDeclaringClass().getName() + "#" + getName();
    }

    /* renamed from: getMember */
    public abstract Member mo17getMember();

    public abstract Object getValue(Object obj);

    public final boolean hasAnnotation(Class<?> cls) {
        HashMap<Class<?>, Annotation> hashMap;
        AnnotationMap annotationMap = this._annotations;
        if (annotationMap == null || (hashMap = annotationMap._annotations) == null) {
            return false;
        }
        return hashMap.containsKey(cls);
    }

    public abstract Annotated withAnnotations(AnnotationMap annotationMap);

    protected AnnotatedMember(AnnotatedMember annotatedMember) {
        this._typeContext = annotatedMember._typeContext;
        this._annotations = annotatedMember._annotations;
    }
}
