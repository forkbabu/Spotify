package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.t;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.Map;

public final class ColdStartupSequence extends GeneratedMessageLite<ColdStartupSequence, b> implements Object {
    private static final ColdStartupSequence t;
    private static volatile x<ColdStartupSequence> u;
    private int a;
    private String b = "";
    private MapFieldLite<String, Long> c = MapFieldLite.d();
    private MapFieldLite<String, String> f = MapFieldLite.d();
    private String n = "";
    private String o = "";
    private String p = "";
    private String q = "";
    private int r;
    private MapFieldLite<String, Long> s = MapFieldLite.d();

    public static final class b extends GeneratedMessageLite.b<ColdStartupSequence, b> implements Object {
        public b m(Map<String, String> map) {
            copyOnWrite();
            ((MapFieldLite) ColdStartupSequence.o((ColdStartupSequence) this.instance)).putAll(map);
            return this;
        }

        public b n(Map<String, Long> map) {
            copyOnWrite();
            ((MapFieldLite) ColdStartupSequence.n((ColdStartupSequence) this.instance)).putAll(map);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            ColdStartupSequence.p((ColdStartupSequence) this.instance, str);
            return this;
        }

        public b p(int i) {
            copyOnWrite();
            ColdStartupSequence.m((ColdStartupSequence) this.instance, i);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            ColdStartupSequence.q((ColdStartupSequence) this.instance, str);
            return this;
        }

        public b r(String str) {
            copyOnWrite();
            ColdStartupSequence.i((ColdStartupSequence) this.instance, str);
            return this;
        }

        public b s(String str) {
            copyOnWrite();
            ColdStartupSequence.h((ColdStartupSequence) this.instance, str);
            return this;
        }

        public b t(String str) {
            copyOnWrite();
            ColdStartupSequence.l((ColdStartupSequence) this.instance, str);
            return this;
        }

        private b() {
            super(ColdStartupSequence.t);
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
        static final t<String, Long> a = t.b(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT64, 0L);
    }

    private static final class e {
        static final t<String, Long> a = t.b(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT64, 0L);
    }

    static {
        ColdStartupSequence coldStartupSequence = new ColdStartupSequence();
        t = coldStartupSequence;
        coldStartupSequence.makeImmutable();
    }

    private ColdStartupSequence() {
    }

    static void h(ColdStartupSequence coldStartupSequence, String str) {
        coldStartupSequence.getClass();
        str.getClass();
        coldStartupSequence.a |= 1;
        coldStartupSequence.b = str;
    }

    static void i(ColdStartupSequence coldStartupSequence, String str) {
        coldStartupSequence.getClass();
        str.getClass();
        coldStartupSequence.a |= 8;
        coldStartupSequence.p = str;
    }

    static void l(ColdStartupSequence coldStartupSequence, String str) {
        coldStartupSequence.getClass();
        str.getClass();
        coldStartupSequence.a |= 16;
        coldStartupSequence.q = str;
    }

    static void m(ColdStartupSequence coldStartupSequence, int i) {
        coldStartupSequence.a |= 32;
        coldStartupSequence.r = i;
    }

    static Map n(ColdStartupSequence coldStartupSequence) {
        if (!coldStartupSequence.c.f()) {
            coldStartupSequence.c = coldStartupSequence.c.k();
        }
        return coldStartupSequence.c;
    }

    static Map o(ColdStartupSequence coldStartupSequence) {
        if (!coldStartupSequence.f.f()) {
            coldStartupSequence.f = coldStartupSequence.f.k();
        }
        return coldStartupSequence.f;
    }

    static void p(ColdStartupSequence coldStartupSequence, String str) {
        coldStartupSequence.getClass();
        str.getClass();
        coldStartupSequence.a |= 2;
        coldStartupSequence.n = str;
    }

    public static x<ColdStartupSequence> parser() {
        return t.getParserForType();
    }

    static void q(ColdStartupSequence coldStartupSequence, String str) {
        coldStartupSequence.getClass();
        str.getClass();
        coldStartupSequence.a |= 4;
        coldStartupSequence.o = str;
    }

    public static b r() {
        return (b) t.toBuilder();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return t;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ColdStartupSequence coldStartupSequence = (ColdStartupSequence) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (coldStartupSequence.a & 1) == 1, coldStartupSequence.b);
                this.c = hVar.c(this.c, coldStartupSequence.c);
                this.f = hVar.c(this.f, coldStartupSequence.f);
                this.n = hVar.n((this.a & 2) == 2, this.n, (coldStartupSequence.a & 2) == 2, coldStartupSequence.n);
                this.o = hVar.n((this.a & 4) == 4, this.o, (coldStartupSequence.a & 4) == 4, coldStartupSequence.o);
                this.p = hVar.n((this.a & 8) == 8, this.p, (coldStartupSequence.a & 8) == 8, coldStartupSequence.p);
                this.q = hVar.n((this.a & 16) == 16, this.q, (coldStartupSequence.a & 16) == 16, coldStartupSequence.q);
                boolean z2 = (this.a & 32) == 32;
                int i = this.r;
                if ((coldStartupSequence.a & 32) == 32) {
                    z = true;
                }
                this.r = hVar.m(z2, i, z, coldStartupSequence.r);
                this.s = hVar.c(this.s, coldStartupSequence.s);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= coldStartupSequence.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                String z3 = gVar.z();
                                this.a |= 1;
                                this.b = z3;
                            } else if (B == 18) {
                                if (!this.c.f()) {
                                    this.c = this.c.k();
                                }
                                d.a.d(this.c, gVar, kVar);
                            } else if (B == 26) {
                                if (!this.f.f()) {
                                    this.f = this.f.k();
                                }
                                c.a.d(this.f, gVar, kVar);
                            } else if (B == 34) {
                                String z4 = gVar.z();
                                this.a |= 2;
                                this.n = z4;
                            } else if (B == 42) {
                                String z5 = gVar.z();
                                this.a |= 4;
                                this.o = z5;
                            } else if (B == 50) {
                                String z6 = gVar.z();
                                this.a |= 8;
                                this.p = z6;
                            } else if (B == 58) {
                                String z7 = gVar.z();
                                this.a |= 16;
                                this.q = z7;
                            } else if (B == 64) {
                                this.a |= 32;
                                this.r = gVar.u();
                            } else if (B == 74) {
                                if (!this.s.f()) {
                                    this.s = this.s.k();
                                }
                                e.a.d(this.s, gVar, kVar);
                            } else if (!parseUnknownField(B, gVar)) {
                            }
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
                this.s.g();
                return null;
            case 4:
                return new ColdStartupSequence();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (u == null) {
                    synchronized (ColdStartupSequence.class) {
                        if (u == null) {
                            u = new GeneratedMessageLite.c(t);
                        }
                    }
                }
                return u;
            default:
                throw new UnsupportedOperationException();
        }
        return t;
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
        for (Map.Entry<String, Long> entry : this.c.entrySet()) {
            i2 = je.j1(entry, d.a, 2, entry.getKey(), i2);
        }
        for (Map.Entry<String, String> entry2 : this.f.entrySet()) {
            i2 = je.j1(entry2, c.a, 3, entry2.getKey(), i2);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.p(4, this.n);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.p(5, this.o);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.p(6, this.p);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.p(7, this.q);
        }
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.j(8, this.r);
        }
        for (Map.Entry<String, Long> entry3 : this.s.entrySet()) {
            i2 = je.j1(entry3, e.a, 9, entry3.getKey(), i2);
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
        for (Map.Entry<String, Long> entry : this.c.entrySet()) {
            d.a.e(codedOutputStream, 2, entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, String> entry2 : this.f.entrySet()) {
            c.a.e(codedOutputStream, 3, entry2.getKey(), entry2.getValue());
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(4, this.n);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.P(5, this.o);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.P(6, this.p);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.P(7, this.q);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.K(8, this.r);
        }
        for (Map.Entry<String, Long> entry3 : this.s.entrySet()) {
            e.a.e(codedOutputStream, 9, entry3.getKey(), entry3.getValue());
        }
        this.unknownFields.l(codedOutputStream);
    }
}
