package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class PushNotificationReceivedV1NonAuth extends GeneratedMessageLite<PushNotificationReceivedV1NonAuth, b> implements Object {
    private static final PushNotificationReceivedV1NonAuth o;
    private static volatile x<PushNotificationReceivedV1NonAuth> p;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private long n;

    public static final class b extends GeneratedMessageLite.b<PushNotificationReceivedV1NonAuth, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            PushNotificationReceivedV1NonAuth.m((PushNotificationReceivedV1NonAuth) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            PushNotificationReceivedV1NonAuth.l((PushNotificationReceivedV1NonAuth) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            PushNotificationReceivedV1NonAuth.h((PushNotificationReceivedV1NonAuth) this.instance, str);
            return this;
        }

        public b p(long j) {
            copyOnWrite();
            PushNotificationReceivedV1NonAuth.i((PushNotificationReceivedV1NonAuth) this.instance, j);
            return this;
        }

        private b() {
            super(PushNotificationReceivedV1NonAuth.o);
        }
    }

    static {
        PushNotificationReceivedV1NonAuth pushNotificationReceivedV1NonAuth = new PushNotificationReceivedV1NonAuth();
        o = pushNotificationReceivedV1NonAuth;
        pushNotificationReceivedV1NonAuth.makeImmutable();
    }

    private PushNotificationReceivedV1NonAuth() {
    }

    static void h(PushNotificationReceivedV1NonAuth pushNotificationReceivedV1NonAuth, String str) {
        pushNotificationReceivedV1NonAuth.getClass();
        str.getClass();
        pushNotificationReceivedV1NonAuth.a |= 1;
        pushNotificationReceivedV1NonAuth.b = str;
    }

    static void i(PushNotificationReceivedV1NonAuth pushNotificationReceivedV1NonAuth, long j) {
        pushNotificationReceivedV1NonAuth.a |= 8;
        pushNotificationReceivedV1NonAuth.n = j;
    }

    static void l(PushNotificationReceivedV1NonAuth pushNotificationReceivedV1NonAuth, String str) {
        pushNotificationReceivedV1NonAuth.getClass();
        str.getClass();
        pushNotificationReceivedV1NonAuth.a |= 2;
        pushNotificationReceivedV1NonAuth.c = str;
    }

    static void m(PushNotificationReceivedV1NonAuth pushNotificationReceivedV1NonAuth, String str) {
        pushNotificationReceivedV1NonAuth.getClass();
        str.getClass();
        pushNotificationReceivedV1NonAuth.a |= 4;
        pushNotificationReceivedV1NonAuth.f = str;
    }

    public static b n() {
        return (b) o.toBuilder();
    }

    public static x<PushNotificationReceivedV1NonAuth> parser() {
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
                PushNotificationReceivedV1NonAuth pushNotificationReceivedV1NonAuth = (PushNotificationReceivedV1NonAuth) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (pushNotificationReceivedV1NonAuth.a & 1) == 1, pushNotificationReceivedV1NonAuth.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (pushNotificationReceivedV1NonAuth.a & 2) == 2, pushNotificationReceivedV1NonAuth.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (pushNotificationReceivedV1NonAuth.a & 4) == 4, pushNotificationReceivedV1NonAuth.f);
                this.n = hVar.s((this.a & 8) == 8, this.n, (pushNotificationReceivedV1NonAuth.a & 8) == 8, pushNotificationReceivedV1NonAuth.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= pushNotificationReceivedV1NonAuth.a;
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
                                String z2 = gVar.z();
                                this.a |= 1;
                                this.b = z2;
                            } else if (B == 18) {
                                String z3 = gVar.z();
                                this.a |= 2;
                                this.c = z3;
                            } else if (B == 26) {
                                String z4 = gVar.z();
                                this.a |= 4;
                                this.f = z4;
                            } else if (B == 32) {
                                this.a |= 8;
                                this.n = gVar.w();
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
                return new PushNotificationReceivedV1NonAuth();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (PushNotificationReceivedV1NonAuth.class) {
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
            i2 += CodedOutputStream.p(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.l(4, this.n);
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
            codedOutputStream.P(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.U(4, this.n);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
