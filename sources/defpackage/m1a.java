package defpackage;

/* renamed from: m1a  reason: default package */
public final class m1a implements fjf<l1a> {
    private final wlf<a0a> a;

    public m1a(wlf<a0a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l1a(this.a.get());
    }
}
