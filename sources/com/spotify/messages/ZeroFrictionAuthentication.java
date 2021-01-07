package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class ZeroFrictionAuthentication extends GeneratedMessageLite<ZeroFrictionAuthentication, b> implements Object {
    private static final ZeroFrictionAuthentication q;
    private static volatile x<ZeroFrictionAuthentication> r;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private boolean n;
    private String o = "";
    private String p = "";

    public static final class b extends GeneratedMessageLite.b<ZeroFrictionAuthentication, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            ZeroFrictionAuthentication.m((ZeroFrictionAuthentication) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            ZeroFrictionAuthentication.l((ZeroFrictionAuthentication) this.instance, str);
            return this;
        }

        public b o(boolean z) {
            copyOnWrite();
            ZeroFrictionAuthentication.i((ZeroFrictionAuthentication) this.instance, z);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            ZeroFrictionAuthentication.o((ZeroFrictionAuthentication) this.instance, str);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            ZeroFrictionAuthentication.n((ZeroFrictionAuthentication) this.instance, str);
            return this;
        }

        public b r(String str) {
            copyOnWrite();
            ZeroFrictionAuthentication.h((ZeroFrictionAuthentication) this.instance, str);
            return this;
        }

        private b() {
            super(ZeroFrictionAuthentication.q);
        }
    }

    static {
        ZeroFrictionAuthentication zeroFrictionAuthentication = new ZeroFrictionAuthentication();
        q = zeroFrictionAuthentication;
        zeroFrictionAuthentication.makeImmutable();
    }

    private ZeroFrictionAuthentication() {
    }

    static void h(ZeroFrictionAuthentication zeroFrictionAuthentication, String str) {
        zeroFrictionAuthentication.getClass();
        str.getClass();
        zeroFrictionAuthentication.a |= 1;
        zeroFrictionAuthentication.b = str;
    }

    static void i(ZeroFrictionAuthentication zeroFrictionAuthentication, boolean z) {
        zeroFrictionAuthentication.a |= 8;
        zeroFrictionAuthentication.n = z;
    }

    static void l(ZeroFrictionAuthentication zeroFrictionAuthentication, String str) {
        zeroFrictionAuthentication.getClass();
        str.getClass();
        zeroFrictionAuthentication.a |= 16;
        zeroFrictionAuthentication.o = str;
    }

    static void m(ZeroFrictionAuthentication zeroFrictionAuthentication, String str) {
        zeroFrictionAuthentication.getClass();
        str.getClass();
        zeroFrictionAuthentication.a |= 32;
        zeroFrictionAuthentication.p = str;
    }

    static void n(ZeroFrictionAuthentication zeroFrictionAuthentication, String str) {
        zeroFrictionAuthentication.getClass();
        str.getClass();
        zeroFrictionAuthentication.a |= 2;
        zeroFrictionAuthentication.c = str;
    }

    static void o(ZeroFrictionAuthentication zeroFrictionAuthentication, String str) {
        zeroFrictionAuthentication.getClass();
        str.getClass();
        zeroFrictionAuthentication.a |= 4;
        zeroFrictionAuthentication.f = str;
    }

    public static b p() {
        return (b) q.toBuilder();
    }

    public static x<ZeroFrictionAuthentication> parser() {
        return q.getParserForType();
    }

    public static ZeroFrictionAuthentication q(byte[] bArr) {
        return (ZeroFrictionAuthentication) GeneratedMessageLite.parseFrom(q, bArr);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return q;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ZeroFrictionAuthentication zeroFrictionAuthentication = (ZeroFrictionAuthentication) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (zeroFrictionAuthentication.a & 1) == 1, zeroFrictionAuthentication.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (zeroFrictionAuthentication.a & 2) == 2, zeroFrictionAuthentication.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (zeroFrictionAuthentication.a & 4) == 4, zeroFrictionAuthentication.f);
                this.n = hVar.f((this.a & 8) == 8, this.n, (zeroFrictionAuthentication.a & 8) == 8, zeroFrictionAuthentication.n);
                this.o = hVar.n((this.a & 16) == 16, this.o, (zeroFrictionAuthentication.a & 16) == 16, zeroFrictionAuthentication.o);
                boolean z2 = (this.a & 32) == 32;
                String str = this.p;
                if ((zeroFrictionAuthentication.a & 32) == 32) {
                    z = true;
                }
                this.p = hVar.n(z2, str, z, zeroFrictionAuthentication.p);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= zeroFrictionAuthentication.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                String z3 = gVar.z();
                                this.a |= 1;
                                this.b = z3;
                            } else if (B == 18) {
                                String z4 = gVar.z();
                                this.a |= 2;
                                this.c = z4;
                            } else if (B == 26) {
                                String z5 = gVar.z();
                                this.a |= 4;
                                this.f = z5;
                            } else if (B == 32) {
                                this.a |= 8;
                                this.n = gVar.h();
                            } else if (B == 42) {
                                String z6 = gVar.z();
                                this.a |= 16;
                                this.o = z6;
                            } else if (B == 50) {
                                String z7 = gVar.z();
                                this.a |= 32;
                                this.p = z7;
                            } else if (!parseUnknownField(B, gVar)) {
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
                return new ZeroFrictionAuthentication();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (r == null) {
                    synchronized (ZeroFrictionAuthentication.class) {
                        if (r == null) {
                            r = new GeneratedMessageLite.c(q);
                        }
                    }
                }
                return r;
            default:
                throw new UnsupportedOperationException();
        }
        return q;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.p(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.p(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.p(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.d(4, this.n);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.p(5, this.o);
        }
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.p(6, this.p);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.P(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.A(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.P(5, this.o);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.P(6, this.p);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
