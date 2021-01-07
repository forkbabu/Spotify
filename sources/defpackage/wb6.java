package defpackage;

import com.spotify.music.features.playlistentity.homemix.models.HomeMixTuning;
import io.reactivex.z;
import retrofit2.v;

/* renamed from: wb6  reason: default package */
public interface wb6 {
    @irf("home-mix/tuning/v1/tune/{playlistUri}")
    z<v<Void>> a(@mrf("playlistUri") String str, @uqf HomeMixTuning homeMixTuning);
}
