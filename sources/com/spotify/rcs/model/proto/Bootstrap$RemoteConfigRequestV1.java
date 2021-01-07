package com.spotify.rcs.model.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class Bootstrap$RemoteConfigRequestV1 extends GeneratedMessageLite<Bootstrap$RemoteConfigRequestV1, a> implements Object {
    private static final Bootstrap$RemoteConfigRequestV1 o;
    private static volatile x<Bootstrap$RemoteConfigRequestV1> p;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private String n = "";

    public static final class a extends GeneratedMessageLite.b<Bootstrap$RemoteConfigRequestV1, a> implements Object {
        public a m(String str) {
            copyOnWrite();
            Bootstrap$RemoteConfigRequestV1.n((Bootstrap$RemoteConfigRequestV1) this.instance, str);
            return this;
        }

        public a n(String str) {
            copyOnWrite();
            Bootstrap$RemoteConfigRequestV1.m((Bootstrap$RemoteConfigRequestV1) this.instance, str);
            return this;
        }

        public a o(Platform platform) {
            copyOnWrite();
            Bootstrap$RemoteConfigRequestV1.h((Bootstrap$RemoteConfigRequestV1) this.instance, platform);
            return this;
        }

        public a p(String str) {
            copyOnWrite();
            Bootstrap$RemoteConfigRequestV1.l((Bootstrap$RemoteConfigRequestV1) this.instance, str);
            return this;
        }

        public a q(String str) {
            copyOnWrite();
            Bootstrap$RemoteConfigRequestV1.i((Bootstrap$RemoteConfigRequestV1) this.instance, str);
            return this;
        }

        private a() {
            super(Bootstrap$RemoteConfigRequestV1.o);
        }
    }

    static {
        Bootstrap$RemoteConfigRequestV1 bootstrap$RemoteConfigRequestV1 = new Bootstrap$RemoteConfigRequestV1();
        o = bootstrap$RemoteConfigRequestV1;
        bootstrap$RemoteConfigRequestV1.makeImmutable();
    }

    private Bootstrap$RemoteConfigRequestV1() {
    }

    static void h(Bootstrap$RemoteConfigRequestV1 bootstrap$RemoteConfigRequestV1, Platform platform) {
        bootstrap$RemoteConfigRequestV1.getClass();
        platform.getClass();
        bootstrap$RemoteConfigRequestV1.a = platform.getNumber();
    }

    static void i(Bootstrap$RemoteConfigRequestV1 bootstrap$RemoteConfigRequestV1, String str) {
        bootstrap$RemoteConfigRequestV1.getClass();
        str.getClass();
        bootstrap$RemoteConfigRequestV1.b = str;
    }

    static void l(Bootstrap$RemoteConfigRequestV1 bootstrap$RemoteConfigRequestV1, String str) {
        bootstrap$RemoteConfigRequestV1.getClass();
        str.getClass();
        bootstrap$RemoteConfigRequestV1.c = str;
    }

    static void m(Bootstrap$RemoteConfigRequestV1 bootstrap$RemoteConfigRequestV1, String str) {
        bootstrap$RemoteConfigRequestV1.getClass();
        str.getClass();
        bootstrap$RemoteConfigRequestV1.f = str;
    }

    static void n(Bootstrap$RemoteConfigRequestV1 bootstrap$RemoteConfigRequestV1, String str) {
        bootstrap$RemoteConfigRequestV1.getClass();
        str.getClass();
        bootstrap$RemoteConfigRequestV1.n = str;
    }

    public static a o() {
        return (a) o.toBuilder();
    }

    public static x<Bootstrap$RemoteConfigRequestV1> parser() {
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
                Bootstrap$RemoteConfigRequestV1 bootstrap$RemoteConfigRequestV1 = (Bootstrap$RemoteConfigRequestV1) obj2;
                int i = this.a;
                boolean z2 = i != 0;
                int i2 = bootstrap$RemoteConfigRequestV1.a;
                if (i2 != 0) {
                    z = true;
                }
                this.a = hVar.m(z2, i, z, i2);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !bootstrap$RemoteConfigRequestV1.b.isEmpty(), bootstrap$RemoteConfigRequestV1.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !bootstrap$RemoteConfigRequestV1.c.isEmpty(), bootstrap$RemoteConfigRequestV1.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !bootstrap$RemoteConfigRequestV1.f.isEmpty(), bootstrap$RemoteConfigRequestV1.f);
                this.n = hVar.n(!this.n.isEmpty(), this.n, true ^ bootstrap$RemoteConfigRequestV1.n.isEmpty(), bootstrap$RemoteConfigRequestV1.n);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 16) {
                                this.a = gVar.u();
                            } else if (B == 26) {
                                this.b = gVar.A();
                            } else if (B == 34) {
                                this.c = gVar.A();
                            } else if (B == 42) {
                                this.f = gVar.A();
                            } else if (B == 50) {
                                this.n = gVar.A();
                            } else if (!gVar.F(B)) {
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
                return new Bootstrap$RemoteConfigRequestV1();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (Bootstrap$RemoteConfigRequestV1.class) {
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
        if (this.a != Platform.UNKNOWN.getNumber()) {
            i2 = 0 + CodedOutputStream.h(2, this.a);
        }
        if (!this.b.isEmpty()) {
            i2 += CodedOutputStream.p(3, this.b);
        }
        if (!this.c.isEmpty()) {
            i2 += CodedOutputStream.p(4, this.c);
        }
        if (!this.f.isEmpty()) {
            i2 += CodedOutputStream.p(5, this.f);
        }
        if (!this.n.isEmpty()) {
            i2 += CodedOutputStream.p(6, this.n);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a != Platform.UNKNOWN.getNumber()) {
            codedOutputStream.K(2, this.a);
        }
        if (!this.b.isEmpty()) {
            codedOutputStream.P(3, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(4, this.c);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(5, this.f);
        }
        if (!this.n.isEmpty()) {
            codedOutputStream.P(6, this.n);
        }
    }
}
