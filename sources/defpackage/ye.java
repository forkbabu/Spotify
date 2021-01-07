package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: ye  reason: default package */
public class ye implements Runnable {
    final /* synthetic */ ze a;

    ye(ze zeVar) {
        this.a = zeVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!uf.c(this)) {
            try {
                ze.a(this.a);
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }
}
