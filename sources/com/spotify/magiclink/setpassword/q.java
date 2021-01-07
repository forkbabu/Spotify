package com.spotify.magiclink.setpassword;

import com.spotify.http.u;
import com.spotify.libs.signup.validators.PasswordValidator;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.mobius.z;
import defpackage.q21;
import io.reactivex.android.schedulers.a;
import io.reactivex.s;

public class q {
    private final u a;
    private final s<String> b;
    private final n c;
    private final PasswordValidator d;
    private final o11 e;

    public q(u uVar, s<String> sVar, n nVar, PasswordValidator passwordValidator, o11 o11) {
        this.a = uVar;
        this.b = sVar;
        this.c = nVar;
        this.d = passwordValidator;
        this.e = o11;
    }

    public MobiusLoop.g<t21, r21> a(g31 g31, t21 t21) {
        m mVar = m.a;
        u uVar = this.a;
        s<String> sVar = this.b;
        n nVar = this.c;
        PasswordValidator passwordValidator = this.d;
        m f = i.f();
        f.e(q21.c.class, new w21(g31), a.b());
        f.h(q21.d.class, new x21(passwordValidator));
        f.h(q21.a.class, new v21(uVar, sVar));
        f.d(q21.b.class, new a31(nVar));
        return z.b(i.c(mVar, f.i()).e(a.a).h(this.c.c()).f(r.g(this.e)), t21, u92.b());
    }
}
