package defpackage;

/* renamed from: az0  reason: default package */
public final class az0 implements fjf<zy0> {
    private final wlf<bz0> a;

    public az0(wlf<bz0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zy0(this.a.get());
    }
}
