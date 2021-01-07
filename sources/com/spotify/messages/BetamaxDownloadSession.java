package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class BetamaxDownloadSession extends GeneratedMessageLite<BetamaxDownloadSession, b> implements Object {
    private static final BetamaxDownloadSession t;
    private static volatile x<BetamaxDownloadSession> u;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private long n;
    private long o;
    private String p = "";
    private long q;
    private String r = "";
    private String s = "";

    public static final class b extends GeneratedMessageLite.b<BetamaxDownloadSession, b> implements Object {
        public b m(long j) {
            copyOnWrite();
            BetamaxDownloadSession.n((BetamaxDownloadSession) this.instance, j);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            BetamaxDownloadSession.p((BetamaxDownloadSession) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            BetamaxDownloadSession.o((BetamaxDownloadSession) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            BetamaxDownloadSession.h((BetamaxDownloadSession) this.instance, str);
            return this;
        }

        public b q(long j) {
            copyOnWrite();
            BetamaxDownloadSession.i((BetamaxDownloadSession) this.instance, j);
            return this;
        }

        public b r(String str) {
            copyOnWrite();
            BetamaxDownloadSession.q((BetamaxDownloadSession) this.instance, str);
            return this;
        }

        public b s(long j) {
            copyOnWrite();
            BetamaxDownloadSession.l((BetamaxDownloadSession) this.instance, j);
            return this;
        }

        public b t(String str) {
            copyOnWrite();
            BetamaxDownloadSession.m((BetamaxDownloadSession) this.instance, str);
            return this;
        }

        public b u(String str) {
            copyOnWrite();
            BetamaxDownloadSession.r((BetamaxDownloadSession) this.instance, str);
            return this;
        }

        private b() {
            super(BetamaxDownloadSession.t);
        }
    }

    static {
        BetamaxDownloadSession betamaxDownloadSession = new BetamaxDownloadSession();
        t = betamaxDownloadSession;
        betamaxDownloadSession.makeImmutable();
    }

    private BetamaxDownloadSession() {
    }

    static void h(BetamaxDownloadSession betamaxDownloadSession, String str) {
        betamaxDownloadSession.getClass();
        str.getClass();
        betamaxDownloadSession.a |= 1;
        betamaxDownloadSession.b = str;
    }

    static void i(BetamaxDownloadSession betamaxDownloadSession, long j) {
        betamaxDownloadSession.a |= 8;
        betamaxDownloadSession.n = j;
    }

    static void l(BetamaxDownloadSession betamaxDownloadSession, long j) {
        betamaxDownloadSession.a |= 16;
        betamaxDownloadSession.o = j;
    }

    static void m(BetamaxDownloadSession betamaxDownloadSession, String str) {
        betamaxDownloadSession.getClass();
        str.getClass();
        betamaxDownloadSession.a |= 32;
        betamaxDownloadSession.p = str;
    }

    static void n(BetamaxDownloadSession betamaxDownloadSession, long j) {
        betamaxDownloadSession.a |= 64;
        betamaxDownloadSession.q = j;
    }

    static void o(BetamaxDownloadSession betamaxDownloadSession, String str) {
        betamaxDownloadSession.getClass();
        str.getClass();
        betamaxDownloadSession.a |= 128;
        betamaxDownloadSession.r = str;
    }

    static void p(BetamaxDownloadSession betamaxDownloadSession, String str) {
        betamaxDownloadSession.getClass();
        str.getClass();
        betamaxDownloadSession.a |= 256;
        betamaxDownloadSession.s = str;
    }

    public static x<BetamaxDownloadSession> parser() {
        return t.getParserForType();
    }

    static void q(BetamaxDownloadSession betamaxDownloadSession, String str) {
        betamaxDownloadSession.getClass();
        str.getClass();
        betamaxDownloadSession.a |= 2;
        betamaxDownloadSession.c = str;
    }

    static void r(BetamaxDownloadSession betamaxDownloadSession, String str) {
        betamaxDownloadSession.getClass();
        str.getClass();
        betamaxDownloadSession.a |= 4;
        betamaxDownloadSession.f = str;
    }

    public static b s() {
        return (b) t.toBuilder();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = true;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return t;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                BetamaxDownloadSession betamaxDownloadSession = (BetamaxDownloadSession) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (betamaxDownloadSession.a & 1) == 1, betamaxDownloadSession.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (betamaxDownloadSession.a & 2) == 2, betamaxDownloadSession.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (betamaxDownloadSession.a & 4) == 4, betamaxDownloadSession.f);
                this.n = hVar.s((this.a & 8) == 8, this.n, (betamaxDownloadSession.a & 8) == 8, betamaxDownloadSession.n);
                this.o = hVar.s((this.a & 16) == 16, this.o, (betamaxDownloadSession.a & 16) == 16, betamaxDownloadSession.o);
                this.p = hVar.n((this.a & 32) == 32, this.p, (betamaxDownloadSession.a & 32) == 32, betamaxDownloadSession.p);
                this.q = hVar.s((this.a & 64) == 64, this.q, (betamaxDownloadSession.a & 64) == 64, betamaxDownloadSession.q);
                this.r = hVar.n((this.a & 128) == 128, this.r, (betamaxDownloadSession.a & 128) == 128, betamaxDownloadSession.r);
                boolean z2 = (this.a & 256) == 256;
                String str = this.s;
                if ((betamaxDownloadSession.a & 256) != 256) {
                    z = false;
                }
                this.s = hVar.n(z2, str, z, betamaxDownloadSession.s);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= betamaxDownloadSession.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                String z4 = gVar.z();
                                this.a |= 1;
                                this.b = z4;
                            } else if (B == 18) {
                                String z5 = gVar.z();
                                this.a |= 2;
                                this.c = z5;
                            } else if (B == 26) {
                                String z6 = gVar.z();
                                this.a |= 4;
                                this.f = z6;
                            } else if (B == 32) {
                                this.a |= 8;
                                this.n = gVar.w();
                            } else if (B == 40) {
                                this.a |= 16;
                                this.o = gVar.w();
                            } else if (B == 50) {
                                String z7 = gVar.z();
                                this.a |= 32;
                                this.p = z7;
                            } else if (B == 56) {
                                this.a |= 64;
                                this.q = gVar.w();
                            } else if (B == 66) {
                                String z8 = gVar.z();
                                this.a |= 128;
                                this.r = z8;
                            } else if (B == 74) {
                                String z9 = gVar.z();
                                this.a |= 256;
                                this.s = z9;
                            } else if (!parseUnknownField(B, gVar)) {
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
                return new BetamaxDownloadSession();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (u == null) {
                    synchronized (BetamaxDownloadSession.class) {
                        if (u == null) {
                            u = new GeneratedMessageLite.c(t);
                        }
                    }
                }
                return u;
            default:
                throw new UnsupportedOperationException();
        }
        return t;
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
            i2 += CodedOutputStream.l(4, this.n);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.l(5, this.o);
        }
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.p(6, this.p);
        }
        if ((this.a & 64) == 64) {
            i2 += CodedOutputStream.l(7, this.q);
        }
        if ((this.a & 128) == 128) {
            i2 += CodedOutputStream.p(8, this.r);
        }
        if ((this.a & 256) == 256) {
            i2 += CodedOutputStream.p(9, this.s);
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
            codedOutputStream.U(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.U(5, this.o);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.P(6, this.p);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.U(7, this.q);
        }
        if ((this.a & 128) == 128) {
            codedOutputStream.P(8, this.r);
        }
        if ((this.a & 256) == 256) {
            codedOutputStream.P(9, this.s);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
