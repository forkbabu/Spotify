package com.spotify.music.features.login.startview;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import com.google.common.base.Optional;

public class u extends e0 {
    private g70 c;
    private final io.reactivex.disposables.a d = new io.reactivex.disposables.a();
    private final androidx.lifecycle.u<f70> e = new androidx.lifecycle.u<>();
    private final androidx.lifecycle.u<a<Boolean>> f = new androidx.lifecycle.u<>();
    private final androidx.lifecycle.u<a<f70>> g = new androidx.lifecycle.u<>();

    public static class a<T> {
        private final T a;
        private boolean b;

        public a(T t) {
            this.a = t;
        }

        public T a() {
            if (this.b) {
                return null;
            }
            this.b = true;
            return this.a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.e0
    public void e() {
        this.d.f();
    }

    public LiveData<f70> g() {
        return this.e;
    }

    public void h(g70 g70) {
        this.c = g70;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: androidx.lifecycle.u<f70> */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void i(Optional optional) {
        if (optional.isPresent()) {
            this.e.l(optional.get());
        } else {
            this.f.l(new a<>(Boolean.TRUE));
        }
    }

    public /* synthetic */ void j() {
        this.f.l(new a<>(Boolean.TRUE));
    }

    public void k() {
        this.d.b(this.c.a().subscribe(new k(this)));
    }

    public void l() {
        f70 e2 = this.e.e();
        if (e2 != null) {
            this.g.n(new a<>(e2));
        }
    }

    public LiveData<a<f70>> m() {
        return this.g;
    }

    public LiveData<a<Boolean>> n() {
        return this.f;
    }

    public void o() {
        this.d.b(this.c.e().subscribe(new j(this)));
    }
}
