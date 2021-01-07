package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.DELETE;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.recentlyplayed.model.DeleteModel;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.a;
import io.reactivex.s;
import io.reactivex.z;
import java.util.Map;

@CosmosService
/* renamed from: fb1  reason: default package */
public interface fb1 {
    @GET("sp://core-recently-played/unstable/items")
    z<RecentlyPlayedItems> a(@QueryMap Map<String, String> map, @Body Policy policy);

    @DELETE("sp://core-recently-played/unstable/items")
    a b(@Body DeleteModel deleteModel);

    @SUB("sp://core-recently-played/unstable/items")
    s<RecentlyPlayedItems> c(@QueryMap Map<String, String> map, @Body Policy policy);
}
