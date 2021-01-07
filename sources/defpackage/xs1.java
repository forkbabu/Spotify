package defpackage;

import io.reactivex.functions.f;

/* renamed from: xs1  reason: default package */
public final /* synthetic */ class xs1 implements f {
    public final /* synthetic */ dt1 a;

    public /* synthetic */ xs1(dt1 dt1) {
        this.a = dt1;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.a();
    }
}
