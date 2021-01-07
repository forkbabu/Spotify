package com.spotify.share.base.linkgeneration.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class UtmParameters extends GeneratedMessageLite<UtmParameters, b> implements Object {
    private static final UtmParameters o;
    private static volatile x<UtmParameters> p;
    private String a = "";
    private String b = "";
    private String c = "";
    private String f = "";
    private String n = "";

    public static final class b extends GeneratedMessageLite.b<UtmParameters, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            UtmParameters.h((UtmParameters) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            UtmParameters.l((UtmParameters) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            UtmParameters.n((UtmParameters) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            UtmParameters.m((UtmParameters) this.instance, str);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            UtmParameters.i((UtmParameters) this.instance, str);
            return this;
        }

        private b() {
            super(UtmParameters.o);
        }
    }

    static {
        UtmParameters utmParameters = new UtmParameters();
        o = utmParameters;
        utmParameters.makeImmutable();
    }

    private UtmParameters() {
    }

    static void h(UtmParameters utmParameters, String str) {
        utmParameters.getClass();
        str.getClass();
        utmParameters.a = str;
    }

    static void i(UtmParameters utmParameters, String str) {
        utmParameters.getClass();
        str.getClass();
        utmParameters.f = str;
    }

    static void l(UtmParameters utmParameters, String str) {
        utmParameters.getClass();
        str.getClass();
        utmParameters.n = str;
    }

    static void m(UtmParameters utmParameters, String str) {
        utmParameters.getClass();
        str.getClass();
        utmParameters.b = str;
    }

    static void n(UtmParameters utmParameters, String str) {
        utmParameters.getClass();
        str.getClass();
        utmParameters.c = str;
    }

    public static x<UtmParameters> parser() {
        return o.getParserForType();
    }

    public static b t() {
        return (b) o.toBuilder();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                UtmParameters utmParameters = (UtmParameters) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !utmParameters.a.isEmpty(), utmParameters.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !utmParameters.b.isEmpty(), utmParameters.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !utmParameters.c.isEmpty(), utmParameters.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !utmParameters.f.isEmpty(), utmParameters.f);
                this.n = hVar.n(!this.n.isEmpty(), this.n, true ^ utmParameters.n.isEmpty(), utmParameters.n);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                this.a = gVar.A();
                            } else if (B == 18) {
                                this.b = gVar.A();
                            } else if (B == 26) {
                                this.c = gVar.A();
                            } else if (B == 34) {
                                this.f = gVar.A();
                            } else if (B == 42) {
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
                return new UtmParameters();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (UtmParameters.class) {
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
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
        }
        if (!this.b.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.b);
        }
        if (!this.c.isEmpty()) {
            i2 += CodedOutputStream.p(3, this.c);
        }
        if (!this.f.isEmpty()) {
            i2 += CodedOutputStream.p(4, this.f);
        }
        if (!this.n.isEmpty()) {
            i2 += CodedOutputStream.p(5, this.n);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String o() {
        return this.a;
    }

    public String p() {
        return this.n;
    }

    public String q() {
        return this.c;
    }

    public String r() {
        return this.b;
    }

    public String s() {
        return this.f;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        if (!this.b.isEmpty()) {
            codedOutputStream.P(2, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(3, this.c);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(4, this.f);
        }
        if (!this.n.isEmpty()) {
            codedOutputStream.P(5, this.n);
        }
    }
}
