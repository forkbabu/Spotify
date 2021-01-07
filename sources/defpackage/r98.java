package defpackage;

/* renamed from: r98  reason: default package */
public final class r98 implements fjf<u7b> {
    private final wlf<q7b> a;
    private final wlf<o7b> b;
    private final wlf<Boolean> c;

    public r98(wlf<q7b> wlf, wlf<o7b> wlf2, wlf<Boolean> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        q7b q7b;
        wlf<q7b> wlf = this.a;
        wlf<o7b> wlf2 = this.b;
        if (this.c.get().booleanValue()) {
            q7b = wlf2.get();
        } else {
            q7b = wlf.get();
        }
        yif.g(q7b, "Cannot return null from a non-@Nullable @Provides method");
        return q7b;
    }
}
