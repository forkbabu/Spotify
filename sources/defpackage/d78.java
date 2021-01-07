package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.k;

/* renamed from: d78  reason: default package */
public final /* synthetic */ class d78 implements k {
    public final /* synthetic */ zc8 a;

    public /* synthetic */ d78(zc8 zc8) {
        this.a = zc8;
    }

    @Override // io.reactivex.k
    public final tpf a(g gVar) {
        zc8 zc8 = this.a;
        gVar.getClass();
        return zc8.g(new v(gVar)).Y0(BackpressureStrategy.BUFFER);
    }
}
