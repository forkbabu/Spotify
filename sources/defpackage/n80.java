package defpackage;

import io.reactivex.s;

/* access modifiers changed from: package-private */
/* renamed from: n80  reason: default package */
public class n80 {
    private final j80 a;
    private f1 b;

    n80(j80 j80) {
        this.a = j80;
    }

    /* access modifiers changed from: package-private */
    public s<k1> a() {
        return this.a.b().Q(g80.a).j0(new f80(this));
    }

    public /* synthetic */ k1 b(g1 g1Var) {
        return g1Var.c(this.b);
    }

    /* access modifiers changed from: package-private */
    public void c(f1 f1Var) {
        this.b = f1Var;
    }
}
