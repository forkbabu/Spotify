package defpackage;

/* renamed from: k98  reason: default package */
public final class k98 implements fjf<sg0<jua, b91>> {
    private final wlf<Boolean> a;
    private final wlf<cua> b;
    private final wlf<aua> c;

    public k98(wlf<Boolean> wlf, wlf<cua> wlf2, wlf<aua> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        cua cua;
        boolean booleanValue = this.a.get().booleanValue();
        wlf<cua> wlf = this.b;
        wlf<aua> wlf2 = this.c;
        if (booleanValue) {
            cua = wlf2.get();
        } else {
            cua = wlf.get();
        }
        yif.g(cua, "Cannot return null from a non-@Nullable @Provides method");
        return cua;
    }
}
