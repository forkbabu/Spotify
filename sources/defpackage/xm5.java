package defpackage;

/* renamed from: xm5  reason: default package */
public final class xm5 implements fjf<wm5> {
    private final wlf<a71> a;
    private final wlf<a71> b;
    private final wlf<vp9> c;

    public xm5(wlf<a71> wlf, wlf<a71> wlf2, wlf<vp9> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wm5(this.a.get(), this.b.get(), this.c.get());
    }
}
