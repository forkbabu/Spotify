package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JacksonModel;
import io.reactivex.s;
import io.reactivex.z;

@CosmosService
/* renamed from: iwc  reason: default package */
public interface iwc {
    @GET("sp://prefs/v1/{preference_name}")
    z<Response> a(@Path("preference_name") String str);

    @PUT("sp://prefs/v1")
    z<Response> b(@Body JacksonModel jacksonModel);

    @SUB("sp://prefs/v1/{preference_name}")
    s<Response> c(@Path("preference_name") String str);
}
