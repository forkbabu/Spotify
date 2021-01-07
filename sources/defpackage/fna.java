package defpackage;

/* renamed from: fna  reason: default package */
public final class fna implements fjf<ena> {
    private final wlf<b61> a;
    private final wlf<e61> b;

    public fna(wlf<b61> wlf, wlf<e61> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ena(this.a.get(), this.b.get());
    }
}
