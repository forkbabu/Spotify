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
import com.spotify.player.model.PlayOrigin;
import defpackage.yda;

/* renamed from: k04  reason: default package */
public class k04 implements u1 {
    private static final PlayOrigin h = PlayOrigin.builder(kfd.b.getName()).referrerIdentifier(bu9.a.getName()).build();
    private final Context c;
    private final k2 d;
    private final d3 e;
    private final q04 f;
    private final pea g;

    public k04(Context context, k2 k2Var, d3 d3Var, q04 q04, pea pea) {
        this.c = context;
        this.d = k2Var;
        this.e = d3Var;
        this.f = q04;
        this.g = pea;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public n2 a(String str, v1 v1Var, RootHintsParams rootHintsParams) {
        yda c2 = c(str);
        return new m04(s1.a(str, "spotify_media_browser_root_android_auto"), str, this.c, v1Var, v1Var.Z1(c2), this.f.b(v1Var, h), new i3(true, true, true), u1.a, this.d.b(v1Var, str, this.e), this.e, c2, this.g, true);
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public String b() {
        return "spotify_media_browser_root_android_auto";
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public yda c(String str) {
        yda.b bVar = new yda.b("AndroidAuto");
        bVar.r(str);
        bVar.s("bluetooth_or_usb");
        bVar.l("car");
        bVar.q("media_session");
        return bVar.k();
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public boolean d(String str) {
        return ImmutableSet.of("com.google.android.projection.gearhead").contains(str);
    }
}
