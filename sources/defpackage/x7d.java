package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import io.reactivex.a;

@CosmosService
/* renamed from: x7d  reason: default package */
public interface x7d {
    @PUT("sp://social-listening/v1/session/set-not-active")
    a a();

    @PUT("sp://social-listening/v1/session/set-active")
    a setActive();
}
