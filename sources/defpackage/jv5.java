package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.music.features.offlinesync.OfflineProgressRootModel;
import io.reactivex.s;

@CosmosService
/* renamed from: jv5  reason: default package */
public interface jv5 {
    @SUB("sp://offline/v1/progress/total")
    s<OfflineProgressRootModel> a();
}
