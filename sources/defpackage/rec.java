package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.player.model.PlayerState;
import com.spotify.player.sub.j;
import com.spotify.remoteconfig.rj;
import com.spotify.rxjava2.z;
import io.reactivex.s;

/* renamed from: rec  reason: default package */
public final class rec implements fjf<nec> {
    private final wlf<RxResolver> a;
    private final wlf<pxd> b;
    private final wlf<s<Boolean>> c;
    private final wlf<rj> d;
    private final wlf<z<PlayerState>> e;

    public rec(wlf<RxResolver> wlf, wlf<pxd> wlf2, wlf<s<Boolean>> wlf3, wlf<rj> wlf4, wlf<z<PlayerState>> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        RxResolver rxResolver = this.a.get();
        ajf a2 = ejf.a(this.b);
        rxResolver.getClass();
        return new nec(j.a(new qec(rxResolver), a2, this.d.get()), this.c.get(), this.e.get());
    }
}
