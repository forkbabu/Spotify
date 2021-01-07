package com.spotify.music.libs.profile.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class IdentityV3$Image extends GeneratedMessageLite<IdentityV3$Image, a> implements Object {
    private static final IdentityV3$Image f;
    private static volatile x<IdentityV3$Image> n;
    private int a;
    private int b;
    private String c = "";

    public static final class a extends GeneratedMessageLite.b<IdentityV3$Image, a> implements Object {
        private a() {
            super(IdentityV3$Image.f);
        }
    }

    static {
        IdentityV3$Image identityV3$Image = new IdentityV3$Image();
        f = identityV3$Image;
        identityV3$Image.makeImmutable();
    }

    private IdentityV3$Image() {
    }

    public static x<IdentityV3$Image> parser() {
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
                IdentityV3$Image identityV3$Image = (IdentityV3$Image) obj2;
                int i = this.a;
                boolean z2 = i != 0;
                int i2 = identityV3$Image.a;
                this.a = hVar.m(z2, i, i2 != 0, i2);
                int i3 = this.b;
                boolean z3 = i3 != 0;
                int i4 = identityV3$Image.b;
                if (i4 != 0) {
                    z = true;
                }
                this.b = hVar.m(z3, i3, z, i4);
                this.c = hVar.n(!this.c.isEmpty(), this.c, true ^ identityV3$Image.c.isEmpty(), identityV3$Image.c);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a = gVar.u();
                            } else if (B == 16) {
                                this.b = gVar.u();
                            } else if (B == 26) {
                                this.c = gVar.A();
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
                return new IdentityV3$Image();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (IdentityV3$Image.class) {
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
        int i3 = this.a;
        if (i3 != 0) {
            i2 = 0 + CodedOutputStream.j(1, i3);
        }
        int i4 = this.b;
        if (i4 != 0) {
            i2 += CodedOutputStream.j(2, i4);
        }
        if (!this.c.isEmpty()) {
            i2 += CodedOutputStream.p(3, this.c);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public int h() {
        return this.b;
    }

    public int i() {
        return this.a;
    }

    public String l() {
        return this.c;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        int i = this.a;
        if (i != 0) {
            codedOutputStream.K(1, i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            codedOutputStream.K(2, i2);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(3, this.c);
        }
    }
}
