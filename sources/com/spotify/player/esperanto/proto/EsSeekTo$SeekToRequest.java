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

public final class EsSeekTo$SeekToRequest extends GeneratedMessageLite<EsSeekTo$SeekToRequest, a> implements Object {
    private static final EsSeekTo$SeekToRequest f;
    private static volatile x<EsSeekTo$SeekToRequest> n;
    private EsCommandOptions$CommandOptions a;
    private EsLoggingParams$LoggingParams b;
    private long c;

    public static final class a extends GeneratedMessageLite.b<EsSeekTo$SeekToRequest, a> implements Object {
        public a m(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
            copyOnWrite();
            EsSeekTo$SeekToRequest.i((EsSeekTo$SeekToRequest) this.instance, esLoggingParams$LoggingParams);
            return this;
        }

        public a n(EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
            copyOnWrite();
            EsSeekTo$SeekToRequest.h((EsSeekTo$SeekToRequest) this.instance, esCommandOptions$CommandOptions);
            return this;
        }

        public a o(long j) {
            copyOnWrite();
            EsSeekTo$SeekToRequest.l((EsSeekTo$SeekToRequest) this.instance, j);
            return this;
        }

        private a() {
            super(EsSeekTo$SeekToRequest.f);
        }
    }

    static {
        EsSeekTo$SeekToRequest esSeekTo$SeekToRequest = new EsSeekTo$SeekToRequest();
        f = esSeekTo$SeekToRequest;
        esSeekTo$SeekToRequest.makeImmutable();
    }

    private EsSeekTo$SeekToRequest() {
    }

    static void h(EsSeekTo$SeekToRequest esSeekTo$SeekToRequest, EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        esSeekTo$SeekToRequest.getClass();
        esCommandOptions$CommandOptions.getClass();
        esSeekTo$SeekToRequest.a = esCommandOptions$CommandOptions;
    }

    static void i(EsSeekTo$SeekToRequest esSeekTo$SeekToRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        esSeekTo$SeekToRequest.getClass();
        esLoggingParams$LoggingParams.getClass();
        esSeekTo$SeekToRequest.b = esLoggingParams$LoggingParams;
    }

    static void l(EsSeekTo$SeekToRequest esSeekTo$SeekToRequest, long j) {
        esSeekTo$SeekToRequest.c = j;
    }

    public static a m() {
        return (a) f.toBuilder();
    }

    public static x<EsSeekTo$SeekToRequest> parser() {
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
                EsSeekTo$SeekToRequest esSeekTo$SeekToRequest = (EsSeekTo$SeekToRequest) obj2;
                this.a = (EsCommandOptions$CommandOptions) hVar.i(this.a, esSeekTo$SeekToRequest.a);
                this.b = (EsLoggingParams$LoggingParams) hVar.i(this.b, esSeekTo$SeekToRequest.b);
                long j = this.c;
                boolean z2 = j != 0;
                long j2 = esSeekTo$SeekToRequest.c;
                this.c = hVar.s(z2, j, j2 != 0, j2);
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
                            } else if (B == 18) {
                                EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = this.b;
                                EsLoggingParams$LoggingParams.a aVar2 = esLoggingParams$LoggingParams != null ? (EsLoggingParams$LoggingParams.a) esLoggingParams$LoggingParams.toBuilder() : null;
                                EsLoggingParams$LoggingParams esLoggingParams$LoggingParams2 = (EsLoggingParams$LoggingParams) gVar.o(EsLoggingParams$LoggingParams.parser(), kVar);
                                this.b = esLoggingParams$LoggingParams2;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((EsLoggingParams$LoggingParams.a) esLoggingParams$LoggingParams2);
                                    this.b = (EsLoggingParams$LoggingParams) aVar2.buildPartial();
                                }
                            } else if (B == 24) {
                                this.c = gVar.w();
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
                return new EsSeekTo$SeekToRequest();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (EsSeekTo$SeekToRequest.class) {
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
        long j = this.c;
        if (j != 0) {
            i2 += CodedOutputStream.l(3, j);
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
        long j = this.c;
        if (j != 0) {
            codedOutputStream.U(3, j);
        }
    }
}
