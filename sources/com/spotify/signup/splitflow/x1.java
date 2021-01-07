package com.spotify.signup.splitflow;

import com.spotify.libs.signup.validators.PasswordValidator;
import com.spotify.mobius.android.e;
import com.spotify.mobius.e0;
import com.spotify.mobius.s;
import com.spotify.signup.api.services.SignupErrorStatus;
import com.spotify.signup.api.services.model.EmailSignupStatus;
import com.spotify.signup.api.services.model.FacebookSignupStatus;
import com.spotify.signup.api.services.model.IdentifierTokenSignupStatus;
import defpackage.ce0;
import defpackage.fe0;
import defpackage.ge0;
import defpackage.he0;
import defpackage.hie;
import defpackage.ie0;
import defpackage.iee;
import defpackage.je0;
import defpackage.ohe;
import defpackage.oke;
import defpackage.qke;
import defpackage.rje;
import defpackage.sae;
import defpackage.wae;
import defpackage.wie;
import java.util.Set;

public final class x1 extends e<kee, iee, hee> {
    private final ae0 b;
    private int c = -1;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;

    private x1(ae0 ae0) {
        super("InstrumentationLogger");
        this.b = ae0;
    }

    private void I(int i, boolean z) {
        if (i != this.c) {
            this.c = i;
            if (z) {
                i += 2;
            }
            if (i == 0) {
                this.b.a(new ce0.k(je0.e.b));
            } else if (i == 1) {
                this.b.a(new ce0.k(je0.i.b));
            } else if (i == 2) {
                this.b.a(new ce0.k(je0.a.b));
            } else if (i == 3) {
                this.b.a(new ce0.k(je0.f.b));
            } else if (i == 4) {
                this.b.a(new ce0.k(je0.h.b));
            }
        }
    }

    private void J(SignupErrorStatus signupErrorStatus) {
        if (signupErrorStatus == null) {
            this.b.a(new ce0.f(je0.h.b, he0.g.b, ie0.f.b, ""));
            return;
        }
        switch (signupErrorStatus.ordinal()) {
            case 0:
                this.b.a(new ce0.f(je0.h.b, he0.g.b, ie0.f.b, ""));
                return;
            case 1:
            case 2:
                this.b.a(new ce0.f(je0.h.b, he0.d.b, ie0.f.b, ""));
                return;
            case 3:
                this.b.a(new ce0.f(je0.h.b, he0.i.b, ie0.f.b, ""));
                return;
            case 4:
                this.b.a(new ce0.f(je0.h.b, he0.h.b, ie0.f.b, ""));
                return;
            case 5:
                this.b.a(new ce0.f(je0.h.b, he0.e.b, ie0.f.b, ""));
                return;
            case 6:
                this.b.a(new ce0.f(je0.h.b, he0.b.b, ie0.f.b, ""));
                return;
            case 7:
                this.b.a(new ce0.f(je0.h.b, he0.n.b, ie0.f.b, ""));
                return;
            case 8:
                this.b.a(new ce0.f(je0.h.b, he0.l.b, ie0.f.b, ""));
                return;
            default:
                return;
        }
    }

    public static x1 g(ae0 ae0) {
        return new x1(ae0);
    }

    public /* synthetic */ void A(rje.b bVar) {
        if (bVar.e() && !this.g) {
            this.g = true;
            this.b.a(new ce0.h(je0.h.b, ie0.b.b));
        }
    }

    public /* synthetic */ void B(EmailSignupStatus.Error error) {
        J(error.status());
    }

    public /* synthetic */ void C(EmailSignupStatus.Unknown unknown) {
        J(null);
    }

    public /* synthetic */ void D(IdentifierTokenSignupStatus.Error error) {
        J(error.status());
    }

    public /* synthetic */ void E(IdentifierTokenSignupStatus.Unknown unknown) {
        J(null);
    }

    public /* synthetic */ void F(hie.b bVar) {
        if (bVar.e() == 20) {
            ae0 ae0 = this.b;
            je0.e eVar = je0.e.b;
            ae0.a(new ce0.f(eVar, he0.d.b, ie0.c.b, ""));
            this.b.a(new ce0.e(eVar, ge0.a.b));
            return;
        }
        this.b.a(new ce0.f(je0.e.b, he0.g.b, ie0.c.b, ""));
    }

    public /* synthetic */ void G(FacebookSignupStatus.Error error) {
        J(SignupErrorStatus.d(error.statusCode()));
    }

    public /* synthetic */ void H(ohe.e eVar) {
        this.b.a(new ce0.c(je0.e.b, fe0.p.b, ge0.k.b));
    }

    @Override // com.spotify.mobius.android.e, com.spotify.mobius.MobiusLoop.i
    public void a(Object obj, Object obj2, e0 e0Var) {
        Object obj3 = (kee) obj;
        iee iee = (iee) obj2;
        e0Var.getClass();
        obj3.getClass();
        if (e0Var.c()) {
            obj3 = e0Var.e();
        }
        kee kee = (kee) obj3;
        I(kee.k(), kee.m());
        iee.r(new u0(this), new c(this, kee), new p0(this, kee), new e(this), new b0(this), y.a, f1.a, new l(this, kee, e0Var), v.a, a0.a, r0.a, new d1(this), new l0(this), u.a, p.a, new i(this), g.a, f.a, e1.a, new v0(this), new r(this), m.a);
    }

    @Override // com.spotify.mobius.android.e, com.spotify.mobius.MobiusLoop.i
    public void b(Object obj, Object obj2, Throwable th) {
        kee kee = (kee) obj;
        iee iee = (iee) obj2;
    }

    @Override // com.spotify.mobius.android.e, com.spotify.mobius.MobiusLoop.i
    public void c(Object obj, s sVar) {
        kee kee = (kee) obj;
        I(kee.k(), kee.m());
    }

    @Override // com.spotify.mobius.android.e, com.spotify.mobius.MobiusLoop.i
    public void d(Object obj, Throwable th) {
        kee kee = (kee) obj;
    }

    @Override // com.spotify.mobius.android.e, com.spotify.mobius.MobiusLoop.i
    public void e(Object obj, Object obj2) {
        kee kee = (kee) obj;
        iee iee = (iee) obj2;
    }

    @Override // com.spotify.mobius.android.e, com.spotify.mobius.MobiusLoop.i
    public void f(Object obj) {
        kee kee = (kee) obj;
    }

    public void h(kee kee, e0 e0Var, iee.u uVar) {
        Set b2 = e0Var.b();
        if (!kee.i()) {
            return;
        }
        if (b2.contains(hee.b())) {
            this.b.a(new ce0.f(je0.f.b, he0.p.b, ie0.d.b, String.valueOf(0)));
        } else if (b2.contains(hee.a())) {
            this.b.a(new ce0.f(je0.f.b, he0.p.b, ie0.d.b, String.valueOf(1)));
        }
    }

    public /* synthetic */ void i(iee.c cVar) {
        this.b.a(new ce0.c(je0.h.b, fe0.v.b, ge0.k.b));
    }

    public /* synthetic */ void j(iee.o oVar) {
        if (oVar.z()) {
            this.b.a(new ce0.b(je0.h.b));
        }
    }

    public /* synthetic */ void k(iee.t tVar) {
        this.b.a(new ce0.c(je0.e.b, fe0.l.b, ge0.a.b));
    }

    public /* synthetic */ void l(iee.e eVar) {
        this.b.a(new ce0.c(je0.e.b, fe0.b.b, ge0.a.b));
    }

    public /* synthetic */ void m(ohe.c cVar) {
        this.b.a(new ce0.c(je0.e.b, fe0.w.b, ge0.k.b));
    }

    public /* synthetic */ void n(oke.b bVar) {
        if (!this.e) {
            this.e = true;
            this.b.a(new ce0.h(je0.i.b, ie0.g.b));
        }
    }

    public /* synthetic */ void o(oke.a aVar) {
        if (PasswordValidator.PasswordValidation.TOO_WEAK == aVar.h()) {
            this.b.a(new ce0.f(je0.i.b, he0.t.b, ie0.g.b, ""));
        }
    }

    public /* synthetic */ void p(qke.h hVar) {
        this.b.a(new ce0.f(je0.i.b, he0.s.b, ie0.g.b, ""));
    }

    public /* synthetic */ void q(kee kee, oke.c cVar) {
        kee.l().c().g(q0.a, m0.a, l1.a, s.a, o0.a, d.a, new n0(this), k0.a, n1.a);
        this.b.a(new ce0.c(je0.i.b, fe0.p.b, ge0.k.b));
    }

    public /* synthetic */ void r(wae.c cVar) {
        this.b.a(new ce0.f(je0.a.b, he0.c.b, ie0.a.b, ""));
    }

    public /* synthetic */ void s(wae.b bVar) {
        this.b.a(new ce0.f(je0.a.b, he0.b.b, ie0.a.b, ""));
    }

    public /* synthetic */ void t(ohe.d dVar) {
        if (!this.d) {
            this.d = true;
            this.b.a(new ce0.h(je0.e.b, ie0.c.b));
        }
    }

    public /* synthetic */ void u(wae.a aVar) {
        this.b.a(new ce0.f(je0.a.b, he0.a.b, ie0.a.b, ""));
    }

    public /* synthetic */ void v(kee kee, sae.a aVar) {
        kee.a().a().b(w.a, d0.a, new a1(this), t0.a);
        this.b.a(new ce0.c(je0.a.b, fe0.p.b, ge0.k.b));
    }

    public /* synthetic */ void w(sae.c cVar) {
        if (!this.f) {
            this.b.a(new ce0.h(je0.a.b, ie0.a.b));
            this.f = true;
        }
    }

    public /* synthetic */ void x(wie.b bVar) {
        this.b.a(new ce0.c(je0.f.b, fe0.n.b, ge0.k.b));
    }

    public /* synthetic */ void y(wie.a aVar) {
        this.b.a(new ce0.c(je0.f.b, fe0.d.b, ge0.k.b));
    }

    public /* synthetic */ void z(wie.d dVar) {
        this.b.a(new ce0.c(je0.f.b, fe0.q.b, ge0.k.b));
    }
}
