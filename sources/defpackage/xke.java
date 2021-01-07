package defpackage;

import com.spotify.libs.signup.validators.PasswordValidator;
import com.spotify.libs.signup.validators.c;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.signup.splitflow.b2;
import com.spotify.signup.splitflow.views.SignupView;
import com.spotify.signup.splitflow.views.k;
import defpackage.nke;
import io.reactivex.android.schedulers.a;
import io.reactivex.w;

/* renamed from: xke  reason: default package */
public class xke {
    private final PasswordValidator a;
    private final c b;
    private final b2 c;
    private final k d;

    public xke(PasswordValidator passwordValidator, c cVar, b2 b2Var, k kVar) {
        this.a = passwordValidator;
        this.b = cVar;
        this.c = b2Var;
        this.d = kVar;
    }

    public w<nke, oke> a() {
        m f = i.f();
        f.c(nke.b.class, new wke(this), a.b());
        f.h(nke.a.class, new ske(this.a));
        f.h(nke.c.class, new uke(this.b));
        return f.i();
    }

    public /* synthetic */ void b() {
        ((jle) ((SignupView) this.c).h()).b();
        ((SignupView) this.d).k();
    }
}
