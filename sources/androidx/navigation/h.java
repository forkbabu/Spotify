package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.i;
import androidx.lifecycle.i0;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.savedstate.SavedStateRegistry;
import java.util.UUID;

public final class h implements n, i0, i, androidx.savedstate.b {
    private final Context a;
    private final m b;
    private Bundle c;
    private final o f;
    private final androidx.savedstate.a n;
    final UUID o;
    private Lifecycle.State p;
    private Lifecycle.State q;
    private j r;
    private g0.b s;
    private a0 t;

    private static class a extends androidx.lifecycle.a {
        a(androidx.savedstate.b bVar, Bundle bundle) {
            super(bVar, null);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.lifecycle.a
        public <T extends e0> T d(String str, Class<T> cls, a0 a0Var) {
            return new b(a0Var);
        }
    }

    private static class b extends e0 {
        private a0 c;

        b(a0 a0Var) {
            this.c = a0Var;
        }

        public a0 g() {
            return this.c;
        }
    }

    h(Context context, m mVar, Bundle bundle, n nVar, j jVar) {
        this(context, mVar, bundle, nVar, jVar, UUID.randomUUID(), null);
    }

    @Override // androidx.lifecycle.n
    public Lifecycle A() {
        return this.f;
    }

    @Override // androidx.lifecycle.i0
    public h0 Z() {
        j jVar = this.r;
        if (jVar != null) {
            return jVar.i(this.o);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public Bundle a() {
        return this.c;
    }

    public m b() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public Lifecycle.State c() {
        return this.q;
    }

    public a0 d() {
        if (this.t == null) {
            this.t = ((b) new g0(Z(), new a(this, null)).a(b.class)).g();
        }
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public void e(Lifecycle.Event event) {
        Lifecycle.State state;
        int ordinal = event.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    state = Lifecycle.State.RESUMED;
                } else if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            state = Lifecycle.State.DESTROYED;
                        } else {
                            throw new IllegalArgumentException("Unexpected event value " + event);
                        }
                    }
                }
                this.p = state;
                i();
            }
            state = Lifecycle.State.STARTED;
            this.p = state;
            i();
        }
        state = Lifecycle.State.CREATED;
        this.p = state;
        i();
    }

    /* access modifiers changed from: package-private */
    public void f(Bundle bundle) {
        this.c = bundle;
    }

    /* access modifiers changed from: package-private */
    public void g(Bundle bundle) {
        this.n.d(bundle);
    }

    @Override // androidx.savedstate.b
    public SavedStateRegistry g0() {
        return this.n.b();
    }

    /* access modifiers changed from: package-private */
    public void h(Lifecycle.State state) {
        this.q = state;
        i();
    }

    /* access modifiers changed from: package-private */
    public void i() {
        if (this.p.ordinal() < this.q.ordinal()) {
            this.f.k(this.p);
        } else {
            this.f.k(this.q);
        }
    }

    @Override // androidx.lifecycle.i
    public g0.b l1() {
        if (this.s == null) {
            this.s = new b0((Application) this.a.getApplicationContext(), this, this.c);
        }
        return this.s;
    }

    h(Context context, m mVar, Bundle bundle, n nVar, j jVar, UUID uuid, Bundle bundle2) {
        this.f = new o(this);
        androidx.savedstate.a a2 = androidx.savedstate.a.a(this);
        this.n = a2;
        this.p = Lifecycle.State.CREATED;
        this.q = Lifecycle.State.RESUMED;
        this.a = context;
        this.o = uuid;
        this.b = mVar;
        this.c = bundle;
        this.r = jVar;
        a2.c(bundle2);
        if (nVar != null) {
            this.p = nVar.A().b();
        }
    }
}
