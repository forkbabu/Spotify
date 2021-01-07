package com.spotify.mobile.android.spotlets.yourlibrary.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class YourLibraryResponseProto$YourLibraryEntityInfo extends GeneratedMessageLite<YourLibraryResponseProto$YourLibraryEntityInfo, a> implements Object {
    private static final YourLibraryResponseProto$YourLibraryEntityInfo r;
    private static volatile x<YourLibraryResponseProto$YourLibraryEntityInfo> s;
    private String a = "";
    private String b = "";
    private String c = "";
    private long f;
    private String n = "";
    private String o = "";
    private boolean p;
    private int q;

    public enum Pinnable implements o.c {
        YES(0),
        NO_IN_FOLDER(1),
        UNRECOGNIZED(-1);
        
        private final int value;

        private Pinnable(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public static final class a extends GeneratedMessageLite.b<YourLibraryResponseProto$YourLibraryEntityInfo, a> implements Object {
        private a() {
            super(YourLibraryResponseProto$YourLibraryEntityInfo.r);
        }
    }

    static {
        YourLibraryResponseProto$YourLibraryEntityInfo yourLibraryResponseProto$YourLibraryEntityInfo = new YourLibraryResponseProto$YourLibraryEntityInfo();
        r = yourLibraryResponseProto$YourLibraryEntityInfo;
        yourLibraryResponseProto$YourLibraryEntityInfo.makeImmutable();
    }

    private YourLibraryResponseProto$YourLibraryEntityInfo() {
    }

    public static YourLibraryResponseProto$YourLibraryEntityInfo h() {
        return r;
    }

    public static x<YourLibraryResponseProto$YourLibraryEntityInfo> parser() {
        return r.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return r;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                YourLibraryResponseProto$YourLibraryEntityInfo yourLibraryResponseProto$YourLibraryEntityInfo = (YourLibraryResponseProto$YourLibraryEntityInfo) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !yourLibraryResponseProto$YourLibraryEntityInfo.a.isEmpty(), yourLibraryResponseProto$YourLibraryEntityInfo.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !yourLibraryResponseProto$YourLibraryEntityInfo.b.isEmpty(), yourLibraryResponseProto$YourLibraryEntityInfo.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !yourLibraryResponseProto$YourLibraryEntityInfo.c.isEmpty(), yourLibraryResponseProto$YourLibraryEntityInfo.c);
                long j = this.f;
                boolean z2 = j != 0;
                long j2 = yourLibraryResponseProto$YourLibraryEntityInfo.f;
                this.f = hVar.s(z2, j, j2 != 0, j2);
                this.n = hVar.n(!this.n.isEmpty(), this.n, !yourLibraryResponseProto$YourLibraryEntityInfo.n.isEmpty(), yourLibraryResponseProto$YourLibraryEntityInfo.n);
                this.o = hVar.n(!this.o.isEmpty(), this.o, !yourLibraryResponseProto$YourLibraryEntityInfo.o.isEmpty(), yourLibraryResponseProto$YourLibraryEntityInfo.o);
                boolean z3 = this.p;
                boolean z4 = yourLibraryResponseProto$YourLibraryEntityInfo.p;
                this.p = hVar.f(z3, z3, z4, z4);
                int i = this.q;
                boolean z5 = i != 0;
                int i2 = yourLibraryResponseProto$YourLibraryEntityInfo.q;
                if (i2 != 0) {
                    z = true;
                }
                this.q = hVar.m(z5, i, z, i2);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
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
                            } else if (B == 32) {
                                this.f = gVar.w();
                            } else if (B == 42) {
                                this.n = gVar.A();
                            } else if (B == 50) {
                                this.o = gVar.A();
                            } else if (B == 56) {
                                this.p = gVar.h();
                            } else if (B == 64) {
                                this.q = gVar.u();
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
                return new YourLibraryResponseProto$YourLibraryEntityInfo();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (s == null) {
                    synchronized (YourLibraryResponseProto$YourLibraryEntityInfo.class) {
                        if (s == null) {
                            s = new GeneratedMessageLite.c(r);
                        }
                    }
                }
                return s;
            default:
                throw new UnsupportedOperationException();
        }
        return r;
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
        long j = this.f;
        if (j != 0) {
            i2 += CodedOutputStream.l(4, j);
        }
        if (!this.n.isEmpty()) {
            i2 += CodedOutputStream.p(5, this.n);
        }
        if (!this.o.isEmpty()) {
            i2 += CodedOutputStream.p(6, this.o);
        }
        boolean z = this.p;
        if (z) {
            i2 += CodedOutputStream.d(7, z);
        }
        if (this.q != Pinnable.YES.getNumber()) {
            i2 += CodedOutputStream.h(8, this.q);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String i() {
        return this.n;
    }

    public String l() {
        return this.o;
    }

    public String m() {
        return this.b;
    }

    public Pinnable n() {
        Pinnable pinnable;
        int i = this.q;
        if (i == 0) {
            pinnable = Pinnable.YES;
        } else if (i != 1) {
            pinnable = null;
        } else {
            pinnable = Pinnable.NO_IN_FOLDER;
        }
        return pinnable == null ? Pinnable.UNRECOGNIZED : pinnable;
    }

    public boolean o() {
        return this.p;
    }

    public String p() {
        return this.c;
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
        long j = this.f;
        if (j != 0) {
            codedOutputStream.U(4, j);
        }
        if (!this.n.isEmpty()) {
            codedOutputStream.P(5, this.n);
        }
        if (!this.o.isEmpty()) {
            codedOutputStream.P(6, this.o);
        }
        boolean z = this.p;
        if (z) {
            codedOutputStream.A(7, z);
        }
        if (this.q != Pinnable.YES.getNumber()) {
            codedOutputStream.K(8, this.q);
        }
    }
}
