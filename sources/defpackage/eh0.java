package defpackage;

import com.spotify.mobile.android.spotlets.collection.proto.ArtistMetadata$ProtoArtistMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.ArtistState$ProtoArtistCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.ArtistState$ProtoArtistOfflineState;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionArtistsRequest$ProtoCollectionArtistsItem;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionArtistsRequest$ProtoCollectionArtistsResponse;
import com.spotify.mobile.android.spotlets.show.proto.ImageGroup$ProtoImageGroup;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.b;
import com.spotify.playlist.models.i;
import com.spotify.playlist.models.offline.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: eh0  reason: default package */
public final class eh0 {

    /* renamed from: eh0$a */
    public static final class a implements i<b> {
        private final List<b> a;
        private final boolean b;
        private final int c;
        private final int f;

        a(CollectionArtistsRequest$ProtoCollectionArtistsResponse collectionArtistsRequest$ProtoCollectionArtistsResponse) {
            b bVar;
            List<CollectionArtistsRequest$ProtoCollectionArtistsItem> h = collectionArtistsRequest$ProtoCollectionArtistsResponse.h();
            h.d(h, "protoArtistResponse.itemList");
            ArrayList arrayList = new ArrayList(d.e(h, 10));
            for (T t : h) {
                h.d(t, "it");
                h.e(t, "from");
                ArtistMetadata$ProtoArtistMetadata i = t.p() ? t.i() : null;
                ArtistState$ProtoArtistOfflineState o = t.s() ? t.o() : null;
                ArtistState$ProtoArtistCollectionState l = t.q() ? t.l() : null;
                String n = t.r() ? t.n() : null;
                int h2 = t.h();
                String m = t.m();
                a.f fVar = a.f.a;
                if (!(n == null || n.length() == 0)) {
                    b.a aVar = new b.a(0, "", "", null, null, false, false, null, 0, 0, false, je.Q(null, null, null, null, 15), fVar, fVar);
                    aVar.h(n);
                    bVar = aVar.b();
                } else if (i == null) {
                    bVar = new b.a(0, "", "", null, null, false, false, null, 0, 0, false, je.Q(null, null, null, null, 15), fVar, fVar).b();
                } else {
                    Covers b2 = eh0.b(i.n() ? i.h() : null);
                    int m2 = o != null ? o.m() : 0;
                    b.a aVar2 = new b.a(0, "", "", null, null, false, false, null, 0, 0, false, je.Q(null, null, null, null, 15), fVar, fVar);
                    aVar2.d(b2);
                    String l2 = i.l();
                    h.d(l2, "artist.link");
                    aVar2.n(l2);
                    String m3 = i.m();
                    h.d(m3, "artist.name");
                    aVar2.j(m3);
                    aVar2.o(i.getIsVariousArtists());
                    aVar2.l(l != null ? l.o() : 0);
                    aVar2.k(l != null ? l.n() : 0);
                    aVar2.c(l != null ? l.h() : null);
                    aVar2.a(h2);
                    aVar2.m(com.spotify.playlist.models.offline.b.a(o != null ? o.l() : null, m2));
                    aVar2.i(com.spotify.playlist.models.offline.b.a(o != null ? o.i() : null, m2));
                    aVar2.e(l != null && l.m());
                    aVar2.f(l != null && l.l());
                    aVar2.g(m);
                    bVar = aVar2.b();
                }
                arrayList.add(bVar);
            }
            this.a = arrayList;
            this.b = collectionArtistsRequest$ProtoCollectionArtistsResponse.i();
            this.c = collectionArtistsRequest$ProtoCollectionArtistsResponse.l();
            this.f = collectionArtistsRequest$ProtoCollectionArtistsResponse.m();
        }

        @Override // com.spotify.playlist.models.i
        public List<b> getItems() {
            return this.a;
        }

        @Override // com.spotify.playlist.models.i
        public int getUnfilteredLength() {
            return this.c;
        }

        @Override // com.spotify.playlist.models.i
        public int getUnrangedLength() {
            return this.f;
        }

        @Override // com.spotify.playlist.models.i
        public boolean isLoading() {
            return this.b;
        }
    }

    public static final i<b> a(CollectionArtistsRequest$ProtoCollectionArtistsResponse collectionArtistsRequest$ProtoCollectionArtistsResponse) {
        h.e(collectionArtistsRequest$ProtoCollectionArtistsResponse, "from");
        return new a(collectionArtistsRequest$ProtoCollectionArtistsResponse);
    }

    public static final Covers b(ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup) {
        if (imageGroup$ProtoImageGroup == null) {
            return new Covers.a(null, null, null, null, 15).a();
        }
        Covers.a aVar = new Covers.a(null, null, null, null, 15);
        String m = imageGroup$ProtoImageGroup.m();
        h.d(m, "covers.standardLink");
        aVar.d(m);
        aVar.c(imageGroup$ProtoImageGroup.l());
        aVar.b(imageGroup$ProtoImageGroup.i());
        aVar.e(imageGroup$ProtoImageGroup.n());
        return aVar.a();
    }
}
