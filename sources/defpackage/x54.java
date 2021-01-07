package defpackage;

import com.google.common.base.Optional;
import defpackage.v54;

/* renamed from: x54  reason: default package */
public final class x54 implements a71 {
    private final a64 a;
    private final p71 b;
    private final j81 c;
    private final ere f;

    public x54(a64 a64, p71 p71, j81 j81, ere ere) {
        a64.getClass();
        this.a = a64;
        p71.getClass();
        this.b = p71;
        this.c = j81;
        this.f = ere;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        String a2 = new oxa().a();
        this.b.a(a2, n61.d(), "navigate-forward", null);
        nqe i = this.c.a(n61).i(a2);
        this.f.a(i);
        String b2 = i.b();
        z54 z54 = z54.a;
        v54.b bVar = new v54.b();
        bVar.d(Optional.fromNullable((e74) n61.a().get("buttonData")));
        bVar.c(b2);
        this.a.a(bVar.b());
    }
}
