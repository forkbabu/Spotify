package defpackage;

/* renamed from: j58  reason: default package */
public final class j58 implements fjf<i58> {
    private final wlf<c8b> a;
    private final wlf<u58> b;

    public j58(wlf<c8b> wlf, wlf<u58> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i58(this.a.get(), this.b.get());
    }
}
