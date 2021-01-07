package com.spotify.mobius;

public final class a0 {
    private static final xpf a = ypf.d(a0.class);
    private static final a b;
    private static a c;

    public interface a {
    }

    static {
        c cVar = c.a;
        b = cVar;
        c = cVar;
    }

    private a0() {
    }

    public static synchronized void a(Throwable th) {
        synchronized (a0.class) {
            ((c) c).getClass();
            b(th);
        }
    }

    static /* synthetic */ void b(Throwable th) {
        a.n("Uncaught error", th);
    }
}
