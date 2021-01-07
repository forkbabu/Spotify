package com.spotify.messages;

import com.comscore.streaming.AdvertisementType;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class BetamaxPlaybackSession extends GeneratedMessageLite<BetamaxPlaybackSession, b> implements Object {
    private static final BetamaxPlaybackSession W;
    private static volatile x<BetamaxPlaybackSession> X;
    private int A;
    private int B;
    private long C;
    private long D;
    private long E;
    private long F;
    private String G = "";
    private String H = "";
    private int I;
    private String J = "";
    private long K;
    private long L;
    private int M;
    private long N;
    private float O;
    private String P = "";
    private float Q;
    private String R = "";
    private long S;
    private boolean T;
    private String U = "";
    private String V = "";
    private int a;
    private int b;
    private String c = "";
    private String f = "";
    private String n = "";
    private long o;
    private int p;
    private long q;
    private long r;
    private long s;
    private long t;
    private long u;
    private long v;
    private long w;
    private long x;
    private long y;
    private int z;

    public static final class b extends GeneratedMessageLite.b<BetamaxPlaybackSession, b> implements Object {
        public b A(long j) {
            copyOnWrite();
            BetamaxPlaybackSession.t((BetamaxPlaybackSession) this.instance, j);
            return this;
        }

        public b B(long j) {
            copyOnWrite();
            BetamaxPlaybackSession.u((BetamaxPlaybackSession) this.instance, j);
            return this;
        }

        public b C(long j) {
            copyOnWrite();
            BetamaxPlaybackSession.m((BetamaxPlaybackSession) this.instance, j);
            return this;
        }

        public b D(long j) {
            copyOnWrite();
            BetamaxPlaybackSession.p((BetamaxPlaybackSession) this.instance, j);
            return this;
        }

        public b E(long j) {
            copyOnWrite();
            BetamaxPlaybackSession.q((BetamaxPlaybackSession) this.instance, j);
            return this;
        }

        public b F(long j) {
            copyOnWrite();
            BetamaxPlaybackSession.o((BetamaxPlaybackSession) this.instance, j);
            return this;
        }

        public b G(long j) {
            copyOnWrite();
            BetamaxPlaybackSession.y((BetamaxPlaybackSession) this.instance, j);
            return this;
        }

        public b H(long j) {
            copyOnWrite();
            BetamaxPlaybackSession.A((BetamaxPlaybackSession) this.instance, j);
            return this;
        }

        public b I(long j) {
            copyOnWrite();
            BetamaxPlaybackSession.B((BetamaxPlaybackSession) this.instance, j);
            return this;
        }

        public b J(long j) {
            copyOnWrite();
            BetamaxPlaybackSession.O((BetamaxPlaybackSession) this.instance, j);
            return this;
        }

        public b K(long j) {
            copyOnWrite();
            BetamaxPlaybackSession.C((BetamaxPlaybackSession) this.instance, j);
            return this;
        }

        public b L(long j) {
            copyOnWrite();
            BetamaxPlaybackSession.i((BetamaxPlaybackSession) this.instance, j);
            return this;
        }

        public b M(long j) {
            copyOnWrite();
            BetamaxPlaybackSession.n((BetamaxPlaybackSession) this.instance, j);
            return this;
        }

        public b N(long j) {
            copyOnWrite();
            BetamaxPlaybackSession.J((BetamaxPlaybackSession) this.instance, j);
            return this;
        }

        public b O(int i) {
            copyOnWrite();
            BetamaxPlaybackSession.w((BetamaxPlaybackSession) this.instance, i);
            return this;
        }

        public b P(int i) {
            copyOnWrite();
            BetamaxPlaybackSession.x((BetamaxPlaybackSession) this.instance, i);
            return this;
        }

        public b Q(int i) {
            copyOnWrite();
            BetamaxPlaybackSession.v((BetamaxPlaybackSession) this.instance, i);
            return this;
        }

        public b R(String str) {
            copyOnWrite();
            BetamaxPlaybackSession.h((BetamaxPlaybackSession) this.instance, str);
            return this;
        }

        public b S(int i) {
            copyOnWrite();
            BetamaxPlaybackSession.l((BetamaxPlaybackSession) this.instance, i);
            return this;
        }

        public b T(String str) {
            copyOnWrite();
            BetamaxPlaybackSession.Q((BetamaxPlaybackSession) this.instance, str);
            return this;
        }

        public b m(float f) {
            copyOnWrite();
            BetamaxPlaybackSession.M((BetamaxPlaybackSession) this.instance, f);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            BetamaxPlaybackSession.E((BetamaxPlaybackSession) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            BetamaxPlaybackSession.D((BetamaxPlaybackSession) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            BetamaxPlaybackSession.G((BetamaxPlaybackSession) this.instance, str);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            BetamaxPlaybackSession.K((BetamaxPlaybackSession) this.instance, str);
            return this;
        }

        public b r(String str) {
            copyOnWrite();
            BetamaxPlaybackSession.z((BetamaxPlaybackSession) this.instance, str);
            return this;
        }

        public b s(boolean z) {
            copyOnWrite();
            BetamaxPlaybackSession.P((BetamaxPlaybackSession) this.instance, z);
            return this;
        }

        public b t(int i) {
            copyOnWrite();
            BetamaxPlaybackSession.F((BetamaxPlaybackSession) this.instance, i);
            return this;
        }

        public b u(long j) {
            copyOnWrite();
            BetamaxPlaybackSession.I((BetamaxPlaybackSession) this.instance, j);
            return this;
        }

        public b v(long j) {
            copyOnWrite();
            BetamaxPlaybackSession.H((BetamaxPlaybackSession) this.instance, j);
            return this;
        }

        public b w(String str) {
            copyOnWrite();
            BetamaxPlaybackSession.N((BetamaxPlaybackSession) this.instance, str);
            return this;
        }

        public b x(String str) {
            copyOnWrite();
            BetamaxPlaybackSession.L((BetamaxPlaybackSession) this.instance, str);
            return this;
        }

        public b y(long j) {
            copyOnWrite();
            BetamaxPlaybackSession.r((BetamaxPlaybackSession) this.instance, j);
            return this;
        }

        public b z(long j) {
            copyOnWrite();
            BetamaxPlaybackSession.s((BetamaxPlaybackSession) this.instance, j);
            return this;
        }

        private b() {
            super(BetamaxPlaybackSession.W);
        }
    }

    static {
        BetamaxPlaybackSession betamaxPlaybackSession = new BetamaxPlaybackSession();
        W = betamaxPlaybackSession;
        betamaxPlaybackSession.makeImmutable();
    }

    private BetamaxPlaybackSession() {
    }

    static void A(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.a |= 262144;
        betamaxPlaybackSession.D = j;
    }

    static void B(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.a |= 524288;
        betamaxPlaybackSession.E = j;
    }

    static void C(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.a |= 1048576;
        betamaxPlaybackSession.F = j;
    }

    public static b C0() {
        return (b) W.toBuilder();
    }

    static void D(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        betamaxPlaybackSession.getClass();
        str.getClass();
        betamaxPlaybackSession.a |= 2097152;
        betamaxPlaybackSession.G = str;
    }

    static void E(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        betamaxPlaybackSession.getClass();
        str.getClass();
        betamaxPlaybackSession.a |= 4194304;
        betamaxPlaybackSession.H = str;
    }

    static void F(BetamaxPlaybackSession betamaxPlaybackSession, int i) {
        betamaxPlaybackSession.a |= 8388608;
        betamaxPlaybackSession.I = i;
    }

    static void G(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        betamaxPlaybackSession.getClass();
        str.getClass();
        betamaxPlaybackSession.a |= 16777216;
        betamaxPlaybackSession.J = str;
    }

    static void H(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.a |= 33554432;
        betamaxPlaybackSession.K = j;
    }

    static void I(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.a |= 67108864;
        betamaxPlaybackSession.L = j;
    }

    static void J(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.a |= 268435456;
        betamaxPlaybackSession.N = j;
    }

    static void K(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        betamaxPlaybackSession.getClass();
        str.getClass();
        betamaxPlaybackSession.a |= 1073741824;
        betamaxPlaybackSession.P = str;
    }

    static void L(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        betamaxPlaybackSession.getClass();
        str.getClass();
        betamaxPlaybackSession.a |= 4;
        betamaxPlaybackSession.n = str;
    }

    static void M(BetamaxPlaybackSession betamaxPlaybackSession, float f2) {
        betamaxPlaybackSession.a |= Integer.MIN_VALUE;
        betamaxPlaybackSession.Q = f2;
    }

    static void N(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        betamaxPlaybackSession.getClass();
        str.getClass();
        betamaxPlaybackSession.b |= 1;
        betamaxPlaybackSession.R = str;
    }

    static void O(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.b |= 2;
        betamaxPlaybackSession.S = j;
    }

    static void P(BetamaxPlaybackSession betamaxPlaybackSession, boolean z2) {
        betamaxPlaybackSession.b |= 4;
        betamaxPlaybackSession.T = z2;
    }

    static void Q(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        betamaxPlaybackSession.getClass();
        str.getClass();
        betamaxPlaybackSession.b |= 8;
        betamaxPlaybackSession.U = str;
    }

    static void h(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        betamaxPlaybackSession.getClass();
        str.getClass();
        betamaxPlaybackSession.a |= 1;
        betamaxPlaybackSession.c = str;
    }

    static void i(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.a |= 8;
        betamaxPlaybackSession.o = j;
    }

    static void l(BetamaxPlaybackSession betamaxPlaybackSession, int i) {
        betamaxPlaybackSession.a |= 16;
        betamaxPlaybackSession.p = i;
    }

    static void m(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.a |= 32;
        betamaxPlaybackSession.q = j;
    }

    static void n(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.a |= 64;
        betamaxPlaybackSession.r = j;
    }

    static void o(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.a |= 128;
        betamaxPlaybackSession.s = j;
    }

    static void p(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.a |= 256;
        betamaxPlaybackSession.t = j;
    }

    public static x<BetamaxPlaybackSession> parser() {
        return W.getParserForType();
    }

    static void q(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.a |= 512;
        betamaxPlaybackSession.u = j;
    }

    static void r(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.a |= 1024;
        betamaxPlaybackSession.v = j;
    }

    static void s(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.a |= 2048;
        betamaxPlaybackSession.w = j;
    }

    static void t(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.a |= 4096;
        betamaxPlaybackSession.x = j;
    }

    static void u(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.a |= 8192;
        betamaxPlaybackSession.y = j;
    }

    static void v(BetamaxPlaybackSession betamaxPlaybackSession, int i) {
        betamaxPlaybackSession.a |= 16384;
        betamaxPlaybackSession.z = i;
    }

    static void w(BetamaxPlaybackSession betamaxPlaybackSession, int i) {
        betamaxPlaybackSession.a |= 32768;
        betamaxPlaybackSession.A = i;
    }

    static void x(BetamaxPlaybackSession betamaxPlaybackSession, int i) {
        betamaxPlaybackSession.a |= 65536;
        betamaxPlaybackSession.B = i;
    }

    static void y(BetamaxPlaybackSession betamaxPlaybackSession, long j) {
        betamaxPlaybackSession.a |= 131072;
        betamaxPlaybackSession.C = j;
    }

    static void z(BetamaxPlaybackSession betamaxPlaybackSession, String str) {
        betamaxPlaybackSession.getClass();
        str.getClass();
        betamaxPlaybackSession.a |= 2;
        betamaxPlaybackSession.f = str;
    }

    public boolean A0() {
        return (this.a & 16) == 16;
    }

    public boolean B0() {
        return (this.b & 8) == 8;
    }

    public boolean R() {
        return (this.a & Integer.MIN_VALUE) == Integer.MIN_VALUE;
    }

    public boolean S() {
        return (this.a & 536870912) == 536870912;
    }

    public boolean T() {
        return (this.a & 4194304) == 4194304;
    }

    public boolean U() {
        return (this.a & 2097152) == 2097152;
    }

    public boolean V() {
        return (this.b & 16) == 16;
    }

    public boolean W() {
        return (this.a & 16777216) == 16777216;
    }

    public boolean X() {
        return (this.a & 1073741824) == 1073741824;
    }

    public boolean Y() {
        return (this.a & 2) == 2;
    }

    public boolean Z() {
        return (this.b & 4) == 4;
    }

    public boolean a0() {
        return (this.a & 8388608) == 8388608;
    }

    public boolean b0() {
        return (this.a & 67108864) == 67108864;
    }

    public boolean c0() {
        return (this.a & 33554432) == 33554432;
    }

    public boolean d0() {
        return (this.b & 1) == 1;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z2 = true;
        boolean z3 = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return W;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                BetamaxPlaybackSession betamaxPlaybackSession = (BetamaxPlaybackSession) obj2;
                if ((this.a & 1) != 1) {
                    z2 = false;
                }
                this.c = hVar.n(z2, this.c, betamaxPlaybackSession.z0(), betamaxPlaybackSession.c);
                this.f = hVar.n(Y(), this.f, betamaxPlaybackSession.Y(), betamaxPlaybackSession.f);
                this.n = hVar.n(e0(), this.n, betamaxPlaybackSession.e0(), betamaxPlaybackSession.n);
                this.o = hVar.s(s0(), this.o, betamaxPlaybackSession.s0(), betamaxPlaybackSession.o);
                this.p = hVar.m(A0(), this.p, betamaxPlaybackSession.A0(), betamaxPlaybackSession.p);
                this.q = hVar.s(j0(), this.q, betamaxPlaybackSession.j0(), betamaxPlaybackSession.q);
                this.r = hVar.s(t0(), this.r, betamaxPlaybackSession.t0(), betamaxPlaybackSession.r);
                this.s = hVar.s(m0(), this.s, betamaxPlaybackSession.m0(), betamaxPlaybackSession.s);
                this.t = hVar.s(k0(), this.t, betamaxPlaybackSession.k0(), betamaxPlaybackSession.t);
                this.u = hVar.s(l0(), this.u, betamaxPlaybackSession.l0(), betamaxPlaybackSession.u);
                this.v = hVar.s(f0(), this.v, betamaxPlaybackSession.f0(), betamaxPlaybackSession.v);
                this.w = hVar.s(g0(), this.w, betamaxPlaybackSession.g0(), betamaxPlaybackSession.w);
                this.x = hVar.s(h0(), this.x, betamaxPlaybackSession.h0(), betamaxPlaybackSession.x);
                this.y = hVar.s(i0(), this.y, betamaxPlaybackSession.i0(), betamaxPlaybackSession.y);
                this.z = hVar.m(x0(), this.z, betamaxPlaybackSession.x0(), betamaxPlaybackSession.z);
                this.A = hVar.m(v0(), this.A, betamaxPlaybackSession.v0(), betamaxPlaybackSession.A);
                this.B = hVar.m(w0(), this.B, betamaxPlaybackSession.w0(), betamaxPlaybackSession.B);
                this.C = hVar.s(n0(), this.C, betamaxPlaybackSession.n0(), betamaxPlaybackSession.C);
                this.D = hVar.s(o0(), this.D, betamaxPlaybackSession.o0(), betamaxPlaybackSession.D);
                this.E = hVar.s(p0(), this.E, betamaxPlaybackSession.p0(), betamaxPlaybackSession.E);
                this.F = hVar.s(r0(), this.F, betamaxPlaybackSession.r0(), betamaxPlaybackSession.F);
                this.G = hVar.n(U(), this.G, betamaxPlaybackSession.U(), betamaxPlaybackSession.G);
                this.H = hVar.n(T(), this.H, betamaxPlaybackSession.T(), betamaxPlaybackSession.H);
                this.I = hVar.m(a0(), this.I, betamaxPlaybackSession.a0(), betamaxPlaybackSession.I);
                this.J = hVar.n(W(), this.J, betamaxPlaybackSession.W(), betamaxPlaybackSession.J);
                this.K = hVar.s(c0(), this.K, betamaxPlaybackSession.c0(), betamaxPlaybackSession.K);
                this.L = hVar.s(b0(), this.L, betamaxPlaybackSession.b0(), betamaxPlaybackSession.L);
                this.M = hVar.m(y0(), this.M, betamaxPlaybackSession.y0(), betamaxPlaybackSession.M);
                this.N = hVar.s(u0(), this.N, betamaxPlaybackSession.u0(), betamaxPlaybackSession.N);
                this.O = hVar.o(S(), this.O, betamaxPlaybackSession.S(), betamaxPlaybackSession.O);
                this.P = hVar.n(X(), this.P, betamaxPlaybackSession.X(), betamaxPlaybackSession.P);
                this.Q = hVar.o(R(), this.Q, betamaxPlaybackSession.R(), betamaxPlaybackSession.Q);
                this.R = hVar.n(d0(), this.R, betamaxPlaybackSession.d0(), betamaxPlaybackSession.R);
                this.S = hVar.s(q0(), this.S, betamaxPlaybackSession.q0(), betamaxPlaybackSession.S);
                this.T = hVar.f(Z(), this.T, betamaxPlaybackSession.Z(), betamaxPlaybackSession.T);
                this.U = hVar.n(B0(), this.U, betamaxPlaybackSession.B0(), betamaxPlaybackSession.U);
                this.V = hVar.n(V(), this.V, betamaxPlaybackSession.V(), betamaxPlaybackSession.V);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= betamaxPlaybackSession.a;
                    this.b |= betamaxPlaybackSession.b;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z3) {
                    try {
                        int B2 = gVar.B();
                        switch (B2) {
                            case 0:
                                break;
                            case 10:
                                String z4 = gVar.z();
                                this.a |= 1;
                                this.c = z4;
                                continue;
                            case 18:
                                String z5 = gVar.z();
                                this.a |= 2;
                                this.f = z5;
                                continue;
                            case 26:
                                String z6 = gVar.z();
                                this.a |= 4;
                                this.n = z6;
                                continue;
                            case 32:
                                this.a |= 8;
                                this.o = gVar.w();
                                continue;
                            case 40:
                                this.a |= 16;
                                this.p = gVar.u();
                                continue;
                            case 48:
                                this.a |= 32;
                                this.q = gVar.w();
                                continue;
                            case 56:
                                this.a |= 64;
                                this.r = gVar.w();
                                continue;
                            case 64:
                                this.a |= 128;
                                this.s = gVar.w();
                                continue;
                            case 72:
                                this.a |= 256;
                                this.t = gVar.w();
                                continue;
                            case 80:
                                this.a |= 512;
                                this.u = gVar.w();
                                continue;
                            case 88:
                                this.a |= 1024;
                                this.v = gVar.n();
                                continue;
                            case 96:
                                this.a |= 2048;
                                this.w = gVar.n();
                                continue;
                            case 104:
                                this.a |= 4096;
                                this.x = gVar.n();
                                continue;
                            case 112:
                                this.a |= 8192;
                                this.y = gVar.n();
                                continue;
                            case 120:
                                this.a |= 16384;
                                this.z = gVar.m();
                                continue;
                            case 128:
                                this.a |= 32768;
                                this.A = gVar.m();
                                continue;
                            case 136:
                                this.a |= 65536;
                                this.B = gVar.m();
                                continue;
                            case 144:
                                this.a |= 131072;
                                this.C = gVar.n();
                                continue;
                            case 152:
                                this.a |= 262144;
                                this.D = gVar.n();
                                continue;
                            case 160:
                                this.a |= 524288;
                                this.E = gVar.n();
                                continue;
                            case 168:
                                this.a |= 1048576;
                                this.F = gVar.n();
                                continue;
                            case 178:
                                String z7 = gVar.z();
                                this.a |= 2097152;
                                this.G = z7;
                                continue;
                            case 186:
                                String z8 = gVar.z();
                                this.a |= 4194304;
                                this.H = z8;
                                continue;
                            case 192:
                                this.a |= 8388608;
                                this.I = gVar.m();
                                continue;
                            case 202:
                                String z9 = gVar.z();
                                this.a |= 16777216;
                                this.J = z9;
                                continue;
                            case 208:
                                this.a |= 33554432;
                                this.K = gVar.n();
                                continue;
                            case 216:
                                this.a |= 67108864;
                                this.L = gVar.n();
                                continue;
                            case 224:
                                this.a |= 134217728;
                                this.M = gVar.m();
                                continue;
                            case AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL /* 232 */:
                                this.a |= 268435456;
                                this.N = gVar.n();
                                continue;
                            case 245:
                                this.a |= 536870912;
                                this.O = gVar.l();
                                continue;
                            case 250:
                                String z10 = gVar.z();
                                this.a |= 1073741824;
                                this.P = z10;
                                continue;
                            case 261:
                                this.a |= Integer.MIN_VALUE;
                                this.Q = gVar.l();
                                continue;
                            case 266:
                                String z11 = gVar.z();
                                this.b |= 1;
                                this.R = z11;
                                continue;
                            case 272:
                                this.b |= 2;
                                this.S = gVar.n();
                                continue;
                            case 280:
                                this.b |= 4;
                                this.T = gVar.h();
                                continue;
                            case 290:
                                String z12 = gVar.z();
                                this.b |= 8;
                                this.U = z12;
                                continue;
                            case 298:
                                String z13 = gVar.z();
                                this.b |= 16;
                                this.V = z13;
                                continue;
                            default:
                                if (parseUnknownField(B2, gVar)) {
                                    continue;
                                }
                                break;
                        }
                        z3 = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.d(this);
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.d(this);
                        throw new RuntimeException(invalidProtocolBufferException);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                break;
            case 3:
                return null;
            case 4:
                return new BetamaxPlaybackSession();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (X == null) {
                    synchronized (BetamaxPlaybackSession.class) {
                        if (X == null) {
                            X = new GeneratedMessageLite.c(W);
                        }
                    }
                }
                return X;
            default:
                throw new UnsupportedOperationException();
        }
        return W;
    }

    public boolean e0() {
        return (this.a & 4) == 4;
    }

    public boolean f0() {
        return (this.a & 1024) == 1024;
    }

    public boolean g0() {
        return (this.a & 2048) == 2048;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.p(1, this.c);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.p(2, this.f);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.p(3, this.n);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.l(4, this.o);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.j(5, this.p);
        }
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.l(6, this.q);
        }
        if ((this.a & 64) == 64) {
            i2 += CodedOutputStream.l(7, this.r);
        }
        if ((this.a & 128) == 128) {
            i2 += CodedOutputStream.l(8, this.s);
        }
        if ((this.a & 256) == 256) {
            i2 += CodedOutputStream.l(9, this.t);
        }
        if ((this.a & 512) == 512) {
            i2 += CodedOutputStream.l(10, this.u);
        }
        if ((this.a & 1024) == 1024) {
            i2 += CodedOutputStream.l(11, this.v);
        }
        if ((this.a & 2048) == 2048) {
            i2 += CodedOutputStream.l(12, this.w);
        }
        if ((this.a & 4096) == 4096) {
            i2 += CodedOutputStream.l(13, this.x);
        }
        if ((this.a & 8192) == 8192) {
            i2 += CodedOutputStream.l(14, this.y);
        }
        if ((this.a & 16384) == 16384) {
            i2 += CodedOutputStream.j(15, this.z);
        }
        if ((this.a & 32768) == 32768) {
            i2 += CodedOutputStream.j(16, this.A);
        }
        if ((this.a & 65536) == 65536) {
            i2 += CodedOutputStream.j(17, this.B);
        }
        if ((this.a & 131072) == 131072) {
            i2 += CodedOutputStream.l(18, this.C);
        }
        if ((this.a & 262144) == 262144) {
            i2 += CodedOutputStream.l(19, this.D);
        }
        if ((this.a & 524288) == 524288) {
            i2 += CodedOutputStream.l(20, this.E);
        }
        if ((this.a & 1048576) == 1048576) {
            i2 += CodedOutputStream.l(21, this.F);
        }
        if ((this.a & 2097152) == 2097152) {
            i2 += CodedOutputStream.p(22, this.G);
        }
        if ((this.a & 4194304) == 4194304) {
            i2 += CodedOutputStream.p(23, this.H);
        }
        if ((this.a & 8388608) == 8388608) {
            i2 += CodedOutputStream.j(24, this.I);
        }
        if ((this.a & 16777216) == 16777216) {
            i2 += CodedOutputStream.p(25, this.J);
        }
        if ((this.a & 33554432) == 33554432) {
            i2 += CodedOutputStream.l(26, this.K);
        }
        if ((this.a & 67108864) == 67108864) {
            i2 += CodedOutputStream.l(27, this.L);
        }
        if ((this.a & 134217728) == 134217728) {
            i2 += CodedOutputStream.j(28, this.M);
        }
        if ((this.a & 268435456) == 268435456) {
            i2 += CodedOutputStream.l(29, this.N);
        }
        if ((this.a & 536870912) == 536870912) {
            i2 += CodedOutputStream.i(30, this.O);
        }
        if ((this.a & 1073741824) == 1073741824) {
            i2 += CodedOutputStream.p(31, this.P);
        }
        if ((this.a & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            i2 += CodedOutputStream.i(32, this.Q);
        }
        if ((this.b & 1) == 1) {
            i2 += CodedOutputStream.p(33, this.R);
        }
        if ((this.b & 2) == 2) {
            i2 += CodedOutputStream.l(34, this.S);
        }
        if ((this.b & 4) == 4) {
            i2 += CodedOutputStream.d(35, this.T);
        }
        if ((this.b & 8) == 8) {
            i2 += CodedOutputStream.p(36, this.U);
        }
        if ((this.b & 16) == 16) {
            i2 += CodedOutputStream.p(37, this.V);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public boolean h0() {
        return (this.a & 4096) == 4096;
    }

    public boolean i0() {
        return (this.a & 8192) == 8192;
    }

    public boolean j0() {
        return (this.a & 32) == 32;
    }

    public boolean k0() {
        return (this.a & 256) == 256;
    }

    public boolean l0() {
        return (this.a & 512) == 512;
    }

    public boolean m0() {
        return (this.a & 128) == 128;
    }

    public boolean n0() {
        return (this.a & 131072) == 131072;
    }

    public boolean o0() {
        return (this.a & 262144) == 262144;
    }

    public boolean p0() {
        return (this.a & 524288) == 524288;
    }

    public boolean q0() {
        return (this.b & 2) == 2;
    }

    public boolean r0() {
        return (this.a & 1048576) == 1048576;
    }

    public boolean s0() {
        return (this.a & 8) == 8;
    }

    public boolean t0() {
        return (this.a & 64) == 64;
    }

    public boolean u0() {
        return (this.a & 268435456) == 268435456;
    }

    public boolean v0() {
        return (this.a & 32768) == 32768;
    }

    public boolean w0() {
        return (this.a & 65536) == 65536;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.c);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(2, this.f);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.P(3, this.n);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.U(4, this.o);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.K(5, this.p);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.U(6, this.q);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.U(7, this.r);
        }
        if ((this.a & 128) == 128) {
            codedOutputStream.U(8, this.s);
        }
        if ((this.a & 256) == 256) {
            codedOutputStream.U(9, this.t);
        }
        if ((this.a & 512) == 512) {
            codedOutputStream.U(10, this.u);
        }
        if ((this.a & 1024) == 1024) {
            codedOutputStream.U(11, this.v);
        }
        if ((this.a & 2048) == 2048) {
            codedOutputStream.U(12, this.w);
        }
        if ((this.a & 4096) == 4096) {
            codedOutputStream.U(13, this.x);
        }
        if ((this.a & 8192) == 8192) {
            codedOutputStream.U(14, this.y);
        }
        if ((this.a & 16384) == 16384) {
            codedOutputStream.K(15, this.z);
        }
        if ((this.a & 32768) == 32768) {
            codedOutputStream.K(16, this.A);
        }
        if ((this.a & 65536) == 65536) {
            codedOutputStream.K(17, this.B);
        }
        if ((this.a & 131072) == 131072) {
            codedOutputStream.U(18, this.C);
        }
        if ((this.a & 262144) == 262144) {
            codedOutputStream.U(19, this.D);
        }
        if ((this.a & 524288) == 524288) {
            codedOutputStream.U(20, this.E);
        }
        if ((this.a & 1048576) == 1048576) {
            codedOutputStream.U(21, this.F);
        }
        if ((this.a & 2097152) == 2097152) {
            codedOutputStream.P(22, this.G);
        }
        if ((this.a & 4194304) == 4194304) {
            codedOutputStream.P(23, this.H);
        }
        if ((this.a & 8388608) == 8388608) {
            codedOutputStream.K(24, this.I);
        }
        if ((this.a & 16777216) == 16777216) {
            codedOutputStream.P(25, this.J);
        }
        if ((this.a & 33554432) == 33554432) {
            codedOutputStream.U(26, this.K);
        }
        if ((this.a & 67108864) == 67108864) {
            codedOutputStream.U(27, this.L);
        }
        if ((this.a & 134217728) == 134217728) {
            codedOutputStream.K(28, this.M);
        }
        if ((this.a & 268435456) == 268435456) {
            codedOutputStream.U(29, this.N);
        }
        if ((this.a & 536870912) == 536870912) {
            codedOutputStream.J(30, this.O);
        }
        if ((this.a & 1073741824) == 1073741824) {
            codedOutputStream.P(31, this.P);
        }
        if ((this.a & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            codedOutputStream.J(32, this.Q);
        }
        if ((this.b & 1) == 1) {
            codedOutputStream.P(33, this.R);
        }
        if ((this.b & 2) == 2) {
            codedOutputStream.U(34, this.S);
        }
        if ((this.b & 4) == 4) {
            codedOutputStream.A(35, this.T);
        }
        if ((this.b & 8) == 8) {
            codedOutputStream.P(36, this.U);
        }
        if ((this.b & 16) == 16) {
            codedOutputStream.P(37, this.V);
        }
        this.unknownFields.l(codedOutputStream);
    }

    public boolean x0() {
        return (this.a & 16384) == 16384;
    }

    public boolean y0() {
        return (this.a & 134217728) == 134217728;
    }

    public boolean z0() {
        return (this.a & 1) == 1;
    }
}
