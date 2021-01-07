package com.spotify.music.libs.podcast.loader;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowRequest$ProtoShowResponse;
import io.reactivex.z;
import java.util.Map;

@CosmosService
public interface n {
    @GET("sp://core-show/v1/shows/{showId}")
    z<ShowShowRequest$ProtoShowResponse> a(@Path("showId") String str, @QueryMap Map<String, String> map, @Body Policy policy);
}
