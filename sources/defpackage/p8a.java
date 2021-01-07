package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.music.libs.collection.json.AlbumEntityJacksonModel;
import io.reactivex.s;
import io.reactivex.z;
import java.util.Map;

@CosmosService
/* renamed from: p8a  reason: default package */
public interface p8a {
    @GET("sp://core-collection/unstable/{username}/list/albums/all")
    z<Response> a(@Path("username") String str, @QueryMap Map<String, String> map, @Body Policy policy);

    @SUB("sp://core-collection/unstable/{username}/list/albums/all")
    s<Response> b(@Path("username") String str, @QueryMap Map<String, String> map, @Body Policy policy);

    @GET("sp://core-collection/unstable/%40/view/album/{albumId}")
    z<AlbumEntityJacksonModel> c(@Path("albumId") String str, @QueryMap Map<String, String> map, @Body Policy policy);
}
