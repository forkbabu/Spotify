package com.spotify.contexts;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class DeviceAndroid extends GeneratedMessageLite<DeviceAndroid, b> implements Object {
    private static final DeviceAndroid p;
    private static volatile x<DeviceAndroid> q;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private int n;
    private String o = "";

    public static final class b extends GeneratedMessageLite.b<DeviceAndroid, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            DeviceAndroid.l((DeviceAndroid) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            DeviceAndroid.h((DeviceAndroid) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            DeviceAndroid.m((DeviceAndroid) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            DeviceAndroid.n((DeviceAndroid) this.instance, str);
            return this;
        }

        public b q(int i) {
            copyOnWrite();
            DeviceAndroid.i((DeviceAndroid) this.instance, i);
            return this;
        }

        private b() {
            super(DeviceAndroid.p);
        }
    }

    static {
        DeviceAndroid deviceAndroid = new DeviceAndroid();
        p = deviceAndroid;
        deviceAndroid.makeImmutable();
    }

    private DeviceAndroid() {
    }

    static void h(DeviceAndroid deviceAndroid, String str) {
        deviceAndroid.getClass();
        str.getClass();
        deviceAndroid.a |= 1;
        deviceAndroid.b = str;
    }

    static void i(DeviceAndroid deviceAndroid, int i) {
        deviceAndroid.a |= 8;
        deviceAndroid.n = i;
    }

    static void l(DeviceAndroid deviceAndroid, String str) {
        deviceAndroid.getClass();
        str.getClass();
        deviceAndroid.a |= 16;
        deviceAndroid.o = str;
    }

    static void m(DeviceAndroid deviceAndroid, String str) {
        deviceAndroid.getClass();
        str.getClass();
        deviceAndroid.a |= 2;
        deviceAndroid.c = str;
    }

    static void n(DeviceAndroid deviceAndroid, String str) {
        deviceAndroid.getClass();
        str.getClass();
        deviceAndroid.a |= 4;
        deviceAndroid.f = str;
    }

    public static b p() {
        return (b) p.toBuilder();
    }

    public static x<DeviceAndroid> parser() {
        return p.getParserForType();
    }

    public static DeviceAndroid q(ByteString byteString) {
        return (DeviceAndroid) GeneratedMessageLite.parseFrom(p, byteString);
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
                DeviceAndroid deviceAndroid = (DeviceAndroid) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (deviceAndroid.a & 1) == 1, deviceAndroid.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (deviceAndroid.a & 2) == 2, deviceAndroid.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (deviceAndroid.a & 4) == 4, deviceAndroid.f);
                this.n = hVar.m((this.a & 8) == 8, this.n, (deviceAndroid.a & 8) == 8, deviceAndroid.n);
                boolean z2 = (this.a & 16) == 16;
                String str = this.o;
                if ((deviceAndroid.a & 16) == 16) {
                    z = true;
                }
                this.o = hVar.n(z2, str, z, deviceAndroid.o);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= deviceAndroid.a;
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
                                String z3 = gVar.z();
                                this.a |= 1;
                                this.b = z3;
                            } else if (B == 18) {
                                String z4 = gVar.z();
                                this.a |= 2;
                                this.c = z4;
                            } else if (B == 26) {
                                String z5 = gVar.z();
                                this.a |= 4;
                                this.f = z5;
                            } else if (B == 32) {
                                this.a |= 8;
                                this.n = gVar.u();
                            } else if (B == 42) {
                                String z6 = gVar.z();
                                this.a |= 16;
                                this.o = z6;
                            } else if (!parseUnknownField(B, gVar)) {
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
                return new DeviceAndroid();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (DeviceAndroid.class) {
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
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.p(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.p(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.p(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.j(4, this.n);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.p(5, this.o);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public String o() {
        return this.o;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.P(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.K(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.P(5, this.o);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
