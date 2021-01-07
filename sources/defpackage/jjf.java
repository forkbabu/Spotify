package defpackage;

/* renamed from: jjf  reason: default package */
public final class jjf<T> implements wlf<ajf<T>> {
    private final wlf<T> a;

    private jjf(wlf<T> wlf) {
        this.a = wlf;
    }

    public static <T> wlf<ajf<T>> a(wlf<T> wlf) {
        wlf.getClass();
        return new jjf(wlf);
    }

    @Override // defpackage.wlf
    public Object get() {
        return ejf.a(this.a);
    }
}
