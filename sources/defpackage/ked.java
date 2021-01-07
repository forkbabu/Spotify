package defpackage;

import defpackage.kvd;
import io.reactivex.a0;

/* renamed from: ked  reason: default package */
public final /* synthetic */ class ked implements kvd.d {
    public final /* synthetic */ a0 a;
    public final /* synthetic */ int b;

    public /* synthetic */ ked(a0 a0Var, int i) {
        this.a = a0Var;
        this.b = i;
    }

    @Override // defpackage.kvd.d
    public final void onGenerated(kvd kvd) {
        this.a.onSuccess(Integer.valueOf(kvd.b(kvd.c(this.b))));
    }
}
