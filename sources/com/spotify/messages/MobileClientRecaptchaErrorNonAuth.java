package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class MobileClientRecaptchaErrorNonAuth extends GeneratedMessageLite<MobileClientRecaptchaErrorNonAuth, b> implements Object {
    private static final MobileClientRecaptchaErrorNonAuth s;
    private static volatile x<MobileClientRecaptchaErrorNonAuth> t;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private String n = "";
    private String o = "";
    private long p;
    private String q = "";
    private String r = "";

    public static final class b extends GeneratedMessageLite.b<MobileClientRecaptchaErrorNonAuth, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            MobileClientRecaptchaErrorNonAuth.l((MobileClientRecaptchaErrorNonAuth) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            MobileClientRecaptchaErrorNonAuth.p((MobileClientRecaptchaErrorNonAuth) this.instance, str);
            return this;
        }

        public b o(long j) {
            copyOnWrite();
            MobileClientRecaptchaErrorNonAuth.m((MobileClientRecaptchaErrorNonAuth) this.instance, j);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            MobileClientRecaptchaErrorNonAuth.n((MobileClientRecaptchaErrorNonAuth) this.instance, str);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            MobileClientRecaptchaErrorNonAuth.i((MobileClientRecaptchaErrorNonAuth) this.instance, str);
            return this;
        }

        public b r(String str) {
            copyOnWrite();
            MobileClientRecaptchaErrorNonAuth.o((MobileClientRecaptchaErrorNonAuth) this.instance, str);
            return this;
        }

        public b s(String str) {
            copyOnWrite();
            MobileClientRecaptchaErrorNonAuth.h((MobileClientRecaptchaErrorNonAuth) this.instance, str);
            return this;
        }

        private b() {
            super(MobileClientRecaptchaErrorNonAuth.s);
        }
    }

    static {
        MobileClientRecaptchaErrorNonAuth mobileClientRecaptchaErrorNonAuth = new MobileClientRecaptchaErrorNonAuth();
        s = mobileClientRecaptchaErrorNonAuth;
        mobileClientRecaptchaErrorNonAuth.makeImmutable();
    }

    private MobileClientRecaptchaErrorNonAuth() {
    }

    static void h(MobileClientRecaptchaErrorNonAuth mobileClientRecaptchaErrorNonAuth, String str) {
        mobileClientRecaptchaErrorNonAuth.getClass();
        str.getClass();
        mobileClientRecaptchaErrorNonAuth.a |= 1;
        mobileClientRecaptchaErrorNonAuth.b = str;
    }

    static void i(MobileClientRecaptchaErrorNonAuth mobileClientRecaptchaErrorNonAuth, String str) {
        mobileClientRecaptchaErrorNonAuth.getClass();
        str.getClass();
        mobileClientRecaptchaErrorNonAuth.a |= 8;
        mobileClientRecaptchaErrorNonAuth.n = str;
    }

    static void l(MobileClientRecaptchaErrorNonAuth mobileClientRecaptchaErrorNonAuth, String str) {
        mobileClientRecaptchaErrorNonAuth.getClass();
        str.getClass();
        mobileClientRecaptchaErrorNonAuth.a |= 16;
        mobileClientRecaptchaErrorNonAuth.o = str;
    }

    static void m(MobileClientRecaptchaErrorNonAuth mobileClientRecaptchaErrorNonAuth, long j) {
        mobileClientRecaptchaErrorNonAuth.a |= 32;
        mobileClientRecaptchaErrorNonAuth.p = j;
    }

    static void n(MobileClientRecaptchaErrorNonAuth mobileClientRecaptchaErrorNonAuth, String str) {
        mobileClientRecaptchaErrorNonAuth.getClass();
        str.getClass();
        mobileClientRecaptchaErrorNonAuth.a |= 64;
        mobileClientRecaptchaErrorNonAuth.q = str;
    }

    static void o(MobileClientRecaptchaErrorNonAuth mobileClientRecaptchaErrorNonAuth, String str) {
        mobileClientRecaptchaErrorNonAuth.getClass();
        str.getClass();
        mobileClientRecaptchaErrorNonAuth.a |= 2;
        mobileClientRecaptchaErrorNonAuth.c = str;
    }

    static void p(MobileClientRecaptchaErrorNonAuth mobileClientRecaptchaErrorNonAuth, String str) {
        mobileClientRecaptchaErrorNonAuth.getClass();
        str.getClass();
        mobileClientRecaptchaErrorNonAuth.a |= 4;
        mobileClientRecaptchaErrorNonAuth.f = str;
    }

    public static x<MobileClientRecaptchaErrorNonAuth> parser() {
        return s.getParserForType();
    }

    public static b q() {
        return (b) s.toBuilder();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return s;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                MobileClientRecaptchaErrorNonAuth mobileClientRecaptchaErrorNonAuth = (MobileClientRecaptchaErrorNonAuth) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (mobileClientRecaptchaErrorNonAuth.a & 1) == 1, mobileClientRecaptchaErrorNonAuth.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (mobileClientRecaptchaErrorNonAuth.a & 2) == 2, mobileClientRecaptchaErrorNonAuth.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (mobileClientRecaptchaErrorNonAuth.a & 4) == 4, mobileClientRecaptchaErrorNonAuth.f);
                this.n = hVar.n((this.a & 8) == 8, this.n, (mobileClientRecaptchaErrorNonAuth.a & 8) == 8, mobileClientRecaptchaErrorNonAuth.n);
                this.o = hVar.n((this.a & 16) == 16, this.o, (mobileClientRecaptchaErrorNonAuth.a & 16) == 16, mobileClientRecaptchaErrorNonAuth.o);
                this.p = hVar.s((this.a & 32) == 32, this.p, (mobileClientRecaptchaErrorNonAuth.a & 32) == 32, mobileClientRecaptchaErrorNonAuth.p);
                this.q = hVar.n((this.a & 64) == 64, this.q, (mobileClientRecaptchaErrorNonAuth.a & 64) == 64, mobileClientRecaptchaErrorNonAuth.q);
                boolean z2 = (this.a & 128) == 128;
                String str = this.r;
                if ((mobileClientRecaptchaErrorNonAuth.a & 128) == 128) {
                    z = true;
                }
                this.r = hVar.n(z2, str, z, mobileClientRecaptchaErrorNonAuth.r);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= mobileClientRecaptchaErrorNonAuth.a;
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
                            } else if (B == 34) {
                                String z6 = gVar.z();
                                this.a |= 8;
                                this.n = z6;
                            } else if (B == 42) {
                                String z7 = gVar.z();
                                this.a |= 16;
                                this.o = z7;
                            } else if (B == 48) {
                                this.a |= 32;
                                this.p = gVar.w();
                            } else if (B == 58) {
                                String z8 = gVar.z();
                                this.a |= 64;
                                this.q = z8;
                            } else if (B == 66) {
                                String z9 = gVar.z();
                                this.a |= 128;
                                this.r = z9;
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
                return new MobileClientRecaptchaErrorNonAuth();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (t == null) {
                    synchronized (MobileClientRecaptchaErrorNonAuth.class) {
                        if (t == null) {
                            t = new GeneratedMessageLite.c(s);
                        }
                    }
                }
                return t;
            default:
                throw new UnsupportedOperationException();
        }
        return s;
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
            i2 += CodedOutputStream.p(4, this.n);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.p(5, this.o);
        }
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.l(6, this.p);
        }
        if ((this.a & 64) == 64) {
            i2 += CodedOutputStream.p(7, this.q);
        }
        if ((this.a & 128) == 128) {
            i2 += CodedOutputStream.p(8, this.r);
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
            codedOutputStream.P(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.P(5, this.o);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.U(6, this.p);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.P(7, this.q);
        }
        if ((this.a & 128) == 128) {
            codedOutputStream.P(8, this.r);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
