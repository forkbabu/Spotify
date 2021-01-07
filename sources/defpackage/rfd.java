package defpackage;

import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import io.reactivex.z;
import java.util.Map;

/* renamed from: rfd  reason: default package */
public interface rfd {
    @zqf("dailymix/v5/dailymix_tracks/{stationUri}")
    z<RadioStationTracksModel> a(@mrf("stationUri") String str, @orf Map<String, String> map);

    @zqf("dailymix/v5/dailymix_stations/{seed}?image_style=gradient_overlay")
    z<RadioStationModel> b(@mrf("seed") String str, @nrf("count") int i, @orf Map<String, String> map);
}
