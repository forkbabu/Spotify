package defpackage;

/* renamed from: ez5  reason: default package */
public final class ez5 implements fjf<dz5> {
    private final wlf<ere> a;

    public ez5(wlf<ere> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dz5(this.a.get());
    }
}
