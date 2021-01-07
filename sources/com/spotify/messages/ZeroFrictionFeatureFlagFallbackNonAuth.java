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

public final class ZeroFrictionFeatureFlagFallbackNonAuth extends GeneratedMessageLite<ZeroFrictionFeatureFlagFallbackNonAuth, b> implements Object {
    private static final ZeroFrictionFeatureFlagFallbackNonAuth n;
    private static volatile x<ZeroFrictionFeatureFlagFallbackNonAuth> o;
    private int a;
    private String b = "";
    private String c = "";
    private MapFieldLite<String, Boolean> f = MapFieldLite.d();

    public static final class b extends GeneratedMessageLite.b<ZeroFrictionFeatureFlagFallbackNonAuth, b> implements Object {
        public b m(Map<String, Boolean> map) {
            copyOnWrite();
            ((MapFieldLite) ZeroFrictionFeatureFlagFallbackNonAuth.l((ZeroFrictionFeatureFlagFallbackNonAuth) this.instance)).putAll(map);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            ZeroFrictionFeatureFlagFallbackNonAuth.i((ZeroFrictionFeatureFlagFallbackNonAuth) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            ZeroFrictionFeatureFlagFallbackNonAuth.h((ZeroFrictionFeatureFlagFallbackNonAuth) this.instance, str);
            return this;
        }

        private b() {
            super(ZeroFrictionFeatureFlagFallbackNonAuth.n);
        }
    }

    private static final class c {
        static final t<String, Boolean> a = t.b(WireFormat.FieldType.STRING, "", WireFormat.FieldType.BOOL, Boolean.FALSE);
    }

    static {
        ZeroFrictionFeatureFlagFallbackNonAuth zeroFrictionFeatureFlagFallbackNonAuth = new ZeroFrictionFeatureFlagFallbackNonAuth();
        n = zeroFrictionFeatureFlagFallbackNonAuth;
        zeroFrictionFeatureFlagFallbackNonAuth.makeImmutable();
    }

    private ZeroFrictionFeatureFlagFallbackNonAuth() {
    }

    static void h(ZeroFrictionFeatureFlagFallbackNonAuth zeroFrictionFeatureFlagFallbackNonAuth, String str) {
        zeroFrictionFeatureFlagFallbackNonAuth.getClass();
        str.getClass();
        zeroFrictionFeatureFlagFallbackNonAuth.a |= 1;
        zeroFrictionFeatureFlagFallbackNonAuth.b = str;
    }

    static void i(ZeroFrictionFeatureFlagFallbackNonAuth zeroFrictionFeatureFlagFallbackNonAuth, String str) {
        zeroFrictionFeatureFlagFallbackNonAuth.getClass();
        str.getClass();
        zeroFrictionFeatureFlagFallbackNonAuth.a |= 2;
        zeroFrictionFeatureFlagFallbackNonAuth.c = str;
    }

    static Map l(ZeroFrictionFeatureFlagFallbackNonAuth zeroFrictionFeatureFlagFallbackNonAuth) {
        if (!zeroFrictionFeatureFlagFallbackNonAuth.f.f()) {
            zeroFrictionFeatureFlagFallbackNonAuth.f = zeroFrictionFeatureFlagFallbackNonAuth.f.k();
        }
        return zeroFrictionFeatureFlagFallbackNonAuth.f;
    }

    public static b m() {
        return (b) n.toBuilder();
    }

    public static x<ZeroFrictionFeatureFlagFallbackNonAuth> parser() {
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
                ZeroFrictionFeatureFlagFallbackNonAuth zeroFrictionFeatureFlagFallbackNonAuth = (ZeroFrictionFeatureFlagFallbackNonAuth) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (zeroFrictionFeatureFlagFallbackNonAuth.a & 1) == 1, zeroFrictionFeatureFlagFallbackNonAuth.b);
                boolean z2 = (this.a & 2) == 2;
                String str = this.c;
                if ((zeroFrictionFeatureFlagFallbackNonAuth.a & 2) == 2) {
                    z = true;
                }
                this.c = hVar.n(z2, str, z, zeroFrictionFeatureFlagFallbackNonAuth.c);
                this.f = hVar.c(this.f, zeroFrictionFeatureFlagFallbackNonAuth.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= zeroFrictionFeatureFlagFallbackNonAuth.a;
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
                                if (!this.f.f()) {
                                    this.f = this.f.k();
                                }
                                c.a.d(this.f, gVar, kVar);
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
                return new ZeroFrictionFeatureFlagFallbackNonAuth();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (ZeroFrictionFeatureFlagFallbackNonAuth.class) {
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
        for (Map.Entry<String, Boolean> entry : this.f.entrySet()) {
            i2 = je.j1(entry, c.a, 3, entry.getKey(), i2);
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
        this.unknownFields.l(codedOutputStream);
    }
}
