package defpackage;

import androidx.activity.b;
import io.reactivex.t;

/* renamed from: o7f  reason: default package */
final class o7f extends b {
    final /* synthetic */ t c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    o7f(boolean z, t tVar) {
        super(z);
        this.c = tVar;
    }

    @Override // androidx.activity.b
    public void b() {
        this.c.onNext(q2f.e());
        this.c.onComplete();
    }
}
