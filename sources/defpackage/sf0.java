package defpackage;

/* renamed from: sf0  reason: default package */
public final class sf0 implements fjf<rf0> {
    private final wlf<Integer> a;
    private final wlf<Integer> b;

    public sf0(wlf<Integer> wlf, wlf<Integer> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rf0(this.a.get().intValue(), this.b.get().intValue());
    }
}
