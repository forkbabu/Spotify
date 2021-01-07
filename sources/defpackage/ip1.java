package defpackage;

/* renamed from: ip1  reason: default package */
public final class ip1 implements fjf<hp1> {
    private final wlf<ere> a;

    public ip1(wlf<ere> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hp1(this.a.get());
    }
}
