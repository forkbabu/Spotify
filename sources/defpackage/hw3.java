package defpackage;

/* renamed from: hw3  reason: default package */
public final class hw3 implements fjf<gw3> {

    /* access modifiers changed from: private */
    /* renamed from: hw3$a */
    public static final class a {
        private static final hw3 a = new hw3();
    }

    public static hw3 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gw3();
    }
}
