package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.music.libs.mediabrowserservice.RootHintsParams;
import com.spotify.music.libs.mediabrowserservice.d3;
import com.spotify.music.libs.mediabrowserservice.i3;
import com.spotify.music.libs.mediabrowserservice.k2;
import com.spotify.music.libs.mediabrowserservice.n2;
import com.spotify.music.libs.mediabrowserservice.r1;
import com.spotify.music.libs.mediabrowserservice.s1;
import com.spotify.music.libs.mediabrowserservice.u1;
import defpackage.yda;

/* renamed from: s04  reason: default package */
public class s04 implements u1 {
    private final Context c;
    private final k2 d;
    private final d3 e;
    private final q04 f;
    private final pea g;

    public s04(Context context, k2 k2Var, d3 d3Var, q04 q04, pea pea) {
        this.c = context;
        this.d = k2Var;
        this.e = d3Var;
        this.f = q04;
        this.g = pea;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public n2 a(String str, v1 v1Var, RootHintsParams rootHintsParams) {
        yda c2 = c(str);
        return new r1(s1.a(str, "spotify_media_browser_root"), str, this.c, v1Var, v1Var.Z1(c2), this.f.b(v1Var, u1.b), new i3(true, true, true), u1.a, rootHintsParams, this.d.b(v1Var, str, this.e), this.e, c2, this.g, false);
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public String b() {
        return "spotify_media_browser_root";
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public yda c(String str) {
        yda.b bVar = new yda.b("Rockscout");
        bVar.r(str);
        bVar.l("car");
        bVar.q("media_session");
        bVar.n("mirrorlink");
        bVar.o("rockscout");
        return bVar.k();
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public boolean d(String str) {
        return ImmutableSet.of("com.carconnectivity.mlmediaplayer").contains(str);
    }
}
