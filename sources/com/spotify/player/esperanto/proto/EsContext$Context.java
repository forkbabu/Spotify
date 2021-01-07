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
import com.spotify.player.esperanto.proto.EsRestrictions$Restrictions;
import java.io.IOException;
import java.util.Map;

public final class EsContext$Context extends GeneratedMessageLite<EsContext$Context, a> implements Object {
    private static final EsContext$Context q;
    private static volatile x<EsContext$Context> r;
    private int a;
    private o.i<EsContextPage$ContextPage> b = GeneratedMessageLite.emptyProtobufList();
    private MapFieldLite<String, String> c = MapFieldLite.d();
    private String f = "";
    private String n = "";
    private boolean o;
    private EsRestrictions$Restrictions p;

    public static final class a extends GeneratedMessageLite.b<EsContext$Context, a> implements Object {
        public a m(Iterable<? extends EsContextPage$ContextPage> iterable) {
            copyOnWrite();
            EsContext$Context.o((EsContext$Context) this.instance, iterable);
            return this;
        }

        public a n(Map<String, String> map) {
            copyOnWrite();
            ((MapFieldLite) EsContext$Context.h((EsContext$Context) this.instance)).putAll(map);
            return this;
        }

        public a o(boolean z) {
            copyOnWrite();
            EsContext$Context.m((EsContext$Context) this.instance, z);
            return this;
        }

        public a p(EsRestrictions$Restrictions esRestrictions$Restrictions) {
            copyOnWrite();
            EsContext$Context.n((EsContext$Context) this.instance, esRestrictions$Restrictions);
            return this;
        }

        public a q(String str) {
            copyOnWrite();
            EsContext$Context.i((EsContext$Context) this.instance, str);
            return this;
        }

        public a r(String str) {
            copyOnWrite();
            EsContext$Context.l((EsContext$Context) this.instance, str);
            return this;
        }

        private a() {
            super(EsContext$Context.q);
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
        EsContext$Context esContext$Context = new EsContext$Context();
        q = esContext$Context;
        esContext$Context.makeImmutable();
    }

    private EsContext$Context() {
    }

    static Map h(EsContext$Context esContext$Context) {
        if (!esContext$Context.c.f()) {
            esContext$Context.c = esContext$Context.c.k();
        }
        return esContext$Context.c;
    }

    static void i(EsContext$Context esContext$Context, String str) {
        esContext$Context.getClass();
        str.getClass();
        esContext$Context.f = str;
    }

    static void l(EsContext$Context esContext$Context, String str) {
        esContext$Context.getClass();
        str.getClass();
        esContext$Context.n = str;
    }

    static void m(EsContext$Context esContext$Context, boolean z) {
        esContext$Context.o = z;
    }

    static void n(EsContext$Context esContext$Context, EsRestrictions$Restrictions esRestrictions$Restrictions) {
        esContext$Context.getClass();
        esRestrictions$Restrictions.getClass();
        esContext$Context.p = esRestrictions$Restrictions;
    }

    static void o(EsContext$Context esContext$Context, Iterable iterable) {
        if (!esContext$Context.b.R0()) {
            esContext$Context.b = GeneratedMessageLite.mutableCopy(esContext$Context.b);
        }
        com.google.protobuf.a.addAll(iterable, esContext$Context.b);
    }

    public static a p() {
        return (a) q.toBuilder();
    }

    public static x<EsContext$Context> parser() {
        return q.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return q;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                EsContext$Context esContext$Context = (EsContext$Context) obj2;
                this.b = hVar.q(this.b, esContext$Context.b);
                this.c = hVar.c(this.c, esContext$Context.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !esContext$Context.f.isEmpty(), esContext$Context.f);
                this.n = hVar.n(!this.n.isEmpty(), this.n, true ^ esContext$Context.n.isEmpty(), esContext$Context.n);
                boolean z = this.o;
                boolean z2 = esContext$Context.o;
                this.o = hVar.f(z, z, z2, z2);
                this.p = (EsRestrictions$Restrictions) hVar.i(this.p, esContext$Context.p);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= esContext$Context.a;
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
                                this.b.add(gVar.o(EsContextPage$ContextPage.parser(), kVar));
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
                            } else if (B == 50) {
                                EsRestrictions$Restrictions esRestrictions$Restrictions = this.p;
                                EsRestrictions$Restrictions.a aVar = esRestrictions$Restrictions != null ? (EsRestrictions$Restrictions.a) esRestrictions$Restrictions.toBuilder() : null;
                                EsRestrictions$Restrictions esRestrictions$Restrictions2 = (EsRestrictions$Restrictions) gVar.o(EsRestrictions$Restrictions.parser(), kVar);
                                this.p = esRestrictions$Restrictions2;
                                if (aVar != null) {
                                    aVar.mergeFrom((EsRestrictions$Restrictions.a) esRestrictions$Restrictions2);
                                    this.p = (EsRestrictions$Restrictions) aVar.buildPartial();
                                }
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
                return new EsContext$Context();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (r == null) {
                    synchronized (EsContext$Context.class) {
                        if (r == null) {
                            r = new GeneratedMessageLite.c(q);
                        }
                    }
                }
                return r;
            default:
                throw new UnsupportedOperationException();
        }
        return q;
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
        EsRestrictions$Restrictions esRestrictions$Restrictions = this.p;
        if (esRestrictions$Restrictions != null) {
            i2 += CodedOutputStream.n(6, esRestrictions$Restrictions);
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
        EsRestrictions$Restrictions esRestrictions$Restrictions = this.p;
        if (esRestrictions$Restrictions != null) {
            codedOutputStream.M(6, esRestrictions$Restrictions);
        }
    }
}
