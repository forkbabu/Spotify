package io.netty.util.concurrent;

/* access modifiers changed from: package-private */
public final class j implements Runnable {
    final /* synthetic */ r a;
    final /* synthetic */ s b;

    j(r rVar, s sVar) {
        this.a = rVar;
        this.b = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        i.J(this.a, this.b);
    }
}
