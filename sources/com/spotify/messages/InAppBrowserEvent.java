package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class InAppBrowserEvent extends GeneratedMessageLite<InAppBrowserEvent, b> implements Object {
    private static final InAppBrowserEvent n;
    private static volatile x<InAppBrowserEvent> o;
    private int a;
    private String b = "";
    private long c;
    private String f = "";

    public static final class b extends GeneratedMessageLite.b<InAppBrowserEvent, b> implements Object {
        public String m() {
            return ((InAppBrowserEvent) this.instance).m();
        }

        public b n(String str) {
            copyOnWrite();
            InAppBrowserEvent.l((InAppBrowserEvent) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            InAppBrowserEvent.h((InAppBrowserEvent) this.instance, str);
            return this;
        }

        public b p(long j) {
            copyOnWrite();
            InAppBrowserEvent.i((InAppBrowserEvent) this.instance, j);
            return this;
        }

        private b() {
            super(InAppBrowserEvent.n);
        }
    }

    static {
        InAppBrowserEvent inAppBrowserEvent = new InAppBrowserEvent();
        n = inAppBrowserEvent;
        inAppBrowserEvent.makeImmutable();
    }

    private InAppBrowserEvent() {
    }

    static void h(InAppBrowserEvent inAppBrowserEvent, String str) {
        inAppBrowserEvent.getClass();
        str.getClass();
        inAppBrowserEvent.a |= 1;
        inAppBrowserEvent.b = str;
    }

    static void i(InAppBrowserEvent inAppBrowserEvent, long j) {
        inAppBrowserEvent.a |= 2;
        inAppBrowserEvent.c = j;
    }

    static void l(InAppBrowserEvent inAppBrowserEvent, String str) {
        inAppBrowserEvent.getClass();
        str.getClass();
        inAppBrowserEvent.a |= 4;
        inAppBrowserEvent.f = str;
    }

    public static b n() {
        return (b) n.toBuilder();
    }

    public static x<InAppBrowserEvent> parser() {
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
                InAppBrowserEvent inAppBrowserEvent = (InAppBrowserEvent) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (inAppBrowserEvent.a & 1) == 1, inAppBrowserEvent.b);
                this.c = hVar.s((this.a & 2) == 2, this.c, (inAppBrowserEvent.a & 2) == 2, inAppBrowserEvent.c);
                boolean z2 = (this.a & 4) == 4;
                String str = this.f;
                if ((inAppBrowserEvent.a & 4) == 4) {
                    z = true;
                }
                this.f = hVar.n(z2, str, z, inAppBrowserEvent.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= inAppBrowserEvent.a;
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
                                this.c = gVar.w();
                            } else if (B == 26) {
                                String z4 = gVar.z();
                                this.a |= 4;
                                this.f = z4;
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
                return new InAppBrowserEvent();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (InAppBrowserEvent.class) {
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
            i2 += CodedOutputStream.l(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.p(3, this.f);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public String m() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.U(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.P(3, this.f);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
