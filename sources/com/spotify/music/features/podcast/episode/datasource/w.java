package com.spotify.music.features.podcast.episode.datasource;

import io.reactivex.z;
import java.util.Map;
import okhttp3.e0;
import retrofit2.v;

public interface w {
    @zqf("vanilla/v1/views/hub2/nft/shows-episode-recommendations")
    z<v<e0>> a(@orf Map<String, String> map);
}
