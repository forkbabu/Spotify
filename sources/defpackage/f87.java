package defpackage;

import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosResponse$DecoratedSegment;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.podcast.episode.inspector.tracklist.model.TrackListItemType;

/* renamed from: f87  reason: default package */
public class f87 implements e87 {
    @Override // defpackage.e87
    public TrackListItemType a(PodcastSegmentsCosmosResponse$DecoratedSegment podcastSegmentsCosmosResponse$DecoratedSegment) {
        TrackListItemType trackListItemType = TrackListItemType.UNKNOWN;
        TrackListItemType trackListItemType2 = TrackListItemType.MUSIC;
        TrackListItemType trackListItemType3 = TrackListItemType.SPOKEN;
        int ordinal = podcastSegmentsCosmosResponse$DecoratedSegment.q().ordinal();
        if (ordinal == 0) {
            int ordinal2 = l0.z(podcastSegmentsCosmosResponse$DecoratedSegment.r()).q().ordinal();
            if (ordinal2 != 237) {
                return ordinal2 != 273 ? trackListItemType : trackListItemType2;
            }
            return trackListItemType3;
        } else if (ordinal != 1) {
            return ordinal != 2 ? trackListItemType : trackListItemType2;
        } else {
            return trackListItemType3;
        }
    }
}
