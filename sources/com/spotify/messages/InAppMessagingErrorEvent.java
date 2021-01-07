package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class InAppMessagingErrorEvent extends GeneratedMessageLite<InAppMessagingErrorEvent, b> implements Object {
    private static final InAppMessagingErrorEvent f;
    private static volatile x<InAppMessagingErrorEvent> n;
    private int a;
    private String b = "";
    private String c = "";

    public static final class b extends GeneratedMessageLite.b<InAppMessagingErrorEvent, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            InAppMessagingErrorEvent.h((InAppMessagingErrorEvent) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            InAppMessagingErrorEvent.i((InAppMessagingErrorEvent) this.instance, str);
            return this;
        }

        private b() {
            super(InAppMessagingErrorEvent.f);
        }
    }

    static {
        InAppMessagingErrorEvent inAppMessagingErrorEvent = new InAppMessagingErrorEvent();
        f = inAppMessagingErrorEvent;
        inAppMessagingErrorEvent.makeImmutable();
    }

    private InAppMessagingErrorEvent() {
    }

    static void h(InAppMessagingErrorEvent inAppMessagingErrorEvent, String str) {
        inAppMessagingErrorEvent.getClass();
        str.getClass();
        inAppMessagingErrorEvent.a |= 1;
        inAppMessagingErrorEvent.b = str;
    }

    static void i(InAppMessagingErrorEvent inAppMessagingErrorEvent, String str) {
        inAppMessagingErrorEvent.getClass();
        str.getClass();
        inAppMessagingErrorEvent.a |= 2;
        inAppMessagingErrorEvent.c = str;
    }

    public static b l() {
        return (b) f.toBuilder();
    }

    public static x<InAppMessagingErrorEvent> parser() {
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
                InAppMessagingErrorEvent inAppMessagingErrorEvent = (InAppMessagingErrorEvent) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (inAppMessagingErrorEvent.a & 1) == 1, inAppMessagingErrorEvent.b);
                boolean z2 = (this.a & 2) == 2;
                String str = this.c;
                if ((inAppMessagingErrorEvent.a & 2) == 2) {
                    z = true;
                }
                this.c = hVar.n(z2, str, z, inAppMessagingErrorEvent.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= inAppMessagingErrorEvent.a;
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
                return new InAppMessagingErrorEvent();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (InAppMessagingErrorEvent.class) {
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
            i2 = 0 + CodedOutputStream.p(1, this.b);
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
            codedOutputStream.P(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(2, this.c);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
