package com.spotify.mobile.android.spotlets.yourlibrary.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryResponseHeader;
import java.io.IOException;
import java.util.List;

public final class YourLibraryResponseProto$YourLibraryResponse extends GeneratedMessageLite<YourLibraryResponseProto$YourLibraryResponse, a> implements Object {
    private static final YourLibraryResponseProto$YourLibraryResponse f;
    private static volatile x<YourLibraryResponseProto$YourLibraryResponse> n;
    private int a;
    private YourLibraryResponseProto$YourLibraryResponseHeader b;
    private o.i<YourLibraryResponseProto$YourLibraryResponseEntity> c = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.b<YourLibraryResponseProto$YourLibraryResponse, a> implements Object {
        private a() {
            super(YourLibraryResponseProto$YourLibraryResponse.f);
        }
    }

    static {
        YourLibraryResponseProto$YourLibraryResponse yourLibraryResponseProto$YourLibraryResponse = new YourLibraryResponseProto$YourLibraryResponse();
        f = yourLibraryResponseProto$YourLibraryResponse;
        yourLibraryResponseProto$YourLibraryResponse.makeImmutable();
    }

    private YourLibraryResponseProto$YourLibraryResponse() {
    }

    public static x<YourLibraryResponseProto$YourLibraryResponse> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                YourLibraryResponseProto$YourLibraryResponse yourLibraryResponseProto$YourLibraryResponse = (YourLibraryResponseProto$YourLibraryResponse) obj2;
                this.b = (YourLibraryResponseProto$YourLibraryResponseHeader) hVar.i(this.b, yourLibraryResponseProto$YourLibraryResponse.b);
                this.c = hVar.q(this.c, yourLibraryResponseProto$YourLibraryResponse.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= yourLibraryResponseProto$YourLibraryResponse.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                YourLibraryResponseProto$YourLibraryResponseHeader yourLibraryResponseProto$YourLibraryResponseHeader = this.b;
                                YourLibraryResponseProto$YourLibraryResponseHeader.a aVar = yourLibraryResponseProto$YourLibraryResponseHeader != null ? (YourLibraryResponseProto$YourLibraryResponseHeader.a) yourLibraryResponseProto$YourLibraryResponseHeader.toBuilder() : null;
                                YourLibraryResponseProto$YourLibraryResponseHeader yourLibraryResponseProto$YourLibraryResponseHeader2 = (YourLibraryResponseProto$YourLibraryResponseHeader) gVar.o(YourLibraryResponseProto$YourLibraryResponseHeader.parser(), kVar);
                                this.b = yourLibraryResponseProto$YourLibraryResponseHeader2;
                                if (aVar != null) {
                                    aVar.mergeFrom((YourLibraryResponseProto$YourLibraryResponseHeader.a) yourLibraryResponseProto$YourLibraryResponseHeader2);
                                    this.b = (YourLibraryResponseProto$YourLibraryResponseHeader) aVar.buildPartial();
                                }
                            } else if (B == 18) {
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(gVar.o(YourLibraryResponseProto$YourLibraryResponseEntity.parser(), kVar));
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
                this.c.C();
                return null;
            case 4:
                return new YourLibraryResponseProto$YourLibraryResponse();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (YourLibraryResponseProto$YourLibraryResponse.class) {
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
        int n2 = this.b != null ? CodedOutputStream.n(1, l()) + 0 : 0;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            n2 += CodedOutputStream.n(2, this.c.get(i2));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public int h() {
        return this.c.size();
    }

    public List<YourLibraryResponseProto$YourLibraryResponseEntity> i() {
        return this.c;
    }

    public YourLibraryResponseProto$YourLibraryResponseHeader l() {
        YourLibraryResponseProto$YourLibraryResponseHeader yourLibraryResponseProto$YourLibraryResponseHeader = this.b;
        return yourLibraryResponseProto$YourLibraryResponseHeader == null ? YourLibraryResponseProto$YourLibraryResponseHeader.h() : yourLibraryResponseProto$YourLibraryResponseHeader;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.b != null) {
            codedOutputStream.M(1, l());
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.M(2, this.c.get(i));
        }
    }
}
