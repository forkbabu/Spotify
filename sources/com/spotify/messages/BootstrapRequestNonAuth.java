package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class BootstrapRequestNonAuth extends GeneratedMessageLite<BootstrapRequestNonAuth, b> implements Object {
    private static final BootstrapRequestNonAuth q;
    private static volatile x<BootstrapRequestNonAuth> r;
    private int a;
    private long b;
    private long c;
    private int f;
    private String n = "";
    private String o = "";
    private String p = "";

    public static final class b extends GeneratedMessageLite.b<BootstrapRequestNonAuth, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            BootstrapRequestNonAuth.i((BootstrapRequestNonAuth) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            BootstrapRequestNonAuth.o((BootstrapRequestNonAuth) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            BootstrapRequestNonAuth.l((BootstrapRequestNonAuth) this.instance, str);
            return this;
        }

        public b p(long j) {
            copyOnWrite();
            BootstrapRequestNonAuth.h((BootstrapRequestNonAuth) this.instance, j);
            return this;
        }

        public b q(long j) {
            copyOnWrite();
            BootstrapRequestNonAuth.m((BootstrapRequestNonAuth) this.instance, j);
            return this;
        }

        public b r(int i) {
            copyOnWrite();
            BootstrapRequestNonAuth.n((BootstrapRequestNonAuth) this.instance, i);
            return this;
        }

        private b() {
            super(BootstrapRequestNonAuth.q);
        }
    }

    static {
        BootstrapRequestNonAuth bootstrapRequestNonAuth = new BootstrapRequestNonAuth();
        q = bootstrapRequestNonAuth;
        bootstrapRequestNonAuth.makeImmutable();
    }

    private BootstrapRequestNonAuth() {
    }

    static void h(BootstrapRequestNonAuth bootstrapRequestNonAuth, long j) {
        bootstrapRequestNonAuth.a |= 1;
        bootstrapRequestNonAuth.b = j;
    }

    static void i(BootstrapRequestNonAuth bootstrapRequestNonAuth, String str) {
        bootstrapRequestNonAuth.getClass();
        str.getClass();
        bootstrapRequestNonAuth.a |= 16;
        bootstrapRequestNonAuth.o = str;
    }

    static void l(BootstrapRequestNonAuth bootstrapRequestNonAuth, String str) {
        bootstrapRequestNonAuth.getClass();
        str.getClass();
        bootstrapRequestNonAuth.a |= 32;
        bootstrapRequestNonAuth.p = str;
    }

    static void m(BootstrapRequestNonAuth bootstrapRequestNonAuth, long j) {
        bootstrapRequestNonAuth.a |= 2;
        bootstrapRequestNonAuth.c = j;
    }

    static void n(BootstrapRequestNonAuth bootstrapRequestNonAuth, int i) {
        bootstrapRequestNonAuth.a |= 4;
        bootstrapRequestNonAuth.f = i;
    }

    static void o(BootstrapRequestNonAuth bootstrapRequestNonAuth, String str) {
        bootstrapRequestNonAuth.getClass();
        str.getClass();
        bootstrapRequestNonAuth.a |= 8;
        bootstrapRequestNonAuth.n = str;
    }

    public static b p() {
        return (b) q.toBuilder();
    }

    public static x<BootstrapRequestNonAuth> parser() {
        return q.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return q;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                BootstrapRequestNonAuth bootstrapRequestNonAuth = (BootstrapRequestNonAuth) obj2;
                this.b = hVar.s((this.a & 1) == 1, this.b, (bootstrapRequestNonAuth.a & 1) == 1, bootstrapRequestNonAuth.b);
                this.c = hVar.s((this.a & 2) == 2, this.c, (bootstrapRequestNonAuth.a & 2) == 2, bootstrapRequestNonAuth.c);
                this.f = hVar.m((this.a & 4) == 4, this.f, (bootstrapRequestNonAuth.a & 4) == 4, bootstrapRequestNonAuth.f);
                this.n = hVar.n((this.a & 8) == 8, this.n, (bootstrapRequestNonAuth.a & 8) == 8, bootstrapRequestNonAuth.n);
                this.o = hVar.n((this.a & 16) == 16, this.o, (bootstrapRequestNonAuth.a & 16) == 16, bootstrapRequestNonAuth.o);
                this.p = hVar.n((this.a & 32) == 32, this.p, (bootstrapRequestNonAuth.a & 32) == 32, bootstrapRequestNonAuth.p);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= bootstrapRequestNonAuth.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a |= 1;
                                this.b = gVar.w();
                            } else if (B == 16) {
                                this.a |= 2;
                                this.c = gVar.w();
                            } else if (B == 24) {
                                this.a |= 4;
                                this.f = gVar.u();
                            } else if (B == 34) {
                                String z2 = gVar.z();
                                this.a |= 8;
                                this.n = z2;
                            } else if (B == 42) {
                                String z3 = gVar.z();
                                this.a |= 16;
                                this.o = z3;
                            } else if (B == 50) {
                                String z4 = gVar.z();
                                this.a |= 32;
                                this.p = z4;
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
                return new BootstrapRequestNonAuth();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (r == null) {
                    synchronized (BootstrapRequestNonAuth.class) {
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
            i2 = 0 + CodedOutputStream.l(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.l(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.j(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.p(4, this.n);
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
            codedOutputStream.U(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.U(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.K(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.P(4, this.n);
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
