package defpackage;

/* renamed from: r56  reason: default package */
public final class r56 implements fjf<q56> {
    private final wlf<m56> a;
    private final wlf<y56> b;

    public r56(wlf<m56> wlf, wlf<y56> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q56(this.a, this.b);
    }
}
