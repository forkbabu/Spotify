package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class PushAndroidDeviceSettingsV1 extends GeneratedMessageLite<PushAndroidDeviceSettingsV1, b> implements Object {
    private static final PushAndroidDeviceSettingsV1 n;
    private static volatile x<PushAndroidDeviceSettingsV1> o;
    private int a;
    private String b = "";
    private boolean c;
    private boolean f;

    public static final class b extends GeneratedMessageLite.b<PushAndroidDeviceSettingsV1, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            PushAndroidDeviceSettingsV1.h((PushAndroidDeviceSettingsV1) this.instance, str);
            return this;
        }

        public b n(boolean z) {
            copyOnWrite();
            PushAndroidDeviceSettingsV1.l((PushAndroidDeviceSettingsV1) this.instance, z);
            return this;
        }

        public b o(boolean z) {
            copyOnWrite();
            PushAndroidDeviceSettingsV1.i((PushAndroidDeviceSettingsV1) this.instance, z);
            return this;
        }

        private b() {
            super(PushAndroidDeviceSettingsV1.n);
        }
    }

    static {
        PushAndroidDeviceSettingsV1 pushAndroidDeviceSettingsV1 = new PushAndroidDeviceSettingsV1();
        n = pushAndroidDeviceSettingsV1;
        pushAndroidDeviceSettingsV1.makeImmutable();
    }

    private PushAndroidDeviceSettingsV1() {
    }

    static void h(PushAndroidDeviceSettingsV1 pushAndroidDeviceSettingsV1, String str) {
        pushAndroidDeviceSettingsV1.getClass();
        str.getClass();
        pushAndroidDeviceSettingsV1.a |= 1;
        pushAndroidDeviceSettingsV1.b = str;
    }

    static void i(PushAndroidDeviceSettingsV1 pushAndroidDeviceSettingsV1, boolean z) {
        pushAndroidDeviceSettingsV1.a |= 2;
        pushAndroidDeviceSettingsV1.c = z;
    }

    static void l(PushAndroidDeviceSettingsV1 pushAndroidDeviceSettingsV1, boolean z) {
        pushAndroidDeviceSettingsV1.a |= 4;
        pushAndroidDeviceSettingsV1.f = z;
    }

    public static b m() {
        return (b) n.toBuilder();
    }

    public static x<PushAndroidDeviceSettingsV1> parser() {
        return n.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return n;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PushAndroidDeviceSettingsV1 pushAndroidDeviceSettingsV1 = (PushAndroidDeviceSettingsV1) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (pushAndroidDeviceSettingsV1.a & 1) == 1, pushAndroidDeviceSettingsV1.b);
                this.c = hVar.f((this.a & 2) == 2, this.c, (pushAndroidDeviceSettingsV1.a & 2) == 2, pushAndroidDeviceSettingsV1.c);
                boolean z2 = (this.a & 4) == 4;
                boolean z3 = this.f;
                if ((pushAndroidDeviceSettingsV1.a & 4) == 4) {
                    z = true;
                }
                this.f = hVar.f(z2, z3, z, pushAndroidDeviceSettingsV1.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= pushAndroidDeviceSettingsV1.a;
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
                                String z4 = gVar.z();
                                this.a |= 1;
                                this.b = z4;
                            } else if (B == 16) {
                                this.a |= 2;
                                this.c = gVar.h();
                            } else if (B == 24) {
                                this.a |= 4;
                                this.f = gVar.h();
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
                return new PushAndroidDeviceSettingsV1();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (PushAndroidDeviceSettingsV1.class) {
                        if (o == null) {
                            o = new GeneratedMessageLite.c(n);
                        }
                    }
                }
                return o;
            default:
                throw new UnsupportedOperationException();
        }
        return n;
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
            i2 += CodedOutputStream.d(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.d(3, this.f);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.A(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.A(3, this.f);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
