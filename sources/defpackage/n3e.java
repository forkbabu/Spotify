package defpackage;

/* renamed from: n3e  reason: default package */
public final class n3e implements fjf<m3e> {
    private final wlf<h7e> a;

    public n3e(wlf<h7e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m3e(this.a.get());
    }
}
