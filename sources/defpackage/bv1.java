package defpackage;

/* renamed from: bv1  reason: default package */
public final class bv1 implements fjf<av1> {
    private final wlf<xu1> a;

    public bv1(wlf<xu1> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new av1(this.a.get());
    }
}
