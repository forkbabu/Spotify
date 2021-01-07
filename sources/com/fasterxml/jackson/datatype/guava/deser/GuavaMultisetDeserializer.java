package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.google.common.collect.Multiset;

/* access modifiers changed from: package-private */
public abstract class GuavaMultisetDeserializer<T extends Multiset<Object>> extends GuavaCollectionDeserializer<T> {
    private static final long serialVersionUID = 1;

    GuavaMultisetDeserializer(CollectionType collectionType, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(collectionType, typeDeserializer, jsonDeserializer);
    }

    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.datatype.guava.deser.GuavaCollectionDeserializer
    public Object _deserializeContents(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object obj;
        JsonDeserializer<?> jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._typeDeserializerForValue;
        T createMultiset = createMultiset();
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == JsonToken.END_ARRAY) {
                return createMultiset;
            }
            if (nextToken == JsonToken.VALUE_NULL) {
                obj = null;
            } else if (typeDeserializer == null) {
                obj = jsonDeserializer.deserialize(jsonParser, deserializationContext);
            } else {
                obj = jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
            }
            createMultiset.add(obj);
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
        T createMultiset = createMultiset();
        createMultiset.add(obj);
        return createMultiset;
    }

    /* access modifiers changed from: protected */
    public abstract T createMultiset();
}
