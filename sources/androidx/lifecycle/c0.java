package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;

public class c0 {
    private final o a;
    private final Handler b = new Handler();
    private a c;

    /* access modifiers changed from: package-private */
    public static class a implements Runnable {
        private final o a;
        final Lifecycle.Event b;
        private boolean c = false;

        a(o oVar, Lifecycle.Event event) {
            this.a = oVar;
            this.b = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.c) {
                this.a.f(this.b);
                this.c = true;
            }
        }
    }

    public c0(n nVar) {
        this.a = new o(nVar);
    }

    private void f(Lifecycle.Event event) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.a, event);
        this.c = aVar2;
        this.b.postAtFrontOfQueue(aVar2);
    }

    public Lifecycle a() {
        return this.a;
    }

    public void b() {
        f(Lifecycle.Event.ON_START);
    }

    public void c() {
        f(Lifecycle.Event.ON_CREATE);
    }

    public void d() {
        f(Lifecycle.Event.ON_STOP);
        f(Lifecycle.Event.ON_DESTROY);
    }

    public void e() {
        f(Lifecycle.Event.ON_START);
    }
}
