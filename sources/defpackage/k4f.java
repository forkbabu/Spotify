package defpackage;

import io.reactivex.functions.l;

/* renamed from: k4f  reason: default package */
public final /* synthetic */ class k4f implements l {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ k4f(Runnable runnable) {
        this.a = runnable;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        this.a.run();
        return zwd.a(((Throwable) obj).toString());
    }
}
