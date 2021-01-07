package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class UbiExpr5ImpressionNonAuth extends GeneratedMessageLite<UbiExpr5ImpressionNonAuth, b> implements Object {
    private static final UbiExpr5ImpressionNonAuth G;
    private static volatile x<UbiExpr5ImpressionNonAuth> H;
    private o.i<String> A = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> B = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> C = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> D = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> E = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> F = GeneratedMessageLite.emptyProtobufList();
    private int a;
    private String b = "";
    private String c = "";
    private o.i<String> f = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> n = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> o = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> p = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> q = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> r = GeneratedMessageLite.emptyProtobufList();
    private String s = "";
    private String t = "";
    private String u = "";
    private String v = "";
    private String w = "";
    private String x = "";
    private String y = "";
    private o.i<String> z = GeneratedMessageLite.emptyProtobufList();

    public static final class b extends GeneratedMessageLite.b<UbiExpr5ImpressionNonAuth, b> implements Object {
        public b A(String str) {
            copyOnWrite();
            UbiExpr5ImpressionNonAuth.v((UbiExpr5ImpressionNonAuth) this.instance, str);
            return this;
        }

        public b B(String str) {
            copyOnWrite();
            UbiExpr5ImpressionNonAuth.q((UbiExpr5ImpressionNonAuth) this.instance, str);
            return this;
        }

        public b C(String str) {
            copyOnWrite();
            UbiExpr5ImpressionNonAuth.h((UbiExpr5ImpressionNonAuth) this.instance, str);
            return this;
        }

        public b D(String str) {
            copyOnWrite();
            UbiExpr5ImpressionNonAuth.p((UbiExpr5ImpressionNonAuth) this.instance, str);
            return this;
        }

        public b E(String str) {
            copyOnWrite();
            UbiExpr5ImpressionNonAuth.r((UbiExpr5ImpressionNonAuth) this.instance, str);
            return this;
        }

        public b F(String str) {
            copyOnWrite();
            UbiExpr5ImpressionNonAuth.u((UbiExpr5ImpressionNonAuth) this.instance, str);
            return this;
        }

        public b G(String str) {
            copyOnWrite();
            UbiExpr5ImpressionNonAuth.t((UbiExpr5ImpressionNonAuth) this.instance, str);
            return this;
        }

        public b H(String str) {
            copyOnWrite();
            UbiExpr5ImpressionNonAuth.s((UbiExpr5ImpressionNonAuth) this.instance, str);
            return this;
        }

        public b m(Iterable<String> iterable) {
            copyOnWrite();
            UbiExpr5ImpressionNonAuth.o((UbiExpr5ImpressionNonAuth) this.instance, iterable);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            UbiExpr5ImpressionNonAuth.l((UbiExpr5ImpressionNonAuth) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            UbiExpr5ImpressionNonAuth.C((UbiExpr5ImpressionNonAuth) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            UbiExpr5ImpressionNonAuth.i((UbiExpr5ImpressionNonAuth) this.instance, str);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            UbiExpr5ImpressionNonAuth.n((UbiExpr5ImpressionNonAuth) this.instance, str);
            return this;
        }

        public b r(String str) {
            copyOnWrite();
            UbiExpr5ImpressionNonAuth.m((UbiExpr5ImpressionNonAuth) this.instance, str);
            return this;
        }

        public b s(String str) {
            copyOnWrite();
            UbiExpr5ImpressionNonAuth.E((UbiExpr5ImpressionNonAuth) this.instance, str);
            return this;
        }

        public b t(String str) {
            copyOnWrite();
            UbiExpr5ImpressionNonAuth.z((UbiExpr5ImpressionNonAuth) this.instance, str);
            return this;
        }

        public b u(String str) {
            copyOnWrite();
            UbiExpr5ImpressionNonAuth.x((UbiExpr5ImpressionNonAuth) this.instance, str);
            return this;
        }

        public b v(String str) {
            copyOnWrite();
            UbiExpr5ImpressionNonAuth.y((UbiExpr5ImpressionNonAuth) this.instance, str);
            return this;
        }

        public b w(String str) {
            copyOnWrite();
            UbiExpr5ImpressionNonAuth.B((UbiExpr5ImpressionNonAuth) this.instance, str);
            return this;
        }

        public b x(String str) {
            copyOnWrite();
            UbiExpr5ImpressionNonAuth.A((UbiExpr5ImpressionNonAuth) this.instance, str);
            return this;
        }

        public b y(String str) {
            copyOnWrite();
            UbiExpr5ImpressionNonAuth.D((UbiExpr5ImpressionNonAuth) this.instance, str);
            return this;
        }

        public b z(String str) {
            copyOnWrite();
            UbiExpr5ImpressionNonAuth.w((UbiExpr5ImpressionNonAuth) this.instance, str);
            return this;
        }

        private b() {
            super(UbiExpr5ImpressionNonAuth.G);
        }
    }

    static {
        UbiExpr5ImpressionNonAuth ubiExpr5ImpressionNonAuth = new UbiExpr5ImpressionNonAuth();
        G = ubiExpr5ImpressionNonAuth;
        ubiExpr5ImpressionNonAuth.makeImmutable();
    }

    private UbiExpr5ImpressionNonAuth() {
    }

    static void A(UbiExpr5ImpressionNonAuth ubiExpr5ImpressionNonAuth, String str) {
        ubiExpr5ImpressionNonAuth.getClass();
        str.getClass();
        if (!ubiExpr5ImpressionNonAuth.C.R0()) {
            ubiExpr5ImpressionNonAuth.C = GeneratedMessageLite.mutableCopy(ubiExpr5ImpressionNonAuth.C);
        }
        ubiExpr5ImpressionNonAuth.C.add(str);
    }

    static void B(UbiExpr5ImpressionNonAuth ubiExpr5ImpressionNonAuth, String str) {
        ubiExpr5ImpressionNonAuth.getClass();
        str.getClass();
        if (!ubiExpr5ImpressionNonAuth.D.R0()) {
            ubiExpr5ImpressionNonAuth.D = GeneratedMessageLite.mutableCopy(ubiExpr5ImpressionNonAuth.D);
        }
        ubiExpr5ImpressionNonAuth.D.add(str);
    }

    static void C(UbiExpr5ImpressionNonAuth ubiExpr5ImpressionNonAuth, String str) {
        ubiExpr5ImpressionNonAuth.getClass();
        str.getClass();
        if (!ubiExpr5ImpressionNonAuth.f.R0()) {
            ubiExpr5ImpressionNonAuth.f = GeneratedMessageLite.mutableCopy(ubiExpr5ImpressionNonAuth.f);
        }
        ubiExpr5ImpressionNonAuth.f.add(str);
    }

    static void D(UbiExpr5ImpressionNonAuth ubiExpr5ImpressionNonAuth, String str) {
        ubiExpr5ImpressionNonAuth.getClass();
        str.getClass();
        if (!ubiExpr5ImpressionNonAuth.E.R0()) {
            ubiExpr5ImpressionNonAuth.E = GeneratedMessageLite.mutableCopy(ubiExpr5ImpressionNonAuth.E);
        }
        ubiExpr5ImpressionNonAuth.E.add(str);
    }

    static void E(UbiExpr5ImpressionNonAuth ubiExpr5ImpressionNonAuth, String str) {
        ubiExpr5ImpressionNonAuth.getClass();
        str.getClass();
        if (!ubiExpr5ImpressionNonAuth.F.R0()) {
            ubiExpr5ImpressionNonAuth.F = GeneratedMessageLite.mutableCopy(ubiExpr5ImpressionNonAuth.F);
        }
        ubiExpr5ImpressionNonAuth.F.add(str);
    }

    public static b F() {
        return (b) G.toBuilder();
    }

    static void h(UbiExpr5ImpressionNonAuth ubiExpr5ImpressionNonAuth, String str) {
        ubiExpr5ImpressionNonAuth.getClass();
        str.getClass();
        ubiExpr5ImpressionNonAuth.a |= 1;
        ubiExpr5ImpressionNonAuth.b = str;
    }

    static void i(UbiExpr5ImpressionNonAuth ubiExpr5ImpressionNonAuth, String str) {
        ubiExpr5ImpressionNonAuth.getClass();
        str.getClass();
        if (!ubiExpr5ImpressionNonAuth.n.R0()) {
            ubiExpr5ImpressionNonAuth.n = GeneratedMessageLite.mutableCopy(ubiExpr5ImpressionNonAuth.n);
        }
        ubiExpr5ImpressionNonAuth.n.add(str);
    }

    static void l(UbiExpr5ImpressionNonAuth ubiExpr5ImpressionNonAuth, String str) {
        ubiExpr5ImpressionNonAuth.getClass();
        str.getClass();
        if (!ubiExpr5ImpressionNonAuth.o.R0()) {
            ubiExpr5ImpressionNonAuth.o = GeneratedMessageLite.mutableCopy(ubiExpr5ImpressionNonAuth.o);
        }
        ubiExpr5ImpressionNonAuth.o.add(str);
    }

    static void m(UbiExpr5ImpressionNonAuth ubiExpr5ImpressionNonAuth, String str) {
        ubiExpr5ImpressionNonAuth.getClass();
        str.getClass();
        if (!ubiExpr5ImpressionNonAuth.p.R0()) {
            ubiExpr5ImpressionNonAuth.p = GeneratedMessageLite.mutableCopy(ubiExpr5ImpressionNonAuth.p);
        }
        ubiExpr5ImpressionNonAuth.p.add(str);
    }

    static void n(UbiExpr5ImpressionNonAuth ubiExpr5ImpressionNonAuth, String str) {
        ubiExpr5ImpressionNonAuth.getClass();
        str.getClass();
        if (!ubiExpr5ImpressionNonAuth.q.R0()) {
            ubiExpr5ImpressionNonAuth.q = GeneratedMessageLite.mutableCopy(ubiExpr5ImpressionNonAuth.q);
        }
        ubiExpr5ImpressionNonAuth.q.add(str);
    }

    static void o(UbiExpr5ImpressionNonAuth ubiExpr5ImpressionNonAuth, Iterable iterable) {
        if (!ubiExpr5ImpressionNonAuth.r.R0()) {
            ubiExpr5ImpressionNonAuth.r = GeneratedMessageLite.mutableCopy(ubiExpr5ImpressionNonAuth.r);
        }
        com.google.protobuf.a.addAll(iterable, ubiExpr5ImpressionNonAuth.r);
    }

    static void p(UbiExpr5ImpressionNonAuth ubiExpr5ImpressionNonAuth, String str) {
        ubiExpr5ImpressionNonAuth.getClass();
        str.getClass();
        ubiExpr5ImpressionNonAuth.a |= 4;
        ubiExpr5ImpressionNonAuth.s = str;
    }

    public static x<UbiExpr5ImpressionNonAuth> parser() {
        return G.getParserForType();
    }

    static void q(UbiExpr5ImpressionNonAuth ubiExpr5ImpressionNonAuth, String str) {
        ubiExpr5ImpressionNonAuth.getClass();
        str.getClass();
        ubiExpr5ImpressionNonAuth.a |= 2;
        ubiExpr5ImpressionNonAuth.c = str;
    }

    static void r(UbiExpr5ImpressionNonAuth ubiExpr5ImpressionNonAuth, String str) {
        ubiExpr5ImpressionNonAuth.getClass();
        str.getClass();
        ubiExpr5ImpressionNonAuth.a |= 8;
        ubiExpr5ImpressionNonAuth.t = str;
    }

    static void s(UbiExpr5ImpressionNonAuth ubiExpr5ImpressionNonAuth, String str) {
        ubiExpr5ImpressionNonAuth.getClass();
        str.getClass();
        ubiExpr5ImpressionNonAuth.a |= 16;
        ubiExpr5ImpressionNonAuth.u = str;
    }

    static void t(UbiExpr5ImpressionNonAuth ubiExpr5ImpressionNonAuth, String str) {
        ubiExpr5ImpressionNonAuth.getClass();
        str.getClass();
        ubiExpr5ImpressionNonAuth.a |= 32;
        ubiExpr5ImpressionNonAuth.v = str;
    }

    static void u(UbiExpr5ImpressionNonAuth ubiExpr5ImpressionNonAuth, String str) {
        ubiExpr5ImpressionNonAuth.getClass();
        str.getClass();
        ubiExpr5ImpressionNonAuth.a |= 64;
        ubiExpr5ImpressionNonAuth.w = str;
    }

    static void v(UbiExpr5ImpressionNonAuth ubiExpr5ImpressionNonAuth, String str) {
        ubiExpr5ImpressionNonAuth.getClass();
        str.getClass();
        ubiExpr5ImpressionNonAuth.a |= 128;
        ubiExpr5ImpressionNonAuth.x = str;
    }

    static void w(UbiExpr5ImpressionNonAuth ubiExpr5ImpressionNonAuth, String str) {
        ubiExpr5ImpressionNonAuth.getClass();
        str.getClass();
        ubiExpr5ImpressionNonAuth.a |= 256;
        ubiExpr5ImpressionNonAuth.y = str;
    }

    static void x(UbiExpr5ImpressionNonAuth ubiExpr5ImpressionNonAuth, String str) {
        ubiExpr5ImpressionNonAuth.getClass();
        str.getClass();
        if (!ubiExpr5ImpressionNonAuth.z.R0()) {
            ubiExpr5ImpressionNonAuth.z = GeneratedMessageLite.mutableCopy(ubiExpr5ImpressionNonAuth.z);
        }
        ubiExpr5ImpressionNonAuth.z.add(str);
    }

    static void y(UbiExpr5ImpressionNonAuth ubiExpr5ImpressionNonAuth, String str) {
        ubiExpr5ImpressionNonAuth.getClass();
        str.getClass();
        if (!ubiExpr5ImpressionNonAuth.A.R0()) {
            ubiExpr5ImpressionNonAuth.A = GeneratedMessageLite.mutableCopy(ubiExpr5ImpressionNonAuth.A);
        }
        ubiExpr5ImpressionNonAuth.A.add(str);
    }

    static void z(UbiExpr5ImpressionNonAuth ubiExpr5ImpressionNonAuth, String str) {
        ubiExpr5ImpressionNonAuth.getClass();
        str.getClass();
        if (!ubiExpr5ImpressionNonAuth.B.R0()) {
            ubiExpr5ImpressionNonAuth.B = GeneratedMessageLite.mutableCopy(ubiExpr5ImpressionNonAuth.B);
        }
        ubiExpr5ImpressionNonAuth.B.add(str);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z2 = true;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return G;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                UbiExpr5ImpressionNonAuth ubiExpr5ImpressionNonAuth = (UbiExpr5ImpressionNonAuth) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (ubiExpr5ImpressionNonAuth.a & 1) == 1, ubiExpr5ImpressionNonAuth.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (ubiExpr5ImpressionNonAuth.a & 2) == 2, ubiExpr5ImpressionNonAuth.c);
                this.f = hVar.q(this.f, ubiExpr5ImpressionNonAuth.f);
                this.n = hVar.q(this.n, ubiExpr5ImpressionNonAuth.n);
                this.o = hVar.q(this.o, ubiExpr5ImpressionNonAuth.o);
                this.p = hVar.q(this.p, ubiExpr5ImpressionNonAuth.p);
                this.q = hVar.q(this.q, ubiExpr5ImpressionNonAuth.q);
                this.r = hVar.q(this.r, ubiExpr5ImpressionNonAuth.r);
                this.s = hVar.n((this.a & 4) == 4, this.s, (ubiExpr5ImpressionNonAuth.a & 4) == 4, ubiExpr5ImpressionNonAuth.s);
                this.t = hVar.n((this.a & 8) == 8, this.t, (ubiExpr5ImpressionNonAuth.a & 8) == 8, ubiExpr5ImpressionNonAuth.t);
                this.u = hVar.n((this.a & 16) == 16, this.u, (ubiExpr5ImpressionNonAuth.a & 16) == 16, ubiExpr5ImpressionNonAuth.u);
                this.v = hVar.n((this.a & 32) == 32, this.v, (ubiExpr5ImpressionNonAuth.a & 32) == 32, ubiExpr5ImpressionNonAuth.v);
                this.w = hVar.n((this.a & 64) == 64, this.w, (ubiExpr5ImpressionNonAuth.a & 64) == 64, ubiExpr5ImpressionNonAuth.w);
                this.x = hVar.n((this.a & 128) == 128, this.x, (ubiExpr5ImpressionNonAuth.a & 128) == 128, ubiExpr5ImpressionNonAuth.x);
                boolean z3 = (this.a & 256) == 256;
                String str = this.y;
                if ((ubiExpr5ImpressionNonAuth.a & 256) != 256) {
                    z2 = false;
                }
                this.y = hVar.n(z3, str, z2, ubiExpr5ImpressionNonAuth.y);
                this.z = hVar.q(this.z, ubiExpr5ImpressionNonAuth.z);
                this.A = hVar.q(this.A, ubiExpr5ImpressionNonAuth.A);
                this.B = hVar.q(this.B, ubiExpr5ImpressionNonAuth.B);
                this.C = hVar.q(this.C, ubiExpr5ImpressionNonAuth.C);
                this.D = hVar.q(this.D, ubiExpr5ImpressionNonAuth.D);
                this.E = hVar.q(this.E, ubiExpr5ImpressionNonAuth.E);
                this.F = hVar.q(this.F, ubiExpr5ImpressionNonAuth.F);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= ubiExpr5ImpressionNonAuth.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z4 = false;
                while (!z4) {
                    try {
                        int B2 = gVar.B();
                        switch (B2) {
                            case 0:
                                break;
                            case 10:
                                String z5 = gVar.z();
                                this.a |= 1;
                                this.b = z5;
                                continue;
                            case 18:
                                String z6 = gVar.z();
                                this.a |= 2;
                                this.c = z6;
                                continue;
                            case 26:
                                String z7 = gVar.z();
                                if (!this.f.R0()) {
                                    this.f = GeneratedMessageLite.mutableCopy(this.f);
                                }
                                this.f.add(z7);
                                continue;
                            case 34:
                                String z8 = gVar.z();
                                if (!this.n.R0()) {
                                    this.n = GeneratedMessageLite.mutableCopy(this.n);
                                }
                                this.n.add(z8);
                                continue;
                            case 42:
                                String z9 = gVar.z();
                                if (!this.o.R0()) {
                                    this.o = GeneratedMessageLite.mutableCopy(this.o);
                                }
                                this.o.add(z9);
                                continue;
                            case 50:
                                String z10 = gVar.z();
                                if (!this.p.R0()) {
                                    this.p = GeneratedMessageLite.mutableCopy(this.p);
                                }
                                this.p.add(z10);
                                continue;
                            case 58:
                                String z11 = gVar.z();
                                if (!this.q.R0()) {
                                    this.q = GeneratedMessageLite.mutableCopy(this.q);
                                }
                                this.q.add(z11);
                                continue;
                            case 66:
                                String z12 = gVar.z();
                                if (!this.r.R0()) {
                                    this.r = GeneratedMessageLite.mutableCopy(this.r);
                                }
                                this.r.add(z12);
                                continue;
                            case 74:
                                String z13 = gVar.z();
                                this.a |= 4;
                                this.s = z13;
                                continue;
                            case 82:
                                String z14 = gVar.z();
                                this.a |= 8;
                                this.t = z14;
                                continue;
                            case 90:
                                String z15 = gVar.z();
                                this.a |= 16;
                                this.u = z15;
                                continue;
                            case 98:
                                String z16 = gVar.z();
                                this.a |= 32;
                                this.v = z16;
                                continue;
                            case 106:
                                String z17 = gVar.z();
                                this.a |= 64;
                                this.w = z17;
                                continue;
                            case 114:
                                String z18 = gVar.z();
                                this.a |= 128;
                                this.x = z18;
                                continue;
                            case 122:
                                String z19 = gVar.z();
                                this.a |= 256;
                                this.y = z19;
                                continue;
                            case 130:
                                String z20 = gVar.z();
                                if (!this.z.R0()) {
                                    this.z = GeneratedMessageLite.mutableCopy(this.z);
                                }
                                this.z.add(z20);
                                continue;
                            case 138:
                                String z21 = gVar.z();
                                if (!this.A.R0()) {
                                    this.A = GeneratedMessageLite.mutableCopy(this.A);
                                }
                                this.A.add(z21);
                                continue;
                            case 146:
                                String z22 = gVar.z();
                                if (!this.B.R0()) {
                                    this.B = GeneratedMessageLite.mutableCopy(this.B);
                                }
                                this.B.add(z22);
                                continue;
                            case 154:
                                String z23 = gVar.z();
                                if (!this.C.R0()) {
                                    this.C = GeneratedMessageLite.mutableCopy(this.C);
                                }
                                this.C.add(z23);
                                continue;
                            case 162:
                                String z24 = gVar.z();
                                if (!this.D.R0()) {
                                    this.D = GeneratedMessageLite.mutableCopy(this.D);
                                }
                                this.D.add(z24);
                                continue;
                            case 170:
                                String z25 = gVar.z();
                                if (!this.E.R0()) {
                                    this.E = GeneratedMessageLite.mutableCopy(this.E);
                                }
                                this.E.add(z25);
                                continue;
                            case 178:
                                String z26 = gVar.z();
                                if (!this.F.R0()) {
                                    this.F = GeneratedMessageLite.mutableCopy(this.F);
                                }
                                this.F.add(z26);
                                continue;
                            default:
                                if (parseUnknownField(B2, gVar)) {
                                    continue;
                                }
                                break;
                        }
                        z4 = true;
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
                this.f.C();
                this.n.C();
                this.o.C();
                this.p.C();
                this.q.C();
                this.r.C();
                this.z.C();
                this.A.C();
                this.B.C();
                this.C.C();
                this.D.C();
                this.E.C();
                this.F.C();
                return null;
            case 4:
                return new UbiExpr5ImpressionNonAuth();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (H == null) {
                    synchronized (UbiExpr5ImpressionNonAuth.class) {
                        if (H == null) {
                            H = new GeneratedMessageLite.c(G);
                        }
                    }
                }
                return H;
            default:
                throw new UnsupportedOperationException();
        }
        return G;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int p2 = (this.a & 1) == 1 ? CodedOutputStream.p(1, this.b) + 0 : 0;
        if ((this.a & 2) == 2) {
            p2 += CodedOutputStream.p(2, this.c);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            i2 += CodedOutputStream.q(this.f.get(i3));
        }
        int C0 = je.C0(this.f, 1, p2 + i2);
        int i4 = 0;
        for (int i5 = 0; i5 < this.n.size(); i5++) {
            i4 += CodedOutputStream.q(this.n.get(i5));
        }
        int C02 = je.C0(this.n, 1, C0 + i4);
        int i6 = 0;
        for (int i7 = 0; i7 < this.o.size(); i7++) {
            i6 += CodedOutputStream.q(this.o.get(i7));
        }
        int C03 = je.C0(this.o, 1, C02 + i6);
        int i8 = 0;
        for (int i9 = 0; i9 < this.p.size(); i9++) {
            i8 += CodedOutputStream.q(this.p.get(i9));
        }
        int C04 = je.C0(this.p, 1, C03 + i8);
        int i10 = 0;
        for (int i11 = 0; i11 < this.q.size(); i11++) {
            i10 += CodedOutputStream.q(this.q.get(i11));
        }
        int C05 = je.C0(this.q, 1, C04 + i10);
        int i12 = 0;
        for (int i13 = 0; i13 < this.r.size(); i13++) {
            i12 += CodedOutputStream.q(this.r.get(i13));
        }
        int C06 = je.C0(this.r, 1, C05 + i12);
        if ((this.a & 4) == 4) {
            C06 += CodedOutputStream.p(9, this.s);
        }
        if ((this.a & 8) == 8) {
            C06 += CodedOutputStream.p(10, this.t);
        }
        if ((this.a & 16) == 16) {
            C06 += CodedOutputStream.p(11, this.u);
        }
        if ((this.a & 32) == 32) {
            C06 += CodedOutputStream.p(12, this.v);
        }
        if ((this.a & 64) == 64) {
            C06 += CodedOutputStream.p(13, this.w);
        }
        if ((this.a & 128) == 128) {
            C06 += CodedOutputStream.p(14, this.x);
        }
        if ((this.a & 256) == 256) {
            C06 += CodedOutputStream.p(15, this.y);
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.z.size(); i15++) {
            i14 += CodedOutputStream.q(this.z.get(i15));
        }
        int C07 = je.C0(this.z, 2, C06 + i14);
        int i16 = 0;
        for (int i17 = 0; i17 < this.A.size(); i17++) {
            i16 += CodedOutputStream.q(this.A.get(i17));
        }
        int C08 = je.C0(this.A, 2, C07 + i16);
        int i18 = 0;
        for (int i19 = 0; i19 < this.B.size(); i19++) {
            i18 += CodedOutputStream.q(this.B.get(i19));
        }
        int C09 = je.C0(this.B, 2, C08 + i18);
        int i20 = 0;
        for (int i21 = 0; i21 < this.C.size(); i21++) {
            i20 += CodedOutputStream.q(this.C.get(i21));
        }
        int C010 = je.C0(this.C, 2, C09 + i20);
        int i22 = 0;
        for (int i23 = 0; i23 < this.D.size(); i23++) {
            i22 += CodedOutputStream.q(this.D.get(i23));
        }
        int C011 = je.C0(this.D, 2, C010 + i22);
        int i24 = 0;
        for (int i25 = 0; i25 < this.E.size(); i25++) {
            i24 += CodedOutputStream.q(this.E.get(i25));
        }
        int C012 = je.C0(this.E, 2, C011 + i24);
        int i26 = 0;
        for (int i27 = 0; i27 < this.F.size(); i27++) {
            i26 += CodedOutputStream.q(this.F.get(i27));
        }
        int c2 = this.unknownFields.c() + je.C0(this.F, 2, C012 + i26);
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
        for (int i = 0; i < this.f.size(); i++) {
            codedOutputStream.P(3, this.f.get(i));
        }
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            codedOutputStream.P(4, this.n.get(i2));
        }
        for (int i3 = 0; i3 < this.o.size(); i3++) {
            codedOutputStream.P(5, this.o.get(i3));
        }
        for (int i4 = 0; i4 < this.p.size(); i4++) {
            codedOutputStream.P(6, this.p.get(i4));
        }
        for (int i5 = 0; i5 < this.q.size(); i5++) {
            codedOutputStream.P(7, this.q.get(i5));
        }
        for (int i6 = 0; i6 < this.r.size(); i6++) {
            codedOutputStream.P(8, this.r.get(i6));
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.P(9, this.s);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.P(10, this.t);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.P(11, this.u);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.P(12, this.v);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.P(13, this.w);
        }
        if ((this.a & 128) == 128) {
            codedOutputStream.P(14, this.x);
        }
        if ((this.a & 256) == 256) {
            codedOutputStream.P(15, this.y);
        }
        for (int i7 = 0; i7 < this.z.size(); i7++) {
            codedOutputStream.P(16, this.z.get(i7));
        }
        for (int i8 = 0; i8 < this.A.size(); i8++) {
            codedOutputStream.P(17, this.A.get(i8));
        }
        for (int i9 = 0; i9 < this.B.size(); i9++) {
            codedOutputStream.P(18, this.B.get(i9));
        }
        for (int i10 = 0; i10 < this.C.size(); i10++) {
            codedOutputStream.P(19, this.C.get(i10));
        }
        for (int i11 = 0; i11 < this.D.size(); i11++) {
            codedOutputStream.P(20, this.D.get(i11));
        }
        for (int i12 = 0; i12 < this.E.size(); i12++) {
            codedOutputStream.P(21, this.E.get(i12));
        }
        for (int i13 = 0; i13 < this.F.size(); i13++) {
            codedOutputStream.P(22, this.F.get(i13));
        }
        this.unknownFields.l(codedOutputStream);
    }
}
