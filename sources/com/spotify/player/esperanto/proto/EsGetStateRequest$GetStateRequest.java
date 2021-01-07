package com.spotify.player.esperanto.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import java.io.IOException;

public final class EsGetStateRequest$GetStateRequest extends GeneratedMessageLite<EsGetStateRequest$GetStateRequest, a> implements Object {
    private static final EsGetStateRequest$GetStateRequest c;
    private static volatile x<EsGetStateRequest$GetStateRequest> f;
    private EsOptional$OptionalInt64 a;
    private EsOptional$OptionalInt64 b;

    public static final class a extends GeneratedMessageLite.b<EsGetStateRequest$GetStateRequest, a> implements Object {
        public a m(EsOptional$OptionalInt64.a aVar) {
            copyOnWrite();
            EsGetStateRequest$GetStateRequest.i((EsGetStateRequest$GetStateRequest) this.instance, aVar);
            return this;
        }

        public a n(EsOptional$OptionalInt64.a aVar) {
            copyOnWrite();
            EsGetStateRequest$GetStateRequest.h((EsGetStateRequest$GetStateRequest) this.instance, aVar);
            return this;
        }

        private a() {
            super(EsGetStateRequest$GetStateRequest.c);
        }
    }

    static {
        EsGetStateRequest$GetStateRequest esGetStateRequest$GetStateRequest = new EsGetStateRequest$GetStateRequest();
        c = esGetStateRequest$GetStateRequest;
        esGetStateRequest$GetStateRequest.makeImmutable();
    }

    private EsGetStateRequest$GetStateRequest() {
    }

    static void h(EsGetStateRequest$GetStateRequest esGetStateRequest$GetStateRequest, EsOptional$OptionalInt64.a aVar) {
        esGetStateRequest$GetStateRequest.getClass();
        esGetStateRequest$GetStateRequest.a = (EsOptional$OptionalInt64) aVar.build();
    }

    static void i(EsGetStateRequest$GetStateRequest esGetStateRequest$GetStateRequest, EsOptional$OptionalInt64.a aVar) {
        esGetStateRequest$GetStateRequest.getClass();
        esGetStateRequest$GetStateRequest.b = (EsOptional$OptionalInt64) aVar.build();
    }

    public static a l() {
        return (a) c.toBuilder();
    }

    public static x<EsGetStateRequest$GetStateRequest> parser() {
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
                EsGetStateRequest$GetStateRequest esGetStateRequest$GetStateRequest = (EsGetStateRequest$GetStateRequest) obj2;
                this.a = (EsOptional$OptionalInt64) hVar.i(this.a, esGetStateRequest$GetStateRequest.a);
                this.b = (EsOptional$OptionalInt64) hVar.i(this.b, esGetStateRequest$GetStateRequest.b);
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
                                EsOptional$OptionalInt64 esOptional$OptionalInt64 = this.a;
                                EsOptional$OptionalInt64.a aVar = esOptional$OptionalInt64 != null ? (EsOptional$OptionalInt64.a) esOptional$OptionalInt64.toBuilder() : null;
                                EsOptional$OptionalInt64 esOptional$OptionalInt642 = (EsOptional$OptionalInt64) gVar.o(EsOptional$OptionalInt64.parser(), kVar);
                                this.a = esOptional$OptionalInt642;
                                if (aVar != null) {
                                    aVar.mergeFrom((EsOptional$OptionalInt64.a) esOptional$OptionalInt642);
                                    this.a = (EsOptional$OptionalInt64) aVar.buildPartial();
                                }
                            } else if (B == 18) {
                                EsOptional$OptionalInt64 esOptional$OptionalInt643 = this.b;
                                EsOptional$OptionalInt64.a aVar2 = esOptional$OptionalInt643 != null ? (EsOptional$OptionalInt64.a) esOptional$OptionalInt643.toBuilder() : null;
                                EsOptional$OptionalInt64 esOptional$OptionalInt644 = (EsOptional$OptionalInt64) gVar.o(EsOptional$OptionalInt64.parser(), kVar);
                                this.b = esOptional$OptionalInt644;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((EsOptional$OptionalInt64.a) esOptional$OptionalInt644);
                                    this.b = (EsOptional$OptionalInt64) aVar2.buildPartial();
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
                return new EsGetStateRequest$GetStateRequest();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (EsGetStateRequest$GetStateRequest.class) {
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
        EsOptional$OptionalInt64 esOptional$OptionalInt64 = this.a;
        if (esOptional$OptionalInt64 != null) {
            i2 = 0 + CodedOutputStream.n(1, esOptional$OptionalInt64);
        }
        EsOptional$OptionalInt64 esOptional$OptionalInt642 = this.b;
        if (esOptional$OptionalInt642 != null) {
            i2 += CodedOutputStream.n(2, esOptional$OptionalInt642);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        EsOptional$OptionalInt64 esOptional$OptionalInt64 = this.a;
        if (esOptional$OptionalInt64 != null) {
            codedOutputStream.M(1, esOptional$OptionalInt64);
        }
        EsOptional$OptionalInt64 esOptional$OptionalInt642 = this.b;
        if (esOptional$OptionalInt642 != null) {
            codedOutputStream.M(2, esOptional$OptionalInt642);
        }
    }
}
