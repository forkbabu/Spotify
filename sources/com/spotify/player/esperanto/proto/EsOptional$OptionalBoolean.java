package com.spotify.player.esperanto.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class EsOptional$OptionalBoolean extends GeneratedMessageLite<EsOptional$OptionalBoolean, a> implements Object {
    private static final EsOptional$OptionalBoolean b;
    private static volatile x<EsOptional$OptionalBoolean> c;
    private boolean a;

    public static final class a extends GeneratedMessageLite.b<EsOptional$OptionalBoolean, a> implements Object {
        public a m(boolean z) {
            copyOnWrite();
            EsOptional$OptionalBoolean.h((EsOptional$OptionalBoolean) this.instance, z);
            return this;
        }

        private a() {
            super(EsOptional$OptionalBoolean.b);
        }
    }

    static {
        EsOptional$OptionalBoolean esOptional$OptionalBoolean = new EsOptional$OptionalBoolean();
        b = esOptional$OptionalBoolean;
        esOptional$OptionalBoolean.makeImmutable();
    }

    private EsOptional$OptionalBoolean() {
    }

    static void h(EsOptional$OptionalBoolean esOptional$OptionalBoolean, boolean z) {
        esOptional$OptionalBoolean.a = z;
    }

    public static a i() {
        return (a) b.toBuilder();
    }

    public static x<EsOptional$OptionalBoolean> parser() {
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
                boolean z = this.a;
                boolean z2 = ((EsOptional$OptionalBoolean) obj2).a;
                this.a = ((GeneratedMessageLite.h) obj).f(z, z, z2, z2);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a = gVar.h();
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z3 = true;
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
                return null;
            case 4:
                return new EsOptional$OptionalBoolean();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (EsOptional$OptionalBoolean.class) {
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
        boolean z = this.a;
        if (z) {
            i2 = 0 + CodedOutputStream.d(1, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        boolean z = this.a;
        if (z) {
            codedOutputStream.A(1, z);
        }
    }
}
