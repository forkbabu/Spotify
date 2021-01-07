package defpackage;

import io.reactivex.h;
import io.reactivex.i;

/* renamed from: td4  reason: default package */
public final /* synthetic */ class td4 implements i {
    public final /* synthetic */ me4 a;
    public final /* synthetic */ t54 b;

    public /* synthetic */ td4(me4 me4, t54 t54) {
        this.a = me4;
        this.b = t54;
    }

    @Override // io.reactivex.i
    public final void subscribe(h hVar) {
        me4 me4 = this.a;
        t54 t54 = this.b;
        t54.b(new vd4(hVar, me4));
        hVar.e(new ud4(t54));
    }
}
