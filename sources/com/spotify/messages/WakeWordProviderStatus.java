package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class WakeWordProviderStatus extends GeneratedMessageLite<WakeWordProviderStatus, b> implements Object {
    private static final WakeWordProviderStatus o;
    private static volatile x<WakeWordProviderStatus> p;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private String n = "";

    public static final class b extends GeneratedMessageLite.b<WakeWordProviderStatus, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            WakeWordProviderStatus.l((WakeWordProviderStatus) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            WakeWordProviderStatus.i((WakeWordProviderStatus) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            WakeWordProviderStatus.m((WakeWordProviderStatus) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            WakeWordProviderStatus.h((WakeWordProviderStatus) this.instance, str);
            return this;
        }

        private b() {
            super(WakeWordProviderStatus.o);
        }
    }

    static {
        WakeWordProviderStatus wakeWordProviderStatus = new WakeWordProviderStatus();
        o = wakeWordProviderStatus;
        wakeWordProviderStatus.makeImmutable();
    }

    private WakeWordProviderStatus() {
    }

    static void h(WakeWordProviderStatus wakeWordProviderStatus, String str) {
        wakeWordProviderStatus.getClass();
        str.getClass();
        wakeWordProviderStatus.a |= 1;
        wakeWordProviderStatus.b = str;
    }

    static void i(WakeWordProviderStatus wakeWordProviderStatus, String str) {
        wakeWordProviderStatus.getClass();
        str.getClass();
        wakeWordProviderStatus.a |= 8;
        wakeWordProviderStatus.n = str;
    }

    static void l(WakeWordProviderStatus wakeWordProviderStatus, String str) {
        wakeWordProviderStatus.getClass();
        str.getClass();
        wakeWordProviderStatus.a |= 2;
        wakeWordProviderStatus.c = str;
    }

    static void m(WakeWordProviderStatus wakeWordProviderStatus, String str) {
        wakeWordProviderStatus.getClass();
        str.getClass();
        wakeWordProviderStatus.a |= 4;
        wakeWordProviderStatus.f = str;
    }

    public static b n() {
        return (b) o.toBuilder();
    }

    public static x<WakeWordProviderStatus> parser() {
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
                WakeWordProviderStatus wakeWordProviderStatus = (WakeWordProviderStatus) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (wakeWordProviderStatus.a & 1) == 1, wakeWordProviderStatus.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (wakeWordProviderStatus.a & 2) == 2, wakeWordProviderStatus.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (wakeWordProviderStatus.a & 4) == 4, wakeWordProviderStatus.f);
                boolean z2 = (this.a & 8) == 8;
                String str = this.n;
                if ((wakeWordProviderStatus.a & 8) == 8) {
                    z = true;
                }
                this.n = hVar.n(z2, str, z, wakeWordProviderStatus.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= wakeWordProviderStatus.a;
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
                return new WakeWordProviderStatus();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (WakeWordProviderStatus.class) {
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
            codedOutputStream.P(2, this.c);
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
