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
import java.io.IOException;

public final class EsPlay$PlayPreparedRequest extends GeneratedMessageLite<EsPlay$PlayPreparedRequest, a> implements Object {
    private static final EsPlay$PlayPreparedRequest n;
    private static volatile x<EsPlay$PlayPreparedRequest> o;
    private String a = "";
    private EsPlayOptions$PlayOptions b;
    private EsCommandOptions$CommandOptions c;
    private EsLoggingParams$LoggingParams f;

    public static final class a extends GeneratedMessageLite.b<EsPlay$PlayPreparedRequest, a> implements Object {
        public a m(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
            copyOnWrite();
            EsPlay$PlayPreparedRequest.m((EsPlay$PlayPreparedRequest) this.instance, esLoggingParams$LoggingParams);
            return this;
        }

        public a n(EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
            copyOnWrite();
            EsPlay$PlayPreparedRequest.l((EsPlay$PlayPreparedRequest) this.instance, esCommandOptions$CommandOptions);
            return this;
        }

        public a o(EsPlayOptions$PlayOptions esPlayOptions$PlayOptions) {
            copyOnWrite();
            EsPlay$PlayPreparedRequest.i((EsPlay$PlayPreparedRequest) this.instance, esPlayOptions$PlayOptions);
            return this;
        }

        public a p(String str) {
            copyOnWrite();
            EsPlay$PlayPreparedRequest.h((EsPlay$PlayPreparedRequest) this.instance, str);
            return this;
        }

        private a() {
            super(EsPlay$PlayPreparedRequest.n);
        }
    }

    static {
        EsPlay$PlayPreparedRequest esPlay$PlayPreparedRequest = new EsPlay$PlayPreparedRequest();
        n = esPlay$PlayPreparedRequest;
        esPlay$PlayPreparedRequest.makeImmutable();
    }

    private EsPlay$PlayPreparedRequest() {
    }

    static void h(EsPlay$PlayPreparedRequest esPlay$PlayPreparedRequest, String str) {
        esPlay$PlayPreparedRequest.getClass();
        str.getClass();
        esPlay$PlayPreparedRequest.a = str;
    }

    static void i(EsPlay$PlayPreparedRequest esPlay$PlayPreparedRequest, EsPlayOptions$PlayOptions esPlayOptions$PlayOptions) {
        esPlay$PlayPreparedRequest.getClass();
        esPlayOptions$PlayOptions.getClass();
        esPlay$PlayPreparedRequest.b = esPlayOptions$PlayOptions;
    }

    static void l(EsPlay$PlayPreparedRequest esPlay$PlayPreparedRequest, EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        esPlay$PlayPreparedRequest.getClass();
        esCommandOptions$CommandOptions.getClass();
        esPlay$PlayPreparedRequest.c = esCommandOptions$CommandOptions;
    }

    static void m(EsPlay$PlayPreparedRequest esPlay$PlayPreparedRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        esPlay$PlayPreparedRequest.getClass();
        esLoggingParams$LoggingParams.getClass();
        esPlay$PlayPreparedRequest.f = esLoggingParams$LoggingParams;
    }

    public static a n() {
        return (a) n.toBuilder();
    }

    public static x<EsPlay$PlayPreparedRequest> parser() {
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
                EsPlay$PlayPreparedRequest esPlay$PlayPreparedRequest = (EsPlay$PlayPreparedRequest) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, true ^ esPlay$PlayPreparedRequest.a.isEmpty(), esPlay$PlayPreparedRequest.a);
                this.b = (EsPlayOptions$PlayOptions) hVar.i(this.b, esPlay$PlayPreparedRequest.b);
                this.c = (EsCommandOptions$CommandOptions) hVar.i(this.c, esPlay$PlayPreparedRequest.c);
                this.f = (EsLoggingParams$LoggingParams) hVar.i(this.f, esPlay$PlayPreparedRequest.f);
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
                                this.a = gVar.A();
                            } else if (B == 18) {
                                EsPlayOptions$PlayOptions esPlayOptions$PlayOptions = this.b;
                                EsPlayOptions$PlayOptions.a aVar = esPlayOptions$PlayOptions != null ? (EsPlayOptions$PlayOptions.a) esPlayOptions$PlayOptions.toBuilder() : null;
                                EsPlayOptions$PlayOptions esPlayOptions$PlayOptions2 = (EsPlayOptions$PlayOptions) gVar.o(EsPlayOptions$PlayOptions.parser(), kVar);
                                this.b = esPlayOptions$PlayOptions2;
                                if (aVar != null) {
                                    aVar.mergeFrom((EsPlayOptions$PlayOptions.a) esPlayOptions$PlayOptions2);
                                    this.b = (EsPlayOptions$PlayOptions) aVar.buildPartial();
                                }
                            } else if (B == 26) {
                                EsCommandOptions$CommandOptions esCommandOptions$CommandOptions = this.c;
                                EsCommandOptions$CommandOptions.a aVar2 = esCommandOptions$CommandOptions != null ? (EsCommandOptions$CommandOptions.a) esCommandOptions$CommandOptions.toBuilder() : null;
                                EsCommandOptions$CommandOptions esCommandOptions$CommandOptions2 = (EsCommandOptions$CommandOptions) gVar.o(EsCommandOptions$CommandOptions.parser(), kVar);
                                this.c = esCommandOptions$CommandOptions2;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((EsCommandOptions$CommandOptions.a) esCommandOptions$CommandOptions2);
                                    this.c = (EsCommandOptions$CommandOptions) aVar2.buildPartial();
                                }
                            } else if (B == 34) {
                                EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = this.f;
                                EsLoggingParams$LoggingParams.a aVar3 = esLoggingParams$LoggingParams != null ? (EsLoggingParams$LoggingParams.a) esLoggingParams$LoggingParams.toBuilder() : null;
                                EsLoggingParams$LoggingParams esLoggingParams$LoggingParams2 = (EsLoggingParams$LoggingParams) gVar.o(EsLoggingParams$LoggingParams.parser(), kVar);
                                this.f = esLoggingParams$LoggingParams2;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((EsLoggingParams$LoggingParams.a) esLoggingParams$LoggingParams2);
                                    this.f = (EsLoggingParams$LoggingParams) aVar3.buildPartial();
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
                return new EsPlay$PlayPreparedRequest();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (EsPlay$PlayPreparedRequest.class) {
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
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
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
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
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
