package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.DELETE;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.libs.connect.model.LogoutRequest;
import com.spotify.libs.connect.model.Message;
import com.spotify.music.features.connect.cast.discovery.DiscoveredDevice;
import io.reactivex.a;
import io.reactivex.s;

@CosmosService
/* renamed from: zm4  reason: default package */
public interface zm4 {
    @PUT("sp://connect-cast/v1/message")
    a a(@Body Message message);

    @PUT("sp://connect-cast/v1/connect")
    a b(@Body String str);

    @SUB("sp://connect-cast/v1/message")
    s<String> c();

    @DELETE("sp://connect-cast/v1/device/{deviceId}")
    a d(@Path("deviceId") String str, @Body DiscoveredDevice discoveredDevice);

    @PUT("sp://connect-cast/v1/device/{deviceId}")
    a e(@Path("deviceId") String str, @Body DiscoveredDevice discoveredDevice);

    @SUB("sp://connect-cast/v1/connect")
    s<String> f();

    @SUB("sp://connect-cast/v1/logout")
    s<LogoutRequest> logout();
}
