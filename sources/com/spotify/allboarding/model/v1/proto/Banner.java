package com.spotify.allboarding.model.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.allboarding.model.v1.proto.Logging;
import java.io.IOException;

public final class Banner extends GeneratedMessageLite<Banner, b> implements Object {
    private static final Banner o;
    private static volatile x<Banner> p;
    private String a = "";
    private String b = "";
    private boolean c;
    private String f = "";
    private Logging n;

    public static final class b extends GeneratedMessageLite.b<Banner, b> implements Object {
        private b() {
            super(Banner.o);
        }
    }

    static {
        Banner banner = new Banner();
        o = banner;
        banner.makeImmutable();
    }

    private Banner() {
    }

    public static Banner h() {
        return o;
    }

    public static x<Banner> parser() {
        return o.getParserForType();
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
                Banner banner = (Banner) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !banner.a.isEmpty(), banner.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !banner.b.isEmpty(), banner.b);
                boolean z = this.c;
                boolean z2 = banner.c;
                this.c = hVar.f(z, z, z2, z2);
                this.f = hVar.n(!this.f.isEmpty(), this.f, true ^ banner.f.isEmpty(), banner.f);
                this.n = (Logging) hVar.i(this.n, banner.n);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                this.a = gVar.A();
                            } else if (B == 18) {
                                this.b = gVar.A();
                            } else if (B == 24) {
                                this.c = gVar.h();
                            } else if (B == 34) {
                                this.f = gVar.A();
                            } else if (B == 42) {
                                Logging logging = this.n;
                                Logging.b bVar = logging != null ? (Logging.b) logging.toBuilder() : null;
                                Logging logging2 = (Logging) gVar.o(Logging.parser(), kVar);
                                this.n = logging2;
                                if (bVar != null) {
                                    bVar.mergeFrom((Logging.b) logging2);
                                    this.n = (Logging) bVar.buildPartial();
                                }
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z3 = true;
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
                return new Banner();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (Banner.class) {
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
        boolean z = this.c;
        if (z) {
            i2 += CodedOutputStream.d(3, z);
        }
        if (!this.f.isEmpty()) {
            i2 += CodedOutputStream.p(4, this.f);
        }
        if (this.n != null) {
            i2 += CodedOutputStream.n(5, l());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String i() {
        return this.f;
    }

    public Logging l() {
        Logging logging = this.n;
        return logging == null ? Logging.i() : logging;
    }

    public boolean m() {
        return this.c;
    }

    public String n() {
        return this.b;
    }

    public String o() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        if (!this.b.isEmpty()) {
            codedOutputStream.P(2, this.b);
        }
        boolean z = this.c;
        if (z) {
            codedOutputStream.A(3, z);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(4, this.f);
        }
        if (this.n != null) {
            codedOutputStream.M(5, l());
        }
    }
}
