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

public final class EsSkipNext$SkipNextRequest extends GeneratedMessageLite<EsSkipNext$SkipNextRequest, a> implements Object {
    private static final EsSkipNext$SkipNextRequest f;
    private static volatile x<EsSkipNext$SkipNextRequest> n;
    private EsCommandOptions$CommandOptions a;
    private EsLoggingParams$LoggingParams b;
    private EsContextTrack$ContextTrack c;

    public static final class a extends GeneratedMessageLite.b<EsSkipNext$SkipNextRequest, a> implements Object {
        public a m(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
            copyOnWrite();
            EsSkipNext$SkipNextRequest.i((EsSkipNext$SkipNextRequest) this.instance, esLoggingParams$LoggingParams);
            return this;
        }

        public a n(EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
            copyOnWrite();
            EsSkipNext$SkipNextRequest.h((EsSkipNext$SkipNextRequest) this.instance, esCommandOptions$CommandOptions);
            return this;
        }

        public a o(EsContextTrack$ContextTrack esContextTrack$ContextTrack) {
            copyOnWrite();
            EsSkipNext$SkipNextRequest.l((EsSkipNext$SkipNextRequest) this.instance, esContextTrack$ContextTrack);
            return this;
        }

        private a() {
            super(EsSkipNext$SkipNextRequest.f);
        }
    }

    static {
        EsSkipNext$SkipNextRequest esSkipNext$SkipNextRequest = new EsSkipNext$SkipNextRequest();
        f = esSkipNext$SkipNextRequest;
        esSkipNext$SkipNextRequest.makeImmutable();
    }

    private EsSkipNext$SkipNextRequest() {
    }

    static void h(EsSkipNext$SkipNextRequest esSkipNext$SkipNextRequest, EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        esSkipNext$SkipNextRequest.getClass();
        esCommandOptions$CommandOptions.getClass();
        esSkipNext$SkipNextRequest.a = esCommandOptions$CommandOptions;
    }

    static void i(EsSkipNext$SkipNextRequest esSkipNext$SkipNextRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        esSkipNext$SkipNextRequest.getClass();
        esLoggingParams$LoggingParams.getClass();
        esSkipNext$SkipNextRequest.b = esLoggingParams$LoggingParams;
    }

    static void l(EsSkipNext$SkipNextRequest esSkipNext$SkipNextRequest, EsContextTrack$ContextTrack esContextTrack$ContextTrack) {
        esSkipNext$SkipNextRequest.getClass();
        esContextTrack$ContextTrack.getClass();
        esSkipNext$SkipNextRequest.c = esContextTrack$ContextTrack;
    }

    public static a m() {
        return (a) f.toBuilder();
    }

    public static x<EsSkipNext$SkipNextRequest> parser() {
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
                EsSkipNext$SkipNextRequest esSkipNext$SkipNextRequest = (EsSkipNext$SkipNextRequest) obj2;
                this.a = (EsCommandOptions$CommandOptions) hVar.i(this.a, esSkipNext$SkipNextRequest.a);
                this.b = (EsLoggingParams$LoggingParams) hVar.i(this.b, esSkipNext$SkipNextRequest.b);
                this.c = (EsContextTrack$ContextTrack) hVar.i(this.c, esSkipNext$SkipNextRequest.c);
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
                                EsCommandOptions$CommandOptions esCommandOptions$CommandOptions = this.a;
                                EsCommandOptions$CommandOptions.a aVar = esCommandOptions$CommandOptions != null ? (EsCommandOptions$CommandOptions.a) esCommandOptions$CommandOptions.toBuilder() : null;
                                EsCommandOptions$CommandOptions esCommandOptions$CommandOptions2 = (EsCommandOptions$CommandOptions) gVar.o(EsCommandOptions$CommandOptions.parser(), kVar);
                                this.a = esCommandOptions$CommandOptions2;
                                if (aVar != null) {
                                    aVar.mergeFrom((EsCommandOptions$CommandOptions.a) esCommandOptions$CommandOptions2);
                                    this.a = (EsCommandOptions$CommandOptions) aVar.buildPartial();
                                }
                            } else if (B == 18) {
                                EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = this.b;
                                EsLoggingParams$LoggingParams.a aVar2 = esLoggingParams$LoggingParams != null ? (EsLoggingParams$LoggingParams.a) esLoggingParams$LoggingParams.toBuilder() : null;
                                EsLoggingParams$LoggingParams esLoggingParams$LoggingParams2 = (EsLoggingParams$LoggingParams) gVar.o(EsLoggingParams$LoggingParams.parser(), kVar);
                                this.b = esLoggingParams$LoggingParams2;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((EsLoggingParams$LoggingParams.a) esLoggingParams$LoggingParams2);
                                    this.b = (EsLoggingParams$LoggingParams) aVar2.buildPartial();
                                }
                            } else if (B == 26) {
                                EsContextTrack$ContextTrack esContextTrack$ContextTrack = this.c;
                                EsContextTrack$ContextTrack.a aVar3 = esContextTrack$ContextTrack != null ? (EsContextTrack$ContextTrack.a) esContextTrack$ContextTrack.toBuilder() : null;
                                EsContextTrack$ContextTrack esContextTrack$ContextTrack2 = (EsContextTrack$ContextTrack) gVar.o(EsContextTrack$ContextTrack.parser(), kVar);
                                this.c = esContextTrack$ContextTrack2;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((EsContextTrack$ContextTrack.a) esContextTrack$ContextTrack2);
                                    this.c = (EsContextTrack$ContextTrack) aVar3.buildPartial();
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
                return new EsSkipNext$SkipNextRequest();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (EsSkipNext$SkipNextRequest.class) {
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
        EsCommandOptions$CommandOptions esCommandOptions$CommandOptions = this.a;
        if (esCommandOptions$CommandOptions != null) {
            i2 = 0 + CodedOutputStream.n(1, esCommandOptions$CommandOptions);
        }
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = this.b;
        if (esLoggingParams$LoggingParams != null) {
            i2 += CodedOutputStream.n(2, esLoggingParams$LoggingParams);
        }
        EsContextTrack$ContextTrack esContextTrack$ContextTrack = this.c;
        if (esContextTrack$ContextTrack != null) {
            i2 += CodedOutputStream.n(3, esContextTrack$ContextTrack);
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
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = this.b;
        if (esLoggingParams$LoggingParams != null) {
            codedOutputStream.M(2, esLoggingParams$LoggingParams);
        }
        EsContextTrack$ContextTrack esContextTrack$ContextTrack = this.c;
        if (esContextTrack$ContextTrack != null) {
            codedOutputStream.M(3, esContextTrack$ContextTrack);
        }
    }
}
