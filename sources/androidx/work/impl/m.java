package androidx.work.impl;

import androidx.work.impl.utils.futures.a;
import androidx.work.j;

class m implements Runnable {
    final /* synthetic */ a a;
    final /* synthetic */ o b;

    m(o oVar, a aVar) {
        this.b = oVar;
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            j.c().a(o.C, String.format("Starting work for %s", this.b.n.c), new Throwable[0]);
            o oVar = this.b;
            oVar.A = oVar.o.n();
            this.a.A(this.b.A);
        } catch (Throwable th) {
            this.a.z(th);
        }
    }
}
