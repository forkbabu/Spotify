package com.spotify.pses.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class DeviceInformation extends GeneratedMessageLite<DeviceInformation, b> implements Object {
    private static final DeviceInformation p;
    private static volatile x<DeviceInformation> q;
    private String a = "";
    private String b = "";
    private String c = "";
    private int f;
    private String n = "";
    private String o = "";

    public static final class b extends GeneratedMessageLite.b<DeviceInformation, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            DeviceInformation.n((DeviceInformation) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            DeviceInformation.l((DeviceInformation) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            DeviceInformation.m((DeviceInformation) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            DeviceInformation.o((DeviceInformation) this.instance, str);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            DeviceInformation.h((DeviceInformation) this.instance, str);
            return this;
        }

        public b r(int i) {
            copyOnWrite();
            DeviceInformation.i((DeviceInformation) this.instance, i);
            return this;
        }

        private b() {
            super(DeviceInformation.p);
        }
    }

    static {
        DeviceInformation deviceInformation = new DeviceInformation();
        p = deviceInformation;
        deviceInformation.makeImmutable();
    }

    private DeviceInformation() {
    }

    static void h(DeviceInformation deviceInformation, String str) {
        deviceInformation.getClass();
        str.getClass();
        deviceInformation.a = str;
    }

    static void i(DeviceInformation deviceInformation, int i) {
        deviceInformation.f = i;
    }

    static void l(DeviceInformation deviceInformation, String str) {
        deviceInformation.getClass();
        str.getClass();
        deviceInformation.n = str;
    }

    static void m(DeviceInformation deviceInformation, String str) {
        deviceInformation.getClass();
        str.getClass();
        deviceInformation.o = str;
    }

    static void n(DeviceInformation deviceInformation, String str) {
        deviceInformation.getClass();
        str.getClass();
        deviceInformation.b = str;
    }

    static void o(DeviceInformation deviceInformation, String str) {
        deviceInformation.getClass();
        str.getClass();
        deviceInformation.c = str;
    }

    public static b p() {
        return (b) p.toBuilder();
    }

    public static x<DeviceInformation> parser() {
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
                DeviceInformation deviceInformation = (DeviceInformation) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !deviceInformation.a.isEmpty(), deviceInformation.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !deviceInformation.b.isEmpty(), deviceInformation.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !deviceInformation.c.isEmpty(), deviceInformation.c);
                int i = this.f;
                boolean z2 = i != 0;
                int i2 = deviceInformation.f;
                if (i2 != 0) {
                    z = true;
                }
                this.f = hVar.m(z2, i, z, i2);
                this.n = hVar.n(!this.n.isEmpty(), this.n, !deviceInformation.n.isEmpty(), deviceInformation.n);
                this.o = hVar.n(!this.o.isEmpty(), this.o, true ^ deviceInformation.o.isEmpty(), deviceInformation.o);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                this.a = gVar.A();
                            } else if (B == 18) {
                                this.b = gVar.A();
                            } else if (B == 26) {
                                this.c = gVar.A();
                            } else if (B == 32) {
                                this.f = gVar.u();
                            } else if (B == 42) {
                                this.n = gVar.A();
                            } else if (B == 50) {
                                this.o = gVar.A();
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
                return new DeviceInformation();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (DeviceInformation.class) {
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
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
        }
        if (!this.b.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.b);
        }
        if (!this.c.isEmpty()) {
            i2 += CodedOutputStream.p(3, this.c);
        }
        int i3 = this.f;
        if (i3 != 0) {
            i2 += CodedOutputStream.j(4, i3);
        }
        if (!this.n.isEmpty()) {
            i2 += CodedOutputStream.p(5, this.n);
        }
        if (!this.o.isEmpty()) {
            i2 += CodedOutputStream.p(6, this.o);
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
        int i = this.f;
        if (i != 0) {
            codedOutputStream.K(4, i);
        }
        if (!this.n.isEmpty()) {
            codedOutputStream.P(5, this.n);
        }
        if (!this.o.isEmpty()) {
            codedOutputStream.P(6, this.o);
        }
    }
}
