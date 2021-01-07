package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: ev0  reason: default package */
public final class ev0 implements gv0 {
    private long a;
    private final cqe b;

    public ev0(cqe cqe) {
        h.e(cqe, "clock");
        this.b = cqe;
    }

    @Override // defpackage.gv0
    public boolean a() {
        return this.b.d() - this.a < 200;
    }

    @Override // defpackage.gv0
    public void b() {
        this.a = this.b.d();
    }
}
