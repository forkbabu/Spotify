package defpackage;

import com.spotify.cosmos.android.RxResolverImpl;
import com.spotify.cosmos.router.RxRouterProvider;

/* renamed from: r93  reason: default package */
public final class r93 implements fjf<RxRouterProvider> {
    private final wlf<RxResolverImpl> a;

    public r93(wlf<RxResolverImpl> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n93(this.a.get());
    }
}
