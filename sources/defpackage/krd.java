package defpackage;

/* renamed from: krd  reason: default package */
public final class krd implements fjf<jrd> {
    private final wlf<lrd> a;

    public krd(wlf<lrd> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jrd(this.a.get());
    }
}
