package defpackage;

import io.reactivex.functions.g;

/* renamed from: mwe  reason: default package */
public final /* synthetic */ class mwe implements g {
    public final /* synthetic */ t0f a;
    public final /* synthetic */ String b;

    public /* synthetic */ mwe(t0f t0f, String str) {
        this.a = t0f;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        zwd zwd = (zwd) obj;
        this.a.c(this.b, false);
    }
}
