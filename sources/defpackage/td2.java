package defpackage;

/* renamed from: td2  reason: default package */
public final class td2 implements fjf<sd2> {
    private final wlf<vp3> a;

    public td2(wlf<vp3> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new sd2(this.a.get());
    }
}
