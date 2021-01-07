package defpackage;

import com.spotify.libs.signup.validators.AgeValidator;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.signup.splitflow.views.SignupView;
import com.spotify.signup.splitflow.views.k;
import defpackage.rae;
import io.reactivex.android.schedulers.a;
import io.reactivex.w;
import java.util.Calendar;

/* renamed from: abe  reason: default package */
public class abe {
    private final k a;
    private final AgeValidator b;
    private final fbe c;

    public abe(k kVar, AgeValidator ageValidator, fbe fbe) {
        this.a = kVar;
        this.b = ageValidator;
        this.c = fbe;
    }

    public static sae b(abe abe, rae.c cVar) {
        abe.getClass();
        Calendar instance = Calendar.getInstance();
        instance.set(cVar.d(), cVar.b(), cVar.a());
        AgeValidator.AgeVerification b2 = abe.b.b(instance);
        if (b2 == AgeValidator.AgeVerification.OK) {
            if (cVar.c()) {
                ((SignupView) abe.a).k();
            }
            return sae.b(cVar.d(), cVar.b(), cVar.a(), uae.d());
        } else if (b2 == AgeValidator.AgeVerification.TOO_YOUNG) {
            return sae.b(cVar.d(), cVar.b(), cVar.a(), uae.a(wae.c()));
        } else {
            if (b2 == AgeValidator.AgeVerification.BAD_AGE) {
                return sae.b(cVar.d(), cVar.b(), cVar.a(), uae.a(wae.a()));
            }
            return sae.b(cVar.d(), cVar.b(), cVar.a(), uae.a(wae.d()));
        }
    }

    public static void c(abe abe, rae.b bVar) {
        abe.c.a(bVar.c(), bVar.b(), bVar.a());
    }

    public w<rae, sae> a() {
        m f = i.f();
        k kVar = this.a;
        kVar.getClass();
        f.c(rae.a.class, new zae(kVar), a.b());
        f.f(rae.c.class, new xae(this));
        f.e(rae.b.class, new yae(this), a.b());
        return f.i();
    }
}
