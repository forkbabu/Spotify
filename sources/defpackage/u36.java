package defpackage;

/* renamed from: u36  reason: default package */
public final class u36 implements fjf<t36> {
    private final wlf<v36> a;

    public u36(wlf<v36> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t36(this.a.get());
    }
}
