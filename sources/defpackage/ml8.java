package defpackage;

/* renamed from: ml8  reason: default package */
public final class ml8 implements fjf<ll8> {
    private final wlf<ol8> a;
    private final wlf<vl8> b;
    private final wlf<jl8> c;

    public ml8(wlf<ol8> wlf, wlf<vl8> wlf2, wlf<jl8> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ll8(this.a.get(), this.b.get(), this.c.get());
    }
}
