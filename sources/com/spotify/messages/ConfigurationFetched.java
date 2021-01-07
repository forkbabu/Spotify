package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class ConfigurationFetched extends GeneratedMessageLite<ConfigurationFetched, b> implements Object {
    private static volatile x<ConfigurationFetched> A;
    private static final ConfigurationFetched z;
    private int a;
    private long b;
    private String c = "";
    private String f = "";
    private String n = "";
    private String o = "";
    private String p = "";
    private String q = "";
    private String r = "";
    private String s = "";
    private String t = "";
    private long u;
    private long v;
    private int w;
    private String x = "";
    private String y = "";

    public static final class b extends GeneratedMessageLite.b<ConfigurationFetched, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            ConfigurationFetched.v((ConfigurationFetched) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            ConfigurationFetched.u((ConfigurationFetched) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            ConfigurationFetched.t((ConfigurationFetched) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            ConfigurationFetched.o((ConfigurationFetched) this.instance, str);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            ConfigurationFetched.p((ConfigurationFetched) this.instance, str);
            return this;
        }

        public b r(long j) {
            copyOnWrite();
            ConfigurationFetched.h((ConfigurationFetched) this.instance, j);
            return this;
        }

        public b s(long j) {
            copyOnWrite();
            ConfigurationFetched.q((ConfigurationFetched) this.instance, j);
            return this;
        }

        public b t(long j) {
            copyOnWrite();
            ConfigurationFetched.r((ConfigurationFetched) this.instance, j);
            return this;
        }

        public b u(String str) {
            copyOnWrite();
            ConfigurationFetched.n((ConfigurationFetched) this.instance, str);
            return this;
        }

        public b v(String str) {
            copyOnWrite();
            ConfigurationFetched.w((ConfigurationFetched) this.instance, str);
            return this;
        }

        public b w(String str) {
            copyOnWrite();
            ConfigurationFetched.i((ConfigurationFetched) this.instance, str);
            return this;
        }

        public b x(String str) {
            copyOnWrite();
            ConfigurationFetched.l((ConfigurationFetched) this.instance, str);
            return this;
        }

        public b y(String str) {
            copyOnWrite();
            ConfigurationFetched.m((ConfigurationFetched) this.instance, str);
            return this;
        }

        public b z(int i) {
            copyOnWrite();
            ConfigurationFetched.s((ConfigurationFetched) this.instance, i);
            return this;
        }

        private b() {
            super(ConfigurationFetched.z);
        }
    }

    static {
        ConfigurationFetched configurationFetched = new ConfigurationFetched();
        z = configurationFetched;
        configurationFetched.makeImmutable();
    }

    private ConfigurationFetched() {
    }

    static void h(ConfigurationFetched configurationFetched, long j) {
        configurationFetched.a |= 1;
        configurationFetched.b = j;
    }

    static void i(ConfigurationFetched configurationFetched, String str) {
        configurationFetched.getClass();
        str.getClass();
        configurationFetched.a |= 32;
        configurationFetched.p = str;
    }

    static void l(ConfigurationFetched configurationFetched, String str) {
        configurationFetched.getClass();
        str.getClass();
        configurationFetched.a |= 64;
        configurationFetched.q = str;
    }

    static void m(ConfigurationFetched configurationFetched, String str) {
        configurationFetched.getClass();
        str.getClass();
        configurationFetched.a |= 128;
        configurationFetched.r = str;
    }

    static void n(ConfigurationFetched configurationFetched, String str) {
        configurationFetched.getClass();
        str.getClass();
        configurationFetched.a |= 256;
        configurationFetched.s = str;
    }

    static void o(ConfigurationFetched configurationFetched, String str) {
        configurationFetched.getClass();
        str.getClass();
        configurationFetched.a |= 512;
        configurationFetched.t = str;
    }

    static void p(ConfigurationFetched configurationFetched, String str) {
        configurationFetched.getClass();
        str.getClass();
        configurationFetched.a |= 2;
        configurationFetched.c = str;
    }

    public static x<ConfigurationFetched> parser() {
        return z.getParserForType();
    }

    static void q(ConfigurationFetched configurationFetched, long j) {
        configurationFetched.a |= 1024;
        configurationFetched.u = j;
    }

    static void r(ConfigurationFetched configurationFetched, long j) {
        configurationFetched.a |= 2048;
        configurationFetched.v = j;
    }

    static void s(ConfigurationFetched configurationFetched, int i) {
        configurationFetched.a |= 4096;
        configurationFetched.w = i;
    }

    static void t(ConfigurationFetched configurationFetched, String str) {
        configurationFetched.getClass();
        str.getClass();
        configurationFetched.a |= 8192;
        configurationFetched.x = str;
    }

    static void u(ConfigurationFetched configurationFetched, String str) {
        configurationFetched.getClass();
        str.getClass();
        configurationFetched.a |= 16384;
        configurationFetched.y = str;
    }

    static void v(ConfigurationFetched configurationFetched, String str) {
        configurationFetched.getClass();
        str.getClass();
        configurationFetched.a |= 4;
        configurationFetched.f = str;
    }

    static void w(ConfigurationFetched configurationFetched, String str) {
        configurationFetched.getClass();
        str.getClass();
        configurationFetched.a |= 8;
        configurationFetched.n = str;
    }

    public static b x() {
        return (b) z.toBuilder();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return z;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ConfigurationFetched configurationFetched = (ConfigurationFetched) obj2;
                this.b = hVar.s((this.a & 1) == 1, this.b, (configurationFetched.a & 1) == 1, configurationFetched.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (configurationFetched.a & 2) == 2, configurationFetched.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (configurationFetched.a & 4) == 4, configurationFetched.f);
                this.n = hVar.n((this.a & 8) == 8, this.n, (configurationFetched.a & 8) == 8, configurationFetched.n);
                this.o = hVar.n((this.a & 16) == 16, this.o, (configurationFetched.a & 16) == 16, configurationFetched.o);
                this.p = hVar.n((this.a & 32) == 32, this.p, (configurationFetched.a & 32) == 32, configurationFetched.p);
                this.q = hVar.n((this.a & 64) == 64, this.q, (configurationFetched.a & 64) == 64, configurationFetched.q);
                this.r = hVar.n((this.a & 128) == 128, this.r, (configurationFetched.a & 128) == 128, configurationFetched.r);
                this.s = hVar.n((this.a & 256) == 256, this.s, (configurationFetched.a & 256) == 256, configurationFetched.s);
                this.t = hVar.n((this.a & 512) == 512, this.t, (configurationFetched.a & 512) == 512, configurationFetched.t);
                this.u = hVar.s((this.a & 1024) == 1024, this.u, (configurationFetched.a & 1024) == 1024, configurationFetched.u);
                this.v = hVar.s((this.a & 2048) == 2048, this.v, (configurationFetched.a & 2048) == 2048, configurationFetched.v);
                this.w = hVar.m((this.a & 4096) == 4096, this.w, (configurationFetched.a & 4096) == 4096, configurationFetched.w);
                this.x = hVar.n((this.a & 8192) == 8192, this.x, (configurationFetched.a & 8192) == 8192, configurationFetched.x);
                this.y = hVar.n((this.a & 16384) == 16384, this.y, (configurationFetched.a & 16384) == 16384, configurationFetched.y);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= configurationFetched.a;
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
                            case 8:
                                this.a |= 1;
                                this.b = gVar.w();
                                continue;
                            case 18:
                                String z3 = gVar.z();
                                this.a |= 2;
                                this.c = z3;
                                continue;
                            case 26:
                                String z4 = gVar.z();
                                this.a |= 4;
                                this.f = z4;
                                continue;
                            case 34:
                                String z5 = gVar.z();
                                this.a |= 8;
                                this.n = z5;
                                continue;
                            case 42:
                                String z6 = gVar.z();
                                this.a |= 16;
                                this.o = z6;
                                continue;
                            case 50:
                                String z7 = gVar.z();
                                this.a |= 32;
                                this.p = z7;
                                continue;
                            case 58:
                                String z8 = gVar.z();
                                this.a |= 64;
                                this.q = z8;
                                continue;
                            case 66:
                                String z9 = gVar.z();
                                this.a |= 128;
                                this.r = z9;
                                continue;
                            case 74:
                                String z10 = gVar.z();
                                this.a |= 256;
                                this.s = z10;
                                continue;
                            case 82:
                                String z11 = gVar.z();
                                this.a |= 512;
                                this.t = z11;
                                continue;
                            case 88:
                                this.a |= 1024;
                                this.u = gVar.w();
                                continue;
                            case 96:
                                this.a |= 2048;
                                this.v = gVar.w();
                                continue;
                            case 104:
                                this.a |= 4096;
                                this.w = gVar.u();
                                continue;
                            case 114:
                                String z12 = gVar.z();
                                this.a |= 8192;
                                this.x = z12;
                                continue;
                            case 122:
                                String z13 = gVar.z();
                                this.a |= 16384;
                                this.y = z13;
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
                return new ConfigurationFetched();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (A == null) {
                    synchronized (ConfigurationFetched.class) {
                        if (A == null) {
                            A = new GeneratedMessageLite.c(z);
                        }
                    }
                }
                return A;
            default:
                throw new UnsupportedOperationException();
        }
        return z;
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
            i2 += CodedOutputStream.l(11, this.u);
        }
        if ((this.a & 2048) == 2048) {
            i2 += CodedOutputStream.l(12, this.v);
        }
        if ((this.a & 4096) == 4096) {
            i2 += CodedOutputStream.j(13, this.w);
        }
        if ((this.a & 8192) == 8192) {
            i2 += CodedOutputStream.p(14, this.x);
        }
        if ((this.a & 16384) == 16384) {
            i2 += CodedOutputStream.p(15, this.y);
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
            codedOutputStream.U(11, this.u);
        }
        if ((this.a & 2048) == 2048) {
            codedOutputStream.U(12, this.v);
        }
        if ((this.a & 4096) == 4096) {
            codedOutputStream.K(13, this.w);
        }
        if ((this.a & 8192) == 8192) {
            codedOutputStream.P(14, this.x);
        }
        if ((this.a & 16384) == 16384) {
            codedOutputStream.P(15, this.y);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
