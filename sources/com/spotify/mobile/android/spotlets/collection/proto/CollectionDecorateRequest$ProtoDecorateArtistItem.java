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

public final class CollectionDecorateRequest$ProtoDecorateArtistItem extends GeneratedMessageLite<CollectionDecorateRequest$ProtoDecorateArtistItem, a> implements Object {
    private static final CollectionDecorateRequest$ProtoDecorateArtistItem o;
    private static volatile x<CollectionDecorateRequest$ProtoDecorateArtistItem> p;
    private int a;
    private ArtistMetadata$ProtoArtistMetadata b;
    private ArtistState$ProtoArtistCollectionState c;
    private ArtistState$ProtoArtistOfflineState f;
    private String n = "";

    public static final class a extends GeneratedMessageLite.b<CollectionDecorateRequest$ProtoDecorateArtistItem, a> implements Object {
        private a() {
            super(CollectionDecorateRequest$ProtoDecorateArtistItem.o);
        }
    }

    static {
        CollectionDecorateRequest$ProtoDecorateArtistItem collectionDecorateRequest$ProtoDecorateArtistItem = new CollectionDecorateRequest$ProtoDecorateArtistItem();
        o = collectionDecorateRequest$ProtoDecorateArtistItem;
        collectionDecorateRequest$ProtoDecorateArtistItem.makeImmutable();
    }

    private CollectionDecorateRequest$ProtoDecorateArtistItem() {
    }

    public static x<CollectionDecorateRequest$ProtoDecorateArtistItem> parser() {
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
                CollectionDecorateRequest$ProtoDecorateArtistItem collectionDecorateRequest$ProtoDecorateArtistItem = (CollectionDecorateRequest$ProtoDecorateArtistItem) obj2;
                this.b = (ArtistMetadata$ProtoArtistMetadata) hVar.i(this.b, collectionDecorateRequest$ProtoDecorateArtistItem.b);
                this.c = (ArtistState$ProtoArtistCollectionState) hVar.i(this.c, collectionDecorateRequest$ProtoDecorateArtistItem.c);
                this.f = (ArtistState$ProtoArtistOfflineState) hVar.i(this.f, collectionDecorateRequest$ProtoDecorateArtistItem.f);
                boolean z2 = (this.a & 8) == 8;
                String str = this.n;
                if ((collectionDecorateRequest$ProtoDecorateArtistItem.a & 8) == 8) {
                    z = true;
                }
                this.n = hVar.n(z2, str, z, collectionDecorateRequest$ProtoDecorateArtistItem.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= collectionDecorateRequest$ProtoDecorateArtistItem.a;
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
                                ArtistMetadata$ProtoArtistMetadata.a aVar = (this.a & 1) == 1 ? (ArtistMetadata$ProtoArtistMetadata.a) this.b.toBuilder() : null;
                                ArtistMetadata$ProtoArtistMetadata artistMetadata$ProtoArtistMetadata = (ArtistMetadata$ProtoArtistMetadata) gVar.o(ArtistMetadata$ProtoArtistMetadata.parser(), kVar);
                                this.b = artistMetadata$ProtoArtistMetadata;
                                if (aVar != null) {
                                    aVar.mergeFrom((ArtistMetadata$ProtoArtistMetadata.a) artistMetadata$ProtoArtistMetadata);
                                    this.b = (ArtistMetadata$ProtoArtistMetadata) aVar.buildPartial();
                                }
                                this.a |= 1;
                            } else if (B == 18) {
                                ArtistState$ProtoArtistCollectionState.a aVar2 = (this.a & 2) == 2 ? (ArtistState$ProtoArtistCollectionState.a) this.c.toBuilder() : null;
                                ArtistState$ProtoArtistCollectionState artistState$ProtoArtistCollectionState = (ArtistState$ProtoArtistCollectionState) gVar.o(ArtistState$ProtoArtistCollectionState.parser(), kVar);
                                this.c = artistState$ProtoArtistCollectionState;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((ArtistState$ProtoArtistCollectionState.a) artistState$ProtoArtistCollectionState);
                                    this.c = (ArtistState$ProtoArtistCollectionState) aVar2.buildPartial();
                                }
                                this.a |= 2;
                            } else if (B == 26) {
                                ArtistState$ProtoArtistOfflineState.a aVar3 = (this.a & 4) == 4 ? (ArtistState$ProtoArtistOfflineState.a) this.f.toBuilder() : null;
                                ArtistState$ProtoArtistOfflineState artistState$ProtoArtistOfflineState = (ArtistState$ProtoArtistOfflineState) gVar.o(ArtistState$ProtoArtistOfflineState.parser(), kVar);
                                this.f = artistState$ProtoArtistOfflineState;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((ArtistState$ProtoArtistOfflineState.a) artistState$ProtoArtistOfflineState);
                                    this.f = (ArtistState$ProtoArtistOfflineState) aVar3.buildPartial();
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
                return new CollectionDecorateRequest$ProtoDecorateArtistItem();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (CollectionDecorateRequest$ProtoDecorateArtistItem.class) {
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

    public ArtistMetadata$ProtoArtistMetadata h() {
        ArtistMetadata$ProtoArtistMetadata artistMetadata$ProtoArtistMetadata = this.b;
        return artistMetadata$ProtoArtistMetadata == null ? ArtistMetadata$ProtoArtistMetadata.i() : artistMetadata$ProtoArtistMetadata;
    }

    public ArtistState$ProtoArtistCollectionState i() {
        ArtistState$ProtoArtistCollectionState artistState$ProtoArtistCollectionState = this.c;
        return artistState$ProtoArtistCollectionState == null ? ArtistState$ProtoArtistCollectionState.i() : artistState$ProtoArtistCollectionState;
    }

    public String l() {
        return this.n;
    }

    public ArtistState$ProtoArtistOfflineState m() {
        ArtistState$ProtoArtistOfflineState artistState$ProtoArtistOfflineState = this.f;
        return artistState$ProtoArtistOfflineState == null ? ArtistState$ProtoArtistOfflineState.h() : artistState$ProtoArtistOfflineState;
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
