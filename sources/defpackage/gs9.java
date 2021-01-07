package defpackage;

/* renamed from: gs9  reason: default package */
public final class gs9 implements fjf<fs9> {
    private final wlf<ws9> a;
    private final wlf<rt9> b;

    public gs9(wlf<ws9> wlf, wlf<rt9> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fs9(this.a.get(), this.b.get());
    }
}
