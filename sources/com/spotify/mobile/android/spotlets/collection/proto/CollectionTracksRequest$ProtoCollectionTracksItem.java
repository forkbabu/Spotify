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

public final class CollectionTracksRequest$ProtoCollectionTracksItem extends GeneratedMessageLite<CollectionTracksRequest$ProtoCollectionTracksItem, a> implements Object {
    private static final CollectionTracksRequest$ProtoCollectionTracksItem s;
    private static volatile x<CollectionTracksRequest$ProtoCollectionTracksItem> t;
    private int a;
    private String b = "";
    private int c;
    private int f;
    private TrackMetadata$ProtoTrackMetadata n;
    private TrackState$ProtoTrackOfflineState o;
    private TrackState$ProtoTrackPlayState p;
    private TrackState$ProtoTrackCollectionState q;
    private String r = "";

    public static final class a extends GeneratedMessageLite.b<CollectionTracksRequest$ProtoCollectionTracksItem, a> implements Object {
        private a() {
            super(CollectionTracksRequest$ProtoCollectionTracksItem.s);
        }
    }

    static {
        CollectionTracksRequest$ProtoCollectionTracksItem collectionTracksRequest$ProtoCollectionTracksItem = new CollectionTracksRequest$ProtoCollectionTracksItem();
        s = collectionTracksRequest$ProtoCollectionTracksItem;
        collectionTracksRequest$ProtoCollectionTracksItem.makeImmutable();
    }

    private CollectionTracksRequest$ProtoCollectionTracksItem() {
    }

    public static x<CollectionTracksRequest$ProtoCollectionTracksItem> parser() {
        return s.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return s;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                CollectionTracksRequest$ProtoCollectionTracksItem collectionTracksRequest$ProtoCollectionTracksItem = (CollectionTracksRequest$ProtoCollectionTracksItem) obj2;
                this.b = hVar.n(r(), this.b, collectionTracksRequest$ProtoCollectionTracksItem.r(), collectionTracksRequest$ProtoCollectionTracksItem.b);
                this.c = hVar.m((this.a & 2) == 2, this.c, (collectionTracksRequest$ProtoCollectionTracksItem.a & 2) == 2, collectionTracksRequest$ProtoCollectionTracksItem.c);
                this.f = hVar.m((this.a & 4) == 4, this.f, (collectionTracksRequest$ProtoCollectionTracksItem.a & 4) == 4, collectionTracksRequest$ProtoCollectionTracksItem.f);
                this.n = (TrackMetadata$ProtoTrackMetadata) hVar.i(this.n, collectionTracksRequest$ProtoCollectionTracksItem.n);
                this.o = (TrackState$ProtoTrackOfflineState) hVar.i(this.o, collectionTracksRequest$ProtoCollectionTracksItem.o);
                this.p = (TrackState$ProtoTrackPlayState) hVar.i(this.p, collectionTracksRequest$ProtoCollectionTracksItem.p);
                this.q = (TrackState$ProtoTrackCollectionState) hVar.i(this.q, collectionTracksRequest$ProtoCollectionTracksItem.q);
                boolean z2 = (this.a & 128) == 128;
                String str = this.r;
                if ((collectionTracksRequest$ProtoCollectionTracksItem.a & 128) == 128) {
                    z = true;
                }
                this.r = hVar.n(z2, str, z, collectionTracksRequest$ProtoCollectionTracksItem.r);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= collectionTracksRequest$ProtoCollectionTracksItem.a;
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
                                TrackMetadata$ProtoTrackMetadata.a aVar = (this.a & 8) == 8 ? (TrackMetadata$ProtoTrackMetadata.a) this.n.toBuilder() : null;
                                TrackMetadata$ProtoTrackMetadata trackMetadata$ProtoTrackMetadata = (TrackMetadata$ProtoTrackMetadata) gVar.o(TrackMetadata$ProtoTrackMetadata.parser(), kVar);
                                this.n = trackMetadata$ProtoTrackMetadata;
                                if (aVar != null) {
                                    aVar.mergeFrom((TrackMetadata$ProtoTrackMetadata.a) trackMetadata$ProtoTrackMetadata);
                                    this.n = (TrackMetadata$ProtoTrackMetadata) aVar.buildPartial();
                                }
                                this.a |= 8;
                            } else if (B == 42) {
                                TrackState$ProtoTrackOfflineState.a aVar2 = (this.a & 16) == 16 ? (TrackState$ProtoTrackOfflineState.a) this.o.toBuilder() : null;
                                TrackState$ProtoTrackOfflineState trackState$ProtoTrackOfflineState = (TrackState$ProtoTrackOfflineState) gVar.o(TrackState$ProtoTrackOfflineState.parser(), kVar);
                                this.o = trackState$ProtoTrackOfflineState;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((TrackState$ProtoTrackOfflineState.a) trackState$ProtoTrackOfflineState);
                                    this.o = (TrackState$ProtoTrackOfflineState) aVar2.buildPartial();
                                }
                                this.a |= 16;
                            } else if (B == 50) {
                                TrackState$ProtoTrackPlayState.a aVar3 = (this.a & 32) == 32 ? (TrackState$ProtoTrackPlayState.a) this.p.toBuilder() : null;
                                TrackState$ProtoTrackPlayState trackState$ProtoTrackPlayState = (TrackState$ProtoTrackPlayState) gVar.o(TrackState$ProtoTrackPlayState.parser(), kVar);
                                this.p = trackState$ProtoTrackPlayState;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((TrackState$ProtoTrackPlayState.a) trackState$ProtoTrackPlayState);
                                    this.p = (TrackState$ProtoTrackPlayState) aVar3.buildPartial();
                                }
                                this.a |= 32;
                            } else if (B == 58) {
                                TrackState$ProtoTrackCollectionState.a aVar4 = (this.a & 64) == 64 ? (TrackState$ProtoTrackCollectionState.a) this.q.toBuilder() : null;
                                TrackState$ProtoTrackCollectionState trackState$ProtoTrackCollectionState = (TrackState$ProtoTrackCollectionState) gVar.o(TrackState$ProtoTrackCollectionState.parser(), kVar);
                                this.q = trackState$ProtoTrackCollectionState;
                                if (aVar4 != null) {
                                    aVar4.mergeFrom((TrackState$ProtoTrackCollectionState.a) trackState$ProtoTrackCollectionState);
                                    this.q = (TrackState$ProtoTrackCollectionState) aVar4.buildPartial();
                                }
                                this.a |= 64;
                            } else if (B == 66) {
                                String z4 = gVar.z();
                                this.a |= 128;
                                this.r = z4;
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
                return new CollectionTracksRequest$ProtoCollectionTracksItem();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (t == null) {
                    synchronized (CollectionTracksRequest$ProtoCollectionTracksItem.class) {
                        if (t == null) {
                            t = new GeneratedMessageLite.c(s);
                        }
                    }
                }
                return t;
            default:
                throw new UnsupportedOperationException();
        }
        return s;
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
            i2 += CodedOutputStream.n(4, p());
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.n(5, n());
        }
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.n(6, o());
        }
        if ((this.a & 64) == 64) {
            i2 += CodedOutputStream.n(7, i());
        }
        if ((this.a & 128) == 128) {
            i2 += CodedOutputStream.p(8, this.r);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public int h() {
        return this.f;
    }

    public TrackState$ProtoTrackCollectionState i() {
        TrackState$ProtoTrackCollectionState trackState$ProtoTrackCollectionState = this.q;
        return trackState$ProtoTrackCollectionState == null ? TrackState$ProtoTrackCollectionState.l() : trackState$ProtoTrackCollectionState;
    }

    public String l() {
        return this.r;
    }

    public String m() {
        return this.b;
    }

    public TrackState$ProtoTrackOfflineState n() {
        TrackState$ProtoTrackOfflineState trackState$ProtoTrackOfflineState = this.o;
        return trackState$ProtoTrackOfflineState == null ? TrackState$ProtoTrackOfflineState.h() : trackState$ProtoTrackOfflineState;
    }

    public TrackState$ProtoTrackPlayState o() {
        TrackState$ProtoTrackPlayState trackState$ProtoTrackPlayState = this.p;
        return trackState$ProtoTrackPlayState == null ? TrackState$ProtoTrackPlayState.h() : trackState$ProtoTrackPlayState;
    }

    public TrackMetadata$ProtoTrackMetadata p() {
        TrackMetadata$ProtoTrackMetadata trackMetadata$ProtoTrackMetadata = this.n;
        return trackMetadata$ProtoTrackMetadata == null ? TrackMetadata$ProtoTrackMetadata.n() : trackMetadata$ProtoTrackMetadata;
    }

    public boolean q() {
        return (this.a & 64) == 64;
    }

    public boolean r() {
        return (this.a & 1) == 1;
    }

    public boolean s() {
        return (this.a & 16) == 16;
    }

    public boolean t() {
        return (this.a & 32) == 32;
    }

    public boolean u() {
        return (this.a & 8) == 8;
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
            codedOutputStream.M(4, p());
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.M(5, n());
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.M(6, o());
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.M(7, i());
        }
        if ((this.a & 128) == 128) {
            codedOutputStream.P(8, this.r);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
