package defpackage;

import com.spotify.collection.endpoints.artist.policy.Policy;
import com.spotify.collection.endpoints.common.player.PlayPayload;
import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.DELETE;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionArtistsRequest$ProtoCollectionArtistsResponse;
import io.reactivex.s;
import io.reactivex.z;
import java.util.Map;

@CosmosService
/* renamed from: wg0  reason: default package */
public interface wg0 {
    @SUB("sp://core-collection/unstable/@/list/artists/all")
    s<CollectionArtistsRequest$ProtoCollectionArtistsResponse> a(@QueryMap Map<String, String> map, @Body Policy policy);

    @GET("sp://core-collection/unstable/@/list/artists/all")
    z<CollectionArtistsRequest$ProtoCollectionArtistsResponse> b(@QueryMap Map<String, String> map, @Body Policy policy);

    @SUB("sp://core-collection/unstable/@/list/tracks/artist/{b62-artist-id}")
    s<Response> c(@Path("b62-artist-id") String str, @QueryMap Map<String, String> map, @Body Policy policy);

    @POST("sp://core-collection/unstable/@/list/tracks/artist/{b62-artist-id}/play")
    z<Response> d(@Path("b62-artist-id") String str, @QueryMap Map<String, String> map, @Body PlayPayload playPayload);

    @SUB("sp://core-collection/unstable/@/view/artist/{b62-artist-id}")
    s<Response> e(@Path("b62-artist-id") String str, @QueryMap Map<String, String> map, @Body Policy policy);

    @DELETE("sp://core-collection/unstable/@/list/tracks/artist/{b62-artist-id}/offline")
    z<Response> f(@Path("b62-artist-id") String str, @QueryMap Map<String, String> map);

    @POST("sp://core-collection/unstable/@/list/tracks/artist/{b62-artist-id}/offline")
    z<Response> g(@Path("b62-artist-id") String str, @QueryMap Map<String, String> map);
}
