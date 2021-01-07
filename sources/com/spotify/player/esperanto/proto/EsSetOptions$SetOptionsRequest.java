package com.spotify.player.esperanto.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsOptional$OptionalBoolean;
import java.io.IOException;

public final class EsSetOptions$SetOptionsRequest extends GeneratedMessageLite<EsSetOptions$SetOptionsRequest, a> implements Object {
    private static final EsSetOptions$SetOptionsRequest o;
    private static volatile x<EsSetOptions$SetOptionsRequest> p;
    private EsOptional$OptionalBoolean a;
    private EsOptional$OptionalBoolean b;
    private EsOptional$OptionalBoolean c;
    private EsCommandOptions$CommandOptions f;
    private EsLoggingParams$LoggingParams n;

    public static final class a extends GeneratedMessageLite.b<EsSetOptions$SetOptionsRequest, a> implements Object {
        public a m(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
            copyOnWrite();
            EsSetOptions$SetOptionsRequest.l((EsSetOptions$SetOptionsRequest) this.instance, esLoggingParams$LoggingParams);
            return this;
        }

        public a n(EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
            copyOnWrite();
            EsSetOptions$SetOptionsRequest.i((EsSetOptions$SetOptionsRequest) this.instance, esCommandOptions$CommandOptions);
            return this;
        }

        public a o(EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
            copyOnWrite();
            EsSetOptions$SetOptionsRequest.m((EsSetOptions$SetOptionsRequest) this.instance, esOptional$OptionalBoolean);
            return this;
        }

        public a p(EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
            copyOnWrite();
            EsSetOptions$SetOptionsRequest.h((EsSetOptions$SetOptionsRequest) this.instance, esOptional$OptionalBoolean);
            return this;
        }

        public a q(EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
            copyOnWrite();
            EsSetOptions$SetOptionsRequest.n((EsSetOptions$SetOptionsRequest) this.instance, esOptional$OptionalBoolean);
            return this;
        }

        private a() {
            super(EsSetOptions$SetOptionsRequest.o);
        }
    }

    static {
        EsSetOptions$SetOptionsRequest esSetOptions$SetOptionsRequest = new EsSetOptions$SetOptionsRequest();
        o = esSetOptions$SetOptionsRequest;
        esSetOptions$SetOptionsRequest.makeImmutable();
    }

    private EsSetOptions$SetOptionsRequest() {
    }

    static void h(EsSetOptions$SetOptionsRequest esSetOptions$SetOptionsRequest, EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
        esSetOptions$SetOptionsRequest.getClass();
        esOptional$OptionalBoolean.getClass();
        esSetOptions$SetOptionsRequest.a = esOptional$OptionalBoolean;
    }

    static void i(EsSetOptions$SetOptionsRequest esSetOptions$SetOptionsRequest, EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        esSetOptions$SetOptionsRequest.getClass();
        esCommandOptions$CommandOptions.getClass();
        esSetOptions$SetOptionsRequest.f = esCommandOptions$CommandOptions;
    }

    static void l(EsSetOptions$SetOptionsRequest esSetOptions$SetOptionsRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        esSetOptions$SetOptionsRequest.getClass();
        esLoggingParams$LoggingParams.getClass();
        esSetOptions$SetOptionsRequest.n = esLoggingParams$LoggingParams;
    }

    static void m(EsSetOptions$SetOptionsRequest esSetOptions$SetOptionsRequest, EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
        esSetOptions$SetOptionsRequest.getClass();
        esOptional$OptionalBoolean.getClass();
        esSetOptions$SetOptionsRequest.b = esOptional$OptionalBoolean;
    }

    static void n(EsSetOptions$SetOptionsRequest esSetOptions$SetOptionsRequest, EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
        esSetOptions$SetOptionsRequest.getClass();
        esOptional$OptionalBoolean.getClass();
        esSetOptions$SetOptionsRequest.c = esOptional$OptionalBoolean;
    }

    public static a o() {
        return (a) o.toBuilder();
    }

    public static x<EsSetOptions$SetOptionsRequest> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                EsSetOptions$SetOptionsRequest esSetOptions$SetOptionsRequest = (EsSetOptions$SetOptionsRequest) obj2;
                this.a = (EsOptional$OptionalBoolean) hVar.i(this.a, esSetOptions$SetOptionsRequest.a);
                this.b = (EsOptional$OptionalBoolean) hVar.i(this.b, esSetOptions$SetOptionsRequest.b);
                this.c = (EsOptional$OptionalBoolean) hVar.i(this.c, esSetOptions$SetOptionsRequest.c);
                this.f = (EsCommandOptions$CommandOptions) hVar.i(this.f, esSetOptions$SetOptionsRequest.f);
                this.n = (EsLoggingParams$LoggingParams) hVar.i(this.n, esSetOptions$SetOptionsRequest.n);
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
                                EsOptional$OptionalBoolean esOptional$OptionalBoolean = this.a;
                                EsOptional$OptionalBoolean.a aVar = esOptional$OptionalBoolean != null ? (EsOptional$OptionalBoolean.a) esOptional$OptionalBoolean.toBuilder() : null;
                                EsOptional$OptionalBoolean esOptional$OptionalBoolean2 = (EsOptional$OptionalBoolean) gVar.o(EsOptional$OptionalBoolean.parser(), kVar);
                                this.a = esOptional$OptionalBoolean2;
                                if (aVar != null) {
                                    aVar.mergeFrom((EsOptional$OptionalBoolean.a) esOptional$OptionalBoolean2);
                                    this.a = (EsOptional$OptionalBoolean) aVar.buildPartial();
                                }
                            } else if (B == 18) {
                                EsOptional$OptionalBoolean esOptional$OptionalBoolean3 = this.b;
                                EsOptional$OptionalBoolean.a aVar2 = esOptional$OptionalBoolean3 != null ? (EsOptional$OptionalBoolean.a) esOptional$OptionalBoolean3.toBuilder() : null;
                                EsOptional$OptionalBoolean esOptional$OptionalBoolean4 = (EsOptional$OptionalBoolean) gVar.o(EsOptional$OptionalBoolean.parser(), kVar);
                                this.b = esOptional$OptionalBoolean4;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((EsOptional$OptionalBoolean.a) esOptional$OptionalBoolean4);
                                    this.b = (EsOptional$OptionalBoolean) aVar2.buildPartial();
                                }
                            } else if (B == 26) {
                                EsOptional$OptionalBoolean esOptional$OptionalBoolean5 = this.c;
                                EsOptional$OptionalBoolean.a aVar3 = esOptional$OptionalBoolean5 != null ? (EsOptional$OptionalBoolean.a) esOptional$OptionalBoolean5.toBuilder() : null;
                                EsOptional$OptionalBoolean esOptional$OptionalBoolean6 = (EsOptional$OptionalBoolean) gVar.o(EsOptional$OptionalBoolean.parser(), kVar);
                                this.c = esOptional$OptionalBoolean6;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((EsOptional$OptionalBoolean.a) esOptional$OptionalBoolean6);
                                    this.c = (EsOptional$OptionalBoolean) aVar3.buildPartial();
                                }
                            } else if (B == 34) {
                                EsCommandOptions$CommandOptions esCommandOptions$CommandOptions = this.f;
                                EsCommandOptions$CommandOptions.a aVar4 = esCommandOptions$CommandOptions != null ? (EsCommandOptions$CommandOptions.a) esCommandOptions$CommandOptions.toBuilder() : null;
                                EsCommandOptions$CommandOptions esCommandOptions$CommandOptions2 = (EsCommandOptions$CommandOptions) gVar.o(EsCommandOptions$CommandOptions.parser(), kVar);
                                this.f = esCommandOptions$CommandOptions2;
                                if (aVar4 != null) {
                                    aVar4.mergeFrom((EsCommandOptions$CommandOptions.a) esCommandOptions$CommandOptions2);
                                    this.f = (EsCommandOptions$CommandOptions) aVar4.buildPartial();
                                }
                            } else if (B == 42) {
                                EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = this.n;
                                EsLoggingParams$LoggingParams.a aVar5 = esLoggingParams$LoggingParams != null ? (EsLoggingParams$LoggingParams.a) esLoggingParams$LoggingParams.toBuilder() : null;
                                EsLoggingParams$LoggingParams esLoggingParams$LoggingParams2 = (EsLoggingParams$LoggingParams) gVar.o(EsLoggingParams$LoggingParams.parser(), kVar);
                                this.n = esLoggingParams$LoggingParams2;
                                if (aVar5 != null) {
                                    aVar5.mergeFrom((EsLoggingParams$LoggingParams.a) esLoggingParams$LoggingParams2);
                                    this.n = (EsLoggingParams$LoggingParams) aVar5.buildPartial();
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
                return new EsSetOptions$SetOptionsRequest();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (EsSetOptions$SetOptionsRequest.class) {
                        if (p == null) {
                            p = new GeneratedMessageLite.c(o);
                        }
                    }
                }
                return p;
            default:
                throw new UnsupportedOperationException();
        }
        return o;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        EsOptional$OptionalBoolean esOptional$OptionalBoolean = this.a;
        if (esOptional$OptionalBoolean != null) {
            i2 = 0 + CodedOutputStream.n(1, esOptional$OptionalBoolean);
        }
        EsOptional$OptionalBoolean esOptional$OptionalBoolean2 = this.b;
        if (esOptional$OptionalBoolean2 != null) {
            i2 += CodedOutputStream.n(2, esOptional$OptionalBoolean2);
        }
        EsOptional$OptionalBoolean esOptional$OptionalBoolean3 = this.c;
        if (esOptional$OptionalBoolean3 != null) {
            i2 += CodedOutputStream.n(3, esOptional$OptionalBoolean3);
        }
        EsCommandOptions$CommandOptions esCommandOptions$CommandOptions = this.f;
        if (esCommandOptions$CommandOptions != null) {
            i2 += CodedOutputStream.n(4, esCommandOptions$CommandOptions);
        }
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = this.n;
        if (esLoggingParams$LoggingParams != null) {
            i2 += CodedOutputStream.n(5, esLoggingParams$LoggingParams);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        EsOptional$OptionalBoolean esOptional$OptionalBoolean = this.a;
        if (esOptional$OptionalBoolean != null) {
            codedOutputStream.M(1, esOptional$OptionalBoolean);
        }
        EsOptional$OptionalBoolean esOptional$OptionalBoolean2 = this.b;
        if (esOptional$OptionalBoolean2 != null) {
            codedOutputStream.M(2, esOptional$OptionalBoolean2);
        }
        EsOptional$OptionalBoolean esOptional$OptionalBoolean3 = this.c;
        if (esOptional$OptionalBoolean3 != null) {
            codedOutputStream.M(3, esOptional$OptionalBoolean3);
        }
        EsCommandOptions$CommandOptions esCommandOptions$CommandOptions = this.f;
        if (esCommandOptions$CommandOptions != null) {
            codedOutputStream.M(4, esCommandOptions$CommandOptions);
        }
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = this.n;
        if (esLoggingParams$LoggingParams != null) {
            codedOutputStream.M(5, esLoggingParams$LoggingParams);
        }
    }
}
