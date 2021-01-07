package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.music.libs.mediabrowserservice.RootHintsParams;
import com.spotify.music.libs.mediabrowserservice.b2;
import com.spotify.music.libs.mediabrowserservice.i3;
import com.spotify.music.libs.mediabrowserservice.n2;
import com.spotify.music.libs.mediabrowserservice.s1;
import com.spotify.music.libs.mediabrowserservice.u1;
import defpackage.yda;

/* renamed from: qka  reason: default package */
public class qka implements u1 {
    private final Context c;
    private final oka d;
    private final b2 e;

    public qka(Context context, oka oka, b2 b2Var) {
        this.c = context;
        this.d = oka;
        this.e = b2Var;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public n2 a(String str, v1 v1Var, RootHintsParams rootHintsParams) {
        return new ska(s1.a(str, "spotify_media_browser_root_empty"), str, this.c, v1Var, v1Var.Z1(c(str)), this.e.b(v1Var, u1.b), new i3(true, true, true), this.d);
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public String b() {
        return "spotify_media_browser_root_empty";
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public yda c(String str) {
        String substring = str.substring(0, str.indexOf(45));
        yda.b bVar = new yda.b("AndroidOther");
        bVar.r(substring);
        bVar.s("android_media_session");
        bVar.l("app");
        return bVar.k();
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public boolean d(String str) {
        return str.contains("not_authorized_package");
    }
}
