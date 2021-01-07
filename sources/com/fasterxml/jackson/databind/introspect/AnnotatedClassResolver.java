package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;

public class AnnotatedClassResolver {
    private static final Annotations NO_ANNOTATIONS = AnnotationCollector.NO_ANNOTATIONS;
    public static final /* synthetic */ int a = 0;
    private final TypeBindings _bindings;
    private final Class<?> _class;
    private final MapperConfig<?> _config;
    private final AnnotationIntrospector _intr;
    private final ClassIntrospector.MixInResolver _mixInResolver;
    private final Class<?> _primaryMixin;
    private final JavaType _type;

    AnnotatedClassResolver(MapperConfig<?> mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        this._config = mapperConfig;
        this._type = javaType;
        Class<?> rawClass = javaType.getRawClass();
        this._class = rawClass;
        this._mixInResolver = mixInResolver;
        this._bindings = javaType.getBindings();
        this._intr = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
        this._primaryMixin = ((MapperConfigBase) mapperConfig).findMixInClassFor(rawClass);
    }

    private AnnotationCollector _addAnnotationsIfNotPresent(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (!annotationCollector.isPresent(annotation)) {
                    annotationCollector = annotationCollector.addOrOverride(annotation);
                    if (this._intr.isAnnotationBundle(annotation)) {
                        annotationCollector = _addFromBundleIfNotPresent(annotationCollector, annotation);
                    }
                }
            }
        }
        return annotationCollector;
    }

    private AnnotationCollector _addClassMixIns(AnnotationCollector annotationCollector, Class<?> cls, Class<?> cls2) {
        if (cls2 != null) {
            annotationCollector = _addAnnotationsIfNotPresent(annotationCollector, ClassUtil.findClassAnnotations(cls2));
            for (Class<?> cls3 : ClassUtil.findSuperClasses(cls2, cls, false)) {
                annotationCollector = _addAnnotationsIfNotPresent(annotationCollector, ClassUtil.findClassAnnotations(cls3));
            }
        }
        return annotationCollector;
    }

    private AnnotationCollector _addFromBundleIfNotPresent(AnnotationCollector annotationCollector, Annotation annotation) {
        Annotation[] findClassAnnotations = ClassUtil.findClassAnnotations(annotation.annotationType());
        for (Annotation annotation2 : findClassAnnotations) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !annotationCollector.isPresent(annotation2)) {
                annotationCollector = annotationCollector.addOrOverride(annotation2);
                if (this._intr.isAnnotationBundle(annotation2)) {
                    annotationCollector = _addFromBundleIfNotPresent(annotationCollector, annotation2);
                }
            }
        }
        return annotationCollector;
    }

    public static AnnotatedClass resolve(MapperConfig<?> mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        if (javaType.isArrayType()) {
            if (mapperConfig == null || ((MapperConfigBase) mapperConfig).findMixInClassFor(javaType.getRawClass()) == null) {
                return new AnnotatedClass(javaType.getRawClass());
            }
        }
        AnnotatedClassResolver annotatedClassResolver = new AnnotatedClassResolver(mapperConfig, javaType, mixInResolver);
        List<JavaType> findSuperTypes = ClassUtil.findSuperTypes(javaType, null, false);
        return new AnnotatedClass(annotatedClassResolver._type, annotatedClassResolver._class, findSuperTypes, annotatedClassResolver._primaryMixin, annotatedClassResolver.resolveClassAnnotations(findSuperTypes), annotatedClassResolver._bindings, annotatedClassResolver._intr, annotatedClassResolver._mixInResolver, annotatedClassResolver._config.getTypeFactory());
    }

    private Annotations resolveClassAnnotations(List<JavaType> list) {
        if (this._intr == null) {
            return AnnotationCollector.NO_ANNOTATIONS;
        }
        AnnotationCollector annotationCollector = AnnotationCollector.EmptyCollector.instance;
        Class<?> cls = this._primaryMixin;
        if (cls != null) {
            annotationCollector = _addClassMixIns(annotationCollector, this._class, cls);
        }
        AnnotationCollector _addAnnotationsIfNotPresent = _addAnnotationsIfNotPresent(annotationCollector, ClassUtil.findClassAnnotations(this._class));
        for (JavaType javaType : list) {
            if (this._mixInResolver != null) {
                Class<?> rawClass = javaType.getRawClass();
                _addAnnotationsIfNotPresent = _addClassMixIns(_addAnnotationsIfNotPresent, rawClass, this._mixInResolver.findMixInClassFor(rawClass));
            }
            _addAnnotationsIfNotPresent = _addAnnotationsIfNotPresent(_addAnnotationsIfNotPresent, ClassUtil.findClassAnnotations(javaType.getRawClass()));
        }
        ClassIntrospector.MixInResolver mixInResolver = this._mixInResolver;
        if (mixInResolver != null) {
            _addAnnotationsIfNotPresent = _addClassMixIns(_addAnnotationsIfNotPresent, Object.class, mixInResolver.findMixInClassFor(Object.class));
        }
        return _addAnnotationsIfNotPresent.asAnnotations();
    }

    public static AnnotatedClass resolveWithoutSuperTypes(MapperConfig<?> mapperConfig, Class<?> cls) {
        if (cls.isArray()) {
            if (mapperConfig == null || ((MapperConfigBase) mapperConfig).findMixInClassFor(cls) == null) {
                return new AnnotatedClass(cls);
            }
        }
        AnnotatedClassResolver annotatedClassResolver = new AnnotatedClassResolver(mapperConfig, cls, mapperConfig);
        List<JavaType> emptyList = Collections.emptyList();
        Class<?> cls2 = annotatedClassResolver._class;
        Class<?> cls3 = annotatedClassResolver._primaryMixin;
        Annotations resolveClassAnnotations = annotatedClassResolver.resolveClassAnnotations(emptyList);
        TypeBindings typeBindings = annotatedClassResolver._bindings;
        AnnotationIntrospector annotationIntrospector = annotatedClassResolver._intr;
        MapperConfig<?> mapperConfig2 = annotatedClassResolver._config;
        return new AnnotatedClass(null, cls2, emptyList, cls3, resolveClassAnnotations, typeBindings, annotationIntrospector, mapperConfig2, mapperConfig2.getTypeFactory());
    }

    AnnotatedClassResolver(MapperConfig<?> mapperConfig, Class<?> cls, ClassIntrospector.MixInResolver mixInResolver) {
        this._config = mapperConfig;
        AnnotationIntrospector annotationIntrospector = null;
        this._type = null;
        this._class = cls;
        this._mixInResolver = mixInResolver;
        this._bindings = TypeBindings.emptyBindings();
        if (mapperConfig == null) {
            this._intr = null;
            this._primaryMixin = null;
            return;
        }
        this._intr = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : annotationIntrospector;
        this._primaryMixin = ((MapperConfigBase) mapperConfig).findMixInClassFor(cls);
    }
}
