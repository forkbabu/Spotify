package com.spotify.rcs.model.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.u;
import com.google.protobuf.x;
import com.spotify.rcs.model.proto.Bootstrap$RemoteConfigResponseV1;
import java.io.IOException;

public final class Bootstrap$BootstrapResponse extends GeneratedMessageLite<Bootstrap$BootstrapResponse, a> implements Object {
    private static final Bootstrap$BootstrapResponse c;
    private static volatile x<Bootstrap$BootstrapResponse> f;
    private int a = 0;
    private Object b;

    public enum RemoteConfigResponseCase implements o.c {
        REMOTE_CONFIG_RESPONSE_V1(1),
        REMOTECONFIGRESPONSE_NOT_SET(0);
        
        private final int value;

        private RemoteConfigResponseCase(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public int getNumber() {
            return this.value;
        }
    }

    public static final class a extends GeneratedMessageLite.b<Bootstrap$BootstrapResponse, a> implements Object {
        private a() {
            super(Bootstrap$BootstrapResponse.c);
        }
    }

    static {
        Bootstrap$BootstrapResponse bootstrap$BootstrapResponse = new Bootstrap$BootstrapResponse();
        c = bootstrap$BootstrapResponse;
        bootstrap$BootstrapResponse.makeImmutable();
    }

    private Bootstrap$BootstrapResponse() {
    }

    public static x<Bootstrap$BootstrapResponse> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i;
        boolean z = true;
        boolean z2 = false;
        RemoteConfigResponseCase remoteConfigResponseCase = null;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Bootstrap$BootstrapResponse bootstrap$BootstrapResponse = (Bootstrap$BootstrapResponse) obj2;
                int i2 = bootstrap$BootstrapResponse.a;
                if (i2 == 0) {
                    remoteConfigResponseCase = RemoteConfigResponseCase.REMOTECONFIGRESPONSE_NOT_SET;
                } else if (i2 == 1) {
                    remoteConfigResponseCase = RemoteConfigResponseCase.REMOTE_CONFIG_RESPONSE_V1;
                }
                int ordinal = remoteConfigResponseCase.ordinal();
                if (ordinal == 0) {
                    if (this.a != 1) {
                        z = false;
                    }
                    this.b = hVar.u(z, this.b, bootstrap$BootstrapResponse.b);
                } else if (ordinal == 1) {
                    if (this.a == 0) {
                        z = false;
                    }
                    hVar.b(z);
                }
                if (hVar == GeneratedMessageLite.g.a && (i = bootstrap$BootstrapResponse.a) != 0) {
                    this.a = i;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z2) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                Bootstrap$RemoteConfigResponseV1.a aVar = this.a == 1 ? (Bootstrap$RemoteConfigResponseV1.a) ((Bootstrap$RemoteConfigResponseV1) this.b).toBuilder() : null;
                                u o = gVar.o(Bootstrap$RemoteConfigResponseV1.parser(), kVar);
                                this.b = o;
                                if (aVar != null) {
                                    aVar.mergeFrom((Bootstrap$RemoteConfigResponseV1.a) ((Bootstrap$RemoteConfigResponseV1) o));
                                    this.b = aVar.buildPartial();
                                }
                                this.a = 1;
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z2 = true;
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
                return new Bootstrap$BootstrapResponse();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (Bootstrap$BootstrapResponse.class) {
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
        if (this.a == 1) {
            i2 = 0 + CodedOutputStream.n(1, (Bootstrap$RemoteConfigResponseV1) this.b);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public RemoteConfigResponseCase h() {
        int i = this.a;
        if (i == 0) {
            return RemoteConfigResponseCase.REMOTECONFIGRESPONSE_NOT_SET;
        }
        if (i != 1) {
            return null;
        }
        return RemoteConfigResponseCase.REMOTE_CONFIG_RESPONSE_V1;
    }

    public Bootstrap$RemoteConfigResponseV1 i() {
        if (this.a == 1) {
            return (Bootstrap$RemoteConfigResponseV1) this.b;
        }
        return Bootstrap$RemoteConfigResponseV1.h();
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a == 1) {
            codedOutputStream.M(1, (Bootstrap$RemoteConfigResponseV1) this.b);
        }
    }
}
