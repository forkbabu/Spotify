package defpackage;

import com.spotify.player.controls.d;
import com.spotify.rxjava2.q;

/* renamed from: oe3  reason: default package */
public final class oe3 implements fjf<ne3> {
    private final wlf<d> a;
    private final wlf<q> b;

    public oe3(wlf<d> wlf, wlf<q> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ne3(this.a.get(), this.b.get());
    }
}
