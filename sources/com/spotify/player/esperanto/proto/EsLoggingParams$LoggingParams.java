package com.spotify.player.esperanto.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import java.io.IOException;

public final class EsLoggingParams$LoggingParams extends GeneratedMessageLite<EsLoggingParams$LoggingParams, a> implements Object {
    private static final EsLoggingParams$LoggingParams o;
    private static volatile x<EsLoggingParams$LoggingParams> p;
    private int a;
    private EsOptional$OptionalInt64 b;
    private EsOptional$OptionalInt64 c;
    private o.i<String> f = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> n = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.b<EsLoggingParams$LoggingParams, a> implements Object {
        public a m(String str) {
            copyOnWrite();
            EsLoggingParams$LoggingParams.l((EsLoggingParams$LoggingParams) this.instance, str);
            return this;
        }

        public a n(String str) {
            copyOnWrite();
            EsLoggingParams$LoggingParams.i((EsLoggingParams$LoggingParams) this.instance, str);
            return this;
        }

        public a o(EsOptional$OptionalInt64 esOptional$OptionalInt64) {
            copyOnWrite();
            EsLoggingParams$LoggingParams.h((EsLoggingParams$LoggingParams) this.instance, esOptional$OptionalInt64);
            return this;
        }

        private a() {
            super(EsLoggingParams$LoggingParams.o);
        }
    }

    static {
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = new EsLoggingParams$LoggingParams();
        o = esLoggingParams$LoggingParams;
        esLoggingParams$LoggingParams.makeImmutable();
    }

    private EsLoggingParams$LoggingParams() {
    }

    static void h(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams, EsOptional$OptionalInt64 esOptional$OptionalInt64) {
        esLoggingParams$LoggingParams.getClass();
        esOptional$OptionalInt64.getClass();
        esLoggingParams$LoggingParams.b = esOptional$OptionalInt64;
    }

    static void i(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams, String str) {
        esLoggingParams$LoggingParams.getClass();
        str.getClass();
        if (!esLoggingParams$LoggingParams.f.R0()) {
            esLoggingParams$LoggingParams.f = GeneratedMessageLite.mutableCopy(esLoggingParams$LoggingParams.f);
        }
        esLoggingParams$LoggingParams.f.add(str);
    }

    static void l(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams, String str) {
        esLoggingParams$LoggingParams.getClass();
        str.getClass();
        if (!esLoggingParams$LoggingParams.n.R0()) {
            esLoggingParams$LoggingParams.n = GeneratedMessageLite.mutableCopy(esLoggingParams$LoggingParams.n);
        }
        esLoggingParams$LoggingParams.n.add(str);
    }

    public static a m() {
        return (a) o.toBuilder();
    }

    public static x<EsLoggingParams$LoggingParams> parser() {
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
                EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = (EsLoggingParams$LoggingParams) obj2;
                this.b = (EsOptional$OptionalInt64) hVar.i(this.b, esLoggingParams$LoggingParams.b);
                this.c = (EsOptional$OptionalInt64) hVar.i(this.c, esLoggingParams$LoggingParams.c);
                this.f = hVar.q(this.f, esLoggingParams$LoggingParams.f);
                this.n = hVar.q(this.n, esLoggingParams$LoggingParams.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= esLoggingParams$LoggingParams.a;
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
                                EsOptional$OptionalInt64 esOptional$OptionalInt64 = this.b;
                                EsOptional$OptionalInt64.a aVar = esOptional$OptionalInt64 != null ? (EsOptional$OptionalInt64.a) esOptional$OptionalInt64.toBuilder() : null;
                                EsOptional$OptionalInt64 esOptional$OptionalInt642 = (EsOptional$OptionalInt64) gVar.o(EsOptional$OptionalInt64.parser(), kVar);
                                this.b = esOptional$OptionalInt642;
                                if (aVar != null) {
                                    aVar.mergeFrom((EsOptional$OptionalInt64.a) esOptional$OptionalInt642);
                                    this.b = (EsOptional$OptionalInt64) aVar.buildPartial();
                                }
                            } else if (B == 18) {
                                EsOptional$OptionalInt64 esOptional$OptionalInt643 = this.c;
                                EsOptional$OptionalInt64.a aVar2 = esOptional$OptionalInt643 != null ? (EsOptional$OptionalInt64.a) esOptional$OptionalInt643.toBuilder() : null;
                                EsOptional$OptionalInt64 esOptional$OptionalInt644 = (EsOptional$OptionalInt64) gVar.o(EsOptional$OptionalInt64.parser(), kVar);
                                this.c = esOptional$OptionalInt644;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((EsOptional$OptionalInt64.a) esOptional$OptionalInt644);
                                    this.c = (EsOptional$OptionalInt64) aVar2.buildPartial();
                                }
                            } else if (B == 26) {
                                String A = gVar.A();
                                if (!this.f.R0()) {
                                    this.f = GeneratedMessageLite.mutableCopy(this.f);
                                }
                                this.f.add(A);
                            } else if (B == 34) {
                                String A2 = gVar.A();
                                if (!this.n.R0()) {
                                    this.n = GeneratedMessageLite.mutableCopy(this.n);
                                }
                                this.n.add(A2);
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
                this.f.C();
                this.n.C();
                return null;
            case 4:
                return new EsLoggingParams$LoggingParams();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (EsLoggingParams$LoggingParams.class) {
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
        EsOptional$OptionalInt64 esOptional$OptionalInt64 = this.b;
        int n2 = esOptional$OptionalInt64 != null ? CodedOutputStream.n(1, esOptional$OptionalInt64) + 0 : 0;
        EsOptional$OptionalInt64 esOptional$OptionalInt642 = this.c;
        if (esOptional$OptionalInt642 != null) {
            n2 += CodedOutputStream.n(2, esOptional$OptionalInt642);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            i2 += CodedOutputStream.q(this.f.get(i3));
        }
        int C0 = je.C0(this.f, 1, n2 + i2);
        int i4 = 0;
        for (int i5 = 0; i5 < this.n.size(); i5++) {
            i4 += CodedOutputStream.q(this.n.get(i5));
        }
        int C02 = je.C0(this.n, 1, C0 + i4);
        this.memoizedSerializedSize = C02;
        return C02;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        EsOptional$OptionalInt64 esOptional$OptionalInt64 = this.b;
        if (esOptional$OptionalInt64 != null) {
            codedOutputStream.M(1, esOptional$OptionalInt64);
        }
        EsOptional$OptionalInt64 esOptional$OptionalInt642 = this.c;
        if (esOptional$OptionalInt642 != null) {
            codedOutputStream.M(2, esOptional$OptionalInt642);
        }
        for (int i = 0; i < this.f.size(); i++) {
            codedOutputStream.P(3, this.f.get(i));
        }
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            codedOutputStream.P(4, this.n.get(i2));
        }
    }
}
