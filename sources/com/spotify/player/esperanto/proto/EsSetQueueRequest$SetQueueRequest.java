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

public final class EsSetQueueRequest$SetQueueRequest extends GeneratedMessageLite<EsSetQueueRequest$SetQueueRequest, a> implements Object {
    private static final EsSetQueueRequest$SetQueueRequest p;
    private static volatile x<EsSetQueueRequest$SetQueueRequest> q;
    private int a;
    private o.i<EsProvidedTrack$ProvidedTrack> b = GeneratedMessageLite.emptyProtobufList();
    private o.i<EsProvidedTrack$ProvidedTrack> c = GeneratedMessageLite.emptyProtobufList();
    private long f;
    private EsCommandOptions$CommandOptions n;
    private EsLoggingParams$LoggingParams o;

    public static final class a extends GeneratedMessageLite.b<EsSetQueueRequest$SetQueueRequest, a> implements Object {
        public a m(Iterable<? extends EsProvidedTrack$ProvidedTrack> iterable) {
            copyOnWrite();
            EsSetQueueRequest$SetQueueRequest.n((EsSetQueueRequest$SetQueueRequest) this.instance, iterable);
            return this;
        }

        public a n(Iterable<? extends EsProvidedTrack$ProvidedTrack> iterable) {
            copyOnWrite();
            EsSetQueueRequest$SetQueueRequest.h((EsSetQueueRequest$SetQueueRequest) this.instance, iterable);
            return this;
        }

        public a o(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
            copyOnWrite();
            EsSetQueueRequest$SetQueueRequest.m((EsSetQueueRequest$SetQueueRequest) this.instance, esLoggingParams$LoggingParams);
            return this;
        }

        public a p(EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
            copyOnWrite();
            EsSetQueueRequest$SetQueueRequest.l((EsSetQueueRequest$SetQueueRequest) this.instance, esCommandOptions$CommandOptions);
            return this;
        }

        public a q(long j) {
            copyOnWrite();
            EsSetQueueRequest$SetQueueRequest.i((EsSetQueueRequest$SetQueueRequest) this.instance, j);
            return this;
        }

        private a() {
            super(EsSetQueueRequest$SetQueueRequest.p);
        }
    }

    static {
        EsSetQueueRequest$SetQueueRequest esSetQueueRequest$SetQueueRequest = new EsSetQueueRequest$SetQueueRequest();
        p = esSetQueueRequest$SetQueueRequest;
        esSetQueueRequest$SetQueueRequest.makeImmutable();
    }

    private EsSetQueueRequest$SetQueueRequest() {
    }

    static void h(EsSetQueueRequest$SetQueueRequest esSetQueueRequest$SetQueueRequest, Iterable iterable) {
        if (!esSetQueueRequest$SetQueueRequest.c.R0()) {
            esSetQueueRequest$SetQueueRequest.c = GeneratedMessageLite.mutableCopy(esSetQueueRequest$SetQueueRequest.c);
        }
        com.google.protobuf.a.addAll(iterable, esSetQueueRequest$SetQueueRequest.c);
    }

    static void i(EsSetQueueRequest$SetQueueRequest esSetQueueRequest$SetQueueRequest, long j) {
        esSetQueueRequest$SetQueueRequest.f = j;
    }

    static void l(EsSetQueueRequest$SetQueueRequest esSetQueueRequest$SetQueueRequest, EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        esSetQueueRequest$SetQueueRequest.getClass();
        esCommandOptions$CommandOptions.getClass();
        esSetQueueRequest$SetQueueRequest.n = esCommandOptions$CommandOptions;
    }

    static void m(EsSetQueueRequest$SetQueueRequest esSetQueueRequest$SetQueueRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        esSetQueueRequest$SetQueueRequest.getClass();
        esLoggingParams$LoggingParams.getClass();
        esSetQueueRequest$SetQueueRequest.o = esLoggingParams$LoggingParams;
    }

    static void n(EsSetQueueRequest$SetQueueRequest esSetQueueRequest$SetQueueRequest, Iterable iterable) {
        if (!esSetQueueRequest$SetQueueRequest.b.R0()) {
            esSetQueueRequest$SetQueueRequest.b = GeneratedMessageLite.mutableCopy(esSetQueueRequest$SetQueueRequest.b);
        }
        com.google.protobuf.a.addAll(iterable, esSetQueueRequest$SetQueueRequest.b);
    }

    public static a o() {
        return (a) p.toBuilder();
    }

    public static x<EsSetQueueRequest$SetQueueRequest> parser() {
        return p.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return p;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                EsSetQueueRequest$SetQueueRequest esSetQueueRequest$SetQueueRequest = (EsSetQueueRequest$SetQueueRequest) obj2;
                this.b = hVar.q(this.b, esSetQueueRequest$SetQueueRequest.b);
                this.c = hVar.q(this.c, esSetQueueRequest$SetQueueRequest.c);
                long j = this.f;
                boolean z2 = j != 0;
                long j2 = esSetQueueRequest$SetQueueRequest.f;
                this.f = hVar.s(z2, j, j2 != 0, j2);
                this.n = (EsCommandOptions$CommandOptions) hVar.i(this.n, esSetQueueRequest$SetQueueRequest.n);
                this.o = (EsLoggingParams$LoggingParams) hVar.i(this.o, esSetQueueRequest$SetQueueRequest.o);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= esSetQueueRequest$SetQueueRequest.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                this.b.add(gVar.o(EsProvidedTrack$ProvidedTrack.parser(), kVar));
                            } else if (B == 18) {
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(gVar.o(EsProvidedTrack$ProvidedTrack.parser(), kVar));
                            } else if (B == 24) {
                                this.f = gVar.w();
                            } else if (B == 34) {
                                EsCommandOptions$CommandOptions esCommandOptions$CommandOptions = this.n;
                                EsCommandOptions$CommandOptions.a aVar = esCommandOptions$CommandOptions != null ? (EsCommandOptions$CommandOptions.a) esCommandOptions$CommandOptions.toBuilder() : null;
                                EsCommandOptions$CommandOptions esCommandOptions$CommandOptions2 = (EsCommandOptions$CommandOptions) gVar.o(EsCommandOptions$CommandOptions.parser(), kVar);
                                this.n = esCommandOptions$CommandOptions2;
                                if (aVar != null) {
                                    aVar.mergeFrom((EsCommandOptions$CommandOptions.a) esCommandOptions$CommandOptions2);
                                    this.n = (EsCommandOptions$CommandOptions) aVar.buildPartial();
                                }
                            } else if (B == 42) {
                                EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = this.o;
                                EsLoggingParams$LoggingParams.a aVar2 = esLoggingParams$LoggingParams != null ? (EsLoggingParams$LoggingParams.a) esLoggingParams$LoggingParams.toBuilder() : null;
                                EsLoggingParams$LoggingParams esLoggingParams$LoggingParams2 = (EsLoggingParams$LoggingParams) gVar.o(EsLoggingParams$LoggingParams.parser(), kVar);
                                this.o = esLoggingParams$LoggingParams2;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((EsLoggingParams$LoggingParams.a) esLoggingParams$LoggingParams2);
                                    this.o = (EsLoggingParams$LoggingParams) aVar2.buildPartial();
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
                this.b.C();
                this.c.C();
                return null;
            case 4:
                return new EsSetQueueRequest$SetQueueRequest();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (EsSetQueueRequest$SetQueueRequest.class) {
                        if (q == null) {
                            q = new GeneratedMessageLite.c(p);
                        }
                    }
                }
                return q;
            default:
                throw new UnsupportedOperationException();
        }
        return p;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            i2 += CodedOutputStream.n(1, this.b.get(i3));
        }
        for (int i4 = 0; i4 < this.c.size(); i4++) {
            i2 += CodedOutputStream.n(2, this.c.get(i4));
        }
        long j = this.f;
        if (j != 0) {
            i2 += CodedOutputStream.u(3, j);
        }
        EsCommandOptions$CommandOptions esCommandOptions$CommandOptions = this.n;
        if (esCommandOptions$CommandOptions != null) {
            i2 += CodedOutputStream.n(4, esCommandOptions$CommandOptions);
        }
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = this.o;
        if (esLoggingParams$LoggingParams != null) {
            i2 += CodedOutputStream.n(5, esLoggingParams$LoggingParams);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.b.size(); i++) {
            codedOutputStream.M(1, this.b.get(i));
        }
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            codedOutputStream.M(2, this.c.get(i2));
        }
        long j = this.f;
        if (j != 0) {
            codedOutputStream.U(3, j);
        }
        EsCommandOptions$CommandOptions esCommandOptions$CommandOptions = this.n;
        if (esCommandOptions$CommandOptions != null) {
            codedOutputStream.M(4, esCommandOptions$CommandOptions);
        }
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = this.o;
        if (esLoggingParams$LoggingParams != null) {
            codedOutputStream.M(5, esLoggingParams$LoggingParams);
        }
    }
}
