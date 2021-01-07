package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.RxRouter;
import io.reactivex.s;

/* renamed from: lv0  reason: default package */
public final /* synthetic */ class lv0 implements RxRouter {
    public final /* synthetic */ RxResolver a;

    public /* synthetic */ lv0(RxResolver rxResolver) {
        this.a = rxResolver;
    }

    @Override // com.spotify.cosmos.router.RxRouter
    public final s resolve(Request request) {
        return this.a.resolve(request);
    }
}
