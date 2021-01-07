package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class UserDecorationPolicy extends GeneratedMessageLite<UserDecorationPolicy, b> implements Object {
    private static final UserDecorationPolicy o;
    private static volatile x<UserDecorationPolicy> p;
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean f;
    private boolean n;

    public static final class b extends GeneratedMessageLite.b<UserDecorationPolicy, b> implements Object {
        private b() {
            super(UserDecorationPolicy.o);
        }
    }

    static {
        UserDecorationPolicy userDecorationPolicy = new UserDecorationPolicy();
        o = userDecorationPolicy;
        userDecorationPolicy.makeImmutable();
    }

    private UserDecorationPolicy() {
    }

    public static x<UserDecorationPolicy> parser() {
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
                UserDecorationPolicy userDecorationPolicy = (UserDecorationPolicy) obj2;
                boolean z = this.a;
                boolean z2 = userDecorationPolicy.a;
                this.a = hVar.f(z, z, z2, z2);
                boolean z3 = this.b;
                boolean z4 = userDecorationPolicy.b;
                this.b = hVar.f(z3, z3, z4, z4);
                boolean z5 = this.c;
                boolean z6 = userDecorationPolicy.c;
                this.c = hVar.f(z5, z5, z6, z6);
                boolean z7 = this.f;
                boolean z8 = userDecorationPolicy.f;
                this.f = hVar.f(z7, z7, z8, z8);
                boolean z9 = this.n;
                boolean z10 = userDecorationPolicy.n;
                this.n = hVar.f(z9, z9, z10, z10);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z11 = false;
                while (!z11) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a = gVar.h();
                            } else if (B == 16) {
                                this.b = gVar.h();
                            } else if (B == 24) {
                                this.c = gVar.h();
                            } else if (B == 32) {
                                this.f = gVar.h();
                            } else if (B == 40) {
                                this.n = gVar.h();
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z11 = true;
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
                return new UserDecorationPolicy();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (UserDecorationPolicy.class) {
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
        boolean z = this.a;
        if (z) {
            i2 = 0 + CodedOutputStream.d(1, z);
        }
        boolean z2 = this.b;
        if (z2) {
            i2 += CodedOutputStream.d(2, z2);
        }
        boolean z3 = this.c;
        if (z3) {
            i2 += CodedOutputStream.d(3, z3);
        }
        boolean z4 = this.f;
        if (z4) {
            i2 += CodedOutputStream.d(4, z4);
        }
        boolean z5 = this.n;
        if (z5) {
            i2 += CodedOutputStream.d(5, z5);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        boolean z = this.a;
        if (z) {
            codedOutputStream.A(1, z);
        }
        boolean z2 = this.b;
        if (z2) {
            codedOutputStream.A(2, z2);
        }
        boolean z3 = this.c;
        if (z3) {
            codedOutputStream.A(3, z3);
        }
        boolean z4 = this.f;
        if (z4) {
            codedOutputStream.A(4, z4);
        }
        boolean z5 = this.n;
        if (z5) {
            codedOutputStream.A(5, z5);
        }
    }
}
