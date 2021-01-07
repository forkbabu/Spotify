package com.spotify.player.esperanto.proto;

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

public final class EsContextTrack$ContextTrack extends GeneratedMessageLite<EsContextTrack$ContextTrack, a> implements Object {
    private static final EsContextTrack$ContextTrack n;
    private static volatile x<EsContextTrack$ContextTrack> o;
    private int a;
    private String b = "";
    private String c = "";
    private MapFieldLite<String, String> f = MapFieldLite.d();

    public static final class a extends GeneratedMessageLite.b<EsContextTrack$ContextTrack, a> implements Object {
        public a m(Map<String, String> map) {
            copyOnWrite();
            ((MapFieldLite) EsContextTrack$ContextTrack.l((EsContextTrack$ContextTrack) this.instance)).putAll(map);
            return this;
        }

        public a n(String str) {
            copyOnWrite();
            EsContextTrack$ContextTrack.i((EsContextTrack$ContextTrack) this.instance, str);
            return this;
        }

        public a o(String str) {
            copyOnWrite();
            EsContextTrack$ContextTrack.h((EsContextTrack$ContextTrack) this.instance, str);
            return this;
        }

        private a() {
            super(EsContextTrack$ContextTrack.n);
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
        EsContextTrack$ContextTrack esContextTrack$ContextTrack = new EsContextTrack$ContextTrack();
        n = esContextTrack$ContextTrack;
        esContextTrack$ContextTrack.makeImmutable();
    }

    private EsContextTrack$ContextTrack() {
    }

    static void h(EsContextTrack$ContextTrack esContextTrack$ContextTrack, String str) {
        esContextTrack$ContextTrack.getClass();
        str.getClass();
        esContextTrack$ContextTrack.b = str;
    }

    static void i(EsContextTrack$ContextTrack esContextTrack$ContextTrack, String str) {
        esContextTrack$ContextTrack.getClass();
        str.getClass();
        esContextTrack$ContextTrack.c = str;
    }

    static Map l(EsContextTrack$ContextTrack esContextTrack$ContextTrack) {
        if (!esContextTrack$ContextTrack.f.f()) {
            esContextTrack$ContextTrack.f = esContextTrack$ContextTrack.f.k();
        }
        return esContextTrack$ContextTrack.f;
    }

    public static EsContextTrack$ContextTrack m() {
        return n;
    }

    public static x<EsContextTrack$ContextTrack> parser() {
        return n.getParserForType();
    }

    public static a r() {
        return (a) n.toBuilder();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return n;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                EsContextTrack$ContextTrack esContextTrack$ContextTrack = (EsContextTrack$ContextTrack) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !esContextTrack$ContextTrack.b.isEmpty(), esContextTrack$ContextTrack.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, true ^ esContextTrack$ContextTrack.c.isEmpty(), esContextTrack$ContextTrack.c);
                this.f = hVar.c(this.f, esContextTrack$ContextTrack.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= esContextTrack$ContextTrack.a;
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
                                if (!this.f.f()) {
                                    this.f = this.f.k();
                                }
                                b.a.d(this.f, gVar, kVar);
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
                this.f.g();
                return null;
            case 4:
                return new EsContextTrack$ContextTrack();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (EsContextTrack$ContextTrack.class) {
                        if (o == null) {
                            o = new GeneratedMessageLite.c(n);
                        }
                    }
                }
                return o;
            default:
                throw new UnsupportedOperationException();
        }
        return n;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.b.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.b);
        }
        if (!this.c.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.c);
        }
        for (Map.Entry<String, String> entry : this.f.entrySet()) {
            i2 = je.j1(entry, b.a, 3, entry.getKey(), i2);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public int n() {
        return this.f.size();
    }

    public Map<String, String> o() {
        return Collections.unmodifiableMap(this.f);
    }

    public String p() {
        return this.c;
    }

    public String q() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(2, this.c);
        }
        for (Map.Entry<String, String> entry : this.f.entrySet()) {
            b.a.e(codedOutputStream, 3, entry.getKey(), entry.getValue());
        }
    }
}
