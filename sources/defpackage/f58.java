package defpackage;

/* renamed from: f58  reason: default package */
public final class f58 implements fjf<e58> {
    private final wlf<c8b> a;
    private final wlf<u58> b;

    public f58(wlf<c8b> wlf, wlf<u58> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e58(this.a.get(), this.b.get());
    }
}
