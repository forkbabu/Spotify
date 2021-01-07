package com.spotify.player.esperanto.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsPlayOptions$PlayOptions;
import com.spotify.player.esperanto.proto.EsPreparePlay$PreparePlayRequest;
import java.io.IOException;

public final class EsPlay$PlayRequest extends GeneratedMessageLite<EsPlay$PlayRequest, a> implements Object {
    private static final EsPlay$PlayRequest n;
    private static volatile x<EsPlay$PlayRequest> o;
    private EsPreparePlay$PreparePlayRequest a;
    private EsPlayOptions$PlayOptions b;
    private EsCommandOptions$CommandOptions c;
    private EsLoggingParams$LoggingParams f;

    public static final class a extends GeneratedMessageLite.b<EsPlay$PlayRequest, a> implements Object {
        public a m(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
            copyOnWrite();
            EsPlay$PlayRequest.i((EsPlay$PlayRequest) this.instance, esLoggingParams$LoggingParams);
            return this;
        }

        public a n(EsPlayOptions$PlayOptions esPlayOptions$PlayOptions) {
            copyOnWrite();
            EsPlay$PlayRequest.l((EsPlay$PlayRequest) this.instance, esPlayOptions$PlayOptions);
            return this;
        }

        public a o(EsPreparePlay$PreparePlayRequest esPreparePlay$PreparePlayRequest) {
            copyOnWrite();
            EsPlay$PlayRequest.h((EsPlay$PlayRequest) this.instance, esPreparePlay$PreparePlayRequest);
            return this;
        }

        private a() {
            super(EsPlay$PlayRequest.n);
        }
    }

    static {
        EsPlay$PlayRequest esPlay$PlayRequest = new EsPlay$PlayRequest();
        n = esPlay$PlayRequest;
        esPlay$PlayRequest.makeImmutable();
    }

    private EsPlay$PlayRequest() {
    }

    static void h(EsPlay$PlayRequest esPlay$PlayRequest, EsPreparePlay$PreparePlayRequest esPreparePlay$PreparePlayRequest) {
        esPlay$PlayRequest.getClass();
        esPreparePlay$PreparePlayRequest.getClass();
        esPlay$PlayRequest.a = esPreparePlay$PreparePlayRequest;
    }

    static void i(EsPlay$PlayRequest esPlay$PlayRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        esPlay$PlayRequest.getClass();
        esLoggingParams$LoggingParams.getClass();
        esPlay$PlayRequest.f = esLoggingParams$LoggingParams;
    }

    static void l(EsPlay$PlayRequest esPlay$PlayRequest, EsPlayOptions$PlayOptions esPlayOptions$PlayOptions) {
        esPlay$PlayRequest.getClass();
        esPlayOptions$PlayOptions.getClass();
        esPlay$PlayRequest.b = esPlayOptions$PlayOptions;
    }

    public static a m() {
        return (a) n.toBuilder();
    }

    public static x<EsPlay$PlayRequest> parser() {
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
                EsPlay$PlayRequest esPlay$PlayRequest = (EsPlay$PlayRequest) obj2;
                this.a = (EsPreparePlay$PreparePlayRequest) hVar.i(this.a, esPlay$PlayRequest.a);
                this.b = (EsPlayOptions$PlayOptions) hVar.i(this.b, esPlay$PlayRequest.b);
                this.c = (EsCommandOptions$CommandOptions) hVar.i(this.c, esPlay$PlayRequest.c);
                this.f = (EsLoggingParams$LoggingParams) hVar.i(this.f, esPlay$PlayRequest.f);
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
                                EsPreparePlay$PreparePlayRequest esPreparePlay$PreparePlayRequest = this.a;
                                EsPreparePlay$PreparePlayRequest.a aVar = esPreparePlay$PreparePlayRequest != null ? (EsPreparePlay$PreparePlayRequest.a) esPreparePlay$PreparePlayRequest.toBuilder() : null;
                                EsPreparePlay$PreparePlayRequest esPreparePlay$PreparePlayRequest2 = (EsPreparePlay$PreparePlayRequest) gVar.o(EsPreparePlay$PreparePlayRequest.parser(), kVar);
                                this.a = esPreparePlay$PreparePlayRequest2;
                                if (aVar != null) {
                                    aVar.mergeFrom((EsPreparePlay$PreparePlayRequest.a) esPreparePlay$PreparePlayRequest2);
                                    this.a = (EsPreparePlay$PreparePlayRequest) aVar.buildPartial();
                                }
                            } else if (B == 18) {
                                EsPlayOptions$PlayOptions esPlayOptions$PlayOptions = this.b;
                                EsPlayOptions$PlayOptions.a aVar2 = esPlayOptions$PlayOptions != null ? (EsPlayOptions$PlayOptions.a) esPlayOptions$PlayOptions.toBuilder() : null;
                                EsPlayOptions$PlayOptions esPlayOptions$PlayOptions2 = (EsPlayOptions$PlayOptions) gVar.o(EsPlayOptions$PlayOptions.parser(), kVar);
                                this.b = esPlayOptions$PlayOptions2;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((EsPlayOptions$PlayOptions.a) esPlayOptions$PlayOptions2);
                                    this.b = (EsPlayOptions$PlayOptions) aVar2.buildPartial();
                                }
                            } else if (B == 26) {
                                EsCommandOptions$CommandOptions esCommandOptions$CommandOptions = this.c;
                                EsCommandOptions$CommandOptions.a aVar3 = esCommandOptions$CommandOptions != null ? (EsCommandOptions$CommandOptions.a) esCommandOptions$CommandOptions.toBuilder() : null;
                                EsCommandOptions$CommandOptions esCommandOptions$CommandOptions2 = (EsCommandOptions$CommandOptions) gVar.o(EsCommandOptions$CommandOptions.parser(), kVar);
                                this.c = esCommandOptions$CommandOptions2;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((EsCommandOptions$CommandOptions.a) esCommandOptions$CommandOptions2);
                                    this.c = (EsCommandOptions$CommandOptions) aVar3.buildPartial();
                                }
                            } else if (B == 34) {
                                EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = this.f;
                                EsLoggingParams$LoggingParams.a aVar4 = esLoggingParams$LoggingParams != null ? (EsLoggingParams$LoggingParams.a) esLoggingParams$LoggingParams.toBuilder() : null;
                                EsLoggingParams$LoggingParams esLoggingParams$LoggingParams2 = (EsLoggingParams$LoggingParams) gVar.o(EsLoggingParams$LoggingParams.parser(), kVar);
                                this.f = esLoggingParams$LoggingParams2;
                                if (aVar4 != null) {
                                    aVar4.mergeFrom((EsLoggingParams$LoggingParams.a) esLoggingParams$LoggingParams2);
                                    this.f = (EsLoggingParams$LoggingParams) aVar4.buildPartial();
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
                return new EsPlay$PlayRequest();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (EsPlay$PlayRequest.class) {
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
        EsPreparePlay$PreparePlayRequest esPreparePlay$PreparePlayRequest = this.a;
        if (esPreparePlay$PreparePlayRequest != null) {
            i2 = 0 + CodedOutputStream.n(1, esPreparePlay$PreparePlayRequest);
        }
        EsPlayOptions$PlayOptions esPlayOptions$PlayOptions = this.b;
        if (esPlayOptions$PlayOptions != null) {
            i2 += CodedOutputStream.n(2, esPlayOptions$PlayOptions);
        }
        EsCommandOptions$CommandOptions esCommandOptions$CommandOptions = this.c;
        if (esCommandOptions$CommandOptions != null) {
            i2 += CodedOutputStream.n(3, esCommandOptions$CommandOptions);
        }
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = this.f;
        if (esLoggingParams$LoggingParams != null) {
            i2 += CodedOutputStream.n(4, esLoggingParams$LoggingParams);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        EsPreparePlay$PreparePlayRequest esPreparePlay$PreparePlayRequest = this.a;
        if (esPreparePlay$PreparePlayRequest != null) {
            codedOutputStream.M(1, esPreparePlay$PreparePlayRequest);
        }
        EsPlayOptions$PlayOptions esPlayOptions$PlayOptions = this.b;
        if (esPlayOptions$PlayOptions != null) {
            codedOutputStream.M(2, esPlayOptions$PlayOptions);
        }
        EsCommandOptions$CommandOptions esCommandOptions$CommandOptions = this.c;
        if (esCommandOptions$CommandOptions != null) {
            codedOutputStream.M(3, esCommandOptions$CommandOptions);
        }
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = this.f;
        if (esLoggingParams$LoggingParams != null) {
            codedOutputStream.M(4, esLoggingParams$LoggingParams);
        }
    }
}
