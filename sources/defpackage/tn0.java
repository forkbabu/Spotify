package defpackage;

import kotlin.jvm.internal.h;
import okhttp3.a0;
import okhttp3.d;
import okhttp3.d0;
import okhttp3.v;

/* renamed from: tn0  reason: default package */
public final class tn0 implements v {
    private boolean a;

    @Override // okhttp3.v
    public d0 a(v.a aVar) {
        h.e(aVar, "chain");
        fof fof = (fof) aVar;
        a0 i = fof.i();
        if (this.a) {
            i = i.h().c(d.n).b();
        }
        return fof.f(i);
    }

    public final void b(boolean z) {
        this.a = z;
    }
}
