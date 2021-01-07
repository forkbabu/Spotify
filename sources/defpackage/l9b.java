package defpackage;

/* renamed from: l9b  reason: default package */
public final class l9b implements fjf<k9b> {
    private final wlf<e9b> a;

    public l9b(wlf<e9b> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k9b(this.a.get());
    }
}
