package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.Annotated;

public class PropertyBuilder {
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final BeanDescription _beanDesc;
    protected final SerializationConfig _config;
    protected Object _defaultBean;
    protected final JsonInclude.Value _defaultInclusion;
    protected final boolean _useRealPropertyDefaults;

    public PropertyBuilder(SerializationConfig serializationConfig, BeanDescription beanDescription) {
        JsonInclude.Value value;
        this._config = serializationConfig;
        this._beanDesc = beanDescription;
        JsonInclude.Value findPropertyInclusion = beanDescription.findPropertyInclusion(JsonInclude.Value.empty());
        Class<?> beanClass = beanDescription.getBeanClass();
        JsonInclude.Value empty = JsonInclude.Value.empty();
        serializationConfig.getDefaultPropertyInclusion(beanClass, empty);
        empty = findPropertyInclusion != null ? findPropertyInclusion.withOverrides(empty) : empty;
        JsonInclude.Value defaultPropertyInclusion = serializationConfig.getDefaultPropertyInclusion();
        if (defaultPropertyInclusion == null) {
            value = empty;
        } else {
            value = defaultPropertyInclusion.withOverrides(empty);
        }
        this._defaultInclusion = value;
        this._useRealPropertyDefaults = empty.getValueInclusion() == JsonInclude.Include.NON_DEFAULT;
        this._annotationIntrospector = serializationConfig.getAnnotationIntrospector();
    }

    /* access modifiers changed from: protected */
    public JavaType findSerializationType(Annotated annotated, boolean z, JavaType javaType) {
        JavaType refineSerializationType = this._annotationIntrospector.refineSerializationType(this._config, annotated, javaType);
        boolean z2 = true;
        if (refineSerializationType != javaType) {
            Class<?> rawClass = refineSerializationType.getRawClass();
            Class<?> rawClass2 = javaType.getRawClass();
            if (!rawClass.isAssignableFrom(rawClass2) && !rawClass2.isAssignableFrom(rawClass)) {
                StringBuilder V0 = je.V0("Illegal concrete-type annotation for method '");
                V0.append(annotated.getName());
                V0.append("': class ");
                V0.append(rawClass.getName());
                V0.append(" not a super-type of (declared) class ");
                V0.append(rawClass2.getName());
                throw new IllegalArgumentException(V0.toString());
            }
            z = true;
            javaType = refineSerializationType;
        }
        JsonSerialize.Typing findSerializationTyping = this._annotationIntrospector.findSerializationTyping(annotated);
        if (!(findSerializationTyping == null || findSerializationTyping == JsonSerialize.Typing.DEFAULT_TYPING)) {
            if (findSerializationTyping != JsonSerialize.Typing.STATIC) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            return javaType.withStaticTyping();
        }
        return null;
    }
}
