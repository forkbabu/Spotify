package defpackage;

/* renamed from: jr0  reason: default package */
public final class jr0 implements fjf<ir0> {
    private final wlf<Boolean> a;
    private final wlf<fr0> b;
    private final wlf<lr0> c;

    public jr0(wlf<Boolean> wlf, wlf<fr0> wlf2, wlf<lr0> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ir0(this.a.get().booleanValue(), this.b.get(), this.c.get());
    }
}
