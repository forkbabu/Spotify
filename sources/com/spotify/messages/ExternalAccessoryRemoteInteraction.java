package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class ExternalAccessoryRemoteInteraction extends GeneratedMessageLite<ExternalAccessoryRemoteInteraction, b> implements Object {
    private static final ExternalAccessoryRemoteInteraction y;
    private static volatile x<ExternalAccessoryRemoteInteraction> z;
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
    private String t = "";
    private String u = "";
    private String v = "";
    private String w = "";
    private String x = "";

    public static final class b extends GeneratedMessageLite.b<ExternalAccessoryRemoteInteraction, b> implements Object {
        public b A(String str) {
            copyOnWrite();
            ExternalAccessoryRemoteInteraction.l((ExternalAccessoryRemoteInteraction) this.instance, str);
            return this;
        }

        public b B(String str) {
            copyOnWrite();
            ExternalAccessoryRemoteInteraction.q((ExternalAccessoryRemoteInteraction) this.instance, str);
            return this;
        }

        public String m() {
            return ((ExternalAccessoryRemoteInteraction) this.instance).x();
        }

        public boolean n() {
            return ((ExternalAccessoryRemoteInteraction) this.instance).y();
        }

        public b o(String str) {
            copyOnWrite();
            ExternalAccessoryRemoteInteraction.n((ExternalAccessoryRemoteInteraction) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            ExternalAccessoryRemoteInteraction.m((ExternalAccessoryRemoteInteraction) this.instance, str);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            ExternalAccessoryRemoteInteraction.h((ExternalAccessoryRemoteInteraction) this.instance, str);
            return this;
        }

        public b r(String str) {
            copyOnWrite();
            ExternalAccessoryRemoteInteraction.v((ExternalAccessoryRemoteInteraction) this.instance, str);
            return this;
        }

        public b s(String str) {
            copyOnWrite();
            ExternalAccessoryRemoteInteraction.o((ExternalAccessoryRemoteInteraction) this.instance, str);
            return this;
        }

        public b t(String str) {
            copyOnWrite();
            ExternalAccessoryRemoteInteraction.r((ExternalAccessoryRemoteInteraction) this.instance, str);
            return this;
        }

        public b u(String str) {
            copyOnWrite();
            ExternalAccessoryRemoteInteraction.w((ExternalAccessoryRemoteInteraction) this.instance, str);
            return this;
        }

        public b v(String str) {
            copyOnWrite();
            ExternalAccessoryRemoteInteraction.u((ExternalAccessoryRemoteInteraction) this.instance, str);
            return this;
        }

        public b w(String str) {
            copyOnWrite();
            ExternalAccessoryRemoteInteraction.p((ExternalAccessoryRemoteInteraction) this.instance, str);
            return this;
        }

        public b x(String str) {
            copyOnWrite();
            ExternalAccessoryRemoteInteraction.i((ExternalAccessoryRemoteInteraction) this.instance, str);
            return this;
        }

        public b y(String str) {
            copyOnWrite();
            ExternalAccessoryRemoteInteraction.t((ExternalAccessoryRemoteInteraction) this.instance, str);
            return this;
        }

        public b z(String str) {
            copyOnWrite();
            ExternalAccessoryRemoteInteraction.s((ExternalAccessoryRemoteInteraction) this.instance, str);
            return this;
        }

        private b() {
            super(ExternalAccessoryRemoteInteraction.y);
        }
    }

    static {
        ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction = new ExternalAccessoryRemoteInteraction();
        y = externalAccessoryRemoteInteraction;
        externalAccessoryRemoteInteraction.makeImmutable();
    }

    private ExternalAccessoryRemoteInteraction() {
    }

    static void h(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.a |= 1;
        externalAccessoryRemoteInteraction.b = str;
    }

    static void i(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.a |= 8;
        externalAccessoryRemoteInteraction.n = str;
    }

    static void l(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.a |= 16;
        externalAccessoryRemoteInteraction.o = str;
    }

    static void m(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.a |= 32;
        externalAccessoryRemoteInteraction.p = str;
    }

    static void n(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.a |= 64;
        externalAccessoryRemoteInteraction.q = str;
    }

    static void o(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.a |= 128;
        externalAccessoryRemoteInteraction.r = str;
    }

    static void p(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.a |= 256;
        externalAccessoryRemoteInteraction.s = str;
    }

    public static x<ExternalAccessoryRemoteInteraction> parser() {
        return y.getParserForType();
    }

    static void q(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.a |= 512;
        externalAccessoryRemoteInteraction.t = str;
    }

    static void r(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.a |= 1024;
        externalAccessoryRemoteInteraction.u = str;
    }

    static void s(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.a |= 2048;
        externalAccessoryRemoteInteraction.v = str;
    }

    static void t(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.a |= 4096;
        externalAccessoryRemoteInteraction.w = str;
    }

    static void u(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.a |= 2;
        externalAccessoryRemoteInteraction.c = str;
    }

    static void v(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.a |= 8192;
        externalAccessoryRemoteInteraction.x = str;
    }

    static void w(ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction, String str) {
        externalAccessoryRemoteInteraction.getClass();
        str.getClass();
        externalAccessoryRemoteInteraction.a |= 4;
        externalAccessoryRemoteInteraction.f = str;
    }

    public static b z() {
        return (b) y.toBuilder();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return y;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ExternalAccessoryRemoteInteraction externalAccessoryRemoteInteraction = (ExternalAccessoryRemoteInteraction) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (externalAccessoryRemoteInteraction.a & 1) == 1, externalAccessoryRemoteInteraction.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (externalAccessoryRemoteInteraction.a & 2) == 2, externalAccessoryRemoteInteraction.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (externalAccessoryRemoteInteraction.a & 4) == 4, externalAccessoryRemoteInteraction.f);
                this.n = hVar.n((this.a & 8) == 8, this.n, (externalAccessoryRemoteInteraction.a & 8) == 8, externalAccessoryRemoteInteraction.n);
                this.o = hVar.n((this.a & 16) == 16, this.o, (externalAccessoryRemoteInteraction.a & 16) == 16, externalAccessoryRemoteInteraction.o);
                this.p = hVar.n((this.a & 32) == 32, this.p, (externalAccessoryRemoteInteraction.a & 32) == 32, externalAccessoryRemoteInteraction.p);
                this.q = hVar.n(y(), this.q, externalAccessoryRemoteInteraction.y(), externalAccessoryRemoteInteraction.q);
                this.r = hVar.n((this.a & 128) == 128, this.r, (externalAccessoryRemoteInteraction.a & 128) == 128, externalAccessoryRemoteInteraction.r);
                this.s = hVar.n((this.a & 256) == 256, this.s, (externalAccessoryRemoteInteraction.a & 256) == 256, externalAccessoryRemoteInteraction.s);
                this.t = hVar.n((this.a & 512) == 512, this.t, (externalAccessoryRemoteInteraction.a & 512) == 512, externalAccessoryRemoteInteraction.t);
                this.u = hVar.n((this.a & 1024) == 1024, this.u, (externalAccessoryRemoteInteraction.a & 1024) == 1024, externalAccessoryRemoteInteraction.u);
                this.v = hVar.n((this.a & 2048) == 2048, this.v, (externalAccessoryRemoteInteraction.a & 2048) == 2048, externalAccessoryRemoteInteraction.v);
                this.w = hVar.n((this.a & 4096) == 4096, this.w, (externalAccessoryRemoteInteraction.a & 4096) == 4096, externalAccessoryRemoteInteraction.w);
                this.x = hVar.n((this.a & 8192) == 8192, this.x, (externalAccessoryRemoteInteraction.a & 8192) == 8192, externalAccessoryRemoteInteraction.x);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= externalAccessoryRemoteInteraction.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z2 = false;
                while (!z2) {
                    try {
                        int B = gVar.B();
                        switch (B) {
                            case 0:
                                break;
                            case 10:
                                String z3 = gVar.z();
                                this.a |= 1;
                                this.b = z3;
                                continue;
                            case 18:
                                String z4 = gVar.z();
                                this.a |= 2;
                                this.c = z4;
                                continue;
                            case 26:
                                String z5 = gVar.z();
                                this.a |= 4;
                                this.f = z5;
                                continue;
                            case 34:
                                String z6 = gVar.z();
                                this.a |= 8;
                                this.n = z6;
                                continue;
                            case 42:
                                String z7 = gVar.z();
                                this.a |= 16;
                                this.o = z7;
                                continue;
                            case 50:
                                String z8 = gVar.z();
                                this.a |= 32;
                                this.p = z8;
                                continue;
                            case 58:
                                String z9 = gVar.z();
                                this.a |= 64;
                                this.q = z9;
                                continue;
                            case 66:
                                String z10 = gVar.z();
                                this.a |= 128;
                                this.r = z10;
                                continue;
                            case 74:
                                String z11 = gVar.z();
                                this.a |= 256;
                                this.s = z11;
                                continue;
                            case 82:
                                String z12 = gVar.z();
                                this.a |= 512;
                                this.t = z12;
                                continue;
                            case 90:
                                String z13 = gVar.z();
                                this.a |= 1024;
                                this.u = z13;
                                continue;
                            case 98:
                                String z14 = gVar.z();
                                this.a |= 2048;
                                this.v = z14;
                                continue;
                            case 106:
                                String z15 = gVar.z();
                                this.a |= 4096;
                                this.w = z15;
                                continue;
                            case 114:
                                String z16 = gVar.z();
                                this.a |= 8192;
                                this.x = z16;
                                continue;
                            default:
                                if (parseUnknownField(B, gVar)) {
                                    continue;
                                }
                                break;
                        }
                        z2 = true;
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
                return new ExternalAccessoryRemoteInteraction();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (z == null) {
                    synchronized (ExternalAccessoryRemoteInteraction.class) {
                        if (z == null) {
                            z = new GeneratedMessageLite.c(y);
                        }
                    }
                }
                return z;
            default:
                throw new UnsupportedOperationException();
        }
        return y;
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
        if ((this.a & 512) == 512) {
            i2 += CodedOutputStream.p(10, this.t);
        }
        if ((this.a & 1024) == 1024) {
            i2 += CodedOutputStream.p(11, this.u);
        }
        if ((this.a & 2048) == 2048) {
            i2 += CodedOutputStream.p(12, this.v);
        }
        if ((this.a & 4096) == 4096) {
            i2 += CodedOutputStream.p(13, this.w);
        }
        if ((this.a & 8192) == 8192) {
            i2 += CodedOutputStream.p(14, this.x);
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
        if ((this.a & 512) == 512) {
            codedOutputStream.P(10, this.t);
        }
        if ((this.a & 1024) == 1024) {
            codedOutputStream.P(11, this.u);
        }
        if ((this.a & 2048) == 2048) {
            codedOutputStream.P(12, this.v);
        }
        if ((this.a & 4096) == 4096) {
            codedOutputStream.P(13, this.w);
        }
        if ((this.a & 8192) == 8192) {
            codedOutputStream.P(14, this.x);
        }
        this.unknownFields.l(codedOutputStream);
    }

    public String x() {
        return this.v;
    }

    public boolean y() {
        return (this.a & 64) == 64;
    }
}
