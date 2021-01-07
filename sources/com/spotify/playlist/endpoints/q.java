package com.spotify.playlist.endpoints;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Headers;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.router.Response;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;
import com.spotify.playlist.proto.PlaylistContainsRequest$ContainsRequest;
import io.reactivex.s;
import io.reactivex.z;
import java.util.Map;

@CosmosService
public interface q {
    @GET("sp://core-playlist/v1/rootlist/offline_playlists_containing_item/{itemUri}?responseFormat=protobuf")
    @Headers({"content-type: application/protobuf", "accept: application/protobuf"})
    z<Response> a(@Path("itemUri") String str);

    @SUB("sp://core-playlist/v1/rootlist/{folderId}")
    s<Response> b(@Path("folderId") String str, @QueryMap Map<String, String> map, @Body RootlistRequestPayload rootlistRequestPayload);

    @GET("sp://core-playlist/v1/rootlist")
    z<Response> c(@QueryMap Map<String, String> map, @Body RootlistRequestPayload rootlistRequestPayload);

    @GET("sp://core-playlist/v1/rootlist/{folderId}")
    z<Response> d(@Path("folderId") String str, @QueryMap Map<String, String> map, @Body RootlistRequestPayload rootlistRequestPayload);

    @Headers({"content-type: application/protobuf", "accept: application/protobuf"})
    @POST("sp://core-playlist/v1/rootlist/contains?responseFormat=protobuf")
    z<Response> e(@Body PlaylistContainsRequest$ContainsRequest playlistContainsRequest$ContainsRequest);

    @SUB("sp://core-playlist/v1/rootlist")
    s<Response> f(@QueryMap Map<String, String> map, @Body RootlistRequestPayload rootlistRequestPayload);
}
