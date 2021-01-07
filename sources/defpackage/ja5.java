package defpackage;

/* renamed from: ja5  reason: default package */
public final class ja5 implements fjf<ia5> {
    private final wlf<rf3> a;

    public ja5(wlf<rf3> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ia5(this.a.get());
    }
}
