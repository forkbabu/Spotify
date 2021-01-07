package defpackage;

/* renamed from: sa7  reason: default package */
public final class sa7 implements fjf<ra7> {
    private final wlf<pa7> a;
    private final wlf<ta7> b;

    public sa7(wlf<pa7> wlf, wlf<ta7> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ra7(this.a.get(), this.b.get());
    }
}
