package defpackage;

import defpackage.uue;
import io.reactivex.functions.g;

/* renamed from: oxe  reason: default package */
public final /* synthetic */ class oxe implements g {
    public final /* synthetic */ t0f a;
    public final /* synthetic */ uue.v b;

    public /* synthetic */ oxe(t0f t0f, uue.v vVar) {
        this.a = t0f;
        this.b = vVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        zwd zwd = (zwd) obj;
        this.a.c(this.b.b(), true);
    }
}
