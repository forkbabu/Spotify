package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class MobileClientRecaptchaEventNonAuth extends GeneratedMessageLite<MobileClientRecaptchaEventNonAuth, b> implements Object {
    private static final MobileClientRecaptchaEventNonAuth q;
    private static volatile x<MobileClientRecaptchaEventNonAuth> r;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private String n = "";
    private String o = "";
    private String p = "";

    public static final class b extends GeneratedMessageLite.b<MobileClientRecaptchaEventNonAuth, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            MobileClientRecaptchaEventNonAuth.l((MobileClientRecaptchaEventNonAuth) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            MobileClientRecaptchaEventNonAuth.n((MobileClientRecaptchaEventNonAuth) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            MobileClientRecaptchaEventNonAuth.i((MobileClientRecaptchaEventNonAuth) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            MobileClientRecaptchaEventNonAuth.m((MobileClientRecaptchaEventNonAuth) this.instance, str);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            MobileClientRecaptchaEventNonAuth.h((MobileClientRecaptchaEventNonAuth) this.instance, str);
            return this;
        }

        private b() {
            super(MobileClientRecaptchaEventNonAuth.q);
        }
    }

    static {
        MobileClientRecaptchaEventNonAuth mobileClientRecaptchaEventNonAuth = new MobileClientRecaptchaEventNonAuth();
        q = mobileClientRecaptchaEventNonAuth;
        mobileClientRecaptchaEventNonAuth.makeImmutable();
    }

    private MobileClientRecaptchaEventNonAuth() {
    }

    static void h(MobileClientRecaptchaEventNonAuth mobileClientRecaptchaEventNonAuth, String str) {
        mobileClientRecaptchaEventNonAuth.getClass();
        str.getClass();
        mobileClientRecaptchaEventNonAuth.a |= 1;
        mobileClientRecaptchaEventNonAuth.b = str;
    }

    static void i(MobileClientRecaptchaEventNonAuth mobileClientRecaptchaEventNonAuth, String str) {
        mobileClientRecaptchaEventNonAuth.getClass();
        str.getClass();
        mobileClientRecaptchaEventNonAuth.a |= 8;
        mobileClientRecaptchaEventNonAuth.n = str;
    }

    static void l(MobileClientRecaptchaEventNonAuth mobileClientRecaptchaEventNonAuth, String str) {
        mobileClientRecaptchaEventNonAuth.getClass();
        str.getClass();
        mobileClientRecaptchaEventNonAuth.a |= 16;
        mobileClientRecaptchaEventNonAuth.o = str;
    }

    static void m(MobileClientRecaptchaEventNonAuth mobileClientRecaptchaEventNonAuth, String str) {
        mobileClientRecaptchaEventNonAuth.getClass();
        str.getClass();
        mobileClientRecaptchaEventNonAuth.a |= 2;
        mobileClientRecaptchaEventNonAuth.c = str;
    }

    static void n(MobileClientRecaptchaEventNonAuth mobileClientRecaptchaEventNonAuth, String str) {
        mobileClientRecaptchaEventNonAuth.getClass();
        str.getClass();
        mobileClientRecaptchaEventNonAuth.a |= 4;
        mobileClientRecaptchaEventNonAuth.f = str;
    }

    public static b o() {
        return (b) q.toBuilder();
    }

    public static x<MobileClientRecaptchaEventNonAuth> parser() {
        return q.getParserForType();
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
                MobileClientRecaptchaEventNonAuth mobileClientRecaptchaEventNonAuth = (MobileClientRecaptchaEventNonAuth) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (mobileClientRecaptchaEventNonAuth.a & 1) == 1, mobileClientRecaptchaEventNonAuth.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (mobileClientRecaptchaEventNonAuth.a & 2) == 2, mobileClientRecaptchaEventNonAuth.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (mobileClientRecaptchaEventNonAuth.a & 4) == 4, mobileClientRecaptchaEventNonAuth.f);
                this.n = hVar.n((this.a & 8) == 8, this.n, (mobileClientRecaptchaEventNonAuth.a & 8) == 8, mobileClientRecaptchaEventNonAuth.n);
                this.o = hVar.n((this.a & 16) == 16, this.o, (mobileClientRecaptchaEventNonAuth.a & 16) == 16, mobileClientRecaptchaEventNonAuth.o);
                boolean z2 = (this.a & 32) == 32;
                String str = this.p;
                if ((mobileClientRecaptchaEventNonAuth.a & 32) == 32) {
                    z = true;
                }
                this.p = hVar.n(z2, str, z, mobileClientRecaptchaEventNonAuth.p);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= mobileClientRecaptchaEventNonAuth.a;
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
                            } else if (B == 50) {
                                String z8 = gVar.z();
                                this.a |= 32;
                                this.p = z8;
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
                return new MobileClientRecaptchaEventNonAuth();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (r == null) {
                    synchronized (MobileClientRecaptchaEventNonAuth.class) {
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
            codedOutputStream.P(6, this.p);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
