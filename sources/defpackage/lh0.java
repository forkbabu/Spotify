package defpackage;

/* renamed from: lh0  reason: default package */
public final class lh0 implements fjf<kh0> {
    private final wlf<hh0> a;

    public lh0(wlf<hh0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kh0(this.a.get());
    }
}
