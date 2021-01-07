package com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.network;

import io.reactivex.z;
import java.util.Map;
import okhttp3.e0;
import retrofit2.v;

public interface c {
    @zqf("npv-podcast-recs/v1/more-from-your-top-podcasts")
    z<v<e0>> a(@orf Map<String, String> map);
}
