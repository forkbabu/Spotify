package defpackage;

/* renamed from: l56  reason: default package */
public final class l56 implements fjf<k56> {
    private final wlf<m56> a;
    private final wlf<y56> b;

    public l56(wlf<m56> wlf, wlf<y56> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k56(this.a, this.b);
    }
}
