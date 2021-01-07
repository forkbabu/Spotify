package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
public final class AnnotatedCreatorCollector extends CollectorBase {
    private AnnotatedConstructor _defaultConstructor;
    private final TypeResolutionContext _typeContext;

    AnnotatedCreatorCollector(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext) {
        super(annotationIntrospector);
        this._typeContext = typeResolutionContext;
    }

    private AnnotationMap[] collectAnnotations(Annotation[][] annotationArr, Annotation[][] annotationArr2) {
        int length = annotationArr.length;
        AnnotationMap[] annotationMapArr = new AnnotationMap[length];
        for (int i = 0; i < length; i++) {
            AnnotationCollector collectAnnotations = collectAnnotations(AnnotationCollector.EmptyCollector.instance, annotationArr[i]);
            if (annotationArr2 != null) {
                collectAnnotations = collectAnnotations(collectAnnotations, annotationArr2[i]);
            }
            annotationMapArr[i] = collectAnnotations.asAnnotationMap();
        }
        return annotationMapArr;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:109:0x0061 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0196  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fasterxml.jackson.databind.introspect.AnnotatedClass.Creators collectCreators(com.fasterxml.jackson.databind.AnnotationIntrospector r15, com.fasterxml.jackson.databind.introspect.TypeResolutionContext r16, com.fasterxml.jackson.databind.JavaType r17, java.lang.Class<?> r18) {
        /*
        // Method dump skipped, instructions count: 478
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.AnnotatedCreatorCollector.collectCreators(com.fasterxml.jackson.databind.AnnotationIntrospector, com.fasterxml.jackson.databind.introspect.TypeResolutionContext, com.fasterxml.jackson.databind.JavaType, java.lang.Class):com.fasterxml.jackson.databind.introspect.AnnotatedClass$Creators");
    }

    /* access modifiers changed from: protected */
    public AnnotatedConstructor constructDefaultConstructor(ClassUtil.Ctor ctor, ClassUtil.Ctor ctor2) {
        Annotation[][] annotationArr;
        if (this._intr == null) {
            return new AnnotatedConstructor(this._typeContext, ctor._ctor, new AnnotationMap(), CollectorBase.NO_ANNOTATION_MAPS);
        }
        TypeResolutionContext typeResolutionContext = this._typeContext;
        Constructor<?> constructor = ctor._ctor;
        AnnotationMap collectAnnotations = collectAnnotations(ctor, ctor2);
        Annotation[][] parameterAnnotations = ctor._ctor.getParameterAnnotations();
        if (ctor2 == null) {
            annotationArr = null;
        } else {
            annotationArr = ctor2._ctor.getParameterAnnotations();
        }
        return new AnnotatedConstructor(typeResolutionContext, constructor, collectAnnotations, collectAnnotations(parameterAnnotations, annotationArr));
    }

    /* access modifiers changed from: protected */
    public AnnotatedMethod constructFactoryCreator(Method method, Method method2) {
        Annotation[][] annotationArr;
        int length = method.getParameterTypes().length;
        if (this._intr == null) {
            return new AnnotatedMethod(this._typeContext, method, new AnnotationMap(), CollectorBase._emptyAnnotationMaps(length));
        }
        if (length == 0) {
            return new AnnotatedMethod(this._typeContext, method, collectAnnotations(method, method2), CollectorBase.NO_ANNOTATION_MAPS);
        }
        TypeResolutionContext typeResolutionContext = this._typeContext;
        AnnotationMap collectAnnotations = collectAnnotations(method, method2);
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (method2 == null) {
            annotationArr = null;
        } else {
            annotationArr = method2.getParameterAnnotations();
        }
        return new AnnotatedMethod(typeResolutionContext, method, collectAnnotations, collectAnnotations(parameterAnnotations, annotationArr));
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:20:0x0072 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: com.fasterxml.jackson.databind.introspect.AnnotationMap[] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: com.fasterxml.jackson.databind.introspect.AnnotationMap[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.introspect.AnnotatedConstructor constructNonDefaultConstructor(com.fasterxml.jackson.databind.util.ClassUtil.Ctor r9, com.fasterxml.jackson.databind.util.ClassUtil.Ctor r10) {
        /*
            r8 = this;
            int r0 = r9.getParamCount()
            com.fasterxml.jackson.databind.AnnotationIntrospector r1 = r8._intr
            if (r1 != 0) goto L_0x001b
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            com.fasterxml.jackson.databind.introspect.TypeResolutionContext r1 = r8._typeContext
            java.lang.reflect.Constructor<?> r9 = r9._ctor
            com.fasterxml.jackson.databind.introspect.AnnotationMap r2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap
            r2.<init>()
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r0 = com.fasterxml.jackson.databind.introspect.CollectorBase._emptyAnnotationMaps(r0)
            r10.<init>(r1, r9, r2, r0)
            return r10
        L_0x001b:
            if (r0 != 0) goto L_0x002d
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r0 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            com.fasterxml.jackson.databind.introspect.TypeResolutionContext r1 = r8._typeContext
            java.lang.reflect.Constructor<?> r2 = r9._ctor
            com.fasterxml.jackson.databind.introspect.AnnotationMap r9 = r8.collectAnnotations(r9, r10)
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r10 = com.fasterxml.jackson.databind.introspect.CollectorBase.NO_ANNOTATION_MAPS
            r0.<init>(r1, r2, r9, r10)
            return r0
        L_0x002d:
            java.lang.annotation.Annotation[][] r1 = r9.getParameterAnnotations()
            int r2 = r1.length
            r3 = 0
            if (r0 == r2) goto L_0x009d
            java.lang.reflect.Constructor<?> r2 = r9._ctor
            java.lang.Class r2 = r2.getDeclaringClass()
            boolean r4 = r2.isEnum()
            r5 = 0
            r6 = 1
            r7 = 2
            if (r4 == 0) goto L_0x0057
            int r4 = r1.length
            int r4 = r4 + r7
            if (r0 != r4) goto L_0x0057
            int r2 = r1.length
            int r2 = r2 + r7
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2][]
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r5, r2, r7, r4)
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r1 = r8.collectAnnotations(r2, r3)
        L_0x0054:
            r3 = r1
            r1 = r2
            goto L_0x0072
        L_0x0057:
            boolean r2 = r2.isMemberClass()
            if (r2 == 0) goto L_0x0072
            int r2 = r1.length
            int r2 = r2 + r6
            if (r0 != r2) goto L_0x0072
            int r2 = r1.length
            int r2 = r2 + r6
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2][]
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r5, r2, r6, r4)
            java.lang.annotation.Annotation[] r1 = com.fasterxml.jackson.databind.introspect.CollectorBase.NO_ANNOTATIONS
            r2[r5] = r1
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r1 = r8.collectAnnotations(r2, r3)
            goto L_0x0054
        L_0x0072:
            if (r3 == 0) goto L_0x0075
            goto L_0x00a8
        L_0x0075:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.reflect.Constructor<?> r9 = r9._ctor
            java.lang.Class r9 = r9.getDeclaringClass()
            java.lang.String r9 = r9.getName()
            r2[r5] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r2[r6] = r9
            int r9 = r1.length
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r2[r7] = r9
            java.lang.String r9 = "Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations"
            java.lang.String r9 = java.lang.String.format(r9, r2)
            r10.<init>(r9)
            throw r10
        L_0x009d:
            if (r10 != 0) goto L_0x00a0
            goto L_0x00a4
        L_0x00a0:
            java.lang.annotation.Annotation[][] r3 = r10.getParameterAnnotations()
        L_0x00a4:
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r3 = r8.collectAnnotations(r1, r3)
        L_0x00a8:
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r0 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            com.fasterxml.jackson.databind.introspect.TypeResolutionContext r1 = r8._typeContext
            java.lang.reflect.Constructor<?> r2 = r9._ctor
            com.fasterxml.jackson.databind.introspect.AnnotationMap r9 = r8.collectAnnotations(r9, r10)
            r0.<init>(r1, r2, r9, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.AnnotatedCreatorCollector.constructNonDefaultConstructor(com.fasterxml.jackson.databind.util.ClassUtil$Ctor, com.fasterxml.jackson.databind.util.ClassUtil$Ctor):com.fasterxml.jackson.databind.introspect.AnnotatedConstructor");
    }

    private final AnnotationMap collectAnnotations(AnnotatedElement annotatedElement, AnnotatedElement annotatedElement2) {
        AnnotationCollector collectAnnotations = collectAnnotations(annotatedElement.getDeclaredAnnotations());
        if (annotatedElement2 != null) {
            collectAnnotations = collectAnnotations(collectAnnotations, annotatedElement2.getDeclaredAnnotations());
        }
        return collectAnnotations.asAnnotationMap();
    }

    private AnnotationMap collectAnnotations(ClassUtil.Ctor ctor, ClassUtil.Ctor ctor2) {
        AnnotationCollector collectAnnotations = collectAnnotations(ctor._ctor.getDeclaredAnnotations());
        if (ctor2 != null) {
            collectAnnotations = collectAnnotations(collectAnnotations, ctor2._ctor.getDeclaredAnnotations());
        }
        return collectAnnotations.asAnnotationMap();
    }
}
