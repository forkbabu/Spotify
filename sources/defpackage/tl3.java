package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.music.features.ads.model.Targetings;
import io.reactivex.z;
import java.util.Map;

@CosmosService
/* renamed from: tl3  reason: default package */
public interface tl3 {
    @PUT("sp://ads/v1/targeting/{path}")
    z<Targetings> a(@Path("path") String str, @Body Map<String, String> map);
}
