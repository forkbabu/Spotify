package defpackage;

import io.reactivex.functions.f;

/* renamed from: x1b  reason: default package */
public final /* synthetic */ class x1b implements f {
    public final /* synthetic */ h5b a;

    public /* synthetic */ x1b(h5b h5b) {
        this.a = h5b;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.c(null);
    }
}
