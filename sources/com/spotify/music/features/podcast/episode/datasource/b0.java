package com.spotify.music.features.podcast.episode.datasource;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.Query;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.router.Response;
import com.spotify.music.features.podcast.episode.datasource.RxEpisodeDataLoader;
import io.reactivex.s;

@CosmosService
public interface b0 {
    @SUB("sp://core-show/unstable/decorate?responseFormat=protobuf")
    s<Response> a(@Body RxEpisodeDataLoader.EpisodeRequestModel episodeRequestModel, @Query("preferCached") boolean z, @Query("updateThrottling") int i);
}
