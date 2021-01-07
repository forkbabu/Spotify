package com.google.protobuf;

public interface u extends v {

    public interface a extends v, Cloneable {
        u build();

        u buildPartial();

        a mergeFrom(g gVar, k kVar);

        a mergeFrom(u uVar);
    }

    x<? extends u> getParserForType();

    int getSerializedSize();

    a toBuilder();

    byte[] toByteArray();

    ByteString toByteString();

    void writeTo(CodedOutputStream codedOutputStream);
}
