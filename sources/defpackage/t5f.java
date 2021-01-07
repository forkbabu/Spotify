package defpackage;

import com.spotify.voice.api.model.m;
import com.spotify.voice.experiments.experience.view.e1;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.operators.flowable.r;
import io.reactivex.s;

/* renamed from: t5f  reason: default package */
public final /* synthetic */ class t5f implements l {
    public final /* synthetic */ e1 a;

    public /* synthetic */ t5f(e1 e1Var) {
        this.a = e1Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        e1 e1Var = this.a;
        m mVar = (m) obj;
        mVar.getClass();
        if (!(mVar instanceof m.d)) {
            return s.i0(mVar);
        }
        g<Float> g = ((m.d) mVar).g();
        e1Var.getClass();
        return s.i0(mVar).x(new r(g.A(new z2f(e1Var))).N());
    }
}
