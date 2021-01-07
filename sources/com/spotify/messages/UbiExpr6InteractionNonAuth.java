package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class UbiExpr6InteractionNonAuth extends GeneratedMessageLite<UbiExpr6InteractionNonAuth, b> implements Object {
    private static final UbiExpr6InteractionNonAuth M;
    private static volatile x<UbiExpr6InteractionNonAuth> N;
    private String A = "";
    private String B = "";
    private String C = "";
    private String D = "";
    private String E = "";
    private o.i<String> F = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> G = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> H = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> I = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> J = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> K = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> L = GeneratedMessageLite.emptyProtobufList();
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private String n = "";
    private int o;
    private o.i<String> p = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> q = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> r = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> s = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> t = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> u = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> v = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> w = GeneratedMessageLite.emptyProtobufList();
    private String x = "";
    private String y = "";
    private String z = "";

    public static final class b extends GeneratedMessageLite.b<UbiExpr6InteractionNonAuth, b> implements Object {
        public b A(String str) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.m((UbiExpr6InteractionNonAuth) this.instance, str);
            return this;
        }

        public b B(String str) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.i((UbiExpr6InteractionNonAuth) this.instance, str);
            return this;
        }

        public b C(int i) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.o((UbiExpr6InteractionNonAuth) this.instance, i);
            return this;
        }

        public b D(String str) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.F((UbiExpr6InteractionNonAuth) this.instance, str);
            return this;
        }

        public b E(String str) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.E((UbiExpr6InteractionNonAuth) this.instance, str);
            return this;
        }

        public b F(String str) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.u((UbiExpr6InteractionNonAuth) this.instance, str);
            return this;
        }

        public b G(String str) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.h((UbiExpr6InteractionNonAuth) this.instance, str);
            return this;
        }

        public b H(String str) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.y((UbiExpr6InteractionNonAuth) this.instance, str);
            return this;
        }

        public b I(String str) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.D((UbiExpr6InteractionNonAuth) this.instance, str);
            return this;
        }

        public b J(String str) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.z((UbiExpr6InteractionNonAuth) this.instance, str);
            return this;
        }

        public b K(String str) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.C((UbiExpr6InteractionNonAuth) this.instance, str);
            return this;
        }

        public b L(String str) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.B((UbiExpr6InteractionNonAuth) this.instance, str);
            return this;
        }

        public b M(String str) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.A((UbiExpr6InteractionNonAuth) this.instance, str);
            return this;
        }

        public b m(String str) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.p((UbiExpr6InteractionNonAuth) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.q((UbiExpr6InteractionNonAuth) this.instance, str);
            return this;
        }

        public b o(Iterable<String> iterable) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.x((UbiExpr6InteractionNonAuth) this.instance, iterable);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.t((UbiExpr6InteractionNonAuth) this.instance, str);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.r((UbiExpr6InteractionNonAuth) this.instance, str);
            return this;
        }

        public b r(String str) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.s((UbiExpr6InteractionNonAuth) this.instance, str);
            return this;
        }

        public b s(String str) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.w((UbiExpr6InteractionNonAuth) this.instance, str);
            return this;
        }

        public b t(String str) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.v((UbiExpr6InteractionNonAuth) this.instance, str);
            return this;
        }

        public b u(String str) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.n((UbiExpr6InteractionNonAuth) this.instance, str);
            return this;
        }

        public b v(String str) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.I((UbiExpr6InteractionNonAuth) this.instance, str);
            return this;
        }

        public b w(String str) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.G((UbiExpr6InteractionNonAuth) this.instance, str);
            return this;
        }

        public b x(String str) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.H((UbiExpr6InteractionNonAuth) this.instance, str);
            return this;
        }

        public b y(String str) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.l((UbiExpr6InteractionNonAuth) this.instance, str);
            return this;
        }

        public b z(String str) {
            copyOnWrite();
            UbiExpr6InteractionNonAuth.J((UbiExpr6InteractionNonAuth) this.instance, str);
            return this;
        }

        private b() {
            super(UbiExpr6InteractionNonAuth.M);
        }
    }

    static {
        UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth = new UbiExpr6InteractionNonAuth();
        M = ubiExpr6InteractionNonAuth;
        ubiExpr6InteractionNonAuth.makeImmutable();
    }

    private UbiExpr6InteractionNonAuth() {
    }

    static void A(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, String str) {
        ubiExpr6InteractionNonAuth.getClass();
        str.getClass();
        ubiExpr6InteractionNonAuth.a |= 128;
        ubiExpr6InteractionNonAuth.z = str;
    }

    static void B(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, String str) {
        ubiExpr6InteractionNonAuth.getClass();
        str.getClass();
        ubiExpr6InteractionNonAuth.a |= 256;
        ubiExpr6InteractionNonAuth.A = str;
    }

    static void C(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, String str) {
        ubiExpr6InteractionNonAuth.getClass();
        str.getClass();
        ubiExpr6InteractionNonAuth.a |= 512;
        ubiExpr6InteractionNonAuth.B = str;
    }

    static void D(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, String str) {
        ubiExpr6InteractionNonAuth.getClass();
        str.getClass();
        ubiExpr6InteractionNonAuth.a |= 4;
        ubiExpr6InteractionNonAuth.f = str;
    }

    static void E(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, String str) {
        ubiExpr6InteractionNonAuth.getClass();
        str.getClass();
        ubiExpr6InteractionNonAuth.a |= 2048;
        ubiExpr6InteractionNonAuth.D = str;
    }

    static void F(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, String str) {
        ubiExpr6InteractionNonAuth.getClass();
        str.getClass();
        ubiExpr6InteractionNonAuth.a |= 4096;
        ubiExpr6InteractionNonAuth.E = str;
    }

    static void G(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, String str) {
        ubiExpr6InteractionNonAuth.getClass();
        str.getClass();
        if (!ubiExpr6InteractionNonAuth.F.R0()) {
            ubiExpr6InteractionNonAuth.F = GeneratedMessageLite.mutableCopy(ubiExpr6InteractionNonAuth.F);
        }
        ubiExpr6InteractionNonAuth.F.add(str);
    }

    static void H(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, String str) {
        ubiExpr6InteractionNonAuth.getClass();
        str.getClass();
        if (!ubiExpr6InteractionNonAuth.G.R0()) {
            ubiExpr6InteractionNonAuth.G = GeneratedMessageLite.mutableCopy(ubiExpr6InteractionNonAuth.G);
        }
        ubiExpr6InteractionNonAuth.G.add(str);
    }

    static void I(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, String str) {
        ubiExpr6InteractionNonAuth.getClass();
        str.getClass();
        if (!ubiExpr6InteractionNonAuth.H.R0()) {
            ubiExpr6InteractionNonAuth.H = GeneratedMessageLite.mutableCopy(ubiExpr6InteractionNonAuth.H);
        }
        ubiExpr6InteractionNonAuth.H.add(str);
    }

    static void J(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, String str) {
        ubiExpr6InteractionNonAuth.getClass();
        str.getClass();
        if (!ubiExpr6InteractionNonAuth.I.R0()) {
            ubiExpr6InteractionNonAuth.I = GeneratedMessageLite.mutableCopy(ubiExpr6InteractionNonAuth.I);
        }
        ubiExpr6InteractionNonAuth.I.add(str);
    }

    public static b X() {
        return (b) M.toBuilder();
    }

    static void h(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, String str) {
        ubiExpr6InteractionNonAuth.getClass();
        str.getClass();
        ubiExpr6InteractionNonAuth.a |= 1;
        ubiExpr6InteractionNonAuth.b = str;
    }

    static void i(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, String str) {
        ubiExpr6InteractionNonAuth.getClass();
        str.getClass();
        ubiExpr6InteractionNonAuth.a |= 8;
        ubiExpr6InteractionNonAuth.n = str;
    }

    static void l(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, String str) {
        ubiExpr6InteractionNonAuth.getClass();
        str.getClass();
        if (!ubiExpr6InteractionNonAuth.J.R0()) {
            ubiExpr6InteractionNonAuth.J = GeneratedMessageLite.mutableCopy(ubiExpr6InteractionNonAuth.J);
        }
        ubiExpr6InteractionNonAuth.J.add(str);
    }

    static void m(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, String str) {
        ubiExpr6InteractionNonAuth.getClass();
        str.getClass();
        if (!ubiExpr6InteractionNonAuth.K.R0()) {
            ubiExpr6InteractionNonAuth.K = GeneratedMessageLite.mutableCopy(ubiExpr6InteractionNonAuth.K);
        }
        ubiExpr6InteractionNonAuth.K.add(str);
    }

    static void n(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, String str) {
        ubiExpr6InteractionNonAuth.getClass();
        str.getClass();
        if (!ubiExpr6InteractionNonAuth.L.R0()) {
            ubiExpr6InteractionNonAuth.L = GeneratedMessageLite.mutableCopy(ubiExpr6InteractionNonAuth.L);
        }
        ubiExpr6InteractionNonAuth.L.add(str);
    }

    static void o(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, int i) {
        ubiExpr6InteractionNonAuth.a |= 16;
        ubiExpr6InteractionNonAuth.o = i;
    }

    static void p(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, String str) {
        ubiExpr6InteractionNonAuth.getClass();
        str.getClass();
        if (!ubiExpr6InteractionNonAuth.p.R0()) {
            ubiExpr6InteractionNonAuth.p = GeneratedMessageLite.mutableCopy(ubiExpr6InteractionNonAuth.p);
        }
        ubiExpr6InteractionNonAuth.p.add(str);
    }

    public static x<UbiExpr6InteractionNonAuth> parser() {
        return M.getParserForType();
    }

    static void q(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, String str) {
        ubiExpr6InteractionNonAuth.getClass();
        str.getClass();
        if (!ubiExpr6InteractionNonAuth.q.R0()) {
            ubiExpr6InteractionNonAuth.q = GeneratedMessageLite.mutableCopy(ubiExpr6InteractionNonAuth.q);
        }
        ubiExpr6InteractionNonAuth.q.add(str);
    }

    static void r(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, String str) {
        ubiExpr6InteractionNonAuth.getClass();
        str.getClass();
        if (!ubiExpr6InteractionNonAuth.r.R0()) {
            ubiExpr6InteractionNonAuth.r = GeneratedMessageLite.mutableCopy(ubiExpr6InteractionNonAuth.r);
        }
        ubiExpr6InteractionNonAuth.r.add(str);
    }

    static void s(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, String str) {
        ubiExpr6InteractionNonAuth.getClass();
        str.getClass();
        if (!ubiExpr6InteractionNonAuth.s.R0()) {
            ubiExpr6InteractionNonAuth.s = GeneratedMessageLite.mutableCopy(ubiExpr6InteractionNonAuth.s);
        }
        ubiExpr6InteractionNonAuth.s.add(str);
    }

    static void t(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, String str) {
        ubiExpr6InteractionNonAuth.getClass();
        str.getClass();
        if (!ubiExpr6InteractionNonAuth.t.R0()) {
            ubiExpr6InteractionNonAuth.t = GeneratedMessageLite.mutableCopy(ubiExpr6InteractionNonAuth.t);
        }
        ubiExpr6InteractionNonAuth.t.add(str);
    }

    static void u(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, String str) {
        ubiExpr6InteractionNonAuth.getClass();
        str.getClass();
        ubiExpr6InteractionNonAuth.a |= 2;
        ubiExpr6InteractionNonAuth.c = str;
    }

    static void v(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, String str) {
        ubiExpr6InteractionNonAuth.getClass();
        str.getClass();
        if (!ubiExpr6InteractionNonAuth.u.R0()) {
            ubiExpr6InteractionNonAuth.u = GeneratedMessageLite.mutableCopy(ubiExpr6InteractionNonAuth.u);
        }
        ubiExpr6InteractionNonAuth.u.add(str);
    }

    static void w(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, String str) {
        ubiExpr6InteractionNonAuth.getClass();
        str.getClass();
        if (!ubiExpr6InteractionNonAuth.v.R0()) {
            ubiExpr6InteractionNonAuth.v = GeneratedMessageLite.mutableCopy(ubiExpr6InteractionNonAuth.v);
        }
        ubiExpr6InteractionNonAuth.v.add(str);
    }

    static void x(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, Iterable iterable) {
        if (!ubiExpr6InteractionNonAuth.w.R0()) {
            ubiExpr6InteractionNonAuth.w = GeneratedMessageLite.mutableCopy(ubiExpr6InteractionNonAuth.w);
        }
        com.google.protobuf.a.addAll(iterable, ubiExpr6InteractionNonAuth.w);
    }

    static void y(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, String str) {
        ubiExpr6InteractionNonAuth.getClass();
        str.getClass();
        ubiExpr6InteractionNonAuth.a |= 32;
        ubiExpr6InteractionNonAuth.x = str;
    }

    static void z(UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth, String str) {
        ubiExpr6InteractionNonAuth.getClass();
        str.getClass();
        ubiExpr6InteractionNonAuth.a |= 64;
        ubiExpr6InteractionNonAuth.y = str;
    }

    public boolean K() {
        return (this.a & 8) == 8;
    }

    public boolean L() {
        return (this.a & 16) == 16;
    }

    public boolean M() {
        return (this.a & 4096) == 4096;
    }

    public boolean N() {
        return (this.a & 2048) == 2048;
    }

    public boolean O() {
        return (this.a & 2) == 2;
    }

    public boolean P() {
        return (this.a & 1) == 1;
    }

    public boolean Q() {
        return (this.a & 1024) == 1024;
    }

    public boolean R() {
        return (this.a & 32) == 32;
    }

    public boolean S() {
        return (this.a & 4) == 4;
    }

    public boolean T() {
        return (this.a & 64) == 64;
    }

    public boolean U() {
        return (this.a & 512) == 512;
    }

    public boolean V() {
        return (this.a & 256) == 256;
    }

    public boolean W() {
        return (this.a & 128) == 128;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return M;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                UbiExpr6InteractionNonAuth ubiExpr6InteractionNonAuth = (UbiExpr6InteractionNonAuth) obj2;
                this.b = hVar.n(P(), this.b, ubiExpr6InteractionNonAuth.P(), ubiExpr6InteractionNonAuth.b);
                this.c = hVar.n(O(), this.c, ubiExpr6InteractionNonAuth.O(), ubiExpr6InteractionNonAuth.c);
                this.f = hVar.n(S(), this.f, ubiExpr6InteractionNonAuth.S(), ubiExpr6InteractionNonAuth.f);
                this.n = hVar.n(K(), this.n, ubiExpr6InteractionNonAuth.K(), ubiExpr6InteractionNonAuth.n);
                this.o = hVar.m(L(), this.o, ubiExpr6InteractionNonAuth.L(), ubiExpr6InteractionNonAuth.o);
                this.p = hVar.q(this.p, ubiExpr6InteractionNonAuth.p);
                this.q = hVar.q(this.q, ubiExpr6InteractionNonAuth.q);
                this.r = hVar.q(this.r, ubiExpr6InteractionNonAuth.r);
                this.s = hVar.q(this.s, ubiExpr6InteractionNonAuth.s);
                this.t = hVar.q(this.t, ubiExpr6InteractionNonAuth.t);
                this.u = hVar.q(this.u, ubiExpr6InteractionNonAuth.u);
                this.v = hVar.q(this.v, ubiExpr6InteractionNonAuth.v);
                this.w = hVar.q(this.w, ubiExpr6InteractionNonAuth.w);
                this.x = hVar.n(R(), this.x, ubiExpr6InteractionNonAuth.R(), ubiExpr6InteractionNonAuth.x);
                this.y = hVar.n(T(), this.y, ubiExpr6InteractionNonAuth.T(), ubiExpr6InteractionNonAuth.y);
                this.z = hVar.n(W(), this.z, ubiExpr6InteractionNonAuth.W(), ubiExpr6InteractionNonAuth.z);
                this.A = hVar.n(V(), this.A, ubiExpr6InteractionNonAuth.V(), ubiExpr6InteractionNonAuth.A);
                this.B = hVar.n(U(), this.B, ubiExpr6InteractionNonAuth.U(), ubiExpr6InteractionNonAuth.B);
                this.C = hVar.n(Q(), this.C, ubiExpr6InteractionNonAuth.Q(), ubiExpr6InteractionNonAuth.C);
                this.D = hVar.n(N(), this.D, ubiExpr6InteractionNonAuth.N(), ubiExpr6InteractionNonAuth.D);
                this.E = hVar.n(M(), this.E, ubiExpr6InteractionNonAuth.M(), ubiExpr6InteractionNonAuth.E);
                this.F = hVar.q(this.F, ubiExpr6InteractionNonAuth.F);
                this.G = hVar.q(this.G, ubiExpr6InteractionNonAuth.G);
                this.H = hVar.q(this.H, ubiExpr6InteractionNonAuth.H);
                this.I = hVar.q(this.I, ubiExpr6InteractionNonAuth.I);
                this.J = hVar.q(this.J, ubiExpr6InteractionNonAuth.J);
                this.K = hVar.q(this.K, ubiExpr6InteractionNonAuth.K);
                this.L = hVar.q(this.L, ubiExpr6InteractionNonAuth.L);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= ubiExpr6InteractionNonAuth.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z2 = false;
                while (!z2) {
                    try {
                        int B2 = gVar.B();
                        switch (B2) {
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
                            case 40:
                                this.a |= 16;
                                this.o = gVar.m();
                                continue;
                            case 50:
                                String z7 = gVar.z();
                                if (!this.p.R0()) {
                                    this.p = GeneratedMessageLite.mutableCopy(this.p);
                                }
                                this.p.add(z7);
                                continue;
                            case 58:
                                String z8 = gVar.z();
                                if (!this.q.R0()) {
                                    this.q = GeneratedMessageLite.mutableCopy(this.q);
                                }
                                this.q.add(z8);
                                continue;
                            case 66:
                                String z9 = gVar.z();
                                if (!this.r.R0()) {
                                    this.r = GeneratedMessageLite.mutableCopy(this.r);
                                }
                                this.r.add(z9);
                                continue;
                            case 74:
                                String z10 = gVar.z();
                                if (!this.s.R0()) {
                                    this.s = GeneratedMessageLite.mutableCopy(this.s);
                                }
                                this.s.add(z10);
                                continue;
                            case 82:
                                String z11 = gVar.z();
                                if (!this.t.R0()) {
                                    this.t = GeneratedMessageLite.mutableCopy(this.t);
                                }
                                this.t.add(z11);
                                continue;
                            case 90:
                                String z12 = gVar.z();
                                if (!this.u.R0()) {
                                    this.u = GeneratedMessageLite.mutableCopy(this.u);
                                }
                                this.u.add(z12);
                                continue;
                            case 98:
                                String z13 = gVar.z();
                                if (!this.v.R0()) {
                                    this.v = GeneratedMessageLite.mutableCopy(this.v);
                                }
                                this.v.add(z13);
                                continue;
                            case 106:
                                String z14 = gVar.z();
                                if (!this.w.R0()) {
                                    this.w = GeneratedMessageLite.mutableCopy(this.w);
                                }
                                this.w.add(z14);
                                continue;
                            case 114:
                                String z15 = gVar.z();
                                this.a |= 32;
                                this.x = z15;
                                continue;
                            case 122:
                                String z16 = gVar.z();
                                this.a |= 64;
                                this.y = z16;
                                continue;
                            case 130:
                                String z17 = gVar.z();
                                this.a |= 128;
                                this.z = z17;
                                continue;
                            case 138:
                                String z18 = gVar.z();
                                this.a |= 256;
                                this.A = z18;
                                continue;
                            case 146:
                                String z19 = gVar.z();
                                this.a |= 512;
                                this.B = z19;
                                continue;
                            case 154:
                                String z20 = gVar.z();
                                this.a |= 1024;
                                this.C = z20;
                                continue;
                            case 162:
                                String z21 = gVar.z();
                                this.a |= 2048;
                                this.D = z21;
                                continue;
                            case 170:
                                String z22 = gVar.z();
                                this.a |= 4096;
                                this.E = z22;
                                continue;
                            case 178:
                                String z23 = gVar.z();
                                if (!this.F.R0()) {
                                    this.F = GeneratedMessageLite.mutableCopy(this.F);
                                }
                                this.F.add(z23);
                                continue;
                            case 186:
                                String z24 = gVar.z();
                                if (!this.G.R0()) {
                                    this.G = GeneratedMessageLite.mutableCopy(this.G);
                                }
                                this.G.add(z24);
                                continue;
                            case 194:
                                String z25 = gVar.z();
                                if (!this.H.R0()) {
                                    this.H = GeneratedMessageLite.mutableCopy(this.H);
                                }
                                this.H.add(z25);
                                continue;
                            case 202:
                                String z26 = gVar.z();
                                if (!this.I.R0()) {
                                    this.I = GeneratedMessageLite.mutableCopy(this.I);
                                }
                                this.I.add(z26);
                                continue;
                            case 210:
                                String z27 = gVar.z();
                                if (!this.J.R0()) {
                                    this.J = GeneratedMessageLite.mutableCopy(this.J);
                                }
                                this.J.add(z27);
                                continue;
                            case 218:
                                String z28 = gVar.z();
                                if (!this.K.R0()) {
                                    this.K = GeneratedMessageLite.mutableCopy(this.K);
                                }
                                this.K.add(z28);
                                continue;
                            case 226:
                                String z29 = gVar.z();
                                if (!this.L.R0()) {
                                    this.L = GeneratedMessageLite.mutableCopy(this.L);
                                }
                                this.L.add(z29);
                                continue;
                            default:
                                if (parseUnknownField(B2, gVar)) {
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
                this.p.C();
                this.q.C();
                this.r.C();
                this.s.C();
                this.t.C();
                this.u.C();
                this.v.C();
                this.w.C();
                this.F.C();
                this.G.C();
                this.H.C();
                this.I.C();
                this.J.C();
                this.K.C();
                this.L.C();
                return null;
            case 4:
                return new UbiExpr6InteractionNonAuth();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (N == null) {
                    synchronized (UbiExpr6InteractionNonAuth.class) {
                        if (N == null) {
                            N = new GeneratedMessageLite.c(M);
                        }
                    }
                }
                return N;
            default:
                throw new UnsupportedOperationException();
        }
        return M;
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
        if ((this.a & 4) == 4) {
            p2 += CodedOutputStream.p(3, this.f);
        }
        if ((this.a & 8) == 8) {
            p2 += CodedOutputStream.p(4, this.n);
        }
        if ((this.a & 16) == 16) {
            p2 += CodedOutputStream.j(5, this.o);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.p.size(); i3++) {
            i2 += CodedOutputStream.q(this.p.get(i3));
        }
        int C0 = je.C0(this.p, 1, p2 + i2);
        int i4 = 0;
        for (int i5 = 0; i5 < this.q.size(); i5++) {
            i4 += CodedOutputStream.q(this.q.get(i5));
        }
        int C02 = je.C0(this.q, 1, C0 + i4);
        int i6 = 0;
        for (int i7 = 0; i7 < this.r.size(); i7++) {
            i6 += CodedOutputStream.q(this.r.get(i7));
        }
        int C03 = je.C0(this.r, 1, C02 + i6);
        int i8 = 0;
        for (int i9 = 0; i9 < this.s.size(); i9++) {
            i8 += CodedOutputStream.q(this.s.get(i9));
        }
        int C04 = je.C0(this.s, 1, C03 + i8);
        int i10 = 0;
        for (int i11 = 0; i11 < this.t.size(); i11++) {
            i10 += CodedOutputStream.q(this.t.get(i11));
        }
        int C05 = je.C0(this.t, 1, C04 + i10);
        int i12 = 0;
        for (int i13 = 0; i13 < this.u.size(); i13++) {
            i12 += CodedOutputStream.q(this.u.get(i13));
        }
        int C06 = je.C0(this.u, 1, C05 + i12);
        int i14 = 0;
        for (int i15 = 0; i15 < this.v.size(); i15++) {
            i14 += CodedOutputStream.q(this.v.get(i15));
        }
        int C07 = je.C0(this.v, 1, C06 + i14);
        int i16 = 0;
        for (int i17 = 0; i17 < this.w.size(); i17++) {
            i16 += CodedOutputStream.q(this.w.get(i17));
        }
        int C08 = je.C0(this.w, 1, C07 + i16);
        if ((this.a & 32) == 32) {
            C08 += CodedOutputStream.p(14, this.x);
        }
        if ((this.a & 64) == 64) {
            C08 += CodedOutputStream.p(15, this.y);
        }
        if ((this.a & 128) == 128) {
            C08 += CodedOutputStream.p(16, this.z);
        }
        if ((this.a & 256) == 256) {
            C08 += CodedOutputStream.p(17, this.A);
        }
        if ((this.a & 512) == 512) {
            C08 += CodedOutputStream.p(18, this.B);
        }
        if ((this.a & 1024) == 1024) {
            C08 += CodedOutputStream.p(19, this.C);
        }
        if ((this.a & 2048) == 2048) {
            C08 += CodedOutputStream.p(20, this.D);
        }
        if ((this.a & 4096) == 4096) {
            C08 += CodedOutputStream.p(21, this.E);
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.F.size(); i19++) {
            i18 += CodedOutputStream.q(this.F.get(i19));
        }
        int C09 = je.C0(this.F, 2, C08 + i18);
        int i20 = 0;
        for (int i21 = 0; i21 < this.G.size(); i21++) {
            i20 += CodedOutputStream.q(this.G.get(i21));
        }
        int C010 = je.C0(this.G, 2, C09 + i20);
        int i22 = 0;
        for (int i23 = 0; i23 < this.H.size(); i23++) {
            i22 += CodedOutputStream.q(this.H.get(i23));
        }
        int C011 = je.C0(this.H, 2, C010 + i22);
        int i24 = 0;
        for (int i25 = 0; i25 < this.I.size(); i25++) {
            i24 += CodedOutputStream.q(this.I.get(i25));
        }
        int C012 = je.C0(this.I, 2, C011 + i24);
        int i26 = 0;
        for (int i27 = 0; i27 < this.J.size(); i27++) {
            i26 += CodedOutputStream.q(this.J.get(i27));
        }
        int C013 = je.C0(this.J, 2, C012 + i26);
        int i28 = 0;
        for (int i29 = 0; i29 < this.K.size(); i29++) {
            i28 += CodedOutputStream.q(this.K.get(i29));
        }
        int C014 = je.C0(this.K, 2, C013 + i28);
        int i30 = 0;
        for (int i31 = 0; i31 < this.L.size(); i31++) {
            i30 += CodedOutputStream.q(this.L.get(i31));
        }
        int c2 = this.unknownFields.c() + je.C0(this.L, 2, C014 + i30);
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
        for (int i = 0; i < this.p.size(); i++) {
            codedOutputStream.P(6, this.p.get(i));
        }
        for (int i2 = 0; i2 < this.q.size(); i2++) {
            codedOutputStream.P(7, this.q.get(i2));
        }
        for (int i3 = 0; i3 < this.r.size(); i3++) {
            codedOutputStream.P(8, this.r.get(i3));
        }
        for (int i4 = 0; i4 < this.s.size(); i4++) {
            codedOutputStream.P(9, this.s.get(i4));
        }
        for (int i5 = 0; i5 < this.t.size(); i5++) {
            codedOutputStream.P(10, this.t.get(i5));
        }
        for (int i6 = 0; i6 < this.u.size(); i6++) {
            codedOutputStream.P(11, this.u.get(i6));
        }
        for (int i7 = 0; i7 < this.v.size(); i7++) {
            codedOutputStream.P(12, this.v.get(i7));
        }
        for (int i8 = 0; i8 < this.w.size(); i8++) {
            codedOutputStream.P(13, this.w.get(i8));
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.P(14, this.x);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.P(15, this.y);
        }
        if ((this.a & 128) == 128) {
            codedOutputStream.P(16, this.z);
        }
        if ((this.a & 256) == 256) {
            codedOutputStream.P(17, this.A);
        }
        if ((this.a & 512) == 512) {
            codedOutputStream.P(18, this.B);
        }
        if ((this.a & 1024) == 1024) {
            codedOutputStream.P(19, this.C);
        }
        if ((this.a & 2048) == 2048) {
            codedOutputStream.P(20, this.D);
        }
        if ((this.a & 4096) == 4096) {
            codedOutputStream.P(21, this.E);
        }
        for (int i9 = 0; i9 < this.F.size(); i9++) {
            codedOutputStream.P(22, this.F.get(i9));
        }
        for (int i10 = 0; i10 < this.G.size(); i10++) {
            codedOutputStream.P(23, this.G.get(i10));
        }
        for (int i11 = 0; i11 < this.H.size(); i11++) {
            codedOutputStream.P(24, this.H.get(i11));
        }
        for (int i12 = 0; i12 < this.I.size(); i12++) {
            codedOutputStream.P(25, this.I.get(i12));
        }
        for (int i13 = 0; i13 < this.J.size(); i13++) {
            codedOutputStream.P(26, this.J.get(i13));
        }
        for (int i14 = 0; i14 < this.K.size(); i14++) {
            codedOutputStream.P(27, this.K.get(i14));
        }
        for (int i15 = 0; i15 < this.L.size(); i15++) {
            codedOutputStream.P(28, this.L.get(i15));
        }
        this.unknownFields.l(codedOutputStream);
    }
}
