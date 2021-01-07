package defpackage;

import com.spotify.music.features.trackcredits.model.TrackCredits;
import io.reactivex.z;

/* renamed from: xt8  reason: default package */
public interface xt8 {
    @zqf("track-credits-view/v1/track/{trackId}/credits")
    z<TrackCredits> a(@mrf("trackId") String str);
}
