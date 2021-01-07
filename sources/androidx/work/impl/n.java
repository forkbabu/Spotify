package androidx.work.impl;

import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.a;
import androidx.work.j;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

class n implements Runnable {
    final /* synthetic */ a a;
    final /* synthetic */ String b;
    final /* synthetic */ o c;

    n(o oVar, a aVar, String str) {
        this.c = oVar;
        this.a = aVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ListenableWorker.a aVar = (ListenableWorker.a) this.a.get();
            if (aVar == null) {
                j.c().b(o.C, String.format("%s returned a null result. Treating it as a failure.", this.c.n.c), new Throwable[0]);
            } else {
                j.c().a(o.C, String.format("%s returned a %s result.", this.c.n.c, aVar), new Throwable[0]);
                this.c.p = aVar;
            }
        } catch (CancellationException e) {
            j.c().d(o.C, String.format("%s was cancelled", this.b), e);
        } catch (InterruptedException | ExecutionException e2) {
            j.c().b(o.C, String.format("%s failed because it threw an exception/error", this.b), e2);
        } catch (Throwable th) {
            this.c.d();
            throw th;
        }
        this.c.d();
    }
}
