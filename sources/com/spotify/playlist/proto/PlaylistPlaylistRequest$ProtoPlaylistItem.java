package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState$ProtoTrackCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState$ProtoTrackOfflineState;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState$ProtoTrackPlayState;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata$ProtoEpisodeMetadata;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState$ProtoEpisodeCollectionState;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState$ProtoEpisodeOfflineState;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState$ProtoEpisodePlayState;
import com.spotify.playlist.proto.PlaylistUserState$ProtoUser;
import java.io.IOException;
import java.util.List;

public final class PlaylistPlaylistRequest$ProtoPlaylistItem extends GeneratedMessageLite<PlaylistPlaylistRequest$ProtoPlaylistItem, a> implements Object {
    private static final PlaylistPlaylistRequest$ProtoPlaylistItem x;
    private static volatile x<PlaylistPlaylistRequest$ProtoPlaylistItem> y;
    private int a;
    private String b = "";
    private int c;
    private PlaylistUserState$ProtoUser f;
    private TrackMetadata$ProtoTrackMetadata n;
    private TrackState$ProtoTrackCollectionState o;
    private TrackState$ProtoTrackOfflineState p;
    private String q = "";
    private TrackState$ProtoTrackPlayState r;
    private o.i<PlaylistPlaylistMetadata$ProtoPlaylistFormatListAttribute> s = GeneratedMessageLite.emptyProtobufList();
    private EpisodeMetadata$ProtoEpisodeMetadata t;
    private EpisodeState$ProtoEpisodeOfflineState u;
    private EpisodeState$ProtoEpisodeCollectionState v;
    private EpisodeState$ProtoEpisodePlayState w;

    public static final class a extends GeneratedMessageLite.b<PlaylistPlaylistRequest$ProtoPlaylistItem, a> implements Object {
        private a() {
            super(PlaylistPlaylistRequest$ProtoPlaylistItem.x);
        }
    }

    static {
        PlaylistPlaylistRequest$ProtoPlaylistItem playlistPlaylistRequest$ProtoPlaylistItem = new PlaylistPlaylistRequest$ProtoPlaylistItem();
        x = playlistPlaylistRequest$ProtoPlaylistItem;
        playlistPlaylistRequest$ProtoPlaylistItem.makeImmutable();
    }

    private PlaylistPlaylistRequest$ProtoPlaylistItem() {
    }

    public static x<PlaylistPlaylistRequest$ProtoPlaylistItem> parser() {
        return x.getParserForType();
    }

    public boolean A() {
        return (this.a & 128) == 128;
    }

    public EpisodeState$ProtoEpisodeOfflineState b() {
        EpisodeState$ProtoEpisodeOfflineState episodeState$ProtoEpisodeOfflineState = this.u;
        return episodeState$ProtoEpisodeOfflineState == null ? EpisodeState$ProtoEpisodeOfflineState.h() : episodeState$ProtoEpisodeOfflineState;
    }

    public boolean d() {
        return (this.a & 256) == 256;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return x;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PlaylistPlaylistRequest$ProtoPlaylistItem playlistPlaylistRequest$ProtoPlaylistItem = (PlaylistPlaylistRequest$ProtoPlaylistItem) obj2;
                this.b = hVar.n(w(), this.b, playlistPlaylistRequest$ProtoPlaylistItem.w(), playlistPlaylistRequest$ProtoPlaylistItem.b);
                this.c = hVar.m((this.a & 2) == 2, this.c, (playlistPlaylistRequest$ProtoPlaylistItem.a & 2) == 2, playlistPlaylistRequest$ProtoPlaylistItem.c);
                this.f = (PlaylistUserState$ProtoUser) hVar.i(this.f, playlistPlaylistRequest$ProtoPlaylistItem.f);
                this.n = (TrackMetadata$ProtoTrackMetadata) hVar.i(this.n, playlistPlaylistRequest$ProtoPlaylistItem.n);
                this.o = (TrackState$ProtoTrackCollectionState) hVar.i(this.o, playlistPlaylistRequest$ProtoPlaylistItem.o);
                this.p = (TrackState$ProtoTrackOfflineState) hVar.i(this.p, playlistPlaylistRequest$ProtoPlaylistItem.p);
                boolean z2 = (this.a & 64) == 64;
                String str = this.q;
                if ((playlistPlaylistRequest$ProtoPlaylistItem.a & 64) == 64) {
                    z = true;
                }
                this.q = hVar.n(z2, str, z, playlistPlaylistRequest$ProtoPlaylistItem.q);
                this.r = (TrackState$ProtoTrackPlayState) hVar.i(this.r, playlistPlaylistRequest$ProtoPlaylistItem.r);
                this.s = hVar.q(this.s, playlistPlaylistRequest$ProtoPlaylistItem.s);
                this.t = (EpisodeMetadata$ProtoEpisodeMetadata) hVar.i(this.t, playlistPlaylistRequest$ProtoPlaylistItem.t);
                this.u = (EpisodeState$ProtoEpisodeOfflineState) hVar.i(this.u, playlistPlaylistRequest$ProtoPlaylistItem.u);
                this.v = (EpisodeState$ProtoEpisodeCollectionState) hVar.i(this.v, playlistPlaylistRequest$ProtoPlaylistItem.v);
                this.w = (EpisodeState$ProtoEpisodePlayState) hVar.i(this.w, playlistPlaylistRequest$ProtoPlaylistItem.w);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= playlistPlaylistRequest$ProtoPlaylistItem.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        switch (B) {
                            case 0:
                                break;
                            case 10:
                                String z3 = gVar.z();
                                this.a |= 1;
                                this.b = z3;
                                continue;
                            case 16:
                                this.a |= 2;
                                this.c = gVar.u();
                                continue;
                            case 26:
                                PlaylistUserState$ProtoUser.a aVar = (this.a & 4) == 4 ? (PlaylistUserState$ProtoUser.a) this.f.toBuilder() : null;
                                PlaylistUserState$ProtoUser playlistUserState$ProtoUser = (PlaylistUserState$ProtoUser) gVar.o(PlaylistUserState$ProtoUser.parser(), kVar);
                                this.f = playlistUserState$ProtoUser;
                                if (aVar != null) {
                                    aVar.mergeFrom((PlaylistUserState$ProtoUser.a) playlistUserState$ProtoUser);
                                    this.f = (PlaylistUserState$ProtoUser) aVar.buildPartial();
                                }
                                this.a |= 4;
                                continue;
                            case 34:
                                TrackMetadata$ProtoTrackMetadata.a aVar2 = (this.a & 8) == 8 ? (TrackMetadata$ProtoTrackMetadata.a) this.n.toBuilder() : null;
                                TrackMetadata$ProtoTrackMetadata trackMetadata$ProtoTrackMetadata = (TrackMetadata$ProtoTrackMetadata) gVar.o(TrackMetadata$ProtoTrackMetadata.parser(), kVar);
                                this.n = trackMetadata$ProtoTrackMetadata;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((TrackMetadata$ProtoTrackMetadata.a) trackMetadata$ProtoTrackMetadata);
                                    this.n = (TrackMetadata$ProtoTrackMetadata) aVar2.buildPartial();
                                }
                                this.a |= 8;
                                continue;
                            case 42:
                                TrackState$ProtoTrackCollectionState.a aVar3 = (this.a & 16) == 16 ? (TrackState$ProtoTrackCollectionState.a) this.o.toBuilder() : null;
                                TrackState$ProtoTrackCollectionState trackState$ProtoTrackCollectionState = (TrackState$ProtoTrackCollectionState) gVar.o(TrackState$ProtoTrackCollectionState.parser(), kVar);
                                this.o = trackState$ProtoTrackCollectionState;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((TrackState$ProtoTrackCollectionState.a) trackState$ProtoTrackCollectionState);
                                    this.o = (TrackState$ProtoTrackCollectionState) aVar3.buildPartial();
                                }
                                this.a |= 16;
                                continue;
                            case 50:
                                TrackState$ProtoTrackOfflineState.a aVar4 = (this.a & 32) == 32 ? (TrackState$ProtoTrackOfflineState.a) this.p.toBuilder() : null;
                                TrackState$ProtoTrackOfflineState trackState$ProtoTrackOfflineState = (TrackState$ProtoTrackOfflineState) gVar.o(TrackState$ProtoTrackOfflineState.parser(), kVar);
                                this.p = trackState$ProtoTrackOfflineState;
                                if (aVar4 != null) {
                                    aVar4.mergeFrom((TrackState$ProtoTrackOfflineState.a) trackState$ProtoTrackOfflineState);
                                    this.p = (TrackState$ProtoTrackOfflineState) aVar4.buildPartial();
                                }
                                this.a |= 32;
                                continue;
                            case 58:
                                String z4 = gVar.z();
                                this.a |= 64;
                                this.q = z4;
                                continue;
                            case 66:
                                TrackState$ProtoTrackPlayState.a aVar5 = (this.a & 128) == 128 ? (TrackState$ProtoTrackPlayState.a) this.r.toBuilder() : null;
                                TrackState$ProtoTrackPlayState trackState$ProtoTrackPlayState = (TrackState$ProtoTrackPlayState) gVar.o(TrackState$ProtoTrackPlayState.parser(), kVar);
                                this.r = trackState$ProtoTrackPlayState;
                                if (aVar5 != null) {
                                    aVar5.mergeFrom((TrackState$ProtoTrackPlayState.a) trackState$ProtoTrackPlayState);
                                    this.r = (TrackState$ProtoTrackPlayState) aVar5.buildPartial();
                                }
                                this.a |= 128;
                                continue;
                            case 74:
                                if (!this.s.R0()) {
                                    this.s = GeneratedMessageLite.mutableCopy(this.s);
                                }
                                this.s.add(gVar.o(PlaylistPlaylistMetadata$ProtoPlaylistFormatListAttribute.parser(), kVar));
                                continue;
                            case 82:
                                EpisodeMetadata$ProtoEpisodeMetadata.a aVar6 = (this.a & 256) == 256 ? (EpisodeMetadata$ProtoEpisodeMetadata.a) this.t.toBuilder() : null;
                                EpisodeMetadata$ProtoEpisodeMetadata episodeMetadata$ProtoEpisodeMetadata = (EpisodeMetadata$ProtoEpisodeMetadata) gVar.o(EpisodeMetadata$ProtoEpisodeMetadata.parser(), kVar);
                                this.t = episodeMetadata$ProtoEpisodeMetadata;
                                if (aVar6 != null) {
                                    aVar6.mergeFrom((EpisodeMetadata$ProtoEpisodeMetadata.a) episodeMetadata$ProtoEpisodeMetadata);
                                    this.t = (EpisodeMetadata$ProtoEpisodeMetadata) aVar6.buildPartial();
                                }
                                this.a |= 256;
                                continue;
                            case 90:
                                EpisodeState$ProtoEpisodeOfflineState.a aVar7 = (this.a & 512) == 512 ? (EpisodeState$ProtoEpisodeOfflineState.a) this.u.toBuilder() : null;
                                EpisodeState$ProtoEpisodeOfflineState episodeState$ProtoEpisodeOfflineState = (EpisodeState$ProtoEpisodeOfflineState) gVar.o(EpisodeState$ProtoEpisodeOfflineState.parser(), kVar);
                                this.u = episodeState$ProtoEpisodeOfflineState;
                                if (aVar7 != null) {
                                    aVar7.mergeFrom((EpisodeState$ProtoEpisodeOfflineState.a) episodeState$ProtoEpisodeOfflineState);
                                    this.u = (EpisodeState$ProtoEpisodeOfflineState) aVar7.buildPartial();
                                }
                                this.a |= 512;
                                continue;
                            case 98:
                                EpisodeState$ProtoEpisodeCollectionState.a aVar8 = (this.a & 1024) == 1024 ? (EpisodeState$ProtoEpisodeCollectionState.a) this.v.toBuilder() : null;
                                EpisodeState$ProtoEpisodeCollectionState episodeState$ProtoEpisodeCollectionState = (EpisodeState$ProtoEpisodeCollectionState) gVar.o(EpisodeState$ProtoEpisodeCollectionState.parser(), kVar);
                                this.v = episodeState$ProtoEpisodeCollectionState;
                                if (aVar8 != null) {
                                    aVar8.mergeFrom((EpisodeState$ProtoEpisodeCollectionState.a) episodeState$ProtoEpisodeCollectionState);
                                    this.v = (EpisodeState$ProtoEpisodeCollectionState) aVar8.buildPartial();
                                }
                                this.a |= 1024;
                                continue;
                            case 106:
                                EpisodeState$ProtoEpisodePlayState.a aVar9 = (this.a & 2048) == 2048 ? (EpisodeState$ProtoEpisodePlayState.a) this.w.toBuilder() : null;
                                EpisodeState$ProtoEpisodePlayState episodeState$ProtoEpisodePlayState = (EpisodeState$ProtoEpisodePlayState) gVar.o(EpisodeState$ProtoEpisodePlayState.parser(), kVar);
                                this.w = episodeState$ProtoEpisodePlayState;
                                if (aVar9 != null) {
                                    aVar9.mergeFrom((EpisodeState$ProtoEpisodePlayState.a) episodeState$ProtoEpisodePlayState);
                                    this.w = (EpisodeState$ProtoEpisodePlayState) aVar9.buildPartial();
                                }
                                this.a |= 2048;
                                continue;
                            default:
                                if (parseUnknownField(B, gVar)) {
                                    continue;
                                }
                                break;
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
                this.s.C();
                return null;
            case 4:
                return new PlaylistPlaylistRequest$ProtoPlaylistItem();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (y == null) {
                    synchronized (PlaylistPlaylistRequest$ProtoPlaylistItem.class) {
                        if (y == null) {
                            y = new GeneratedMessageLite.c(x);
                        }
                    }
                }
                return y;
            default:
                throw new UnsupportedOperationException();
        }
        return x;
    }

    public boolean e() {
        return (this.a & 512) == 512;
    }

    public EpisodeState$ProtoEpisodeCollectionState f() {
        EpisodeState$ProtoEpisodeCollectionState episodeState$ProtoEpisodeCollectionState = this.v;
        return episodeState$ProtoEpisodeCollectionState == null ? EpisodeState$ProtoEpisodeCollectionState.h() : episodeState$ProtoEpisodeCollectionState;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int p2 = (this.a & 1) == 1 ? CodedOutputStream.p(1, this.b) + 0 : 0;
        if ((this.a & 2) == 2) {
            p2 += CodedOutputStream.s(2, this.c);
        }
        if ((this.a & 4) == 4) {
            p2 += CodedOutputStream.n(3, i());
        }
        if ((this.a & 8) == 8) {
            p2 += CodedOutputStream.n(4, r());
        }
        if ((this.a & 16) == 16) {
            p2 += CodedOutputStream.n(5, q());
        }
        if ((this.a & 32) == 32) {
            p2 += CodedOutputStream.n(6, s());
        }
        if ((this.a & 64) == 64) {
            p2 += CodedOutputStream.p(7, this.q);
        }
        if ((this.a & 128) == 128) {
            p2 += CodedOutputStream.n(8, t());
        }
        for (int i2 = 0; i2 < this.s.size(); i2++) {
            p2 += CodedOutputStream.n(9, this.s.get(i2));
        }
        if ((this.a & 256) == 256) {
            p2 += CodedOutputStream.n(10, k());
        }
        if ((this.a & 512) == 512) {
            p2 += CodedOutputStream.n(11, b());
        }
        if ((this.a & 1024) == 1024) {
            p2 += CodedOutputStream.n(12, f());
        }
        if ((this.a & 2048) == 2048) {
            p2 += CodedOutputStream.n(13, l());
        }
        int c2 = this.unknownFields.c() + p2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public int h() {
        return this.c;
    }

    public PlaylistUserState$ProtoUser i() {
        PlaylistUserState$ProtoUser playlistUserState$ProtoUser = this.f;
        return playlistUserState$ProtoUser == null ? PlaylistUserState$ProtoUser.h() : playlistUserState$ProtoUser;
    }

    public boolean j() {
        return (this.a & 1024) == 1024;
    }

    public EpisodeMetadata$ProtoEpisodeMetadata k() {
        EpisodeMetadata$ProtoEpisodeMetadata episodeMetadata$ProtoEpisodeMetadata = this.t;
        return episodeMetadata$ProtoEpisodeMetadata == null ? EpisodeMetadata$ProtoEpisodeMetadata.i() : episodeMetadata$ProtoEpisodeMetadata;
    }

    public EpisodeState$ProtoEpisodePlayState l() {
        EpisodeState$ProtoEpisodePlayState episodeState$ProtoEpisodePlayState = this.w;
        return episodeState$ProtoEpisodePlayState == null ? EpisodeState$ProtoEpisodePlayState.h() : episodeState$ProtoEpisodePlayState;
    }

    public int m() {
        return this.s.size();
    }

    public List<PlaylistPlaylistMetadata$ProtoPlaylistFormatListAttribute> n() {
        return this.s;
    }

    public String o() {
        return this.b;
    }

    public String p() {
        return this.q;
    }

    public TrackState$ProtoTrackCollectionState q() {
        TrackState$ProtoTrackCollectionState trackState$ProtoTrackCollectionState = this.o;
        return trackState$ProtoTrackCollectionState == null ? TrackState$ProtoTrackCollectionState.l() : trackState$ProtoTrackCollectionState;
    }

    public TrackMetadata$ProtoTrackMetadata r() {
        TrackMetadata$ProtoTrackMetadata trackMetadata$ProtoTrackMetadata = this.n;
        return trackMetadata$ProtoTrackMetadata == null ? TrackMetadata$ProtoTrackMetadata.n() : trackMetadata$ProtoTrackMetadata;
    }

    public TrackState$ProtoTrackOfflineState s() {
        TrackState$ProtoTrackOfflineState trackState$ProtoTrackOfflineState = this.p;
        return trackState$ProtoTrackOfflineState == null ? TrackState$ProtoTrackOfflineState.h() : trackState$ProtoTrackOfflineState;
    }

    public TrackState$ProtoTrackPlayState t() {
        TrackState$ProtoTrackPlayState trackState$ProtoTrackPlayState = this.r;
        return trackState$ProtoTrackPlayState == null ? TrackState$ProtoTrackPlayState.h() : trackState$ProtoTrackPlayState;
    }

    public boolean u() {
        return (this.a & 4) == 4;
    }

    public boolean v() {
        return (this.a & 2048) == 2048;
    }

    public boolean w() {
        return (this.a & 1) == 1;
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
            codedOutputStream.M(3, i());
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.M(4, r());
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.M(5, q());
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.M(6, s());
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.P(7, this.q);
        }
        if ((this.a & 128) == 128) {
            codedOutputStream.M(8, t());
        }
        for (int i = 0; i < this.s.size(); i++) {
            codedOutputStream.M(9, this.s.get(i));
        }
        if ((this.a & 256) == 256) {
            codedOutputStream.M(10, k());
        }
        if ((this.a & 512) == 512) {
            codedOutputStream.M(11, b());
        }
        if ((this.a & 1024) == 1024) {
            codedOutputStream.M(12, f());
        }
        if ((this.a & 2048) == 2048) {
            codedOutputStream.M(13, l());
        }
        this.unknownFields.l(codedOutputStream);
    }

    public boolean x() {
        return (this.a & 16) == 16;
    }

    public boolean y() {
        return (this.a & 8) == 8;
    }

    public boolean z() {
        return (this.a & 32) == 32;
    }
}
