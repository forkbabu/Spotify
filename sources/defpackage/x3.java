package defpackage;

/* renamed from: x3  reason: default package */
public class x3<T> extends w3<T> {
    private final Object c = new Object();

    public x3(int i) {
        super(i);
    }

    @Override // defpackage.w3
    public T a() {
        T t;
        synchronized (this.c) {
            t = (T) super.a();
        }
        return t;
    }

    @Override // defpackage.w3
    public boolean b(T t) {
        boolean b;
        synchronized (this.c) {
            b = super.b(t);
        }
        return b;
    }
}
