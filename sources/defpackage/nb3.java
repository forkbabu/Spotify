package defpackage;

/* renamed from: nb3  reason: default package */
public final class nb3 implements fjf<yn0> {

    /* access modifiers changed from: private */
    /* renamed from: nb3$a */
    public static final class a {
        private static final nb3 a = new nb3();
    }

    public static nb3 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        yn0 yn0 = bu9.y;
        yif.g(yn0, "Cannot return null from a non-@Nullable @Provides method");
        return yn0;
    }
}
