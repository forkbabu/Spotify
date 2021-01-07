package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.RxRouter;
import io.reactivex.s;

/* renamed from: qec  reason: default package */
public final /* synthetic */ class qec implements RxRouter {
    public final /* synthetic */ RxResolver a;

    public /* synthetic */ qec(RxResolver rxResolver) {
        this.a = rxResolver;
    }

    @Override // com.spotify.cosmos.router.RxRouter
    public final s resolve(Request request) {
        return this.a.resolve(request);
    }
}
