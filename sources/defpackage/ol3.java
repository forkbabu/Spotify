package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.router.Response;
import com.spotify.music.features.ads.model.AdSlot;
import io.reactivex.a;
import io.reactivex.z;
import java.util.Map;

@CosmosService
/* renamed from: ol3  reason: default package */
public interface ol3 {
    @PUT("sp://ads/v1/slots/{slotId}")
    z<Response> a(@Path("slotId") String str, @Body AdSlot adSlot);

    @POST("sp://ads/v1/slots/{slotId}/{intentName}")
    z<Response> b(@Path("slotId") String str, @Path("intentName") String str2, @Body Map<String, ?> map);

    @POST("sp://ads/v1/slots/{slotId}/{intentName}")
    a c(@Path("slotId") String str, @Path("intentName") String str2, @Body Map<String, ?> map);
}
