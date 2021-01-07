package defpackage;

/* renamed from: j84  reason: default package */
public final class j84 implements fjf<i84> {
    private final wlf<y74> a;

    public j84(wlf<y74> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i84(this.a.get());
    }
}
