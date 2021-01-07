package okio;

/* access modifiers changed from: package-private */
public final class u {
    static t a;
    static long b;

    private u() {
    }

    static void a(t tVar) {
        if (tVar.f != null || tVar.g != null) {
            throw new IllegalArgumentException();
        } else if (!tVar.d) {
            synchronized (u.class) {
                long j = b + 8192;
                if (j <= 65536) {
                    b = j;
                    tVar.f = a;
                    tVar.c = 0;
                    tVar.b = 0;
                    a = tVar;
                }
            }
        }
    }

    static t b() {
        synchronized (u.class) {
            t tVar = a;
            if (tVar == null) {
                return new t();
            }
            a = tVar.f;
            tVar.f = null;
            b -= 8192;
            return tVar;
        }
    }
}
