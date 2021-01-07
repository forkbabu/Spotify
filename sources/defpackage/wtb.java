package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: wtb  reason: default package */
public final class wtb implements fjf<Player> {
    private final wlf<PlayerFactory> a;

    public wtb(wlf<PlayerFactory> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Player create = this.a.get().create(ViewUris.A.toString(), kfd.S, bu9.f);
        yif.g(create, "Cannot return null from a non-@Nullable @Provides method");
        return create;
    }
}
