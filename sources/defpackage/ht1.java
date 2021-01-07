package defpackage;

/* renamed from: ht1  reason: default package */
public final class ht1 implements fjf<yn0> {

    /* access modifiers changed from: private */
    /* renamed from: ht1$a */
    public static final class a {
        private static final ht1 a = new ht1();
    }

    public static ht1 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        yn0 yn0 = bu9.d;
        yif.g(yn0, "Cannot return null from a non-@Nullable @Provides method");
        return yn0;
    }
}
