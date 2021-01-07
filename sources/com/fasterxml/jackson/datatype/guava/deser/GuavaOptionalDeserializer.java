package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.google.common.base.Optional;

public class GuavaOptionalDeserializer extends ReferenceTypeDeserializer<Optional<?>> {
    private static final long serialVersionUID = 1;

    public GuavaOptionalDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(javaType, valueInstantiator, typeDeserializer, jsonDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
    public /* bridge */ /* synthetic */ Object getNullValue(DeserializationContext deserializationContext) {
        return getNullValue();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    public Object getReferenced(Optional<?> optional) {
        return optional.get();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    public Optional<?> referenceValue(Object obj) {
        return Optional.fromNullable(obj);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    public /* bridge */ /* synthetic */ Optional<?> updateReference(Optional<?> optional, Object obj) {
        return updateReference(obj);
    }

    /* Return type fixed from 'com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer' to match base method */
    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    public ReferenceTypeDeserializer<Optional<?>> withResolved(TypeDeserializer typeDeserializer, JsonDeserializer jsonDeserializer) {
        return new GuavaOptionalDeserializer(this._fullType, this._valueInstantiator, typeDeserializer, jsonDeserializer);
    }

    /* JADX WARN: Incorrect args count in method signature: (Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/google/common/base/Optional<*>; */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Optional getNullValue() {
        return Optional.absent();
    }

    /* JADX WARN: Incorrect args count in method signature: (Lcom/google/common/base/Optional<*>;Ljava/lang/Object;)Lcom/google/common/base/Optional<*>; */
    public Optional updateReference(Object obj) {
        return Optional.fromNullable(obj);
    }
}
