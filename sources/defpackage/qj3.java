package defpackage;

/* renamed from: qj3  reason: default package */
public final class qj3 implements fjf<pj3> {
    private final wlf<rpd> a;

    public qj3(wlf<rpd> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pj3(this.a.get());
    }
}
