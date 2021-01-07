package defpackage;

/* renamed from: e98  reason: default package */
public final class e98 implements fjf<td8> {
    private final wlf<wd8> a;

    public e98(wlf<wd8> wlf) {
        this.a = wlf;
    }

    public static td8 a(wd8 wd8) {
        td8 a2 = wd8.a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
