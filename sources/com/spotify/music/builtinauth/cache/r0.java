package com.spotify.music.builtinauth.cache;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ClientIdentity;
import com.spotify.music.builtinauth.authenticator.BuiltInAuthException;
import com.spotify.music.builtinauth.authenticator.l0;
import com.spotify.music.builtinauth.authenticator.n0;
import io.reactivex.d0;
import io.reactivex.disposables.a;
import io.reactivex.z;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
public class r0 {
    private final l0 a;
    private final l0 b;
    private final a c = new a();
    private final cqe d;
    private final n0 e;
    private final jl2 f;
    private boolean g;

    r0(l0 l0Var, l0 l0Var2, cqe cqe, n0 n0Var, jl2 jl2) {
        this.a = l0Var;
        this.b = l0Var2;
        this.d = cqe;
        this.e = n0Var;
        this.f = jl2;
    }

    public static void b(r0 r0Var, List list) {
        r0Var.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            if (!r0Var.g) {
                if (a0Var.d() <= r0Var.d.d() - 2592000000L) {
                    r0Var.c.b(r0Var.b.b(a0Var).subscribe(r.a, o.a));
                } else {
                    AuthorizationRequest a2 = AuthorizationRequest.a(a0Var.c(), AuthorizationRequest.ResponseType.TOKEN, a0Var.f(), new ClientIdentity(a0Var.e(), a0Var.b()), null, (String[]) a0Var.h().toArray(new String[0]), false);
                    r0Var.f.b(a2, false, false);
                    r0Var.c.b(r0Var.a.b(a2, false).subscribe(new s(r0Var, a0Var), new p(r0Var, a0Var)));
                }
            } else {
                return;
            }
        }
    }

    public void a() {
        this.c.b(this.b.clear().subscribe(k.a, t.a));
    }

    public void c(a0 a0Var) {
        this.f.a(a0Var.e());
        if (!this.g) {
            this.c.b(this.b.d(a0.a(a0Var.c(), a0Var.f(), a0Var.g(), this.d.d(), a0Var.e(), a0Var.b(), a0Var.d())).subscribe(q.a, l.a));
        }
    }

    public void d(a0 a0Var, Throwable th) {
        String str;
        if (th instanceof BuiltInAuthException) {
            if (!this.g) {
                this.c.b(this.b.b(a0Var).subscribe(r.a, o.a));
            }
            str = ((BuiltInAuthException) th).b().name();
        } else {
            Logger.o(th, "Error while updating built-in cache", new Object[0]);
            str = th.getMessage();
        }
        this.f.c(a0Var.e(), str);
    }

    public /* synthetic */ d0 e(Boolean bool) {
        if (bool.booleanValue()) {
            return this.b.c();
        }
        return z.z(Collections.emptyList());
    }

    public void f() {
        this.c.b(this.e.f().R(Boolean.FALSE).s(new j(this)).subscribe(new m(this), new n(this)));
    }

    public void g() {
        this.g = true;
        this.c.f();
    }
}
