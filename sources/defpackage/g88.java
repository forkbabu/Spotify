package defpackage;

/* renamed from: g88  reason: default package */
public final class g88 implements fjf<td8> {
    private final wlf<ud8> a;

    public g88(wlf<ud8> wlf) {
        this.a = wlf;
    }

    public static td8 a(ud8 ud8) {
        td8 a2 = ud8.a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
