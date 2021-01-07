package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class InAppMessageBackendRequestErrorEvent extends GeneratedMessageLite<InAppMessageBackendRequestErrorEvent, b> implements Object {
    private static final InAppMessageBackendRequestErrorEvent o;
    private static volatile x<InAppMessageBackendRequestErrorEvent> p;
    private int a;
    private String b = "";
    private int c;
    private String f = "";
    private String n = "";

    public static final class b extends GeneratedMessageLite.b<InAppMessageBackendRequestErrorEvent, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            InAppMessageBackendRequestErrorEvent.l((InAppMessageBackendRequestErrorEvent) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            InAppMessageBackendRequestErrorEvent.h((InAppMessageBackendRequestErrorEvent) this.instance, str);
            return this;
        }

        public b o(int i) {
            copyOnWrite();
            InAppMessageBackendRequestErrorEvent.i((InAppMessageBackendRequestErrorEvent) this.instance, i);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            InAppMessageBackendRequestErrorEvent.m((InAppMessageBackendRequestErrorEvent) this.instance, str);
            return this;
        }

        private b() {
            super(InAppMessageBackendRequestErrorEvent.o);
        }
    }

    static {
        InAppMessageBackendRequestErrorEvent inAppMessageBackendRequestErrorEvent = new InAppMessageBackendRequestErrorEvent();
        o = inAppMessageBackendRequestErrorEvent;
        inAppMessageBackendRequestErrorEvent.makeImmutable();
    }

    private InAppMessageBackendRequestErrorEvent() {
    }

    static void h(InAppMessageBackendRequestErrorEvent inAppMessageBackendRequestErrorEvent, String str) {
        inAppMessageBackendRequestErrorEvent.getClass();
        str.getClass();
        inAppMessageBackendRequestErrorEvent.a |= 1;
        inAppMessageBackendRequestErrorEvent.b = str;
    }

    static void i(InAppMessageBackendRequestErrorEvent inAppMessageBackendRequestErrorEvent, int i) {
        inAppMessageBackendRequestErrorEvent.a |= 2;
        inAppMessageBackendRequestErrorEvent.c = i;
    }

    static void l(InAppMessageBackendRequestErrorEvent inAppMessageBackendRequestErrorEvent, String str) {
        inAppMessageBackendRequestErrorEvent.getClass();
        str.getClass();
        inAppMessageBackendRequestErrorEvent.a |= 4;
        inAppMessageBackendRequestErrorEvent.f = str;
    }

    static void m(InAppMessageBackendRequestErrorEvent inAppMessageBackendRequestErrorEvent, String str) {
        inAppMessageBackendRequestErrorEvent.getClass();
        str.getClass();
        inAppMessageBackendRequestErrorEvent.a |= 8;
        inAppMessageBackendRequestErrorEvent.n = str;
    }

    public static b n() {
        return (b) o.toBuilder();
    }

    public static x<InAppMessageBackendRequestErrorEvent> parser() {
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
                InAppMessageBackendRequestErrorEvent inAppMessageBackendRequestErrorEvent = (InAppMessageBackendRequestErrorEvent) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (inAppMessageBackendRequestErrorEvent.a & 1) == 1, inAppMessageBackendRequestErrorEvent.b);
                this.c = hVar.m((this.a & 2) == 2, this.c, (inAppMessageBackendRequestErrorEvent.a & 2) == 2, inAppMessageBackendRequestErrorEvent.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (inAppMessageBackendRequestErrorEvent.a & 4) == 4, inAppMessageBackendRequestErrorEvent.f);
                boolean z2 = (this.a & 8) == 8;
                String str = this.n;
                if ((inAppMessageBackendRequestErrorEvent.a & 8) == 8) {
                    z = true;
                }
                this.n = hVar.n(z2, str, z, inAppMessageBackendRequestErrorEvent.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= inAppMessageBackendRequestErrorEvent.a;
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
                            } else if (B == 16) {
                                this.a |= 2;
                                this.c = gVar.u();
                            } else if (B == 26) {
                                String z4 = gVar.z();
                                this.a |= 4;
                                this.f = z4;
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
                return new InAppMessageBackendRequestErrorEvent();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (InAppMessageBackendRequestErrorEvent.class) {
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
            i2 += CodedOutputStream.j(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.p(3, this.f);
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
            codedOutputStream.K(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.P(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.P(4, this.n);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
