package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.BodyPart;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import com.spotify.cosmos.router.Response;
import io.reactivex.z;

@CosmosService
/* renamed from: ul3  reason: default package */
public interface ul3 {
    @PUT("sp://device_state/volume")
    z<Response> a(@BodyPart("value") double d);
}
