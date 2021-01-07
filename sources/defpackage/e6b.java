package defpackage;

/* renamed from: e6b  reason: default package */
public final class e6b implements fjf<d6b> {
    private final wlf<z5b> a;

    public e6b(wlf<z5b> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d6b(this.a.get());
    }
}
