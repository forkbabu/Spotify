package defpackage;

import com.spotify.eventsender.n0;
import com.spotify.eventsender.s0;
import java.util.UUID;

/* renamed from: ik0  reason: default package */
public class ik0 {
    private volatile String a;
    private final n0 b;

    public ik0(n0 n0Var) {
        this.b = n0Var;
    }

    public synchronized String a() {
        if (this.a == null) {
            n0 n0Var = this.b;
            n0Var.getClass();
            String b2 = ((s0) n0Var).b("installation_id", null);
            if (b2 == null) {
                b2 = UUID.randomUUID().toString();
                ((s0) this.b).d("installation_id", b2);
            }
            this.a = b2;
        }
        return this.a;
    }
}
