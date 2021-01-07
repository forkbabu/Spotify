package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.t;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.Map;

public final class ZeroFrictionFeatureFlagExposureNonAuth extends GeneratedMessageLite<ZeroFrictionFeatureFlagExposureNonAuth, b> implements Object {
    private static final ZeroFrictionFeatureFlagExposureNonAuth o;
    private static volatile x<ZeroFrictionFeatureFlagExposureNonAuth> p;
    private int a;
    private String b = "";
    private String c = "";
    private MapFieldLite<String, Boolean> f = MapFieldLite.d();
    private boolean n;

    public static final class b extends GeneratedMessageLite.b<ZeroFrictionFeatureFlagExposureNonAuth, b> implements Object {
        public b m(Map<String, Boolean> map) {
            copyOnWrite();
            ((MapFieldLite) ZeroFrictionFeatureFlagExposureNonAuth.l((ZeroFrictionFeatureFlagExposureNonAuth) this.instance)).putAll(map);
            return this;
        }

        public b n(boolean z) {
            copyOnWrite();
            ZeroFrictionFeatureFlagExposureNonAuth.m((ZeroFrictionFeatureFlagExposureNonAuth) this.instance, z);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            ZeroFrictionFeatureFlagExposureNonAuth.i((ZeroFrictionFeatureFlagExposureNonAuth) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            ZeroFrictionFeatureFlagExposureNonAuth.h((ZeroFrictionFeatureFlagExposureNonAuth) this.instance, str);
            return this;
        }

        private b() {
            super(ZeroFrictionFeatureFlagExposureNonAuth.o);
        }
    }

    private static final class c {
        static final t<String, Boolean> a = t.b(WireFormat.FieldType.STRING, "", WireFormat.FieldType.BOOL, Boolean.FALSE);
    }

    static {
        ZeroFrictionFeatureFlagExposureNonAuth zeroFrictionFeatureFlagExposureNonAuth = new ZeroFrictionFeatureFlagExposureNonAuth();
        o = zeroFrictionFeatureFlagExposureNonAuth;
        zeroFrictionFeatureFlagExposureNonAuth.makeImmutable();
    }

    private ZeroFrictionFeatureFlagExposureNonAuth() {
    }

    static void h(ZeroFrictionFeatureFlagExposureNonAuth zeroFrictionFeatureFlagExposureNonAuth, String str) {
        zeroFrictionFeatureFlagExposureNonAuth.getClass();
        str.getClass();
        zeroFrictionFeatureFlagExposureNonAuth.a |= 1;
        zeroFrictionFeatureFlagExposureNonAuth.b = str;
    }

    static void i(ZeroFrictionFeatureFlagExposureNonAuth zeroFrictionFeatureFlagExposureNonAuth, String str) {
        zeroFrictionFeatureFlagExposureNonAuth.getClass();
        str.getClass();
        zeroFrictionFeatureFlagExposureNonAuth.a |= 2;
        zeroFrictionFeatureFlagExposureNonAuth.c = str;
    }

    static Map l(ZeroFrictionFeatureFlagExposureNonAuth zeroFrictionFeatureFlagExposureNonAuth) {
        if (!zeroFrictionFeatureFlagExposureNonAuth.f.f()) {
            zeroFrictionFeatureFlagExposureNonAuth.f = zeroFrictionFeatureFlagExposureNonAuth.f.k();
        }
        return zeroFrictionFeatureFlagExposureNonAuth.f;
    }

    static void m(ZeroFrictionFeatureFlagExposureNonAuth zeroFrictionFeatureFlagExposureNonAuth, boolean z) {
        zeroFrictionFeatureFlagExposureNonAuth.a |= 4;
        zeroFrictionFeatureFlagExposureNonAuth.n = z;
    }

    public static b n() {
        return (b) o.toBuilder();
    }

    public static x<ZeroFrictionFeatureFlagExposureNonAuth> parser() {
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
                ZeroFrictionFeatureFlagExposureNonAuth zeroFrictionFeatureFlagExposureNonAuth = (ZeroFrictionFeatureFlagExposureNonAuth) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (zeroFrictionFeatureFlagExposureNonAuth.a & 1) == 1, zeroFrictionFeatureFlagExposureNonAuth.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (zeroFrictionFeatureFlagExposureNonAuth.a & 2) == 2, zeroFrictionFeatureFlagExposureNonAuth.c);
                this.f = hVar.c(this.f, zeroFrictionFeatureFlagExposureNonAuth.f);
                boolean z2 = (this.a & 4) == 4;
                boolean z3 = this.n;
                if ((zeroFrictionFeatureFlagExposureNonAuth.a & 4) == 4) {
                    z = true;
                }
                this.n = hVar.f(z2, z3, z, zeroFrictionFeatureFlagExposureNonAuth.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= zeroFrictionFeatureFlagExposureNonAuth.a;
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
                                String z4 = gVar.z();
                                this.a |= 1;
                                this.b = z4;
                            } else if (B == 18) {
                                String z5 = gVar.z();
                                this.a |= 2;
                                this.c = z5;
                            } else if (B == 26) {
                                if (!this.f.f()) {
                                    this.f = this.f.k();
                                }
                                c.a.d(this.f, gVar, kVar);
                            } else if (B == 32) {
                                this.a |= 4;
                                this.n = gVar.h();
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
                this.f.g();
                return null;
            case 4:
                return new ZeroFrictionFeatureFlagExposureNonAuth();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (ZeroFrictionFeatureFlagExposureNonAuth.class) {
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
        for (Map.Entry<String, Boolean> entry : this.f.entrySet()) {
            i2 = je.j1(entry, c.a, 3, entry.getKey(), i2);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.d(4, this.n);
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
        for (Map.Entry<String, Boolean> entry : this.f.entrySet()) {
            c.a.e(codedOutputStream, 3, entry.getKey(), entry.getValue());
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.A(4, this.n);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
