package defpackage;

import java.util.concurrent.Callable;

/* renamed from: b9a  reason: default package */
public final /* synthetic */ class b9a implements Callable {
    public final /* synthetic */ p9a a;

    public /* synthetic */ b9a(p9a p9a) {
        this.a = p9a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.c();
    }
}
