package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class PushNotificationInteractionV1 extends GeneratedMessageLite<PushNotificationInteractionV1, b> implements Object {
    private static final PushNotificationInteractionV1 p;
    private static volatile x<PushNotificationInteractionV1> q;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private String n = "";
    private long o;

    public static final class b extends GeneratedMessageLite.b<PushNotificationInteractionV1, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            PushNotificationInteractionV1.n((PushNotificationInteractionV1) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            PushNotificationInteractionV1.i((PushNotificationInteractionV1) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            PushNotificationInteractionV1.h((PushNotificationInteractionV1) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            PushNotificationInteractionV1.m((PushNotificationInteractionV1) this.instance, str);
            return this;
        }

        public b q(long j) {
            copyOnWrite();
            PushNotificationInteractionV1.l((PushNotificationInteractionV1) this.instance, j);
            return this;
        }

        private b() {
            super(PushNotificationInteractionV1.p);
        }
    }

    static {
        PushNotificationInteractionV1 pushNotificationInteractionV1 = new PushNotificationInteractionV1();
        p = pushNotificationInteractionV1;
        pushNotificationInteractionV1.makeImmutable();
    }

    private PushNotificationInteractionV1() {
    }

    static void h(PushNotificationInteractionV1 pushNotificationInteractionV1, String str) {
        pushNotificationInteractionV1.getClass();
        str.getClass();
        pushNotificationInteractionV1.a |= 1;
        pushNotificationInteractionV1.b = str;
    }

    static void i(PushNotificationInteractionV1 pushNotificationInteractionV1, String str) {
        pushNotificationInteractionV1.getClass();
        str.getClass();
        pushNotificationInteractionV1.a |= 8;
        pushNotificationInteractionV1.n = str;
    }

    static void l(PushNotificationInteractionV1 pushNotificationInteractionV1, long j) {
        pushNotificationInteractionV1.a |= 16;
        pushNotificationInteractionV1.o = j;
    }

    static void m(PushNotificationInteractionV1 pushNotificationInteractionV1, String str) {
        pushNotificationInteractionV1.getClass();
        str.getClass();
        pushNotificationInteractionV1.a |= 2;
        pushNotificationInteractionV1.c = str;
    }

    static void n(PushNotificationInteractionV1 pushNotificationInteractionV1, String str) {
        pushNotificationInteractionV1.getClass();
        str.getClass();
        pushNotificationInteractionV1.a |= 4;
        pushNotificationInteractionV1.f = str;
    }

    public static b o() {
        return (b) p.toBuilder();
    }

    public static x<PushNotificationInteractionV1> parser() {
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
                PushNotificationInteractionV1 pushNotificationInteractionV1 = (PushNotificationInteractionV1) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (pushNotificationInteractionV1.a & 1) == 1, pushNotificationInteractionV1.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (pushNotificationInteractionV1.a & 2) == 2, pushNotificationInteractionV1.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (pushNotificationInteractionV1.a & 4) == 4, pushNotificationInteractionV1.f);
                this.n = hVar.n((this.a & 8) == 8, this.n, (pushNotificationInteractionV1.a & 8) == 8, pushNotificationInteractionV1.n);
                this.o = hVar.s((this.a & 16) == 16, this.o, (pushNotificationInteractionV1.a & 16) == 16, pushNotificationInteractionV1.o);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= pushNotificationInteractionV1.a;
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
                            } else if (B == 34) {
                                String z5 = gVar.z();
                                this.a |= 8;
                                this.n = z5;
                            } else if (B == 40) {
                                this.a |= 16;
                                this.o = gVar.w();
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
                return new PushNotificationInteractionV1();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (PushNotificationInteractionV1.class) {
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
            i2 += CodedOutputStream.p(4, this.n);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.l(5, this.o);
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
        this.unknownFields.l(codedOutputStream);
    }
}
