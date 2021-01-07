package defpackage;

/* renamed from: sg2  reason: default package */
public final class sg2 implements fjf<rg2> {
    private final wlf<dpe> a;

    public sg2(wlf<dpe> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rg2(this.a.get());
    }
}
