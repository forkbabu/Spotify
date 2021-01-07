package defpackage;

/* renamed from: kea  reason: default package */
public final class kea implements fjf<jea> {
    private final wlf<lea> a;

    public kea(wlf<lea> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jea(this.a.get());
    }
}
