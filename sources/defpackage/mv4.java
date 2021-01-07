package defpackage;

/* renamed from: mv4  reason: default package */
public final class mv4 implements fjf<ga0> {

    /* access modifiers changed from: private */
    /* renamed from: mv4$a */
    public static final class a {
        private static final mv4 a = new mv4();
    }

    public static mv4 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        ga0 d = e90.d();
        yif.g(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }
}
