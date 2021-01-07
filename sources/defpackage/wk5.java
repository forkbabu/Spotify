package defpackage;

/* renamed from: wk5  reason: default package */
public final class wk5 implements fjf<yn0> {

    /* access modifiers changed from: private */
    /* renamed from: wk5$a */
    public static final class a {
        private static final wk5 a = new wk5();
    }

    public static wk5 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        yn0 yn0 = bu9.z;
        yif.g(yn0, "Cannot return null from a non-@Nullable @Provides method");
        return yn0;
    }
}
