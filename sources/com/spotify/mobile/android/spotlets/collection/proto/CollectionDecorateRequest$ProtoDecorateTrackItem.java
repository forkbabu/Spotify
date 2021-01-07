package com.spotify.mobile.android.spotlets.collection.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState$ProtoTrackCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState$ProtoTrackOfflineState;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState$ProtoTrackPlayState;
import java.io.IOException;

public final class CollectionDecorateRequest$ProtoDecorateTrackItem extends GeneratedMessageLite<CollectionDecorateRequest$ProtoDecorateTrackItem, a> implements Object {
    private static final CollectionDecorateRequest$ProtoDecorateTrackItem p;
    private static volatile x<CollectionDecorateRequest$ProtoDecorateTrackItem> q;
    private int a;
    private TrackMetadata$ProtoTrackMetadata b;
    private TrackState$ProtoTrackOfflineState c;
    private TrackState$ProtoTrackPlayState f;
    private TrackState$ProtoTrackCollectionState n;
    private String o = "";

    public static final class a extends GeneratedMessageLite.b<CollectionDecorateRequest$ProtoDecorateTrackItem, a> implements Object {
        private a() {
            super(CollectionDecorateRequest$ProtoDecorateTrackItem.p);
        }
    }

    static {
        CollectionDecorateRequest$ProtoDecorateTrackItem collectionDecorateRequest$ProtoDecorateTrackItem = new CollectionDecorateRequest$ProtoDecorateTrackItem();
        p = collectionDecorateRequest$ProtoDecorateTrackItem;
        collectionDecorateRequest$ProtoDecorateTrackItem.makeImmutable();
    }

    private CollectionDecorateRequest$ProtoDecorateTrackItem() {
    }

    public static x<CollectionDecorateRequest$ProtoDecorateTrackItem> parser() {
        return p.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return p;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                CollectionDecorateRequest$ProtoDecorateTrackItem collectionDecorateRequest$ProtoDecorateTrackItem = (CollectionDecorateRequest$ProtoDecorateTrackItem) obj2;
                this.b = (TrackMetadata$ProtoTrackMetadata) hVar.i(this.b, collectionDecorateRequest$ProtoDecorateTrackItem.b);
                this.c = (TrackState$ProtoTrackOfflineState) hVar.i(this.c, collectionDecorateRequest$ProtoDecorateTrackItem.c);
                this.f = (TrackState$ProtoTrackPlayState) hVar.i(this.f, collectionDecorateRequest$ProtoDecorateTrackItem.f);
                this.n = (TrackState$ProtoTrackCollectionState) hVar.i(this.n, collectionDecorateRequest$ProtoDecorateTrackItem.n);
                boolean z2 = (this.a & 16) == 16;
                String str = this.o;
                if ((collectionDecorateRequest$ProtoDecorateTrackItem.a & 16) == 16) {
                    z = true;
                }
                this.o = hVar.n(z2, str, z, collectionDecorateRequest$ProtoDecorateTrackItem.o);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= collectionDecorateRequest$ProtoDecorateTrackItem.a;
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
                                TrackMetadata$ProtoTrackMetadata.a aVar = (this.a & 1) == 1 ? (TrackMetadata$ProtoTrackMetadata.a) this.b.toBuilder() : null;
                                TrackMetadata$ProtoTrackMetadata trackMetadata$ProtoTrackMetadata = (TrackMetadata$ProtoTrackMetadata) gVar.o(TrackMetadata$ProtoTrackMetadata.parser(), kVar);
                                this.b = trackMetadata$ProtoTrackMetadata;
                                if (aVar != null) {
                                    aVar.mergeFrom((TrackMetadata$ProtoTrackMetadata.a) trackMetadata$ProtoTrackMetadata);
                                    this.b = (TrackMetadata$ProtoTrackMetadata) aVar.buildPartial();
                                }
                                this.a |= 1;
                            } else if (B == 18) {
                                TrackState$ProtoTrackOfflineState.a aVar2 = (this.a & 2) == 2 ? (TrackState$ProtoTrackOfflineState.a) this.c.toBuilder() : null;
                                TrackState$ProtoTrackOfflineState trackState$ProtoTrackOfflineState = (TrackState$ProtoTrackOfflineState) gVar.o(TrackState$ProtoTrackOfflineState.parser(), kVar);
                                this.c = trackState$ProtoTrackOfflineState;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((TrackState$ProtoTrackOfflineState.a) trackState$ProtoTrackOfflineState);
                                    this.c = (TrackState$ProtoTrackOfflineState) aVar2.buildPartial();
                                }
                                this.a |= 2;
                            } else if (B == 26) {
                                TrackState$ProtoTrackPlayState.a aVar3 = (this.a & 4) == 4 ? (TrackState$ProtoTrackPlayState.a) this.f.toBuilder() : null;
                                TrackState$ProtoTrackPlayState trackState$ProtoTrackPlayState = (TrackState$ProtoTrackPlayState) gVar.o(TrackState$ProtoTrackPlayState.parser(), kVar);
                                this.f = trackState$ProtoTrackPlayState;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((TrackState$ProtoTrackPlayState.a) trackState$ProtoTrackPlayState);
                                    this.f = (TrackState$ProtoTrackPlayState) aVar3.buildPartial();
                                }
                                this.a |= 4;
                            } else if (B == 34) {
                                TrackState$ProtoTrackCollectionState.a aVar4 = (this.a & 8) == 8 ? (TrackState$ProtoTrackCollectionState.a) this.n.toBuilder() : null;
                                TrackState$ProtoTrackCollectionState trackState$ProtoTrackCollectionState = (TrackState$ProtoTrackCollectionState) gVar.o(TrackState$ProtoTrackCollectionState.parser(), kVar);
                                this.n = trackState$ProtoTrackCollectionState;
                                if (aVar4 != null) {
                                    aVar4.mergeFrom((TrackState$ProtoTrackCollectionState.a) trackState$ProtoTrackCollectionState);
                                    this.n = (TrackState$ProtoTrackCollectionState) aVar4.buildPartial();
                                }
                                this.a |= 8;
                            } else if (B == 42) {
                                String z3 = gVar.z();
                                this.a |= 16;
                                this.o = z3;
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
                return new CollectionDecorateRequest$ProtoDecorateTrackItem();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (CollectionDecorateRequest$ProtoDecorateTrackItem.class) {
                        if (q == null) {
                            q = new GeneratedMessageLite.c(p);
                        }
                    }
                }
                return q;
            default:
                throw new UnsupportedOperationException();
        }
        return p;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.n(1, n());
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.n(2, l());
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.n(3, m());
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.n(4, h());
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.p(5, this.o);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public TrackState$ProtoTrackCollectionState h() {
        TrackState$ProtoTrackCollectionState trackState$ProtoTrackCollectionState = this.n;
        return trackState$ProtoTrackCollectionState == null ? TrackState$ProtoTrackCollectionState.l() : trackState$ProtoTrackCollectionState;
    }

    public String i() {
        return this.o;
    }

    public TrackState$ProtoTrackOfflineState l() {
        TrackState$ProtoTrackOfflineState trackState$ProtoTrackOfflineState = this.c;
        return trackState$ProtoTrackOfflineState == null ? TrackState$ProtoTrackOfflineState.h() : trackState$ProtoTrackOfflineState;
    }

    public TrackState$ProtoTrackPlayState m() {
        TrackState$ProtoTrackPlayState trackState$ProtoTrackPlayState = this.f;
        return trackState$ProtoTrackPlayState == null ? TrackState$ProtoTrackPlayState.h() : trackState$ProtoTrackPlayState;
    }

    public TrackMetadata$ProtoTrackMetadata n() {
        TrackMetadata$ProtoTrackMetadata trackMetadata$ProtoTrackMetadata = this.b;
        return trackMetadata$ProtoTrackMetadata == null ? TrackMetadata$ProtoTrackMetadata.n() : trackMetadata$ProtoTrackMetadata;
    }

    public boolean o() {
        return (this.a & 8) == 8;
    }

    public boolean p() {
        return (this.a & 2) == 2;
    }

    public boolean q() {
        return (this.a & 4) == 4;
    }

    public boolean r() {
        return (this.a & 1) == 1;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.M(1, n());
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.M(2, l());
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.M(3, m());
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.M(4, h());
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.P(5, this.o);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
