package com.spotify.playlist.endpoints;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.Headers;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.router.Response;
import com.spotify.playlist.proto.PlaylistModificationRequest$ModificationRequest;
import io.reactivex.z;

@CosmosService
public interface w {
    @Headers({"content-type: application/protobuf", "accept: application/protobuf"})
    @POST("sp://core-playlist/v1/rootlist/{folderId}?responseFormat=protobuf")
    z<Response> a(@Path("folderId") String str, @Body PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest);

    @Headers({"content-type: application/protobuf", "accept: application/protobuf"})
    @POST("sp://core-playlist/v1/rootlist?responseFormat=protobuf")
    z<Response> b(@Body PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest);

    @Headers({"content-type: application/protobuf", "accept: application/protobuf"})
    @POST("sp://core-playlist/v1/rootlist?responseFormat=protobuf")
    z<Response> c(@Body PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest);
}
