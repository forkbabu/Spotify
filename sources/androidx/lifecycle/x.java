package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.z;

public class x implements n {
    private static final x r = new x();
    private int a = 0;
    private int b = 0;
    private boolean c = true;
    private boolean f = true;
    private Handler n;
    private final o o = new o(this);
    private Runnable p = new a();
    z.a q = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x.this.e();
            x.this.f();
        }
    }

    class b implements z.a {
        b() {
        }
    }

    private x() {
    }

    public static n g() {
        return r;
    }

    static void h(Context context) {
        x xVar = r;
        xVar.getClass();
        xVar.n = new Handler();
        xVar.o.f(Lifecycle.Event.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new y(xVar));
    }

    @Override // androidx.lifecycle.n
    public Lifecycle A() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            this.n.postDelayed(this.p, 700);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int i = this.b + 1;
        this.b = i;
        if (i != 1) {
            return;
        }
        if (this.c) {
            this.o.f(Lifecycle.Event.ON_RESUME);
            this.c = false;
            return;
        }
        this.n.removeCallbacks(this.p);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        int i = this.a + 1;
        this.a = i;
        if (i == 1 && this.f) {
            this.o.f(Lifecycle.Event.ON_START);
            this.f = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        int i = this.a - 1;
        this.a = i;
        if (i == 0 && this.c) {
            this.o.f(Lifecycle.Event.ON_STOP);
            this.f = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (this.b == 0) {
            this.c = true;
            this.o.f(Lifecycle.Event.ON_PAUSE);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (this.a == 0 && this.c) {
            this.o.f(Lifecycle.Event.ON_STOP);
            this.f = true;
        }
    }
}
