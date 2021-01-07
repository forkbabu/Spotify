package defpackage;

import com.spotify.ubi.specification.factories.s0;
import kotlin.jvm.internal.h;

/* renamed from: j95  reason: default package */
public final class j95 implements i95 {
    private final ere a;
    private final s0 b;

    public j95(ere ere, s0 s0Var) {
        h.e(ere, "ubiLogger");
        h.e(s0Var, "mContextMenuEventFactory");
        this.a = ere;
        this.b = s0Var;
    }

    @Override // defpackage.i95
    public void a() {
        this.a.a(this.b.h().a());
    }
}
