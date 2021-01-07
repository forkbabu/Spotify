package defpackage;

/* renamed from: az5  reason: default package */
public final class az5 implements fjf<zy5> {
    private final wlf<ere> a;

    public az5(wlf<ere> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zy5(this.a.get());
    }
}
