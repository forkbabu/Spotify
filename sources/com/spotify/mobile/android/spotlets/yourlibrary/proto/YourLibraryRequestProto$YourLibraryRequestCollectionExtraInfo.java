package com.spotify.mobile.android.spotlets.yourlibrary.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo extends GeneratedMessageLite<YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo, a> implements Object {
    private static final YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo n;
    private static volatile x<YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo> o;
    private String a = "";
    private String b = "";
    private String c = "";
    private String f = "";

    public static final class a extends GeneratedMessageLite.b<YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo, a> implements Object {
        public a m(String str) {
            copyOnWrite();
            YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo.h((YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo) this.instance, str);
            return this;
        }

        public a n(String str) {
            copyOnWrite();
            YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo.i((YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo) this.instance, str);
            return this;
        }

        private a() {
            super(YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo.n);
        }
    }

    static {
        YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo = new YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo();
        n = yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo;
        yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo.makeImmutable();
    }

    private YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo() {
    }

    static void h(YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo, String str) {
        yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo.getClass();
        str.getClass();
        yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo.a = str;
    }

    static void i(YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo, String str) {
        yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo.getClass();
        str.getClass();
        yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo.c = str;
    }

    public static a l() {
        return (a) n.toBuilder();
    }

    public static x<YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo> parser() {
        return n.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return n;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo = (YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo.a.isEmpty(), yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo.b.isEmpty(), yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo.c.isEmpty(), yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, true ^ yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo.f.isEmpty(), yourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo.f);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 810) {
                                this.a = gVar.A();
                            } else if (B == 818) {
                                this.b = gVar.A();
                            } else if (B == 826) {
                                this.c = gVar.A();
                            } else if (B == 834) {
                                this.f = gVar.A();
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
                return new YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (YourLibraryRequestProto$YourLibraryRequestCollectionExtraInfo.class) {
                        if (o == null) {
                            o = new GeneratedMessageLite.c(n);
                        }
                    }
                }
                return o;
            default:
                throw new UnsupportedOperationException();
        }
        return n;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(101, this.a);
        }
        if (!this.b.isEmpty()) {
            i2 += CodedOutputStream.p(102, this.b);
        }
        if (!this.c.isEmpty()) {
            i2 += CodedOutputStream.p(103, this.c);
        }
        if (!this.f.isEmpty()) {
            i2 += CodedOutputStream.p(104, this.f);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(101, this.a);
        }
        if (!this.b.isEmpty()) {
            codedOutputStream.P(102, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(103, this.c);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(104, this.f);
        }
    }
}
