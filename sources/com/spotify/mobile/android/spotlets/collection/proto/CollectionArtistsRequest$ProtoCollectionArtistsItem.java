package com.spotify.mobile.android.spotlets.collection.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.mobile.android.spotlets.collection.proto.ArtistMetadata$ProtoArtistMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.ArtistState$ProtoArtistCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.ArtistState$ProtoArtistOfflineState;
import java.io.IOException;

public final class CollectionArtistsRequest$ProtoCollectionArtistsItem extends GeneratedMessageLite<CollectionArtistsRequest$ProtoCollectionArtistsItem, a> implements Object {
    private static final CollectionArtistsRequest$ProtoCollectionArtistsItem r;
    private static volatile x<CollectionArtistsRequest$ProtoCollectionArtistsItem> s;
    private int a;
    private String b = "";
    private int c;
    private int f;
    private ArtistMetadata$ProtoArtistMetadata n;
    private ArtistState$ProtoArtistCollectionState o;
    private ArtistState$ProtoArtistOfflineState p;
    private String q = "";

    public static final class a extends GeneratedMessageLite.b<CollectionArtistsRequest$ProtoCollectionArtistsItem, a> implements Object {
        private a() {
            super(CollectionArtistsRequest$ProtoCollectionArtistsItem.r);
        }
    }

    static {
        CollectionArtistsRequest$ProtoCollectionArtistsItem collectionArtistsRequest$ProtoCollectionArtistsItem = new CollectionArtistsRequest$ProtoCollectionArtistsItem();
        r = collectionArtistsRequest$ProtoCollectionArtistsItem;
        collectionArtistsRequest$ProtoCollectionArtistsItem.makeImmutable();
    }

    private CollectionArtistsRequest$ProtoCollectionArtistsItem() {
    }

    public static x<CollectionArtistsRequest$ProtoCollectionArtistsItem> parser() {
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
                CollectionArtistsRequest$ProtoCollectionArtistsItem collectionArtistsRequest$ProtoCollectionArtistsItem = (CollectionArtistsRequest$ProtoCollectionArtistsItem) obj2;
                this.b = hVar.n(r(), this.b, collectionArtistsRequest$ProtoCollectionArtistsItem.r(), collectionArtistsRequest$ProtoCollectionArtistsItem.b);
                this.c = hVar.m((this.a & 2) == 2, this.c, (collectionArtistsRequest$ProtoCollectionArtistsItem.a & 2) == 2, collectionArtistsRequest$ProtoCollectionArtistsItem.c);
                this.f = hVar.m((this.a & 4) == 4, this.f, (collectionArtistsRequest$ProtoCollectionArtistsItem.a & 4) == 4, collectionArtistsRequest$ProtoCollectionArtistsItem.f);
                this.n = (ArtistMetadata$ProtoArtistMetadata) hVar.i(this.n, collectionArtistsRequest$ProtoCollectionArtistsItem.n);
                this.o = (ArtistState$ProtoArtistCollectionState) hVar.i(this.o, collectionArtistsRequest$ProtoCollectionArtistsItem.o);
                this.p = (ArtistState$ProtoArtistOfflineState) hVar.i(this.p, collectionArtistsRequest$ProtoCollectionArtistsItem.p);
                boolean z2 = (this.a & 64) == 64;
                String str = this.q;
                if ((collectionArtistsRequest$ProtoCollectionArtistsItem.a & 64) == 64) {
                    z = true;
                }
                this.q = hVar.n(z2, str, z, collectionArtistsRequest$ProtoCollectionArtistsItem.q);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= collectionArtistsRequest$ProtoCollectionArtistsItem.a;
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
                                String z3 = gVar.z();
                                this.a |= 1;
                                this.b = z3;
                            } else if (B == 16) {
                                this.a |= 2;
                                this.c = gVar.u();
                            } else if (B == 24) {
                                this.a |= 4;
                                this.f = gVar.u();
                            } else if (B == 34) {
                                ArtistMetadata$ProtoArtistMetadata.a aVar = (this.a & 8) == 8 ? (ArtistMetadata$ProtoArtistMetadata.a) this.n.toBuilder() : null;
                                ArtistMetadata$ProtoArtistMetadata artistMetadata$ProtoArtistMetadata = (ArtistMetadata$ProtoArtistMetadata) gVar.o(ArtistMetadata$ProtoArtistMetadata.parser(), kVar);
                                this.n = artistMetadata$ProtoArtistMetadata;
                                if (aVar != null) {
                                    aVar.mergeFrom((ArtistMetadata$ProtoArtistMetadata.a) artistMetadata$ProtoArtistMetadata);
                                    this.n = (ArtistMetadata$ProtoArtistMetadata) aVar.buildPartial();
                                }
                                this.a |= 8;
                            } else if (B == 42) {
                                ArtistState$ProtoArtistCollectionState.a aVar2 = (this.a & 16) == 16 ? (ArtistState$ProtoArtistCollectionState.a) this.o.toBuilder() : null;
                                ArtistState$ProtoArtistCollectionState artistState$ProtoArtistCollectionState = (ArtistState$ProtoArtistCollectionState) gVar.o(ArtistState$ProtoArtistCollectionState.parser(), kVar);
                                this.o = artistState$ProtoArtistCollectionState;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((ArtistState$ProtoArtistCollectionState.a) artistState$ProtoArtistCollectionState);
                                    this.o = (ArtistState$ProtoArtistCollectionState) aVar2.buildPartial();
                                }
                                this.a |= 16;
                            } else if (B == 50) {
                                ArtistState$ProtoArtistOfflineState.a aVar3 = (this.a & 32) == 32 ? (ArtistState$ProtoArtistOfflineState.a) this.p.toBuilder() : null;
                                ArtistState$ProtoArtistOfflineState artistState$ProtoArtistOfflineState = (ArtistState$ProtoArtistOfflineState) gVar.o(ArtistState$ProtoArtistOfflineState.parser(), kVar);
                                this.p = artistState$ProtoArtistOfflineState;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((ArtistState$ProtoArtistOfflineState.a) artistState$ProtoArtistOfflineState);
                                    this.p = (ArtistState$ProtoArtistOfflineState) aVar3.buildPartial();
                                }
                                this.a |= 32;
                            } else if (B == 58) {
                                String z4 = gVar.z();
                                this.a |= 64;
                                this.q = z4;
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
                return null;
            case 4:
                return new CollectionArtistsRequest$ProtoCollectionArtistsItem();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (s == null) {
                    synchronized (CollectionArtistsRequest$ProtoCollectionArtistsItem.class) {
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
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.p(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.s(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.s(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.n(4, i());
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.n(5, l());
        }
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.n(6, o());
        }
        if ((this.a & 64) == 64) {
            i2 += CodedOutputStream.p(7, this.q);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public int h() {
        return this.f;
    }

    public ArtistMetadata$ProtoArtistMetadata i() {
        ArtistMetadata$ProtoArtistMetadata artistMetadata$ProtoArtistMetadata = this.n;
        return artistMetadata$ProtoArtistMetadata == null ? ArtistMetadata$ProtoArtistMetadata.i() : artistMetadata$ProtoArtistMetadata;
    }

    public ArtistState$ProtoArtistCollectionState l() {
        ArtistState$ProtoArtistCollectionState artistState$ProtoArtistCollectionState = this.o;
        return artistState$ProtoArtistCollectionState == null ? ArtistState$ProtoArtistCollectionState.i() : artistState$ProtoArtistCollectionState;
    }

    public String m() {
        return this.q;
    }

    public String n() {
        return this.b;
    }

    public ArtistState$ProtoArtistOfflineState o() {
        ArtistState$ProtoArtistOfflineState artistState$ProtoArtistOfflineState = this.p;
        return artistState$ProtoArtistOfflineState == null ? ArtistState$ProtoArtistOfflineState.h() : artistState$ProtoArtistOfflineState;
    }

    public boolean p() {
        return (this.a & 8) == 8;
    }

    public boolean q() {
        return (this.a & 16) == 16;
    }

    public boolean r() {
        return (this.a & 1) == 1;
    }

    public boolean s() {
        return (this.a & 32) == 32;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.S(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.S(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.M(4, i());
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.M(5, l());
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.M(6, o());
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.P(7, this.q);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
