package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.BodyPart;
import com.spotify.cosmos.android.cosmonaut.annotations.DELETE;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.router.Response;
import com.spotify.music.features.ads.model.AdSettingsModel;
import io.reactivex.z;

@CosmosService
/* renamed from: al3  reason: default package */
public interface al3 {
    @PUT("sp://ads/v1/settings/{slotId}/{fieldName}")
    z<Response> a(@Path("slotId") String str, @Path("fieldName") String str2, @BodyPart("value") String str3);

    @GET("sp://ads/v1/settings/{slotId}")
    z<AdSettingsModel> b(@Path("slotId") String str);

    @PUT("sp://ads/v1/settings/request_header/{fieldName}")
    z<Response> c(@Path("fieldName") String str, @BodyPart("value") String str2, @BodyPart("refresh_inventory") boolean z);

    @PUT("sp://ads/v1/settings/request_header/{fieldName}")
    z<Response> d(@Path("fieldName") String str, @BodyPart("value") String str2);

    @DELETE("sp://ads/v1/settings/request_header/{fieldName}")
    z<Response> e(@Path("fieldName") String str, @BodyPart("refresh_inventory") boolean z);
}
