package defpackage;

import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.remoteconfig.x4;
import io.reactivex.d0;
import io.reactivex.z;

/* renamed from: tj1  reason: default package */
public class tj1 {
    private final vj1 a;
    private final lj1 b;
    private final x4 c;
    private final ii1 d;
    private final w e;

    public tj1(x4 x4Var, vj1 vj1, lj1 lj1, ii1 ii1, w wVar) {
        this.c = x4Var;
        this.a = vj1;
        this.b = lj1;
        this.d = ii1;
        this.e = wVar;
    }

    public d0 a(BrowserParams browserParams, String str) {
        String b2 = this.d.b(browserParams);
        hi1 a2 = this.d.a(browserParams, str);
        if (this.c.b()) {
            return this.b.a(b2, a2.a("signal"), a2.b("page"), a2.b("per_page"), a2.b("region"), a2.b("locale"), a2.b("platform"), a2.b("version"), a2.b("dt"), a2.b("suppress404"), a2.b("suppress_response_codes"), browserParams.g(), browserParams.e(), browserParams.j(), browserParams.k().d(), browserParams.i().d());
        }
        return this.a.c(b2, a2.a("signal"), a2.b("page"), a2.b("per_page"), a2.b("region"), a2.b("locale"), a2.b("platform"), a2.b("version"), a2.b("dt"), a2.b("suppress404"), a2.b("suppress_response_codes"));
    }

    public z<b91> b(BrowserParams browserParams) {
        return this.e.a("country_code").N0(1).B0().s(new hj1(this, browserParams));
    }
}
