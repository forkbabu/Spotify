package defpackage;

import defpackage.uue;
import io.reactivex.functions.g;

/* renamed from: iwe  reason: default package */
public final /* synthetic */ class iwe implements g {
    public final /* synthetic */ t0f a;
    public final /* synthetic */ uue.g b;

    public /* synthetic */ iwe(t0f t0f, uue.g gVar) {
        this.a = t0f;
        this.b = gVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        zwd zwd = (zwd) obj;
        this.a.c(this.b.a(), true);
    }
}
