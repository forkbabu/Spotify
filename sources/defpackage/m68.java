package defpackage;

/* renamed from: m68  reason: default package */
public final class m68 implements fjf<l68> {
    private final wlf<Boolean> a;
    private final wlf<f68> b;
    private final wlf<i68> c;

    public m68(wlf<Boolean> wlf, wlf<f68> wlf2, wlf<i68> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l68(this.a.get().booleanValue(), this.b.get(), this.c.get());
    }
}
