package com.spotify.pses.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.pses.v1.proto.DeviceInformation;
import com.spotify.pses.v1.proto.Screen;
import java.io.IOException;

public final class ClientData extends GeneratedMessageLite<ClientData, b> implements Object {
    private static final ClientData t;
    private static volatile x<ClientData> u;
    private String a = "";
    private String b = "";
    private String c = "";
    private String f = "";
    private String n = "";
    private boolean o;
    private Screen p;
    private DeviceInformation q;
    private int r;
    private String s = "";

    public static final class b extends GeneratedMessageLite.b<ClientData, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            ClientData.o((ClientData) this.instance, str);
            return this;
        }

        public b n(DeviceInformation deviceInformation) {
            copyOnWrite();
            ClientData.m((ClientData) this.instance, deviceInformation);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            ClientData.i((ClientData) this.instance, str);
            return this;
        }

        public b p(Origin origin) {
            copyOnWrite();
            ClientData.n((ClientData) this.instance, origin);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            ClientData.p((ClientData) this.instance, str);
            return this;
        }

        public b r(String str) {
            copyOnWrite();
            ClientData.q((ClientData) this.instance, str);
            return this;
        }

        public b s(Screen screen) {
            copyOnWrite();
            ClientData.l((ClientData) this.instance, screen);
            return this;
        }

        public b t(String str) {
            copyOnWrite();
            ClientData.h((ClientData) this.instance, str);
            return this;
        }

        private b() {
            super(ClientData.t);
        }
    }

    static {
        ClientData clientData = new ClientData();
        t = clientData;
        clientData.makeImmutable();
    }

    private ClientData() {
    }

    static void h(ClientData clientData, String str) {
        clientData.getClass();
        str.getClass();
        clientData.a = str;
    }

    static void i(ClientData clientData, String str) {
        clientData.getClass();
        str.getClass();
        clientData.f = str;
    }

    static void l(ClientData clientData, Screen screen) {
        clientData.getClass();
        screen.getClass();
        clientData.p = screen;
    }

    static void m(ClientData clientData, DeviceInformation deviceInformation) {
        clientData.getClass();
        deviceInformation.getClass();
        clientData.q = deviceInformation;
    }

    static void n(ClientData clientData, Origin origin) {
        clientData.getClass();
        origin.getClass();
        clientData.r = origin.getNumber();
    }

    static void o(ClientData clientData, String str) {
        clientData.getClass();
        str.getClass();
        clientData.s = str;
    }

    static void p(ClientData clientData, String str) {
        clientData.getClass();
        str.getClass();
        clientData.b = str;
    }

    public static x<ClientData> parser() {
        return t.getParserForType();
    }

    static void q(ClientData clientData, String str) {
        clientData.getClass();
        str.getClass();
        clientData.c = str;
    }

    public static b r() {
        return (b) t.toBuilder();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return t;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ClientData clientData = (ClientData) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !clientData.a.isEmpty(), clientData.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !clientData.b.isEmpty(), clientData.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !clientData.c.isEmpty(), clientData.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !clientData.f.isEmpty(), clientData.f);
                this.n = hVar.n(!this.n.isEmpty(), this.n, !clientData.n.isEmpty(), clientData.n);
                boolean z2 = this.o;
                boolean z3 = clientData.o;
                this.o = hVar.f(z2, z2, z3, z3);
                this.p = (Screen) hVar.i(this.p, clientData.p);
                this.q = (DeviceInformation) hVar.i(this.q, clientData.q);
                int i = this.r;
                boolean z4 = i != 0;
                int i2 = clientData.r;
                if (i2 != 0) {
                    z = true;
                }
                this.r = hVar.m(z4, i, z, i2);
                this.s = hVar.n(!this.s.isEmpty(), this.s, true ^ clientData.s.isEmpty(), clientData.s);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        switch (B) {
                            case 0:
                                break;
                            case 10:
                                this.a = gVar.A();
                                continue;
                            case 18:
                                this.b = gVar.A();
                                continue;
                            case 26:
                                this.c = gVar.A();
                                continue;
                            case 34:
                                this.f = gVar.A();
                                continue;
                            case 42:
                                this.n = gVar.A();
                                continue;
                            case 48:
                                this.o = gVar.h();
                                continue;
                            case 58:
                                Screen screen = this.p;
                                Screen.b bVar = screen != null ? (Screen.b) screen.toBuilder() : null;
                                Screen screen2 = (Screen) gVar.o(Screen.parser(), kVar);
                                this.p = screen2;
                                if (bVar != null) {
                                    bVar.mergeFrom((Screen.b) screen2);
                                    this.p = (Screen) bVar.buildPartial();
                                } else {
                                    continue;
                                }
                            case 66:
                                DeviceInformation deviceInformation = this.q;
                                DeviceInformation.b bVar2 = deviceInformation != null ? (DeviceInformation.b) deviceInformation.toBuilder() : null;
                                DeviceInformation deviceInformation2 = (DeviceInformation) gVar.o(DeviceInformation.parser(), kVar);
                                this.q = deviceInformation2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((DeviceInformation.b) deviceInformation2);
                                    this.q = (DeviceInformation) bVar2.buildPartial();
                                } else {
                                    continue;
                                }
                            case 72:
                                this.r = gVar.u();
                                continue;
                            case 82:
                                this.s = gVar.A();
                                continue;
                            default:
                                if (gVar.F(B)) {
                                    continue;
                                }
                                break;
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
                return new ClientData();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (u == null) {
                    synchronized (ClientData.class) {
                        if (u == null) {
                            u = new GeneratedMessageLite.c(t);
                        }
                    }
                }
                return u;
            default:
                throw new UnsupportedOperationException();
        }
        return t;
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
        if (!this.b.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.b);
        }
        if (!this.c.isEmpty()) {
            i2 += CodedOutputStream.p(3, this.c);
        }
        if (!this.f.isEmpty()) {
            i2 += CodedOutputStream.p(4, this.f);
        }
        if (!this.n.isEmpty()) {
            i2 += CodedOutputStream.p(5, this.n);
        }
        boolean z = this.o;
        if (z) {
            i2 += CodedOutputStream.d(6, z);
        }
        Screen screen = this.p;
        if (screen != null) {
            i2 += CodedOutputStream.n(7, screen);
        }
        DeviceInformation deviceInformation = this.q;
        if (deviceInformation != null) {
            i2 += CodedOutputStream.n(8, deviceInformation);
        }
        if (this.r != Origin.APP_LAUNCH.getNumber()) {
            i2 += CodedOutputStream.h(9, this.r);
        }
        if (!this.s.isEmpty()) {
            i2 += CodedOutputStream.p(10, this.s);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        if (!this.b.isEmpty()) {
            codedOutputStream.P(2, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(3, this.c);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(4, this.f);
        }
        if (!this.n.isEmpty()) {
            codedOutputStream.P(5, this.n);
        }
        boolean z = this.o;
        if (z) {
            codedOutputStream.A(6, z);
        }
        Screen screen = this.p;
        if (screen != null) {
            codedOutputStream.M(7, screen);
        }
        DeviceInformation deviceInformation = this.q;
        if (deviceInformation != null) {
            codedOutputStream.M(8, deviceInformation);
        }
        if (this.r != Origin.APP_LAUNCH.getNumber()) {
            codedOutputStream.K(9, this.r);
        }
        if (!this.s.isEmpty()) {
            codedOutputStream.P(10, this.s);
        }
    }
}
