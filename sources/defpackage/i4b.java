package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.h;

/* renamed from: i4b  reason: default package */
public class i4b {
    private final int a;

    public i4b(int i) {
        this.a = i;
    }

    public /* synthetic */ void a(i3b i3b, h hVar) {
        if (i3b.d()) {
            hVar.onNext(y6b.b(this.a, i3b.c()));
        }
    }

    public g<y6b> b(i5b i5b, i3b i3b) {
        return g.p(new k2b(this, i3b, i5b), BackpressureStrategy.LATEST);
    }
}
