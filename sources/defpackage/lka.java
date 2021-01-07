package defpackage;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.mediabrowserservice.RootHintsParams;
import com.spotify.music.libs.mediabrowserservice.d3;
import com.spotify.music.libs.mediabrowserservice.i3;
import com.spotify.music.libs.mediabrowserservice.j1;
import com.spotify.music.libs.mediabrowserservice.k2;
import com.spotify.music.libs.mediabrowserservice.n2;
import com.spotify.music.libs.mediabrowserservice.r1;
import com.spotify.music.libs.mediabrowserservice.s1;
import com.spotify.music.libs.mediabrowserservice.u1;
import com.spotify.player.model.PlayOrigin;
import defpackage.yda;

/* renamed from: lka  reason: default package */
public class lka implements u1 {
    private static final ImmutableSet<String> h = ImmutableSet.of("com.google.android.deskclock", "com.asus.deskclock");
    private static final PlayOrigin i = PlayOrigin.builder(kfd.o0.getName()).referrerIdentifier(bu9.l.getName()).build();
    private final Context c;
    private final k2 d;
    private final d3 e;
    private final j1 f;
    private final pea g;

    public lka(Context context, k2 k2Var, d3 d3Var, j1 j1Var, pea pea) {
        this.c = context;
        this.d = k2Var;
        this.e = d3Var;
        this.f = j1Var;
        this.g = pea;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public n2 a(String str, v1 v1Var, RootHintsParams rootHintsParams) {
        String a = s1.a(str, "spotify_media_browser_root_wakeup");
        yda c2 = c(str);
        return new r1(a, str, this.c, v1Var, v1Var.Z1(c2), this.f.b(v1Var, i), new i3(true, true, true), u1.a, rootHintsParams, this.d.b(v1Var, str, this.e), this.e, c2, this.g, false);
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public String b() {
        return "spotify_media_browser_root_wakeup";
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public yda c(String str) {
        String str2;
        yda.b bVar = new yda.b("Clock");
        bVar.r(str);
        bVar.s("app_to_app");
        bVar.l("app");
        bVar.q("media_session");
        String str3 = null;
        if ("com.google.android.deskclock".equals(str)) {
            str2 = Constants.REFERRER_API_GOOGLE;
        } else if ("com.asus.deskclock".equals(str)) {
            str2 = "asus";
        } else {
            Assertion.p(String.format("The package %s has no associated company data", str));
            str2 = null;
        }
        bVar.n(str2);
        if ("com.google.android.deskclock".equals(str)) {
            str3 = "google clock";
        } else if ("com.asus.deskclock".equals(str)) {
            str3 = "asus clock";
        } else {
            Assertion.p(String.format("The package %s has no associated model data", str));
        }
        bVar.o(str3);
        return bVar.k();
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public boolean d(String str) {
        return h.contains(str);
    }
}
