package com.spotify.player.esperanto.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class EsPlayOrigin$PlayOrigin extends GeneratedMessageLite<EsPlayOrigin$PlayOrigin, a> implements Object {
    private static final EsPlayOrigin$PlayOrigin r;
    private static volatile x<EsPlayOrigin$PlayOrigin> s;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private String n = "";
    private String o = "";
    private String p = "";
    private o.i<String> q = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.b<EsPlayOrigin$PlayOrigin, a> implements Object {
        public a m(Iterable<String> iterable) {
            copyOnWrite();
            EsPlayOrigin$PlayOrigin.n((EsPlayOrigin$PlayOrigin) this.instance, iterable);
            return this;
        }

        public a n(String str) {
            copyOnWrite();
            EsPlayOrigin$PlayOrigin.m((EsPlayOrigin$PlayOrigin) this.instance, str);
            return this;
        }

        public a o(String str) {
            copyOnWrite();
            EsPlayOrigin$PlayOrigin.i((EsPlayOrigin$PlayOrigin) this.instance, str);
            return this;
        }

        public a p(String str) {
            copyOnWrite();
            EsPlayOrigin$PlayOrigin.h((EsPlayOrigin$PlayOrigin) this.instance, str);
            return this;
        }

        public a q(String str) {
            copyOnWrite();
            EsPlayOrigin$PlayOrigin.o((EsPlayOrigin$PlayOrigin) this.instance, str);
            return this;
        }

        public a r(String str) {
            copyOnWrite();
            EsPlayOrigin$PlayOrigin.l((EsPlayOrigin$PlayOrigin) this.instance, str);
            return this;
        }

        public a s(String str) {
            copyOnWrite();
            EsPlayOrigin$PlayOrigin.p((EsPlayOrigin$PlayOrigin) this.instance, str);
            return this;
        }

        private a() {
            super(EsPlayOrigin$PlayOrigin.r);
        }
    }

    static {
        EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin = new EsPlayOrigin$PlayOrigin();
        r = esPlayOrigin$PlayOrigin;
        esPlayOrigin$PlayOrigin.makeImmutable();
    }

    private EsPlayOrigin$PlayOrigin() {
    }

    static void h(EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin, String str) {
        esPlayOrigin$PlayOrigin.getClass();
        str.getClass();
        esPlayOrigin$PlayOrigin.b = str;
    }

    static void i(EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin, String str) {
        esPlayOrigin$PlayOrigin.getClass();
        str.getClass();
        esPlayOrigin$PlayOrigin.n = str;
    }

    static void l(EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin, String str) {
        esPlayOrigin$PlayOrigin.getClass();
        str.getClass();
        esPlayOrigin$PlayOrigin.o = str;
    }

    static void m(EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin, String str) {
        esPlayOrigin$PlayOrigin.getClass();
        str.getClass();
        esPlayOrigin$PlayOrigin.p = str;
    }

    static void n(EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin, Iterable iterable) {
        if (!esPlayOrigin$PlayOrigin.q.R0()) {
            esPlayOrigin$PlayOrigin.q = GeneratedMessageLite.mutableCopy(esPlayOrigin$PlayOrigin.q);
        }
        com.google.protobuf.a.addAll(iterable, esPlayOrigin$PlayOrigin.q);
    }

    static void o(EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin, String str) {
        esPlayOrigin$PlayOrigin.getClass();
        str.getClass();
        esPlayOrigin$PlayOrigin.c = str;
    }

    static void p(EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin, String str) {
        esPlayOrigin$PlayOrigin.getClass();
        str.getClass();
        esPlayOrigin$PlayOrigin.f = str;
    }

    public static x<EsPlayOrigin$PlayOrigin> parser() {
        return r.getParserForType();
    }

    public static EsPlayOrigin$PlayOrigin q() {
        return r;
    }

    public static a y() {
        return (a) r.toBuilder();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return r;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin = (EsPlayOrigin$PlayOrigin) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !esPlayOrigin$PlayOrigin.b.isEmpty(), esPlayOrigin$PlayOrigin.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !esPlayOrigin$PlayOrigin.c.isEmpty(), esPlayOrigin$PlayOrigin.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !esPlayOrigin$PlayOrigin.f.isEmpty(), esPlayOrigin$PlayOrigin.f);
                this.n = hVar.n(!this.n.isEmpty(), this.n, !esPlayOrigin$PlayOrigin.n.isEmpty(), esPlayOrigin$PlayOrigin.n);
                this.o = hVar.n(!this.o.isEmpty(), this.o, !esPlayOrigin$PlayOrigin.o.isEmpty(), esPlayOrigin$PlayOrigin.o);
                this.p = hVar.n(!this.p.isEmpty(), this.p, true ^ esPlayOrigin$PlayOrigin.p.isEmpty(), esPlayOrigin$PlayOrigin.p);
                this.q = hVar.q(this.q, esPlayOrigin$PlayOrigin.q);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= esPlayOrigin$PlayOrigin.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                this.b = gVar.A();
                            } else if (B == 18) {
                                this.c = gVar.A();
                            } else if (B == 26) {
                                this.f = gVar.A();
                            } else if (B == 34) {
                                this.n = gVar.A();
                            } else if (B == 42) {
                                this.o = gVar.A();
                            } else if (B == 50) {
                                this.p = gVar.A();
                            } else if (B == 58) {
                                String A = gVar.A();
                                if (!this.q.R0()) {
                                    this.q = GeneratedMessageLite.mutableCopy(this.q);
                                }
                                this.q.add(A);
                            } else if (!gVar.F(B)) {
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
                this.q.C();
                return null;
            case 4:
                return new EsPlayOrigin$PlayOrigin();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (s == null) {
                    synchronized (EsPlayOrigin$PlayOrigin.class) {
                        if (s == null) {
                            s = new GeneratedMessageLite.c(r);
                        }
                    }
                }
                return s;
            default:
                throw new UnsupportedOperationException();
        }
        return r;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int p2 = !this.b.isEmpty() ? CodedOutputStream.p(1, this.b) + 0 : 0;
        if (!this.c.isEmpty()) {
            p2 += CodedOutputStream.p(2, this.c);
        }
        if (!this.f.isEmpty()) {
            p2 += CodedOutputStream.p(3, this.f);
        }
        if (!this.n.isEmpty()) {
            p2 += CodedOutputStream.p(4, this.n);
        }
        if (!this.o.isEmpty()) {
            p2 += CodedOutputStream.p(5, this.o);
        }
        if (!this.p.isEmpty()) {
            p2 += CodedOutputStream.p(6, this.p);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.q.size(); i3++) {
            i2 += CodedOutputStream.q(this.q.get(i3));
        }
        int C0 = je.C0(this.q, 1, p2 + i2);
        this.memoizedSerializedSize = C0;
        return C0;
    }

    public String r() {
        return this.p;
    }

    public String s() {
        return this.n;
    }

    public List<String> t() {
        return this.q;
    }

    public String u() {
        return this.b;
    }

    public String v() {
        return this.c;
    }

    public String w() {
        return this.o;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(2, this.c);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(3, this.f);
        }
        if (!this.n.isEmpty()) {
            codedOutputStream.P(4, this.n);
        }
        if (!this.o.isEmpty()) {
            codedOutputStream.P(5, this.o);
        }
        if (!this.p.isEmpty()) {
            codedOutputStream.P(6, this.p);
        }
        for (int i = 0; i < this.q.size(); i++) {
            codedOutputStream.P(7, this.q.get(i));
        }
    }

    public String x() {
        return this.f;
    }
}
