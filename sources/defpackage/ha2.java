package defpackage;

/* renamed from: ha2  reason: default package */
public class ha2 implements ia2 {
    private boolean a;

    @Override // defpackage.ia2
    public synchronized void a(Runnable runnable) {
        if (!this.a) {
            runnable.run();
        }
    }

    @Override // defpackage.w92
    public synchronized void dispose() {
        this.a = true;
    }
}
