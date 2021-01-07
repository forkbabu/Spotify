package defpackage;

import io.reactivex.functions.g;

/* renamed from: i04  reason: default package */
public final /* synthetic */ class i04 implements g {
    public final /* synthetic */ g a;

    public /* synthetic */ i04(g gVar) {
        this.a = gVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        this.a.accept(null);
    }
}
