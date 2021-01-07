package defpackage;

/* renamed from: vu2 */
public final class vu2 implements fjf<sa0> {

    /* renamed from: vu2$a */
    public static final class a {
        private static final vu2 a = new vu2();
    }

    @Override // defpackage.wlf
    public Object get() {
        sa0 e = e90.e();
        yif.g(e, "Cannot return null from a non-@Nullable @Provides method");
        return e;
    }
}
