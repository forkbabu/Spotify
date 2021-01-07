package com.spotify.mobile.android.spotlets.yourlibrary.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class YourLibraryResponseProto$YourLibraryCollectionExtraInfo extends GeneratedMessageLite<YourLibraryResponseProto$YourLibraryCollectionExtraInfo, a> implements Object {
    private static final YourLibraryResponseProto$YourLibraryCollectionExtraInfo f;
    private static volatile x<YourLibraryResponseProto$YourLibraryCollectionExtraInfo> n;
    private String a = "";
    private int b;
    private int c;

    public static final class a extends GeneratedMessageLite.b<YourLibraryResponseProto$YourLibraryCollectionExtraInfo, a> implements Object {
        private a() {
            super(YourLibraryResponseProto$YourLibraryCollectionExtraInfo.f);
        }
    }

    static {
        YourLibraryResponseProto$YourLibraryCollectionExtraInfo yourLibraryResponseProto$YourLibraryCollectionExtraInfo = new YourLibraryResponseProto$YourLibraryCollectionExtraInfo();
        f = yourLibraryResponseProto$YourLibraryCollectionExtraInfo;
        yourLibraryResponseProto$YourLibraryCollectionExtraInfo.makeImmutable();
    }

    private YourLibraryResponseProto$YourLibraryCollectionExtraInfo() {
    }

    public static YourLibraryResponseProto$YourLibraryCollectionExtraInfo h() {
        return f;
    }

    public static x<YourLibraryResponseProto$YourLibraryCollectionExtraInfo> parser() {
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
                YourLibraryResponseProto$YourLibraryCollectionExtraInfo yourLibraryResponseProto$YourLibraryCollectionExtraInfo = (YourLibraryResponseProto$YourLibraryCollectionExtraInfo) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !yourLibraryResponseProto$YourLibraryCollectionExtraInfo.a.isEmpty(), yourLibraryResponseProto$YourLibraryCollectionExtraInfo.a);
                int i = this.b;
                boolean z2 = i != 0;
                int i2 = yourLibraryResponseProto$YourLibraryCollectionExtraInfo.b;
                this.b = hVar.m(z2, i, i2 != 0, i2);
                int i3 = this.c;
                boolean z3 = i3 != 0;
                int i4 = yourLibraryResponseProto$YourLibraryCollectionExtraInfo.c;
                if (i4 != 0) {
                    z = true;
                }
                this.c = hVar.m(z3, i3, z, i4);
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
                            } else if (B == 16) {
                                this.b = gVar.u();
                            } else if (B == 24) {
                                this.c = gVar.u();
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
                return new YourLibraryResponseProto$YourLibraryCollectionExtraInfo();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (YourLibraryResponseProto$YourLibraryCollectionExtraInfo.class) {
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
            i2 += CodedOutputStream.h(2, this.b);
        }
        int i3 = this.c;
        if (i3 != 0) {
            i2 += CodedOutputStream.j(3, i3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public int i() {
        return this.c;
    }

    public YourLibraryResponseProto$Offline$Availability l() {
        YourLibraryResponseProto$Offline$Availability d = YourLibraryResponseProto$Offline$Availability.d(this.b);
        return d == null ? YourLibraryResponseProto$Offline$Availability.UNRECOGNIZED : d;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        if (this.b != YourLibraryResponseProto$Offline$Availability.UNKNOWN.getNumber()) {
            codedOutputStream.K(2, this.b);
        }
        int i = this.c;
        if (i != 0) {
            codedOutputStream.K(3, i);
        }
    }
}
