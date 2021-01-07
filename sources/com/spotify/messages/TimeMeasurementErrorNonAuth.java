package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.k;
import com.google.protobuf.t;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.Map;

public final class TimeMeasurementErrorNonAuth extends GeneratedMessageLite<TimeMeasurementErrorNonAuth, b> implements Object {
    private static final TimeMeasurementErrorNonAuth y;
    private static volatile x<TimeMeasurementErrorNonAuth> z;
    private int a;
    private int b;
    private MapFieldLite<String, String> c = MapFieldLite.d();
    private MapFieldLite<String, Long> f = MapFieldLite.d();
    private MapFieldLite<String, String> n = MapFieldLite.d();
    private String o = "";
    private MapFieldLite<String, String> p = MapFieldLite.d();
    private MapFieldLite<String, Long> q = MapFieldLite.d();
    private MapFieldLite<String, Long> r = MapFieldLite.d();
    private MapFieldLite<String, String> s = MapFieldLite.d();
    private String t = "";
    private String u = "";
    private String v = "";
    private long w;
    private MapFieldLite<String, String> x = MapFieldLite.d();

    public static final class b extends GeneratedMessageLite.b<TimeMeasurementErrorNonAuth, b> implements Object {
        private b() {
            super(TimeMeasurementErrorNonAuth.y);
        }
    }

    private static final class c {
        static final t<String, String> a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = t.b(fieldType, "", fieldType, "");
        }
    }

    private static final class d {
        static final t<String, String> a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = t.b(fieldType, "", fieldType, "");
        }
    }

    private static final class e {
        static final t<String, String> a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = t.b(fieldType, "", fieldType, "");
        }
    }

    private static final class f {
        static final t<String, String> a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = t.b(fieldType, "", fieldType, "");
        }
    }

    private static final class g {
        static final t<String, Long> a = t.b(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT64, 0L);
    }

    private static final class h {
        static final t<String, Long> a = t.b(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT64, 0L);
    }

    private static final class i {
        static final t<String, String> a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = t.b(fieldType, "", fieldType, "");
        }
    }

    private static final class j {
        static final t<String, Long> a = t.b(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT64, 0L);
    }

    static {
        TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth = new TimeMeasurementErrorNonAuth();
        y = timeMeasurementErrorNonAuth;
        timeMeasurementErrorNonAuth.makeImmutable();
    }

    private TimeMeasurementErrorNonAuth() {
    }

    public static b h() {
        return (b) y.toBuilder();
    }

    public static x<TimeMeasurementErrorNonAuth> parser() {
        return y.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z2 = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return y;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth = (TimeMeasurementErrorNonAuth) obj2;
                this.b = hVar.m((this.a & 1) == 1, this.b, (timeMeasurementErrorNonAuth.a & 1) == 1, timeMeasurementErrorNonAuth.b);
                this.c = hVar.c(this.c, timeMeasurementErrorNonAuth.c);
                this.f = hVar.c(this.f, timeMeasurementErrorNonAuth.f);
                this.n = hVar.c(this.n, timeMeasurementErrorNonAuth.n);
                this.o = hVar.n((this.a & 2) == 2, this.o, (timeMeasurementErrorNonAuth.a & 2) == 2, timeMeasurementErrorNonAuth.o);
                this.p = hVar.c(this.p, timeMeasurementErrorNonAuth.p);
                this.q = hVar.c(this.q, timeMeasurementErrorNonAuth.q);
                this.r = hVar.c(this.r, timeMeasurementErrorNonAuth.r);
                this.s = hVar.c(this.s, timeMeasurementErrorNonAuth.s);
                this.t = hVar.n((this.a & 4) == 4, this.t, (timeMeasurementErrorNonAuth.a & 4) == 4, timeMeasurementErrorNonAuth.t);
                this.u = hVar.n((this.a & 8) == 8, this.u, (timeMeasurementErrorNonAuth.a & 8) == 8, timeMeasurementErrorNonAuth.u);
                this.v = hVar.n((this.a & 16) == 16, this.v, (timeMeasurementErrorNonAuth.a & 16) == 16, timeMeasurementErrorNonAuth.v);
                this.w = hVar.s((this.a & 32) == 32, this.w, (timeMeasurementErrorNonAuth.a & 32) == 32, timeMeasurementErrorNonAuth.w);
                this.x = hVar.c(this.x, timeMeasurementErrorNonAuth.x);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= timeMeasurementErrorNonAuth.a;
                }
                return this;
            case 2:
                com.google.protobuf.g gVar = (com.google.protobuf.g) obj;
                k kVar = (k) obj2;
                while (!z2) {
                    try {
                        int B = gVar.B();
                        switch (B) {
                            case 0:
                                break;
                            case 8:
                                this.a |= 1;
                                this.b = gVar.u();
                                continue;
                            case 18:
                                if (!this.c.f()) {
                                    this.c = this.c.k();
                                }
                                d.a.d(this.c, gVar, kVar);
                                continue;
                            case 26:
                                if (!this.f.f()) {
                                    this.f = this.f.k();
                                }
                                g.a.d(this.f, gVar, kVar);
                                continue;
                            case 34:
                                if (!this.n.f()) {
                                    this.n = this.n.k();
                                }
                                f.a.d(this.n, gVar, kVar);
                                continue;
                            case 42:
                                String z3 = gVar.z();
                                this.a |= 2;
                                this.o = z3;
                                continue;
                            case 50:
                                if (!this.p.f()) {
                                    this.p = this.p.k();
                                }
                                c.a.d(this.p, gVar, kVar);
                                continue;
                            case 58:
                                if (!this.q.f()) {
                                    this.q = this.q.k();
                                }
                                j.a.d(this.q, gVar, kVar);
                                continue;
                            case 66:
                                if (!this.r.f()) {
                                    this.r = this.r.k();
                                }
                                h.a.d(this.r, gVar, kVar);
                                continue;
                            case 74:
                                if (!this.s.f()) {
                                    this.s = this.s.k();
                                }
                                i.a.d(this.s, gVar, kVar);
                                continue;
                            case 82:
                                String z4 = gVar.z();
                                this.a |= 4;
                                this.t = z4;
                                continue;
                            case 90:
                                String z5 = gVar.z();
                                this.a |= 8;
                                this.u = z5;
                                continue;
                            case 98:
                                String z6 = gVar.z();
                                this.a |= 16;
                                this.v = z6;
                                continue;
                            case 104:
                                this.a |= 32;
                                this.w = gVar.w();
                                continue;
                            case 114:
                                if (!this.x.f()) {
                                    this.x = this.x.k();
                                }
                                e.a.d(this.x, gVar, kVar);
                                continue;
                            default:
                                if (parseUnknownField(B, gVar)) {
                                    continue;
                                }
                                break;
                        }
                        z2 = true;
                    } catch (InvalidProtocolBufferException e2) {
                        e2.d(this);
                        throw new RuntimeException(e2);
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                        invalidProtocolBufferException.d(this);
                        throw new RuntimeException(invalidProtocolBufferException);
                    }
                }
                break;
            case 3:
                this.c.g();
                this.f.g();
                this.n.g();
                this.p.g();
                this.q.g();
                this.r.g();
                this.s.g();
                this.x.g();
                return null;
            case 4:
                return new TimeMeasurementErrorNonAuth();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (z == null) {
                    synchronized (TimeMeasurementErrorNonAuth.class) {
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
        int i2 = this.memoizedSerializedSize;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.a & 1) == 1) {
            i3 = 0 + CodedOutputStream.j(1, this.b);
        }
        for (Map.Entry<String, String> entry : this.c.entrySet()) {
            i3 = je.j1(entry, d.a, 2, entry.getKey(), i3);
        }
        for (Map.Entry<String, Long> entry2 : this.f.entrySet()) {
            i3 = je.j1(entry2, g.a, 3, entry2.getKey(), i3);
        }
        for (Map.Entry<String, String> entry3 : this.n.entrySet()) {
            i3 = je.j1(entry3, f.a, 4, entry3.getKey(), i3);
        }
        if ((this.a & 2) == 2) {
            i3 += CodedOutputStream.p(5, this.o);
        }
        for (Map.Entry<String, String> entry4 : this.p.entrySet()) {
            i3 = je.j1(entry4, c.a, 6, entry4.getKey(), i3);
        }
        for (Map.Entry<String, Long> entry5 : this.q.entrySet()) {
            i3 = je.j1(entry5, j.a, 7, entry5.getKey(), i3);
        }
        for (Map.Entry<String, Long> entry6 : this.r.entrySet()) {
            i3 = je.j1(entry6, h.a, 8, entry6.getKey(), i3);
        }
        for (Map.Entry<String, String> entry7 : this.s.entrySet()) {
            i3 = je.j1(entry7, i.a, 9, entry7.getKey(), i3);
        }
        if ((this.a & 4) == 4) {
            i3 += CodedOutputStream.p(10, this.t);
        }
        if ((this.a & 8) == 8) {
            i3 += CodedOutputStream.p(11, this.u);
        }
        if ((this.a & 16) == 16) {
            i3 += CodedOutputStream.p(12, this.v);
        }
        if ((this.a & 32) == 32) {
            i3 += CodedOutputStream.l(13, this.w);
        }
        for (Map.Entry<String, String> entry8 : this.x.entrySet()) {
            i3 = je.j1(entry8, e.a, 14, entry8.getKey(), i3);
        }
        int c2 = this.unknownFields.c() + i3;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.K(1, this.b);
        }
        for (Map.Entry<String, String> entry : this.c.entrySet()) {
            d.a.e(codedOutputStream, 2, entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Long> entry2 : this.f.entrySet()) {
            g.a.e(codedOutputStream, 3, entry2.getKey(), entry2.getValue());
        }
        for (Map.Entry<String, String> entry3 : this.n.entrySet()) {
            f.a.e(codedOutputStream, 4, entry3.getKey(), entry3.getValue());
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(5, this.o);
        }
        for (Map.Entry<String, String> entry4 : this.p.entrySet()) {
            c.a.e(codedOutputStream, 6, entry4.getKey(), entry4.getValue());
        }
        for (Map.Entry<String, Long> entry5 : this.q.entrySet()) {
            j.a.e(codedOutputStream, 7, entry5.getKey(), entry5.getValue());
        }
        for (Map.Entry<String, Long> entry6 : this.r.entrySet()) {
            h.a.e(codedOutputStream, 8, entry6.getKey(), entry6.getValue());
        }
        for (Map.Entry<String, String> entry7 : this.s.entrySet()) {
            i.a.e(codedOutputStream, 9, entry7.getKey(), entry7.getValue());
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.P(10, this.t);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.P(11, this.u);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.P(12, this.v);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.U(13, this.w);
        }
        for (Map.Entry<String, String> entry8 : this.x.entrySet()) {
            e.a.e(codedOutputStream, 14, entry8.getKey(), entry8.getValue());
        }
        this.unknownFields.l(codedOutputStream);
    }
}
