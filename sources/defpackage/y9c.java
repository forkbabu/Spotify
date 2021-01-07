package defpackage;

import com.spotify.android.flags.c;
import com.spotify.remoteconfig.h9;

/* renamed from: y9c  reason: default package */
public class y9c {
    private final c a;
    private final fm9 b;
    private final h9 c;

    public y9c(c cVar, fm9 fm9, h9 h9Var) {
        this.a = cVar;
        this.b = fm9;
        this.c = h9Var;
    }

    public boolean a() {
        return this.b.a(this.a) && this.c.b() && !"active".equals((String) this.a.M0(g51.g));
    }

    public boolean b() {
        return a() && this.c.a();
    }
}
