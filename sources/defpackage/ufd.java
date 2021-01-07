package defpackage;

import com.spotify.music.spotlets.radio.model.CreateRadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel;
import io.reactivex.a;
import io.reactivex.z;
import java.util.Map;

/* renamed from: ufd  reason: default package */
public interface ufd {
    @irf("radio-apollo/v5/stations")
    a a(@nrf("language") String str, @nrf("send_station") boolean z, @nrf("count") int i, @uqf CreateRadioStationModel createRadioStationModel);

    @irf("radio-apollo/v5/stations")
    z<TracksAndRadioStationModel> b(@nrf("language") String str, @nrf("prev_tracks") String str2);

    @zqf("radio-apollo/v5/tracks/{stationUri}")
    z<RadioStationTracksModel> c(@mrf("stationUri") String str, @orf Map<String, String> map);

    @zqf("radio-apollo/v5/stations/{seed}?image_style=gradient_overlay")
    z<RadioStationModel> d(@mrf("seed") String str, @nrf("count") int i, @orf Map<String, String> map);

    @zqf("radio-apollo/v5/all?image_style=gradient_overlay")
    z<RadioStationsModel> e(@nrf("language") String str);
}
