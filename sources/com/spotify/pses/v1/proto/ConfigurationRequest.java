package com.spotify.pses.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.pses.v1.proto.ClientData;
import java.io.IOException;

public final class ConfigurationRequest extends GeneratedMessageLite<ConfigurationRequest, b> implements Object {
    private static final ConfigurationRequest b;
    private static volatile x<ConfigurationRequest> c;
    private ClientData a;

    public static final class b extends GeneratedMessageLite.b<ConfigurationRequest, b> implements Object {
        public b m(ClientData clientData) {
            copyOnWrite();
            ConfigurationRequest.h((ConfigurationRequest) this.instance, clientData);
            return this;
        }

        private b() {
            super(ConfigurationRequest.b);
        }
    }

    static {
        ConfigurationRequest configurationRequest = new ConfigurationRequest();
        b = configurationRequest;
        configurationRequest.makeImmutable();
    }

    private ConfigurationRequest() {
    }

    static void h(ConfigurationRequest configurationRequest, ClientData clientData) {
        configurationRequest.getClass();
        clientData.getClass();
        configurationRequest.a = clientData;
    }

    public static b i() {
        return (b) b.toBuilder();
    }

    public static x<ConfigurationRequest> parser() {
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
                this.a = (ClientData) ((GeneratedMessageLite.h) obj).i(this.a, ((ConfigurationRequest) obj2).a);
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
                                ClientData clientData = this.a;
                                ClientData.b bVar = clientData != null ? (ClientData.b) clientData.toBuilder() : null;
                                ClientData clientData2 = (ClientData) gVar.o(ClientData.parser(), kVar);
                                this.a = clientData2;
                                if (bVar != null) {
                                    bVar.mergeFrom((ClientData.b) clientData2);
                                    this.a = (ClientData) bVar.buildPartial();
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
                return new ConfigurationRequest();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (ConfigurationRequest.class) {
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
        ClientData clientData = this.a;
        if (clientData != null) {
            i2 = 0 + CodedOutputStream.n(1, clientData);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        ClientData clientData = this.a;
        if (clientData != null) {
            codedOutputStream.M(1, clientData);
        }
    }
}
