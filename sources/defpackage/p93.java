package defpackage;

import com.spotify.cosmos.android.RemoteNativeRouter;
import com.spotify.cosmos.android.RxCosmos;
import com.spotify.mobile.android.coreintegration.h0;
import com.spotify.mobile.android.service.feature.q;
import io.reactivex.s;

/* renamed from: p93  reason: default package */
public final class p93 implements fjf<s<RemoteNativeRouter>> {
    private final wlf<q> a;
    private final wlf<RxCosmos> b;
    private final wlf<h0> c;

    public p93(wlf<q> wlf, wlf<RxCosmos> wlf2, wlf<h0> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        s<RemoteNativeRouter> sVar;
        RxCosmos rxCosmos = this.b.get();
        h0 h0Var = this.c.get();
        if (this.a.get().a()) {
            sVar = h0Var.a();
        } else {
            sVar = rxCosmos.getRouter();
        }
        yif.g(sVar, "Cannot return null from a non-@Nullable @Provides method");
        return sVar;
    }
}
