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

public final class EsResume$ResumeRequest extends GeneratedMessageLite<EsResume$ResumeRequest, a> implements Object {
    private static final EsResume$ResumeRequest c;
    private static volatile x<EsResume$ResumeRequest> f;
    private EsCommandOptions$CommandOptions a;
    private EsLoggingParams$LoggingParams b;

    public static final class a extends GeneratedMessageLite.b<EsResume$ResumeRequest, a> implements Object {
        public a m(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
            copyOnWrite();
            EsResume$ResumeRequest.i((EsResume$ResumeRequest) this.instance, esLoggingParams$LoggingParams);
            return this;
        }

        public a n(EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
            copyOnWrite();
            EsResume$ResumeRequest.h((EsResume$ResumeRequest) this.instance, esCommandOptions$CommandOptions);
            return this;
        }

        private a() {
            super(EsResume$ResumeRequest.c);
        }
    }

    static {
        EsResume$ResumeRequest esResume$ResumeRequest = new EsResume$ResumeRequest();
        c = esResume$ResumeRequest;
        esResume$ResumeRequest.makeImmutable();
    }

    private EsResume$ResumeRequest() {
    }

    static void h(EsResume$ResumeRequest esResume$ResumeRequest, EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        esResume$ResumeRequest.getClass();
        esCommandOptions$CommandOptions.getClass();
        esResume$ResumeRequest.a = esCommandOptions$CommandOptions;
    }

    static void i(EsResume$ResumeRequest esResume$ResumeRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        esResume$ResumeRequest.getClass();
        esLoggingParams$LoggingParams.getClass();
        esResume$ResumeRequest.b = esLoggingParams$LoggingParams;
    }

    public static a l() {
        return (a) c.toBuilder();
    }

    public static x<EsResume$ResumeRequest> parser() {
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
                EsResume$ResumeRequest esResume$ResumeRequest = (EsResume$ResumeRequest) obj2;
                this.a = (EsCommandOptions$CommandOptions) hVar.i(this.a, esResume$ResumeRequest.a);
                this.b = (EsLoggingParams$LoggingParams) hVar.i(this.b, esResume$ResumeRequest.b);
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
                return new EsResume$ResumeRequest();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (EsResume$ResumeRequest.class) {
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
