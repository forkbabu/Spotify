package defpackage;

import androidx.fragment.app.Fragment;
import com.spotify.player.model.PlayerState;
import com.spotify.player.stateful.q;
import defpackage.bxd;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: d8c  reason: default package */
public final class d8c implements fjf<q> {
    private final wlf<g<PlayerState>> a;
    private final wlf<y> b;
    private final wlf<bxd.a> c;
    private final wlf<Fragment> d;
    private final wlf<cqe> e;

    public d8c(wlf<g<PlayerState>> wlf, wlf<y> wlf2, wlf<bxd.a> wlf3, wlf<Fragment> wlf4, wlf<cqe> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q(this.c.get().a(this.d.get().A()), this.a.get(), this.b.get(), this.e.get());
    }
}
