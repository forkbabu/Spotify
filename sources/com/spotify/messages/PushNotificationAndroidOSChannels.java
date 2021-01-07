package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class PushNotificationAndroidOSChannels extends GeneratedMessageLite<PushNotificationAndroidOSChannels, b> implements Object {
    private static final PushNotificationAndroidOSChannels n;
    private static volatile x<PushNotificationAndroidOSChannels> o;
    private int a;
    private String b = "";
    private o.i<String> c = GeneratedMessageLite.emptyProtobufList();
    private String f = "";

    public static final class b extends GeneratedMessageLite.b<PushNotificationAndroidOSChannels, b> implements Object {
        public b m(Iterable<String> iterable) {
            copyOnWrite();
            PushNotificationAndroidOSChannels.i((PushNotificationAndroidOSChannels) this.instance, iterable);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            PushNotificationAndroidOSChannels.l((PushNotificationAndroidOSChannels) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            PushNotificationAndroidOSChannels.h((PushNotificationAndroidOSChannels) this.instance, str);
            return this;
        }

        private b() {
            super(PushNotificationAndroidOSChannels.n);
        }
    }

    static {
        PushNotificationAndroidOSChannels pushNotificationAndroidOSChannels = new PushNotificationAndroidOSChannels();
        n = pushNotificationAndroidOSChannels;
        pushNotificationAndroidOSChannels.makeImmutable();
    }

    private PushNotificationAndroidOSChannels() {
    }

    static void h(PushNotificationAndroidOSChannels pushNotificationAndroidOSChannels, String str) {
        pushNotificationAndroidOSChannels.getClass();
        str.getClass();
        pushNotificationAndroidOSChannels.a |= 1;
        pushNotificationAndroidOSChannels.b = str;
    }

    static void i(PushNotificationAndroidOSChannels pushNotificationAndroidOSChannels, Iterable iterable) {
        if (!pushNotificationAndroidOSChannels.c.R0()) {
            pushNotificationAndroidOSChannels.c = GeneratedMessageLite.mutableCopy(pushNotificationAndroidOSChannels.c);
        }
        com.google.protobuf.a.addAll(iterable, pushNotificationAndroidOSChannels.c);
    }

    static void l(PushNotificationAndroidOSChannels pushNotificationAndroidOSChannels, String str) {
        pushNotificationAndroidOSChannels.getClass();
        str.getClass();
        pushNotificationAndroidOSChannels.a |= 2;
        pushNotificationAndroidOSChannels.f = str;
    }

    public static b m() {
        return (b) n.toBuilder();
    }

    public static x<PushNotificationAndroidOSChannels> parser() {
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
                PushNotificationAndroidOSChannels pushNotificationAndroidOSChannels = (PushNotificationAndroidOSChannels) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (pushNotificationAndroidOSChannels.a & 1) == 1, pushNotificationAndroidOSChannels.b);
                this.c = hVar.q(this.c, pushNotificationAndroidOSChannels.c);
                boolean z2 = (this.a & 2) == 2;
                String str = this.f;
                if ((pushNotificationAndroidOSChannels.a & 2) == 2) {
                    z = true;
                }
                this.f = hVar.n(z2, str, z, pushNotificationAndroidOSChannels.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= pushNotificationAndroidOSChannels.a;
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
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(z4);
                            } else if (B == 26) {
                                String z5 = gVar.z();
                                this.a |= 2;
                                this.f = z5;
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
                this.c.C();
                return null;
            case 4:
                return new PushNotificationAndroidOSChannels();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (PushNotificationAndroidOSChannels.class) {
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
        int p = (this.a & 1) == 1 ? CodedOutputStream.p(1, this.b) + 0 : 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            i2 += CodedOutputStream.q(this.c.get(i3));
        }
        int C0 = je.C0(this.c, 1, p + i2);
        if ((this.a & 2) == 2) {
            C0 += CodedOutputStream.p(3, this.f);
        }
        int c2 = this.unknownFields.c() + C0;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.P(2, this.c.get(i));
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(3, this.f);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
