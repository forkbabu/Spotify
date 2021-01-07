package defpackage;

/* renamed from: z85  reason: default package */
public final class z85 implements fjf<o61> {
    private final wlf<w51> a;

    public z85(wlf<w51> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        o61 b = this.a.get().b();
        yif.g(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
