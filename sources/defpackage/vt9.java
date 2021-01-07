package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Query;
import com.spotify.http.wg.TokenResponse;
import io.reactivex.z;

@CosmosService
/* renamed from: vt9  reason: default package */
public interface vt9 {
    @GET("hm://keymaster/token/authenticated")
    z<TokenResponse> a(@Query("client_id") String str, @Query("scope") String str2, @Query("alt") String str3);
}
