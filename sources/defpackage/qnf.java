package defpackage;

/* renamed from: qnf  reason: default package */
public abstract class qnf implements Runnable {
    protected final String a;

    public qnf(String str, Object... objArr) {
        this.a = rnf.o(str, objArr);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.a);
        try {
            a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
