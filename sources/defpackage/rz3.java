package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.Query;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.music.features.album.offline.model.OfflineState;
import com.spotify.music.features.album.offline.model.Policy;
import com.spotify.music.features.album.offline.model.TracksOfflineState;
import io.reactivex.s;
import io.reactivex.z;
import java.util.Map;

@CosmosService
/* renamed from: rz3  reason: default package */
public interface rz3 {
    @GET("sp://offline/v1/resources")
    z<TracksOfflineState> a(@Query("uris") String str);

    @SUB("sp://core-collection/unstable/@/view/album/{uri}")
    s<OfflineState> b(@Body Policy policy, @QueryMap Map<String, String> map, @Path("uri") String str);
}
