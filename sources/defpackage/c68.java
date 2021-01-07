package defpackage;

import defpackage.x98;

/* renamed from: c68  reason: default package */
public class c68 implements a71, h8b {
    private final h5b a;
    private final c8b b;
    private final nb8 c;
    private final j81 f;

    public c68(h5b h5b, c8b c8b, nb8 nb8, j81 j81) {
        h5b.getClass();
        this.a = h5b;
        c8b.getClass();
        this.b = c8b;
        this.c = nb8;
        this.f = j81;
    }

    @Override // defpackage.h8b
    public o81 a() {
        return z81.b().e("retry").c();
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        x98.a a2 = x98.a();
        a2.e(xb8.a(this.f.a(n61)));
        a2.a(-1);
        this.c.a(a2.build());
        this.b.a();
        this.a.a();
    }
}
