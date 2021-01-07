package defpackage;

import defpackage.cdd;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.y;

/* renamed from: hdd  reason: default package */
public final /* synthetic */ class hdd implements l {
    public final /* synthetic */ g a;
    public final /* synthetic */ y b;

    public /* synthetic */ hdd(g gVar, y yVar) {
        this.a = gVar;
        this.b = yVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        g gVar = this.a;
        cdd.b bVar = (cdd.b) obj;
        return new v(gVar.O(ldd.a).s()).o0(this.b).j0(fdd.a);
    }
}
