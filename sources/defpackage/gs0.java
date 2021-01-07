package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.Headers;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.router.Response;
import com.spotify.libs.connect.model.GaiaState;
import io.reactivex.s;
import io.reactivex.z;

@CosmosService
/* renamed from: gs0  reason: default package */
public interface gs0 {
    @SUB("sp://connect/v1/")
    s<GaiaState> a();

    @POST("sp://connect/v1/reportflow")
    z<Response> b(@Body String str);

    @POST("sp://connect/v1/discover")
    z<Response> c(@Body String str);

    @SUB("sp://connect/v1/")
    @Headers({"include-local-device: 1"})
    s<GaiaState> d();

    @SUB("sp://connect/v1/")
    @Headers({"include-local-device: 1", "exclude-non-local-devices: 1"})
    s<GaiaState> e();
}
