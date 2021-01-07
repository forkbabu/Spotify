package com.spotify.player.esperanto.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class EsOptional$OptionalInt64 extends GeneratedMessageLite<EsOptional$OptionalInt64, a> implements Object {
    private static final EsOptional$OptionalInt64 b;
    private static volatile x<EsOptional$OptionalInt64> c;
    private long a;

    public static final class a extends GeneratedMessageLite.b<EsOptional$OptionalInt64, a> implements Object {
        public a m(long j) {
            copyOnWrite();
            EsOptional$OptionalInt64.h((EsOptional$OptionalInt64) this.instance, j);
            return this;
        }

        private a() {
            super(EsOptional$OptionalInt64.b);
        }
    }

    static {
        EsOptional$OptionalInt64 esOptional$OptionalInt64 = new EsOptional$OptionalInt64();
        b = esOptional$OptionalInt64;
        esOptional$OptionalInt64.makeImmutable();
    }

    private EsOptional$OptionalInt64() {
    }

    static void h(EsOptional$OptionalInt64 esOptional$OptionalInt64, long j) {
        esOptional$OptionalInt64.a = j;
    }

    public static EsOptional$OptionalInt64 i() {
        return b;
    }

    public static a m() {
        return (a) b.toBuilder();
    }

    public static x<EsOptional$OptionalInt64> parser() {
        return b.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return b;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                EsOptional$OptionalInt64 esOptional$OptionalInt64 = (EsOptional$OptionalInt64) obj2;
                long j = this.a;
                boolean z2 = j != 0;
                long j2 = esOptional$OptionalInt64.a;
                this.a = hVar.s(z2, j, j2 != 0, j2);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a = gVar.w();
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
                return null;
            case 4:
                return new EsOptional$OptionalInt64();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (EsOptional$OptionalInt64.class) {
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
        long j = this.a;
        if (j != 0) {
            i2 = 0 + CodedOutputStream.l(1, j);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public long l() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        long j = this.a;
        if (j != 0) {
            codedOutputStream.U(1, j);
        }
    }
}
