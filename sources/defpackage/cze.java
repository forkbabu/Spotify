package defpackage;

import androidx.activity.c;
import io.reactivex.t;
import io.reactivex.u;

/* renamed from: cze  reason: default package */
public final /* synthetic */ class cze implements u {
    public final /* synthetic */ c a;

    public /* synthetic */ cze(c cVar) {
        this.a = cVar;
    }

    @Override // io.reactivex.u
    public final void subscribe(t tVar) {
        c cVar = this.a;
        eze eze = new eze(true, tVar);
        tVar.e(new dze(eze));
        cVar.S0().a(eze);
    }
}
