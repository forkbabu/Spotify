package defpackage;

import com.spotify.player.options.d;
import com.spotify.player.stateful.q;

/* renamed from: bub  reason: default package */
public final class bub implements fjf<d> {
    private final wlf<q> a;

    public bub(wlf<q> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        d b = this.a.get().b();
        yif.g(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
