package defpackage;

/* renamed from: dt6  reason: default package */
public final class dt6 implements fjf<ct6> {
    private final wlf<et6> a;
    private final wlf<lga> b;
    private final wlf<Boolean> c;
    private final wlf<fga> d;

    public dt6(wlf<et6> wlf, wlf<lga> wlf2, wlf<Boolean> wlf3, wlf<fga> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ct6(this.a.get(), this.b.get(), this.c.get().booleanValue(), this.d.get());
    }
}
