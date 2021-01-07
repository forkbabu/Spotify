package com.spotify.playlist.proto;

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

public final class PlaylistPlaylistRequest$ProtoRecommendationItem extends GeneratedMessageLite<PlaylistPlaylistRequest$ProtoRecommendationItem, a> implements Object {
    private static final PlaylistPlaylistRequest$ProtoRecommendationItem o;
    private static volatile x<PlaylistPlaylistRequest$ProtoRecommendationItem> p;
    private int a;
    private TrackMetadata$ProtoTrackMetadata b;
    private TrackState$ProtoTrackCollectionState c;
    private TrackState$ProtoTrackOfflineState f;
    private TrackState$ProtoTrackPlayState n;

    public static final class a extends GeneratedMessageLite.b<PlaylistPlaylistRequest$ProtoRecommendationItem, a> implements Object {
        private a() {
            super(PlaylistPlaylistRequest$ProtoRecommendationItem.o);
        }
    }

    static {
        PlaylistPlaylistRequest$ProtoRecommendationItem playlistPlaylistRequest$ProtoRecommendationItem = new PlaylistPlaylistRequest$ProtoRecommendationItem();
        o = playlistPlaylistRequest$ProtoRecommendationItem;
        playlistPlaylistRequest$ProtoRecommendationItem.makeImmutable();
    }

    private PlaylistPlaylistRequest$ProtoRecommendationItem() {
    }

    public static x<PlaylistPlaylistRequest$ProtoRecommendationItem> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PlaylistPlaylistRequest$ProtoRecommendationItem playlistPlaylistRequest$ProtoRecommendationItem = (PlaylistPlaylistRequest$ProtoRecommendationItem) obj2;
                this.b = (TrackMetadata$ProtoTrackMetadata) hVar.i(this.b, playlistPlaylistRequest$ProtoRecommendationItem.b);
                this.c = (TrackState$ProtoTrackCollectionState) hVar.i(this.c, playlistPlaylistRequest$ProtoRecommendationItem.c);
                this.f = (TrackState$ProtoTrackOfflineState) hVar.i(this.f, playlistPlaylistRequest$ProtoRecommendationItem.f);
                this.n = (TrackState$ProtoTrackPlayState) hVar.i(this.n, playlistPlaylistRequest$ProtoRecommendationItem.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= playlistPlaylistRequest$ProtoRecommendationItem.a;
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
                                TrackMetadata$ProtoTrackMetadata.a aVar = (this.a & 1) == 1 ? (TrackMetadata$ProtoTrackMetadata.a) this.b.toBuilder() : null;
                                TrackMetadata$ProtoTrackMetadata trackMetadata$ProtoTrackMetadata = (TrackMetadata$ProtoTrackMetadata) gVar.o(TrackMetadata$ProtoTrackMetadata.parser(), kVar);
                                this.b = trackMetadata$ProtoTrackMetadata;
                                if (aVar != null) {
                                    aVar.mergeFrom((TrackMetadata$ProtoTrackMetadata.a) trackMetadata$ProtoTrackMetadata);
                                    this.b = (TrackMetadata$ProtoTrackMetadata) aVar.buildPartial();
                                }
                                this.a |= 1;
                            } else if (B == 18) {
                                TrackState$ProtoTrackCollectionState.a aVar2 = (this.a & 2) == 2 ? (TrackState$ProtoTrackCollectionState.a) this.c.toBuilder() : null;
                                TrackState$ProtoTrackCollectionState trackState$ProtoTrackCollectionState = (TrackState$ProtoTrackCollectionState) gVar.o(TrackState$ProtoTrackCollectionState.parser(), kVar);
                                this.c = trackState$ProtoTrackCollectionState;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((TrackState$ProtoTrackCollectionState.a) trackState$ProtoTrackCollectionState);
                                    this.c = (TrackState$ProtoTrackCollectionState) aVar2.buildPartial();
                                }
                                this.a |= 2;
                            } else if (B == 26) {
                                TrackState$ProtoTrackOfflineState.a aVar3 = (this.a & 4) == 4 ? (TrackState$ProtoTrackOfflineState.a) this.f.toBuilder() : null;
                                TrackState$ProtoTrackOfflineState trackState$ProtoTrackOfflineState = (TrackState$ProtoTrackOfflineState) gVar.o(TrackState$ProtoTrackOfflineState.parser(), kVar);
                                this.f = trackState$ProtoTrackOfflineState;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((TrackState$ProtoTrackOfflineState.a) trackState$ProtoTrackOfflineState);
                                    this.f = (TrackState$ProtoTrackOfflineState) aVar3.buildPartial();
                                }
                                this.a |= 4;
                            } else if (B == 34) {
                                TrackState$ProtoTrackPlayState.a aVar4 = (this.a & 8) == 8 ? (TrackState$ProtoTrackPlayState.a) this.n.toBuilder() : null;
                                TrackState$ProtoTrackPlayState trackState$ProtoTrackPlayState = (TrackState$ProtoTrackPlayState) gVar.o(TrackState$ProtoTrackPlayState.parser(), kVar);
                                this.n = trackState$ProtoTrackPlayState;
                                if (aVar4 != null) {
                                    aVar4.mergeFrom((TrackState$ProtoTrackPlayState.a) trackState$ProtoTrackPlayState);
                                    this.n = (TrackState$ProtoTrackPlayState) aVar4.buildPartial();
                                }
                                this.a |= 8;
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
                return new PlaylistPlaylistRequest$ProtoRecommendationItem();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (PlaylistPlaylistRequest$ProtoRecommendationItem.class) {
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
            i2 = 0 + CodedOutputStream.n(1, i());
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.n(2, h());
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.n(3, l());
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.n(4, m());
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public TrackState$ProtoTrackCollectionState h() {
        TrackState$ProtoTrackCollectionState trackState$ProtoTrackCollectionState = this.c;
        return trackState$ProtoTrackCollectionState == null ? TrackState$ProtoTrackCollectionState.l() : trackState$ProtoTrackCollectionState;
    }

    public TrackMetadata$ProtoTrackMetadata i() {
        TrackMetadata$ProtoTrackMetadata trackMetadata$ProtoTrackMetadata = this.b;
        return trackMetadata$ProtoTrackMetadata == null ? TrackMetadata$ProtoTrackMetadata.n() : trackMetadata$ProtoTrackMetadata;
    }

    public TrackState$ProtoTrackOfflineState l() {
        TrackState$ProtoTrackOfflineState trackState$ProtoTrackOfflineState = this.f;
        return trackState$ProtoTrackOfflineState == null ? TrackState$ProtoTrackOfflineState.h() : trackState$ProtoTrackOfflineState;
    }

    public TrackState$ProtoTrackPlayState m() {
        TrackState$ProtoTrackPlayState trackState$ProtoTrackPlayState = this.n;
        return trackState$ProtoTrackPlayState == null ? TrackState$ProtoTrackPlayState.h() : trackState$ProtoTrackPlayState;
    }

    public boolean n() {
        return (this.a & 2) == 2;
    }

    public boolean o() {
        return (this.a & 1) == 1;
    }

    public boolean p() {
        return (this.a & 4) == 4;
    }

    public boolean q() {
        return (this.a & 8) == 8;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.M(1, i());
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.M(2, h());
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.M(3, l());
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.M(4, m());
        }
        this.unknownFields.l(codedOutputStream);
    }
}
