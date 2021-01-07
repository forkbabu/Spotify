package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.collection.proto.AlbumMetadata$ProtoAlbumArtistMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.AlbumMetadata$ProtoAlbumMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.AlbumState$ProtoAlbumCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.AlbumState$ProtoAlbumOfflineState;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionAlbumsRequest$ProtoCollectionAlbumsItem;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionAlbumsRequest$ProtoCollectionAlbumsResponse;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionDecorateRequest$ProtoDecorateAlbumItem;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionDecorateRequest$ProtoDecorateResponse;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackAlbumArtistMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackAlbumMetadata;
import com.spotify.mobile.android.spotlets.show.proto.ImageGroup$ProtoImageGroup;
import com.spotify.mobile.android.util.x;
import com.spotify.music.libs.collection.model.d;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.a;
import com.spotify.playlist.models.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: iaa  reason: default package */
public final class iaa {
    public static d a(CollectionAlbumsRequest$ProtoCollectionAlbumsResponse collectionAlbumsRequest$ProtoCollectionAlbumsResponse) {
        ArrayList arrayList = new ArrayList(collectionAlbumsRequest$ProtoCollectionAlbumsResponse.h());
        for (CollectionAlbumsRequest$ProtoCollectionAlbumsItem collectionAlbumsRequest$ProtoCollectionAlbumsItem : collectionAlbumsRequest$ProtoCollectionAlbumsResponse.i()) {
            String str = null;
            AlbumMetadata$ProtoAlbumMetadata i = collectionAlbumsRequest$ProtoCollectionAlbumsItem.p() ? collectionAlbumsRequest$ProtoCollectionAlbumsItem.i() : null;
            AlbumState$ProtoAlbumOfflineState o = collectionAlbumsRequest$ProtoCollectionAlbumsItem.s() ? collectionAlbumsRequest$ProtoCollectionAlbumsItem.o() : null;
            AlbumState$ProtoAlbumCollectionState l = collectionAlbumsRequest$ProtoCollectionAlbumsItem.q() ? collectionAlbumsRequest$ProtoCollectionAlbumsItem.l() : null;
            if (collectionAlbumsRequest$ProtoCollectionAlbumsItem.r()) {
                str = collectionAlbumsRequest$ProtoCollectionAlbumsItem.n();
            }
            arrayList.add(b(i, o, l, str, collectionAlbumsRequest$ProtoCollectionAlbumsItem.h(), collectionAlbumsRequest$ProtoCollectionAlbumsItem.m()));
        }
        d.a b = d.b();
        b.a(ImmutableList.copyOf((Collection) arrayList));
        b.c(collectionAlbumsRequest$ProtoCollectionAlbumsResponse.l());
        b.d(collectionAlbumsRequest$ProtoCollectionAlbumsResponse.m());
        b.b(collectionAlbumsRequest$ProtoCollectionAlbumsResponse.n());
        return b.build();
    }

    private static a b(AlbumMetadata$ProtoAlbumMetadata albumMetadata$ProtoAlbumMetadata, AlbumState$ProtoAlbumOfflineState albumState$ProtoAlbumOfflineState, AlbumState$ProtoAlbumCollectionState albumState$ProtoAlbumCollectionState, String str, int i, String str2) {
        int i2;
        int i3;
        if (!MoreObjects.isNullOrEmpty(str)) {
            a.C0376a a = a.a();
            a.j(str);
            return a.e();
        } else if (albumMetadata$ProtoAlbumMetadata == null) {
            return a.a().e();
        } else {
            String str3 = null;
            Covers e = e(albumMetadata$ProtoAlbumMetadata.u() ? albumMetadata$ProtoAlbumMetadata.n() : null);
            boolean z = false;
            b d = d(albumMetadata$ProtoAlbumMetadata.i() > 0 ? albumMetadata$ProtoAlbumMetadata.h(0) : null);
            int i4 = ImmutableList.a;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            for (AlbumMetadata$ProtoAlbumArtistMetadata albumMetadata$ProtoAlbumArtistMetadata : albumMetadata$ProtoAlbumMetadata.l()) {
                builder.mo53add((ImmutableList.Builder) d(albumMetadata$ProtoAlbumArtistMetadata));
            }
            if (albumState$ProtoAlbumOfflineState == null) {
                i2 = 0;
            } else {
                i2 = albumState$ProtoAlbumOfflineState.m();
            }
            a.C0376a a2 = a.a();
            a2.h(e);
            a2.c(d);
            a2.a(i);
            a2.r(albumMetadata$ProtoAlbumMetadata.p());
            a2.l(albumMetadata$ProtoAlbumMetadata.q());
            a2.s(albumMetadata$ProtoAlbumMetadata.t());
            a2.m(albumMetadata$ProtoAlbumMetadata.r());
            a2.f((String) x.n(albumState$ProtoAlbumCollectionState == null ? null : albumState$ProtoAlbumCollectionState.h(), ""));
            if (albumState$ProtoAlbumCollectionState == null) {
                i3 = 0;
            } else {
                i3 = albumState$ProtoAlbumCollectionState.m();
            }
            a2.o(i3);
            a2.n(albumMetadata$ProtoAlbumMetadata.s());
            if (albumState$ProtoAlbumCollectionState != null && albumState$ProtoAlbumCollectionState.i()) {
                z = true;
            }
            a2.q(z);
            a2.b(albumMetadata$ProtoAlbumMetadata.getPlayability());
            a2.g((String) x.n(albumMetadata$ProtoAlbumMetadata.m(), ""));
            a2.d(builder.build());
            a2.p(com.spotify.playlist.models.offline.b.a(albumState$ProtoAlbumOfflineState == null ? null : albumState$ProtoAlbumOfflineState.l(), i2));
            if (albumState$ProtoAlbumOfflineState != null) {
                str3 = albumState$ProtoAlbumOfflineState.i();
            }
            a2.k(com.spotify.playlist.models.offline.b.a(str3, i2));
            a2.i(str2);
            return a2.e();
        }
    }

    public static a c(TrackMetadata$ProtoTrackAlbumMetadata trackMetadata$ProtoTrackAlbumMetadata) {
        b bVar;
        if (trackMetadata$ProtoTrackAlbumMetadata == null) {
            return a.a().e();
        }
        TrackMetadata$ProtoTrackAlbumArtistMetadata trackMetadata$ProtoTrackAlbumArtistMetadata = null;
        Covers e = e(trackMetadata$ProtoTrackAlbumMetadata.p() ? trackMetadata$ProtoTrackAlbumMetadata.i() : null);
        if (trackMetadata$ProtoTrackAlbumMetadata.o()) {
            trackMetadata$ProtoTrackAlbumArtistMetadata = trackMetadata$ProtoTrackAlbumMetadata.h();
        }
        if (trackMetadata$ProtoTrackAlbumArtistMetadata == null) {
            bVar = b.a().b();
        } else {
            b.a a = b.a();
            a.n(trackMetadata$ProtoTrackAlbumArtistMetadata.i());
            a.j(trackMetadata$ProtoTrackAlbumArtistMetadata.l());
            bVar = a.b();
        }
        a.C0376a a2 = a.a();
        a2.c(bVar);
        a2.h(e);
        a2.r(trackMetadata$ProtoTrackAlbumMetadata.m());
        a2.l(trackMetadata$ProtoTrackAlbumMetadata.n());
        a2.d(ImmutableList.of(bVar));
        return a2.e();
    }

    private static b d(AlbumMetadata$ProtoAlbumArtistMetadata albumMetadata$ProtoAlbumArtistMetadata) {
        if (albumMetadata$ProtoAlbumArtistMetadata == null) {
            return b.a().b();
        }
        b.a a = b.a();
        a.n(albumMetadata$ProtoAlbumArtistMetadata.h());
        a.j(albumMetadata$ProtoAlbumArtistMetadata.i());
        return a.b();
    }

    public static Covers e(ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup) {
        if (imageGroup$ProtoImageGroup == null) {
            return Covers.a().a();
        }
        Covers.a a = Covers.a();
        a.d((String) x.n(imageGroup$ProtoImageGroup.m(), ""));
        a.c((String) x.n(imageGroup$ProtoImageGroup.l(), ""));
        a.b((String) x.n(imageGroup$ProtoImageGroup.i(), ""));
        a.e((String) x.n(imageGroup$ProtoImageGroup.n(), ""));
        return a.a();
    }

    public static Map<String, a> f(CollectionDecorateRequest$ProtoDecorateResponse collectionDecorateRequest$ProtoDecorateResponse) {
        if (collectionDecorateRequest$ProtoDecorateResponse == null) {
            return null;
        }
        HashMap hashMap = new HashMap(collectionDecorateRequest$ProtoDecorateResponse.h());
        for (CollectionDecorateRequest$ProtoDecorateAlbumItem collectionDecorateRequest$ProtoDecorateAlbumItem : collectionDecorateRequest$ProtoDecorateResponse.i()) {
            hashMap.put(collectionDecorateRequest$ProtoDecorateAlbumItem.l(), b(collectionDecorateRequest$ProtoDecorateAlbumItem.n() ? collectionDecorateRequest$ProtoDecorateAlbumItem.h() : null, collectionDecorateRequest$ProtoDecorateAlbumItem.p() ? collectionDecorateRequest$ProtoDecorateAlbumItem.m() : null, collectionDecorateRequest$ProtoDecorateAlbumItem.o() ? collectionDecorateRequest$ProtoDecorateAlbumItem.i() : null, null, 0, null));
        }
        return hashMap;
    }
}
