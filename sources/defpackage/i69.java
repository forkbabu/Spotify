package defpackage;

/* renamed from: i69  reason: default package */
public final class i69 implements fjf<h69> {
    private final wlf<j69> a;

    public i69(wlf<j69> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h69(this.a.get());
    }
}
