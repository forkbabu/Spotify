package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackAlbumArtistMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackAlbumMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackArtistMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState$ProtoTrackCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState$ProtoTrackOfflineState;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState$ProtoTrackPlayState;
import com.spotify.mobile.android.spotlets.show.proto.ImageGroup$ProtoImageGroup;
import com.spotify.mobile.android.util.x;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.OnDemandInFreeReason;
import com.spotify.playlist.models.PlayabilityRestriction;
import com.spotify.playlist.models.a;
import com.spotify.playlist.models.b;
import com.spotify.playlist.models.f;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.o;
import com.spotify.playlist.models.offline.a;
import com.spotify.playlist.models.offline.b;
import com.spotify.playlist.models.p;
import com.spotify.playlist.models.q;
import com.spotify.playlist.proto.PlaylistFolderMetadata$ProtoFolderMetadata;
import com.spotify.playlist.proto.PlaylistPlaylistMetadata$ProtoPlaylistFormatListAttribute;
import com.spotify.playlist.proto.PlaylistPlaylistMetadata$ProtoPlaylistMetadata;
import com.spotify.playlist.proto.PlaylistPlaylistState$ProtoPlaylistOfflineState;
import com.spotify.playlist.proto.PlaylistRootlistRequest$ProtoPlaylistRootFolder;
import com.spotify.playlist.proto.PlaylistRootlistRequest$ProtoPlaylistRootItem;
import com.spotify.playlist.proto.PlaylistRootlistRequest$ProtoPlaylistRootPlaylist;
import com.spotify.playlist.proto.PlaylistRootlistRequest$ProtoPlaylistRootResponse;
import com.spotify.playlist.proto.PlaylistUserState$ProtoUser;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

/* renamed from: rxd  reason: default package */
public final class rxd {
    private static final Covers a(ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup) {
        if (imageGroup$ProtoImageGroup == null) {
            return new Covers.a(null, null, null, null, 15).a();
        }
        Covers.a aVar = new Covers.a(null, null, null, null, 15);
        Object n = x.n(imageGroup$ProtoImageGroup.m(), "");
        h.d(n, "com.spotify.mobile.andro… \"\"\n                    )");
        aVar.d((String) n);
        aVar.c((String) x.n(imageGroup$ProtoImageGroup.l(), ""));
        aVar.b((String) x.n(imageGroup$ProtoImageGroup.i(), ""));
        aVar.e((String) x.n(imageGroup$ProtoImageGroup.n(), ""));
        return aVar.a();
    }

    private static final j b(PlaylistPlaylistMetadata$ProtoPlaylistMetadata playlistPlaylistMetadata$ProtoPlaylistMetadata, PlaylistPlaylistState$ProtoPlaylistOfflineState playlistPlaylistState$ProtoPlaylistOfflineState, String str, int i, Optional<Boolean> optional, OnDemandInFreeReason onDemandInFreeReason, Optional<Boolean> optional2, String str2) {
        if (playlistPlaylistMetadata$ProtoPlaylistMetadata == null) {
            return new j.a(null, 0, null, null, 0, null, null, null, null, false, null, null, false, false, false, null, false, null, false, false, false, null, false, null, null, null, null, 134217727).d();
        }
        String str3 = null;
        Covers a = a(playlistPlaylistMetadata$ProtoPlaylistMetadata.F() ? playlistPlaylistMetadata$ProtoPlaylistMetadata.A() : null);
        p f = f(playlistPlaylistMetadata$ProtoPlaylistMetadata.E() ? playlistPlaylistMetadata$ProtoPlaylistMetadata.y() : null);
        p f2 = f(playlistPlaylistMetadata$ProtoPlaylistMetadata.D() ? playlistPlaylistMetadata$ProtoPlaylistMetadata.v() : null);
        ImmutableMap.Builder builder = ImmutableMap.builder();
        if (playlistPlaylistMetadata$ProtoPlaylistMetadata.q() > 0) {
            for (PlaylistPlaylistMetadata$ProtoPlaylistFormatListAttribute playlistPlaylistMetadata$ProtoPlaylistFormatListAttribute : playlistPlaylistMetadata$ProtoPlaylistMetadata.r()) {
                h.d(playlistPlaylistMetadata$ProtoPlaylistFormatListAttribute, "attribute");
                builder.mo51put(playlistPlaylistMetadata$ProtoPlaylistFormatListAttribute.h(), playlistPlaylistMetadata$ProtoPlaylistFormatListAttribute.i());
            }
        }
        if (playlistPlaylistState$ProtoPlaylistOfflineState != null) {
            str3 = playlistPlaylistState$ProtoPlaylistOfflineState.i();
        }
        int l = playlistPlaylistState$ProtoPlaylistOfflineState != null ? playlistPlaylistState$ProtoPlaylistOfflineState.l() : 0;
        j.a aVar = new j.a(null, 0, null, null, 0, null, null, null, null, false, null, null, false, false, false, null, false, null, false, false, false, null, false, null, null, null, null, 134217727);
        aVar.w(f);
        aVar.z(str);
        aVar.f(a);
        aVar.b(i);
        aVar.r(f2);
        aVar.m(str2);
        aVar.o(optional2.orNull());
        aVar.p(optional.orNull());
        aVar.u(onDemandInFreeReason);
        aVar.q(playlistPlaylistMetadata$ProtoPlaylistMetadata.t());
        aVar.j(playlistPlaylistMetadata$ProtoPlaylistMetadata.p());
        aVar.y(playlistPlaylistMetadata$ProtoPlaylistMetadata.B());
        ImmutableMap build = builder.build();
        h.d(build, "formatListAttributes.build()");
        aVar.k(build);
        aVar.v(playlistPlaylistMetadata$ProtoPlaylistMetadata.x());
        aVar.g(playlistPlaylistMetadata$ProtoPlaylistMetadata.n());
        aVar.A(playlistPlaylistMetadata$ProtoPlaylistMetadata.C());
        aVar.e(playlistPlaylistMetadata$ProtoPlaylistMetadata.l());
        aVar.l(playlistPlaylistMetadata$ProtoPlaylistMetadata.s());
        aVar.c(playlistPlaylistMetadata$ProtoPlaylistMetadata.h());
        aVar.x(playlistPlaylistMetadata$ProtoPlaylistMetadata.z());
        aVar.a(playlistPlaylistMetadata$ProtoPlaylistMetadata.i());
        Object n = x.n(playlistPlaylistMetadata$ProtoPlaylistMetadata.u(), "");
        h.d(n, "com.spotify.mobile.andro…     \"\"\n                )");
        aVar.B((String) n);
        Object n2 = x.n(playlistPlaylistMetadata$ProtoPlaylistMetadata.w(), "");
        h.d(n2, "com.spotify.mobile.andro…     \"\"\n                )");
        aVar.s((String) n2);
        aVar.h(playlistPlaylistMetadata$ProtoPlaylistMetadata.o());
        aVar.t(b.a(str3, l));
        return aVar.d();
    }

    private static final j c(PlaylistRootlistRequest$ProtoPlaylistRootItem playlistRootlistRequest$ProtoPlaylistRootItem) {
        PlaylistPlaylistMetadata$ProtoPlaylistMetadata playlistPlaylistMetadata$ProtoPlaylistMetadata;
        if (!MoreObjects.isNullOrEmpty(playlistRootlistRequest$ProtoPlaylistRootItem.i())) {
            j.a aVar = new j.a(null, 0, null, null, 0, null, null, null, null, false, null, null, false, false, false, null, false, null, false, false, false, null, false, null, null, null, null, 134217727);
            aVar.n(playlistRootlistRequest$ProtoPlaylistRootItem.i());
            return aVar.d();
        }
        PlaylistPlaylistState$ProtoPlaylistOfflineState playlistPlaylistState$ProtoPlaylistOfflineState = null;
        if (playlistRootlistRequest$ProtoPlaylistRootItem.m()) {
            PlaylistRootlistRequest$ProtoPlaylistRootFolder h = playlistRootlistRequest$ProtoPlaylistRootItem.h();
            h.d(h, "folder");
            String o = h.o();
            int h2 = h.h();
            String m = h.m();
            if (!h.p()) {
                return null;
            }
            int i = ImmutableList.a;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            for (PlaylistRootlistRequest$ProtoPlaylistRootItem playlistRootlistRequest$ProtoPlaylistRootItem2 : h.n()) {
                h.d(playlistRootlistRequest$ProtoPlaylistRootItem2, "item");
                j c = c(playlistRootlistRequest$ProtoPlaylistRootItem2);
                if (c != null) {
                    builder.mo53add((ImmutableList.Builder) c);
                }
            }
            ImmutableList build = builder.build();
            f.a aVar2 = new f.a("", 0, "", 0, null, 0, 0, 0, false, null, 0, 0, EmptyList.a);
            aVar2.k(o);
            aVar2.e(false);
            aVar2.a(h2);
            aVar2.c(m);
            ImmutableList build2 = builder.build();
            h.d(build2, "playlistsBuilder.build()");
            aVar2.d(build2);
            aVar2.m(build.size());
            aVar2.l(build.size());
            PlaylistFolderMetadata$ProtoFolderMetadata l = h.l();
            h.d(l, "response.folderMetadata");
            aVar2.g(l.m());
            PlaylistFolderMetadata$ProtoFolderMetadata l2 = h.l();
            h.d(l2, "response.folderMetadata");
            aVar2.h(l2.n());
            PlaylistFolderMetadata$ProtoFolderMetadata l3 = h.l();
            h.d(l3, "response.folderMetadata");
            aVar2.i(l3.o());
            PlaylistFolderMetadata$ProtoFolderMetadata l4 = h.l();
            h.d(l4, "response.folderMetadata");
            Object n = x.n(l4.i(), "");
            h.d(n, "com.spotify.mobile.andro…     \"\"\n                )");
            aVar2.n((String) n);
            PlaylistFolderMetadata$ProtoFolderMetadata l5 = h.l();
            h.d(l5, "response.folderMetadata");
            Object n2 = x.n(l5.l(), "");
            h.d(n2, "com.spotify.mobile.andro…     \"\"\n                )");
            aVar2.f((String) n2);
            PlaylistFolderMetadata$ProtoFolderMetadata l6 = h.l();
            h.d(l6, "response.folderMetadata");
            aVar2.j(l6.p());
            f b = aVar2.b();
            j.a aVar3 = new j.a(null, 0, null, null, 0, null, null, null, null, false, null, null, false, false, false, null, false, null, false, false, false, null, false, null, null, null, null, 134217727);
            aVar3.B("");
            aVar3.z(o);
            aVar3.i(b);
            aVar3.b(h2);
            aVar3.m(m);
            PlaylistFolderMetadata$ProtoFolderMetadata l7 = h.l();
            h.d(l7, "response.folderMetadata");
            Object n3 = x.n(l7.l(), "");
            h.d(n3, "com.spotify.mobile.andro…     \"\"\n                )");
            aVar3.s((String) n3);
            return aVar3.d();
        }
        PlaylistRootlistRequest$ProtoPlaylistRootPlaylist l8 = playlistRootlistRequest$ProtoPlaylistRootItem.l();
        if (l8.r()) {
            h.d(l8, "playlist");
            playlistPlaylistMetadata$ProtoPlaylistMetadata = l8.n();
        } else {
            playlistPlaylistMetadata$ProtoPlaylistMetadata = null;
        }
        if (l8.s()) {
            h.d(l8, "playlist");
            playlistPlaylistState$ProtoPlaylistOfflineState = l8.o();
        }
        h.d(l8, "playlist");
        String p = l8.p();
        int h3 = l8.h();
        Optional of = l8.q() ? Optional.of(Boolean.valueOf(l8.m())) : Optional.absent();
        h.d(of, "if (playlist.hasIsOnDema…e) else Optional.absent()");
        OnDemandInFreeReason onDemandInFreeReason = OnDemandInFreeReason.UNKNOWN;
        Optional absent = Optional.absent();
        h.d(absent, "Optional.absent()");
        return b(playlistPlaylistMetadata$ProtoPlaylistMetadata, playlistPlaylistState$ProtoPlaylistOfflineState, p, h3, of, onDemandInFreeReason, absent, l8.l());
    }

    /* JADX WARNING: Removed duplicated region for block: B:144:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0397 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.spotify.playlist.models.k d(com.spotify.playlist.proto.PlaylistPlaylistRequest$ProtoPlaylistResponse r40) {
        /*
        // Method dump skipped, instructions count: 1412
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rxd.d(com.spotify.playlist.proto.PlaylistPlaylistRequest$ProtoPlaylistResponse):com.spotify.playlist.models.k");
    }

    private static final o e(TrackMetadata$ProtoTrackMetadata trackMetadata$ProtoTrackMetadata, TrackState$ProtoTrackOfflineState trackState$ProtoTrackOfflineState, TrackState$ProtoTrackCollectionState trackState$ProtoTrackCollectionState, TrackState$ProtoTrackPlayState trackState$ProtoTrackPlayState, int i, String str) {
        ImmutableList.Builder builder;
        a aVar;
        PlayabilityRestriction playabilityRestriction;
        String str2;
        Covers covers;
        com.spotify.playlist.models.b bVar;
        ImmutableList.Builder builder2;
        com.spotify.playlist.models.b bVar2;
        a.f fVar = a.f.a;
        if (!MoreObjects.isNullOrEmpty(str)) {
            o.a builder3 = o.builder();
            builder3.i(str);
            return builder3.build();
        }
        TrackMetadata$ProtoTrackAlbumArtistMetadata trackMetadata$ProtoTrackAlbumArtistMetadata = null;
        if (trackMetadata$ProtoTrackMetadata == null) {
            return null;
        }
        List<TrackMetadata$ProtoTrackArtistMetadata> m = trackMetadata$ProtoTrackMetadata.m();
        int i2 = ImmutableList.a;
        ImmutableList.Builder builder4 = new ImmutableList.Builder();
        for (TrackMetadata$ProtoTrackArtistMetadata trackMetadata$ProtoTrackArtistMetadata : m) {
            if (trackMetadata$ProtoTrackArtistMetadata == null) {
                builder2 = builder4;
                bVar2 = new b.a(0, "", "", null, null, false, false, null, 0, 0, false, je.Q(null, null, null, null, 15), fVar, fVar).b();
            } else {
                builder2 = builder4;
                b.a aVar2 = new b.a(0, "", "", null, null, false, false, null, 0, 0, false, je.Q(null, null, null, null, 15), fVar, fVar);
                String h = trackMetadata$ProtoTrackArtistMetadata.h();
                h.d(h, "artist.link");
                aVar2.n(h);
                String i3 = trackMetadata$ProtoTrackArtistMetadata.i();
                h.d(i3, "artist.name");
                aVar2.j(i3);
                bVar2 = aVar2.b();
            }
            builder2.mo53add((ImmutableList.Builder) bVar2);
            builder4 = builder2;
        }
        TrackMetadata$ProtoTrackAlbumMetadata h2 = trackMetadata$ProtoTrackMetadata.u() ? trackMetadata$ProtoTrackMetadata.h() : null;
        if (h2 == null) {
            aVar = new a.C0376a(0, 0, null, 0, null, 0, null, null, null, null, 0, null, false, false, null, null, null, null, 262143).e();
            builder = builder4;
        } else {
            Covers a = a(h2.p() ? h2.i() : null);
            if (h2.o()) {
                trackMetadata$ProtoTrackAlbumArtistMetadata = h2.h();
            }
            if (trackMetadata$ProtoTrackAlbumArtistMetadata == null) {
                covers = a;
                builder = builder4;
                bVar = new b.a(0, "", "", null, null, false, false, null, 0, 0, false, je.Q(null, null, null, null, 15), fVar, fVar).b();
            } else {
                covers = a;
                builder = builder4;
                b.a aVar3 = new b.a(0, "", "", null, null, false, false, null, 0, 0, false, je.Q(null, null, null, null, 15), fVar, fVar);
                String i4 = trackMetadata$ProtoTrackAlbumArtistMetadata.i();
                h.d(i4, "artist.link");
                aVar3.n(i4);
                String l = trackMetadata$ProtoTrackAlbumArtistMetadata.l();
                h.d(l, "artist.name");
                aVar3.j(l);
                bVar = aVar3.b();
            }
            a.C0376a aVar4 = new a.C0376a(0, 0, null, 0, null, 0, null, null, null, null, 0, null, false, false, null, null, null, null, 262143);
            aVar4.c(bVar);
            aVar4.h(covers);
            String m2 = h2.m();
            h.d(m2, "album.link");
            aVar4.r(m2);
            String n = h2.n();
            h.d(n, "album.name");
            aVar4.l(n);
            ImmutableList of = ImmutableList.of(bVar);
            h.d(of, "ImmutableList.of(artist)");
            aVar4.d(of);
            aVar = aVar4.e();
        }
        o.a emptyBuilder = o.emptyBuilder();
        emptyBuilder.g(aVar);
        emptyBuilder.v(builder.build());
        emptyBuilder.k(i);
        emptyBuilder.f(trackMetadata$ProtoTrackMetadata.p());
        emptyBuilder.d(trackMetadata$ProtoTrackMetadata.q());
        emptyBuilder.r(ImmutableList.of());
        emptyBuilder.l(trackMetadata$ProtoTrackMetadata.o());
        emptyBuilder.q(trackMetadata$ProtoTrackMetadata.getIsLocal());
        emptyBuilder.x(trackMetadata$ProtoTrackMetadata.getHasLyrics());
        emptyBuilder.o(trackMetadata$ProtoTrackMetadata.s());
        emptyBuilder.a(trackMetadata$ProtoTrackMetadata.getIsExplicit());
        emptyBuilder.w(trackMetadata$ProtoTrackMetadata.getIs19PlusOnly());
        emptyBuilder.t(trackMetadata$ProtoTrackMetadata.getIsPremiumOnly());
        emptyBuilder.p(trackMetadata$ProtoTrackMetadata.r());
        emptyBuilder.m(trackMetadata$ProtoTrackMetadata.getAvailable());
        boolean z = true;
        emptyBuilder.c(trackState$ProtoTrackCollectionState != null && trackState$ProtoTrackCollectionState.i());
        emptyBuilder.n(trackState$ProtoTrackCollectionState != null && trackState$ProtoTrackCollectionState.n());
        emptyBuilder.u(trackState$ProtoTrackCollectionState != null && trackState$ProtoTrackCollectionState.h());
        emptyBuilder.h(trackState$ProtoTrackCollectionState != null && trackState$ProtoTrackCollectionState.m());
        if (trackState$ProtoTrackPlayState != null && trackState$ProtoTrackPlayState.m() && !trackState$ProtoTrackPlayState.i()) {
            z = false;
        }
        emptyBuilder.b(z);
        if (trackState$ProtoTrackPlayState != null) {
            playabilityRestriction = q.k(trackState$ProtoTrackPlayState.l());
        } else {
            playabilityRestriction = PlayabilityRestriction.UNKNOWN;
        }
        emptyBuilder.j(playabilityRestriction);
        if (trackState$ProtoTrackOfflineState == null) {
            str2 = "";
        } else {
            str2 = trackState$ProtoTrackOfflineState.i();
        }
        emptyBuilder.e(com.spotify.playlist.models.offline.b.a(str2, 0));
        return emptyBuilder.build();
    }

    public static final p f(PlaylistUserState$ProtoUser playlistUserState$ProtoUser) {
        if (playlistUserState$ProtoUser == null) {
            return new p.a(null, null, null, null, null, false, 63).a();
        }
        boolean z = !MoreObjects.isNullOrEmpty(playlistUserState$ProtoUser.i());
        String str = (String) x.n(playlistUserState$ProtoUser.o(), "");
        p.a aVar = new p.a(null, null, null, null, null, false, 63);
        h.d(str, "username");
        aVar.g(str);
        aVar.d(playlistUserState$ProtoUser.l());
        aVar.e(playlistUserState$ProtoUser.n());
        aVar.c(z);
        Object n = x.n(playlistUserState$ProtoUser.m(), "");
        h.d(n, "com.spotify.mobile.andro…fault(protoUser.link, \"\")");
        aVar.f((String) n);
        if (z) {
            str = playlistUserState$ProtoUser.i();
        }
        aVar.b(str);
        return aVar.a();
    }

    public static final f g(PlaylistRootlistRequest$ProtoPlaylistRootResponse playlistRootlistRequest$ProtoPlaylistRootResponse) {
        EmptyList emptyList = EmptyList.a;
        h.e(playlistRootlistRequest$ProtoPlaylistRootResponse, "response");
        if (!playlistRootlistRequest$ProtoPlaylistRootResponse.n() || !playlistRootlistRequest$ProtoPlaylistRootResponse.i().p()) {
            return new f.a("", 0, "", 0, null, 0, 0, 0, false, null, 0, 0, emptyList).b();
        }
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        PlaylistRootlistRequest$ProtoPlaylistRootFolder i2 = playlistRootlistRequest$ProtoPlaylistRootResponse.i();
        h.d(i2, "response.root");
        for (PlaylistRootlistRequest$ProtoPlaylistRootItem playlistRootlistRequest$ProtoPlaylistRootItem : i2.n()) {
            h.d(playlistRootlistRequest$ProtoPlaylistRootItem, "item");
            j c = c(playlistRootlistRequest$ProtoPlaylistRootItem);
            if (c != null) {
                builder.mo53add((ImmutableList.Builder) c);
            }
        }
        f.a aVar = new f.a("", 0, "", 0, null, 0, 0, 0, false, null, 0, 0, emptyList);
        aVar.e(false);
        ImmutableList build = builder.build();
        h.d(build, "playlists.build()");
        aVar.d(build);
        PlaylistRootlistRequest$ProtoPlaylistRootFolder i3 = playlistRootlistRequest$ProtoPlaylistRootResponse.i();
        h.d(i3, "response.root");
        aVar.k(i3.o());
        PlaylistRootlistRequest$ProtoPlaylistRootFolder i4 = playlistRootlistRequest$ProtoPlaylistRootResponse.i();
        h.d(i4, "response.root");
        aVar.a(i4.h());
        aVar.m(playlistRootlistRequest$ProtoPlaylistRootResponse.m());
        aVar.l(playlistRootlistRequest$ProtoPlaylistRootResponse.l());
        PlaylistRootlistRequest$ProtoPlaylistRootFolder i5 = playlistRootlistRequest$ProtoPlaylistRootResponse.i();
        h.d(i5, "response.root");
        PlaylistFolderMetadata$ProtoFolderMetadata l = i5.l();
        h.d(l, "response.root.folderMetadata");
        aVar.g(l.m());
        PlaylistRootlistRequest$ProtoPlaylistRootFolder i6 = playlistRootlistRequest$ProtoPlaylistRootResponse.i();
        h.d(i6, "response.root");
        PlaylistFolderMetadata$ProtoFolderMetadata l2 = i6.l();
        h.d(l2, "response.root.folderMetadata");
        aVar.h(l2.n());
        PlaylistRootlistRequest$ProtoPlaylistRootFolder i7 = playlistRootlistRequest$ProtoPlaylistRootResponse.i();
        h.d(i7, "response.root");
        PlaylistFolderMetadata$ProtoFolderMetadata l3 = i7.l();
        h.d(l3, "response.root.folderMetadata");
        aVar.i(l3.o());
        PlaylistRootlistRequest$ProtoPlaylistRootFolder i8 = playlistRootlistRequest$ProtoPlaylistRootResponse.i();
        h.d(i8, "response.root");
        PlaylistFolderMetadata$ProtoFolderMetadata l4 = i8.l();
        h.d(l4, "response.root.folderMetadata");
        Object n = x.n(l4.i(), "");
        h.d(n, "com.spotify.mobile.andro…     \"\"\n                )");
        aVar.n((String) n);
        PlaylistRootlistRequest$ProtoPlaylistRootFolder i9 = playlistRootlistRequest$ProtoPlaylistRootResponse.i();
        h.d(i9, "response.root");
        PlaylistFolderMetadata$ProtoFolderMetadata l5 = i9.l();
        h.d(l5, "response.root.folderMetadata");
        Object n2 = x.n(l5.l(), "");
        h.d(n2, "com.spotify.mobile.andro…     \"\"\n                )");
        aVar.f((String) n2);
        PlaylistRootlistRequest$ProtoPlaylistRootFolder i10 = playlistRootlistRequest$ProtoPlaylistRootResponse.i();
        h.d(i10, "response.root");
        PlaylistFolderMetadata$ProtoFolderMetadata l6 = i10.l();
        h.d(l6, "response.root.folderMetadata");
        aVar.j(l6.p());
        return aVar.b();
    }
}
