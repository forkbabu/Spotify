package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.util.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.proto.ShowDecorationPolicy;
import com.spotify.cosmos.util.proto.TrackDecorationPolicy;
import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy;
import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosRequest$PodcastSegmentsRequest;
import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosRequest$TrackDecorationPolicy;
import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosResponse$PodcastSegmentsResponse;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.podcast.episode.inspector.tracklist.model.d;
import com.spotify.podcast.endpoints.s;
import com.spotify.remoteconfig.q6;
import io.reactivex.z;

/* access modifiers changed from: package-private */
/* renamed from: c87  reason: default package */
public class c87 implements b87 {
    private final s a;
    private final e87 b;
    private final q6 c;

    c87(s sVar, e87 e87, q6 q6Var) {
        this.a = sVar;
        this.b = e87;
        this.c = q6Var;
    }

    private static d b(String str) {
        d.a b2 = d.b();
        b2.d(ImmutableList.of());
        b2.g(str);
        b2.e(false);
        return b2.build();
    }

    @Override // defpackage.b87
    public z<d> a(l0 l0Var) {
        if (!this.c.a()) {
            d.a b2 = d.b();
            b2.d(ImmutableList.of());
            b2.g(l0Var.B());
            b2.e(false);
            return z.z(b2.build());
        }
        String B = l0Var.B();
        if (B == null || l0Var.q() != LinkType.SHOW_EPISODE) {
            String x0 = je.x0("Invalid Link for EpisodeTrackListRepository:", B);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(x0);
            Logger.e(illegalArgumentException, x0, new Object[0]);
            return z.q(illegalArgumentException);
        }
        PodcastSegmentsCosmosRequest$TrackDecorationPolicy.a m = PodcastSegmentsCosmosRequest$TrackDecorationPolicy.m();
        m.o((TrackDecorationPolicy) TrackDecorationPolicy.newBuilder().setName(true).setLink(true).build());
        m.n((ArtistDecorationPolicy) ArtistDecorationPolicy.newBuilder().setName(true).build());
        m.m((AlbumDecorationPolicy) AlbumDecorationPolicy.newBuilder().setCovers(true).build());
        PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy.a l = PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy.l();
        l.m((EpisodeDecorationPolicy) EpisodeDecorationPolicy.newBuilder().setLink(true).setName(true).setCovers(true).build());
        l.n((ShowDecorationPolicy) ShowDecorationPolicy.newBuilder().setLink(true).setName(true).setCovers(true).build());
        PodcastSegmentsCosmosRequest$PodcastSegmentsRequest.a n = PodcastSegmentsCosmosRequest$PodcastSegmentsRequest.n();
        n.m(B);
        n.p(m);
        n.n(l);
        return this.a.a((PodcastSegmentsCosmosRequest$PodcastSegmentsRequest) n.build()).A(new z77(this, B)).D(new y77(B));
    }

    public d c(String str, PodcastSegmentsCosmosResponse$PodcastSegmentsResponse podcastSegmentsCosmosResponse$PodcastSegmentsResponse) {
        return (d) Collections2.tryFind(podcastSegmentsCosmosResponse$PodcastSegmentsResponse.h(), new x77(str)).transform(new a87(str, this.b)).or((Optional) b(str));
    }
}
