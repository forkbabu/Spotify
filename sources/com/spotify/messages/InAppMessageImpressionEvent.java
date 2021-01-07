package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class InAppMessageImpressionEvent extends GeneratedMessageLite<InAppMessageImpressionEvent, b> implements Object {
    private static final InAppMessageImpressionEvent n;
    private static volatile x<InAppMessageImpressionEvent> o;
    private int a;
    private String b = "";
    private String c = "";
    private long f;

    public static final class b extends GeneratedMessageLite.b<InAppMessageImpressionEvent, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            InAppMessageImpressionEvent.h((InAppMessageImpressionEvent) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            InAppMessageImpressionEvent.i((InAppMessageImpressionEvent) this.instance, str);
            return this;
        }

        private b() {
            super(InAppMessageImpressionEvent.n);
        }
    }

    static {
        InAppMessageImpressionEvent inAppMessageImpressionEvent = new InAppMessageImpressionEvent();
        n = inAppMessageImpressionEvent;
        inAppMessageImpressionEvent.makeImmutable();
    }

    private InAppMessageImpressionEvent() {
    }

    static void h(InAppMessageImpressionEvent inAppMessageImpressionEvent, String str) {
        inAppMessageImpressionEvent.getClass();
        str.getClass();
        inAppMessageImpressionEvent.a |= 1;
        inAppMessageImpressionEvent.b = str;
    }

    static void i(InAppMessageImpressionEvent inAppMessageImpressionEvent, String str) {
        inAppMessageImpressionEvent.getClass();
        str.getClass();
        inAppMessageImpressionEvent.a |= 2;
        inAppMessageImpressionEvent.c = str;
    }

    public static b l() {
        return (b) n.toBuilder();
    }

    public static x<InAppMessageImpressionEvent> parser() {
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
                InAppMessageImpressionEvent inAppMessageImpressionEvent = (InAppMessageImpressionEvent) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (inAppMessageImpressionEvent.a & 1) == 1, inAppMessageImpressionEvent.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (inAppMessageImpressionEvent.a & 2) == 2, inAppMessageImpressionEvent.c);
                this.f = hVar.s((this.a & 4) == 4, this.f, (inAppMessageImpressionEvent.a & 4) == 4, inAppMessageImpressionEvent.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= inAppMessageImpressionEvent.a;
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
                            } else if (B == 24) {
                                this.a |= 4;
                                this.f = gVar.w();
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
                return new InAppMessageImpressionEvent();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (InAppMessageImpressionEvent.class) {
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
            i2 += CodedOutputStream.p(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.l(3, this.f);
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
        this.unknownFields.l(codedOutputStream);
    }
}
