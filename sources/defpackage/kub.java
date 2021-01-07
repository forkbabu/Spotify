package defpackage;

import io.reactivex.functions.g;

/* renamed from: kub  reason: default package */
public final /* synthetic */ class kub implements g {
    public final /* synthetic */ vub a;

    public /* synthetic */ kub(vub vub) {
        this.a = vub;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b((Throwable) obj);
    }
}
