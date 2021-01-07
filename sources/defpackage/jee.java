package defpackage;

import com.spotify.mobius.e0;
import com.spotify.mobius.s;
import com.spotify.signup.api.services.model.EmailSignupRequestBody;
import com.spotify.signup.api.services.model.FacebookSignupRequest;
import com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody;
import com.spotify.termsandconditions.model.b;
import defpackage.gee;
import defpackage.hee;
import defpackage.iee;
import defpackage.rae;

/* renamed from: jee  reason: default package */
public final class jee {
    public static s<kee, hee> a(kee kee) {
        return s.c(kee, z42.l(new hee.e(false), new hee.a(new rae.b(kee.a().e(), kee.a().c(), kee.a().b()))));
    }

    static e0 c(kee kee, iee.c cVar) {
        fee fee;
        if (kee.j().h()) {
            return f(kee);
        }
        gee n = kee.n();
        n.getClass();
        if (n instanceof gee.a) {
            gee n2 = kee.n();
            n2.getClass();
            fee = ((gee.a) n2).d();
        } else {
            gee n3 = kee.n();
            n3.getClass();
            fee = ((gee.b) n3).d();
        }
        return e0.a(z42.l(new hee.v(b.c(fee.c(), fee.b(), fee.l())), new hee.b()));
    }

    /* access modifiers changed from: private */
    public static e0<kee, hee> f(kee kee) {
        hee hee;
        if (kee.h() != null) {
            hee = new hee.y(IdentifierTokenSignupRequestBody.builder().identifierToken(kee.h()).email(kee.c().a()).name(kee.j().f()).birthYear(kee.a().e()).birthMonth(kee.a().c() + 1).birthDay(kee.a().b()).gender((EmailSignupRequestBody.Gender) kee.f().b().c(fde.a, ace.a, dde.a, yce.a)).iAgree(true).build());
        } else if (kee.e() != null) {
            hee = new hee.x(FacebookSignupRequest.builder().facebookAccessToken(kee.e().a()).facebookUserId(kee.e().e()).birthYear(Integer.valueOf(kee.a().e())).birthMonth(Integer.valueOf(kee.a().c() + 1)).birthDay(Integer.valueOf(kee.a().b())).name(kee.j().f()).iAgree(Boolean.TRUE).gender((EmailSignupRequestBody.Gender) kee.f().b().c(cce.a, rde.a, jce.a, ybe.a)).build());
        } else {
            EmailSignupRequestBody.Builder iAgree = EmailSignupRequestBody.builder().email(kee.c().a()).password(kee.l().b()).passwordRepeat(kee.l().b()).birthYear(kee.a().e()).birthMonth(kee.a().c() + 1).birthDay(kee.a().b()).name(kee.j().f()).gender((EmailSignupRequestBody.Gender) kee.f().b().c(vce.a, ede.a, pde.a, sce.a)).iAgree(true);
            if (kee.j().h()) {
                iAgree.collectPersonalInformation(Boolean.valueOf(kee.j().a()));
                iAgree.thirdPartyDataProvision(Boolean.valueOf(kee.j().e()));
            }
            hee = new hee.w(iAgree.build());
        }
        return e0.g(kee.u(kee.j().m(true)), z42.l(hee));
    }

    /* access modifiers changed from: private */
    public static e0<kee, hee> g(kee kee) {
        return e0.g(kee.u(kee.j().m(false)), z42.l(new hee.f(-1)));
    }
}
