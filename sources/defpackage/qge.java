package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.spotify.android.recaptcha.m;
import com.spotify.android.recaptcha.n;
import com.spotify.libs.signup.validators.AgeValidator;
import com.spotify.login.AuthenticationMetadata;
import com.spotify.login.r0;
import com.spotify.mobius.rx2.i;
import com.spotify.signup.splitflow.b2;
import com.spotify.signup.splitflow.views.SignupView;
import com.spotify.signup.splitflow.views.j;
import com.spotify.signup.splitflow.views.l;
import com.spotify.signup.splitflow.w1;
import defpackage.hee;
import io.reactivex.android.schedulers.a;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: qge  reason: default package */
public class qge {
    private final bie a;
    private final xke b;
    private final abe c;
    private final bje d;
    private final uje e;
    private final b2 f;
    private final Activity g;
    private final iae h;
    private final AgeValidator i;
    private final l j;
    private final r0 k;
    private final w1 l;
    private final i31 m;
    private final m n;

    public qge(bie bie, xke xke, abe abe, bje bje, uje uje, b2 b2Var, Activity activity, iae iae, AgeValidator ageValidator, l lVar, r0 r0Var, m mVar, w1 w1Var, i31 i31) {
        this.a = bie;
        this.b = xke;
        this.c = abe;
        this.d = bje;
        this.e = uje;
        this.f = b2Var;
        this.g = activity;
        this.h = iae;
        this.i = ageValidator;
        this.j = lVar;
        this.k = r0Var;
        this.n = mVar;
        this.l = w1Var;
        this.m = i31;
    }

    public static void a(qge qge, hee.f fVar) {
        qge.g.setResult(fVar.c());
        qge.g.finish();
    }

    public static void b(qge qge, hee.g gVar) {
        Activity activity = qge.g;
        String c2 = gVar.c();
        Intent intent = new Intent();
        intent.putExtra("email", c2);
        activity.setResult(48000, intent);
        qge.g.finish();
    }

    public v c(hee.i iVar) {
        return this.k.b(iVar.d(), iVar.c(), true, AuthenticationMetadata.AuthSource.EMAIL).P().W(new yee(iVar), false, Integer.MAX_VALUE);
    }

    public /* synthetic */ v d(hee.j jVar) {
        return this.k.a(jVar.c().e(), jVar.c().a(), true).A(dfe.a).P();
    }

    public /* synthetic */ v e(hee.k kVar) {
        return this.k.d(kVar.d(), true, kVar.c()).A(xfe.a).P();
    }

    public /* synthetic */ void f(hee.n nVar) {
        this.l.e(nVar.c(), nVar.d());
    }

    public /* synthetic */ void g(hee.u uVar) {
        ((j) this.j).p(uVar.c());
    }

    public /* synthetic */ void h(hee.v vVar) {
        ((SignupView) this.f).l(vVar.c());
    }

    public /* synthetic */ void i(hee.r rVar) {
        ((j) this.j).m(iee.p(rVar.d(), rVar.c()), iee.a());
    }

    public /* synthetic */ void j(hee.t tVar) {
        ((j) this.j).k(iee.l());
    }

    public void k(hee.d dVar) {
        this.g.finishAffinity();
    }

    public void l(hee.b bVar) {
        ((n) this.n).a(this.g, "sign_up");
    }

    public w<hee, iee> m(boolean z) {
        com.spotify.mobius.rx2.m f2 = i.f();
        if (z) {
            f2.h(hee.c.class, new pfe(this.a));
            f2.h(hee.m.class, new gge(this.b));
            f2.d(hee.n.class, new tee(this));
        }
        f2.h(hee.a.class, new bfe(this.c));
        f2.h(hee.h.class, new tfe(this.d));
        f2.h(hee.l.class, new uee(this.e));
        f2.e(hee.f.class, new afe(this), a.b());
        f2.e(hee.g.class, new efe(this), a.b());
        l lVar = this.j;
        lVar.getClass();
        f2.c(hee.p.class, new ree(lVar), a.b());
        l lVar2 = this.j;
        lVar2.getClass();
        f2.c(hee.q.class, new lge(lVar2), a.b());
        l lVar3 = this.j;
        lVar3.getClass();
        f2.c(hee.o.class, new nge(lVar3), a.b());
        l lVar4 = this.j;
        lVar4.getClass();
        f2.c(hee.s.class, new oge(lVar4), a.b());
        f2.e(hee.u.class, new sfe(this), a.b());
        f2.h(hee.e.class, new jfe(this.h, this.i, this.m));
        f2.e(hee.v.class, new zfe(this), a.b());
        f2.e(hee.r.class, new ufe(this), a.b());
        f2.e(hee.t.class, new lfe(this), a.b());
        f2.h(hee.i.class, new vee(this));
        f2.h(hee.k.class, new qfe(this));
        f2.h(hee.j.class, new ege(this));
        f2.h(hee.w.class, new ofe(this.h));
        f2.h(hee.y.class, new cfe(this.h));
        f2.h(hee.x.class, new kfe(this.h));
        f2.e(hee.d.class, new nfe(this), a.b());
        f2.d(hee.b.class, new vfe(this));
        return f2.i();
    }
}
