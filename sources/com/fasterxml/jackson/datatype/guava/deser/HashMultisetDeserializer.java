package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.google.common.collect.HashMultiset;

public class HashMultisetDeserializer extends GuavaMultisetDeserializer<HashMultiset<Object>> {
    private static final long serialVersionUID = 1;

    public HashMultisetDeserializer(CollectionType collectionType, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(collectionType, typeDeserializer, jsonDeserializer);
    }

    /* Return type fixed from 'com.google.common.collect.Multiset' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.datatype.guava.deser.GuavaMultisetDeserializer
    public HashMultiset<Object> createMultiset() {
        return HashMultiset.create();
    }

    @Override // com.fasterxml.jackson.datatype.guava.deser.GuavaCollectionDeserializer
    public GuavaCollectionDeserializer withResolved(TypeDeserializer typeDeserializer, JsonDeserializer jsonDeserializer) {
        return new HashMultisetDeserializer(this._containerType, typeDeserializer, jsonDeserializer);
    }
}
