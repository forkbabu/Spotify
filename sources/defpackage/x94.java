package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.k;

/* renamed from: x94  reason: default package */
public final /* synthetic */ class x94 implements k {
    public final /* synthetic */ xe4 a;

    public /* synthetic */ x94(xe4 xe4) {
        this.a = xe4;
    }

    @Override // io.reactivex.k
    public final tpf a(g gVar) {
        xe4 xe4 = this.a;
        gVar.getClass();
        return xe4.g(new v(gVar)).Y0(BackpressureStrategy.BUFFER);
    }
}
