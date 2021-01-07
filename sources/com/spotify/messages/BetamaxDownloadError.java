package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class BetamaxDownloadError extends GeneratedMessageLite<BetamaxDownloadError, b> implements Object {
    private static final BetamaxDownloadError s;
    private static volatile x<BetamaxDownloadError> t;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private String n = "";
    private int o;
    private String p = "";
    private String q = "";
    private String r = "";

    public static final class b extends GeneratedMessageLite.b<BetamaxDownloadError, b> implements Object {
        public b m(int i) {
            copyOnWrite();
            BetamaxDownloadError.l((BetamaxDownloadError) this.instance, i);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            BetamaxDownloadError.m((BetamaxDownloadError) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            BetamaxDownloadError.i((BetamaxDownloadError) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            BetamaxDownloadError.n((BetamaxDownloadError) this.instance, str);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            BetamaxDownloadError.o((BetamaxDownloadError) this.instance, str);
            return this;
        }

        public b r(String str) {
            copyOnWrite();
            BetamaxDownloadError.h((BetamaxDownloadError) this.instance, str);
            return this;
        }

        public b s(String str) {
            copyOnWrite();
            BetamaxDownloadError.p((BetamaxDownloadError) this.instance, str);
            return this;
        }

        public b t(String str) {
            copyOnWrite();
            BetamaxDownloadError.q((BetamaxDownloadError) this.instance, str);
            return this;
        }

        private b() {
            super(BetamaxDownloadError.s);
        }
    }

    static {
        BetamaxDownloadError betamaxDownloadError = new BetamaxDownloadError();
        s = betamaxDownloadError;
        betamaxDownloadError.makeImmutable();
    }

    private BetamaxDownloadError() {
    }

    static void h(BetamaxDownloadError betamaxDownloadError, String str) {
        betamaxDownloadError.getClass();
        str.getClass();
        betamaxDownloadError.a |= 1;
        betamaxDownloadError.b = str;
    }

    static void i(BetamaxDownloadError betamaxDownloadError, String str) {
        betamaxDownloadError.getClass();
        str.getClass();
        betamaxDownloadError.a |= 8;
        betamaxDownloadError.n = str;
    }

    static void l(BetamaxDownloadError betamaxDownloadError, int i) {
        betamaxDownloadError.a |= 16;
        betamaxDownloadError.o = i;
    }

    static void m(BetamaxDownloadError betamaxDownloadError, String str) {
        betamaxDownloadError.getClass();
        str.getClass();
        betamaxDownloadError.a |= 32;
        betamaxDownloadError.p = str;
    }

    static void n(BetamaxDownloadError betamaxDownloadError, String str) {
        betamaxDownloadError.getClass();
        str.getClass();
        betamaxDownloadError.a |= 64;
        betamaxDownloadError.q = str;
    }

    static void o(BetamaxDownloadError betamaxDownloadError, String str) {
        betamaxDownloadError.getClass();
        str.getClass();
        betamaxDownloadError.a |= 128;
        betamaxDownloadError.r = str;
    }

    static void p(BetamaxDownloadError betamaxDownloadError, String str) {
        betamaxDownloadError.getClass();
        str.getClass();
        betamaxDownloadError.a |= 2;
        betamaxDownloadError.c = str;
    }

    public static x<BetamaxDownloadError> parser() {
        return s.getParserForType();
    }

    static void q(BetamaxDownloadError betamaxDownloadError, String str) {
        betamaxDownloadError.getClass();
        str.getClass();
        betamaxDownloadError.a |= 4;
        betamaxDownloadError.f = str;
    }

    public static b r() {
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
                BetamaxDownloadError betamaxDownloadError = (BetamaxDownloadError) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (betamaxDownloadError.a & 1) == 1, betamaxDownloadError.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (betamaxDownloadError.a & 2) == 2, betamaxDownloadError.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (betamaxDownloadError.a & 4) == 4, betamaxDownloadError.f);
                this.n = hVar.n((this.a & 8) == 8, this.n, (betamaxDownloadError.a & 8) == 8, betamaxDownloadError.n);
                this.o = hVar.m((this.a & 16) == 16, this.o, (betamaxDownloadError.a & 16) == 16, betamaxDownloadError.o);
                this.p = hVar.n((this.a & 32) == 32, this.p, (betamaxDownloadError.a & 32) == 32, betamaxDownloadError.p);
                this.q = hVar.n((this.a & 64) == 64, this.q, (betamaxDownloadError.a & 64) == 64, betamaxDownloadError.q);
                boolean z2 = (this.a & 128) == 128;
                String str = this.r;
                if ((betamaxDownloadError.a & 128) == 128) {
                    z = true;
                }
                this.r = hVar.n(z2, str, z, betamaxDownloadError.r);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= betamaxDownloadError.a;
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
                            } else if (B == 40) {
                                this.a |= 16;
                                this.o = gVar.u();
                            } else if (B == 50) {
                                String z7 = gVar.z();
                                this.a |= 32;
                                this.p = z7;
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
                return new BetamaxDownloadError();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (t == null) {
                    synchronized (BetamaxDownloadError.class) {
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
            i2 += CodedOutputStream.j(5, this.o);
        }
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.p(6, this.p);
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
            codedOutputStream.K(5, this.o);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.P(6, this.p);
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
