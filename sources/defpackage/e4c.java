package defpackage;

/* renamed from: e4c  reason: default package */
public final class e4c implements fjf<d4c> {
    private final wlf<b42> a;
    private final wlf<h32> b;

    public e4c(wlf<b42> wlf, wlf<h32> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d4c(this.a.get(), this.b.get());
    }
}
