package defpackage;

import com.spotify.mobile.android.util.ui.k;
import defpackage.dt2;
import kotlin.jvm.internal.h;

/* renamed from: et2  reason: default package */
public final class et2 implements fjf<zvd> {
    private final wlf<k> a;
    private final wlf<rwd> b;

    public et2(wlf<k> wlf, wlf<rwd> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        k kVar = this.a.get();
        rwd rwd = this.b.get();
        dt2.a aVar = dt2.a;
        h.e(kVar, "listenable");
        h.e(rwd, "spotifyPicasso");
        zvd d = rwd.d();
        awd.E2(d, kVar);
        h.d(d, "CancellablePicassoLifecy… listenable\n            )");
        return d;
    }
}
