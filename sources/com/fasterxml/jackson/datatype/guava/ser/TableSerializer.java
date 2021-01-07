package com.fasterxml.jackson.datatype.guava.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.google.common.collect.Table;
import java.util.Map;

public class TableSerializer extends ContainerSerializer<Table<?, ?, ?>> implements ContextualSerializer {
    private static final long serialVersionUID = 1;
    private final JsonSerializer<Object> _columnSerializer;
    private final BeanProperty _property;
    private final MapSerializer _rowMapSerializer;
    private final JsonSerializer<Object> _rowSerializer;
    private final JavaType _type;
    private final JsonSerializer<Object> _valueSerializer;
    private final TypeSerializer _valueTypeSerializer;

    public TableSerializer(JavaType javaType) {
        super(javaType);
        this._type = javaType;
        this._property = null;
        this._rowSerializer = null;
        this._columnSerializer = null;
        this._valueTypeSerializer = null;
        this._valueSerializer = null;
        this._rowMapSerializer = null;
    }

    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new TableSerializer(this, typeSerializer);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonSerializer<?> jsonSerializer = this._valueSerializer;
        if (jsonSerializer == null) {
            JavaType containedTypeOrUnknown = this._type.containedTypeOrUnknown(2);
            if (containedTypeOrUnknown.isFinal()) {
                jsonSerializer = serializerProvider.findValueSerializer(containedTypeOrUnknown, beanProperty);
            }
        } else if (jsonSerializer instanceof ContextualSerializer) {
            jsonSerializer = ((ContextualSerializer) jsonSerializer).createContextual(serializerProvider, beanProperty);
        }
        JsonSerializer<?> jsonSerializer2 = this._rowSerializer;
        if (jsonSerializer2 == null) {
            jsonSerializer2 = serializerProvider.findKeySerializer(this._type.containedTypeOrUnknown(0), beanProperty);
        } else if (jsonSerializer2 instanceof ContextualSerializer) {
            jsonSerializer2 = ((ContextualSerializer) jsonSerializer2).createContextual(serializerProvider, beanProperty);
        }
        JsonSerializer<?> jsonSerializer3 = this._columnSerializer;
        if (jsonSerializer3 == null) {
            jsonSerializer3 = serializerProvider.findKeySerializer(this._type.containedTypeOrUnknown(1), beanProperty);
        } else if (jsonSerializer3 instanceof ContextualSerializer) {
            jsonSerializer3 = ((ContextualSerializer) jsonSerializer3).createContextual(serializerProvider, beanProperty);
        }
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        if (typeSerializer != null) {
            typeSerializer = typeSerializer.forProperty(beanProperty);
        }
        return new TableSerializer(this, beanProperty, serializerProvider.getTypeFactory(), jsonSerializer2, jsonSerializer3, typeSerializer, jsonSerializer);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ boolean isEmpty(SerializerProvider serializerProvider, Object obj) {
        return isEmpty((Table) obj);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Table table = (Table) obj;
        jsonGenerator.writeStartObject(table);
        if (!table.isEmpty()) {
            this._rowMapSerializer.serializeFields(table.rowMap(), jsonGenerator, serializerProvider);
        }
        jsonGenerator.writeEndObject();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        Table table = (Table) obj;
        jsonGenerator.setCurrentValue(table);
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(table, JsonToken.START_OBJECT));
        this._rowMapSerializer.serializeFields(table.rowMap(), jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    /* JADX WARN: Incorrect args count in method signature: (Lcom/fasterxml/jackson/databind/SerializerProvider;Lcom/google/common/collect/Table<***>;)Z */
    public boolean isEmpty(Table table) {
        return table.isEmpty();
    }

    protected TableSerializer(TableSerializer tableSerializer, BeanProperty beanProperty, TypeFactory typeFactory, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer3) {
        super(tableSerializer);
        JavaType javaType = tableSerializer._type;
        this._type = javaType;
        this._property = beanProperty;
        this._rowSerializer = jsonSerializer;
        this._columnSerializer = jsonSerializer2;
        this._valueTypeSerializer = typeSerializer;
        this._valueSerializer = jsonSerializer3;
        MapType constructMapType = typeFactory.constructMapType(Map.class, javaType.containedTypeOrUnknown(1), javaType.containedTypeOrUnknown(2));
        this._rowMapSerializer = MapSerializer.construct(null, typeFactory.constructMapType(Map.class, javaType.containedTypeOrUnknown(0), constructMapType), false, null, jsonSerializer, MapSerializer.construct(null, constructMapType, false, typeSerializer, jsonSerializer2, jsonSerializer3, null), null);
    }

    protected TableSerializer(TableSerializer tableSerializer, TypeSerializer typeSerializer) {
        super(tableSerializer);
        this._type = tableSerializer._type;
        this._property = tableSerializer._property;
        this._rowSerializer = tableSerializer._rowSerializer;
        this._columnSerializer = tableSerializer._columnSerializer;
        this._valueTypeSerializer = typeSerializer;
        this._valueSerializer = tableSerializer._valueSerializer;
        this._rowMapSerializer = tableSerializer._rowMapSerializer;
    }
}
