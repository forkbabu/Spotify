package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx2.i;
import com.spotify.pageloader.l0;
import defpackage.utd;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: vtd  reason: default package */
public class vtd<T> implements w<l0<T>, l0<T>> {
    private final s<ng0> a;

    public vtd(s<ng0> sVar) {
        this.a = sVar;
    }

    @Override // io.reactivex.w
    public v<l0<T>> apply(s<l0<T>> sVar) {
        s<Object> G0 = o.a.G0(new utd.b());
        MobiusLoop.f h = i.c(new otd(this), new ltd(sVar)).h(i.a(this.a.j0(mtd.a)));
        gtd gtd = gtd.a;
        return G0.q(i.d(h.d(gtd).b(gtd), Optional.absent())).Q(itd.a).j0(htd.a);
    }
}
