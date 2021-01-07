package defpackage;

/* renamed from: ox9  reason: default package */
public final class ox9 implements fjf<nx9> {
    private final wlf<xw9> a;
    private final wlf<dx9> b;
    private final wlf<yw9> c;
    private final wlf<sx9> d;
    private final wlf<zw9> e;

    public ox9(wlf<xw9> wlf, wlf<dx9> wlf2, wlf<yw9> wlf3, wlf<sx9> wlf4, wlf<zw9> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nx9(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
