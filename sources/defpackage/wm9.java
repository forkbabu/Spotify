package defpackage;

import com.spotify.player.model.PlayerState;
import defpackage.vm9;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: wm9  reason: default package */
public final class wm9 implements fjf<vm9.b> {
    private final wlf<lm9> a;
    private final wlf<y> b;
    private final wlf<g<PlayerState>> c;

    public wm9(wlf<lm9> wlf, wlf<y> wlf2, wlf<g<PlayerState>> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vm9.b(this.a.get(), this.b.get(), this.c.get());
    }
}
