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

public final class CollectionArtistsRequest$ProtoCollectionArtistsResponse extends GeneratedMessageLite<CollectionArtistsRequest$ProtoCollectionArtistsResponse, a> implements Object {
    private static final CollectionArtistsRequest$ProtoCollectionArtistsResponse o;
    private static volatile x<CollectionArtistsRequest$ProtoCollectionArtistsResponse> p;
    private int a;
    private o.i<CollectionArtistsRequest$ProtoCollectionArtistsItem> b = GeneratedMessageLite.emptyProtobufList();
    private int c;
    private int f;
    private boolean n;

    public static final class a extends GeneratedMessageLite.b<CollectionArtistsRequest$ProtoCollectionArtistsResponse, a> implements Object {
        private a() {
            super(CollectionArtistsRequest$ProtoCollectionArtistsResponse.o);
        }
    }

    static {
        CollectionArtistsRequest$ProtoCollectionArtistsResponse collectionArtistsRequest$ProtoCollectionArtistsResponse = new CollectionArtistsRequest$ProtoCollectionArtistsResponse();
        o = collectionArtistsRequest$ProtoCollectionArtistsResponse;
        collectionArtistsRequest$ProtoCollectionArtistsResponse.makeImmutable();
    }

    private CollectionArtistsRequest$ProtoCollectionArtistsResponse() {
    }

    public static x<CollectionArtistsRequest$ProtoCollectionArtistsResponse> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                CollectionArtistsRequest$ProtoCollectionArtistsResponse collectionArtistsRequest$ProtoCollectionArtistsResponse = (CollectionArtistsRequest$ProtoCollectionArtistsResponse) obj2;
                this.b = hVar.q(this.b, collectionArtistsRequest$ProtoCollectionArtistsResponse.b);
                this.c = hVar.m((this.a & 1) == 1, this.c, (collectionArtistsRequest$ProtoCollectionArtistsResponse.a & 1) == 1, collectionArtistsRequest$ProtoCollectionArtistsResponse.c);
                this.f = hVar.m((this.a & 2) == 2, this.f, (collectionArtistsRequest$ProtoCollectionArtistsResponse.a & 2) == 2, collectionArtistsRequest$ProtoCollectionArtistsResponse.f);
                boolean z2 = (this.a & 4) == 4;
                boolean z3 = this.n;
                if ((collectionArtistsRequest$ProtoCollectionArtistsResponse.a & 4) == 4) {
                    z = true;
                }
                this.n = hVar.f(z2, z3, z, collectionArtistsRequest$ProtoCollectionArtistsResponse.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= collectionArtistsRequest$ProtoCollectionArtistsResponse.a;
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
                                this.b.add(gVar.o(CollectionArtistsRequest$ProtoCollectionArtistsItem.parser(), kVar));
                            } else if (B == 16) {
                                this.a |= 1;
                                this.c = gVar.u();
                            } else if (B == 24) {
                                this.a |= 2;
                                this.f = gVar.u();
                            } else if (B == 32) {
                                this.a |= 4;
                                this.n = gVar.h();
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
                return null;
            case 4:
                return new CollectionArtistsRequest$ProtoCollectionArtistsResponse();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (CollectionArtistsRequest$ProtoCollectionArtistsResponse.class) {
                        if (p == null) {
                            p = new GeneratedMessageLite.c(o);
                        }
                    }
                }
                return p;
            default:
                throw new UnsupportedOperationException();
        }
        return o;
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
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public List<CollectionArtistsRequest$ProtoCollectionArtistsItem> h() {
        return this.b;
    }

    public boolean i() {
        return this.n;
    }

    public int l() {
        return this.c;
    }

    public int m() {
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
        this.unknownFields.l(codedOutputStream);
    }
}
