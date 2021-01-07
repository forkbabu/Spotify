package defpackage;

import androidx.activity.c;
import io.reactivex.t;
import io.reactivex.u;

/* renamed from: m7f  reason: default package */
public final /* synthetic */ class m7f implements u {
    public final /* synthetic */ c a;

    public /* synthetic */ m7f(c cVar) {
        this.a = cVar;
    }

    @Override // io.reactivex.u
    public final void subscribe(t tVar) {
        c cVar = this.a;
        o7f o7f = new o7f(true, tVar);
        tVar.e(new n7f(o7f));
        cVar.S0().a(o7f);
    }
}
