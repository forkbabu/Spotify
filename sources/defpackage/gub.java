package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: gub  reason: default package */
public final class gub implements fjf<Player> {
    private final wlf<PlayerFactory> a;

    public gub(wlf<PlayerFactory> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Player create = this.a.get().create(ViewUris.B.toString(), kfd.T, bu9.g);
        yif.g(create, "Cannot return null from a non-@Nullable @Provides method");
        return create;
    }
}
