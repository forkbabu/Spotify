package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.MapType;
import com.google.common.collect.ImmutableMap;

/* access modifiers changed from: package-private */
public abstract class GuavaImmutableMapDeserializer<T extends ImmutableMap<Object, Object>> extends GuavaMapDeserializer<T> {
    GuavaImmutableMapDeserializer(MapType mapType, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(mapType, keyDeserializer, typeDeserializer, jsonDeserializer);
    }

    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.datatype.guava.deser.GuavaMapDeserializer
    public Object _deserializeEntries(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object obj;
        KeyDeserializer keyDeserializer = this._keyDeserializer;
        JsonDeserializer<?> jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._typeDeserializerForValue;
        ImmutableMap.Builder<Object, Object> createBuilder = createBuilder();
        while (jsonParser.getCurrentToken() == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            String str = currentName;
            if (keyDeserializer != null) {
                str = keyDeserializer.deserializeKey(currentName, deserializationContext);
            }
            if (jsonParser.nextToken() == JsonToken.VALUE_NULL) {
                Object nullValue = this._valueDeserializer.getNullValue(deserializationContext);
                if (nullValue != null) {
                    createBuilder.mo51put(str, nullValue);
                }
            } else {
                if (typeDeserializer == null) {
                    obj = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                } else {
                    obj = jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                }
                createBuilder.mo51put(str, obj);
            }
            jsonParser.nextToken();
        }
        return createBuilder.build();
    }

    /* access modifiers changed from: protected */
    public abstract ImmutableMap.Builder<Object, Object> createBuilder();
}
