package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: ey9  reason: default package */
public final class ey9 implements cy9 {
    private final ere a;
    private final iy9 b;

    public ey9(ere ere, iy9 iy9) {
        h.e(ere, "eventLogger");
        h.e(iy9, "factoryWrapper");
        this.a = ere;
        this.b = iy9;
    }

    @Override // defpackage.cy9
    public void a() {
        this.a.a(this.b.a().c().d().a());
    }

    @Override // defpackage.cy9
    public void b() {
        this.a.a(this.b.a().c().b());
    }

    @Override // defpackage.cy9
    public void c() {
        this.a.a(this.b.a().c().c().a());
    }
}
