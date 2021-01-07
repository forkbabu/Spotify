package defpackage;

import io.reactivex.a;
import io.reactivex.functions.l;
import io.reactivex.s;
import java.util.concurrent.TimeUnit;

/* renamed from: cye  reason: default package */
public final /* synthetic */ class cye implements l {
    public final /* synthetic */ t92 a;

    public /* synthetic */ cye(t92 t92) {
        this.a = t92;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        uue uue = (uue) obj;
        return a.u(new wye(this.a)).o(200, TimeUnit.MILLISECONDS).B().g(s.i0(vue.f()));
    }
}
