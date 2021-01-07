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

public final class TimeMeasurementNonAuth extends GeneratedMessageLite<TimeMeasurementNonAuth, b> implements Object {
    private static final TimeMeasurementNonAuth u;
    private static volatile x<TimeMeasurementNonAuth> v;
    private int a;
    private String b = "";
    private MapFieldLite<String, String> c = MapFieldLite.d();
    private MapFieldLite<String, Long> f = MapFieldLite.d();
    private MapFieldLite<String, Long> n = MapFieldLite.d();
    private MapFieldLite<String, String> o = MapFieldLite.d();
    private String p = "";
    private String q = "";
    private String r = "";
    private long s;
    private MapFieldLite<String, String> t = MapFieldLite.d();

    public static final class b extends GeneratedMessageLite.b<TimeMeasurementNonAuth, b> implements Object {
        private b() {
            super(TimeMeasurementNonAuth.u);
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
        static final t<String, Long> a = t.b(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT64, 0L);
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

    static {
        TimeMeasurementNonAuth timeMeasurementNonAuth = new TimeMeasurementNonAuth();
        u = timeMeasurementNonAuth;
        timeMeasurementNonAuth.makeImmutable();
    }

    private TimeMeasurementNonAuth() {
    }

    public static b h() {
        return (b) u.toBuilder();
    }

    public static x<TimeMeasurementNonAuth> parser() {
        return u.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return u;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                TimeMeasurementNonAuth timeMeasurementNonAuth = (TimeMeasurementNonAuth) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (timeMeasurementNonAuth.a & 1) == 1, timeMeasurementNonAuth.b);
                this.c = hVar.c(this.c, timeMeasurementNonAuth.c);
                this.f = hVar.c(this.f, timeMeasurementNonAuth.f);
                this.n = hVar.c(this.n, timeMeasurementNonAuth.n);
                this.o = hVar.c(this.o, timeMeasurementNonAuth.o);
                this.p = hVar.n((this.a & 2) == 2, this.p, (timeMeasurementNonAuth.a & 2) == 2, timeMeasurementNonAuth.p);
                this.q = hVar.n((this.a & 4) == 4, this.q, (timeMeasurementNonAuth.a & 4) == 4, timeMeasurementNonAuth.q);
                this.r = hVar.n((this.a & 8) == 8, this.r, (timeMeasurementNonAuth.a & 8) == 8, timeMeasurementNonAuth.r);
                this.s = hVar.s((this.a & 16) == 16, this.s, (timeMeasurementNonAuth.a & 16) == 16, timeMeasurementNonAuth.s);
                this.t = hVar.c(this.t, timeMeasurementNonAuth.t);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= timeMeasurementNonAuth.a;
                }
                return this;
            case 2:
                com.google.protobuf.g gVar = (com.google.protobuf.g) obj;
                k kVar = (k) obj2;
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
                                if (!this.c.f()) {
                                    this.c = this.c.k();
                                }
                                c.a.d(this.c, gVar, kVar);
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
                                e.a.d(this.n, gVar, kVar);
                                continue;
                            case 42:
                                if (!this.o.f()) {
                                    this.o = this.o.k();
                                }
                                f.a.d(this.o, gVar, kVar);
                                continue;
                            case 50:
                                String z3 = gVar.z();
                                this.a |= 2;
                                this.p = z3;
                                continue;
                            case 58:
                                String z4 = gVar.z();
                                this.a |= 4;
                                this.q = z4;
                                continue;
                            case 66:
                                String z5 = gVar.z();
                                this.a |= 8;
                                this.r = z5;
                                continue;
                            case 72:
                                this.a |= 16;
                                this.s = gVar.w();
                                continue;
                            case 82:
                                if (!this.t.f()) {
                                    this.t = this.t.k();
                                }
                                d.a.d(this.t, gVar, kVar);
                                continue;
                            default:
                                if (parseUnknownField(B, gVar)) {
                                    continue;
                                }
                                break;
                        }
                        z = true;
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
                this.o.g();
                this.t.g();
                return null;
            case 4:
                return new TimeMeasurementNonAuth();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (v == null) {
                    synchronized (TimeMeasurementNonAuth.class) {
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
        for (Map.Entry<String, String> entry : this.c.entrySet()) {
            i2 = je.j1(entry, c.a, 2, entry.getKey(), i2);
        }
        for (Map.Entry<String, Long> entry2 : this.f.entrySet()) {
            i2 = je.j1(entry2, g.a, 3, entry2.getKey(), i2);
        }
        for (Map.Entry<String, Long> entry3 : this.n.entrySet()) {
            i2 = je.j1(entry3, e.a, 4, entry3.getKey(), i2);
        }
        for (Map.Entry<String, String> entry4 : this.o.entrySet()) {
            i2 = je.j1(entry4, f.a, 5, entry4.getKey(), i2);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.p(6, this.p);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.p(7, this.q);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.p(8, this.r);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.l(9, this.s);
        }
        for (Map.Entry<String, String> entry5 : this.t.entrySet()) {
            i2 = je.j1(entry5, d.a, 10, entry5.getKey(), i2);
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
        for (Map.Entry<String, String> entry : this.c.entrySet()) {
            c.a.e(codedOutputStream, 2, entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Long> entry2 : this.f.entrySet()) {
            g.a.e(codedOutputStream, 3, entry2.getKey(), entry2.getValue());
        }
        for (Map.Entry<String, Long> entry3 : this.n.entrySet()) {
            e.a.e(codedOutputStream, 4, entry3.getKey(), entry3.getValue());
        }
        for (Map.Entry<String, String> entry4 : this.o.entrySet()) {
            f.a.e(codedOutputStream, 5, entry4.getKey(), entry4.getValue());
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(6, this.p);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.P(7, this.q);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.P(8, this.r);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.U(9, this.s);
        }
        for (Map.Entry<String, String> entry5 : this.t.entrySet()) {
            d.a.e(codedOutputStream, 10, entry5.getKey(), entry5.getValue());
        }
        this.unknownFields.l(codedOutputStream);
    }
}
