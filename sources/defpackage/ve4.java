package defpackage;

/* renamed from: ve4  reason: default package */
public final class ve4 implements fjf<ue4> {
    private final wlf<String> a;
    private final wlf<Boolean> b;
    private final wlf<l64> c;
    private final wlf<Boolean> d;
    private final wlf<e64> e;

    public ve4(wlf<String> wlf, wlf<Boolean> wlf2, wlf<l64> wlf3, wlf<Boolean> wlf4, wlf<e64> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ue4(this.a.get(), this.b.get().booleanValue(), this.c.get(), this.d.get().booleanValue(), this.e.get());
    }
}
