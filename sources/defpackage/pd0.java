package defpackage;

import io.reactivex.functions.f;

/* renamed from: pd0  reason: default package */
public final /* synthetic */ class pd0 implements f {
    public final /* synthetic */ wd0 a;

    public /* synthetic */ pd0(wd0 wd0) {
        this.a = wd0;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.a();
    }
}
