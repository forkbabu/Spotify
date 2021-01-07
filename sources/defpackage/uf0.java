package defpackage;

/* renamed from: uf0  reason: default package */
public final class uf0 implements fjf<tf0> {
    private final wlf<rf0> a;

    public uf0(wlf<rf0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tf0(this.a.get());
    }
}
