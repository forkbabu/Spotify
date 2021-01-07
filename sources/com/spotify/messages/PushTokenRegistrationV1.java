package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class PushTokenRegistrationV1 extends GeneratedMessageLite<PushTokenRegistrationV1, b> implements Object {
    private static final PushTokenRegistrationV1 c;
    private static volatile x<PushTokenRegistrationV1> f;
    private int a;
    private long b;

    public static final class b extends GeneratedMessageLite.b<PushTokenRegistrationV1, b> implements Object {
        public b m(long j) {
            copyOnWrite();
            PushTokenRegistrationV1.h((PushTokenRegistrationV1) this.instance, j);
            return this;
        }

        private b() {
            super(PushTokenRegistrationV1.c);
        }
    }

    static {
        PushTokenRegistrationV1 pushTokenRegistrationV1 = new PushTokenRegistrationV1();
        c = pushTokenRegistrationV1;
        pushTokenRegistrationV1.makeImmutable();
    }

    private PushTokenRegistrationV1() {
    }

    static void h(PushTokenRegistrationV1 pushTokenRegistrationV1, long j) {
        pushTokenRegistrationV1.a |= 1;
        pushTokenRegistrationV1.b = j;
    }

    public static b i() {
        return (b) c.toBuilder();
    }

    public static x<PushTokenRegistrationV1> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PushTokenRegistrationV1 pushTokenRegistrationV1 = (PushTokenRegistrationV1) obj2;
                this.b = hVar.s((this.a & 1) == 1, this.b, (pushTokenRegistrationV1.a & 1) == 1, pushTokenRegistrationV1.b);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= pushTokenRegistrationV1.a;
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
                return new PushTokenRegistrationV1();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (PushTokenRegistrationV1.class) {
                        if (f == null) {
                            f = new GeneratedMessageLite.c(c);
                        }
                    }
                }
                return f;
            default:
                throw new UnsupportedOperationException();
        }
        return c;
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
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.U(1, this.b);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
