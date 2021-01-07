package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import java.util.List;

@JacksonStdImpl
public final class IndexedListSerializer extends AsArraySerializerBase<List<?>> {
    private static final long serialVersionUID = 1;

    public IndexedListSerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        super(List.class, javaType, z, typeSerializer, jsonSerializer);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new IndexedListSerializer(this, this._property, typeSerializer, this._elementSerializer, this._unwrapSingle);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(Object obj) {
        return ((List) obj).size() == 1;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, Object obj) {
        return ((List) obj).isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        List<?> list = (List) obj;
        if (list.size() != 1 || ((this._unwrapSingle != null || !serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this._unwrapSingle != Boolean.TRUE)) {
            jsonGenerator.writeStartArray();
            serializeContents(list, jsonGenerator, serializerProvider);
            jsonGenerator.writeEndArray();
            return;
        }
        serializeContents(list, jsonGenerator, serializerProvider);
    }

    /* Return type fixed from 'com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase' to match base method */
    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public AsArraySerializerBase<List<?>> withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer jsonSerializer, Boolean bool) {
        return new IndexedListSerializer(this, beanProperty, typeSerializer, jsonSerializer, bool);
    }

    public IndexedListSerializer(IndexedListSerializer indexedListSerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        super(indexedListSerializer, beanProperty, typeSerializer, jsonSerializer, bool);
    }

    public void serializeContents(List<?> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        JsonSerializer<Object> jsonSerializer;
        JsonSerializer<Object> jsonSerializer2;
        JsonSerializer<Object> jsonSerializer3 = this._elementSerializer;
        int i = 0;
        if (jsonSerializer3 != null) {
            int size = list.size();
            if (size != 0) {
                TypeSerializer typeSerializer = this._valueTypeSerializer;
                while (i < size) {
                    Object obj = list.get(i);
                    if (obj == null) {
                        try {
                            serializerProvider.defaultSerializeNull(jsonGenerator);
                        } catch (Exception e) {
                            wrapAndThrow(serializerProvider, e, list, i);
                            throw null;
                        }
                    } else if (typeSerializer == null) {
                        jsonSerializer3.serialize(obj, jsonGenerator, serializerProvider);
                    } else {
                        jsonSerializer3.serializeWithType(obj, jsonGenerator, serializerProvider, typeSerializer);
                    }
                    i++;
                }
            }
        } else if (this._valueTypeSerializer != null) {
            int size2 = list.size();
            if (size2 != 0) {
                try {
                    TypeSerializer typeSerializer2 = this._valueTypeSerializer;
                    PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
                    while (i < size2) {
                        Object obj2 = list.get(i);
                        if (obj2 == null) {
                            serializerProvider.defaultSerializeNull(jsonGenerator);
                        } else {
                            Class<?> cls = obj2.getClass();
                            JsonSerializer<Object> serializerFor = propertySerializerMap.serializerFor(cls);
                            if (serializerFor == null) {
                                if (this._elementType.hasGenericTypes()) {
                                    jsonSerializer2 = _findAndAddDynamic(propertySerializerMap, serializerProvider.constructSpecializedType(this._elementType, cls), serializerProvider);
                                } else {
                                    jsonSerializer2 = _findAndAddDynamic(propertySerializerMap, cls, serializerProvider);
                                }
                                serializerFor = jsonSerializer2;
                                propertySerializerMap = this._dynamicSerializers;
                            }
                            serializerFor.serializeWithType(obj2, jsonGenerator, serializerProvider, typeSerializer2);
                        }
                        i++;
                    }
                } catch (Exception e2) {
                    wrapAndThrow(serializerProvider, e2, list, 0);
                    throw null;
                }
            }
        } else {
            int size3 = list.size();
            if (size3 != 0) {
                try {
                    PropertySerializerMap propertySerializerMap2 = this._dynamicSerializers;
                    while (i < size3) {
                        Object obj3 = list.get(i);
                        if (obj3 == null) {
                            serializerProvider.defaultSerializeNull(jsonGenerator);
                        } else {
                            Class<?> cls2 = obj3.getClass();
                            JsonSerializer<Object> serializerFor2 = propertySerializerMap2.serializerFor(cls2);
                            if (serializerFor2 == null) {
                                if (this._elementType.hasGenericTypes()) {
                                    jsonSerializer = _findAndAddDynamic(propertySerializerMap2, serializerProvider.constructSpecializedType(this._elementType, cls2), serializerProvider);
                                } else {
                                    jsonSerializer = _findAndAddDynamic(propertySerializerMap2, cls2, serializerProvider);
                                }
                                serializerFor2 = jsonSerializer;
                                propertySerializerMap2 = this._dynamicSerializers;
                            }
                            serializerFor2.serialize(obj3, jsonGenerator, serializerProvider);
                        }
                        i++;
                    }
                } catch (Exception e3) {
                    wrapAndThrow(serializerProvider, e3, list, 0);
                    throw null;
                }
            }
        }
    }
}
