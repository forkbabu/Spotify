package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.router.Response;
import io.reactivex.z;

@CosmosService
/* renamed from: cv1  reason: default package */
public interface cv1 {
    @GET("hm://bakery/accountscookie")
    z<Response> a();
}
