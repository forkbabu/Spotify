package defpackage;

import io.reactivex.functions.f;

/* renamed from: n2b  reason: default package */
public final /* synthetic */ class n2b implements f {
    public final /* synthetic */ k8b a;

    public /* synthetic */ n2b(k8b k8b) {
        this.a = k8b;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.a(null);
    }
}
