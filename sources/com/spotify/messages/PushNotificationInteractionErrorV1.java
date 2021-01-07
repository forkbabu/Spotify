package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class PushNotificationInteractionErrorV1 extends GeneratedMessageLite<PushNotificationInteractionErrorV1, b> implements Object {
    private static final PushNotificationInteractionErrorV1 q;
    private static volatile x<PushNotificationInteractionErrorV1> r;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private String n = "";
    private long o;
    private String p = "";

    public static final class b extends GeneratedMessageLite.b<PushNotificationInteractionErrorV1, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            PushNotificationInteractionErrorV1.o((PushNotificationInteractionErrorV1) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            PushNotificationInteractionErrorV1.i((PushNotificationInteractionErrorV1) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            PushNotificationInteractionErrorV1.m((PushNotificationInteractionErrorV1) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            PushNotificationInteractionErrorV1.h((PushNotificationInteractionErrorV1) this.instance, str);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            PushNotificationInteractionErrorV1.n((PushNotificationInteractionErrorV1) this.instance, str);
            return this;
        }

        public b r(long j) {
            copyOnWrite();
            PushNotificationInteractionErrorV1.l((PushNotificationInteractionErrorV1) this.instance, j);
            return this;
        }

        private b() {
            super(PushNotificationInteractionErrorV1.q);
        }
    }

    static {
        PushNotificationInteractionErrorV1 pushNotificationInteractionErrorV1 = new PushNotificationInteractionErrorV1();
        q = pushNotificationInteractionErrorV1;
        pushNotificationInteractionErrorV1.makeImmutable();
    }

    private PushNotificationInteractionErrorV1() {
    }

    static void h(PushNotificationInteractionErrorV1 pushNotificationInteractionErrorV1, String str) {
        pushNotificationInteractionErrorV1.getClass();
        str.getClass();
        pushNotificationInteractionErrorV1.a |= 1;
        pushNotificationInteractionErrorV1.b = str;
    }

    static void i(PushNotificationInteractionErrorV1 pushNotificationInteractionErrorV1, String str) {
        pushNotificationInteractionErrorV1.getClass();
        str.getClass();
        pushNotificationInteractionErrorV1.a |= 8;
        pushNotificationInteractionErrorV1.n = str;
    }

    static void l(PushNotificationInteractionErrorV1 pushNotificationInteractionErrorV1, long j) {
        pushNotificationInteractionErrorV1.a |= 16;
        pushNotificationInteractionErrorV1.o = j;
    }

    static void m(PushNotificationInteractionErrorV1 pushNotificationInteractionErrorV1, String str) {
        pushNotificationInteractionErrorV1.getClass();
        str.getClass();
        pushNotificationInteractionErrorV1.a |= 32;
        pushNotificationInteractionErrorV1.p = str;
    }

    static void n(PushNotificationInteractionErrorV1 pushNotificationInteractionErrorV1, String str) {
        pushNotificationInteractionErrorV1.getClass();
        str.getClass();
        pushNotificationInteractionErrorV1.a |= 2;
        pushNotificationInteractionErrorV1.c = str;
    }

    static void o(PushNotificationInteractionErrorV1 pushNotificationInteractionErrorV1, String str) {
        pushNotificationInteractionErrorV1.getClass();
        str.getClass();
        pushNotificationInteractionErrorV1.a |= 4;
        pushNotificationInteractionErrorV1.f = str;
    }

    public static b p() {
        return (b) q.toBuilder();
    }

    public static x<PushNotificationInteractionErrorV1> parser() {
        return q.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return q;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PushNotificationInteractionErrorV1 pushNotificationInteractionErrorV1 = (PushNotificationInteractionErrorV1) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (pushNotificationInteractionErrorV1.a & 1) == 1, pushNotificationInteractionErrorV1.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (pushNotificationInteractionErrorV1.a & 2) == 2, pushNotificationInteractionErrorV1.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (pushNotificationInteractionErrorV1.a & 4) == 4, pushNotificationInteractionErrorV1.f);
                this.n = hVar.n((this.a & 8) == 8, this.n, (pushNotificationInteractionErrorV1.a & 8) == 8, pushNotificationInteractionErrorV1.n);
                this.o = hVar.s((this.a & 16) == 16, this.o, (pushNotificationInteractionErrorV1.a & 16) == 16, pushNotificationInteractionErrorV1.o);
                boolean z2 = (this.a & 32) == 32;
                String str = this.p;
                if ((pushNotificationInteractionErrorV1.a & 32) == 32) {
                    z = true;
                }
                this.p = hVar.n(z2, str, z, pushNotificationInteractionErrorV1.p);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= pushNotificationInteractionErrorV1.a;
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
                            } else if (B == 34) {
                                String z6 = gVar.z();
                                this.a |= 8;
                                this.n = z6;
                            } else if (B == 40) {
                                this.a |= 16;
                                this.o = gVar.w();
                            } else if (B == 50) {
                                String z7 = gVar.z();
                                this.a |= 32;
                                this.p = z7;
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
                return new PushNotificationInteractionErrorV1();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (r == null) {
                    synchronized (PushNotificationInteractionErrorV1.class) {
                        if (r == null) {
                            r = new GeneratedMessageLite.c(q);
                        }
                    }
                }
                return r;
            default:
                throw new UnsupportedOperationException();
        }
        return q;
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
            i2 += CodedOutputStream.p(4, this.n);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.l(5, this.o);
        }
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.p(6, this.p);
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
            codedOutputStream.P(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.U(5, this.o);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.P(6, this.p);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
