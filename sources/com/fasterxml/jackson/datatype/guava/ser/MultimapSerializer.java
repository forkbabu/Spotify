package com.fasterxml.jackson.datatype.guava.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MultimapSerializer extends ContainerSerializer<Multimap<?, ?>> implements ContextualSerializer {
    private static final long serialVersionUID = 1;
    protected PropertySerializerMap _dynamicValueSerializers;
    protected final Object _filterId;
    protected final Set<String> _ignoredEntries;
    private final JsonSerializer<Object> _keySerializer;
    private final BeanProperty _property;
    protected final boolean _sortKeys;
    private final MapLikeType _type;
    private final JsonSerializer<Object> _valueSerializer;
    private final TypeSerializer _valueTypeSerializer;

    /* JADX WARN: Incorrect args count in method signature: (Lcom/fasterxml/jackson/databind/type/MapLikeType;Lcom/fasterxml/jackson/databind/BeanDescription;Lcom/fasterxml/jackson/databind/JsonSerializer<Ljava/lang/Object;>;Lcom/fasterxml/jackson/databind/jsontype/TypeSerializer;Lcom/fasterxml/jackson/databind/JsonSerializer<Ljava/lang/Object;>;Ljava/util/Set<Ljava/lang/String;>;Ljava/lang/Object;)V */
    public MultimapSerializer(MapLikeType mapLikeType, JsonSerializer jsonSerializer, TypeSerializer typeSerializer, JsonSerializer jsonSerializer2, Set set, Object obj) {
        super(mapLikeType.getRawClass(), false);
        this._type = mapLikeType;
        this._property = null;
        this._keySerializer = jsonSerializer;
        this._valueTypeSerializer = typeSerializer;
        this._valueSerializer = jsonSerializer2;
        this._ignoredEntries = set;
        this._filterId = obj;
        this._sortKeys = false;
        this._dynamicValueSerializers = PropertySerializerMap.emptyForProperties();
    }

    private final void serializeFields(Multimap<?, ?> multimap, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Set<String> set = this._ignoredEntries;
        PropertySerializerMap propertySerializerMap = this._dynamicValueSerializers;
        for (Map.Entry<?, Collection<?>> entry : multimap.asMap().entrySet()) {
            Object key = entry.getKey();
            if (set == null || !set.contains(key)) {
                if (key == null) {
                    this._type.getKeyType();
                    serializerProvider.findNullKeySerializer().serialize(null, jsonGenerator, serializerProvider);
                } else {
                    this._keySerializer.serialize(key, jsonGenerator, serializerProvider);
                }
                jsonGenerator.writeStartArray();
                for (Object obj : entry.getValue()) {
                    if (obj == null) {
                        serializerProvider.defaultSerializeNull(jsonGenerator);
                    } else {
                        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
                        if (jsonSerializer == null) {
                            Class<?> cls = obj.getClass();
                            JsonSerializer<Object> serializerFor = propertySerializerMap.serializerFor(cls);
                            if (serializerFor == null) {
                                serializerFor = serializerProvider.findValueSerializer(cls, this._property);
                                PropertySerializerMap newWith = propertySerializerMap.newWith(cls, serializerFor);
                                if (propertySerializerMap != newWith) {
                                    this._dynamicValueSerializers = newWith;
                                }
                                propertySerializerMap = this._dynamicValueSerializers;
                            }
                            jsonSerializer = serializerFor;
                        }
                        TypeSerializer typeSerializer = this._valueTypeSerializer;
                        if (typeSerializer == null) {
                            jsonSerializer.serialize(obj, jsonGenerator, serializerProvider);
                        } else {
                            jsonSerializer.serializeWithType(obj, jsonGenerator, serializerProvider, typeSerializer);
                        }
                    }
                }
                jsonGenerator.writeEndArray();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new MultimapSerializer(this, this._property, this._keySerializer, typeSerializer, this._valueSerializer, this._ignoredEntries, this._filterId, this._sortKeys);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonSerializer<?> jsonSerializer;
        Boolean feature;
        Set<String> findIgnoredForSerialization;
        JsonSerializer<?> jsonSerializer2 = this._valueSerializer;
        if (jsonSerializer2 == null) {
            JavaType contentType = this._type.getContentType();
            if (contentType.isFinal()) {
                jsonSerializer2 = serializerProvider.findValueSerializer(contentType, beanProperty);
            }
        } else if (jsonSerializer2 instanceof ContextualSerializer) {
            jsonSerializer2 = ((ContextualSerializer) jsonSerializer2).createContextual(serializerProvider, beanProperty);
        }
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        JsonSerializer<?> jsonSerializer3 = null;
        AnnotatedMember member = beanProperty == null ? null : beanProperty.getMember();
        Object obj = this._filterId;
        if (!(member == null || annotationIntrospector == null)) {
            Object findKeySerializer = annotationIntrospector.findKeySerializer(member);
            if (findKeySerializer != null) {
                jsonSerializer3 = serializerProvider.serializerInstance(member, findKeySerializer);
            }
            Object findContentSerializer = annotationIntrospector.findContentSerializer(member);
            if (findContentSerializer != null) {
                jsonSerializer2 = serializerProvider.serializerInstance(member, findContentSerializer);
            }
            obj = annotationIntrospector.findFilterId(member);
        }
        if (jsonSerializer2 == null) {
            jsonSerializer2 = this._valueSerializer;
        }
        JsonSerializer<?> findContextualConvertingSerializer = findContextualConvertingSerializer(serializerProvider, beanProperty, jsonSerializer2);
        if (findContextualConvertingSerializer == null) {
            JavaType contentType2 = this._type.getContentType();
            if (contentType2.useStaticType()) {
                findContextualConvertingSerializer = serializerProvider.findValueSerializer(contentType2, beanProperty);
            }
        } else {
            findContextualConvertingSerializer = serializerProvider.handleSecondaryContextualization(findContextualConvertingSerializer, beanProperty);
        }
        if (jsonSerializer3 == null) {
            jsonSerializer3 = this._keySerializer;
        }
        if (jsonSerializer3 == null) {
            jsonSerializer = serializerProvider.findKeySerializer(this._type.getKeyType(), beanProperty);
        } else {
            jsonSerializer = serializerProvider.handleSecondaryContextualization(jsonSerializer3, beanProperty);
        }
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        if (typeSerializer != null) {
            typeSerializer = typeSerializer.forProperty(beanProperty);
        }
        Set<String> set = this._ignoredEntries;
        boolean z = false;
        if (!(annotationIntrospector == null || member == null)) {
            JsonIgnoreProperties.Value findPropertyIgnorals = annotationIntrospector.findPropertyIgnorals(member);
            if (!(findPropertyIgnorals == null || (findIgnoredForSerialization = findPropertyIgnorals.findIgnoredForSerialization()) == null || findIgnoredForSerialization.isEmpty())) {
                set = set == null ? new HashSet<>() : new HashSet(set);
                for (String str : findIgnoredForSerialization) {
                    set.add(str);
                }
            }
            Boolean findSerializationSortAlphabetically = annotationIntrospector.findSerializationSortAlphabetically(member);
            if (findSerializationSortAlphabetically != null && findSerializationSortAlphabetically.booleanValue()) {
                z = true;
            }
        }
        JsonFormat.Value findFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType());
        return new MultimapSerializer(this, beanProperty, jsonSerializer, typeSerializer, findContextualConvertingSerializer, set, obj, (findFormatOverrides == null || (feature = findFormatOverrides.getFeature(JsonFormat.Feature.WRITE_SORTED_MAP_ENTRIES)) == null) ? z : feature.booleanValue());
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ boolean isEmpty(SerializerProvider serializerProvider, Object obj) {
        return isEmpty((Multimap) obj);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Multimap<?, ?> multimap = (Multimap) obj;
        jsonGenerator.writeStartObject();
        jsonGenerator.setCurrentValue(multimap);
        if (!multimap.isEmpty()) {
            Object obj2 = this._filterId;
            if (obj2 == null) {
                serializeFields(multimap, jsonGenerator, serializerProvider);
            } else {
                findPropertyFilter(serializerProvider, obj2, multimap);
                throw null;
            }
        }
        jsonGenerator.writeEndObject();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        Multimap<?, ?> multimap = (Multimap) obj;
        jsonGenerator.setCurrentValue(multimap);
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(multimap, JsonToken.START_OBJECT));
        if (!multimap.isEmpty()) {
            Object obj2 = this._filterId;
            if (obj2 == null) {
                serializeFields(multimap, jsonGenerator, serializerProvider);
            } else {
                findPropertyFilter(serializerProvider, obj2, multimap);
                throw null;
            }
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    /* JADX WARN: Incorrect args count in method signature: (Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/google/common/collect/Multimap<**>;)Z */
    public boolean isEmpty(Multimap multimap) {
        return multimap.isEmpty();
    }

    protected MultimapSerializer(MultimapSerializer multimapSerializer, BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer2, Set<String> set, Object obj, boolean z) {
        super(multimapSerializer);
        this._type = multimapSerializer._type;
        this._property = beanProperty;
        this._keySerializer = jsonSerializer;
        this._valueTypeSerializer = typeSerializer;
        this._valueSerializer = jsonSerializer2;
        this._dynamicValueSerializers = multimapSerializer._dynamicValueSerializers;
        this._ignoredEntries = set;
        this._filterId = obj;
        this._sortKeys = z;
    }
}
