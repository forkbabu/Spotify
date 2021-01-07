package defpackage;

import com.spotify.remoteconfig.qc;
import io.reactivex.g;

/* renamed from: m98  reason: default package */
public final class m98 implements fjf<g<b91>> {
    private final wlf<o4b> a;
    private final wlf<qc> b;
    private final wlf<n4b> c;

    public m98(wlf<o4b> wlf, wlf<qc> wlf2, wlf<n4b> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        g<b91> gVar;
        wlf<o4b> wlf = this.a;
        wlf<qc> wlf2 = this.b;
        wlf<n4b> wlf3 = this.c;
        if (wlf2.get().a()) {
            gVar = wlf3.get().c();
        } else {
            gVar = wlf.get().c();
        }
        yif.g(gVar, "Cannot return null from a non-@Nullable @Provides method");
        return gVar;
    }
}
