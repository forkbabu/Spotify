package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.music.libs.mediabrowserservice.RootHintsParams;
import com.spotify.music.libs.mediabrowserservice.d3;
import com.spotify.music.libs.mediabrowserservice.i3;
import com.spotify.music.libs.mediabrowserservice.k2;
import com.spotify.music.libs.mediabrowserservice.n2;
import com.spotify.music.libs.mediabrowserservice.s1;
import com.spotify.music.libs.mediabrowserservice.u1;
import defpackage.yda;

/* renamed from: gka  reason: default package */
public class gka implements u1 {
    private static final ImmutableSet<String> j;
    private final Context c;
    private final k2 d;
    private final d3 e;
    private final jka f;
    private final pea g;
    private final asd h;
    private final eka i;

    static {
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        builder.mo53add((ImmutableSet.Builder) "com.DefaultCompany.FuriousFowls");
        builder.mo53add((ImmutableSet.Builder) "com.nordeus.heroic");
        builder.mo53add((ImmutableSet.Builder) "com.nordeus.heroic.dev");
        builder.mo53add((ImmutableSet.Builder) "jp.co.rakuten.mobile.rcs");
        builder.mo53add((ImmutableSet.Builder) "com.lockwoodpublishing.avakinlife");
        builder.mo53add((ImmutableSet.Builder) "com.spotify.hadoukensample");
        builder.mo53add((ImmutableSet.Builder) "com.spotify.hadoukensample.denied");
        j = builder.build();
    }

    public gka(Context context, k2 k2Var, d3 d3Var, jka jka, pea pea, asd asd, eka eka) {
        this.c = context;
        this.d = k2Var;
        this.e = d3Var;
        this.f = jka;
        this.g = pea;
        this.h = asd;
        this.i = eka;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public n2 a(String str, v1 v1Var, RootHintsParams rootHintsParams) {
        String a = s1.a(str, "spotify_media_browser_root_default");
        String f2 = rootHintsParams.f();
        String c2 = rootHintsParams.c();
        yda.b bVar = new yda.b("partner_ui");
        bVar.r(str);
        bVar.t(f2);
        bVar.m(c2);
        bVar.s("android_media_session");
        bVar.l("app");
        bVar.q("media_session");
        yda k = bVar.k();
        this.i.b(str, k);
        return new hja(a, str, this.c, v1Var, v1Var.Z1(k), this.f.b(v1Var, u1.b), new i3(true, true, true), u1.a, rootHintsParams, this.d.b(v1Var, str, this.e), this.e, k, this.g, this.h, false);
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public String b() {
        return "spotify_media_browser_root_default";
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public yda c(String str) {
        return this.i.a(str);
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public boolean d(String str) {
        return j.contains(str);
    }
}
