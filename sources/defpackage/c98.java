package defpackage;

/* renamed from: c98  reason: default package */
public final class c98 implements fjf<String> {
    private final wlf<ud8> a;

    public c98(wlf<ud8> wlf) {
        this.a = wlf;
    }

    public static String a(ud8 ud8) {
        String b = ud8.b();
        yif.g(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
