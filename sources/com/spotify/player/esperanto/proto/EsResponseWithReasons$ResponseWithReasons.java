package com.spotify.player.esperanto.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class EsResponseWithReasons$ResponseWithReasons extends GeneratedMessageLite<EsResponseWithReasons$ResponseWithReasons, a> implements Object {
    private static final EsResponseWithReasons$ResponseWithReasons c;
    private static volatile x<EsResponseWithReasons$ResponseWithReasons> f;
    private int a;
    private String b = "";

    public enum Error implements o.c {
        OK(0),
        FORBIDDEN(1),
        NOT_FOUND(2),
        CONFLICT(3),
        UNRECOGNIZED(-1);
        
        private final int value;

        private Error(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public static final class a extends GeneratedMessageLite.b<EsResponseWithReasons$ResponseWithReasons, a> implements Object {
        private a() {
            super(EsResponseWithReasons$ResponseWithReasons.c);
        }
    }

    static {
        EsResponseWithReasons$ResponseWithReasons esResponseWithReasons$ResponseWithReasons = new EsResponseWithReasons$ResponseWithReasons();
        c = esResponseWithReasons$ResponseWithReasons;
        esResponseWithReasons$ResponseWithReasons.makeImmutable();
    }

    private EsResponseWithReasons$ResponseWithReasons() {
    }

    public static EsResponseWithReasons$ResponseWithReasons l(byte[] bArr) {
        return (EsResponseWithReasons$ResponseWithReasons) GeneratedMessageLite.parseFrom(c, bArr);
    }

    public static x<EsResponseWithReasons$ResponseWithReasons> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                EsResponseWithReasons$ResponseWithReasons esResponseWithReasons$ResponseWithReasons = (EsResponseWithReasons$ResponseWithReasons) obj2;
                int i = this.a;
                boolean z2 = i != 0;
                int i2 = esResponseWithReasons$ResponseWithReasons.a;
                if (i2 != 0) {
                    z = true;
                }
                this.a = hVar.m(z2, i, z, i2);
                this.b = hVar.n(!this.b.isEmpty(), this.b, true ^ esResponseWithReasons$ResponseWithReasons.b.isEmpty(), esResponseWithReasons$ResponseWithReasons.b);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a = gVar.u();
                            } else if (B == 18) {
                                this.b = gVar.A();
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
                return new EsResponseWithReasons$ResponseWithReasons();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (EsResponseWithReasons$ResponseWithReasons.class) {
                        if (f == null) {
                            f = new GeneratedMessageLite.c(c);
                        }
                    }
                }
                return f;
            default:
                throw new UnsupportedOperationException();
        }
        return c;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.a != Error.OK.getNumber()) {
            i2 = 0 + CodedOutputStream.h(1, this.a);
        }
        if (!this.b.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.b);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Error h() {
        Error error;
        int i = this.a;
        if (i == 0) {
            error = Error.OK;
        } else if (i == 1) {
            error = Error.FORBIDDEN;
        } else if (i == 2) {
            error = Error.NOT_FOUND;
        } else if (i != 3) {
            error = null;
        } else {
            error = Error.CONFLICT;
        }
        return error == null ? Error.UNRECOGNIZED : error;
    }

    public String i() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a != Error.OK.getNumber()) {
            codedOutputStream.K(1, this.a);
        }
        if (!this.b.isEmpty()) {
            codedOutputStream.P(2, this.b);
        }
    }
}
