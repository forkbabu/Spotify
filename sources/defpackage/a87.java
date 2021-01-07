package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosResponse$DecoratedSegment;
import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosResponse$EpisodeSegments;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackArtistMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackMetadata;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata$ProtoEpisodeMetadata;
import com.spotify.music.features.podcast.episode.inspector.tracklist.model.c;
import com.spotify.music.features.podcast.episode.inspector.tracklist.model.d;
import java.util.List;

/* renamed from: a87  reason: default package */
public final /* synthetic */ class a87 implements Function {
    public final /* synthetic */ String a;
    public final /* synthetic */ e87 b;

    public /* synthetic */ a87(String str, e87 e87) {
        this.a = str;
        this.b = e87;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        String str = this.a;
        e87 e87 = this.b;
        PodcastSegmentsCosmosResponse$EpisodeSegments podcastSegmentsCosmosResponse$EpisodeSegments = (PodcastSegmentsCosmosResponse$EpisodeSegments) obj;
        d.a b2 = d.b();
        b2.g(str);
        b2.e(podcastSegmentsCosmosResponse$EpisodeSegments.getCanUpsell());
        String h = podcastSegmentsCosmosResponse$EpisodeSegments.h();
        if (h == null || h.isEmpty()) {
            h = null;
        }
        b2.c(h);
        b2.f(podcastSegmentsCosmosResponse$EpisodeSegments.i());
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (PodcastSegmentsCosmosResponse$DecoratedSegment podcastSegmentsCosmosResponse$DecoratedSegment : podcastSegmentsCosmosResponse$EpisodeSegments.m()) {
            TrackMetadata$ProtoTrackMetadata p = podcastSegmentsCosmosResponse$DecoratedSegment.p();
            EpisodeMetadata$ProtoEpisodeMetadata k = podcastSegmentsCosmosResponse$DecoratedSegment.k();
            c.a b3 = c.b();
            b3.l((long) podcastSegmentsCosmosResponse$DecoratedSegment.l());
            b3.b((long) podcastSegmentsCosmosResponse$DecoratedSegment.m());
            b3.h(podcastSegmentsCosmosResponse$DecoratedSegment.r());
            b3.f(p.q());
            b3.a(k.s());
            b3.k(podcastSegmentsCosmosResponse$DecoratedSegment.o());
            b3.c(podcastSegmentsCosmosResponse$DecoratedSegment.n());
            List<TrackMetadata$ProtoTrackArtistMetadata> m = p.m();
            int i2 = ImmutableList.a;
            ImmutableList.Builder builder2 = new ImmutableList.Builder();
            for (TrackMetadata$ProtoTrackArtistMetadata trackMetadata$ProtoTrackArtistMetadata : m) {
                if (trackMetadata$ProtoTrackArtistMetadata != null) {
                    builder2.mo53add((ImmutableList.Builder) trackMetadata$ProtoTrackArtistMetadata.i());
                }
            }
            b3.e(builder2.build());
            b3.i(podcastSegmentsCosmosResponse$DecoratedSegment.h());
            b3.j(p.h().i().m());
            b3.d(k.h().m());
            b3.m(e87.a(podcastSegmentsCosmosResponse$DecoratedSegment));
            b3.g(podcastSegmentsCosmosResponse$DecoratedSegment.i());
            builder.mo53add((ImmutableList.Builder) b3.build());
        }
        b2.d(builder.build());
        return b2.build();
    }
}
