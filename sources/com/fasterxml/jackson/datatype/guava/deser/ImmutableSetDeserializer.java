package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableSet;

public class ImmutableSetDeserializer extends GuavaImmutableCollectionDeserializer<ImmutableSet<Object>> {
    private static final long serialVersionUID = 1;

    public ImmutableSetDeserializer(CollectionType collectionType, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(collectionType, typeDeserializer, jsonDeserializer);
    }

    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.datatype.guava.deser.GuavaImmutableCollectionDeserializer
    public ImmutableCollection.Builder<Object> createBuilder() {
        int i = ImmutableSet.a;
        return new ImmutableSet.Builder();
    }

    @Override // com.fasterxml.jackson.datatype.guava.deser.GuavaCollectionDeserializer
    public GuavaCollectionDeserializer withResolved(TypeDeserializer typeDeserializer, JsonDeserializer jsonDeserializer) {
        return new ImmutableSetDeserializer(this._containerType, typeDeserializer, jsonDeserializer);
    }
}
