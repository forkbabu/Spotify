package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import java.io.Serializable;

public abstract class VirtualBeanPropertyWriter extends BeanPropertyWriter implements Serializable {
    private static final long serialVersionUID = 1;

    protected VirtualBeanPropertyWriter() {
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Object value = value(obj, jsonGenerator, serializerProvider);
        if (value == null) {
            JsonSerializer<Object> jsonSerializer = this._nullSerializer;
            if (jsonSerializer != null) {
                jsonSerializer.serialize(null, jsonGenerator, serializerProvider);
            } else {
                jsonGenerator.writeNull();
            }
        } else {
            JsonSerializer<Object> jsonSerializer2 = this._serializer;
            if (jsonSerializer2 == null) {
                Class<?> cls = value.getClass();
                PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
                JsonSerializer<Object> serializerFor = propertySerializerMap.serializerFor(cls);
                jsonSerializer2 = serializerFor == null ? _findAndAddDynamic(propertySerializerMap, cls, serializerProvider) : serializerFor;
            }
            Object obj2 = this._suppressableValue;
            if (obj2 != null) {
                if (JsonInclude.Include.NON_EMPTY == obj2) {
                    if (jsonSerializer2.isEmpty(serializerProvider, value)) {
                        serializeAsPlaceholder(jsonGenerator, serializerProvider);
                        return;
                    }
                } else if (obj2.equals(value)) {
                    serializeAsPlaceholder(jsonGenerator, serializerProvider);
                    return;
                }
            }
            if (value != obj || !_handleSelfReference(serializerProvider, jsonSerializer2)) {
                TypeSerializer typeSerializer = this._typeSerializer;
                if (typeSerializer == null) {
                    jsonSerializer2.serialize(value, jsonGenerator, serializerProvider);
                } else {
                    jsonSerializer2.serializeWithType(value, jsonGenerator, serializerProvider, typeSerializer);
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Object value = value(obj, jsonGenerator, serializerProvider);
        if (value != null) {
            JsonSerializer<Object> jsonSerializer = this._serializer;
            if (jsonSerializer == null) {
                Class<?> cls = value.getClass();
                PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
                JsonSerializer<Object> serializerFor = propertySerializerMap.serializerFor(cls);
                jsonSerializer = serializerFor == null ? _findAndAddDynamic(propertySerializerMap, cls, serializerProvider) : serializerFor;
            }
            Object obj2 = this._suppressableValue;
            if (obj2 != null) {
                if (JsonInclude.Include.NON_EMPTY == obj2) {
                    if (jsonSerializer.isEmpty(serializerProvider, value)) {
                        return;
                    }
                } else if (obj2.equals(value)) {
                    return;
                }
            }
            if (value != obj || !_handleSelfReference(serializerProvider, jsonSerializer)) {
                jsonGenerator.writeFieldName(this._name);
                TypeSerializer typeSerializer = this._typeSerializer;
                if (typeSerializer == null) {
                    jsonSerializer.serialize(value, jsonGenerator, serializerProvider);
                } else {
                    jsonSerializer.serializeWithType(value, jsonGenerator, serializerProvider, typeSerializer);
                }
            }
        } else if (this._nullSerializer != null) {
            jsonGenerator.writeFieldName(this._name);
            this._nullSerializer.serialize(null, jsonGenerator, serializerProvider);
        }
    }

    /* access modifiers changed from: protected */
    public abstract Object value(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider);

    public abstract VirtualBeanPropertyWriter withConfig(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, BeanPropertyDefinition beanPropertyDefinition, JavaType javaType);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected VirtualBeanPropertyWriter(com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition r14, com.fasterxml.jackson.databind.util.Annotations r15, com.fasterxml.jackson.databind.JavaType r16, com.fasterxml.jackson.databind.JsonSerializer<?> r17, com.fasterxml.jackson.databind.jsontype.TypeSerializer r18, com.fasterxml.jackson.databind.JavaType r19, com.fasterxml.jackson.annotation.JsonInclude.Value r20, java.lang.Class<?>[] r21) {
        /*
            r13 = this;
            com.fasterxml.jackson.annotation.JsonInclude$Include r0 = com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS
            com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r4 = r14.getPrimaryMember()
            r2 = 0
            if (r20 != 0) goto L_0x000d
            r10 = 0
            goto L_0x0017
        L_0x000d:
            com.fasterxml.jackson.annotation.JsonInclude$Include r3 = r20.getValueInclusion()
            if (r3 == r1) goto L_0x0016
            if (r3 == r0) goto L_0x0016
            r2 = 1
        L_0x0016:
            r10 = r2
        L_0x0017:
            if (r20 != 0) goto L_0x001d
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x001b:
            r11 = r0
            goto L_0x002f
        L_0x001d:
            com.fasterxml.jackson.annotation.JsonInclude$Include r2 = r20.getValueInclusion()
            if (r2 == r1) goto L_0x002d
            com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
            if (r2 == r1) goto L_0x002d
            if (r2 != r0) goto L_0x002a
            goto L_0x002d
        L_0x002a:
            com.fasterxml.jackson.annotation.JsonInclude$Include r0 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY
            goto L_0x001b
        L_0x002d:
            r0 = 0
            goto L_0x001b
        L_0x002f:
            r7 = 0
            r8 = 0
            r9 = 0
            r12 = 0
            r2 = r13
            r3 = r14
            r5 = r15
            r6 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter.<init>(com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, com.fasterxml.jackson.databind.util.Annotations, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.annotation.JsonInclude$Value, java.lang.Class[]):void");
    }
}
