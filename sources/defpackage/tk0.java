package defpackage;

import com.spotify.eventsender.n0;
import com.spotify.eventsender.s0;
import java.util.UUID;

/* renamed from: tk0  reason: default package */
public class tk0 {
    private wk0 a;
    private final n0 b;

    public tk0(wk0 wk0, n0 n0Var) {
        this.a = wk0;
        this.b = n0Var;
    }

    public synchronized String a() {
        if (!(((xk0) this.a).a() == 0)) {
            n0 n0Var = this.b;
            n0Var.getClass();
            String b2 = ((s0) n0Var).b("database_id", null);
            if (b2 != null) {
                return b2;
            }
            String uuid = UUID.randomUUID().toString();
            ((s0) this.b).d("database_id", uuid);
            return uuid;
        }
        String uuid2 = UUID.randomUUID().toString();
        ((s0) this.b).d("database_id", uuid2);
        return uuid2;
    }
}
