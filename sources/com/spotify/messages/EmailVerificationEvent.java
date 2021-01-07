package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class EmailVerificationEvent extends GeneratedMessageLite<EmailVerificationEvent, b> implements Object {
    private static final EmailVerificationEvent f;
    private static volatile x<EmailVerificationEvent> n;
    private int a;
    private boolean b;
    private String c = "";

    public static final class b extends GeneratedMessageLite.b<EmailVerificationEvent, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            EmailVerificationEvent.i((EmailVerificationEvent) this.instance, str);
            return this;
        }

        public b n(boolean z) {
            copyOnWrite();
            EmailVerificationEvent.h((EmailVerificationEvent) this.instance, z);
            return this;
        }

        private b() {
            super(EmailVerificationEvent.f);
        }
    }

    static {
        EmailVerificationEvent emailVerificationEvent = new EmailVerificationEvent();
        f = emailVerificationEvent;
        emailVerificationEvent.makeImmutable();
    }

    private EmailVerificationEvent() {
    }

    static void h(EmailVerificationEvent emailVerificationEvent, boolean z) {
        emailVerificationEvent.a |= 1;
        emailVerificationEvent.b = z;
    }

    static void i(EmailVerificationEvent emailVerificationEvent, String str) {
        emailVerificationEvent.getClass();
        str.getClass();
        emailVerificationEvent.a |= 2;
        emailVerificationEvent.c = str;
    }

    public static b l() {
        return (b) f.toBuilder();
    }

    public static x<EmailVerificationEvent> parser() {
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
                EmailVerificationEvent emailVerificationEvent = (EmailVerificationEvent) obj2;
                this.b = hVar.f((this.a & 1) == 1, this.b, (emailVerificationEvent.a & 1) == 1, emailVerificationEvent.b);
                boolean z2 = (this.a & 2) == 2;
                String str = this.c;
                if ((emailVerificationEvent.a & 2) == 2) {
                    z = true;
                }
                this.c = hVar.n(z2, str, z, emailVerificationEvent.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= emailVerificationEvent.a;
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
                                this.b = gVar.h();
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
                return new EmailVerificationEvent();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (EmailVerificationEvent.class) {
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
            i2 = 0 + CodedOutputStream.d(1, this.b);
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
            codedOutputStream.A(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(2, this.c);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
