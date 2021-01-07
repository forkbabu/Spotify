package defpackage;

/* renamed from: mx9  reason: default package */
public final class mx9 implements fjf<lx9> {
    private final wlf<yw9> a;
    private final wlf<nx9> b;

    public mx9(wlf<yw9> wlf, wlf<nx9> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lx9(this.a.get(), this.b.get());
    }
}
