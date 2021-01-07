package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.google.common.net.InternetDomainName;

public class InternetDomainNameDeserializer extends FromStringDeserializer<InternetDomainName> {
    private static final long serialVersionUID = 1;
    public static final InternetDomainNameDeserializer std = new InternetDomainNameDeserializer();

    public InternetDomainNameDeserializer() {
        super(InternetDomainName.class);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public /* bridge */ /* synthetic */ InternetDomainName _deserialize(String str, DeserializationContext deserializationContext) {
        return _deserialize(str);
    }

    /* access modifiers changed from: protected */
    public InternetDomainName _deserialize(String str) {
        return InternetDomainName.from(str);
    }
}
