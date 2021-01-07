package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.BeanUtil;
import java.util.Map;

@JacksonStdImpl
public class MapEntrySerializer extends ContainerSerializer<Map.Entry<?, ?>> implements ContextualSerializer {
    protected PropertySerializerMap _dynamicValueSerializers;
    protected final JavaType _entryType;
    protected JsonSerializer<Object> _keySerializer;
    protected final JavaType _keyType;
    protected final BeanProperty _property;
    protected final boolean _suppressNulls;
    protected final Object _suppressableValue;
    protected JsonSerializer<Object> _valueSerializer;
    protected final JavaType _valueType;
    protected final boolean _valueTypeIsStatic;
    protected final TypeSerializer _valueTypeSerializer;

    public MapEntrySerializer(JavaType javaType, JavaType javaType2, JavaType javaType3, boolean z, TypeSerializer typeSerializer, BeanProperty beanProperty) {
        super(javaType);
        this._entryType = javaType;
        this._keyType = javaType2;
        this._valueType = javaType3;
        this._valueTypeIsStatic = z;
        this._valueTypeSerializer = typeSerializer;
        this._property = beanProperty;
        this._dynamicValueSerializers = PropertySerializerMap.Empty.FOR_PROPERTIES;
        this._suppressableValue = null;
        this._suppressNulls = false;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new MapEntrySerializer(this, this._keySerializer, this._valueSerializer, this._suppressableValue, this._suppressNulls);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        AnnotatedMember annotatedMember;
        JsonSerializer<?> jsonSerializer;
        JsonSerializer<Object> jsonSerializer2;
        JsonSerializer<?> jsonSerializer3;
        boolean z;
        Object obj;
        JsonInclude.Value findPropertyInclusion;
        JsonInclude.Include contentInclusion;
        Object obj2 = JsonInclude.Include.NON_EMPTY;
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        if (beanProperty == null) {
            annotatedMember = null;
        } else {
            annotatedMember = beanProperty.getMember();
        }
        if (annotatedMember == null || annotationIntrospector == null) {
            jsonSerializer2 = null;
            jsonSerializer = null;
        } else {
            Object findKeySerializer = annotationIntrospector.findKeySerializer(annotatedMember);
            jsonSerializer = findKeySerializer != null ? serializerProvider.serializerInstance(annotatedMember, findKeySerializer) : null;
            Object findContentSerializer = annotationIntrospector.findContentSerializer(annotatedMember);
            jsonSerializer2 = findContentSerializer != null ? serializerProvider.serializerInstance(annotatedMember, findContentSerializer) : null;
        }
        if (jsonSerializer2 == null) {
            jsonSerializer2 = this._valueSerializer;
        }
        JsonSerializer<?> findContextualConvertingSerializer = findContextualConvertingSerializer(serializerProvider, beanProperty, jsonSerializer2);
        if (findContextualConvertingSerializer == null && this._valueTypeIsStatic && !this._valueType.isJavaLangObject()) {
            findContextualConvertingSerializer = serializerProvider.findValueSerializer(this._valueType, beanProperty);
        }
        if (jsonSerializer == null) {
            jsonSerializer = this._keySerializer;
        }
        if (jsonSerializer == null) {
            jsonSerializer3 = serializerProvider.findKeySerializer(this._keyType, beanProperty);
        } else {
            jsonSerializer3 = serializerProvider.handleSecondaryContextualization(jsonSerializer, beanProperty);
        }
        Object obj3 = this._suppressableValue;
        boolean z2 = this._suppressNulls;
        if (beanProperty == null || (findPropertyInclusion = beanProperty.findPropertyInclusion(serializerProvider.mo12getConfig(), null)) == null || (contentInclusion = findPropertyInclusion.getContentInclusion()) == JsonInclude.Include.USE_DEFAULTS) {
            obj = obj3;
            z = z2;
        } else {
            int ordinal = contentInclusion.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            obj2 = BeanUtil.getDefaultValue(this._valueType);
                            if (obj2 != null && obj2.getClass().isArray()) {
                                obj2 = ArrayBuilders.getArrayComparator(obj2);
                            }
                        } else if (ordinal != 5) {
                            obj = null;
                            z = false;
                        } else {
                            obj2 = serializerProvider.includeFilterInstance(null, findPropertyInclusion.getContentFilter());
                            if (obj2 != null) {
                                z = serializerProvider.includeFilterSuppressNulls(obj2);
                                obj = obj2;
                            }
                        }
                    }
                } else if (!this._valueType.isReferenceType()) {
                    obj2 = null;
                }
                obj = obj2;
            } else {
                obj = null;
            }
            z = true;
        }
        return new MapEntrySerializer(this, jsonSerializer3, findContextualConvertingSerializer, obj, z);
    }

    public JavaType getContentType() {
        return this._valueType;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, Object obj) {
        Object value = ((Map.Entry) obj).getValue();
        if (value == null) {
            return this._suppressNulls;
        }
        if (this._suppressableValue != null) {
            JsonSerializer<Object> jsonSerializer = this._valueSerializer;
            if (jsonSerializer == null) {
                Class<?> cls = value.getClass();
                JsonSerializer<Object> serializerFor = this._dynamicValueSerializers.serializerFor(cls);
                if (serializerFor == null) {
                    try {
                        PropertySerializerMap propertySerializerMap = this._dynamicValueSerializers;
                        BeanProperty beanProperty = this._property;
                        propertySerializerMap.getClass();
                        JsonSerializer<Object> findValueSerializer = serializerProvider.findValueSerializer(cls, beanProperty);
                        PropertySerializerMap newWith = propertySerializerMap.newWith(cls, findValueSerializer);
                        if (propertySerializerMap != newWith) {
                            this._dynamicValueSerializers = newWith;
                        }
                        jsonSerializer = findValueSerializer;
                    } catch (JsonMappingException unused) {
                    }
                } else {
                    jsonSerializer = serializerFor;
                }
            }
            Object obj2 = this._suppressableValue;
            if (obj2 == JsonInclude.Include.NON_EMPTY) {
                return jsonSerializer.isEmpty(serializerProvider, value);
            }
            return obj2.equals(value);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Map.Entry<?, ?> entry = (Map.Entry) obj;
        jsonGenerator.writeStartObject(entry);
        serializeDynamic(entry, jsonGenerator, serializerProvider);
        jsonGenerator.writeEndObject();
    }

    /* access modifiers changed from: protected */
    public void serializeDynamic(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        JsonSerializer<Object> jsonSerializer;
        JsonSerializer<Object> jsonSerializer2;
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        Object key = entry.getKey();
        if (key == null) {
            jsonSerializer = serializerProvider.findNullKeySerializer();
        } else {
            jsonSerializer = this._keySerializer;
        }
        Object value = entry.getValue();
        if (value != null) {
            jsonSerializer2 = this._valueSerializer;
            if (jsonSerializer2 == null) {
                Class<?> cls = value.getClass();
                JsonSerializer<Object> serializerFor = this._dynamicValueSerializers.serializerFor(cls);
                if (serializerFor != null) {
                    jsonSerializer2 = serializerFor;
                } else if (this._valueType.hasGenericTypes()) {
                    PropertySerializerMap propertySerializerMap = this._dynamicValueSerializers;
                    PropertySerializerMap.SerializerAndMapResult findAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(serializerProvider.constructSpecializedType(this._valueType, cls), serializerProvider, this._property);
                    PropertySerializerMap propertySerializerMap2 = findAndAddSecondarySerializer.map;
                    if (propertySerializerMap != propertySerializerMap2) {
                        this._dynamicValueSerializers = propertySerializerMap2;
                    }
                    jsonSerializer2 = findAndAddSecondarySerializer.serializer;
                } else {
                    PropertySerializerMap propertySerializerMap3 = this._dynamicValueSerializers;
                    BeanProperty beanProperty = this._property;
                    propertySerializerMap3.getClass();
                    JsonSerializer<Object> findValueSerializer = serializerProvider.findValueSerializer(cls, beanProperty);
                    PropertySerializerMap newWith = propertySerializerMap3.newWith(cls, findValueSerializer);
                    if (propertySerializerMap3 != newWith) {
                        this._dynamicValueSerializers = newWith;
                    }
                    jsonSerializer2 = findValueSerializer;
                }
            }
            Object obj = this._suppressableValue;
            if (obj != null && ((obj == JsonInclude.Include.NON_EMPTY && jsonSerializer2.isEmpty(serializerProvider, value)) || this._suppressableValue.equals(value))) {
                return;
            }
        } else if (!this._suppressNulls) {
            jsonSerializer2 = serializerProvider.getDefaultNullValueSerializer();
        } else {
            return;
        }
        jsonSerializer.serialize(key, jsonGenerator, serializerProvider);
        if (typeSerializer == null) {
            try {
                jsonSerializer2.serialize(value, jsonGenerator, serializerProvider);
            } catch (Exception e) {
                wrapAndThrow(serializerProvider, e, entry, "" + key);
                throw null;
            }
        } else {
            jsonSerializer2.serializeWithType(value, jsonGenerator, serializerProvider, typeSerializer);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        Map.Entry<?, ?> entry = (Map.Entry) obj;
        jsonGenerator.setCurrentValue(entry);
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(entry, JsonToken.START_OBJECT));
        serializeDynamic(entry, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    public MapEntrySerializer withContentInclusion(Object obj, boolean z) {
        if (this._suppressableValue == obj && this._suppressNulls == z) {
            return this;
        }
        return new MapEntrySerializer(this, this._keySerializer, this._valueSerializer, obj, z);
    }

    /* JADX WARN: Incorrect args count in method signature: (Lcom/fasterxml/jackson/databind/ser/impl/MapEntrySerializer;Lcom/fasterxml/jackson/databind/BeanProperty;Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;Lcom/fasterxml/jackson/databind/JsonSerializer<*>;Lcom/fasterxml/jackson/databind/JsonSerializer<*>;Ljava/lang/Object;Z)V */
    protected MapEntrySerializer(MapEntrySerializer mapEntrySerializer, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, Object obj, boolean z) {
        super(Map.class, false);
        this._entryType = mapEntrySerializer._entryType;
        this._keyType = mapEntrySerializer._keyType;
        this._valueType = mapEntrySerializer._valueType;
        this._valueTypeIsStatic = mapEntrySerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapEntrySerializer._valueTypeSerializer;
        this._keySerializer = jsonSerializer;
        this._valueSerializer = jsonSerializer2;
        this._dynamicValueSerializers = PropertySerializerMap.Empty.FOR_PROPERTIES;
        this._property = mapEntrySerializer._property;
        this._suppressableValue = obj;
        this._suppressNulls = z;
    }
}
