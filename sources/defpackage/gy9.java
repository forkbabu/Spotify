package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: gy9  reason: default package */
public final class gy9 implements dy9 {
    private final ere a;
    private final ky9 b;

    public gy9(ere ere, ky9 ky9) {
        h.e(ere, "eventLogger");
        h.e(ky9, "factoryWrapper");
        this.a = ere;
        this.b = ky9;
    }

    @Override // defpackage.dy9
    public void a() {
        this.a.a(this.b.a().c().a());
    }
}
