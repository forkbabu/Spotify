package com.spotify.player.esperanto.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import java.io.IOException;

public final class EsPause$PauseRequest extends GeneratedMessageLite<EsPause$PauseRequest, a> implements Object {
    private static final EsPause$PauseRequest c;
    private static volatile x<EsPause$PauseRequest> f;
    private EsCommandOptions$CommandOptions a;
    private EsLoggingParams$LoggingParams b;

    public static final class a extends GeneratedMessageLite.b<EsPause$PauseRequest, a> implements Object {
        public a m(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
            copyOnWrite();
            EsPause$PauseRequest.i((EsPause$PauseRequest) this.instance, esLoggingParams$LoggingParams);
            return this;
        }

        public a n(EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
            copyOnWrite();
            EsPause$PauseRequest.h((EsPause$PauseRequest) this.instance, esCommandOptions$CommandOptions);
            return this;
        }

        private a() {
            super(EsPause$PauseRequest.c);
        }
    }

    static {
        EsPause$PauseRequest esPause$PauseRequest = new EsPause$PauseRequest();
        c = esPause$PauseRequest;
        esPause$PauseRequest.makeImmutable();
    }

    private EsPause$PauseRequest() {
    }

    static void h(EsPause$PauseRequest esPause$PauseRequest, EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        esPause$PauseRequest.getClass();
        esCommandOptions$CommandOptions.getClass();
        esPause$PauseRequest.a = esCommandOptions$CommandOptions;
    }

    static void i(EsPause$PauseRequest esPause$PauseRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        esPause$PauseRequest.getClass();
        esLoggingParams$LoggingParams.getClass();
        esPause$PauseRequest.b = esLoggingParams$LoggingParams;
    }

    public static a l() {
        return (a) c.toBuilder();
    }

    public static x<EsPause$PauseRequest> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                EsPause$PauseRequest esPause$PauseRequest = (EsPause$PauseRequest) obj2;
                this.a = (EsCommandOptions$CommandOptions) hVar.i(this.a, esPause$PauseRequest.a);
                this.b = (EsLoggingParams$LoggingParams) hVar.i(this.b, esPause$PauseRequest.b);
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
                return new EsPause$PauseRequest();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (EsPause$PauseRequest.class) {
                        if (f == null) {
                            f = new GeneratedMessageLite.c(c);
                        }
                    }
                }
                return f;
            default:
                throw new UnsupportedOperationException();
        }
        return c;
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
    }
}
