package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;

@JacksonStdImpl
public class ObjectArraySerializer extends ArraySerializerBase<Object[]> implements ContextualSerializer {
    protected PropertySerializerMap _dynamicSerializers = PropertySerializerMap.emptyForProperties();
    protected JsonSerializer<Object> _elementSerializer;
    protected final JavaType _elementType;
    protected final boolean _staticTyping;
    protected final TypeSerializer _valueTypeSerializer;

    public ObjectArraySerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        super(Object[].class);
        this._elementType = javaType;
        this._staticTyping = z;
        this._valueTypeSerializer = typeSerializer;
        this._elementSerializer = jsonSerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
    public JsonSerializer<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
        return new ObjectArraySerializer(this, beanProperty, this._valueTypeSerializer, this._elementSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new ObjectArraySerializer(this._elementType, this._staticTyping, typeSerializer, this._elementSerializer);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        jsonFormatVisitorWrapper.getClass();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.ContextualSerializer
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonSerializer<?> createContextual(com.fasterxml.jackson.databind.SerializerProvider r8, com.fasterxml.jackson.databind.BeanProperty r9) {
        /*
            r7 = this;
            com.fasterxml.jackson.databind.jsontype.TypeSerializer r0 = r7._valueTypeSerializer
            if (r0 == 0) goto L_0x0008
            com.fasterxml.jackson.databind.jsontype.TypeSerializer r0 = r0.forProperty(r9)
        L_0x0008:
            r4 = r0
            r0 = 0
            if (r9 == 0) goto L_0x0021
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r1 = r9.getMember()
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r8.getAnnotationIntrospector()
            if (r1 == 0) goto L_0x0021
            java.lang.Object r2 = r2.findContentSerializer(r1)
            if (r2 == 0) goto L_0x0021
            com.fasterxml.jackson.databind.JsonSerializer r1 = r8.serializerInstance(r1, r2)
            goto L_0x0022
        L_0x0021:
            r1 = r0
        L_0x0022:
            java.lang.Class r2 = r7.handledType()
            com.fasterxml.jackson.annotation.JsonFormat$Value r2 = r7.findFormatOverrides(r8, r9, r2)
            if (r2 == 0) goto L_0x0032
            com.fasterxml.jackson.annotation.JsonFormat$Feature r0 = com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r0 = r2.getFeature(r0)
        L_0x0032:
            r6 = r0
            if (r1 != 0) goto L_0x0037
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r1 = r7._elementSerializer
        L_0x0037:
            com.fasterxml.jackson.databind.JsonSerializer r0 = r7.findContextualConvertingSerializer(r8, r9, r1)
            if (r0 != 0) goto L_0x0053
            com.fasterxml.jackson.databind.JavaType r1 = r7._elementType
            if (r1 == 0) goto L_0x0053
            boolean r2 = r7._staticTyping
            if (r2 == 0) goto L_0x0053
            boolean r1 = r1.isJavaLangObject()
            if (r1 != 0) goto L_0x0053
            com.fasterxml.jackson.databind.JavaType r0 = r7._elementType
            com.fasterxml.jackson.databind.JsonSerializer r8 = r8.findValueSerializer(r0, r9)
            r5 = r8
            goto L_0x0054
        L_0x0053:
            r5 = r0
        L_0x0054:
            com.fasterxml.jackson.databind.BeanProperty r8 = r7._property
            if (r8 != r9) goto L_0x0066
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r8 = r7._elementSerializer
            if (r5 != r8) goto L_0x0066
            com.fasterxml.jackson.databind.jsontype.TypeSerializer r8 = r7._valueTypeSerializer
            if (r8 != r4) goto L_0x0066
            java.lang.Boolean r8 = r7._unwrapSingle
            if (r8 != r6) goto L_0x0066
            r8 = r7
            goto L_0x006e
        L_0x0066:
            com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer r8 = new com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer
            r1 = r8
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x006e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer.createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.JsonSerializer");
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(Object obj) {
        return ((Object[]) obj).length == 1;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ boolean isEmpty(SerializerProvider serializerProvider, Object obj) {
        return isEmpty((Object[]) obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Object[] objArr = (Object[]) obj;
        if (objArr.length != 1 || ((this._unwrapSingle != null || !serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this._unwrapSingle != Boolean.TRUE)) {
            jsonGenerator.writeStartArray();
            serializeContents(objArr, jsonGenerator, serializerProvider);
            jsonGenerator.writeEndArray();
            return;
        }
        serializeContents(objArr, jsonGenerator, serializerProvider);
    }

    public boolean isEmpty(Object[] objArr) {
        return objArr.length == 0;
    }

    public void serializeContents(Object[] objArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Exception e;
        Object obj;
        Exception e2;
        Object obj2;
        PropertySerializerMap newWith;
        int length = objArr.length;
        if (length != 0) {
            JsonSerializer<Object> jsonSerializer = this._elementSerializer;
            int i = 0;
            if (jsonSerializer != null) {
                int length2 = objArr.length;
                TypeSerializer typeSerializer = this._valueTypeSerializer;
                Object obj3 = null;
                while (i < length2) {
                    try {
                        obj3 = objArr[i];
                        if (obj3 == null) {
                            serializerProvider.defaultSerializeNull(jsonGenerator);
                        } else if (typeSerializer == null) {
                            jsonSerializer.serialize(obj3, jsonGenerator, serializerProvider);
                        } else {
                            jsonSerializer.serializeWithType(obj3, jsonGenerator, serializerProvider, typeSerializer);
                        }
                        i++;
                    } catch (Exception e3) {
                        wrapAndThrow(serializerProvider, e3, obj3, i);
                        throw null;
                    }
                }
                return;
            }
            TypeSerializer typeSerializer2 = this._valueTypeSerializer;
            if (typeSerializer2 != null) {
                int length3 = objArr.length;
                try {
                    PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
                    obj2 = null;
                    while (i < length3) {
                        try {
                            obj2 = objArr[i];
                            if (obj2 == null) {
                                serializerProvider.defaultSerializeNull(jsonGenerator);
                            } else {
                                Class<?> cls = obj2.getClass();
                                JsonSerializer<Object> serializerFor = propertySerializerMap.serializerFor(cls);
                                if (serializerFor == null && propertySerializerMap != (newWith = propertySerializerMap.newWith(cls, (serializerFor = serializerProvider.findValueSerializer(cls, this._property))))) {
                                    this._dynamicSerializers = newWith;
                                }
                                serializerFor.serializeWithType(obj2, jsonGenerator, serializerProvider, typeSerializer2);
                            }
                            i++;
                        } catch (Exception e4) {
                            e2 = e4;
                            wrapAndThrow(serializerProvider, e2, obj2, i);
                            throw null;
                        }
                    }
                } catch (Exception e5) {
                    e2 = e5;
                    obj2 = null;
                    wrapAndThrow(serializerProvider, e2, obj2, i);
                    throw null;
                }
            } else {
                try {
                    PropertySerializerMap propertySerializerMap2 = this._dynamicSerializers;
                    obj = null;
                    while (i < length) {
                        try {
                            obj = objArr[i];
                            if (obj == null) {
                                serializerProvider.defaultSerializeNull(jsonGenerator);
                            } else {
                                Class<?> cls2 = obj.getClass();
                                JsonSerializer<Object> serializerFor2 = propertySerializerMap2.serializerFor(cls2);
                                if (serializerFor2 == null) {
                                    if (this._elementType.hasGenericTypes()) {
                                        PropertySerializerMap.SerializerAndMapResult findAndAddSecondarySerializer = propertySerializerMap2.findAndAddSecondarySerializer(serializerProvider.constructSpecializedType(this._elementType, cls2), serializerProvider, this._property);
                                        PropertySerializerMap propertySerializerMap3 = findAndAddSecondarySerializer.map;
                                        if (propertySerializerMap2 != propertySerializerMap3) {
                                            this._dynamicSerializers = propertySerializerMap3;
                                        }
                                        serializerFor2 = findAndAddSecondarySerializer.serializer;
                                    } else {
                                        serializerFor2 = serializerProvider.findValueSerializer(cls2, this._property);
                                        PropertySerializerMap newWith2 = propertySerializerMap2.newWith(cls2, serializerFor2);
                                        if (propertySerializerMap2 != newWith2) {
                                            this._dynamicSerializers = newWith2;
                                        }
                                    }
                                }
                                serializerFor2.serialize(obj, jsonGenerator, serializerProvider);
                            }
                            i++;
                        } catch (Exception e6) {
                            e = e6;
                            wrapAndThrow(serializerProvider, e, obj, i);
                            throw null;
                        }
                    }
                } catch (Exception e7) {
                    e = e7;
                    obj = null;
                    wrapAndThrow(serializerProvider, e, obj, i);
                    throw null;
                }
            }
        }
    }

    public ObjectArraySerializer(ObjectArraySerializer objectArraySerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        super(objectArraySerializer, beanProperty, bool);
        this._elementType = objectArraySerializer._elementType;
        this._valueTypeSerializer = typeSerializer;
        this._staticTyping = objectArraySerializer._staticTyping;
        this._elementSerializer = jsonSerializer;
    }
}
