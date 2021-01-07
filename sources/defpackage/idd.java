package defpackage;

import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;

/* renamed from: idd  reason: default package */
public final /* synthetic */ class idd implements w {
    public final /* synthetic */ g a;
    public final /* synthetic */ y b;

    public /* synthetic */ idd(g gVar, y yVar) {
        this.a = gVar;
        this.b = yVar;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.J0(new hdd(this.a, this.b));
    }
}
