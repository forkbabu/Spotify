package defpackage;

/* renamed from: u9a  reason: default package */
public final class u9a implements fjf<t9a> {
    private final wlf<p8a> a;

    public u9a(wlf<p8a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t9a(this.a);
    }
}
