package defpackage;

import defpackage.uue;
import io.reactivex.functions.g;

/* renamed from: nye  reason: default package */
public final /* synthetic */ class nye implements g {
    public final /* synthetic */ t0f a;
    public final /* synthetic */ uue.p b;

    public /* synthetic */ nye(t0f t0f, uue.p pVar) {
        this.a = t0f;
        this.b = pVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        zwd zwd = (zwd) obj;
        this.a.c(this.b.a(), true);
    }
}
