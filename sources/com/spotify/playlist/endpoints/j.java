package com.spotify.playlist.endpoints;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.DELETE;
import com.spotify.cosmos.android.cosmonaut.annotations.Headers;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.router.Response;
import com.spotify.playlist.proto.PlaylistModificationRequest$ModificationRequest;
import com.spotify.playlist.proto.SyncRequest;
import io.reactivex.z;
import java.util.Map;

@CosmosService
public interface j {
    @Headers({"content-type: application/protobuf"})
    @POST("sp://core-playlist/v2/playlist/resync")
    z<Response> a(@Body SyncRequest syncRequest);

    @Headers({"content-type: application/protobuf", "accept: application/protobuf"})
    @POST("sp://core-playlist/v1/playlist/{uri}?responseFormat=protobuf")
    z<Response> b(@Path("uri") String str, @Body PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest);

    @DELETE("sp://core-playlist/v1/playlist/{uri}/offline")
    z<Response> c(@Path("uri") String str);

    @POST("sp://core-playlist/v1/playlist/{uri}/offline")
    z<Response> d(@Path("uri") String str, @QueryMap Map<String, String> map);
}
