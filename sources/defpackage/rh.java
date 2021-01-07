package defpackage;

/* renamed from: rh  reason: default package */
public final class rh implements fjf<oh> {
    private static final rh a = new rh();

    public static rh a() {
        return a;
    }

    @Override // defpackage.wlf
    public Object get() {
        oh ohVar = oh.a;
        yif.g(ohVar, "Cannot return null from a non-@Nullable @Provides method");
        return ohVar;
    }
}
