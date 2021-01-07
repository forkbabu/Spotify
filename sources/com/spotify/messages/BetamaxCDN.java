package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.x;

public final class BetamaxCDN extends GeneratedMessageLite<BetamaxCDN, b> implements Object {
    private static final BetamaxCDN y;
    private static volatile x<BetamaxCDN> z;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private int n;
    private String o = "";
    private String p = "";
    private String q = "";
    private String r = "";
    private String s = "";
    private long t;
    private long u;
    private String v = "";
    private String w = "";
    private String x = "";

    public static final class b extends GeneratedMessageLite.b<BetamaxCDN, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            BetamaxCDN.u((BetamaxCDN) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            BetamaxCDN.v((BetamaxCDN) this.instance, str);
            return this;
        }

        public b o(long j) {
            copyOnWrite();
            BetamaxCDN.q((BetamaxCDN) this.instance, j);
            return this;
        }

        public b p(long j) {
            copyOnWrite();
            BetamaxCDN.r((BetamaxCDN) this.instance, j);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            BetamaxCDN.s((BetamaxCDN) this.instance, str);
            return this;
        }

        public b r(String str) {
            copyOnWrite();
            BetamaxCDN.t((BetamaxCDN) this.instance, str);
            return this;
        }

        public b s(String str) {
            copyOnWrite();
            BetamaxCDN.h((BetamaxCDN) this.instance, str);
            return this;
        }

        public b t(int i) {
            copyOnWrite();
            BetamaxCDN.i((BetamaxCDN) this.instance, i);
            return this;
        }

        public b u(String str) {
            copyOnWrite();
            BetamaxCDN.m((BetamaxCDN) this.instance, str);
            return this;
        }

        public b v(String str) {
            copyOnWrite();
            BetamaxCDN.w((BetamaxCDN) this.instance, str);
            return this;
        }

        public b w(String str) {
            copyOnWrite();
            BetamaxCDN.l((BetamaxCDN) this.instance, str);
            return this;
        }

        public b x(String str) {
            copyOnWrite();
            BetamaxCDN.n((BetamaxCDN) this.instance, str);
            return this;
        }

        public b y(String str) {
            copyOnWrite();
            BetamaxCDN.o((BetamaxCDN) this.instance, str);
            return this;
        }

        public b z(String str) {
            copyOnWrite();
            BetamaxCDN.p((BetamaxCDN) this.instance, str);
            return this;
        }

        private b() {
            super(BetamaxCDN.y);
        }
    }

    static {
        BetamaxCDN betamaxCDN = new BetamaxCDN();
        y = betamaxCDN;
        betamaxCDN.makeImmutable();
    }

    private BetamaxCDN() {
    }

    static void h(BetamaxCDN betamaxCDN, String str) {
        betamaxCDN.getClass();
        str.getClass();
        betamaxCDN.a |= 1;
        betamaxCDN.b = str;
    }

    static void i(BetamaxCDN betamaxCDN, int i) {
        betamaxCDN.a |= 8;
        betamaxCDN.n = i;
    }

    static void l(BetamaxCDN betamaxCDN, String str) {
        betamaxCDN.getClass();
        str.getClass();
        betamaxCDN.a |= 16;
        betamaxCDN.o = str;
    }

    static void m(BetamaxCDN betamaxCDN, String str) {
        betamaxCDN.getClass();
        str.getClass();
        betamaxCDN.a |= 32;
        betamaxCDN.p = str;
    }

    static void n(BetamaxCDN betamaxCDN, String str) {
        betamaxCDN.getClass();
        str.getClass();
        betamaxCDN.a |= 64;
        betamaxCDN.q = str;
    }

    static void o(BetamaxCDN betamaxCDN, String str) {
        betamaxCDN.getClass();
        str.getClass();
        betamaxCDN.a |= 128;
        betamaxCDN.r = str;
    }

    static void p(BetamaxCDN betamaxCDN, String str) {
        betamaxCDN.getClass();
        str.getClass();
        betamaxCDN.a |= 256;
        betamaxCDN.s = str;
    }

    public static x<BetamaxCDN> parser() {
        return y.getParserForType();
    }

    static void q(BetamaxCDN betamaxCDN, long j) {
        betamaxCDN.a |= 512;
        betamaxCDN.t = j;
    }

    static void r(BetamaxCDN betamaxCDN, long j) {
        betamaxCDN.a |= 1024;
        betamaxCDN.u = j;
    }

    static void s(BetamaxCDN betamaxCDN, String str) {
        betamaxCDN.getClass();
        str.getClass();
        betamaxCDN.a |= 2048;
        betamaxCDN.v = str;
    }

    static void t(BetamaxCDN betamaxCDN, String str) {
        betamaxCDN.getClass();
        str.getClass();
        betamaxCDN.a |= 4096;
        betamaxCDN.w = str;
    }

    static void u(BetamaxCDN betamaxCDN, String str) {
        betamaxCDN.getClass();
        str.getClass();
        betamaxCDN.a |= 8192;
        betamaxCDN.x = str;
    }

    static void v(BetamaxCDN betamaxCDN, String str) {
        betamaxCDN.getClass();
        str.getClass();
        betamaxCDN.a |= 2;
        betamaxCDN.c = str;
    }

    static void w(BetamaxCDN betamaxCDN, String str) {
        betamaxCDN.getClass();
        str.getClass();
        betamaxCDN.a |= 4;
        betamaxCDN.f = str;
    }

    public static b x() {
        return (b) y.toBuilder();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0131, code lost:
        if (parseUnknownField(r2, r0) == false) goto L_0x0133;
     */
    @Override // com.google.protobuf.GeneratedMessageLite
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke r18, java.lang.Object r19, java.lang.Object r20) {
        /*
        // Method dump skipped, instructions count: 830
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.messages.BetamaxCDN.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object");
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
            i2 += CodedOutputStream.p(4, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.j(5, this.n);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.p(6, this.o);
        }
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.p(7, this.p);
        }
        if ((this.a & 64) == 64) {
            i2 += CodedOutputStream.p(8, this.q);
        }
        if ((this.a & 128) == 128) {
            i2 += CodedOutputStream.p(9, this.r);
        }
        if ((this.a & 256) == 256) {
            i2 += CodedOutputStream.p(10, this.s);
        }
        if ((this.a & 512) == 512) {
            i2 += CodedOutputStream.l(11, this.t);
        }
        if ((this.a & 1024) == 1024) {
            i2 += CodedOutputStream.l(12, this.u);
        }
        if ((this.a & 2048) == 2048) {
            i2 += CodedOutputStream.p(13, this.v);
        }
        if ((this.a & 4096) == 4096) {
            i2 += CodedOutputStream.p(14, this.w);
        }
        if ((this.a & 8192) == 8192) {
            i2 += CodedOutputStream.p(15, this.x);
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
            codedOutputStream.P(4, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.K(5, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.P(6, this.o);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.P(7, this.p);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.P(8, this.q);
        }
        if ((this.a & 128) == 128) {
            codedOutputStream.P(9, this.r);
        }
        if ((this.a & 256) == 256) {
            codedOutputStream.P(10, this.s);
        }
        if ((this.a & 512) == 512) {
            codedOutputStream.U(11, this.t);
        }
        if ((this.a & 1024) == 1024) {
            codedOutputStream.U(12, this.u);
        }
        if ((this.a & 2048) == 2048) {
            codedOutputStream.P(13, this.v);
        }
        if ((this.a & 4096) == 4096) {
            codedOutputStream.P(14, this.w);
        }
        if ((this.a & 8192) == 8192) {
            codedOutputStream.P(15, this.x);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
