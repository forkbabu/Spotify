package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class HomeCardImpressionSizeEvent extends GeneratedMessageLite<HomeCardImpressionSizeEvent, b> implements Object {
    private static final HomeCardImpressionSizeEvent u;
    private static volatile x<HomeCardImpressionSizeEvent> v;
    private int a;
    private String b = "";
    private String c = "";
    private int f;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;

    public static final class b extends GeneratedMessageLite.b<HomeCardImpressionSizeEvent, b> implements Object {
        public b m(int i) {
            copyOnWrite();
            HomeCardImpressionSizeEvent.l((HomeCardImpressionSizeEvent) this.instance, i);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            HomeCardImpressionSizeEvent.h((HomeCardImpressionSizeEvent) this.instance, str);
            return this;
        }

        public b o(int i) {
            copyOnWrite();
            HomeCardImpressionSizeEvent.i((HomeCardImpressionSizeEvent) this.instance, i);
            return this;
        }

        public b p(int i) {
            copyOnWrite();
            HomeCardImpressionSizeEvent.r((HomeCardImpressionSizeEvent) this.instance, i);
            return this;
        }

        public b q(int i) {
            copyOnWrite();
            HomeCardImpressionSizeEvent.o((HomeCardImpressionSizeEvent) this.instance, i);
            return this;
        }

        public b r(int i) {
            copyOnWrite();
            HomeCardImpressionSizeEvent.p((HomeCardImpressionSizeEvent) this.instance, i);
            return this;
        }

        public b s(String str) {
            copyOnWrite();
            HomeCardImpressionSizeEvent.q((HomeCardImpressionSizeEvent) this.instance, str);
            return this;
        }

        public b t(int i) {
            copyOnWrite();
            HomeCardImpressionSizeEvent.s((HomeCardImpressionSizeEvent) this.instance, i);
            return this;
        }

        public b u(int i) {
            copyOnWrite();
            HomeCardImpressionSizeEvent.n((HomeCardImpressionSizeEvent) this.instance, i);
            return this;
        }

        public b v(int i) {
            copyOnWrite();
            HomeCardImpressionSizeEvent.m((HomeCardImpressionSizeEvent) this.instance, i);
            return this;
        }

        private b() {
            super(HomeCardImpressionSizeEvent.u);
        }
    }

    static {
        HomeCardImpressionSizeEvent homeCardImpressionSizeEvent = new HomeCardImpressionSizeEvent();
        u = homeCardImpressionSizeEvent;
        homeCardImpressionSizeEvent.makeImmutable();
    }

    private HomeCardImpressionSizeEvent() {
    }

    static void h(HomeCardImpressionSizeEvent homeCardImpressionSizeEvent, String str) {
        homeCardImpressionSizeEvent.getClass();
        str.getClass();
        homeCardImpressionSizeEvent.a |= 1;
        homeCardImpressionSizeEvent.b = str;
    }

    static void i(HomeCardImpressionSizeEvent homeCardImpressionSizeEvent, int i) {
        homeCardImpressionSizeEvent.a |= 16;
        homeCardImpressionSizeEvent.o = i;
    }

    static void l(HomeCardImpressionSizeEvent homeCardImpressionSizeEvent, int i) {
        homeCardImpressionSizeEvent.a |= 32;
        homeCardImpressionSizeEvent.p = i;
    }

    static void m(HomeCardImpressionSizeEvent homeCardImpressionSizeEvent, int i) {
        homeCardImpressionSizeEvent.a |= 64;
        homeCardImpressionSizeEvent.q = i;
    }

    static void n(HomeCardImpressionSizeEvent homeCardImpressionSizeEvent, int i) {
        homeCardImpressionSizeEvent.a |= 128;
        homeCardImpressionSizeEvent.r = i;
    }

    static void o(HomeCardImpressionSizeEvent homeCardImpressionSizeEvent, int i) {
        homeCardImpressionSizeEvent.a |= 256;
        homeCardImpressionSizeEvent.s = i;
    }

    static void p(HomeCardImpressionSizeEvent homeCardImpressionSizeEvent, int i) {
        homeCardImpressionSizeEvent.a |= 512;
        homeCardImpressionSizeEvent.t = i;
    }

    public static x<HomeCardImpressionSizeEvent> parser() {
        return u.getParserForType();
    }

    static void q(HomeCardImpressionSizeEvent homeCardImpressionSizeEvent, String str) {
        homeCardImpressionSizeEvent.getClass();
        str.getClass();
        homeCardImpressionSizeEvent.a |= 2;
        homeCardImpressionSizeEvent.c = str;
    }

    static void r(HomeCardImpressionSizeEvent homeCardImpressionSizeEvent, int i) {
        homeCardImpressionSizeEvent.a |= 4;
        homeCardImpressionSizeEvent.f = i;
    }

    static void s(HomeCardImpressionSizeEvent homeCardImpressionSizeEvent, int i) {
        homeCardImpressionSizeEvent.a |= 8;
        homeCardImpressionSizeEvent.n = i;
    }

    public static b t() {
        return (b) u.toBuilder();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return u;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                HomeCardImpressionSizeEvent homeCardImpressionSizeEvent = (HomeCardImpressionSizeEvent) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (homeCardImpressionSizeEvent.a & 1) == 1, homeCardImpressionSizeEvent.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (homeCardImpressionSizeEvent.a & 2) == 2, homeCardImpressionSizeEvent.c);
                this.f = hVar.m((this.a & 4) == 4, this.f, (homeCardImpressionSizeEvent.a & 4) == 4, homeCardImpressionSizeEvent.f);
                this.n = hVar.m((this.a & 8) == 8, this.n, (homeCardImpressionSizeEvent.a & 8) == 8, homeCardImpressionSizeEvent.n);
                this.o = hVar.m((this.a & 16) == 16, this.o, (homeCardImpressionSizeEvent.a & 16) == 16, homeCardImpressionSizeEvent.o);
                this.p = hVar.m((this.a & 32) == 32, this.p, (homeCardImpressionSizeEvent.a & 32) == 32, homeCardImpressionSizeEvent.p);
                this.q = hVar.m((this.a & 64) == 64, this.q, (homeCardImpressionSizeEvent.a & 64) == 64, homeCardImpressionSizeEvent.q);
                this.r = hVar.m((this.a & 128) == 128, this.r, (homeCardImpressionSizeEvent.a & 128) == 128, homeCardImpressionSizeEvent.r);
                this.s = hVar.m((this.a & 256) == 256, this.s, (homeCardImpressionSizeEvent.a & 256) == 256, homeCardImpressionSizeEvent.s);
                this.t = hVar.m((this.a & 512) == 512, this.t, (homeCardImpressionSizeEvent.a & 512) == 512, homeCardImpressionSizeEvent.t);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= homeCardImpressionSizeEvent.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int B = gVar.B();
                        switch (B) {
                            case 0:
                                break;
                            case 10:
                                String z2 = gVar.z();
                                this.a |= 1;
                                this.b = z2;
                                continue;
                            case 18:
                                String z3 = gVar.z();
                                this.a |= 2;
                                this.c = z3;
                                continue;
                            case 24:
                                this.a |= 4;
                                this.f = gVar.u();
                                continue;
                            case 32:
                                this.a |= 8;
                                this.n = gVar.u();
                                continue;
                            case 40:
                                this.a |= 16;
                                this.o = gVar.u();
                                continue;
                            case 48:
                                this.a |= 32;
                                this.p = gVar.u();
                                continue;
                            case 56:
                                this.a |= 64;
                                this.q = gVar.u();
                                continue;
                            case 64:
                                this.a |= 128;
                                this.r = gVar.u();
                                continue;
                            case 72:
                                this.a |= 256;
                                this.s = gVar.u();
                                continue;
                            case 80:
                                this.a |= 512;
                                this.t = gVar.u();
                                continue;
                            default:
                                if (parseUnknownField(B, gVar)) {
                                    continue;
                                }
                                break;
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
                return new HomeCardImpressionSizeEvent();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (v == null) {
                    synchronized (HomeCardImpressionSizeEvent.class) {
                        if (v == null) {
                            v = new GeneratedMessageLite.c(u);
                        }
                    }
                }
                return v;
            default:
                throw new UnsupportedOperationException();
        }
        return u;
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
            i2 += CodedOutputStream.j(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.j(4, this.n);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.j(5, this.o);
        }
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.j(6, this.p);
        }
        if ((this.a & 64) == 64) {
            i2 += CodedOutputStream.j(7, this.q);
        }
        if ((this.a & 128) == 128) {
            i2 += CodedOutputStream.j(8, this.r);
        }
        if ((this.a & 256) == 256) {
            i2 += CodedOutputStream.j(9, this.s);
        }
        if ((this.a & 512) == 512) {
            i2 += CodedOutputStream.j(10, this.t);
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
            codedOutputStream.K(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.K(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.K(5, this.o);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.K(6, this.p);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.K(7, this.q);
        }
        if ((this.a & 128) == 128) {
            codedOutputStream.K(8, this.r);
        }
        if ((this.a & 256) == 256) {
            codedOutputStream.K(9, this.s);
        }
        if ((this.a & 512) == 512) {
            codedOutputStream.K(10, this.t);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
