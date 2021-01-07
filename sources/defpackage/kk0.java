package defpackage;

import com.spotify.eventsender.n0;
import com.spotify.eventsender.s0;

/* access modifiers changed from: package-private */
/* renamed from: kk0  reason: default package */
public class kk0 {
    private final n0 a;
    private final bk0 b;
    private int c = -1;

    kk0(n0 n0Var, bk0 bk0) {
        this.a = n0Var;
        this.b = bk0;
    }

    /* access modifiers changed from: package-private */
    public synchronized int a() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int a2 = ((s0) this.a).a("monotonic_clock_id", -1);
        if (a2 == -1) {
            this.b.a();
            ((s0) this.a).c("monotonic_clock_id", 1);
            this.c = 1;
            return 1;
        }
        if (this.b.b()) {
            a2++;
            ((s0) this.a).c("monotonic_clock_id", a2);
        }
        this.c = a2;
        return a2;
    }
}
