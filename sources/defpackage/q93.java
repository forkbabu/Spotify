package defpackage;

import com.spotify.cosmos.android.RxResolverImpl;
import com.spotify.cosmos.router.RxRouter;

/* renamed from: q93  reason: default package */
public final class q93 implements fjf<RxRouter> {
    private final wlf<RxResolverImpl> a;

    public q93(wlf<RxResolverImpl> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        RxResolverImpl rxResolverImpl = this.a.get();
        rxResolverImpl.getClass();
        return new m93(rxResolverImpl);
    }
}
