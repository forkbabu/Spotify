package defpackage;

import com.spotify.music.container.app.foregroundstate.d;
import defpackage.rbd;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;

/* renamed from: kcd  reason: default package */
public final /* synthetic */ class kcd implements l {
    public final /* synthetic */ d a;
    public final /* synthetic */ t7d b;

    public /* synthetic */ kcd(d dVar, t7d t7d) {
        this.a = dVar;
        this.b = t7d;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        d dVar = this.a;
        t7d t7d = this.b;
        rbd.k kVar = (rbd.k) obj;
        if (!dVar.a()) {
            return o.a;
        }
        t7d.c(kVar.a());
        return s.i0(sbd.a());
    }
}
