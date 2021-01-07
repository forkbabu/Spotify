package defpackage;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.music.libs.mediabrowserservice.RootHintsParams;
import com.spotify.music.libs.mediabrowserservice.b2;
import com.spotify.music.libs.mediabrowserservice.d3;
import com.spotify.music.libs.mediabrowserservice.i3;
import com.spotify.music.libs.mediabrowserservice.k2;
import com.spotify.music.libs.mediabrowserservice.n2;
import com.spotify.music.libs.mediabrowserservice.r1;
import com.spotify.music.libs.mediabrowserservice.u1;
import com.spotify.player.model.PlayOrigin;
import com.spotify.remoteconfig.yb;
import defpackage.yda;
import java.util.Collections;
import java.util.Set;

/* renamed from: lq5  reason: default package */
public class lq5 implements u1 {
    private static final PlayOrigin i = PlayOrigin.builder(kfd.C0.getName()).referrerIdentifier(bu9.r.getName()).build();
    private final Context c;
    private final b2 d;
    private final k2 e;
    private final d3 f;
    private final pea g;
    private final yb h;

    public lq5(Context context, k2 k2Var, d3 d3Var, b2 b2Var, pea pea, yb ybVar) {
        this.c = context;
        this.d = b2Var;
        this.e = k2Var;
        this.f = d3Var;
        this.g = pea;
        this.h = ybVar;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public n2 a(String str, v1 v1Var, RootHintsParams rootHintsParams) {
        yda c2 = c(str);
        return new r1("spotify_root_media_resumption", str, this.c, v1Var, v1Var.Z1(c2), this.d.b(v1Var, i), new i3(true, true, true), u1.a, rootHintsParams, this.e.b(v1Var, str, this.f), this.f, c2, this.g, false);
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public String b() {
        return "spotify_root_media_resumption";
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public yda c(String str) {
        yda.b bVar = new yda.b("media_resumption");
        bVar.r(str);
        bVar.s("android_media_session");
        bVar.q("media_session");
        bVar.n(Constants.REFERRER_API_GOOGLE);
        return bVar.k();
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public boolean d(String str) {
        Set set;
        if (this.h.a()) {
            set = ImmutableSet.of("com.android.systemui");
        } else {
            set = Collections.emptySet();
        }
        return set.contains(str);
    }
}
