package defpackage;

/* renamed from: v9a  reason: default package */
public final class v9a implements fjf<s9a> {
    private final wlf<p8a> a;

    public v9a(wlf<p8a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s9a(this.a.get());
    }
}
