package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.music.features.settings.model.OfflineResources;
import io.reactivex.z;

@CosmosService
/* renamed from: mk8  reason: default package */
public interface mk8 {
    @GET("sp://offline/v1/resources")
    z<OfflineResources> a();
}
