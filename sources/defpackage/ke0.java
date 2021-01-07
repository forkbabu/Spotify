package defpackage;

import defpackage.ce0;

/* renamed from: ke0  reason: default package */
public class ke0 {
    private final ae0 a;
    private final cqe b;
    private final pe0 c;

    public ke0(ae0 ae0, cqe cqe, pe0 pe0) {
        this.a = ae0;
        this.b = cqe;
        this.c = pe0;
    }

    public String a() {
        return this.c.a();
    }

    public void b(re0 re0, String str) {
        this.a.a(new ce0.i(re0, str, this.b.b(), null));
    }

    public void c(re0 re0, String str, int i) {
        this.a.a(new ce0.i(re0, str, this.b.b(), Integer.valueOf(i)));
    }

    public void d(re0 re0, String str) {
        this.a.a(new ce0.j(re0, str, this.b.b()));
    }
}
