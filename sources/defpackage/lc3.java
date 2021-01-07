package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.music.libs.viewuri.c;

/* renamed from: lc3  reason: default package */
public final class lc3 implements fjf<Player> {
    private final wlf<PlayerFactory> a;
    private final wlf<c> b;
    private final wlf<ifd> c;
    private final wlf<yn0> d;

    public lc3(wlf<PlayerFactory> wlf, wlf<c> wlf2, wlf<ifd> wlf3, wlf<yn0> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    public static Player a(PlayerFactory playerFactory, c cVar, ifd ifd, yn0 yn0) {
        Player create = playerFactory.create(cVar.toString(), ifd, yn0);
        yif.g(create, "Cannot return null from a non-@Nullable @Provides method");
        return create;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
