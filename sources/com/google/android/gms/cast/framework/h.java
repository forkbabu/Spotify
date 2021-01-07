package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.cast.internal.b;

public abstract class h {
    private static final b c = new b("Session");
    private final j0 a;
    private final a b;

    class a extends o {
        a(p pVar) {
        }

        public final void D3(boolean z) {
            h.this.a(z);
        }

        public final long E3() {
            return h.this.b();
        }

        public final void F3(Bundle bundle) {
            h.this.i(bundle);
        }

        public final void G3(Bundle bundle) {
            h.this.j(bundle);
        }

        public final void H3(Bundle bundle) {
            h.this.k(bundle);
        }

        public final void I3(Bundle bundle) {
            h.this.l(bundle);
        }

        public final com.google.android.gms.dynamic.a J3() {
            return com.google.android.gms.dynamic.b.F3(h.this);
        }
    }

    protected h(Context context, String str, String str2) {
        a aVar = new a(null);
        this.b = aVar;
        this.a = com.google.android.gms.internal.cast.h.e(context, str, str2, aVar);
    }

    /* access modifiers changed from: protected */
    public abstract void a(boolean z);

    public long b() {
        g.g("Must be called from the main thread.");
        return 0;
    }

    public boolean c() {
        g.g("Must be called from the main thread.");
        try {
            return this.a.h();
        } catch (RemoteException e) {
            c.b(e, "Unable to call %s on %s.", "isConnected", j0.class.getSimpleName());
            return false;
        }
    }

    public boolean d() {
        g.g("Must be called from the main thread.");
        try {
            return this.a.s();
        } catch (RemoteException e) {
            c.b(e, "Unable to call %s on %s.", "isConnecting", j0.class.getSimpleName());
            return false;
        }
    }

    public boolean e() {
        g.g("Must be called from the main thread.");
        try {
            return this.a.p1();
        } catch (RemoteException e) {
            c.b(e, "Unable to call %s on %s.", "isResuming", j0.class.getSimpleName());
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void f(int i) {
        try {
            this.a.t1(i);
        } catch (RemoteException e) {
            c.b(e, "Unable to call %s on %s.", "notifyFailedToResumeSession", j0.class.getSimpleName());
        }
    }

    /* access modifiers changed from: protected */
    public final void g(int i) {
        try {
            this.a.Y2(i);
        } catch (RemoteException e) {
            c.b(e, "Unable to call %s on %s.", "notifyFailedToStartSession", j0.class.getSimpleName());
        }
    }

    /* access modifiers changed from: protected */
    public final void h(int i) {
        try {
            this.a.y2(i);
        } catch (RemoteException e) {
            c.b(e, "Unable to call %s on %s.", "notifySessionEnded", j0.class.getSimpleName());
        }
    }

    /* access modifiers changed from: protected */
    public void i(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    public void j(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    public abstract void k(Bundle bundle);

    /* access modifiers changed from: protected */
    public abstract void l(Bundle bundle);

    public final com.google.android.gms.dynamic.a m() {
        try {
            return this.a.q1();
        } catch (RemoteException e) {
            c.b(e, "Unable to call %s on %s.", "getWrappedObject", j0.class.getSimpleName());
            return null;
        }
    }
}
