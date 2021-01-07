package com.spotify.music.features.yourlibrary.musicpages.filtertags.loader;

import io.reactivex.z;
import java.util.Map;

public interface a {
    @erf({"Accept: application/json"})
    @zqf("content-filter/v1/liked-songs")
    z<FilterTagsResponse> a(@orf Map<String, String> map);
}
