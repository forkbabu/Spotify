package defpackage;

/* renamed from: sp1  reason: default package */
public final class sp1 implements fjf<rp1> {
    private final wlf<po1> a;

    public sp1(wlf<po1> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rp1(this.a.get());
    }
}
