package defpackage;

import androidx.work.j;
import java.util.HashMap;
import java.util.Map;

/* renamed from: w8  reason: default package */
public class w8 {
    static final String d = j.f("DelayedWorkTracker");
    final x8 a;
    private final androidx.work.impl.a b;
    private final Map<String, Runnable> c = new HashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: w8$a */
    public class a implements Runnable {
        final /* synthetic */ ga a;

        a(ga gaVar) {
            this.a = gaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.c().a(w8.d, String.format("Scheduling work %s", this.a.a), new Throwable[0]);
            w8.this.a.c(this.a);
        }
    }

    public w8(x8 x8Var, androidx.work.impl.a aVar) {
        this.a = x8Var;
        this.b = aVar;
    }

    public void a(ga gaVar) {
        Runnable remove = this.c.remove(gaVar.a);
        if (remove != null) {
            this.b.a(remove);
        }
        a aVar = new a(gaVar);
        this.c.put(gaVar.a, aVar);
        long currentTimeMillis = System.currentTimeMillis();
        this.b.b(gaVar.a() - currentTimeMillis, aVar);
    }

    public void b(String str) {
        Runnable remove = this.c.remove(str);
        if (remove != null) {
            this.b.a(remove);
        }
    }
}
