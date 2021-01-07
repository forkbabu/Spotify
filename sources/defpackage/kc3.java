package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.mobile.android.cosmos.player.v2.queue.PlayerV2Endpoint;

/* renamed from: kc3  reason: default package */
public final class kc3 implements fjf<PlayerV2Endpoint> {
    private final wlf<Cosmonaut> a;

    public kc3(wlf<Cosmonaut> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        PlayerV2Endpoint playerV2Endpoint = (PlayerV2Endpoint) this.a.get().createCosmosService(PlayerV2Endpoint.class);
        yif.g(playerV2Endpoint, "Cannot return null from a non-@Nullable @Provides method");
        return playerV2Endpoint;
    }
}
