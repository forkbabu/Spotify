package defpackage;

import com.spotify.collection.endpoints.common.player.PlayPayload;
import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.DELETE;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import io.reactivex.s;
import io.reactivex.z;
import java.util.Map;

@CosmosService
/* renamed from: wh0  reason: default package */
public interface wh0 {
    @SUB("sp://core-collection/unstable/@/list/tracks/all")
    s<Response> a(@QueryMap Map<String, String> map, @Body Policy policy);

    @POST("sp://core-collection/unstable/@/list/tracks/all/play")
    z<Response> b(@QueryMap Map<String, String> map, @Body PlayPayload playPayload);

    @POST("sp://core-collection/unstable/@/list/tracks/all/offline")
    z<Response> c(@QueryMap Map<String, String> map);

    @GET("sp://core-collection/unstable/@/list/tracks/all")
    z<Response> d(@QueryMap Map<String, String> map, @Body Policy policy);

    @DELETE("sp://core-collection/unstable/@/list/tracks/all/offline")
    z<Response> e(@QueryMap Map<String, String> map);
}
