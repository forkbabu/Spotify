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
import defpackage.yda;

/* renamed from: cka  reason: default package */
public class cka implements u1 {
    private static final ImmutableSet<String> h;
    private static final ImmutableSet<String> i;
    private final Context c;
    private final k2 d;
    private final d3 e;
    private final b2 f;
    private final pea g;

    static {
        ImmutableSet<String> of = ImmutableSet.of("com.shazam.android", "com.shazam.encore.android");
        h = of;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        builder.mo53add((ImmutableSet.Builder) "com.musixmatch.android.lyrify");
        builder.addAll((Iterable) of);
        i = builder.build();
    }

    public cka(Context context, k2 k2Var, d3 d3Var, b2 b2Var, pea pea) {
        this.c = context;
        this.d = k2Var;
        this.e = d3Var;
        this.f = b2Var;
        this.g = pea;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public n2 a(String str, v1 v1Var, RootHintsParams rootHintsParams) {
        String a = s1.a(str, "spotify_media_browser_root_default");
        yda c2 = c(str);
        return new r1(a, str, this.c, v1Var, v1Var.Z1(c2), this.f.b(v1Var, u1.b), new i3(true, true, true), u1.a, rootHintsParams, this.d.b(v1Var, str, this.e), this.e, c2, this.g, false);
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public String b() {
        return "spotify_media_browser_root_default";
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public yda c(String str) {
        yda.b bVar = new yda.b("AndroidOther");
        bVar.r(str);
        bVar.s("android_media_session");
        bVar.l("app");
        bVar.q("media_session");
        return bVar.k();
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public boolean d(String str) {
        return i.contains(str);
    }
}
