package defpackage;

/* renamed from: es3  reason: default package */
public final class es3 implements fjf<ds3> {
    private final wlf<ol3> a;

    public es3(wlf<ol3> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ds3(this.a.get());
    }
}
