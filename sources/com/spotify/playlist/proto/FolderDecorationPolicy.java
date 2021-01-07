package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class FolderDecorationPolicy extends GeneratedMessageLite<FolderDecorationPolicy, b> implements Object {
    private static final FolderDecorationPolicy s;
    private static volatile x<FolderDecorationPolicy> t;
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean f;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;

    public static final class b extends GeneratedMessageLite.b<FolderDecorationPolicy, b> implements Object {
        private b() {
            super(FolderDecorationPolicy.s);
        }
    }

    static {
        FolderDecorationPolicy folderDecorationPolicy = new FolderDecorationPolicy();
        s = folderDecorationPolicy;
        folderDecorationPolicy.makeImmutable();
    }

    private FolderDecorationPolicy() {
    }

    public static x<FolderDecorationPolicy> parser() {
        return s.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return s;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                FolderDecorationPolicy folderDecorationPolicy = (FolderDecorationPolicy) obj2;
                boolean z = this.a;
                boolean z2 = folderDecorationPolicy.a;
                this.a = hVar.f(z, z, z2, z2);
                boolean z3 = this.b;
                boolean z4 = folderDecorationPolicy.b;
                this.b = hVar.f(z3, z3, z4, z4);
                boolean z5 = this.c;
                boolean z6 = folderDecorationPolicy.c;
                this.c = hVar.f(z5, z5, z6, z6);
                boolean z7 = this.f;
                boolean z8 = folderDecorationPolicy.f;
                this.f = hVar.f(z7, z7, z8, z8);
                boolean z9 = this.n;
                boolean z10 = folderDecorationPolicy.n;
                this.n = hVar.f(z9, z9, z10, z10);
                boolean z11 = this.o;
                boolean z12 = folderDecorationPolicy.o;
                this.o = hVar.f(z11, z11, z12, z12);
                boolean z13 = this.p;
                boolean z14 = folderDecorationPolicy.p;
                this.p = hVar.f(z13, z13, z14, z14);
                boolean z15 = this.q;
                boolean z16 = folderDecorationPolicy.q;
                this.q = hVar.f(z15, z15, z16, z16);
                boolean z17 = this.r;
                boolean z18 = folderDecorationPolicy.r;
                this.r = hVar.f(z17, z17, z18, z18);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z19 = false;
                while (!z19) {
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
                            } else if (B == 48) {
                                this.o = gVar.h();
                            } else if (B == 56) {
                                this.p = gVar.h();
                            } else if (B == 64) {
                                this.q = gVar.h();
                            } else if (B == 72) {
                                this.r = gVar.h();
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z19 = true;
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
                return new FolderDecorationPolicy();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (t == null) {
                    synchronized (FolderDecorationPolicy.class) {
                        if (t == null) {
                            t = new GeneratedMessageLite.c(s);
                        }
                    }
                }
                return t;
            default:
                throw new UnsupportedOperationException();
        }
        return s;
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
        boolean z6 = this.o;
        if (z6) {
            i2 += CodedOutputStream.d(6, z6);
        }
        boolean z7 = this.p;
        if (z7) {
            i2 += CodedOutputStream.d(7, z7);
        }
        boolean z8 = this.q;
        if (z8) {
            i2 += CodedOutputStream.d(8, z8);
        }
        boolean z9 = this.r;
        if (z9) {
            i2 += CodedOutputStream.d(9, z9);
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
        boolean z6 = this.o;
        if (z6) {
            codedOutputStream.A(6, z6);
        }
        boolean z7 = this.p;
        if (z7) {
            codedOutputStream.A(7, z7);
        }
        boolean z8 = this.q;
        if (z8) {
            codedOutputStream.A(8, z8);
        }
        boolean z9 = this.r;
        if (z9) {
            codedOutputStream.A(9, z9);
        }
    }
}
