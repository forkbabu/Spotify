package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackAlbumArtistMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackAlbumMetadata;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.a;
import com.spotify.playlist.models.b;
import com.spotify.playlist.models.offline.a;
import kotlin.jvm.internal.h;

/* renamed from: ci0  reason: default package */
public final class ci0 {
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x028e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.ni0 a(com.spotify.mobile.android.spotlets.collection.proto.CollectionTracksRequest$ProtoCollectionTracksResponse r31) {
        /*
        // Method dump skipped, instructions count: 782
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci0.a(com.spotify.mobile.android.spotlets.collection.proto.CollectionTracksRequest$ProtoCollectionTracksResponse):ni0");
    }

    private static final a b(TrackMetadata$ProtoTrackAlbumMetadata trackMetadata$ProtoTrackAlbumMetadata) {
        b bVar;
        if (trackMetadata$ProtoTrackAlbumMetadata == null) {
            return new a.C0376a(0, 0, null, 0, null, 0, null, null, null, null, 0, null, false, false, null, null, null, null, 262143).e();
        }
        TrackMetadata$ProtoTrackAlbumArtistMetadata trackMetadata$ProtoTrackAlbumArtistMetadata = null;
        Covers b = eh0.b(trackMetadata$ProtoTrackAlbumMetadata.p() ? trackMetadata$ProtoTrackAlbumMetadata.i() : null);
        if (trackMetadata$ProtoTrackAlbumMetadata.o()) {
            trackMetadata$ProtoTrackAlbumArtistMetadata = trackMetadata$ProtoTrackAlbumMetadata.h();
        }
        a.f fVar = a.f.a;
        if (trackMetadata$ProtoTrackAlbumArtistMetadata == null) {
            bVar = new b.a(0, "", "", null, null, false, false, null, 0, 0, false, je.Q(null, null, null, null, 15), fVar, fVar).b();
        } else {
            b.a aVar = new b.a(0, "", "", null, null, false, false, null, 0, 0, false, je.Q(null, null, null, null, 15), fVar, fVar);
            String i = trackMetadata$ProtoTrackAlbumArtistMetadata.i();
            h.d(i, "protoArtistMetadata.link");
            aVar.n(i);
            String l = trackMetadata$ProtoTrackAlbumArtistMetadata.l();
            h.d(l, "protoArtistMetadata.name");
            aVar.j(l);
            bVar = aVar.b();
        }
        a.C0376a aVar2 = new a.C0376a(0, 0, null, 0, null, 0, null, null, null, null, 0, null, false, false, null, null, null, null, 262143);
        aVar2.c(bVar);
        aVar2.h(b);
        String m = trackMetadata$ProtoTrackAlbumMetadata.m();
        h.d(m, "protoAlbumMetadata.link");
        aVar2.r(m);
        String n = trackMetadata$ProtoTrackAlbumMetadata.n();
        h.d(n, "protoAlbumMetadata.name");
        aVar2.l(n);
        ImmutableList of = ImmutableList.of(bVar);
        h.d(of, "ImmutableList.of(\n      …     artist\n            )");
        aVar2.d(of);
        return aVar2.e();
    }
}
