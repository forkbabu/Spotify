package defpackage;

/* renamed from: k4e  reason: default package */
public final class k4e implements fjf<j4e> {
    private final wlf<i4e> a;

    public k4e(wlf<i4e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j4e(this.a.get());
    }
}
