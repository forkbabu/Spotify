package defpackage;

import io.reactivex.functions.f;

/* renamed from: j2b  reason: default package */
public final /* synthetic */ class j2b implements f {
    public final /* synthetic */ i5b a;

    public /* synthetic */ j2b(i5b i5b) {
        this.a = i5b;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.i(null);
    }
}
