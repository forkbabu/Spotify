package defpackage;

/* renamed from: iz5  reason: default package */
public final class iz5 implements fjf<hz5> {
    private final wlf<ere> a;

    public iz5(wlf<ere> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hz5(this.a.get());
    }
}
