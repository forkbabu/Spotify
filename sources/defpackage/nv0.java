package defpackage;

import com.spotify.cosmos.android.RemoteNativeRouter;
import com.spotify.cosmos.android.RxResolverImpl;
import com.spotify.cosmos.router.Response;
import com.spotify.rxjava2.z;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: nv0  reason: default package */
public final class nv0 implements fjf<RxResolverImpl> {
    private final wlf<y> a;
    private final wlf<Boolean> b;
    private final wlf<s<RemoteNativeRouter>> c;
    private final wlf<z<Response>> d;

    public nv0(wlf<y> wlf, wlf<Boolean> wlf2, wlf<s<RemoteNativeRouter>> wlf3, wlf<z<Response>> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        wlf<Boolean> wlf = this.b;
        return new RxResolverImpl(this.c, this.a.get(), wlf, this.d);
    }
}
