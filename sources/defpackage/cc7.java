package defpackage;

/* renamed from: cc7  reason: default package */
public final class cc7 implements fjf<bc7> {
    private final wlf<oa7> a;
    private final wlf<m8a> b;

    public cc7(wlf<oa7> wlf, wlf<m8a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bc7(this.a.get(), this.b.get());
    }
}
