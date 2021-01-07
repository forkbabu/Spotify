package com.spotify.podcast.endpoints.collection;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.router.Response;
import io.reactivex.s;
import io.reactivex.z;
import java.util.Map;

@CosmosService
public interface j {
    @GET("sp://core-collection/unstable/{username}/list/episodes/union")
    z<Response> a(@Path("username") String str, @QueryMap Map<String, String> map, @Body CollectionEpisodesPolicy$Policy collectionEpisodesPolicy$Policy);

    @SUB("sp://core-collection/unstable/{username}/list/episodes/union")
    s<Response> b(@Path("username") String str, @QueryMap Map<String, String> map, @Body CollectionEpisodesPolicy$Policy collectionEpisodesPolicy$Policy);

    @GET("sp://core-collection/unstable/{username}/list/episodes/union")
    z<Response> c(@Path("username") String str, @QueryMap Map<String, String> map);

    @SUB("sp://core-collection/unstable/{username}/list/episodes/union")
    s<Response> d(@Path("username") String str, @QueryMap Map<String, String> map);
}
