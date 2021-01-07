package defpackage;

/* renamed from: th6  reason: default package */
public final class th6 implements fjf<sh6> {
    private final wlf<kh6> a;

    public th6(wlf<kh6> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new sh6(this.a.get());
    }
}
