package defpackage;

/* renamed from: bo2  reason: default package */
public final class bo2 implements fjf<ao2> {
    private final wlf<ko2> a;

    public bo2(wlf<ko2> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ao2(this.a.get());
    }
}
