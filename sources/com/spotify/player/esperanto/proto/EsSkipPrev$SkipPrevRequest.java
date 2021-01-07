package com.spotify.player.esperanto.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import com.spotify.player.esperanto.proto.EsContextTrack$ContextTrack;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import java.io.IOException;

public final class EsSkipPrev$SkipPrevRequest extends GeneratedMessageLite<EsSkipPrev$SkipPrevRequest, a> implements Object {
    private static final EsSkipPrev$SkipPrevRequest n;
    private static volatile x<EsSkipPrev$SkipPrevRequest> o;
    private EsCommandOptions$CommandOptions a;
    private boolean b;
    private EsLoggingParams$LoggingParams c;
    private EsContextTrack$ContextTrack f;

    public static final class a extends GeneratedMessageLite.b<EsSkipPrev$SkipPrevRequest, a> implements Object {
        public a m(boolean z) {
            copyOnWrite();
            EsSkipPrev$SkipPrevRequest.l((EsSkipPrev$SkipPrevRequest) this.instance, z);
            return this;
        }

        public a n(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
            copyOnWrite();
            EsSkipPrev$SkipPrevRequest.m((EsSkipPrev$SkipPrevRequest) this.instance, esLoggingParams$LoggingParams);
            return this;
        }

        public a o(EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
            copyOnWrite();
            EsSkipPrev$SkipPrevRequest.h((EsSkipPrev$SkipPrevRequest) this.instance, esCommandOptions$CommandOptions);
            return this;
        }

        public a p(EsContextTrack$ContextTrack esContextTrack$ContextTrack) {
            copyOnWrite();
            EsSkipPrev$SkipPrevRequest.i((EsSkipPrev$SkipPrevRequest) this.instance, esContextTrack$ContextTrack);
            return this;
        }

        private a() {
            super(EsSkipPrev$SkipPrevRequest.n);
        }
    }

    static {
        EsSkipPrev$SkipPrevRequest esSkipPrev$SkipPrevRequest = new EsSkipPrev$SkipPrevRequest();
        n = esSkipPrev$SkipPrevRequest;
        esSkipPrev$SkipPrevRequest.makeImmutable();
    }

    private EsSkipPrev$SkipPrevRequest() {
    }

    static void h(EsSkipPrev$SkipPrevRequest esSkipPrev$SkipPrevRequest, EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        esSkipPrev$SkipPrevRequest.getClass();
        esCommandOptions$CommandOptions.getClass();
        esSkipPrev$SkipPrevRequest.a = esCommandOptions$CommandOptions;
    }

    static void i(EsSkipPrev$SkipPrevRequest esSkipPrev$SkipPrevRequest, EsContextTrack$ContextTrack esContextTrack$ContextTrack) {
        esSkipPrev$SkipPrevRequest.getClass();
        esContextTrack$ContextTrack.getClass();
        esSkipPrev$SkipPrevRequest.f = esContextTrack$ContextTrack;
    }

    static void l(EsSkipPrev$SkipPrevRequest esSkipPrev$SkipPrevRequest, boolean z) {
        esSkipPrev$SkipPrevRequest.b = z;
    }

    static void m(EsSkipPrev$SkipPrevRequest esSkipPrev$SkipPrevRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        esSkipPrev$SkipPrevRequest.getClass();
        esLoggingParams$LoggingParams.getClass();
        esSkipPrev$SkipPrevRequest.c = esLoggingParams$LoggingParams;
    }

    public static a n() {
        return (a) n.toBuilder();
    }

    public static x<EsSkipPrev$SkipPrevRequest> parser() {
        return n.getParserForType();
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
                EsSkipPrev$SkipPrevRequest esSkipPrev$SkipPrevRequest = (EsSkipPrev$SkipPrevRequest) obj2;
                this.a = (EsCommandOptions$CommandOptions) hVar.i(this.a, esSkipPrev$SkipPrevRequest.a);
                boolean z = this.b;
                boolean z2 = esSkipPrev$SkipPrevRequest.b;
                this.b = hVar.f(z, z, z2, z2);
                this.c = (EsLoggingParams$LoggingParams) hVar.i(this.c, esSkipPrev$SkipPrevRequest.c);
                this.f = (EsContextTrack$ContextTrack) hVar.i(this.f, esSkipPrev$SkipPrevRequest.f);
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
                                EsCommandOptions$CommandOptions esCommandOptions$CommandOptions = this.a;
                                EsCommandOptions$CommandOptions.a aVar = esCommandOptions$CommandOptions != null ? (EsCommandOptions$CommandOptions.a) esCommandOptions$CommandOptions.toBuilder() : null;
                                EsCommandOptions$CommandOptions esCommandOptions$CommandOptions2 = (EsCommandOptions$CommandOptions) gVar.o(EsCommandOptions$CommandOptions.parser(), kVar);
                                this.a = esCommandOptions$CommandOptions2;
                                if (aVar != null) {
                                    aVar.mergeFrom((EsCommandOptions$CommandOptions.a) esCommandOptions$CommandOptions2);
                                    this.a = (EsCommandOptions$CommandOptions) aVar.buildPartial();
                                }
                            } else if (B == 16) {
                                this.b = gVar.h();
                            } else if (B == 26) {
                                EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = this.c;
                                EsLoggingParams$LoggingParams.a aVar2 = esLoggingParams$LoggingParams != null ? (EsLoggingParams$LoggingParams.a) esLoggingParams$LoggingParams.toBuilder() : null;
                                EsLoggingParams$LoggingParams esLoggingParams$LoggingParams2 = (EsLoggingParams$LoggingParams) gVar.o(EsLoggingParams$LoggingParams.parser(), kVar);
                                this.c = esLoggingParams$LoggingParams2;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((EsLoggingParams$LoggingParams.a) esLoggingParams$LoggingParams2);
                                    this.c = (EsLoggingParams$LoggingParams) aVar2.buildPartial();
                                }
                            } else if (B == 34) {
                                EsContextTrack$ContextTrack esContextTrack$ContextTrack = this.f;
                                EsContextTrack$ContextTrack.a aVar3 = esContextTrack$ContextTrack != null ? (EsContextTrack$ContextTrack.a) esContextTrack$ContextTrack.toBuilder() : null;
                                EsContextTrack$ContextTrack esContextTrack$ContextTrack2 = (EsContextTrack$ContextTrack) gVar.o(EsContextTrack$ContextTrack.parser(), kVar);
                                this.f = esContextTrack$ContextTrack2;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((EsContextTrack$ContextTrack.a) esContextTrack$ContextTrack2);
                                    this.f = (EsContextTrack$ContextTrack) aVar3.buildPartial();
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
                return null;
            case 4:
                return new EsSkipPrev$SkipPrevRequest();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (EsSkipPrev$SkipPrevRequest.class) {
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
        EsCommandOptions$CommandOptions esCommandOptions$CommandOptions = this.a;
        if (esCommandOptions$CommandOptions != null) {
            i2 = 0 + CodedOutputStream.n(1, esCommandOptions$CommandOptions);
        }
        boolean z = this.b;
        if (z) {
            i2 += CodedOutputStream.d(2, z);
        }
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = this.c;
        if (esLoggingParams$LoggingParams != null) {
            i2 += CodedOutputStream.n(3, esLoggingParams$LoggingParams);
        }
        EsContextTrack$ContextTrack esContextTrack$ContextTrack = this.f;
        if (esContextTrack$ContextTrack != null) {
            i2 += CodedOutputStream.n(4, esContextTrack$ContextTrack);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        EsCommandOptions$CommandOptions esCommandOptions$CommandOptions = this.a;
        if (esCommandOptions$CommandOptions != null) {
            codedOutputStream.M(1, esCommandOptions$CommandOptions);
        }
        boolean z = this.b;
        if (z) {
            codedOutputStream.A(2, z);
        }
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = this.c;
        if (esLoggingParams$LoggingParams != null) {
            codedOutputStream.M(3, esLoggingParams$LoggingParams);
        }
        EsContextTrack$ContextTrack esContextTrack$ContextTrack = this.f;
        if (esContextTrack$ContextTrack != null) {
            codedOutputStream.M(4, esContextTrack$ContextTrack);
        }
    }
}
