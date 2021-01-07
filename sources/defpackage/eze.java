package defpackage;

import androidx.activity.b;
import io.reactivex.t;

/* renamed from: eze  reason: default package */
final class eze extends b {
    final /* synthetic */ t c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    eze(boolean z, t tVar) {
        super(z);
        this.c = tVar;
    }

    @Override // androidx.activity.b
    public void b() {
        this.c.onNext(vue.g());
        this.c.onComplete();
    }
}
