package defpackage;

import io.reactivex.t;
import io.reactivex.u;

/* renamed from: s1e  reason: default package */
public final /* synthetic */ class s1e implements u {
    public final /* synthetic */ z1e a;
    public final /* synthetic */ u50 b;

    public /* synthetic */ s1e(z1e z1e, u50 u50) {
        this.a = z1e;
        this.b = u50;
    }

    @Override // io.reactivex.u
    public final void subscribe(t tVar) {
        this.a.c(this.b, tVar);
    }
}
