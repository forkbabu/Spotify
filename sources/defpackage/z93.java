package defpackage;

/* renamed from: z93  reason: default package */
public final class z93 implements fjf<yn0> {

    /* access modifiers changed from: private */
    /* renamed from: z93$a */
    public static final class a {
        private static final z93 a = new z93();
    }

    public static z93 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        yn0 yn0 = bu9.h;
        yif.g(yn0, "Cannot return null from a non-@Nullable @Provides method");
        return yn0;
    }
}
