package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.DELETE;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.router.Response;
import com.spotify.libs.connect.model.LoginIntent;
import com.spotify.libs.connect.model.LogoutResponse;
import com.spotify.music.features.connect.cast.discovery.DiscoveredDevice;
import io.reactivex.s;
import io.reactivex.z;

@CosmosService
@Deprecated
/* renamed from: cn4  reason: default package */
public interface cn4 {
    @PUT("sp://connect-device/v1/device/{deviceId}")
    z<Response> a(@Path("deviceId") String str, @Body DiscoveredDevice discoveredDevice);

    @SUB("sp://connect-device/v1/login")
    s<LoginIntent> b();

    @PUT("sp://connect-device/v1/login/{deviceId}")
    z<Response> c(@Path("deviceId") String str, @Body DiscoveredDevice discoveredDevice);

    @DELETE("sp://connect-device/v1/device/{deviceId}")
    z<Response> d(@Path("deviceId") String str, @Body DiscoveredDevice discoveredDevice);

    @SUB("sp://connect-device/v1/logout")
    s<LogoutResponse> logout();
}
