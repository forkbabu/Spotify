package com.spotify.player.esperanto.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.player.esperanto.proto.EsContextTrack$ContextTrack;
import java.io.IOException;

public final class EsProvidedTrack$ProvidedTrack extends GeneratedMessageLite<EsProvidedTrack$ProvidedTrack, a> implements Object {
    private static final EsProvidedTrack$ProvidedTrack o;
    private static volatile x<EsProvidedTrack$ProvidedTrack> p;
    private int a;
    private EsContextTrack$ContextTrack b;
    private o.i<String> c = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> f = GeneratedMessageLite.emptyProtobufList();
    private String n = "";

    public static final class a extends GeneratedMessageLite.b<EsProvidedTrack$ProvidedTrack, a> implements Object {
        public a m(EsContextTrack$ContextTrack esContextTrack$ContextTrack) {
            copyOnWrite();
            EsProvidedTrack$ProvidedTrack.h((EsProvidedTrack$ProvidedTrack) this.instance, esContextTrack$ContextTrack);
            return this;
        }

        public a n(String str) {
            copyOnWrite();
            EsProvidedTrack$ProvidedTrack.i((EsProvidedTrack$ProvidedTrack) this.instance, str);
            return this;
        }

        private a() {
            super(EsProvidedTrack$ProvidedTrack.o);
        }
    }

    static {
        EsProvidedTrack$ProvidedTrack esProvidedTrack$ProvidedTrack = new EsProvidedTrack$ProvidedTrack();
        o = esProvidedTrack$ProvidedTrack;
        esProvidedTrack$ProvidedTrack.makeImmutable();
    }

    private EsProvidedTrack$ProvidedTrack() {
    }

    static void h(EsProvidedTrack$ProvidedTrack esProvidedTrack$ProvidedTrack, EsContextTrack$ContextTrack esContextTrack$ContextTrack) {
        esProvidedTrack$ProvidedTrack.getClass();
        esContextTrack$ContextTrack.getClass();
        esProvidedTrack$ProvidedTrack.b = esContextTrack$ContextTrack;
    }

    static void i(EsProvidedTrack$ProvidedTrack esProvidedTrack$ProvidedTrack, String str) {
        esProvidedTrack$ProvidedTrack.getClass();
        str.getClass();
        esProvidedTrack$ProvidedTrack.n = str;
    }

    public static EsProvidedTrack$ProvidedTrack m() {
        return o;
    }

    public static a o() {
        return (a) o.toBuilder();
    }

    public static x<EsProvidedTrack$ProvidedTrack> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                EsProvidedTrack$ProvidedTrack esProvidedTrack$ProvidedTrack = (EsProvidedTrack$ProvidedTrack) obj2;
                this.b = (EsContextTrack$ContextTrack) hVar.i(this.b, esProvidedTrack$ProvidedTrack.b);
                this.c = hVar.q(this.c, esProvidedTrack$ProvidedTrack.c);
                this.f = hVar.q(this.f, esProvidedTrack$ProvidedTrack.f);
                this.n = hVar.n(!this.n.isEmpty(), this.n, true ^ esProvidedTrack$ProvidedTrack.n.isEmpty(), esProvidedTrack$ProvidedTrack.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= esProvidedTrack$ProvidedTrack.a;
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
                                EsContextTrack$ContextTrack esContextTrack$ContextTrack = this.b;
                                EsContextTrack$ContextTrack.a aVar = esContextTrack$ContextTrack != null ? (EsContextTrack$ContextTrack.a) esContextTrack$ContextTrack.toBuilder() : null;
                                EsContextTrack$ContextTrack esContextTrack$ContextTrack2 = (EsContextTrack$ContextTrack) gVar.o(EsContextTrack$ContextTrack.parser(), kVar);
                                this.b = esContextTrack$ContextTrack2;
                                if (aVar != null) {
                                    aVar.mergeFrom((EsContextTrack$ContextTrack.a) esContextTrack$ContextTrack2);
                                    this.b = (EsContextTrack$ContextTrack) aVar.buildPartial();
                                }
                            } else if (B == 18) {
                                String A = gVar.A();
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(A);
                            } else if (B == 26) {
                                String A2 = gVar.A();
                                if (!this.f.R0()) {
                                    this.f = GeneratedMessageLite.mutableCopy(this.f);
                                }
                                this.f.add(A2);
                            } else if (B == 34) {
                                this.n = gVar.A();
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
                this.c.C();
                this.f.C();
                return null;
            case 4:
                return new EsProvidedTrack$ProvidedTrack();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (EsProvidedTrack$ProvidedTrack.class) {
                        if (p == null) {
                            p = new GeneratedMessageLite.c(o);
                        }
                    }
                }
                return p;
            default:
                throw new UnsupportedOperationException();
        }
        return o;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int n2 = this.b != null ? CodedOutputStream.n(1, l()) + 0 : 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            i2 += CodedOutputStream.q(this.c.get(i3));
        }
        int C0 = je.C0(this.c, 1, n2 + i2);
        int i4 = 0;
        for (int i5 = 0; i5 < this.f.size(); i5++) {
            i4 += CodedOutputStream.q(this.f.get(i5));
        }
        int C02 = je.C0(this.f, 1, C0 + i4);
        if (!this.n.isEmpty()) {
            C02 += CodedOutputStream.p(4, this.n);
        }
        this.memoizedSerializedSize = C02;
        return C02;
    }

    public EsContextTrack$ContextTrack l() {
        EsContextTrack$ContextTrack esContextTrack$ContextTrack = this.b;
        return esContextTrack$ContextTrack == null ? EsContextTrack$ContextTrack.m() : esContextTrack$ContextTrack;
    }

    public String n() {
        return this.n;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.b != null) {
            codedOutputStream.M(1, l());
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.P(2, this.c.get(i));
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            codedOutputStream.P(3, this.f.get(i2));
        }
        if (!this.n.isEmpty()) {
            codedOutputStream.P(4, this.n);
        }
    }
}
