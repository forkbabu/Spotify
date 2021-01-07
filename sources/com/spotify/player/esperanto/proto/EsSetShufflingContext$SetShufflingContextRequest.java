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

public final class EsSetShufflingContext$SetShufflingContextRequest extends GeneratedMessageLite<EsSetShufflingContext$SetShufflingContextRequest, a> implements Object {
    private static final EsSetShufflingContext$SetShufflingContextRequest f;
    private static volatile x<EsSetShufflingContext$SetShufflingContextRequest> n;
    private boolean a;
    private EsCommandOptions$CommandOptions b;
    private EsLoggingParams$LoggingParams c;

    public static final class a extends GeneratedMessageLite.b<EsSetShufflingContext$SetShufflingContextRequest, a> implements Object {
        public a m(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
            copyOnWrite();
            EsSetShufflingContext$SetShufflingContextRequest.l((EsSetShufflingContext$SetShufflingContextRequest) this.instance, esLoggingParams$LoggingParams);
            return this;
        }

        public a n(EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
            copyOnWrite();
            EsSetShufflingContext$SetShufflingContextRequest.i((EsSetShufflingContext$SetShufflingContextRequest) this.instance, esCommandOptions$CommandOptions);
            return this;
        }

        public a o(boolean z) {
            copyOnWrite();
            EsSetShufflingContext$SetShufflingContextRequest.h((EsSetShufflingContext$SetShufflingContextRequest) this.instance, z);
            return this;
        }

        private a() {
            super(EsSetShufflingContext$SetShufflingContextRequest.f);
        }
    }

    static {
        EsSetShufflingContext$SetShufflingContextRequest esSetShufflingContext$SetShufflingContextRequest = new EsSetShufflingContext$SetShufflingContextRequest();
        f = esSetShufflingContext$SetShufflingContextRequest;
        esSetShufflingContext$SetShufflingContextRequest.makeImmutable();
    }

    private EsSetShufflingContext$SetShufflingContextRequest() {
    }

    static void h(EsSetShufflingContext$SetShufflingContextRequest esSetShufflingContext$SetShufflingContextRequest, boolean z) {
        esSetShufflingContext$SetShufflingContextRequest.a = z;
    }

    static void i(EsSetShufflingContext$SetShufflingContextRequest esSetShufflingContext$SetShufflingContextRequest, EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        esSetShufflingContext$SetShufflingContextRequest.getClass();
        esCommandOptions$CommandOptions.getClass();
        esSetShufflingContext$SetShufflingContextRequest.b = esCommandOptions$CommandOptions;
    }

    static void l(EsSetShufflingContext$SetShufflingContextRequest esSetShufflingContext$SetShufflingContextRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        esSetShufflingContext$SetShufflingContextRequest.getClass();
        esLoggingParams$LoggingParams.getClass();
        esSetShufflingContext$SetShufflingContextRequest.c = esLoggingParams$LoggingParams;
    }

    public static a m() {
        return (a) f.toBuilder();
    }

    public static x<EsSetShufflingContext$SetShufflingContextRequest> parser() {
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
                EsSetShufflingContext$SetShufflingContextRequest esSetShufflingContext$SetShufflingContextRequest = (EsSetShufflingContext$SetShufflingContextRequest) obj2;
                boolean z = this.a;
                boolean z2 = esSetShufflingContext$SetShufflingContextRequest.a;
                this.a = hVar.f(z, z, z2, z2);
                this.b = (EsCommandOptions$CommandOptions) hVar.i(this.b, esSetShufflingContext$SetShufflingContextRequest.b);
                this.c = (EsLoggingParams$LoggingParams) hVar.i(this.c, esSetShufflingContext$SetShufflingContextRequest.c);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a = gVar.h();
                            } else if (B == 18) {
                                EsCommandOptions$CommandOptions esCommandOptions$CommandOptions = this.b;
                                EsCommandOptions$CommandOptions.a aVar = esCommandOptions$CommandOptions != null ? (EsCommandOptions$CommandOptions.a) esCommandOptions$CommandOptions.toBuilder() : null;
                                EsCommandOptions$CommandOptions esCommandOptions$CommandOptions2 = (EsCommandOptions$CommandOptions) gVar.o(EsCommandOptions$CommandOptions.parser(), kVar);
                                this.b = esCommandOptions$CommandOptions2;
                                if (aVar != null) {
                                    aVar.mergeFrom((EsCommandOptions$CommandOptions.a) esCommandOptions$CommandOptions2);
                                    this.b = (EsCommandOptions$CommandOptions) aVar.buildPartial();
                                }
                            } else if (B == 26) {
                                EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = this.c;
                                EsLoggingParams$LoggingParams.a aVar2 = esLoggingParams$LoggingParams != null ? (EsLoggingParams$LoggingParams.a) esLoggingParams$LoggingParams.toBuilder() : null;
                                EsLoggingParams$LoggingParams esLoggingParams$LoggingParams2 = (EsLoggingParams$LoggingParams) gVar.o(EsLoggingParams$LoggingParams.parser(), kVar);
                                this.c = esLoggingParams$LoggingParams2;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((EsLoggingParams$LoggingParams.a) esLoggingParams$LoggingParams2);
                                    this.c = (EsLoggingParams$LoggingParams) aVar2.buildPartial();
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
                return new EsSetShufflingContext$SetShufflingContextRequest();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (EsSetShufflingContext$SetShufflingContextRequest.class) {
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
        boolean z = this.a;
        if (z) {
            i2 = 0 + CodedOutputStream.d(1, z);
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
        boolean z = this.a;
        if (z) {
            codedOutputStream.A(1, z);
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
