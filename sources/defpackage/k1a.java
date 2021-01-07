package defpackage;

/* renamed from: k1a  reason: default package */
public final class k1a implements fjf<j1a> {
    private final wlf<zz9> a;

    public k1a(wlf<zz9> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j1a(this.a.get());
    }
}
