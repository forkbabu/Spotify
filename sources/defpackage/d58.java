package defpackage;

/* renamed from: d58  reason: default package */
public final class d58 implements fjf<c58> {
    private final wlf<r58> a;

    public d58(wlf<r58> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c58(this.a.get());
    }
}
