package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.router.Response;
import io.reactivex.z;
import java.util.Map;

@CosmosService
/* renamed from: pl3  reason: default package */
public interface pl3 {
    @PUT("sp://ads/v2/state")
    z<Response> a(@Body Map<String, String> map);

    @PUT("sp://ads/v2/state/{stateName}")
    z<Response> b(@Body Map<String, String> map, @Path("stateName") String str);
}
