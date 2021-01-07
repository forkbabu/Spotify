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

public final class CollectionDecorateRequest$ProtoDecorateAlbumItem extends GeneratedMessageLite<CollectionDecorateRequest$ProtoDecorateAlbumItem, a> implements Object {
    private static final CollectionDecorateRequest$ProtoDecorateAlbumItem o;
    private static volatile x<CollectionDecorateRequest$ProtoDecorateAlbumItem> p;
    private int a;
    private AlbumMetadata$ProtoAlbumMetadata b;
    private AlbumState$ProtoAlbumCollectionState c;
    private AlbumState$ProtoAlbumOfflineState f;
    private String n = "";

    public static final class a extends GeneratedMessageLite.b<CollectionDecorateRequest$ProtoDecorateAlbumItem, a> implements Object {
        private a() {
            super(CollectionDecorateRequest$ProtoDecorateAlbumItem.o);
        }
    }

    static {
        CollectionDecorateRequest$ProtoDecorateAlbumItem collectionDecorateRequest$ProtoDecorateAlbumItem = new CollectionDecorateRequest$ProtoDecorateAlbumItem();
        o = collectionDecorateRequest$ProtoDecorateAlbumItem;
        collectionDecorateRequest$ProtoDecorateAlbumItem.makeImmutable();
    }

    private CollectionDecorateRequest$ProtoDecorateAlbumItem() {
    }

    public static x<CollectionDecorateRequest$ProtoDecorateAlbumItem> parser() {
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
                CollectionDecorateRequest$ProtoDecorateAlbumItem collectionDecorateRequest$ProtoDecorateAlbumItem = (CollectionDecorateRequest$ProtoDecorateAlbumItem) obj2;
                this.b = (AlbumMetadata$ProtoAlbumMetadata) hVar.i(this.b, collectionDecorateRequest$ProtoDecorateAlbumItem.b);
                this.c = (AlbumState$ProtoAlbumCollectionState) hVar.i(this.c, collectionDecorateRequest$ProtoDecorateAlbumItem.c);
                this.f = (AlbumState$ProtoAlbumOfflineState) hVar.i(this.f, collectionDecorateRequest$ProtoDecorateAlbumItem.f);
                boolean z2 = (this.a & 8) == 8;
                String str = this.n;
                if ((collectionDecorateRequest$ProtoDecorateAlbumItem.a & 8) == 8) {
                    z = true;
                }
                this.n = hVar.n(z2, str, z, collectionDecorateRequest$ProtoDecorateAlbumItem.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= collectionDecorateRequest$ProtoDecorateAlbumItem.a;
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
                                AlbumMetadata$ProtoAlbumMetadata.a aVar = (this.a & 1) == 1 ? (AlbumMetadata$ProtoAlbumMetadata.a) this.b.toBuilder() : null;
                                AlbumMetadata$ProtoAlbumMetadata albumMetadata$ProtoAlbumMetadata = (AlbumMetadata$ProtoAlbumMetadata) gVar.o(AlbumMetadata$ProtoAlbumMetadata.parser(), kVar);
                                this.b = albumMetadata$ProtoAlbumMetadata;
                                if (aVar != null) {
                                    aVar.mergeFrom((AlbumMetadata$ProtoAlbumMetadata.a) albumMetadata$ProtoAlbumMetadata);
                                    this.b = (AlbumMetadata$ProtoAlbumMetadata) aVar.buildPartial();
                                }
                                this.a |= 1;
                            } else if (B == 18) {
                                AlbumState$ProtoAlbumCollectionState.a aVar2 = (this.a & 2) == 2 ? (AlbumState$ProtoAlbumCollectionState.a) this.c.toBuilder() : null;
                                AlbumState$ProtoAlbumCollectionState albumState$ProtoAlbumCollectionState = (AlbumState$ProtoAlbumCollectionState) gVar.o(AlbumState$ProtoAlbumCollectionState.parser(), kVar);
                                this.c = albumState$ProtoAlbumCollectionState;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((AlbumState$ProtoAlbumCollectionState.a) albumState$ProtoAlbumCollectionState);
                                    this.c = (AlbumState$ProtoAlbumCollectionState) aVar2.buildPartial();
                                }
                                this.a |= 2;
                            } else if (B == 26) {
                                AlbumState$ProtoAlbumOfflineState.a aVar3 = (this.a & 4) == 4 ? (AlbumState$ProtoAlbumOfflineState.a) this.f.toBuilder() : null;
                                AlbumState$ProtoAlbumOfflineState albumState$ProtoAlbumOfflineState = (AlbumState$ProtoAlbumOfflineState) gVar.o(AlbumState$ProtoAlbumOfflineState.parser(), kVar);
                                this.f = albumState$ProtoAlbumOfflineState;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((AlbumState$ProtoAlbumOfflineState.a) albumState$ProtoAlbumOfflineState);
                                    this.f = (AlbumState$ProtoAlbumOfflineState) aVar3.buildPartial();
                                }
                                this.a |= 4;
                            } else if (B == 34) {
                                String z3 = gVar.z();
                                this.a |= 8;
                                this.n = z3;
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
                return new CollectionDecorateRequest$ProtoDecorateAlbumItem();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (CollectionDecorateRequest$ProtoDecorateAlbumItem.class) {
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
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.n(1, h());
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.n(2, i());
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.n(3, m());
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.p(4, this.n);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public AlbumMetadata$ProtoAlbumMetadata h() {
        AlbumMetadata$ProtoAlbumMetadata albumMetadata$ProtoAlbumMetadata = this.b;
        return albumMetadata$ProtoAlbumMetadata == null ? AlbumMetadata$ProtoAlbumMetadata.o() : albumMetadata$ProtoAlbumMetadata;
    }

    public AlbumState$ProtoAlbumCollectionState i() {
        AlbumState$ProtoAlbumCollectionState albumState$ProtoAlbumCollectionState = this.c;
        return albumState$ProtoAlbumCollectionState == null ? AlbumState$ProtoAlbumCollectionState.l() : albumState$ProtoAlbumCollectionState;
    }

    public String l() {
        return this.n;
    }

    public AlbumState$ProtoAlbumOfflineState m() {
        AlbumState$ProtoAlbumOfflineState albumState$ProtoAlbumOfflineState = this.f;
        return albumState$ProtoAlbumOfflineState == null ? AlbumState$ProtoAlbumOfflineState.h() : albumState$ProtoAlbumOfflineState;
    }

    public boolean n() {
        return (this.a & 1) == 1;
    }

    public boolean o() {
        return (this.a & 2) == 2;
    }

    public boolean p() {
        return (this.a & 4) == 4;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.M(1, h());
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.M(2, i());
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.M(3, m());
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.P(4, this.n);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
