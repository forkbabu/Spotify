package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.google.common.collect.ImmutableCollection;

/* access modifiers changed from: package-private */
public abstract class GuavaImmutableCollectionDeserializer<T extends ImmutableCollection<Object>> extends GuavaCollectionDeserializer<T> {
    private static final long serialVersionUID = 1;

    GuavaImmutableCollectionDeserializer(CollectionType collectionType, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(collectionType, typeDeserializer, jsonDeserializer);
    }

    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.datatype.guava.deser.GuavaCollectionDeserializer
    public Object _deserializeContents(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object obj;
        JsonDeserializer<?> jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._typeDeserializerForValue;
        ImmutableCollection.Builder<Object> createBuilder = createBuilder();
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == JsonToken.END_ARRAY) {
                return createBuilder.build();
            }
            if (nextToken == JsonToken.VALUE_NULL) {
                obj = null;
            } else if (typeDeserializer == null) {
                obj = jsonDeserializer.deserialize(jsonParser, deserializationContext);
            } else {
                obj = jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
            }
            createBuilder.mo53add(obj);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.datatype.guava.deser.GuavaCollectionDeserializer
    public Object _deserializeFromSingleValue(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object obj;
        JsonDeserializer<?> jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._typeDeserializerForValue;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            obj = null;
        } else if (typeDeserializer == null) {
            obj = jsonDeserializer.deserialize(jsonParser, deserializationContext);
        } else {
            obj = jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
        }
        return createBuilder().mo53add(obj).build();
    }

    /* access modifiers changed from: protected */
    public abstract ImmutableCollection.Builder<Object> createBuilder();
}
