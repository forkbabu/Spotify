package defpackage;

import com.spotify.voice.api.model.m;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.operators.flowable.r;
import io.reactivex.s;

/* renamed from: sye  reason: default package */
public final /* synthetic */ class sye implements l {
    public final /* synthetic */ k0f a;

    public /* synthetic */ sye(k0f k0f) {
        this.a = k0f;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        k0f k0f = this.a;
        m mVar = (m) obj;
        mVar.getClass();
        if (!(mVar instanceof m.d)) {
            return s.i0(mVar);
        }
        g<Float> g = ((m.d) mVar).g();
        k0f.getClass();
        return s.i0(mVar).x(new r(g.A(new gve(k0f))).N());
    }
}
