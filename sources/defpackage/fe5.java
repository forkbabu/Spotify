package defpackage;

import java.util.concurrent.Callable;

/* renamed from: fe5  reason: default package */
public final /* synthetic */ class fe5 implements Callable {
    public final /* synthetic */ ge5 a;
    public final /* synthetic */ me5 b;

    public /* synthetic */ fe5(ge5 ge5, me5 me5) {
        this.a = ge5;
        this.b = me5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.b(this.b);
    }
}
