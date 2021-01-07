package com.spotify.dac.api.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.dac.api.proto.ClientInfo;
import java.io.IOException;

public final class DacRequest extends GeneratedMessageLite<DacRequest, b> implements Object {
    private static final DacRequest b;
    private static volatile x<DacRequest> c;
    private ClientInfo a;

    public static final class b extends GeneratedMessageLite.b<DacRequest, b> implements Object {
        public b m(ClientInfo clientInfo) {
            copyOnWrite();
            DacRequest.h((DacRequest) this.instance, clientInfo);
            return this;
        }

        private b() {
            super(DacRequest.b);
        }
    }

    static {
        DacRequest dacRequest = new DacRequest();
        b = dacRequest;
        dacRequest.makeImmutable();
    }

    private DacRequest() {
    }

    static void h(DacRequest dacRequest, ClientInfo clientInfo) {
        dacRequest.getClass();
        clientInfo.getClass();
        dacRequest.a = clientInfo;
    }

    public static b i() {
        return (b) b.toBuilder();
    }

    public static x<DacRequest> parser() {
        return b.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return b;
            case 1:
                this.a = (ClientInfo) ((GeneratedMessageLite.h) obj).i(this.a, ((DacRequest) obj2).a);
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
                                ClientInfo clientInfo = this.a;
                                ClientInfo.b bVar = clientInfo != null ? (ClientInfo.b) clientInfo.toBuilder() : null;
                                ClientInfo clientInfo2 = (ClientInfo) gVar.o(ClientInfo.parser(), kVar);
                                this.a = clientInfo2;
                                if (bVar != null) {
                                    bVar.mergeFrom((ClientInfo.b) clientInfo2);
                                    this.a = (ClientInfo) bVar.buildPartial();
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
                return new DacRequest();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (DacRequest.class) {
                        if (c == null) {
                            c = new GeneratedMessageLite.c(b);
                        }
                    }
                }
                return c;
            default:
                throw new UnsupportedOperationException();
        }
        return b;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        ClientInfo clientInfo = this.a;
        if (clientInfo != null) {
            i2 = 0 + CodedOutputStream.n(1, clientInfo);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        ClientInfo clientInfo = this.a;
        if (clientInfo != null) {
            codedOutputStream.M(1, clientInfo);
        }
    }
}
