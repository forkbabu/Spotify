package com.spotify.music.features.home.common.datasource;

import io.reactivex.z;
import java.util.Map;
import okhttp3.e0;
import retrofit2.v;

public interface g {
    @zqf("homeview/v1/home")
    z<v<e0>> a(@orf Map<String, String> map, @crf("Cache-Control") String str);
}
