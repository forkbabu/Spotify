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
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.player.model.PlayOrigin;
import defpackage.yda;

/* renamed from: aq5  reason: default package */
public class aq5 implements u1 {
    private static final ImmutableSet<String> h = ImmutableSet.of("com.facebook.wakizashi", "com.facebook.katana");
    private final Context c;
    private final k2 d;
    private final d3 e;
    private final pea f;
    private final dq5 g;

    public aq5(Context context, k2 k2Var, d3 d3Var, dq5 dq5, pea pea) {
        this.c = context;
        this.g = dq5;
        this.d = k2Var;
        this.e = d3Var;
        this.f = pea;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public n2 a(String str, v1 v1Var, RootHintsParams rootHintsParams) {
        String a = s1.a(str, "spotify_media_browser_root_facebook");
        yda c2 = c(str);
        return new r1(a, str, this.c, v1Var, v1Var.Z1(c2), this.g.b(v1Var, PlayOrigin.builder(kfd.Z.getName()).referrerIdentifier(str).viewUri(ViewUris.a2.toString()).build()), new i3(true, true, true), u1.a, rootHintsParams, this.d.b(v1Var, str, this.e), this.e, c2, this.f, false);
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public String b() {
        return "spotify_media_browser_root_facebook";
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public yda c(String str) {
        yda.b bVar = new yda.b("AppMiniPlayer");
        bVar.r(str);
        bVar.n("facebook");
        bVar.o("boombox");
        bVar.s("android_media_session");
        bVar.l("app");
        bVar.q("media_session");
        return bVar.k();
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public boolean d(String str) {
        return h.contains(str);
    }
}
