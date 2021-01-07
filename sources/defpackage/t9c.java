package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.ubi.specification.factories.z3;

/* renamed from: t9c  reason: default package */
public class t9c {
    private final jz1 a;
    private final cqe b;
    private final ere c;
    private final z3 d;

    public t9c(jz1 jz1, cqe cqe, ere ere, z3 z3Var) {
        jz1.getClass();
        this.a = jz1;
        this.b = cqe;
        this.c = ere;
        this.d = z3Var;
    }

    public void a(String str) {
        this.a.a(new da1(str, "com.spotify.service.socialondemand", null, "error-popup", 0, null, "play-track-multiple-times-per-day-dialog", "dialog", (double) this.b.d()));
        this.c.a(this.d.b(str).a());
        Logger.l("Log play track multiple times per day dialog impression - RequestId: %s", str);
    }
}
