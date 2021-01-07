package defpackage;

/* renamed from: b39  reason: default package */
public final class b39 implements fjf<a39> {
    private final wlf<w59> a;
    private final wlf<u59> b;
    private final wlf<c69> c;

    public b39(wlf<w59> wlf, wlf<u59> wlf2, wlf<c69> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a39(this.a.get(), this.b.get(), this.c.get());
    }
}
