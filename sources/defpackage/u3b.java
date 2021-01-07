package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.h;

/* renamed from: u3b  reason: default package */
public final class u3b implements t3b<y6b> {
    private final y6b a = y6b.a(20);

    u3b() {
    }

    @Override // defpackage.t3b
    public g<y6b> a(h5b h5b) {
        return g.p(new v1b(this, h5b), BackpressureStrategy.LATEST);
    }

    public /* synthetic */ void b(h hVar) {
        hVar.onNext(this.a);
    }
}
