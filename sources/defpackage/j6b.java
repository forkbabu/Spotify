package defpackage;

/* renamed from: j6b  reason: default package */
public final class j6b implements fjf<i6b> {
    private final wlf<w5b> a;

    public j6b(wlf<w5b> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i6b(this.a.get());
    }
}
