package defpackage;

/* renamed from: rb3  reason: default package */
public final class rb3 implements fjf<Boolean> {

    /* access modifiers changed from: private */
    /* renamed from: rb3$a */
    public static final class a {
        private static final rb3 a = new rb3();
    }

    public static rb3 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        Boolean bool = Boolean.TRUE;
        yif.g(bool, "Cannot return null from a non-@Nullable @Provides method");
        return bool;
    }
}
