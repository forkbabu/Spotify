package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class Share extends GeneratedMessageLite<Share, b> implements Object {
    private static final Share t;
    private static volatile x<Share> u;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private String n = "";
    private String o = "";
    private String p = "";
    private String q = "";
    private String r = "";
    private String s = "";

    public static final class b extends GeneratedMessageLite.b<Share, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            Share.o((Share) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            Share.m((Share) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            Share.q((Share) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            Share.h((Share) this.instance, str);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            Share.p((Share) this.instance, str);
            return this;
        }

        public b r(String str) {
            copyOnWrite();
            Share.r((Share) this.instance, str);
            return this;
        }

        public b s(String str) {
            copyOnWrite();
            Share.l((Share) this.instance, str);
            return this;
        }

        public b t(String str) {
            copyOnWrite();
            Share.i((Share) this.instance, str);
            return this;
        }

        public b u(String str) {
            copyOnWrite();
            Share.n((Share) this.instance, str);
            return this;
        }

        private b() {
            super(Share.t);
        }
    }

    static {
        Share share = new Share();
        t = share;
        share.makeImmutable();
    }

    private Share() {
    }

    static void h(Share share, String str) {
        share.getClass();
        str.getClass();
        share.a |= 1;
        share.b = str;
    }

    static void i(Share share, String str) {
        share.getClass();
        str.getClass();
        share.a |= 8;
        share.n = str;
    }

    static void l(Share share, String str) {
        share.getClass();
        str.getClass();
        share.a |= 16;
        share.o = str;
    }

    static void m(Share share, String str) {
        share.getClass();
        str.getClass();
        share.a |= 32;
        share.p = str;
    }

    static void n(Share share, String str) {
        share.getClass();
        str.getClass();
        share.a |= 64;
        share.q = str;
    }

    static void o(Share share, String str) {
        share.getClass();
        str.getClass();
        share.a |= 128;
        share.r = str;
    }

    static void p(Share share, String str) {
        share.getClass();
        str.getClass();
        share.a |= 256;
        share.s = str;
    }

    public static x<Share> parser() {
        return t.getParserForType();
    }

    static void q(Share share, String str) {
        share.getClass();
        str.getClass();
        share.a |= 2;
        share.c = str;
    }

    static void r(Share share, String str) {
        share.getClass();
        str.getClass();
        share.a |= 4;
        share.f = str;
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
                Share share = (Share) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (share.a & 1) == 1, share.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (share.a & 2) == 2, share.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (share.a & 4) == 4, share.f);
                this.n = hVar.n((this.a & 8) == 8, this.n, (share.a & 8) == 8, share.n);
                this.o = hVar.n((this.a & 16) == 16, this.o, (share.a & 16) == 16, share.o);
                this.p = hVar.n((this.a & 32) == 32, this.p, (share.a & 32) == 32, share.p);
                this.q = hVar.n((this.a & 64) == 64, this.q, (share.a & 64) == 64, share.q);
                this.r = hVar.n((this.a & 128) == 128, this.r, (share.a & 128) == 128, share.r);
                boolean z2 = (this.a & 256) == 256;
                String str = this.s;
                if ((share.a & 256) != 256) {
                    z = false;
                }
                this.s = hVar.n(z2, str, z, share.s);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= share.a;
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
                            } else if (B == 34) {
                                String z7 = gVar.z();
                                this.a |= 8;
                                this.n = z7;
                            } else if (B == 42) {
                                String z8 = gVar.z();
                                this.a |= 16;
                                this.o = z8;
                            } else if (B == 50) {
                                String z9 = gVar.z();
                                this.a |= 32;
                                this.p = z9;
                            } else if (B == 58) {
                                String z10 = gVar.z();
                                this.a |= 64;
                                this.q = z10;
                            } else if (B == 66) {
                                String z11 = gVar.z();
                                this.a |= 128;
                                this.r = z11;
                            } else if (B == 74) {
                                String z12 = gVar.z();
                                this.a |= 256;
                                this.s = z12;
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
                return new Share();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (u == null) {
                    synchronized (Share.class) {
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
            i2 += CodedOutputStream.p(4, this.n);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.p(5, this.o);
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
            codedOutputStream.P(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.P(5, this.o);
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
        if ((this.a & 256) == 256) {
            codedOutputStream.P(9, this.s);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
