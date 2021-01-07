package com.spotify.mobile.android.spotlets.yourlibrary.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class YourLibraryResponseProto$YourLibraryResponseHeader extends GeneratedMessageLite<YourLibraryResponseProto$YourLibraryResponseHeader, a> implements Object {
    private static final YourLibraryResponseProto$YourLibraryResponseHeader s;
    private static volatile x<YourLibraryResponseProto$YourLibraryResponseHeader> t;
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean f;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private int r;

    public static final class a extends GeneratedMessageLite.b<YourLibraryResponseProto$YourLibraryResponseHeader, a> implements Object {
        private a() {
            super(YourLibraryResponseProto$YourLibraryResponseHeader.s);
        }
    }

    static {
        YourLibraryResponseProto$YourLibraryResponseHeader yourLibraryResponseProto$YourLibraryResponseHeader = new YourLibraryResponseProto$YourLibraryResponseHeader();
        s = yourLibraryResponseProto$YourLibraryResponseHeader;
        yourLibraryResponseProto$YourLibraryResponseHeader.makeImmutable();
    }

    private YourLibraryResponseProto$YourLibraryResponseHeader() {
    }

    public static YourLibraryResponseProto$YourLibraryResponseHeader h() {
        return s;
    }

    public static x<YourLibraryResponseProto$YourLibraryResponseHeader> parser() {
        return s.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return s;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                YourLibraryResponseProto$YourLibraryResponseHeader yourLibraryResponseProto$YourLibraryResponseHeader = (YourLibraryResponseProto$YourLibraryResponseHeader) obj2;
                boolean z2 = this.a;
                boolean z3 = yourLibraryResponseProto$YourLibraryResponseHeader.a;
                this.a = hVar.f(z2, z2, z3, z3);
                boolean z4 = this.b;
                boolean z5 = yourLibraryResponseProto$YourLibraryResponseHeader.b;
                this.b = hVar.f(z4, z4, z5, z5);
                boolean z6 = this.c;
                boolean z7 = yourLibraryResponseProto$YourLibraryResponseHeader.c;
                this.c = hVar.f(z6, z6, z7, z7);
                boolean z8 = this.f;
                boolean z9 = yourLibraryResponseProto$YourLibraryResponseHeader.f;
                this.f = hVar.f(z8, z8, z9, z9);
                boolean z10 = this.n;
                boolean z11 = yourLibraryResponseProto$YourLibraryResponseHeader.n;
                this.n = hVar.f(z10, z10, z11, z11);
                boolean z12 = this.o;
                boolean z13 = yourLibraryResponseProto$YourLibraryResponseHeader.o;
                this.o = hVar.f(z12, z12, z13, z13);
                boolean z14 = this.p;
                boolean z15 = yourLibraryResponseProto$YourLibraryResponseHeader.p;
                this.p = hVar.f(z14, z14, z15, z15);
                boolean z16 = this.q;
                boolean z17 = yourLibraryResponseProto$YourLibraryResponseHeader.q;
                this.q = hVar.f(z16, z16, z17, z17);
                int i = this.r;
                boolean z18 = i != 0;
                int i2 = yourLibraryResponseProto$YourLibraryResponseHeader.r;
                if (i2 != 0) {
                    z = true;
                }
                this.r = hVar.m(z18, i, z, i2);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
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
                                this.r = gVar.u();
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
                return new YourLibraryResponseProto$YourLibraryResponseHeader();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (t == null) {
                    synchronized (YourLibraryResponseProto$YourLibraryResponseHeader.class) {
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
        int i3 = this.r;
        if (i3 != 0) {
            i2 += CodedOutputStream.j(9, i3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean i() {
        return this.a;
    }

    public boolean l() {
        return this.b;
    }

    public boolean m() {
        return this.n;
    }

    public boolean n() {
        return this.o;
    }

    public boolean o() {
        return this.p;
    }

    public boolean p() {
        return this.q;
    }

    public boolean q() {
        return this.c;
    }

    public boolean r() {
        return this.f;
    }

    public int s() {
        return this.r;
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
        int i = this.r;
        if (i != 0) {
            codedOutputStream.K(9, i);
        }
    }
}
