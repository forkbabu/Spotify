package com.spotify.mobile.android.spotlets.yourlibrary.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryRequestProto$YourLibraryRequestEntity;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryRequestProto$YourLibraryRequestHeader;
import java.io.IOException;

public final class YourLibraryRequestProto$YourLibraryRequest extends GeneratedMessageLite<YourLibraryRequestProto$YourLibraryRequest, a> implements Object {
    private static final YourLibraryRequestProto$YourLibraryRequest n;
    private static volatile x<YourLibraryRequestProto$YourLibraryRequest> o;
    private int a;
    private YourLibraryRequestProto$YourLibraryRequestHeader b;
    private YourLibraryRequestProto$YourLibraryRequestEntity c;
    private o.i<String> f = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.b<YourLibraryRequestProto$YourLibraryRequest, a> implements Object {
        public a m(Iterable<String> iterable) {
            copyOnWrite();
            YourLibraryRequestProto$YourLibraryRequest.l((YourLibraryRequestProto$YourLibraryRequest) this.instance, iterable);
            return this;
        }

        public a n(YourLibraryRequestProto$YourLibraryRequestEntity.a aVar) {
            copyOnWrite();
            YourLibraryRequestProto$YourLibraryRequest.i((YourLibraryRequestProto$YourLibraryRequest) this.instance, aVar);
            return this;
        }

        public a o(YourLibraryRequestProto$YourLibraryRequestHeader.a aVar) {
            copyOnWrite();
            YourLibraryRequestProto$YourLibraryRequest.h((YourLibraryRequestProto$YourLibraryRequest) this.instance, aVar);
            return this;
        }

        private a() {
            super(YourLibraryRequestProto$YourLibraryRequest.n);
        }
    }

    static {
        YourLibraryRequestProto$YourLibraryRequest yourLibraryRequestProto$YourLibraryRequest = new YourLibraryRequestProto$YourLibraryRequest();
        n = yourLibraryRequestProto$YourLibraryRequest;
        yourLibraryRequestProto$YourLibraryRequest.makeImmutable();
    }

    private YourLibraryRequestProto$YourLibraryRequest() {
    }

    static void h(YourLibraryRequestProto$YourLibraryRequest yourLibraryRequestProto$YourLibraryRequest, YourLibraryRequestProto$YourLibraryRequestHeader.a aVar) {
        yourLibraryRequestProto$YourLibraryRequest.getClass();
        yourLibraryRequestProto$YourLibraryRequest.b = (YourLibraryRequestProto$YourLibraryRequestHeader) aVar.build();
    }

    static void i(YourLibraryRequestProto$YourLibraryRequest yourLibraryRequestProto$YourLibraryRequest, YourLibraryRequestProto$YourLibraryRequestEntity.a aVar) {
        yourLibraryRequestProto$YourLibraryRequest.getClass();
        yourLibraryRequestProto$YourLibraryRequest.c = (YourLibraryRequestProto$YourLibraryRequestEntity) aVar.build();
    }

    static void l(YourLibraryRequestProto$YourLibraryRequest yourLibraryRequestProto$YourLibraryRequest, Iterable iterable) {
        if (!yourLibraryRequestProto$YourLibraryRequest.f.R0()) {
            yourLibraryRequestProto$YourLibraryRequest.f = GeneratedMessageLite.mutableCopy(yourLibraryRequestProto$YourLibraryRequest.f);
        }
        com.google.protobuf.a.addAll(iterable, yourLibraryRequestProto$YourLibraryRequest.f);
    }

    public static a m() {
        return (a) n.toBuilder();
    }

    public static x<YourLibraryRequestProto$YourLibraryRequest> parser() {
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
                YourLibraryRequestProto$YourLibraryRequest yourLibraryRequestProto$YourLibraryRequest = (YourLibraryRequestProto$YourLibraryRequest) obj2;
                this.b = (YourLibraryRequestProto$YourLibraryRequestHeader) hVar.i(this.b, yourLibraryRequestProto$YourLibraryRequest.b);
                this.c = (YourLibraryRequestProto$YourLibraryRequestEntity) hVar.i(this.c, yourLibraryRequestProto$YourLibraryRequest.c);
                this.f = hVar.q(this.f, yourLibraryRequestProto$YourLibraryRequest.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= yourLibraryRequestProto$YourLibraryRequest.a;
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
                                YourLibraryRequestProto$YourLibraryRequestHeader yourLibraryRequestProto$YourLibraryRequestHeader = this.b;
                                YourLibraryRequestProto$YourLibraryRequestHeader.a aVar = yourLibraryRequestProto$YourLibraryRequestHeader != null ? (YourLibraryRequestProto$YourLibraryRequestHeader.a) yourLibraryRequestProto$YourLibraryRequestHeader.toBuilder() : null;
                                YourLibraryRequestProto$YourLibraryRequestHeader yourLibraryRequestProto$YourLibraryRequestHeader2 = (YourLibraryRequestProto$YourLibraryRequestHeader) gVar.o(YourLibraryRequestProto$YourLibraryRequestHeader.parser(), kVar);
                                this.b = yourLibraryRequestProto$YourLibraryRequestHeader2;
                                if (aVar != null) {
                                    aVar.mergeFrom((YourLibraryRequestProto$YourLibraryRequestHeader.a) yourLibraryRequestProto$YourLibraryRequestHeader2);
                                    this.b = (YourLibraryRequestProto$YourLibraryRequestHeader) aVar.buildPartial();
                                }
                            } else if (B == 18) {
                                YourLibraryRequestProto$YourLibraryRequestEntity yourLibraryRequestProto$YourLibraryRequestEntity = this.c;
                                YourLibraryRequestProto$YourLibraryRequestEntity.a aVar2 = yourLibraryRequestProto$YourLibraryRequestEntity != null ? (YourLibraryRequestProto$YourLibraryRequestEntity.a) yourLibraryRequestProto$YourLibraryRequestEntity.toBuilder() : null;
                                YourLibraryRequestProto$YourLibraryRequestEntity yourLibraryRequestProto$YourLibraryRequestEntity2 = (YourLibraryRequestProto$YourLibraryRequestEntity) gVar.o(YourLibraryRequestProto$YourLibraryRequestEntity.parser(), kVar);
                                this.c = yourLibraryRequestProto$YourLibraryRequestEntity2;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((YourLibraryRequestProto$YourLibraryRequestEntity.a) yourLibraryRequestProto$YourLibraryRequestEntity2);
                                    this.c = (YourLibraryRequestProto$YourLibraryRequestEntity) aVar2.buildPartial();
                                }
                            } else if (B == 26) {
                                String A = gVar.A();
                                if (!this.f.R0()) {
                                    this.f = GeneratedMessageLite.mutableCopy(this.f);
                                }
                                this.f.add(A);
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
                this.f.C();
                return null;
            case 4:
                return new YourLibraryRequestProto$YourLibraryRequest();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (YourLibraryRequestProto$YourLibraryRequest.class) {
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
        YourLibraryRequestProto$YourLibraryRequestHeader yourLibraryRequestProto$YourLibraryRequestHeader = this.b;
        int n2 = yourLibraryRequestProto$YourLibraryRequestHeader != null ? CodedOutputStream.n(1, yourLibraryRequestProto$YourLibraryRequestHeader) + 0 : 0;
        YourLibraryRequestProto$YourLibraryRequestEntity yourLibraryRequestProto$YourLibraryRequestEntity = this.c;
        if (yourLibraryRequestProto$YourLibraryRequestEntity != null) {
            n2 += CodedOutputStream.n(2, yourLibraryRequestProto$YourLibraryRequestEntity);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            i2 += CodedOutputStream.q(this.f.get(i3));
        }
        int C0 = je.C0(this.f, 1, n2 + i2);
        this.memoizedSerializedSize = C0;
        return C0;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        YourLibraryRequestProto$YourLibraryRequestHeader yourLibraryRequestProto$YourLibraryRequestHeader = this.b;
        if (yourLibraryRequestProto$YourLibraryRequestHeader != null) {
            codedOutputStream.M(1, yourLibraryRequestProto$YourLibraryRequestHeader);
        }
        YourLibraryRequestProto$YourLibraryRequestEntity yourLibraryRequestProto$YourLibraryRequestEntity = this.c;
        if (yourLibraryRequestProto$YourLibraryRequestEntity != null) {
            codedOutputStream.M(2, yourLibraryRequestProto$YourLibraryRequestEntity);
        }
        for (int i = 0; i < this.f.size(); i++) {
            codedOutputStream.P(3, this.f.get(i));
        }
    }
}
