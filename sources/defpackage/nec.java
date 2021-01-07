package defpackage;

import com.spotify.player.model.PlayerError;
import com.spotify.player.model.PlayerState;
import com.spotify.player.sub.l;
import com.spotify.rxjava2.f;
import com.spotify.rxjava2.x;
import com.spotify.rxjava2.y;
import com.spotify.rxjava2.z;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.internal.operators.flowable.u;
import io.reactivex.internal.operators.observable.e0;
import io.reactivex.s;
import io.reactivex.v;
import java.util.List;

/* renamed from: nec  reason: default package */
public final class nec implements l {
    private final l a;
    private final s<Boolean> b;
    private final z<PlayerState> c;

    public nec(l lVar, s<Boolean> sVar, z<PlayerState> zVar) {
        this.a = lVar;
        this.b = sVar;
        this.c = zVar;
    }

    @Override // com.spotify.player.sub.l
    public g<PlayerState> a(int i, int i2) {
        z<PlayerState> zVar = this.c;
        s<Boolean> E = this.b.E();
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.LATEST;
        g<R> f0 = E.Y0(backpressureStrategy).f0(new kec(this, i, i2));
        zVar.getClass();
        return g.p(new f(zVar, "LoggedInPlayerSubscriptions", x.a(), f0), backpressureStrategy);
    }

    public /* synthetic */ v b(Boolean bool) {
        return bool.booleanValue() ? this.a.error() : e0.a;
    }

    public /* synthetic */ tpf c(int i, int i2, Boolean bool) {
        if (bool.booleanValue()) {
            return this.a.a(i, i2);
        }
        int i3 = g.b;
        return u.c;
    }

    @Override // com.spotify.player.sub.l
    public g<PlayerState> d() {
        return a(2, 2);
    }

    public List<y> e() {
        return this.c.f();
    }

    @Override // com.spotify.player.sub.l
    public s<PlayerError> error() {
        return this.b.E().J0(new jec(this));
    }
}
