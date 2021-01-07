package com.spotify.mobile.android.spotlets.yourlibrary.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class YourLibraryResponseProto$YourLibraryAlbumExtraInfo extends GeneratedMessageLite<YourLibraryResponseProto$YourLibraryAlbumExtraInfo, a> implements Object {
    private static final YourLibraryResponseProto$YourLibraryAlbumExtraInfo c;
    private static volatile x<YourLibraryResponseProto$YourLibraryAlbumExtraInfo> f;
    private String a = "";
    private int b;

    public static final class a extends GeneratedMessageLite.b<YourLibraryResponseProto$YourLibraryAlbumExtraInfo, a> implements Object {
        private a() {
            super(YourLibraryResponseProto$YourLibraryAlbumExtraInfo.c);
        }
    }

    static {
        YourLibraryResponseProto$YourLibraryAlbumExtraInfo yourLibraryResponseProto$YourLibraryAlbumExtraInfo = new YourLibraryResponseProto$YourLibraryAlbumExtraInfo();
        c = yourLibraryResponseProto$YourLibraryAlbumExtraInfo;
        yourLibraryResponseProto$YourLibraryAlbumExtraInfo.makeImmutable();
    }

    private YourLibraryResponseProto$YourLibraryAlbumExtraInfo() {
    }

    public static YourLibraryResponseProto$YourLibraryAlbumExtraInfo i() {
        return c;
    }

    public static x<YourLibraryResponseProto$YourLibraryAlbumExtraInfo> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                YourLibraryResponseProto$YourLibraryAlbumExtraInfo yourLibraryResponseProto$YourLibraryAlbumExtraInfo = (YourLibraryResponseProto$YourLibraryAlbumExtraInfo) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !yourLibraryResponseProto$YourLibraryAlbumExtraInfo.a.isEmpty(), yourLibraryResponseProto$YourLibraryAlbumExtraInfo.a);
                int i = this.b;
                boolean z2 = i != 0;
                int i2 = yourLibraryResponseProto$YourLibraryAlbumExtraInfo.b;
                if (i2 != 0) {
                    z = true;
                }
                this.b = hVar.m(z2, i, z, i2);
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
                return new YourLibraryResponseProto$YourLibraryAlbumExtraInfo();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (YourLibraryResponseProto$YourLibraryAlbumExtraInfo.class) {
                        if (f == null) {
                            f = new GeneratedMessageLite.c(c);
                        }
                    }
                }
                return f;
            default:
                throw new UnsupportedOperationException();
        }
        return c;
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
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String h() {
        return this.a;
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
            codedOutputStream.K(3, this.b);
        }
    }
}
