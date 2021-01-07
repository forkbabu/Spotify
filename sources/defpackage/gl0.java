package defpackage;

/* renamed from: gl0  reason: default package */
public abstract class gl0<T> {
    protected final hl0 a;

    public gl0(hl0 hl0) {
        this.a = hl0;
    }

    /* access modifiers changed from: protected */
    public abstract String a(T t);

    /* access modifiers changed from: protected */
    public abstract byte[] b(T t);

    public void c(T t) {
        this.a.b(a(t), b(t));
    }

    public void d(T t) {
        this.a.a(a(t), b(t));
    }
}
