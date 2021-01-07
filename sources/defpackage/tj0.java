package defpackage;

/* renamed from: tj0  reason: default package */
public final class tj0 implements fjf<Boolean> {
    private final wlf<rj0> a;

    public tj0(wlf<rj0> wlf) {
        this.a = wlf;
    }

    public static boolean a(rj0 rj0) {
        return rj0.a();
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().a());
    }
}
