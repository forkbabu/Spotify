package androidx.fragment.app;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.n;
import androidx.lifecycle.o;

/* access modifiers changed from: package-private */
public class k0 implements n {
    private o a = null;

    k0() {
    }

    @Override // androidx.lifecycle.n
    public Lifecycle A() {
        if (this.a == null) {
            this.a = new o(this);
        }
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public void a(Lifecycle.Event event) {
        this.a.f(event);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.a == null) {
            this.a = new o(this);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.a != null;
    }

    /* access modifiers changed from: package-private */
    public void d(Lifecycle.State state) {
        this.a.k(state);
    }
}
