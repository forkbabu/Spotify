package defpackage;

import com.spotify.player.sub.g;
import com.spotify.player.sub.l;

/* renamed from: tec  reason: default package */
public final class tec implements fjf<l> {
    private final wlf<nec> a;

    public tec(wlf<nec> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get());
    }
}
