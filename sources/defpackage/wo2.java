package defpackage;

/* renamed from: wo2  reason: default package */
public final class wo2 implements fjf<vo2> {
    private final wlf<yo2> a;

    public wo2(wlf<yo2> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vo2(this.a.get());
    }
}
