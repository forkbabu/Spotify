package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class PushTokenRegistrationErrorV1 extends GeneratedMessageLite<PushTokenRegistrationErrorV1, b> implements Object {
    private static final PushTokenRegistrationErrorV1 f;
    private static volatile x<PushTokenRegistrationErrorV1> n;
    private int a;
    private long b;
    private String c = "";

    public static final class b extends GeneratedMessageLite.b<PushTokenRegistrationErrorV1, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            PushTokenRegistrationErrorV1.i((PushTokenRegistrationErrorV1) this.instance, str);
            return this;
        }

        public b n(long j) {
            copyOnWrite();
            PushTokenRegistrationErrorV1.h((PushTokenRegistrationErrorV1) this.instance, j);
            return this;
        }

        private b() {
            super(PushTokenRegistrationErrorV1.f);
        }
    }

    static {
        PushTokenRegistrationErrorV1 pushTokenRegistrationErrorV1 = new PushTokenRegistrationErrorV1();
        f = pushTokenRegistrationErrorV1;
        pushTokenRegistrationErrorV1.makeImmutable();
    }

    private PushTokenRegistrationErrorV1() {
    }

    static void h(PushTokenRegistrationErrorV1 pushTokenRegistrationErrorV1, long j) {
        pushTokenRegistrationErrorV1.a |= 1;
        pushTokenRegistrationErrorV1.b = j;
    }

    static void i(PushTokenRegistrationErrorV1 pushTokenRegistrationErrorV1, String str) {
        pushTokenRegistrationErrorV1.getClass();
        str.getClass();
        pushTokenRegistrationErrorV1.a |= 2;
        pushTokenRegistrationErrorV1.c = str;
    }

    public static b l() {
        return (b) f.toBuilder();
    }

    public static x<PushTokenRegistrationErrorV1> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PushTokenRegistrationErrorV1 pushTokenRegistrationErrorV1 = (PushTokenRegistrationErrorV1) obj2;
                this.b = hVar.s((this.a & 1) == 1, this.b, (pushTokenRegistrationErrorV1.a & 1) == 1, pushTokenRegistrationErrorV1.b);
                boolean z2 = (this.a & 2) == 2;
                String str = this.c;
                if ((pushTokenRegistrationErrorV1.a & 2) == 2) {
                    z = true;
                }
                this.c = hVar.n(z2, str, z, pushTokenRegistrationErrorV1.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= pushTokenRegistrationErrorV1.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a |= 1;
                                this.b = gVar.w();
                            } else if (B == 18) {
                                String z3 = gVar.z();
                                this.a |= 2;
                                this.c = z3;
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
                return new PushTokenRegistrationErrorV1();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (PushTokenRegistrationErrorV1.class) {
                        if (n == null) {
                            n = new GeneratedMessageLite.c(f);
                        }
                    }
                }
                return n;
            default:
                throw new UnsupportedOperationException();
        }
        return f;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.l(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.p(2, this.c);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.U(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(2, this.c);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
