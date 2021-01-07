package defpackage;

import com.spotify.cosmos.android.RxResolverImpl;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.RxRouter;
import io.reactivex.s;

/* renamed from: m93  reason: default package */
public final /* synthetic */ class m93 implements RxRouter {
    public final /* synthetic */ RxResolverImpl a;

    public /* synthetic */ m93(RxResolverImpl rxResolverImpl) {
        this.a = rxResolverImpl;
    }

    @Override // com.spotify.cosmos.router.RxRouter
    public final s resolve(Request request) {
        return this.a.resolve(request);
    }
}
