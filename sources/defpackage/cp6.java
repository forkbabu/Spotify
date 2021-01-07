package defpackage;

/* renamed from: cp6  reason: default package */
public final class cp6 implements fjf<bp6> {
    private final wlf<yo6> a;

    public cp6(wlf<yo6> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bp6(this.a.get());
    }
}
