package com.airbnb.lottie;

/* access modifiers changed from: package-private */
public class m implements Runnable {
    final /* synthetic */ n a;

    m(n nVar) {
        this.a = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.a.d != null) {
            l lVar = this.a.d;
            if (lVar.b() != null) {
                n.b(this.a, lVar.b());
            } else {
                n.c(this.a, lVar.a());
            }
        }
    }
}
