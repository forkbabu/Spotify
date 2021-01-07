package defpackage;

import com.spotify.player.controls.d;
import com.spotify.player.stateful.q;

/* renamed from: b8c  reason: default package */
public final class b8c implements fjf<d> {
    private final wlf<q> a;

    public b8c(wlf<q> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        d a2 = this.a.get().a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
