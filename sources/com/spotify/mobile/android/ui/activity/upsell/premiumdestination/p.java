package com.spotify.mobile.android.ui.activity.upsell.premiumdestination;

import com.google.common.base.Optional;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.t;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import io.reactivex.disposables.b;
import io.reactivex.s;
import java.util.Arrays;
import java.util.Locale;

public class p {
    private final t a;
    private final s<Offer> b;
    private final k c;
    private final q d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private b j;
    private boolean k;
    private String l;

    public interface a {
        void a(Offer offer);

        void b(String str);
    }

    public p(k kVar, s<Offer> sVar, t tVar, q qVar, String str, String str2, String str3, String str4, String str5) {
        this.b = sVar;
        this.c = kVar;
        this.a = tVar;
        this.d = qVar;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
    }

    private void j(Offer offer, Reason reason, String str, String str2, String str3, String str4, c cVar) {
        Optional optional;
        boolean z = false;
        if (!Arrays.asList("close", "get").contains(str3)) {
            Assertion.g(String.format(Locale.US, "Attempted to log invalid offer interaction: %s", str3));
        } else {
            cx1.a(reason, str2, str4);
            z = true;
        }
        if (!z) {
            optional = Optional.absent();
        } else {
            optional = Optional.of(new ia1(String.valueOf(offer), str, reason.d(), str2, str3, str4, cVar.toString()));
        }
        if (optional.isPresent()) {
            this.c.d((m91) optional.get());
        }
    }

    public void a(Reason reason, String str, String str2, c cVar, ViewUris.SubView subView, Offer offer, String str3) {
        j(offer, reason, null, str2, "get", str3, cVar);
        this.c.a(offer, cVar, subView);
    }

    public void b(Offer offer, Reason reason, String str, String str2, String str3, c cVar) {
        j(offer, reason, null, str2, "close", str3, cVar);
    }

    public void c() {
        b bVar = this.j;
        if (bVar != null && !bVar.d()) {
            this.j.dispose();
            this.j = null;
        }
        this.c.b();
    }

    public s<l02> d() {
        return this.d.a(this.l, this.e, this.f, this.g, this.h, this.i).P();
    }

    public void e(a aVar) {
        b bVar = this.j;
        if (bVar != null && !bVar.d()) {
            this.j.dispose();
            this.j = null;
        }
        this.j = this.b.o0(io.reactivex.android.schedulers.a.b()).subscribe(new c(this, aVar), new d(aVar));
    }

    public String f() {
        return this.l;
    }

    public boolean g() {
        return this.k;
    }

    public void h(a aVar, Offer offer) {
        if (Offer.AD_TARGETING_KEY_7_DAY_TRIAL.equalsIgnoreCase(offer.adTargetingKey())) {
            aVar.a(offer);
        } else if (!this.a.e()) {
            aVar.b("Cannot show get premium");
        } else {
            aVar.a(offer);
        }
    }

    public void i(Offer offer, String str, Reason reason, String str2, String str3, c cVar) {
        cx1.a(reason, str2, str3);
        Optional of = Optional.of(new ha1(String.valueOf(offer), null, reason.d(), str2, str3, cVar.toString()));
        if (of.isPresent()) {
            this.c.d((m91) of.get());
        }
    }

    public void k(String str) {
        this.c.e(this.a, str);
    }

    public void l(SessionState sessionState) {
        if (sessionState.paymentState().b()) {
            this.k = true;
        }
        this.l = sessionState.countryCode();
    }
}
