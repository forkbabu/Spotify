package defpackage;

/* renamed from: en5  reason: default package */
public final class en5 implements fjf<dn5> {
    private final wlf<ere> a;

    public en5(wlf<ere> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dn5(this.a.get());
    }
}
