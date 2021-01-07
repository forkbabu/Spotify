package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.cast.internal.b;
import com.google.android.gms.dynamic.a;

public class i {
    private static final b c = new b("SessionManager");
    private final k0 a;
    private final Context b;

    public i(k0 k0Var, Context context) {
        this.a = k0Var;
        this.b = context;
    }

    /* access modifiers changed from: package-private */
    public final void a(d dVar) {
        try {
            this.a.O(new w(dVar));
        } catch (RemoteException e) {
            c.b(e, "Unable to call %s on %s.", "addCastStateListener", k0.class.getSimpleName());
        }
    }

    public <T extends h> void b(j<T> jVar, Class<T> cls) {
        if (jVar != null) {
            g.g("Must be called from the main thread.");
            try {
                this.a.f2(new q(jVar, cls));
            } catch (RemoteException e) {
                c.b(e, "Unable to call %s on %s.", "addSessionManagerListener", k0.class.getSimpleName());
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public void c(boolean z) {
        g.g("Must be called from the main thread.");
        try {
            c.e("End session for %s", this.b.getPackageName());
            this.a.L(true, z);
        } catch (RemoteException e) {
            c.b(e, "Unable to call %s on %s.", "endCurrentSession", k0.class.getSimpleName());
        }
    }

    public c d() {
        g.g("Must be called from the main thread.");
        h e = e();
        if (e == null || !(e instanceof c)) {
            return null;
        }
        return (c) e;
    }

    public h e() {
        g.g("Must be called from the main thread.");
        try {
            return (h) com.google.android.gms.dynamic.b.E3(this.a.F1());
        } catch (RemoteException e) {
            c.b(e, "Unable to call %s on %s.", "getWrappedCurrentSession", k0.class.getSimpleName());
            return null;
        }
    }

    public <T extends h> void f(j<T> jVar, Class cls) {
        g.g("Must be called from the main thread.");
        try {
            this.a.q2(new q(jVar, cls));
        } catch (RemoteException e) {
            c.b(e, "Unable to call %s on %s.", "removeSessionManagerListener", k0.class.getSimpleName());
        }
    }

    public final a g() {
        try {
            return this.a.w();
        } catch (RemoteException e) {
            c.b(e, "Unable to call %s on %s.", "getWrappedThis", k0.class.getSimpleName());
            return null;
        }
    }
}
