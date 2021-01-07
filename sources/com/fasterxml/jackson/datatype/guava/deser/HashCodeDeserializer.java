package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.google.common.hash.HashCode;
import java.util.Locale;

public class HashCodeDeserializer extends FromStringDeserializer<HashCode> {
    private static final long serialVersionUID = 1;
    public static final HashCodeDeserializer std = new HashCodeDeserializer();

    public HashCodeDeserializer() {
        super(HashCode.class);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public /* bridge */ /* synthetic */ HashCode _deserialize(String str, DeserializationContext deserializationContext) {
        return _deserialize(str);
    }

    /* access modifiers changed from: protected */
    public HashCode _deserialize(String str) {
        return HashCode.fromString(str.toLowerCase(Locale.ENGLISH));
    }
}
