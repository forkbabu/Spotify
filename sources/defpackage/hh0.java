package defpackage;

import com.spotify.collection.endpoints.listenlater.models.EpisodeUriList;
import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.DELETE;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.show.proto.ListenLaterCosmosResponse$ProtoListenLaterEpisodesResponse;
import io.reactivex.s;
import io.reactivex.z;
import java.util.Map;

@CosmosService
/* renamed from: hh0  reason: default package */
public interface hh0 {
    @POST("sp://listen-later/episodes/offline")
    z<Response> a();

    @DELETE("sp://listen-later/episodes/offline")
    z<Response> b();

    @SUB("sp://listen-later/episodes")
    s<ListenLaterCosmosResponse$ProtoListenLaterEpisodesResponse> c(@QueryMap Map<String, String> map);

    @POST("sp://listen-later/items")
    z<Response> d(@Body EpisodeUriList episodeUriList);

    @DELETE("sp://listen-later/items")
    z<Response> e(@Body EpisodeUriList episodeUriList);
}
