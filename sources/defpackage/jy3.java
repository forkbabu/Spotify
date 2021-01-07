package defpackage;

/* renamed from: jy3  reason: default package */
public final class jy3 implements fjf<iy3> {
    private final wlf<cy3> a;
    private final wlf<m8c> b;

    public jy3(wlf<cy3> wlf, wlf<m8c> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new iy3(this.a.get(), this.b.get());
    }
}
