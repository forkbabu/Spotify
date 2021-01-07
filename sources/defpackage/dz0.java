package defpackage;

/* renamed from: dz0  reason: default package */
public final class dz0 implements fjf<cz0> {
    private final wlf<hz0> a;

    public dz0(wlf<hz0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cz0(this.a.get());
    }
}
