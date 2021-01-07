package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class BetamaxPlaybackErrorDevice extends GeneratedMessageLite<BetamaxPlaybackErrorDevice, b> implements Object {
    private static final BetamaxPlaybackErrorDevice t;
    private static volatile x<BetamaxPlaybackErrorDevice> u;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private String n = "";
    private int o;
    private String p = "";
    private String q = "";
    private String r = "";
    private String s = "";

    public static final class b extends GeneratedMessageLite.b<BetamaxPlaybackErrorDevice, b> implements Object {
        public b m(int i) {
            copyOnWrite();
            BetamaxPlaybackErrorDevice.l((BetamaxPlaybackErrorDevice) this.instance, i);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            BetamaxPlaybackErrorDevice.m((BetamaxPlaybackErrorDevice) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            BetamaxPlaybackErrorDevice.i((BetamaxPlaybackErrorDevice) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            BetamaxPlaybackErrorDevice.n((BetamaxPlaybackErrorDevice) this.instance, str);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            BetamaxPlaybackErrorDevice.o((BetamaxPlaybackErrorDevice) this.instance, str);
            return this;
        }

        public b r(String str) {
            copyOnWrite();
            BetamaxPlaybackErrorDevice.h((BetamaxPlaybackErrorDevice) this.instance, str);
            return this;
        }

        public b s(String str) {
            copyOnWrite();
            BetamaxPlaybackErrorDevice.p((BetamaxPlaybackErrorDevice) this.instance, str);
            return this;
        }

        public b t(String str) {
            copyOnWrite();
            BetamaxPlaybackErrorDevice.q((BetamaxPlaybackErrorDevice) this.instance, str);
            return this;
        }

        private b() {
            super(BetamaxPlaybackErrorDevice.t);
        }
    }

    static {
        BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice = new BetamaxPlaybackErrorDevice();
        t = betamaxPlaybackErrorDevice;
        betamaxPlaybackErrorDevice.makeImmutable();
    }

    private BetamaxPlaybackErrorDevice() {
    }

    static void h(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, String str) {
        betamaxPlaybackErrorDevice.getClass();
        str.getClass();
        betamaxPlaybackErrorDevice.a |= 1;
        betamaxPlaybackErrorDevice.b = str;
    }

    static void i(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, String str) {
        betamaxPlaybackErrorDevice.getClass();
        str.getClass();
        betamaxPlaybackErrorDevice.a |= 8;
        betamaxPlaybackErrorDevice.n = str;
    }

    static void l(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, int i) {
        betamaxPlaybackErrorDevice.a |= 16;
        betamaxPlaybackErrorDevice.o = i;
    }

    static void m(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, String str) {
        betamaxPlaybackErrorDevice.getClass();
        str.getClass();
        betamaxPlaybackErrorDevice.a |= 32;
        betamaxPlaybackErrorDevice.p = str;
    }

    static void n(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, String str) {
        betamaxPlaybackErrorDevice.getClass();
        str.getClass();
        betamaxPlaybackErrorDevice.a |= 64;
        betamaxPlaybackErrorDevice.q = str;
    }

    static void o(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, String str) {
        betamaxPlaybackErrorDevice.getClass();
        str.getClass();
        betamaxPlaybackErrorDevice.a |= 128;
        betamaxPlaybackErrorDevice.r = str;
    }

    static void p(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, String str) {
        betamaxPlaybackErrorDevice.getClass();
        str.getClass();
        betamaxPlaybackErrorDevice.a |= 2;
        betamaxPlaybackErrorDevice.c = str;
    }

    public static x<BetamaxPlaybackErrorDevice> parser() {
        return t.getParserForType();
    }

    static void q(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, String str) {
        betamaxPlaybackErrorDevice.getClass();
        str.getClass();
        betamaxPlaybackErrorDevice.a |= 4;
        betamaxPlaybackErrorDevice.f = str;
    }

    public static b r() {
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
                BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice = (BetamaxPlaybackErrorDevice) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (betamaxPlaybackErrorDevice.a & 1) == 1, betamaxPlaybackErrorDevice.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (betamaxPlaybackErrorDevice.a & 2) == 2, betamaxPlaybackErrorDevice.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (betamaxPlaybackErrorDevice.a & 4) == 4, betamaxPlaybackErrorDevice.f);
                this.n = hVar.n((this.a & 8) == 8, this.n, (betamaxPlaybackErrorDevice.a & 8) == 8, betamaxPlaybackErrorDevice.n);
                this.o = hVar.m((this.a & 16) == 16, this.o, (betamaxPlaybackErrorDevice.a & 16) == 16, betamaxPlaybackErrorDevice.o);
                this.p = hVar.n((this.a & 32) == 32, this.p, (betamaxPlaybackErrorDevice.a & 32) == 32, betamaxPlaybackErrorDevice.p);
                this.q = hVar.n((this.a & 64) == 64, this.q, (betamaxPlaybackErrorDevice.a & 64) == 64, betamaxPlaybackErrorDevice.q);
                this.r = hVar.n((this.a & 128) == 128, this.r, (betamaxPlaybackErrorDevice.a & 128) == 128, betamaxPlaybackErrorDevice.r);
                boolean z2 = (this.a & 256) == 256;
                String str = this.s;
                if ((betamaxPlaybackErrorDevice.a & 256) != 256) {
                    z = false;
                }
                this.s = hVar.n(z2, str, z, betamaxPlaybackErrorDevice.s);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= betamaxPlaybackErrorDevice.a;
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
                            } else if (B == 40) {
                                this.a |= 16;
                                this.o = gVar.u();
                            } else if (B == 50) {
                                String z8 = gVar.z();
                                this.a |= 32;
                                this.p = z8;
                            } else if (B == 58) {
                                String z9 = gVar.z();
                                this.a |= 64;
                                this.q = z9;
                            } else if (B == 66) {
                                String z10 = gVar.z();
                                this.a |= 128;
                                this.r = z10;
                            } else if (B == 74) {
                                String z11 = gVar.z();
                                this.a |= 256;
                                this.s = z11;
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
                return new BetamaxPlaybackErrorDevice();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (u == null) {
                    synchronized (BetamaxPlaybackErrorDevice.class) {
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
        if ((this.a & 256) == 256) {
            codedOutputStream.P(9, this.s);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
