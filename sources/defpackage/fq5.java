package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.service.media.t2;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.music.libs.mediabrowserservice.RootHintsParams;
import com.spotify.music.libs.mediabrowserservice.a2;
import com.spotify.music.libs.mediabrowserservice.b2;
import com.spotify.music.libs.mediabrowserservice.d3;
import com.spotify.music.libs.mediabrowserservice.i3;
import com.spotify.music.libs.mediabrowserservice.k2;
import com.spotify.music.libs.mediabrowserservice.n2;
import com.spotify.music.libs.mediabrowserservice.r1;
import com.spotify.music.libs.mediabrowserservice.s1;
import com.spotify.music.libs.mediabrowserservice.u1;
import com.spotify.player.model.PlayOrigin;
import defpackage.yda;

/* renamed from: fq5  reason: default package */
public class fq5 implements u1 {
    private static final PlayOrigin i = PlayOrigin.builder(kfd.F1.getName()).referrerIdentifier(bu9.B.getName()).build();
    private final Context c;
    private final b2 d;
    private final k2 e;
    private final d3 f;
    private final pea g;
    private final e92 h;

    public fq5(Context context, k2 k2Var, d3 d3Var, b2 b2Var, pea pea, e92 e92) {
        this.c = context;
        this.d = b2Var;
        this.e = k2Var;
        this.f = d3Var;
        this.g = pea;
        this.h = e92;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public n2 a(String str, v1 v1Var, RootHintsParams rootHintsParams) {
        yda c2 = c(str);
        t2 Z1 = v1Var.Z1(c2);
        a2 b = this.d.b(v1Var, i);
        i3 i3Var = new i3(true, true, true);
        String a = s1.a(str, "spotify_media_browser_root_waze");
        this.h.a("com.spotify.music.internal.waze.WAKE_BY_MBS");
        return new r1(a, str, this.c, v1Var, Z1, b, i3Var, u1.a, rootHintsParams, this.e.b(v1Var, str, this.f), this.f, c2, this.g, false);
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public String b() {
        return "spotify_media_browser_root_waze";
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public yda c(String str) {
        yda.b bVar = new yda.b("waze");
        bVar.r(str);
        bVar.s("android_media_session");
        bVar.l("app");
        bVar.q("media_session");
        return bVar.k();
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public boolean d(String str) {
        return ImmutableSet.of("com.waze").contains(str);
    }
}
