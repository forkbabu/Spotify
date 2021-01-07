package defpackage;

/* renamed from: bn6  reason: default package */
public final class bn6 implements fjf<an6> {
    private final wlf<cn6> a;

    public bn6(wlf<cn6> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new an6(this.a.get());
    }
}
