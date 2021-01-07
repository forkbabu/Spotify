package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.music.features.yourlibrary.musicpages.e1;

/* renamed from: pd9  reason: default package */
public final class pd9 implements fjf<od9> {
    private final wlf<qd9> a;
    private final wlf<Player> b;
    private final wlf<String> c;
    private final wlf<e1> d;
    private final wlf<bre> e;

    public pd9(wlf<qd9> wlf, wlf<Player> wlf2, wlf<String> wlf3, wlf<e1> wlf4, wlf<bre> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new od9(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
