package defpackage;

import com.spotify.eventsender.n0;
import com.spotify.eventsender.s0;

/* access modifiers changed from: package-private */
/* renamed from: mk0  reason: default package */
public class mk0 implements bk0 {
    private final n0 a;
    private final ak0 b;

    mk0(n0 n0Var, ak0 ak0) {
        this.a = n0Var;
        this.b = ak0;
    }

    @Override // defpackage.bk0
    public void a() {
        ((s0) this.a).c("boot_count", this.b.a());
    }

    @Override // defpackage.bk0
    public boolean b() {
        int a2 = ((s0) this.a).a("boot_count", -1);
        int a3 = this.b.a();
        if (a2 != -1 && a2 >= a3) {
            return false;
        }
        ((s0) this.a).c("boot_count", a3);
        return true;
    }
}
