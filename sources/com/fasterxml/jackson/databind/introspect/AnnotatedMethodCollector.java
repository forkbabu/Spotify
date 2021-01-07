package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AnnotatedMethodCollector extends CollectorBase {
    private final ClassIntrospector.MixInResolver _mixInResolver;

    /* access modifiers changed from: private */
    public static final class MethodBuilder {
        public AnnotationCollector annotations;
        public Method method;
        public TypeResolutionContext typeContext;

        public MethodBuilder(TypeResolutionContext typeResolutionContext, Method method2, AnnotationCollector annotationCollector) {
            this.typeContext = typeResolutionContext;
            this.method = method2;
            this.annotations = annotationCollector;
        }
    }

    AnnotatedMethodCollector(AnnotationIntrospector annotationIntrospector, ClassIntrospector.MixInResolver mixInResolver) {
        super(annotationIntrospector);
        this._mixInResolver = annotationIntrospector == null ? null : mixInResolver;
    }

    private void _addMemberMethods(TypeResolutionContext typeResolutionContext, Class<?> cls, Map<MemberKey, MethodBuilder> map, Class<?> cls2) {
        AnnotationCollector annotationCollector;
        if (cls2 != null) {
            _addMethodMixIns(typeResolutionContext, cls, map, cls2);
        }
        if (cls != null) {
            Method[] classMethods = ClassUtil.getClassMethods(cls);
            for (Method method : classMethods) {
                if (_isIncludableMemberMethod(method)) {
                    MemberKey memberKey = new MemberKey(method);
                    MethodBuilder methodBuilder = map.get(memberKey);
                    if (methodBuilder == null) {
                        if (this._intr == null) {
                            annotationCollector = AnnotationCollector.EmptyCollector.instance;
                        } else {
                            annotationCollector = collectAnnotations(method.getDeclaredAnnotations());
                        }
                        map.put(memberKey, new MethodBuilder(typeResolutionContext, method, annotationCollector));
                    } else {
                        if (this._intr != null) {
                            methodBuilder.annotations = collectDefaultAnnotations(methodBuilder.annotations, method.getDeclaredAnnotations());
                        }
                        Method method2 = methodBuilder.method;
                        if (method2 == null) {
                            methodBuilder.method = method;
                        } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                            methodBuilder.method = method;
                            methodBuilder.typeContext = typeResolutionContext;
                        }
                    }
                }
            }
        }
    }

    private boolean _isIncludableMemberMethod(Method method) {
        if (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterTypes().length > 2) {
            return false;
        }
        return true;
    }

    public static AnnotatedMethodMap collectMethods(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext, ClassIntrospector.MixInResolver mixInResolver, TypeFactory typeFactory, JavaType javaType, List<JavaType> list, Class<?> cls) {
        boolean z;
        Class<?> findMixInClassFor;
        AnnotatedMethodCollector annotatedMethodCollector = new AnnotatedMethodCollector(annotationIntrospector, mixInResolver);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        annotatedMethodCollector._addMemberMethods(typeResolutionContext, javaType.getRawClass(), linkedHashMap, cls);
        Iterator<JavaType> it = list.iterator();
        while (true) {
            Class<?> cls2 = null;
            if (!it.hasNext()) {
                break;
            }
            JavaType next = it.next();
            ClassIntrospector.MixInResolver mixInResolver2 = annotatedMethodCollector._mixInResolver;
            if (mixInResolver2 != null) {
                cls2 = mixInResolver2.findMixInClassFor(next.getRawClass());
            }
            annotatedMethodCollector._addMemberMethods(new TypeResolutionContext.Basic(typeFactory, next.getBindings()), next.getRawClass(), linkedHashMap, cls2);
        }
        ClassIntrospector.MixInResolver mixInResolver3 = annotatedMethodCollector._mixInResolver;
        if (mixInResolver3 == null || (findMixInClassFor = mixInResolver3.findMixInClassFor(Object.class)) == null) {
            z = false;
        } else {
            annotatedMethodCollector._addMethodMixIns(typeResolutionContext, javaType.getRawClass(), linkedHashMap, findMixInClassFor);
            z = true;
        }
        if (z && annotatedMethodCollector._intr != null && !linkedHashMap.isEmpty()) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                MemberKey memberKey = (MemberKey) entry.getKey();
                if ("hashCode".equals(memberKey._name) && memberKey._argTypes.length == 0) {
                    try {
                        Method declaredMethod = Object.class.getDeclaredMethod(memberKey._name, new Class[0]);
                        if (declaredMethod != null) {
                            MethodBuilder methodBuilder = (MethodBuilder) entry.getValue();
                            methodBuilder.annotations = annotatedMethodCollector.collectDefaultAnnotations(methodBuilder.annotations, declaredMethod.getDeclaredAnnotations());
                            methodBuilder.method = declaredMethod;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return new AnnotatedMethodMap();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            MethodBuilder methodBuilder2 = (MethodBuilder) entry2.getValue();
            Method method = methodBuilder2.method;
            AnnotatedMethod annotatedMethod = method == null ? null : new AnnotatedMethod(methodBuilder2.typeContext, method, methodBuilder2.annotations.asAnnotationMap(), null);
            if (annotatedMethod != null) {
                linkedHashMap2.put(entry2.getKey(), annotatedMethod);
            }
        }
        return new AnnotatedMethodMap(linkedHashMap2);
    }

    /* access modifiers changed from: protected */
    public void _addMethodMixIns(TypeResolutionContext typeResolutionContext, Class<?> cls, Map<MemberKey, MethodBuilder> map, Class<?> cls2) {
        if (this._intr != null) {
            for (Class<?> cls3 : ClassUtil.findRawSuperTypes(cls2, cls, true)) {
                Method[] declaredMethods = cls3.getDeclaredMethods();
                for (Method method : declaredMethods) {
                    if (_isIncludableMemberMethod(method)) {
                        MemberKey memberKey = new MemberKey(method);
                        MethodBuilder methodBuilder = map.get(memberKey);
                        Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                        if (methodBuilder == null) {
                            map.put(memberKey, new MethodBuilder(typeResolutionContext, null, collectAnnotations(declaredAnnotations)));
                        } else {
                            methodBuilder.annotations = collectDefaultAnnotations(methodBuilder.annotations, declaredAnnotations);
                        }
                    }
                }
            }
        }
    }
}
