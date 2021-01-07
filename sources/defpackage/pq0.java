package defpackage;

/* renamed from: pq0  reason: default package */
public final class pq0 implements fjf<oq0> {
    private final wlf<nq0> a;

    public pq0(wlf<nq0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new oq0(this.a.get());
    }
}
