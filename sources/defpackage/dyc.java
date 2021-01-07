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
import com.spotify.music.libs.mediabrowserservice.j1;
import com.spotify.music.libs.mediabrowserservice.k2;
import com.spotify.music.libs.mediabrowserservice.n2;
import com.spotify.music.libs.mediabrowserservice.r1;
import com.spotify.music.libs.mediabrowserservice.s1;
import com.spotify.music.libs.mediabrowserservice.u1;
import defpackage.yda;

/* renamed from: dyc  reason: default package */
public class dyc implements u1 {
    private static final ImmutableSet<String> i = ImmutableSet.of("com.samsung.android.app.spage", "com.samsung.android.app.spage.beta", "com.samsung.android.app.spage.partner", "com.sec.android.app.clockpackage", "com.samsung.android.app.galaxyfinder", "com.samsung.android.app.routines", "com.samsung.android.honeyboard", "com.samsung.android.icecone");
    private final Context c;
    private final k2 d;
    private final d3 e;
    private final b2 f;
    private final j1 g;
    private final pea h;

    public dyc(Context context, k2 k2Var, d3 d3Var, b2 b2Var, j1 j1Var, pea pea) {
        this.c = context;
        this.d = k2Var;
        this.e = d3Var;
        this.f = b2Var;
        this.g = j1Var;
        this.h = pea;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public n2 a(String str, v1 v1Var, RootHintsParams rootHintsParams) {
        a2 a2Var;
        String a = s1.a(str, "spotify_media_browser_root_samsung");
        yda c2 = c(str);
        t2 Z1 = v1Var.Z1(c2);
        if ("com.sec.android.app.clockpackage".equals(str)) {
            a2Var = this.g.b(v1Var, u1.b);
        } else {
            a2Var = this.f.b(v1Var, u1.b);
        }
        return new r1(a, str, this.c, v1Var, Z1, a2Var, new i3(true, true, true), u1.a, rootHintsParams, this.d.b(v1Var, str, this.e), this.e, c2, this.h, false);
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public String b() {
        return "spotify_media_browser_root_samsung";
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public yda c(String str) {
        String str2;
        yda.b bVar = new yda.b("com.sec.android.app.clockpackage".equals(str) ? "Clock" : "AndroidOther");
        bVar.r(str);
        bVar.s("android_media_session");
        bVar.q("media_session");
        bVar.l("app");
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case 138102030:
                if (str.equals("com.sec.android.app.clockpackage")) {
                    c2 = 0;
                    break;
                }
                break;
            case 508939580:
                if (str.equals("com.samsung.android.app.routines")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1186316181:
                if (str.equals("com.samsung.android.app.spage")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                str2 = "samsung_clock";
                break;
            case 1:
                str2 = "samsung_routines";
                break;
            case 2:
                str2 = "samsung_daily";
                break;
            default:
                str2 = null;
                break;
        }
        bVar.n(str2);
        return bVar.k();
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public boolean d(String str) {
        return i.contains(str);
    }
}
