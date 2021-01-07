package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import io.reactivex.a;

@CosmosService
/* renamed from: nl3  reason: default package */
public interface nl3 {
    @POST("sp://ads/v1/preview/{id}")
    a a(@Path("id") String str);
}
