package defpackage;

import io.reactivex.functions.a;

/* renamed from: lie  reason: default package */
public final /* synthetic */ class lie implements a {
    public final /* synthetic */ da2 a;
    public final /* synthetic */ phe b;

    public /* synthetic */ lie(da2 da2, phe phe) {
        this.a = da2;
        this.b = phe;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.accept(ohe.g(this.b.a()));
    }
}
