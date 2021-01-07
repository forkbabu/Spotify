package defpackage;

import com.spotify.performancesdk.timekeeper.h;
import com.spotify.performancesdk.timekeeper.l;

/* renamed from: bma  reason: default package */
public final class bma implements fjf<ama> {
    private final wlf<h> a;
    private final wlf<l> b;

    public bma(wlf<h> wlf, wlf<l> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ama(this.a.get(), this.b.get());
    }
}
