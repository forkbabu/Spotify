package defpackage;

import android.content.Context;
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
import defpackage.yda;
import java.util.Collections;

/* renamed from: tja  reason: default package */
public class tja implements u1 {
    private final Context c;
    private final b2 d;
    private final k2 e;
    private final d3 f;
    private final pea g;

    public tja(Context context, k2 k2Var, d3 d3Var, b2 b2Var, pea pea) {
        this.c = context;
        this.d = b2Var;
        this.e = k2Var;
        this.f = d3Var;
        this.g = pea;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public n2 a(String str, v1 v1Var, RootHintsParams rootHintsParams) {
        String a = s1.a(str, "generic_root");
        yda c2 = c(str);
        return new r1(a, str, this.c, v1Var, v1Var.Z1(c2), this.d.b(v1Var, u1.b), new i3(true, true, true), u1.a, rootHintsParams, this.e.b(v1Var, str, this.f), this.f, c2, this.g, false);
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public String b() {
        return "generic_root";
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public yda c(String str) {
        yda.b bVar = new yda.b("AndroidOther");
        bVar.r(str);
        bVar.s("android_media_session");
        bVar.l("app");
        return bVar.k();
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public boolean d(String str) {
        return Collections.singleton("com.spotify.mbscontroller").contains(str);
    }
}
