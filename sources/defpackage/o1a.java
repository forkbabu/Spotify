package defpackage;

/* renamed from: o1a  reason: default package */
public final class o1a implements fjf<n1a> {
    private final wlf<b0a> a;

    public o1a(wlf<b0a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n1a(this.a.get());
    }
}
