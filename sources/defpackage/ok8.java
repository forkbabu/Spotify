package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.DELETE;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.router.Response;
import io.reactivex.a;
import io.reactivex.z;

@CosmosService
/* renamed from: ok8  reason: default package */
public interface ok8 {
    @DELETE("sp://storage/v1/unlocked-items")
    a a();

    @GET("sp://storage/v1/statistics")
    z<Response> b();
}
