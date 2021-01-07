package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class UbiExpr2PageView extends GeneratedMessageLite<UbiExpr2PageView, b> implements Object {
    private static final UbiExpr2PageView v;
    private static volatile x<UbiExpr2PageView> w;
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
    private o.i<String> t = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> u = GeneratedMessageLite.emptyProtobufList();

    public static final class b extends GeneratedMessageLite.b<UbiExpr2PageView, b> implements Object {
        public b m(Iterable<String> iterable) {
            copyOnWrite();
            UbiExpr2PageView.r((UbiExpr2PageView) this.instance, iterable);
            return this;
        }

        public b n(Iterable<String> iterable) {
            copyOnWrite();
            UbiExpr2PageView.q((UbiExpr2PageView) this.instance, iterable);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            UbiExpr2PageView.t((UbiExpr2PageView) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            UbiExpr2PageView.n((UbiExpr2PageView) this.instance, str);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            UbiExpr2PageView.o((UbiExpr2PageView) this.instance, str);
            return this;
        }

        public b r(String str) {
            copyOnWrite();
            UbiExpr2PageView.m((UbiExpr2PageView) this.instance, str);
            return this;
        }

        public b s(String str) {
            copyOnWrite();
            UbiExpr2PageView.l((UbiExpr2PageView) this.instance, str);
            return this;
        }

        public b t(String str) {
            copyOnWrite();
            UbiExpr2PageView.p((UbiExpr2PageView) this.instance, str);
            return this;
        }

        public b u(String str) {
            copyOnWrite();
            UbiExpr2PageView.i((UbiExpr2PageView) this.instance, str);
            return this;
        }

        public b v(String str) {
            copyOnWrite();
            UbiExpr2PageView.s((UbiExpr2PageView) this.instance, str);
            return this;
        }

        public b w(String str) {
            copyOnWrite();
            UbiExpr2PageView.h((UbiExpr2PageView) this.instance, str);
            return this;
        }

        private b() {
            super(UbiExpr2PageView.v);
        }
    }

    static {
        UbiExpr2PageView ubiExpr2PageView = new UbiExpr2PageView();
        v = ubiExpr2PageView;
        ubiExpr2PageView.makeImmutable();
    }

    private UbiExpr2PageView() {
    }

    static void h(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        str.getClass();
        ubiExpr2PageView.a |= 1;
        ubiExpr2PageView.b = str;
    }

    static void i(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        str.getClass();
        ubiExpr2PageView.a |= 8;
        ubiExpr2PageView.n = str;
    }

    static void l(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        str.getClass();
        ubiExpr2PageView.a |= 16;
        ubiExpr2PageView.o = str;
    }

    static void m(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        str.getClass();
        ubiExpr2PageView.a |= 32;
        ubiExpr2PageView.p = str;
    }

    static void n(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        str.getClass();
        ubiExpr2PageView.a |= 64;
        ubiExpr2PageView.q = str;
    }

    static void o(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        str.getClass();
        ubiExpr2PageView.a |= 128;
        ubiExpr2PageView.r = str;
    }

    static void p(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        str.getClass();
        ubiExpr2PageView.a |= 256;
        ubiExpr2PageView.s = str;
    }

    public static x<UbiExpr2PageView> parser() {
        return v.getParserForType();
    }

    static void q(UbiExpr2PageView ubiExpr2PageView, Iterable iterable) {
        if (!ubiExpr2PageView.t.R0()) {
            ubiExpr2PageView.t = GeneratedMessageLite.mutableCopy(ubiExpr2PageView.t);
        }
        com.google.protobuf.a.addAll(iterable, ubiExpr2PageView.t);
    }

    static void r(UbiExpr2PageView ubiExpr2PageView, Iterable iterable) {
        if (!ubiExpr2PageView.u.R0()) {
            ubiExpr2PageView.u = GeneratedMessageLite.mutableCopy(ubiExpr2PageView.u);
        }
        com.google.protobuf.a.addAll(iterable, ubiExpr2PageView.u);
    }

    static void s(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        str.getClass();
        ubiExpr2PageView.a |= 2;
        ubiExpr2PageView.c = str;
    }

    static void t(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        str.getClass();
        ubiExpr2PageView.a |= 4;
        ubiExpr2PageView.f = str;
    }

    public static b u() {
        return (b) v.toBuilder();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = true;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return v;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                UbiExpr2PageView ubiExpr2PageView = (UbiExpr2PageView) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (ubiExpr2PageView.a & 1) == 1, ubiExpr2PageView.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (ubiExpr2PageView.a & 2) == 2, ubiExpr2PageView.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (ubiExpr2PageView.a & 4) == 4, ubiExpr2PageView.f);
                this.n = hVar.n((this.a & 8) == 8, this.n, (ubiExpr2PageView.a & 8) == 8, ubiExpr2PageView.n);
                this.o = hVar.n((this.a & 16) == 16, this.o, (ubiExpr2PageView.a & 16) == 16, ubiExpr2PageView.o);
                this.p = hVar.n((this.a & 32) == 32, this.p, (ubiExpr2PageView.a & 32) == 32, ubiExpr2PageView.p);
                this.q = hVar.n((this.a & 64) == 64, this.q, (ubiExpr2PageView.a & 64) == 64, ubiExpr2PageView.q);
                this.r = hVar.n((this.a & 128) == 128, this.r, (ubiExpr2PageView.a & 128) == 128, ubiExpr2PageView.r);
                boolean z2 = (this.a & 256) == 256;
                String str = this.s;
                if ((ubiExpr2PageView.a & 256) != 256) {
                    z = false;
                }
                this.s = hVar.n(z2, str, z, ubiExpr2PageView.s);
                this.t = hVar.q(this.t, ubiExpr2PageView.t);
                this.u = hVar.q(this.u, ubiExpr2PageView.u);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= ubiExpr2PageView.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int B = gVar.B();
                        switch (B) {
                            case 0:
                                break;
                            case 10:
                                String z4 = gVar.z();
                                this.a |= 1;
                                this.b = z4;
                                continue;
                            case 18:
                                String z5 = gVar.z();
                                this.a |= 2;
                                this.c = z5;
                                continue;
                            case 26:
                                String z6 = gVar.z();
                                this.a |= 4;
                                this.f = z6;
                                continue;
                            case 34:
                                String z7 = gVar.z();
                                this.a |= 8;
                                this.n = z7;
                                continue;
                            case 42:
                                String z8 = gVar.z();
                                this.a |= 16;
                                this.o = z8;
                                continue;
                            case 50:
                                String z9 = gVar.z();
                                this.a |= 32;
                                this.p = z9;
                                continue;
                            case 58:
                                String z10 = gVar.z();
                                this.a |= 64;
                                this.q = z10;
                                continue;
                            case 66:
                                String z11 = gVar.z();
                                this.a |= 128;
                                this.r = z11;
                                continue;
                            case 74:
                                String z12 = gVar.z();
                                this.a |= 256;
                                this.s = z12;
                                continue;
                            case 82:
                                String z13 = gVar.z();
                                if (!this.t.R0()) {
                                    this.t = GeneratedMessageLite.mutableCopy(this.t);
                                }
                                this.t.add(z13);
                                continue;
                            case 90:
                                String z14 = gVar.z();
                                if (!this.u.R0()) {
                                    this.u = GeneratedMessageLite.mutableCopy(this.u);
                                }
                                this.u.add(z14);
                                continue;
                            default:
                                if (parseUnknownField(B, gVar)) {
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
                    }
                }
                break;
            case 3:
                this.t.C();
                this.u.C();
                return null;
            case 4:
                return new UbiExpr2PageView();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (w == null) {
                    synchronized (UbiExpr2PageView.class) {
                        if (w == null) {
                            w = new GeneratedMessageLite.c(v);
                        }
                    }
                }
                return w;
            default:
                throw new UnsupportedOperationException();
        }
        return v;
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
            p2 += CodedOutputStream.p(5, this.o);
        }
        if ((this.a & 32) == 32) {
            p2 += CodedOutputStream.p(6, this.p);
        }
        if ((this.a & 64) == 64) {
            p2 += CodedOutputStream.p(7, this.q);
        }
        if ((this.a & 128) == 128) {
            p2 += CodedOutputStream.p(8, this.r);
        }
        if ((this.a & 256) == 256) {
            p2 += CodedOutputStream.p(9, this.s);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.t.size(); i3++) {
            i2 += CodedOutputStream.q(this.t.get(i3));
        }
        int C0 = je.C0(this.t, 1, p2 + i2);
        int i4 = 0;
        for (int i5 = 0; i5 < this.u.size(); i5++) {
            i4 += CodedOutputStream.q(this.u.get(i5));
        }
        int c2 = this.unknownFields.c() + je.C0(this.u, 1, C0 + i4);
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
        for (int i = 0; i < this.t.size(); i++) {
            codedOutputStream.P(10, this.t.get(i));
        }
        for (int i2 = 0; i2 < this.u.size(); i2++) {
            codedOutputStream.P(11, this.u.get(i2));
        }
        this.unknownFields.l(codedOutputStream);
    }
}
