package com.spotify.player.esperanto.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import java.io.IOException;

public final class EsStop$StopRequest extends GeneratedMessageLite<EsStop$StopRequest, a> implements Object {
    private static final EsStop$StopRequest f;
    private static volatile x<EsStop$StopRequest> n;
    private EsCommandOptions$CommandOptions a;
    private int b;
    private EsLoggingParams$LoggingParams c;

    public enum Reason implements o.c {
        INTERACTIVE(0),
        REMOTE_TRANSFER(1),
        SHUTDOWN(2),
        UNRECOGNIZED(-1);
        
        private final int value;

        private Reason(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public static final class a extends GeneratedMessageLite.b<EsStop$StopRequest, a> implements Object {
        public a m(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
            copyOnWrite();
            EsStop$StopRequest.h((EsStop$StopRequest) this.instance, esLoggingParams$LoggingParams);
            return this;
        }

        private a() {
            super(EsStop$StopRequest.f);
        }
    }

    static {
        EsStop$StopRequest esStop$StopRequest = new EsStop$StopRequest();
        f = esStop$StopRequest;
        esStop$StopRequest.makeImmutable();
    }

    private EsStop$StopRequest() {
    }

    static void h(EsStop$StopRequest esStop$StopRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        esStop$StopRequest.getClass();
        esLoggingParams$LoggingParams.getClass();
        esStop$StopRequest.c = esLoggingParams$LoggingParams;
    }

    public static a i() {
        return (a) f.toBuilder();
    }

    public static x<EsStop$StopRequest> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                EsStop$StopRequest esStop$StopRequest = (EsStop$StopRequest) obj2;
                this.a = (EsCommandOptions$CommandOptions) hVar.i(this.a, esStop$StopRequest.a);
                int i = this.b;
                boolean z2 = i != 0;
                int i2 = esStop$StopRequest.b;
                if (i2 != 0) {
                    z = true;
                }
                this.b = hVar.m(z2, i, z, i2);
                this.c = (EsLoggingParams$LoggingParams) hVar.i(this.c, esStop$StopRequest.c);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
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
                            } else if (B == 16) {
                                this.b = gVar.u();
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
                return new EsStop$StopRequest();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (EsStop$StopRequest.class) {
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
        if (this.b != Reason.INTERACTIVE.getNumber()) {
            i2 += CodedOutputStream.h(2, this.b);
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
        EsCommandOptions$CommandOptions esCommandOptions$CommandOptions = this.a;
        if (esCommandOptions$CommandOptions != null) {
            codedOutputStream.M(1, esCommandOptions$CommandOptions);
        }
        if (this.b != Reason.INTERACTIVE.getNumber()) {
            codedOutputStream.K(2, this.b);
        }
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = this.c;
        if (esLoggingParams$LoggingParams != null) {
            codedOutputStream.M(3, esLoggingParams$LoggingParams);
        }
    }
}
