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
import java.util.Collections;
import java.util.Map;

public final class ViewLoadSequence extends GeneratedMessageLite<ViewLoadSequence, b> implements Object {
    private static final ViewLoadSequence t;
    private static volatile x<ViewLoadSequence> u;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private MapFieldLite<String, Long> n = MapFieldLite.d();
    private MapFieldLite<String, String> o = MapFieldLite.d();
    private String p = "";
    private String q = "";
    private String r = "";
    private int s;

    public static final class b extends GeneratedMessageLite.b<ViewLoadSequence, b> implements Object {
        public b m(Map<String, String> map) {
            copyOnWrite();
            ((MapFieldLite) ViewLoadSequence.l((ViewLoadSequence) this.instance)).putAll(map);
            return this;
        }

        public b n(Map<String, Long> map) {
            copyOnWrite();
            ((MapFieldLite) ViewLoadSequence.i((ViewLoadSequence) this.instance)).putAll(map);
            return this;
        }

        public b o(int i) {
            copyOnWrite();
            ViewLoadSequence.p((ViewLoadSequence) this.instance, i);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            ViewLoadSequence.n((ViewLoadSequence) this.instance, str);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            ViewLoadSequence.h((ViewLoadSequence) this.instance, str);
            return this;
        }

        public b r(String str) {
            copyOnWrite();
            ViewLoadSequence.m((ViewLoadSequence) this.instance, str);
            return this;
        }

        public b s(String str) {
            copyOnWrite();
            ViewLoadSequence.o((ViewLoadSequence) this.instance, str);
            return this;
        }

        public b t(String str) {
            copyOnWrite();
            ViewLoadSequence.r((ViewLoadSequence) this.instance, str);
            return this;
        }

        public b u(String str) {
            copyOnWrite();
            ViewLoadSequence.q((ViewLoadSequence) this.instance, str);
            return this;
        }

        private b() {
            super(ViewLoadSequence.t);
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

    static {
        ViewLoadSequence viewLoadSequence = new ViewLoadSequence();
        t = viewLoadSequence;
        viewLoadSequence.makeImmutable();
    }

    private ViewLoadSequence() {
    }

    static void h(ViewLoadSequence viewLoadSequence, String str) {
        viewLoadSequence.getClass();
        str.getClass();
        viewLoadSequence.a |= 1;
        viewLoadSequence.b = str;
    }

    static Map i(ViewLoadSequence viewLoadSequence) {
        if (!viewLoadSequence.n.f()) {
            viewLoadSequence.n = viewLoadSequence.n.k();
        }
        return viewLoadSequence.n;
    }

    static Map l(ViewLoadSequence viewLoadSequence) {
        if (!viewLoadSequence.o.f()) {
            viewLoadSequence.o = viewLoadSequence.o.k();
        }
        return viewLoadSequence.o;
    }

    static void m(ViewLoadSequence viewLoadSequence, String str) {
        viewLoadSequence.getClass();
        str.getClass();
        viewLoadSequence.a |= 8;
        viewLoadSequence.p = str;
    }

    static void n(ViewLoadSequence viewLoadSequence, String str) {
        viewLoadSequence.getClass();
        str.getClass();
        viewLoadSequence.a |= 16;
        viewLoadSequence.q = str;
    }

    static void o(ViewLoadSequence viewLoadSequence, String str) {
        viewLoadSequence.getClass();
        str.getClass();
        viewLoadSequence.a |= 32;
        viewLoadSequence.r = str;
    }

    static void p(ViewLoadSequence viewLoadSequence, int i) {
        viewLoadSequence.a |= 64;
        viewLoadSequence.s = i;
    }

    public static x<ViewLoadSequence> parser() {
        return t.getParserForType();
    }

    static void q(ViewLoadSequence viewLoadSequence, String str) {
        viewLoadSequence.getClass();
        str.getClass();
        viewLoadSequence.a |= 2;
        viewLoadSequence.c = str;
    }

    static void r(ViewLoadSequence viewLoadSequence, String str) {
        viewLoadSequence.getClass();
        str.getClass();
        viewLoadSequence.a |= 4;
        viewLoadSequence.f = str;
    }

    public static b x() {
        return (b) t.toBuilder();
    }

    public static b y(ViewLoadSequence viewLoadSequence) {
        return (b) ((b) t.toBuilder()).mergeFrom((b) viewLoadSequence);
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
                ViewLoadSequence viewLoadSequence = (ViewLoadSequence) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (viewLoadSequence.a & 1) == 1, viewLoadSequence.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (viewLoadSequence.a & 2) == 2, viewLoadSequence.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (viewLoadSequence.a & 4) == 4, viewLoadSequence.f);
                this.n = hVar.c(this.n, viewLoadSequence.n);
                this.o = hVar.c(this.o, viewLoadSequence.o);
                this.p = hVar.n((this.a & 8) == 8, this.p, (viewLoadSequence.a & 8) == 8, viewLoadSequence.p);
                this.q = hVar.n((this.a & 16) == 16, this.q, (viewLoadSequence.a & 16) == 16, viewLoadSequence.q);
                this.r = hVar.n((this.a & 32) == 32, this.r, (viewLoadSequence.a & 32) == 32, viewLoadSequence.r);
                boolean z2 = (this.a & 64) == 64;
                int i = this.s;
                if ((viewLoadSequence.a & 64) == 64) {
                    z = true;
                }
                this.s = hVar.m(z2, i, z, viewLoadSequence.s);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= viewLoadSequence.a;
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
                                String z4 = gVar.z();
                                this.a |= 2;
                                this.c = z4;
                            } else if (B == 26) {
                                String z5 = gVar.z();
                                this.a |= 4;
                                this.f = z5;
                            } else if (B == 34) {
                                if (!this.n.f()) {
                                    this.n = this.n.k();
                                }
                                d.a.d(this.n, gVar, kVar);
                            } else if (B == 42) {
                                if (!this.o.f()) {
                                    this.o = this.o.k();
                                }
                                c.a.d(this.o, gVar, kVar);
                            } else if (B == 50) {
                                String z6 = gVar.z();
                                this.a |= 8;
                                this.p = z6;
                            } else if (B == 58) {
                                String z7 = gVar.z();
                                this.a |= 16;
                                this.q = z7;
                            } else if (B == 66) {
                                String z8 = gVar.z();
                                this.a |= 32;
                                this.r = z8;
                            } else if (B == 72) {
                                this.a |= 64;
                                this.s = gVar.u();
                            } else if (!parseUnknownField(B, gVar)) {
                            }
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
                this.n.g();
                this.o.g();
                return null;
            case 4:
                return new ViewLoadSequence();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (u == null) {
                    synchronized (ViewLoadSequence.class) {
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
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.p(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.p(3, this.f);
        }
        for (Map.Entry<String, Long> entry : this.n.entrySet()) {
            i2 = je.j1(entry, d.a, 4, entry.getKey(), i2);
        }
        for (Map.Entry<String, String> entry2 : this.o.entrySet()) {
            i2 = je.j1(entry2, c.a, 5, entry2.getKey(), i2);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.p(6, this.p);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.p(7, this.q);
        }
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.p(8, this.r);
        }
        if ((this.a & 64) == 64) {
            i2 += CodedOutputStream.j(9, this.s);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public String s() {
        return this.b;
    }

    public String t() {
        return this.p;
    }

    public Map<String, Long> u() {
        return Collections.unmodifiableMap(this.n);
    }

    public String v() {
        return this.f;
    }

    public String w() {
        return this.c;
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
        for (Map.Entry<String, Long> entry : this.n.entrySet()) {
            d.a.e(codedOutputStream, 4, entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, String> entry2 : this.o.entrySet()) {
            c.a.e(codedOutputStream, 5, entry2.getKey(), entry2.getValue());
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.P(6, this.p);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.P(7, this.q);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.P(8, this.r);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.K(9, this.s);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
