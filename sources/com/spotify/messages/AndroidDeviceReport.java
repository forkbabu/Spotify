package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.x;

public final class AndroidDeviceReport extends GeneratedMessageLite<AndroidDeviceReport, b> implements Object {
    private static final AndroidDeviceReport x;
    private static volatile x<AndroidDeviceReport> y;
    private int a;
    private String b = "";
    private String c = "";
    private long f;
    private long n;
    private long o;
    private float p;
    private long q;
    private long r;
    private long s;
    private long t;
    private long u;
    private String v = "";
    private String w = "";

    public static final class b extends GeneratedMessageLite.b<AndroidDeviceReport, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            AndroidDeviceReport.s((AndroidDeviceReport) this.instance, str);
            return this;
        }

        public b n(long j) {
            copyOnWrite();
            AndroidDeviceReport.q((AndroidDeviceReport) this.instance, j);
            return this;
        }

        public b o(long j) {
            copyOnWrite();
            AndroidDeviceReport.p((AndroidDeviceReport) this.instance, j);
            return this;
        }

        public b p(long j) {
            copyOnWrite();
            AndroidDeviceReport.o((AndroidDeviceReport) this.instance, j);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            AndroidDeviceReport.t((AndroidDeviceReport) this.instance, str);
            return this;
        }

        public b r(String str) {
            copyOnWrite();
            AndroidDeviceReport.h((AndroidDeviceReport) this.instance, str);
            return this;
        }

        public b s(long j) {
            copyOnWrite();
            AndroidDeviceReport.v((AndroidDeviceReport) this.instance, j);
            return this;
        }

        public b t(long j) {
            copyOnWrite();
            AndroidDeviceReport.i((AndroidDeviceReport) this.instance, j);
            return this;
        }

        public b u(String str) {
            copyOnWrite();
            AndroidDeviceReport.r((AndroidDeviceReport) this.instance, str);
            return this;
        }

        public b v(long j) {
            copyOnWrite();
            AndroidDeviceReport.u((AndroidDeviceReport) this.instance, j);
            return this;
        }

        public b w(long j) {
            copyOnWrite();
            AndroidDeviceReport.n((AndroidDeviceReport) this.instance, j);
            return this;
        }

        public b x(float f) {
            copyOnWrite();
            AndroidDeviceReport.l((AndroidDeviceReport) this.instance, f);
            return this;
        }

        public b y(long j) {
            copyOnWrite();
            AndroidDeviceReport.m((AndroidDeviceReport) this.instance, j);
            return this;
        }

        private b() {
            super(AndroidDeviceReport.x);
        }
    }

    static {
        AndroidDeviceReport androidDeviceReport = new AndroidDeviceReport();
        x = androidDeviceReport;
        androidDeviceReport.makeImmutable();
    }

    private AndroidDeviceReport() {
    }

    static void h(AndroidDeviceReport androidDeviceReport, String str) {
        androidDeviceReport.getClass();
        str.getClass();
        androidDeviceReport.a |= 1;
        androidDeviceReport.b = str;
    }

    static void i(AndroidDeviceReport androidDeviceReport, long j) {
        androidDeviceReport.a |= 16;
        androidDeviceReport.o = j;
    }

    static void l(AndroidDeviceReport androidDeviceReport, float f2) {
        androidDeviceReport.a |= 32;
        androidDeviceReport.p = f2;
    }

    static void m(AndroidDeviceReport androidDeviceReport, long j) {
        androidDeviceReport.a |= 64;
        androidDeviceReport.q = j;
    }

    static void n(AndroidDeviceReport androidDeviceReport, long j) {
        androidDeviceReport.a |= 128;
        androidDeviceReport.r = j;
    }

    static void o(AndroidDeviceReport androidDeviceReport, long j) {
        androidDeviceReport.a |= 256;
        androidDeviceReport.s = j;
    }

    static void p(AndroidDeviceReport androidDeviceReport, long j) {
        androidDeviceReport.a |= 512;
        androidDeviceReport.t = j;
    }

    public static x<AndroidDeviceReport> parser() {
        return x.getParserForType();
    }

    static void q(AndroidDeviceReport androidDeviceReport, long j) {
        androidDeviceReport.a |= 1024;
        androidDeviceReport.u = j;
    }

    static void r(AndroidDeviceReport androidDeviceReport, String str) {
        androidDeviceReport.getClass();
        str.getClass();
        androidDeviceReport.a |= 2048;
        androidDeviceReport.v = str;
    }

    static void s(AndroidDeviceReport androidDeviceReport, String str) {
        androidDeviceReport.getClass();
        str.getClass();
        androidDeviceReport.a |= 4096;
        androidDeviceReport.w = str;
    }

    static void t(AndroidDeviceReport androidDeviceReport, String str) {
        androidDeviceReport.getClass();
        str.getClass();
        androidDeviceReport.a |= 2;
        androidDeviceReport.c = str;
    }

    static void u(AndroidDeviceReport androidDeviceReport, long j) {
        androidDeviceReport.a |= 4;
        androidDeviceReport.f = j;
    }

    static void v(AndroidDeviceReport androidDeviceReport, long j) {
        androidDeviceReport.a |= 8;
        androidDeviceReport.n = j;
    }

    public static b w() {
        return (b) x.toBuilder();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0109, code lost:
        if (parseUnknownField(r8, r0) == false) goto L_0x010b;
     */
    @Override // com.google.protobuf.GeneratedMessageLite
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke r26, java.lang.Object r27, java.lang.Object r28) {
        /*
        // Method dump skipped, instructions count: 810
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.messages.AndroidDeviceReport.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object");
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
            i2 += CodedOutputStream.l(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.l(4, this.n);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.l(5, this.o);
        }
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.i(6, this.p);
        }
        if ((this.a & 64) == 64) {
            i2 += CodedOutputStream.l(7, this.q);
        }
        if ((this.a & 128) == 128) {
            i2 += CodedOutputStream.l(8, this.r);
        }
        if ((this.a & 256) == 256) {
            i2 += CodedOutputStream.l(9, this.s);
        }
        if ((this.a & 512) == 512) {
            i2 += CodedOutputStream.l(10, this.t);
        }
        if ((this.a & 1024) == 1024) {
            i2 += CodedOutputStream.l(11, this.u);
        }
        if ((this.a & 2048) == 2048) {
            i2 += CodedOutputStream.p(12, this.v);
        }
        if ((this.a & 4096) == 4096) {
            i2 += CodedOutputStream.p(13, this.w);
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
            codedOutputStream.U(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.U(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.U(5, this.o);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.J(6, this.p);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.U(7, this.q);
        }
        if ((this.a & 128) == 128) {
            codedOutputStream.U(8, this.r);
        }
        if ((this.a & 256) == 256) {
            codedOutputStream.U(9, this.s);
        }
        if ((this.a & 512) == 512) {
            codedOutputStream.U(10, this.t);
        }
        if ((this.a & 1024) == 1024) {
            codedOutputStream.U(11, this.u);
        }
        if ((this.a & 2048) == 2048) {
            codedOutputStream.P(12, this.v);
        }
        if ((this.a & 4096) == 4096) {
            codedOutputStream.P(13, this.w);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
