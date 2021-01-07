package defpackage;

/* renamed from: djf  reason: default package */
public final class djf<T> implements fjf<T> {
    private wlf<T> a;

    public static <T> void a(wlf<T> wlf, wlf<T> wlf2) {
        djf djf = (djf) wlf;
        if (djf.a == null) {
            djf.a = wlf2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.wlf
    public T get() {
        wlf<T> wlf = this.a;
        if (wlf != null) {
            return wlf.get();
        }
        throw new IllegalStateException();
    }
}
