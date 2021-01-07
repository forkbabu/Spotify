package com.spotify.player.esperanto.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.t;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.Map;

public final class EsContextPage$ContextPage extends GeneratedMessageLite<EsContextPage$ContextPage, a> implements Object {
    private static final EsContextPage$ContextPage p;
    private static volatile x<EsContextPage$ContextPage> q;
    private int a;
    private o.i<EsContextTrack$ContextTrack> b = GeneratedMessageLite.emptyProtobufList();
    private MapFieldLite<String, String> c = MapFieldLite.d();
    private String f = "";
    private String n = "";
    private boolean o;

    public static final class a extends GeneratedMessageLite.b<EsContextPage$ContextPage, a> implements Object {
        public a m(Iterable<? extends EsContextTrack$ContextTrack> iterable) {
            copyOnWrite();
            EsContextPage$ContextPage.n((EsContextPage$ContextPage) this.instance, iterable);
            return this;
        }

        public a n(Map<String, String> map) {
            copyOnWrite();
            ((MapFieldLite) EsContextPage$ContextPage.h((EsContextPage$ContextPage) this.instance)).putAll(map);
            return this;
        }

        public a o(boolean z) {
            copyOnWrite();
            EsContextPage$ContextPage.m((EsContextPage$ContextPage) this.instance, z);
            return this;
        }

        public a p(String str) {
            copyOnWrite();
            EsContextPage$ContextPage.l((EsContextPage$ContextPage) this.instance, str);
            return this;
        }

        public a q(String str) {
            copyOnWrite();
            EsContextPage$ContextPage.i((EsContextPage$ContextPage) this.instance, str);
            return this;
        }

        private a() {
            super(EsContextPage$ContextPage.p);
        }
    }

    private static final class b {
        static final t<String, String> a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = t.b(fieldType, "", fieldType, "");
        }
    }

    static {
        EsContextPage$ContextPage esContextPage$ContextPage = new EsContextPage$ContextPage();
        p = esContextPage$ContextPage;
        esContextPage$ContextPage.makeImmutable();
    }

    private EsContextPage$ContextPage() {
    }

    static Map h(EsContextPage$ContextPage esContextPage$ContextPage) {
        if (!esContextPage$ContextPage.c.f()) {
            esContextPage$ContextPage.c = esContextPage$ContextPage.c.k();
        }
        return esContextPage$ContextPage.c;
    }

    static void i(EsContextPage$ContextPage esContextPage$ContextPage, String str) {
        esContextPage$ContextPage.getClass();
        str.getClass();
        esContextPage$ContextPage.f = str;
    }

    static void l(EsContextPage$ContextPage esContextPage$ContextPage, String str) {
        esContextPage$ContextPage.getClass();
        str.getClass();
        esContextPage$ContextPage.n = str;
    }

    static void m(EsContextPage$ContextPage esContextPage$ContextPage, boolean z) {
        esContextPage$ContextPage.o = z;
    }

    static void n(EsContextPage$ContextPage esContextPage$ContextPage, Iterable iterable) {
        if (!esContextPage$ContextPage.b.R0()) {
            esContextPage$ContextPage.b = GeneratedMessageLite.mutableCopy(esContextPage$ContextPage.b);
        }
        com.google.protobuf.a.addAll(iterable, esContextPage$ContextPage.b);
    }

    public static a o() {
        return (a) p.toBuilder();
    }

    public static x<EsContextPage$ContextPage> parser() {
        return p.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return p;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                EsContextPage$ContextPage esContextPage$ContextPage = (EsContextPage$ContextPage) obj2;
                this.b = hVar.q(this.b, esContextPage$ContextPage.b);
                this.c = hVar.c(this.c, esContextPage$ContextPage.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !esContextPage$ContextPage.f.isEmpty(), esContextPage$ContextPage.f);
                this.n = hVar.n(!this.n.isEmpty(), this.n, true ^ esContextPage$ContextPage.n.isEmpty(), esContextPage$ContextPage.n);
                boolean z = this.o;
                boolean z2 = esContextPage$ContextPage.o;
                this.o = hVar.f(z, z, z2, z2);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= esContextPage$ContextPage.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                this.b.add(gVar.o(EsContextTrack$ContextTrack.parser(), kVar));
                            } else if (B == 18) {
                                if (!this.c.f()) {
                                    this.c = this.c.k();
                                }
                                b.a.d(this.c, gVar, kVar);
                            } else if (B == 26) {
                                this.f = gVar.A();
                            } else if (B == 34) {
                                this.n = gVar.A();
                            } else if (B == 40) {
                                this.o = gVar.h();
                            } else if (!gVar.F(B)) {
                            }
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
                this.b.C();
                this.c.g();
                return null;
            case 4:
                return new EsContextPage$ContextPage();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (EsContextPage$ContextPage.class) {
                        if (q == null) {
                            q = new GeneratedMessageLite.c(p);
                        }
                    }
                }
                return q;
            default:
                throw new UnsupportedOperationException();
        }
        return p;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            i2 += CodedOutputStream.n(1, this.b.get(i3));
        }
        for (Map.Entry<String, String> entry : this.c.entrySet()) {
            i2 = je.j1(entry, b.a, 2, entry.getKey(), i2);
        }
        if (!this.f.isEmpty()) {
            i2 += CodedOutputStream.p(3, this.f);
        }
        if (!this.n.isEmpty()) {
            i2 += CodedOutputStream.p(4, this.n);
        }
        boolean z = this.o;
        if (z) {
            i2 += CodedOutputStream.d(5, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.b.size(); i++) {
            codedOutputStream.M(1, this.b.get(i));
        }
        for (Map.Entry<String, String> entry : this.c.entrySet()) {
            b.a.e(codedOutputStream, 2, entry.getKey(), entry.getValue());
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(3, this.f);
        }
        if (!this.n.isEmpty()) {
            codedOutputStream.P(4, this.n);
        }
        boolean z = this.o;
        if (z) {
            codedOutputStream.A(5, z);
        }
    }
}
