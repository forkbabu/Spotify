package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.music.features.hiddencontent.model.BansResponse;
import io.reactivex.s;

@CosmosService
/* renamed from: gf5  reason: default package */
public interface gf5 {
    @SUB("sp://core-collection/unstable/bans?sort=addTime DESC")
    s<BansResponse> a();
}
