package com.spotify.mobile.android.spotlets.yourlibrary.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class YourLibraryResponseProto$YourLibraryFolderExtraInfo extends GeneratedMessageLite<YourLibraryResponseProto$YourLibraryFolderExtraInfo, a> implements Object {
    private static final YourLibraryResponseProto$YourLibraryFolderExtraInfo f;
    private static volatile x<YourLibraryResponseProto$YourLibraryFolderExtraInfo> n;
    private String a = "";
    private int b;
    private int c;

    public static final class a extends GeneratedMessageLite.b<YourLibraryResponseProto$YourLibraryFolderExtraInfo, a> implements Object {
        private a() {
            super(YourLibraryResponseProto$YourLibraryFolderExtraInfo.f);
        }
    }

    static {
        YourLibraryResponseProto$YourLibraryFolderExtraInfo yourLibraryResponseProto$YourLibraryFolderExtraInfo = new YourLibraryResponseProto$YourLibraryFolderExtraInfo();
        f = yourLibraryResponseProto$YourLibraryFolderExtraInfo;
        yourLibraryResponseProto$YourLibraryFolderExtraInfo.makeImmutable();
    }

    private YourLibraryResponseProto$YourLibraryFolderExtraInfo() {
    }

    public static YourLibraryResponseProto$YourLibraryFolderExtraInfo h() {
        return f;
    }

    public static x<YourLibraryResponseProto$YourLibraryFolderExtraInfo> parser() {
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
                YourLibraryResponseProto$YourLibraryFolderExtraInfo yourLibraryResponseProto$YourLibraryFolderExtraInfo = (YourLibraryResponseProto$YourLibraryFolderExtraInfo) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !yourLibraryResponseProto$YourLibraryFolderExtraInfo.a.isEmpty(), yourLibraryResponseProto$YourLibraryFolderExtraInfo.a);
                int i = this.b;
                boolean z2 = i != 0;
                int i2 = yourLibraryResponseProto$YourLibraryFolderExtraInfo.b;
                this.b = hVar.m(z2, i, i2 != 0, i2);
                int i3 = this.c;
                boolean z3 = i3 != 0;
                int i4 = yourLibraryResponseProto$YourLibraryFolderExtraInfo.c;
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
                return new YourLibraryResponseProto$YourLibraryFolderExtraInfo();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (YourLibraryResponseProto$YourLibraryFolderExtraInfo.class) {
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
        int i3 = this.b;
        if (i3 != 0) {
            i2 += CodedOutputStream.j(2, i3);
        }
        int i4 = this.c;
        if (i4 != 0) {
            i2 += CodedOutputStream.j(3, i4);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public int i() {
        return this.c;
    }

    public int l() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        int i = this.b;
        if (i != 0) {
            codedOutputStream.K(2, i);
        }
        int i2 = this.c;
        if (i2 != 0) {
            codedOutputStream.K(3, i2);
        }
    }
}
