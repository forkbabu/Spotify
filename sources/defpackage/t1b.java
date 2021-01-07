package defpackage;

import io.reactivex.functions.f;

/* renamed from: t1b  reason: default package */
public final /* synthetic */ class t1b implements f {
    public final /* synthetic */ h5b a;

    public /* synthetic */ t1b(h5b h5b) {
        this.a = h5b;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.c(null);
    }
}
