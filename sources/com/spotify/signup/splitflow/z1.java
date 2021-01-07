package com.spotify.signup.splitflow;

import androidx.fragment.app.c;
import com.spotify.android.recaptcha.m;
import com.spotify.libs.signup.validators.AgeValidator;
import com.spotify.libs.signup.validators.PasswordValidator;
import com.spotify.login.r0;
import com.spotify.mobile.android.util.connectivity.e0;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx2.i;
import com.spotify.signup.splitflow.views.SignupView;
import com.spotify.signup.splitflow.views.l;
import defpackage.ba2;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import java.util.Calendar;

public class z1 {
    private final qge a;
    private final PublishSubject<Boolean> b;
    private final s<Boolean> c;
    private final w1 d;
    private final x1 e;

    public z1(c cVar, SignupView signupView, PublishSubject<Boolean> publishSubject, iae iae, PasswordValidator passwordValidator, com.spotify.libs.signup.validators.c cVar2, w1 w1Var, l lVar, r0 r0Var, m mVar, x1 x1Var, i31 i31, e0 e0Var) {
        this.b = publishSubject;
        this.c = e0Var.a().G0(Boolean.valueOf(e0Var.d()));
        this.d = w1Var;
        this.e = x1Var;
        AgeValidator ageValidator = new AgeValidator(Calendar.getInstance());
        this.a = new qge(new bie(new gie(iae), w1Var, signupView, signupView.f(), signupView.g(), lVar), new xke(passwordValidator, cVar2, signupView, signupView), new abe(signupView, ageValidator, signupView.e()), new bje(signupView), new uje(), signupView, cVar, iae, ageValidator, lVar, r0Var, mVar, w1Var, i31);
    }

    public MobiusLoop.g<kee, iee> a(kee kee, boolean z) {
        ba2.a b2 = ba2.b();
        b2.b(aee.a);
        b2.e(cee.a);
        b2.f(xbe.a);
        b2.d(xde.a);
        b2.c(aa2.a(sbe.a));
        ba2 a2 = b2.a();
        ba2.a b3 = ba2.b();
        b3.b(wbe.a);
        b3.e(pbe.a);
        b3.f(hce.a);
        b3.d(ube.a);
        b3.c(aa2.a(yde.a));
        ba2 a3 = b3.a();
        ba2.a b4 = ba2.b();
        b4.b(obe.a);
        b4.e(bee.a);
        b4.f(mde.a);
        b4.d(qbe.a);
        b4.c(aa2.a(zde.a));
        ba2 a4 = b4.a();
        ba2.a b5 = ba2.b();
        b5.b(vde.a);
        b5.e(ude.a);
        b5.f(qce.a);
        b5.d(rbe.a);
        b5.c(aa2.a(wde.a));
        ba2 a5 = b5.a();
        ba2.a b6 = ba2.b();
        b6.b(vbe.a);
        b6.e(nbe.a);
        b6.f(xce.a);
        b6.d(tde.a);
        b6.c(aa2.a(tbe.a));
        return z42.b(i.c(new wce(a2, a3, a4, a5, b6.a()), this.a.m(z)).c(this.d.c(), i.a(this.b.j0(u1.a)), i.a(this.c.W(t1.a, false, Integer.MAX_VALUE))).f(this.e).e(v1.a), kee);
    }
}
