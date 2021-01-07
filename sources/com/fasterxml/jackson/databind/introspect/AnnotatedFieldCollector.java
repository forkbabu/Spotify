package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AnnotatedFieldCollector extends CollectorBase {
    private final ClassIntrospector.MixInResolver _mixInResolver;
    private final TypeFactory _typeFactory;

    /* access modifiers changed from: private */
    public static final class FieldBuilder {
        public AnnotationCollector annotations = AnnotationCollector.EmptyCollector.instance;
        public final Field field;
        public final TypeResolutionContext typeContext;

        public FieldBuilder(TypeResolutionContext typeResolutionContext, Field field2) {
            this.typeContext = typeResolutionContext;
            this.field = field2;
        }
    }

    AnnotatedFieldCollector(AnnotationIntrospector annotationIntrospector, TypeFactory typeFactory, ClassIntrospector.MixInResolver mixInResolver) {
        super(annotationIntrospector);
        this._typeFactory = typeFactory;
        this._mixInResolver = annotationIntrospector == null ? null : mixInResolver;
    }

    private Map<String, FieldBuilder> _findFields(TypeResolutionContext typeResolutionContext, JavaType javaType, Map<String, FieldBuilder> map) {
        Class<?> findMixInClassFor;
        FieldBuilder fieldBuilder;
        JavaType superClass = javaType.getSuperClass();
        if (superClass == null) {
            return map;
        }
        Class<?> rawClass = javaType.getRawClass();
        Map<String, FieldBuilder> _findFields = _findFields(new TypeResolutionContext.Basic(this._typeFactory, superClass.getBindings()), superClass, map);
        int i = ClassUtil.a;
        Field[] declaredFields = rawClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (_isIncludableField(field)) {
                if (_findFields == null) {
                    _findFields = new LinkedHashMap<>();
                }
                FieldBuilder fieldBuilder2 = new FieldBuilder(typeResolutionContext, field);
                if (this._intr != null) {
                    fieldBuilder2.annotations = collectAnnotations(fieldBuilder2.annotations, field.getDeclaredAnnotations());
                }
                _findFields.put(field.getName(), fieldBuilder2);
            }
        }
        ClassIntrospector.MixInResolver mixInResolver = this._mixInResolver;
        if (!(mixInResolver == null || (findMixInClassFor = mixInResolver.findMixInClassFor(rawClass)) == null)) {
            for (Class<?> cls : ClassUtil.findSuperClasses(findMixInClassFor, rawClass, true)) {
                Field[] declaredFields2 = cls.getDeclaredFields();
                for (Field field2 : declaredFields2) {
                    if (_isIncludableField(field2) && (fieldBuilder = _findFields.get(field2.getName())) != null) {
                        fieldBuilder.annotations = collectAnnotations(fieldBuilder.annotations, field2.getDeclaredAnnotations());
                    }
                }
            }
        }
        return _findFields;
    }

    private boolean _isIncludableField(Field field) {
        if (!field.isSynthetic() && !Modifier.isStatic(field.getModifiers())) {
            return true;
        }
        return false;
    }

    public static List<AnnotatedField> collectFields(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext, ClassIntrospector.MixInResolver mixInResolver, TypeFactory typeFactory, JavaType javaType) {
        Map<String, FieldBuilder> _findFields = new AnnotatedFieldCollector(annotationIntrospector, typeFactory, mixInResolver)._findFields(typeResolutionContext, javaType, null);
        if (_findFields == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(_findFields.size());
        for (FieldBuilder fieldBuilder : _findFields.values()) {
            arrayList.add(new AnnotatedField(fieldBuilder.typeContext, fieldBuilder.field, fieldBuilder.annotations.asAnnotationMap()));
        }
        return arrayList;
    }
}
