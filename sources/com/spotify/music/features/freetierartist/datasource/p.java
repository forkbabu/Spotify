package com.spotify.music.features.freetierartist.datasource;

import io.reactivex.z;
import java.util.Map;
import okhttp3.e0;
import retrofit2.v;

public interface p {
    @zqf("artistview/v1/artist/{artistId}")
    z<v<e0>> a(@mrf("artistId") String str, @orf Map<String, String> map);
}
