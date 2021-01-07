package defpackage;

/* renamed from: o3b  reason: default package */
public final class o3b implements fjf<n3b> {
    private final wlf<qqa> a;

    public o3b(wlf<qqa> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n3b(this.a.get());
    }
}
