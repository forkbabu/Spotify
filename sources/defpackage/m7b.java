package defpackage;

/* renamed from: m7b  reason: default package */
public final class m7b implements fjf<l7b> {
    private final wlf<qz0> a;
    private final wlf<pz0> b;
    private final wlf<String> c;

    public m7b(wlf<qz0> wlf, wlf<pz0> wlf2, wlf<String> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l7b(this.a.get(), this.b.get(), this.c.get());
    }
}
