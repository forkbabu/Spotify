package defpackage;

import io.reactivex.functions.l;

/* renamed from: txe  reason: default package */
public final /* synthetic */ class txe implements l {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ txe(Runnable runnable) {
        this.a = runnable;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        this.a.run();
        return zwd.a(((Throwable) obj).toString());
    }
}
