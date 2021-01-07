package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Query;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.router.Response;
import io.reactivex.s;

@CosmosService
/* renamed from: v7d  reason: default package */
public interface v7d {
    @SUB("sp://server-push/notifications")
    s<Response> notifications(@Query("ident") String str);
}
