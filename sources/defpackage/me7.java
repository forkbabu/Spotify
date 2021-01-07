package defpackage;

/* renamed from: me7  reason: default package */
public final class me7 implements fjf<le7> {
    private final wlf<oe7> a;
    private final wlf<lf7> b;
    private final wlf<ff7> c;
    private final wlf<bf7> d;

    public me7(wlf<oe7> wlf, wlf<lf7> wlf2, wlf<ff7> wlf3, wlf<bf7> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new le7(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
