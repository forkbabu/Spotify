package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class PushNotificationPayloadErrorV1 extends GeneratedMessageLite<PushNotificationPayloadErrorV1, b> implements Object {
    private static final PushNotificationPayloadErrorV1 o;
    private static volatile x<PushNotificationPayloadErrorV1> p;
    private int a;
    private String b = "";
    private String c = "";
    private long f;
    private String n = "";

    public static final class b extends GeneratedMessageLite.b<PushNotificationPayloadErrorV1, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            PushNotificationPayloadErrorV1.i((PushNotificationPayloadErrorV1) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            PushNotificationPayloadErrorV1.m((PushNotificationPayloadErrorV1) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            PushNotificationPayloadErrorV1.h((PushNotificationPayloadErrorV1) this.instance, str);
            return this;
        }

        public b p(long j) {
            copyOnWrite();
            PushNotificationPayloadErrorV1.l((PushNotificationPayloadErrorV1) this.instance, j);
            return this;
        }

        private b() {
            super(PushNotificationPayloadErrorV1.o);
        }
    }

    static {
        PushNotificationPayloadErrorV1 pushNotificationPayloadErrorV1 = new PushNotificationPayloadErrorV1();
        o = pushNotificationPayloadErrorV1;
        pushNotificationPayloadErrorV1.makeImmutable();
    }

    private PushNotificationPayloadErrorV1() {
    }

    static void h(PushNotificationPayloadErrorV1 pushNotificationPayloadErrorV1, String str) {
        pushNotificationPayloadErrorV1.getClass();
        str.getClass();
        pushNotificationPayloadErrorV1.a |= 1;
        pushNotificationPayloadErrorV1.b = str;
    }

    static void i(PushNotificationPayloadErrorV1 pushNotificationPayloadErrorV1, String str) {
        pushNotificationPayloadErrorV1.getClass();
        str.getClass();
        pushNotificationPayloadErrorV1.a |= 2;
        pushNotificationPayloadErrorV1.c = str;
    }

    static void l(PushNotificationPayloadErrorV1 pushNotificationPayloadErrorV1, long j) {
        pushNotificationPayloadErrorV1.a |= 4;
        pushNotificationPayloadErrorV1.f = j;
    }

    static void m(PushNotificationPayloadErrorV1 pushNotificationPayloadErrorV1, String str) {
        pushNotificationPayloadErrorV1.getClass();
        str.getClass();
        pushNotificationPayloadErrorV1.a |= 8;
        pushNotificationPayloadErrorV1.n = str;
    }

    public static b n() {
        return (b) o.toBuilder();
    }

    public static x<PushNotificationPayloadErrorV1> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PushNotificationPayloadErrorV1 pushNotificationPayloadErrorV1 = (PushNotificationPayloadErrorV1) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (pushNotificationPayloadErrorV1.a & 1) == 1, pushNotificationPayloadErrorV1.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (pushNotificationPayloadErrorV1.a & 2) == 2, pushNotificationPayloadErrorV1.c);
                this.f = hVar.s((this.a & 4) == 4, this.f, (pushNotificationPayloadErrorV1.a & 4) == 4, pushNotificationPayloadErrorV1.f);
                boolean z2 = (this.a & 8) == 8;
                String str = this.n;
                if ((pushNotificationPayloadErrorV1.a & 8) == 8) {
                    z = true;
                }
                this.n = hVar.n(z2, str, z, pushNotificationPayloadErrorV1.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= pushNotificationPayloadErrorV1.a;
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
                            } else if (B == 24) {
                                this.a |= 4;
                                this.f = gVar.w();
                            } else if (B == 34) {
                                String z5 = gVar.z();
                                this.a |= 8;
                                this.n = z5;
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
                return new PushNotificationPayloadErrorV1();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (PushNotificationPayloadErrorV1.class) {
                        if (p == null) {
                            p = new GeneratedMessageLite.c(o);
                        }
                    }
                }
                return p;
            default:
                throw new UnsupportedOperationException();
        }
        return o;
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
            i2 += CodedOutputStream.l(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.p(4, this.n);
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
            codedOutputStream.P(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.U(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.P(4, this.n);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
