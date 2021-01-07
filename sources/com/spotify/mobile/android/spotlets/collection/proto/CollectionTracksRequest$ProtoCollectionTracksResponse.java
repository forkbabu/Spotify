package com.spotify.mobile.android.spotlets.collection.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class CollectionTracksRequest$ProtoCollectionTracksResponse extends GeneratedMessageLite<CollectionTracksRequest$ProtoCollectionTracksResponse, a> implements Object {
    private static final CollectionTracksRequest$ProtoCollectionTracksResponse r;
    private static volatile x<CollectionTracksRequest$ProtoCollectionTracksResponse> s;
    private int a;
    private o.i<CollectionTracksRequest$ProtoCollectionTracksItem> b = GeneratedMessageLite.emptyProtobufList();
    private int c;
    private int f;
    private boolean n;
    private String o = "";
    private int p;
    private o.i<CollectionTracksRequest$ProtoGroupHeader> q = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.b<CollectionTracksRequest$ProtoCollectionTracksResponse, a> implements Object {
        private a() {
            super(CollectionTracksRequest$ProtoCollectionTracksResponse.r);
        }
    }

    static {
        CollectionTracksRequest$ProtoCollectionTracksResponse collectionTracksRequest$ProtoCollectionTracksResponse = new CollectionTracksRequest$ProtoCollectionTracksResponse();
        r = collectionTracksRequest$ProtoCollectionTracksResponse;
        collectionTracksRequest$ProtoCollectionTracksResponse.makeImmutable();
    }

    private CollectionTracksRequest$ProtoCollectionTracksResponse() {
    }

    public static x<CollectionTracksRequest$ProtoCollectionTracksResponse> parser() {
        return r.getParserForType();
    }

    public static CollectionTracksRequest$ProtoCollectionTracksResponse q(byte[] bArr) {
        return (CollectionTracksRequest$ProtoCollectionTracksResponse) GeneratedMessageLite.parseFrom(r, bArr);
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
                CollectionTracksRequest$ProtoCollectionTracksResponse collectionTracksRequest$ProtoCollectionTracksResponse = (CollectionTracksRequest$ProtoCollectionTracksResponse) obj2;
                this.b = hVar.q(this.b, collectionTracksRequest$ProtoCollectionTracksResponse.b);
                this.c = hVar.m((this.a & 1) == 1, this.c, (collectionTracksRequest$ProtoCollectionTracksResponse.a & 1) == 1, collectionTracksRequest$ProtoCollectionTracksResponse.c);
                this.f = hVar.m((this.a & 2) == 2, this.f, (collectionTracksRequest$ProtoCollectionTracksResponse.a & 2) == 2, collectionTracksRequest$ProtoCollectionTracksResponse.f);
                this.n = hVar.f((this.a & 4) == 4, this.n, (collectionTracksRequest$ProtoCollectionTracksResponse.a & 4) == 4, collectionTracksRequest$ProtoCollectionTracksResponse.n);
                this.o = hVar.n((this.a & 8) == 8, this.o, (collectionTracksRequest$ProtoCollectionTracksResponse.a & 8) == 8, collectionTracksRequest$ProtoCollectionTracksResponse.o);
                boolean z2 = (this.a & 16) == 16;
                int i = this.p;
                if ((collectionTracksRequest$ProtoCollectionTracksResponse.a & 16) == 16) {
                    z = true;
                }
                this.p = hVar.m(z2, i, z, collectionTracksRequest$ProtoCollectionTracksResponse.p);
                this.q = hVar.q(this.q, collectionTracksRequest$ProtoCollectionTracksResponse.q);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= collectionTracksRequest$ProtoCollectionTracksResponse.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                this.b.add(gVar.o(CollectionTracksRequest$ProtoCollectionTracksItem.parser(), kVar));
                            } else if (B == 16) {
                                this.a |= 1;
                                this.c = gVar.u();
                            } else if (B == 24) {
                                this.a |= 2;
                                this.f = gVar.u();
                            } else if (B == 32) {
                                this.a |= 4;
                                this.n = gVar.h();
                            } else if (B == 42) {
                                String z3 = gVar.z();
                                this.a |= 8;
                                this.o = z3;
                            } else if (B == 48) {
                                this.a |= 16;
                                this.p = gVar.u();
                            } else if (B == 58) {
                                if (!this.q.R0()) {
                                    this.q = GeneratedMessageLite.mutableCopy(this.q);
                                }
                                this.q.add(gVar.o(CollectionTracksRequest$ProtoGroupHeader.parser(), kVar));
                            } else if (!parseUnknownField(B, gVar)) {
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
                this.b.C();
                this.q.C();
                return null;
            case 4:
                return new CollectionTracksRequest$ProtoCollectionTracksResponse();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (s == null) {
                    synchronized (CollectionTracksRequest$ProtoCollectionTracksResponse.class) {
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
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            i2 += CodedOutputStream.n(1, this.b.get(i3));
        }
        if ((this.a & 1) == 1) {
            i2 += CodedOutputStream.s(2, this.c);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.s(3, this.f);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.d(4, this.n);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.p(5, this.o);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.s(6, this.p);
        }
        for (int i4 = 0; i4 < this.q.size(); i4++) {
            i2 += CodedOutputStream.n(7, this.q.get(i4));
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public List<CollectionTracksRequest$ProtoGroupHeader> h() {
        return this.q;
    }

    public List<CollectionTracksRequest$ProtoCollectionTracksItem> i() {
        return this.b;
    }

    public boolean l() {
        return this.n;
    }

    public String m() {
        return this.o;
    }

    public int n() {
        return this.p;
    }

    public int o() {
        return this.c;
    }

    public int p() {
        return this.f;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.b.size(); i++) {
            codedOutputStream.M(1, this.b.get(i));
        }
        if ((this.a & 1) == 1) {
            codedOutputStream.S(2, this.c);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.S(3, this.f);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.A(4, this.n);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.P(5, this.o);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.S(6, this.p);
        }
        for (int i2 = 0; i2 < this.q.size(); i2++) {
            codedOutputStream.M(7, this.q.get(i2));
        }
        this.unknownFields.l(codedOutputStream);
    }
}
