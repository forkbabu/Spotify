package defpackage;

import com.google.common.base.Predicate;
import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosResponse$EpisodeSegments;

/* renamed from: x77  reason: default package */
public final /* synthetic */ class x77 implements Predicate {
    public final /* synthetic */ String a;

    public /* synthetic */ x77(String str) {
        this.a = str;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        PodcastSegmentsCosmosResponse$EpisodeSegments podcastSegmentsCosmosResponse$EpisodeSegments = (PodcastSegmentsCosmosResponse$EpisodeSegments) obj;
        return podcastSegmentsCosmosResponse$EpisodeSegments != null && this.a.equals(podcastSegmentsCosmosResponse$EpisodeSegments.l());
    }
}
