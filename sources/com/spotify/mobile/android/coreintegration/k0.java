package com.spotify.mobile.android.coreintegration;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.session.SessionState;

public class k0 {
    private final cg3 a;
    private final cyc b;
    private final a0 c;
    private final kg3 d;
    private boolean e;

    k0(cg3 cg3, kg3 kg3, cyc cyc, a0 a0Var) {
        this.d = kg3;
        this.a = cg3;
        this.b = cyc;
        this.c = a0Var;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Logger.g("SessionDependentInfraIntegration logout", new Object[0]);
        this.d.b(Optional.absent());
        this.b.logout();
    }

    public synchronized void b(SessionState sessionState) {
        if (!this.e) {
            Logger.g("SessionDependentInfraIntegration start", new Object[0]);
            this.e = true;
            this.d.b(Optional.of(sessionState).transform(a.a));
            this.a.getClass();
            this.b.a();
            this.c.b();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void c() {
        if (this.e) {
            Logger.g("SessionDependentInfraIntegration end", new Object[0]);
            this.e = false;
            this.a.c();
            this.b.b();
            this.c.c();
        }
    }
}
