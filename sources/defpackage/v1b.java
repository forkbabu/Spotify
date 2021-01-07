package defpackage;

import io.reactivex.h;
import io.reactivex.i;

/* renamed from: v1b  reason: default package */
public final /* synthetic */ class v1b implements i {
    public final /* synthetic */ u3b a;
    public final /* synthetic */ h5b b;

    public /* synthetic */ v1b(u3b u3b, h5b h5b) {
        this.a = u3b;
        this.b = h5b;
    }

    @Override // io.reactivex.i
    public final void subscribe(h hVar) {
        u3b u3b = this.a;
        h5b h5b = this.b;
        u3b.getClass();
        h5b.c(new u1b(u3b, hVar));
        hVar.e(new t1b(h5b));
    }
}
