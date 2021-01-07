package defpackage;

/* renamed from: kf4  reason: default package */
public final class kf4 implements fjf<jf4> {
    private final wlf<String> a;

    public kf4(wlf<String> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jf4(this.a.get());
    }
}
