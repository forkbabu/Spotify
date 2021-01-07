package com.spotify.inappmessaging.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.t;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public final class Messages$MessageResponseV1 extends GeneratedMessageLite<Messages$MessageResponseV1, a> implements Object {
    private static final Messages$MessageResponseV1 b;
    private static volatile x<Messages$MessageResponseV1> c;
    private MapFieldLite<String, Messages$MessageV1> a = MapFieldLite.d();

    public static final class a extends GeneratedMessageLite.b<Messages$MessageResponseV1, a> implements Object {
        private a() {
            super(Messages$MessageResponseV1.b);
        }
    }

    private static final class b {
        static final t<String, Messages$MessageV1> a = t.b(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Messages$MessageV1.m());
    }

    static {
        Messages$MessageResponseV1 messages$MessageResponseV1 = new Messages$MessageResponseV1();
        b = messages$MessageResponseV1;
        messages$MessageResponseV1.makeImmutable();
    }

    private Messages$MessageResponseV1() {
    }

    public static Messages$MessageResponseV1 l(byte[] bArr) {
        return (Messages$MessageResponseV1) GeneratedMessageLite.parseFrom(b, bArr);
    }

    public static x<Messages$MessageResponseV1> parser() {
        return b.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return b;
            case 1:
                this.a = ((GeneratedMessageLite.h) obj).c(this.a, ((Messages$MessageResponseV1) obj2).a);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                if (!this.a.f()) {
                                    this.a = this.a.k();
                                }
                                b.a.d(this.a, gVar, kVar);
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.d(this);
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.d(this);
                        throw new RuntimeException(invalidProtocolBufferException);
                    }
                }
                break;
            case 3:
                this.a.g();
                return null;
            case 4:
                return new Messages$MessageResponseV1();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (Messages$MessageResponseV1.class) {
                        if (c == null) {
                            c = new GeneratedMessageLite.c(b);
                        }
                    }
                }
                return c;
            default:
                throw new UnsupportedOperationException();
        }
        return b;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (Map.Entry<String, Messages$MessageV1> entry : this.a.entrySet()) {
            i2 = je.j1(entry, b.a, 1, entry.getKey(), i2);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean h(String str) {
        str.getClass();
        return this.a.containsKey(str);
    }

    public Map<String, Messages$MessageV1> i() {
        return Collections.unmodifiableMap(this.a);
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (Map.Entry<String, Messages$MessageV1> entry : this.a.entrySet()) {
            b.a.e(codedOutputStream, 1, entry.getKey(), entry.getValue());
        }
    }
}
