package defpackage;

import androidx.lifecycle.Lifecycle;
import com.spotify.cosmos.android.RxResolverImpl;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.cosmos.router.RxRouterProvider;

/* renamed from: n93  reason: default package */
public final /* synthetic */ class n93 implements RxRouterProvider {
    public final /* synthetic */ RxResolverImpl a;

    public /* synthetic */ n93(RxResolverImpl rxResolverImpl) {
        this.a = rxResolverImpl;
    }

    @Override // com.spotify.cosmos.router.RxRouterProvider
    public final RxRouter provideWithLifecycle(Lifecycle lifecycle) {
        RxResolverImpl rxResolverImpl = this.a;
        rxResolverImpl.getClass();
        return new m93(rxResolverImpl);
    }
}
