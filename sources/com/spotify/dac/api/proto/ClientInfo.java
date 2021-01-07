package com.spotify.dac.api.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class ClientInfo extends GeneratedMessageLite<ClientInfo, b> implements Object {
    private static final ClientInfo c;
    private static volatile x<ClientInfo> f;
    private int a;
    private String b = "";

    public enum Client implements o.c {
        UNKNOWN(0),
        ANDROID_MUSIC_APP(1),
        IOS_MUSIC_APP(2),
        UNRECOGNIZED(-1);
        
        private final int value;

        private Client(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public static final class b extends GeneratedMessageLite.b<ClientInfo, b> implements Object {
        public b m(Client client) {
            copyOnWrite();
            ClientInfo.h((ClientInfo) this.instance, client);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            ClientInfo.i((ClientInfo) this.instance, str);
            return this;
        }

        private b() {
            super(ClientInfo.c);
        }
    }

    static {
        ClientInfo clientInfo = new ClientInfo();
        c = clientInfo;
        clientInfo.makeImmutable();
    }

    private ClientInfo() {
    }

    static void h(ClientInfo clientInfo, Client client) {
        clientInfo.getClass();
        client.getClass();
        clientInfo.a = client.getNumber();
    }

    static void i(ClientInfo clientInfo, String str) {
        clientInfo.getClass();
        str.getClass();
        clientInfo.b = str;
    }

    public static b l() {
        return (b) c.toBuilder();
    }

    public static x<ClientInfo> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ClientInfo clientInfo = (ClientInfo) obj2;
                int i = this.a;
                boolean z2 = i != 0;
                int i2 = clientInfo.a;
                if (i2 != 0) {
                    z = true;
                }
                this.a = hVar.m(z2, i, z, i2);
                this.b = hVar.n(!this.b.isEmpty(), this.b, true ^ clientInfo.b.isEmpty(), clientInfo.b);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a = gVar.u();
                            } else if (B == 18) {
                                this.b = gVar.A();
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
                return new ClientInfo();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (ClientInfo.class) {
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
        if (this.a != Client.UNKNOWN.getNumber()) {
            i2 = 0 + CodedOutputStream.h(1, this.a);
        }
        if (!this.b.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.b);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a != Client.UNKNOWN.getNumber()) {
            codedOutputStream.K(1, this.a);
        }
        if (!this.b.isEmpty()) {
            codedOutputStream.P(2, this.b);
        }
    }
}
