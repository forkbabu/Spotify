package com.spotify.mobile.android.spotlets.yourlibrary.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class YourLibraryResponseProto$YourLibraryShowExtraInfo extends GeneratedMessageLite<YourLibraryResponseProto$YourLibraryShowExtraInfo, a> implements Object {
    private static final YourLibraryResponseProto$YourLibraryShowExtraInfo f;
    private static volatile x<YourLibraryResponseProto$YourLibraryShowExtraInfo> n;
    private String a = "";
    private int b;
    private long c;

    public static final class a extends GeneratedMessageLite.b<YourLibraryResponseProto$YourLibraryShowExtraInfo, a> implements Object {
        private a() {
            super(YourLibraryResponseProto$YourLibraryShowExtraInfo.f);
        }
    }

    static {
        YourLibraryResponseProto$YourLibraryShowExtraInfo yourLibraryResponseProto$YourLibraryShowExtraInfo = new YourLibraryResponseProto$YourLibraryShowExtraInfo();
        f = yourLibraryResponseProto$YourLibraryShowExtraInfo;
        yourLibraryResponseProto$YourLibraryShowExtraInfo.makeImmutable();
    }

    private YourLibraryResponseProto$YourLibraryShowExtraInfo() {
    }

    public static YourLibraryResponseProto$YourLibraryShowExtraInfo i() {
        return f;
    }

    public static x<YourLibraryResponseProto$YourLibraryShowExtraInfo> parser() {
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
                YourLibraryResponseProto$YourLibraryShowExtraInfo yourLibraryResponseProto$YourLibraryShowExtraInfo = (YourLibraryResponseProto$YourLibraryShowExtraInfo) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !yourLibraryResponseProto$YourLibraryShowExtraInfo.a.isEmpty(), yourLibraryResponseProto$YourLibraryShowExtraInfo.a);
                int i = this.b;
                boolean z2 = i != 0;
                int i2 = yourLibraryResponseProto$YourLibraryShowExtraInfo.b;
                this.b = hVar.m(z2, i, i2 != 0, i2);
                long j = this.c;
                boolean z3 = j != 0;
                long j2 = yourLibraryResponseProto$YourLibraryShowExtraInfo.c;
                this.c = hVar.s(z3, j, j2 != 0, j2);
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
                            } else if (B == 24) {
                                this.b = gVar.u();
                            } else if (B == 32) {
                                this.c = gVar.w();
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
                return new YourLibraryResponseProto$YourLibraryShowExtraInfo();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (YourLibraryResponseProto$YourLibraryShowExtraInfo.class) {
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
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
        }
        if (this.b != YourLibraryResponseProto$Offline$Availability.UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.h(3, this.b);
        }
        long j = this.c;
        if (j != 0) {
            i2 += CodedOutputStream.l(4, j);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String h() {
        return this.a;
    }

    public long l() {
        return this.c;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        if (this.b != YourLibraryResponseProto$Offline$Availability.UNKNOWN.getNumber()) {
            codedOutputStream.K(3, this.b);
        }
        long j = this.c;
        if (j != 0) {
            codedOutputStream.U(4, j);
        }
    }
}
