package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.router.Response;
import io.reactivex.z;
import java.util.Map;

@CosmosService
/* renamed from: rl3  reason: default package */
public interface rl3 {
    @POST("sp://ads/v1/reward")
    z<Response> a(@Body Map<String, Object> map);
}
