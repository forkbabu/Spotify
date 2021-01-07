package defpackage;

/* renamed from: rda  reason: default package */
public final class rda implements fjf<qda> {
    private final wlf<Boolean> a;
    private final wlf<oda> b;
    private final wlf<mda> c;

    public rda(wlf<Boolean> wlf, wlf<oda> wlf2, wlf<mda> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qda(this.a.get().booleanValue(), this.b.get(), this.c.get());
    }
}
