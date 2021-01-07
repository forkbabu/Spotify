package androidx.work.impl.foreground;

import androidx.work.impl.WorkDatabase;

/* access modifiers changed from: package-private */
public class b implements Runnable {
    final /* synthetic */ WorkDatabase a;
    final /* synthetic */ String b;
    final /* synthetic */ c c;

    b(c cVar, WorkDatabase workDatabase, String str) {
        this.c = cVar;
        this.a = workDatabase;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        ga p = ((ia) this.a.z()).p(this.b);
        if (p != null && p.b()) {
            synchronized (this.c.f) {
                this.c.q.put(this.b, p);
                this.c.r.add(p);
                c cVar = this.c;
                cVar.s.d(cVar.r);
            }
        }
    }
}
