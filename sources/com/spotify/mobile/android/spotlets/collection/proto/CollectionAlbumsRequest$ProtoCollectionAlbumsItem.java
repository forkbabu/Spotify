package com.spotify.mobile.android.spotlets.collection.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.mobile.android.spotlets.collection.proto.AlbumMetadata$ProtoAlbumMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.AlbumState$ProtoAlbumCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.AlbumState$ProtoAlbumOfflineState;
import java.io.IOException;

public final class CollectionAlbumsRequest$ProtoCollectionAlbumsItem extends GeneratedMessageLite<CollectionAlbumsRequest$ProtoCollectionAlbumsItem, a> implements Object {
    private static final CollectionAlbumsRequest$ProtoCollectionAlbumsItem r;
    private static volatile x<CollectionAlbumsRequest$ProtoCollectionAlbumsItem> s;
    private int a;
    private String b = "";
    private int c;
    private int f;
    private AlbumMetadata$ProtoAlbumMetadata n;
    private AlbumState$ProtoAlbumCollectionState o;
    private AlbumState$ProtoAlbumOfflineState p;
    private String q = "";

    public static final class a extends GeneratedMessageLite.b<CollectionAlbumsRequest$ProtoCollectionAlbumsItem, a> implements Object {
        private a() {
            super(CollectionAlbumsRequest$ProtoCollectionAlbumsItem.r);
        }
    }

    static {
        CollectionAlbumsRequest$ProtoCollectionAlbumsItem collectionAlbumsRequest$ProtoCollectionAlbumsItem = new CollectionAlbumsRequest$ProtoCollectionAlbumsItem();
        r = collectionAlbumsRequest$ProtoCollectionAlbumsItem;
        collectionAlbumsRequest$ProtoCollectionAlbumsItem.makeImmutable();
    }

    private CollectionAlbumsRequest$ProtoCollectionAlbumsItem() {
    }

    public static x<CollectionAlbumsRequest$ProtoCollectionAlbumsItem> parser() {
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
                CollectionAlbumsRequest$ProtoCollectionAlbumsItem collectionAlbumsRequest$ProtoCollectionAlbumsItem = (CollectionAlbumsRequest$ProtoCollectionAlbumsItem) obj2;
                this.b = hVar.n(r(), this.b, collectionAlbumsRequest$ProtoCollectionAlbumsItem.r(), collectionAlbumsRequest$ProtoCollectionAlbumsItem.b);
                this.c = hVar.m((this.a & 2) == 2, this.c, (collectionAlbumsRequest$ProtoCollectionAlbumsItem.a & 2) == 2, collectionAlbumsRequest$ProtoCollectionAlbumsItem.c);
                this.f = hVar.m((this.a & 4) == 4, this.f, (collectionAlbumsRequest$ProtoCollectionAlbumsItem.a & 4) == 4, collectionAlbumsRequest$ProtoCollectionAlbumsItem.f);
                this.n = (AlbumMetadata$ProtoAlbumMetadata) hVar.i(this.n, collectionAlbumsRequest$ProtoCollectionAlbumsItem.n);
                this.o = (AlbumState$ProtoAlbumCollectionState) hVar.i(this.o, collectionAlbumsRequest$ProtoCollectionAlbumsItem.o);
                this.p = (AlbumState$ProtoAlbumOfflineState) hVar.i(this.p, collectionAlbumsRequest$ProtoCollectionAlbumsItem.p);
                boolean z2 = (this.a & 64) == 64;
                String str = this.q;
                if ((collectionAlbumsRequest$ProtoCollectionAlbumsItem.a & 64) == 64) {
                    z = true;
                }
                this.q = hVar.n(z2, str, z, collectionAlbumsRequest$ProtoCollectionAlbumsItem.q);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= collectionAlbumsRequest$ProtoCollectionAlbumsItem.a;
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
                                AlbumMetadata$ProtoAlbumMetadata.a aVar = (this.a & 8) == 8 ? (AlbumMetadata$ProtoAlbumMetadata.a) this.n.toBuilder() : null;
                                AlbumMetadata$ProtoAlbumMetadata albumMetadata$ProtoAlbumMetadata = (AlbumMetadata$ProtoAlbumMetadata) gVar.o(AlbumMetadata$ProtoAlbumMetadata.parser(), kVar);
                                this.n = albumMetadata$ProtoAlbumMetadata;
                                if (aVar != null) {
                                    aVar.mergeFrom((AlbumMetadata$ProtoAlbumMetadata.a) albumMetadata$ProtoAlbumMetadata);
                                    this.n = (AlbumMetadata$ProtoAlbumMetadata) aVar.buildPartial();
                                }
                                this.a |= 8;
                            } else if (B == 42) {
                                AlbumState$ProtoAlbumCollectionState.a aVar2 = (this.a & 16) == 16 ? (AlbumState$ProtoAlbumCollectionState.a) this.o.toBuilder() : null;
                                AlbumState$ProtoAlbumCollectionState albumState$ProtoAlbumCollectionState = (AlbumState$ProtoAlbumCollectionState) gVar.o(AlbumState$ProtoAlbumCollectionState.parser(), kVar);
                                this.o = albumState$ProtoAlbumCollectionState;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((AlbumState$ProtoAlbumCollectionState.a) albumState$ProtoAlbumCollectionState);
                                    this.o = (AlbumState$ProtoAlbumCollectionState) aVar2.buildPartial();
                                }
                                this.a |= 16;
                            } else if (B == 50) {
                                AlbumState$ProtoAlbumOfflineState.a aVar3 = (this.a & 32) == 32 ? (AlbumState$ProtoAlbumOfflineState.a) this.p.toBuilder() : null;
                                AlbumState$ProtoAlbumOfflineState albumState$ProtoAlbumOfflineState = (AlbumState$ProtoAlbumOfflineState) gVar.o(AlbumState$ProtoAlbumOfflineState.parser(), kVar);
                                this.p = albumState$ProtoAlbumOfflineState;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((AlbumState$ProtoAlbumOfflineState.a) albumState$ProtoAlbumOfflineState);
                                    this.p = (AlbumState$ProtoAlbumOfflineState) aVar3.buildPartial();
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
                return new CollectionAlbumsRequest$ProtoCollectionAlbumsItem();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (s == null) {
                    synchronized (CollectionAlbumsRequest$ProtoCollectionAlbumsItem.class) {
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

    public AlbumMetadata$ProtoAlbumMetadata i() {
        AlbumMetadata$ProtoAlbumMetadata albumMetadata$ProtoAlbumMetadata = this.n;
        return albumMetadata$ProtoAlbumMetadata == null ? AlbumMetadata$ProtoAlbumMetadata.o() : albumMetadata$ProtoAlbumMetadata;
    }

    public AlbumState$ProtoAlbumCollectionState l() {
        AlbumState$ProtoAlbumCollectionState albumState$ProtoAlbumCollectionState = this.o;
        return albumState$ProtoAlbumCollectionState == null ? AlbumState$ProtoAlbumCollectionState.l() : albumState$ProtoAlbumCollectionState;
    }

    public String m() {
        return this.q;
    }

    public String n() {
        return this.b;
    }

    public AlbumState$ProtoAlbumOfflineState o() {
        AlbumState$ProtoAlbumOfflineState albumState$ProtoAlbumOfflineState = this.p;
        return albumState$ProtoAlbumOfflineState == null ? AlbumState$ProtoAlbumOfflineState.h() : albumState$ProtoAlbumOfflineState;
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
