package com.spotify.music.builtinauth.cache;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.internal.disposables.EmptyDisposable;

/* access modifiers changed from: package-private */
public class t0 {
    private final g<SessionState> a;
    private final l0 b;
    private final r0 c;
    private b d = EmptyDisposable.INSTANCE;

    t0(g<SessionState> gVar, l0 l0Var, r0 r0Var) {
        this.a = gVar;
        this.b = l0Var;
        this.c = r0Var;
    }

    public void a(Boolean bool) {
        this.b.clear();
        this.c.g();
    }

    public void b() {
        this.d = this.a.C(u.a).O(w.a).s().subscribe(new x(this), v.a);
    }

    public void c() {
        this.d.dispose();
    }
}
