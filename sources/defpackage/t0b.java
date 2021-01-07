package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.music.libs.viewuri.c;

/* renamed from: t0b  reason: default package */
public final class t0b implements fjf<s0b> {
    private final wlf<Context> a;
    private final wlf<c.a> b;
    private final wlf<Player> c;

    public t0b(wlf<Context> wlf, wlf<c.a> wlf2, wlf<Player> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s0b(this.a.get(), this.b.get(), this.c.get());
    }
}
