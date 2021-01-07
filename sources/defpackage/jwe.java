package defpackage;

import defpackage.uue;
import io.reactivex.functions.g;

/* renamed from: jwe  reason: default package */
public final /* synthetic */ class jwe implements g {
    public final /* synthetic */ t0f a;
    public final /* synthetic */ uue.t b;

    public /* synthetic */ jwe(t0f t0f, uue.t tVar) {
        this.a = t0f;
        this.b = tVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        zwd zwd = (zwd) obj;
        this.a.c(this.b.a(), true);
    }
}
