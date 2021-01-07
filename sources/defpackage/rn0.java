package defpackage;

import kotlin.jvm.internal.h;
import okhttp3.c0;
import okhttp3.w;
import okio.f;
import okio.l;
import okio.o;

/* renamed from: rn0  reason: default package */
public final class rn0 extends c0 {
    final /* synthetic */ c0 a;

    rn0(c0 c0Var) {
        this.a = c0Var;
    }

    @Override // okhttp3.c0
    public long a() {
        return -1;
    }

    @Override // okhttp3.c0
    public w b() {
        return this.a.b();
    }

    @Override // okhttp3.c0
    public void f(f fVar) {
        h.e(fVar, "sink");
        f c = o.c(new l(fVar));
        this.a.f(c);
        c.close();
    }
}
