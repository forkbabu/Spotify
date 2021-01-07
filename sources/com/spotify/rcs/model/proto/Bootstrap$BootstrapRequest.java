package com.spotify.rcs.model.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.u;
import com.google.protobuf.x;
import com.spotify.rcs.model.proto.Bootstrap$RemoteConfigRequestV1;
import java.io.IOException;

public final class Bootstrap$BootstrapRequest extends GeneratedMessageLite<Bootstrap$BootstrapRequest, a> implements Object {
    private static final Bootstrap$BootstrapRequest c;
    private static volatile x<Bootstrap$BootstrapRequest> f;
    private int a = 0;
    private Object b;

    public enum RemoteConfigRequestCase implements o.c {
        REMOTE_CONFIG_REQUEST_V1(1),
        REMOTECONFIGREQUEST_NOT_SET(0);
        
        private final int value;

        private RemoteConfigRequestCase(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public int getNumber() {
            return this.value;
        }
    }

    public static final class a extends GeneratedMessageLite.b<Bootstrap$BootstrapRequest, a> implements Object {
        public a m(Bootstrap$RemoteConfigRequestV1 bootstrap$RemoteConfigRequestV1) {
            copyOnWrite();
            Bootstrap$BootstrapRequest.h((Bootstrap$BootstrapRequest) this.instance, bootstrap$RemoteConfigRequestV1);
            return this;
        }

        private a() {
            super(Bootstrap$BootstrapRequest.c);
        }
    }

    static {
        Bootstrap$BootstrapRequest bootstrap$BootstrapRequest = new Bootstrap$BootstrapRequest();
        c = bootstrap$BootstrapRequest;
        bootstrap$BootstrapRequest.makeImmutable();
    }

    private Bootstrap$BootstrapRequest() {
    }

    static void h(Bootstrap$BootstrapRequest bootstrap$BootstrapRequest, Bootstrap$RemoteConfigRequestV1 bootstrap$RemoteConfigRequestV1) {
        bootstrap$BootstrapRequest.getClass();
        bootstrap$RemoteConfigRequestV1.getClass();
        bootstrap$BootstrapRequest.b = bootstrap$RemoteConfigRequestV1;
        bootstrap$BootstrapRequest.a = 1;
    }

    public static a i() {
        return (a) c.toBuilder();
    }

    public static x<Bootstrap$BootstrapRequest> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i;
        boolean z = true;
        boolean z2 = false;
        RemoteConfigRequestCase remoteConfigRequestCase = null;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Bootstrap$BootstrapRequest bootstrap$BootstrapRequest = (Bootstrap$BootstrapRequest) obj2;
                int i2 = bootstrap$BootstrapRequest.a;
                if (i2 == 0) {
                    remoteConfigRequestCase = RemoteConfigRequestCase.REMOTECONFIGREQUEST_NOT_SET;
                } else if (i2 == 1) {
                    remoteConfigRequestCase = RemoteConfigRequestCase.REMOTE_CONFIG_REQUEST_V1;
                }
                int ordinal = remoteConfigRequestCase.ordinal();
                if (ordinal == 0) {
                    if (this.a != 1) {
                        z = false;
                    }
                    this.b = hVar.u(z, this.b, bootstrap$BootstrapRequest.b);
                } else if (ordinal == 1) {
                    if (this.a == 0) {
                        z = false;
                    }
                    hVar.b(z);
                }
                if (hVar == GeneratedMessageLite.g.a && (i = bootstrap$BootstrapRequest.a) != 0) {
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
                                Bootstrap$RemoteConfigRequestV1.a aVar = this.a == 1 ? (Bootstrap$RemoteConfigRequestV1.a) ((Bootstrap$RemoteConfigRequestV1) this.b).toBuilder() : null;
                                u o = gVar.o(Bootstrap$RemoteConfigRequestV1.parser(), kVar);
                                this.b = o;
                                if (aVar != null) {
                                    aVar.mergeFrom((Bootstrap$RemoteConfigRequestV1.a) ((Bootstrap$RemoteConfigRequestV1) o));
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
                return new Bootstrap$BootstrapRequest();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (Bootstrap$BootstrapRequest.class) {
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
            i2 = 0 + CodedOutputStream.n(1, (Bootstrap$RemoteConfigRequestV1) this.b);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a == 1) {
            codedOutputStream.M(1, (Bootstrap$RemoteConfigRequestV1) this.b);
        }
    }
}
