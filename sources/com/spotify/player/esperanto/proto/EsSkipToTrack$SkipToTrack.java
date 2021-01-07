package com.spotify.player.esperanto.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import java.io.IOException;

public final class EsSkipToTrack$SkipToTrack extends GeneratedMessageLite<EsSkipToTrack$SkipToTrack, a> implements Object {
    private static final EsSkipToTrack$SkipToTrack o;
    private static volatile x<EsSkipToTrack$SkipToTrack> p;
    private String a = "";
    private EsOptional$OptionalInt64 b;
    private String c = "";
    private String f = "";
    private EsOptional$OptionalInt64 n;

    public static final class a extends GeneratedMessageLite.b<EsSkipToTrack$SkipToTrack, a> implements Object {
        public a m(EsOptional$OptionalInt64 esOptional$OptionalInt64) {
            copyOnWrite();
            EsSkipToTrack$SkipToTrack.m((EsSkipToTrack$SkipToTrack) this.instance, esOptional$OptionalInt64);
            return this;
        }

        public a n(String str) {
            copyOnWrite();
            EsSkipToTrack$SkipToTrack.h((EsSkipToTrack$SkipToTrack) this.instance, str);
            return this;
        }

        public a o(EsOptional$OptionalInt64 esOptional$OptionalInt64) {
            copyOnWrite();
            EsSkipToTrack$SkipToTrack.l((EsSkipToTrack$SkipToTrack) this.instance, esOptional$OptionalInt64);
            return this;
        }

        public a p(String str) {
            copyOnWrite();
            EsSkipToTrack$SkipToTrack.n((EsSkipToTrack$SkipToTrack) this.instance, str);
            return this;
        }

        public a q(String str) {
            copyOnWrite();
            EsSkipToTrack$SkipToTrack.i((EsSkipToTrack$SkipToTrack) this.instance, str);
            return this;
        }

        private a() {
            super(EsSkipToTrack$SkipToTrack.o);
        }
    }

    static {
        EsSkipToTrack$SkipToTrack esSkipToTrack$SkipToTrack = new EsSkipToTrack$SkipToTrack();
        o = esSkipToTrack$SkipToTrack;
        esSkipToTrack$SkipToTrack.makeImmutable();
    }

    private EsSkipToTrack$SkipToTrack() {
    }

    static void h(EsSkipToTrack$SkipToTrack esSkipToTrack$SkipToTrack, String str) {
        esSkipToTrack$SkipToTrack.getClass();
        str.getClass();
        esSkipToTrack$SkipToTrack.a = str;
    }

    static void i(EsSkipToTrack$SkipToTrack esSkipToTrack$SkipToTrack, String str) {
        esSkipToTrack$SkipToTrack.getClass();
        str.getClass();
        esSkipToTrack$SkipToTrack.f = str;
    }

    static void l(EsSkipToTrack$SkipToTrack esSkipToTrack$SkipToTrack, EsOptional$OptionalInt64 esOptional$OptionalInt64) {
        esSkipToTrack$SkipToTrack.getClass();
        esOptional$OptionalInt64.getClass();
        esSkipToTrack$SkipToTrack.n = esOptional$OptionalInt64;
    }

    static void m(EsSkipToTrack$SkipToTrack esSkipToTrack$SkipToTrack, EsOptional$OptionalInt64 esOptional$OptionalInt64) {
        esSkipToTrack$SkipToTrack.getClass();
        esOptional$OptionalInt64.getClass();
        esSkipToTrack$SkipToTrack.b = esOptional$OptionalInt64;
    }

    static void n(EsSkipToTrack$SkipToTrack esSkipToTrack$SkipToTrack, String str) {
        esSkipToTrack$SkipToTrack.getClass();
        str.getClass();
        esSkipToTrack$SkipToTrack.c = str;
    }

    public static a o() {
        return (a) o.toBuilder();
    }

    public static x<EsSkipToTrack$SkipToTrack> parser() {
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
                EsSkipToTrack$SkipToTrack esSkipToTrack$SkipToTrack = (EsSkipToTrack$SkipToTrack) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !esSkipToTrack$SkipToTrack.a.isEmpty(), esSkipToTrack$SkipToTrack.a);
                this.b = (EsOptional$OptionalInt64) hVar.i(this.b, esSkipToTrack$SkipToTrack.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !esSkipToTrack$SkipToTrack.c.isEmpty(), esSkipToTrack$SkipToTrack.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, true ^ esSkipToTrack$SkipToTrack.f.isEmpty(), esSkipToTrack$SkipToTrack.f);
                this.n = (EsOptional$OptionalInt64) hVar.i(this.n, esSkipToTrack$SkipToTrack.n);
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
                                this.a = gVar.A();
                            } else if (B == 18) {
                                EsOptional$OptionalInt64 esOptional$OptionalInt64 = this.b;
                                EsOptional$OptionalInt64.a aVar = esOptional$OptionalInt64 != null ? (EsOptional$OptionalInt64.a) esOptional$OptionalInt64.toBuilder() : null;
                                EsOptional$OptionalInt64 esOptional$OptionalInt642 = (EsOptional$OptionalInt64) gVar.o(EsOptional$OptionalInt64.parser(), kVar);
                                this.b = esOptional$OptionalInt642;
                                if (aVar != null) {
                                    aVar.mergeFrom((EsOptional$OptionalInt64.a) esOptional$OptionalInt642);
                                    this.b = (EsOptional$OptionalInt64) aVar.buildPartial();
                                }
                            } else if (B == 26) {
                                this.c = gVar.A();
                            } else if (B == 34) {
                                this.f = gVar.A();
                            } else if (B == 42) {
                                EsOptional$OptionalInt64 esOptional$OptionalInt643 = this.n;
                                EsOptional$OptionalInt64.a aVar2 = esOptional$OptionalInt643 != null ? (EsOptional$OptionalInt64.a) esOptional$OptionalInt643.toBuilder() : null;
                                EsOptional$OptionalInt64 esOptional$OptionalInt644 = (EsOptional$OptionalInt64) gVar.o(EsOptional$OptionalInt64.parser(), kVar);
                                this.n = esOptional$OptionalInt644;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((EsOptional$OptionalInt64.a) esOptional$OptionalInt644);
                                    this.n = (EsOptional$OptionalInt64) aVar2.buildPartial();
                                }
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
                return null;
            case 4:
                return new EsSkipToTrack$SkipToTrack();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (EsSkipToTrack$SkipToTrack.class) {
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
        int i2 = 0;
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
        }
        EsOptional$OptionalInt64 esOptional$OptionalInt64 = this.b;
        if (esOptional$OptionalInt64 != null) {
            i2 += CodedOutputStream.n(2, esOptional$OptionalInt64);
        }
        if (!this.c.isEmpty()) {
            i2 += CodedOutputStream.p(3, this.c);
        }
        if (!this.f.isEmpty()) {
            i2 += CodedOutputStream.p(4, this.f);
        }
        EsOptional$OptionalInt64 esOptional$OptionalInt642 = this.n;
        if (esOptional$OptionalInt642 != null) {
            i2 += CodedOutputStream.n(5, esOptional$OptionalInt642);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        EsOptional$OptionalInt64 esOptional$OptionalInt64 = this.b;
        if (esOptional$OptionalInt64 != null) {
            codedOutputStream.M(2, esOptional$OptionalInt64);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(3, this.c);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(4, this.f);
        }
        EsOptional$OptionalInt64 esOptional$OptionalInt642 = this.n;
        if (esOptional$OptionalInt642 != null) {
            codedOutputStream.M(5, esOptional$OptionalInt642);
        }
    }
}
