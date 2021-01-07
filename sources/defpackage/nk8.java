package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import com.spotify.music.features.settings.adapter.model.ResyncBitratePreference;
import io.reactivex.a;

@CosmosService
/* renamed from: nk8  reason: default package */
public interface nk8 {
    @PUT("sp://prefs/v1")
    a a(@Body ResyncBitratePreference resyncBitratePreference);
}
