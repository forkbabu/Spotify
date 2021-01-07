package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Query;
import com.spotify.libs.search.offline.model.OfflineResults;
import io.reactivex.z;

@CosmosService
/* renamed from: lz0  reason: default package */
public interface lz0 {
    @GET("sp://offlinesearch/v1?limit=-1")
    z<OfflineResults> a(@Query("query") String str);
}
