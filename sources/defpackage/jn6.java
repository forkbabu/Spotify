package defpackage;

import io.reactivex.internal.operators.completable.b;
import java.util.concurrent.Callable;

/* renamed from: jn6  reason: default package */
public final /* synthetic */ class jn6 implements Callable {
    public final /* synthetic */ bo6 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ jn6(bo6 bo6, boolean z, boolean z2) {
        this.a = bo6;
        this.b = z;
        this.c = z2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.a.d(this.b, this.c);
        return b.a;
    }
}
