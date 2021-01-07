package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: cfa  reason: default package */
public final class cfa implements fjf<Player> {
    private final wlf<PlayerFactory> a;

    public cfa(wlf<PlayerFactory> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Player create = this.a.get().create(ViewUris.j2.toString(), kfd.g1, bu9.y);
        yif.g(create, "Cannot return null from a non-@Nullable @Provides method");
        return create;
    }
}
