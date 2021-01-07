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

public final class EsAddToQueueRequest$AddToQueueRequest extends GeneratedMessageLite<EsAddToQueueRequest$AddToQueueRequest, a> implements Object {
    private static final EsAddToQueueRequest$AddToQueueRequest f;
    private static volatile x<EsAddToQueueRequest$AddToQueueRequest> n;
    private EsContextTrack$ContextTrack a;
    private EsCommandOptions$CommandOptions b;
    private EsLoggingParams$LoggingParams c;

    public static final class a extends GeneratedMessageLite.b<EsAddToQueueRequest$AddToQueueRequest, a> implements Object {
        public a m(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
            copyOnWrite();
            EsAddToQueueRequest$AddToQueueRequest.l((EsAddToQueueRequest$AddToQueueRequest) this.instance, esLoggingParams$LoggingParams);
            return this;
        }

        public a n(EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
            copyOnWrite();
            EsAddToQueueRequest$AddToQueueRequest.i((EsAddToQueueRequest$AddToQueueRequest) this.instance, esCommandOptions$CommandOptions);
            return this;
        }

        public a o(EsContextTrack$ContextTrack esContextTrack$ContextTrack) {
            copyOnWrite();
            EsAddToQueueRequest$AddToQueueRequest.h((EsAddToQueueRequest$AddToQueueRequest) this.instance, esContextTrack$ContextTrack);
            return this;
        }

        private a() {
            super(EsAddToQueueRequest$AddToQueueRequest.f);
        }
    }

    static {
        EsAddToQueueRequest$AddToQueueRequest esAddToQueueRequest$AddToQueueRequest = new EsAddToQueueRequest$AddToQueueRequest();
        f = esAddToQueueRequest$AddToQueueRequest;
        esAddToQueueRequest$AddToQueueRequest.makeImmutable();
    }

    private EsAddToQueueRequest$AddToQueueRequest() {
    }

    static void h(EsAddToQueueRequest$AddToQueueRequest esAddToQueueRequest$AddToQueueRequest, EsContextTrack$ContextTrack esContextTrack$ContextTrack) {
        esAddToQueueRequest$AddToQueueRequest.getClass();
        esContextTrack$ContextTrack.getClass();
        esAddToQueueRequest$AddToQueueRequest.a = esContextTrack$ContextTrack;
    }

    static void i(EsAddToQueueRequest$AddToQueueRequest esAddToQueueRequest$AddToQueueRequest, EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        esAddToQueueRequest$AddToQueueRequest.getClass();
        esCommandOptions$CommandOptions.getClass();
        esAddToQueueRequest$AddToQueueRequest.b = esCommandOptions$CommandOptions;
    }

    static void l(EsAddToQueueRequest$AddToQueueRequest esAddToQueueRequest$AddToQueueRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        esAddToQueueRequest$AddToQueueRequest.getClass();
        esLoggingParams$LoggingParams.getClass();
        esAddToQueueRequest$AddToQueueRequest.c = esLoggingParams$LoggingParams;
    }

    public static a m() {
        return (a) f.toBuilder();
    }

    public static x<EsAddToQueueRequest$AddToQueueRequest> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                EsAddToQueueRequest$AddToQueueRequest esAddToQueueRequest$AddToQueueRequest = (EsAddToQueueRequest$AddToQueueRequest) obj2;
                this.a = (EsContextTrack$ContextTrack) hVar.i(this.a, esAddToQueueRequest$AddToQueueRequest.a);
                this.b = (EsCommandOptions$CommandOptions) hVar.i(this.b, esAddToQueueRequest$AddToQueueRequest.b);
                this.c = (EsLoggingParams$LoggingParams) hVar.i(this.c, esAddToQueueRequest$AddToQueueRequest.c);
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
                                EsContextTrack$ContextTrack esContextTrack$ContextTrack = this.a;
                                EsContextTrack$ContextTrack.a aVar = esContextTrack$ContextTrack != null ? (EsContextTrack$ContextTrack.a) esContextTrack$ContextTrack.toBuilder() : null;
                                EsContextTrack$ContextTrack esContextTrack$ContextTrack2 = (EsContextTrack$ContextTrack) gVar.o(EsContextTrack$ContextTrack.parser(), kVar);
                                this.a = esContextTrack$ContextTrack2;
                                if (aVar != null) {
                                    aVar.mergeFrom((EsContextTrack$ContextTrack.a) esContextTrack$ContextTrack2);
                                    this.a = (EsContextTrack$ContextTrack) aVar.buildPartial();
                                }
                            } else if (B == 18) {
                                EsCommandOptions$CommandOptions esCommandOptions$CommandOptions = this.b;
                                EsCommandOptions$CommandOptions.a aVar2 = esCommandOptions$CommandOptions != null ? (EsCommandOptions$CommandOptions.a) esCommandOptions$CommandOptions.toBuilder() : null;
                                EsCommandOptions$CommandOptions esCommandOptions$CommandOptions2 = (EsCommandOptions$CommandOptions) gVar.o(EsCommandOptions$CommandOptions.parser(), kVar);
                                this.b = esCommandOptions$CommandOptions2;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((EsCommandOptions$CommandOptions.a) esCommandOptions$CommandOptions2);
                                    this.b = (EsCommandOptions$CommandOptions) aVar2.buildPartial();
                                }
                            } else if (B == 26) {
                                EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = this.c;
                                EsLoggingParams$LoggingParams.a aVar3 = esLoggingParams$LoggingParams != null ? (EsLoggingParams$LoggingParams.a) esLoggingParams$LoggingParams.toBuilder() : null;
                                EsLoggingParams$LoggingParams esLoggingParams$LoggingParams2 = (EsLoggingParams$LoggingParams) gVar.o(EsLoggingParams$LoggingParams.parser(), kVar);
                                this.c = esLoggingParams$LoggingParams2;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((EsLoggingParams$LoggingParams.a) esLoggingParams$LoggingParams2);
                                    this.c = (EsLoggingParams$LoggingParams) aVar3.buildPartial();
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
                return new EsAddToQueueRequest$AddToQueueRequest();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (EsAddToQueueRequest$AddToQueueRequest.class) {
                        if (n == null) {
                            n = new GeneratedMessageLite.c(f);
                        }
                    }
                }
                return n;
            default:
                throw new UnsupportedOperationException();
        }
        return f;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        EsContextTrack$ContextTrack esContextTrack$ContextTrack = this.a;
        if (esContextTrack$ContextTrack != null) {
            i2 = 0 + CodedOutputStream.n(1, esContextTrack$ContextTrack);
        }
        EsCommandOptions$CommandOptions esCommandOptions$CommandOptions = this.b;
        if (esCommandOptions$CommandOptions != null) {
            i2 += CodedOutputStream.n(2, esCommandOptions$CommandOptions);
        }
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = this.c;
        if (esLoggingParams$LoggingParams != null) {
            i2 += CodedOutputStream.n(3, esLoggingParams$LoggingParams);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        EsContextTrack$ContextTrack esContextTrack$ContextTrack = this.a;
        if (esContextTrack$ContextTrack != null) {
            codedOutputStream.M(1, esContextTrack$ContextTrack);
        }
        EsCommandOptions$CommandOptions esCommandOptions$CommandOptions = this.b;
        if (esCommandOptions$CommandOptions != null) {
            codedOutputStream.M(2, esCommandOptions$CommandOptions);
        }
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = this.c;
        if (esLoggingParams$LoggingParams != null) {
            codedOutputStream.M(3, esLoggingParams$LoggingParams);
        }
    }
}
