package defpackage;

/* renamed from: de1  reason: default package */
public final class de1 implements fjf<ce1> {
    private final wlf<fi1> a;
    private final wlf<ud1> b;

    public de1(wlf<fi1> wlf, wlf<ud1> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ce1(this.a, this.b.get());
    }
}
