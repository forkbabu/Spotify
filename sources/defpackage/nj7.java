package defpackage;

/* renamed from: nj7  reason: default package */
public final class nj7 implements fjf<mj7> {
    private final wlf<oj7> a;
    private final wlf<qj7> b;
    private final wlf<sj7> c;

    public nj7(wlf<oj7> wlf, wlf<qj7> wlf2, wlf<sj7> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mj7(this.a.get(), this.b.get(), this.c.get());
    }
}
