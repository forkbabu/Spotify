package defpackage;

import com.spotify.eventsender.n0;
import com.spotify.eventsender.s0;

/* access modifiers changed from: package-private */
/* renamed from: nk0  reason: default package */
public class nk0 implements bk0 {
    private final n0 a;
    private final ck0 b;

    nk0(n0 n0Var, ck0 ck0) {
        this.a = n0Var;
        this.b = ck0;
    }

    @Override // defpackage.bk0
    public void a() {
        ((s0) this.a).d("boot_id", this.b.a());
    }

    @Override // defpackage.bk0
    public boolean b() {
        String b2 = ((s0) this.a).b("boot_id", null);
        String a2 = this.b.a();
        if (b2 != null && b2.equals(a2)) {
            return false;
        }
        ((s0) this.a).d("boot_id", a2);
        return true;
    }
}
