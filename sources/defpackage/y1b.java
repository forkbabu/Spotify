package defpackage;

import io.reactivex.h;
import io.reactivex.i;

/* renamed from: y1b  reason: default package */
public final /* synthetic */ class y1b implements i {
    public final /* synthetic */ w3b a;
    public final /* synthetic */ h5b b;

    public /* synthetic */ y1b(w3b w3b, h5b h5b) {
        this.a = w3b;
        this.b = h5b;
    }

    @Override // io.reactivex.i
    public final void subscribe(h hVar) {
        w3b w3b = this.a;
        h5b h5b = this.b;
        w3b.getClass();
        h5b.c(new w1b(w3b, hVar));
        hVar.e(new x1b(h5b));
    }
}
