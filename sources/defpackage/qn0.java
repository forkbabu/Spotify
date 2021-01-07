package defpackage;

import kotlin.jvm.internal.h;
import okhttp3.c0;
import okhttp3.w;
import okio.e;
import okio.f;

/* renamed from: qn0  reason: default package */
public final class qn0 extends c0 {
    final /* synthetic */ c0 a;
    final /* synthetic */ e b;

    qn0(c0 c0Var, e eVar) {
        this.a = c0Var;
        this.b = eVar;
    }

    @Override // okhttp3.c0
    public long a() {
        return this.b.size();
    }

    @Override // okhttp3.c0
    public w b() {
        return this.a.b();
    }

    @Override // okhttp3.c0
    public void f(f fVar) {
        h.e(fVar, "sink");
        fVar.Y1(this.b.C());
    }
}
