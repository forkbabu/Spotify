package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import io.reactivex.a;
import java.util.Map;

@CosmosService
/* renamed from: ml3  reason: default package */
public interface ml3 {
    @POST("sp://ads/v1/events/{eventType}/{adId}")
    a a(@Body Map<String, Object> map, @Path("eventType") String str, @Path("adId") String str2);
}
