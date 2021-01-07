package defpackage;

/* renamed from: lh2  reason: default package */
public final class lh2 implements fjf<kh2> {
    private final wlf<vpe> a;

    public lh2(wlf<vpe> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kh2(this.a.get());
    }
}
