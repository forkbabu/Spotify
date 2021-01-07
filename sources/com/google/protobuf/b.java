package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.u;
import java.io.InputStream;

public abstract class b<MessageType extends u> implements x<MessageType> {
    private static final k a = k.a();

    private MessageType e(MessageType messagetype) {
        UninitializedMessageException uninitializedMessageException;
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        if (messagetype instanceof a) {
            uninitializedMessageException = ((a) messagetype).newUninitializedMessageException();
        } else {
            uninitializedMessageException = new UninitializedMessageException();
        }
        uninitializedMessageException.getClass();
        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(uninitializedMessageException.getMessage());
        invalidProtocolBufferException.d(messagetype);
        throw invalidProtocolBufferException;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.protobuf.b<MessageType extends com.google.protobuf.u> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.x
    public Object a(byte[] bArr) {
        k kVar = a;
        try {
            g d = g.d(bArr, 0, bArr.length);
            u uVar = (u) ((GeneratedMessageLite.c) this).d(d, kVar);
            try {
                d.a(0);
                e(uVar);
                return uVar;
            } catch (InvalidProtocolBufferException e) {
                e.d(uVar);
                throw e;
            }
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    @Override // com.google.protobuf.x
    public Object b(InputStream inputStream) {
        return c(inputStream, a);
    }

    /* renamed from: f */
    public MessageType c(InputStream inputStream, k kVar) {
        g c = g.c(inputStream);
        MessageType messagetype = (MessageType) ((u) ((GeneratedMessageLite.c) this).d(c, kVar));
        try {
            c.a(0);
            e(messagetype);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            e.d(messagetype);
            throw e;
        }
    }
}
