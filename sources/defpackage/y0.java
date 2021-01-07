package defpackage;

import java.util.concurrent.Executor;

/* renamed from: y0  reason: default package */
public class y0 extends a1 {
    private static volatile y0 c;
    private static final Executor d = new a();
    private a1 a;
    private a1 b;

    /* renamed from: y0$a */
    static class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            y0.e().a(runnable);
        }
    }

    private y0() {
        z0 z0Var = new z0();
        this.b = z0Var;
        this.a = z0Var;
    }

    public static Executor d() {
        return d;
    }

    public static y0 e() {
        if (c != null) {
            return c;
        }
        synchronized (y0.class) {
            if (c == null) {
                c = new y0();
            }
        }
        return c;
    }

    @Override // defpackage.a1
    public void a(Runnable runnable) {
        this.a.a(runnable);
    }

    @Override // defpackage.a1
    public boolean b() {
        return this.a.b();
    }

    @Override // defpackage.a1
    public void c(Runnable runnable) {
        this.a.c(runnable);
    }
}
