package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.music.libs.mediabrowserservice.RootHintsParams;
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

/* renamed from: u04  reason: default package */
public class u04 implements u1 {
    private static final PlayOrigin h = PlayOrigin.builder(kfd.G1.getName()).referrerIdentifier(bu9.C.getName()).build();
    private final Context c;
    private final k2 d;
    private final d3 e;
    private final b2 f;
    private final pea g;

    public u04(Context context, k2 k2Var, d3 d3Var, b2 b2Var, pea pea) {
        this.c = context;
        this.d = k2Var;
        this.e = d3Var;
        this.f = b2Var;
        this.g = pea;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public n2 a(String str, v1 v1Var, RootHintsParams rootHintsParams) {
        yda c2 = c(str);
        return new r1(s1.a(str, "spotify_media_browser_root"), str, this.c, v1Var, v1Var.Z1(c2), this.f.b(v1Var, h), new i3(false, false, true), u1.a, rootHintsParams, this.d.b(v1Var, str, this.e), this.e, c2, this.g, false);
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public String b() {
        return "spotify_media_browser_root";
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public yda c(String str) {
        yda.b bVar = new yda.b("AndroidWear");
        bVar.r(str);
        bVar.s("bluetooth_or_usb");
        bVar.l("wearable");
        bVar.q("media_session");
        return bVar.k();
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public boolean d(String str) {
        return ImmutableSet.of("com.google.android.wearable.app").contains(str);
    }
}
