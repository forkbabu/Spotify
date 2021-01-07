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
import com.spotify.music.libs.mediasession.i0;
import com.spotify.player.model.PlayOrigin;
import com.spotify.remoteconfig.b7;
import defpackage.wy8;
import java.util.Set;

/* renamed from: ey8  reason: default package */
public class ey8 implements u1 {
    private static final ImmutableSet<Long> n = ImmutableSet.of(8192L, 131072L, 2097152L, 128L);
    private static final i0 o = new i3(true, true, true);
    private final Context c;
    private final wy8 d;
    private final k2 e;
    private final d3 f;
    private final ox8 g;
    private final pea h;
    private final ay8 i;
    private final jy8 j;
    private final xx8 k;
    private final b7 l;
    private final gy8 m;

    public ey8(Context context, wy8 wy8, k2 k2Var, d3 d3Var, ox8 ox8, pea pea, ay8 ay8, jy8 jy8, xx8 xx8, b7 b7Var, gy8 gy8) {
        this.c = context;
        this.d = wy8;
        this.e = k2Var;
        this.f = d3Var;
        this.g = ox8;
        this.h = pea;
        this.i = ay8;
        this.j = jy8;
        this.k = xx8;
        this.l = b7Var;
        this.m = gy8;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public n2 a(String str, v1 v1Var, RootHintsParams rootHintsParams) {
        vy8 a = this.d.a(wy8.a.b(str, rootHintsParams.d()));
        yda a2 = a.a();
        this.m.b(str, a2);
        return new ly8(s1.a(str, "spotify_media_browser_voice_assistant_root"), str, this.c, v1Var, v1Var.Z1(a2), this.g.b(v1Var, PlayOrigin.builder(kfd.D1.getName()).referrerIdentifier(a.b()).build(), this.i.b(v1Var), this.j.b(this.k.b(v1Var.Z2()), new mx8(v1Var.I2()))), o, e(), this.l.a() ? RootHintsParams.a("empty") : rootHintsParams, this.e.b(v1Var, str, this.f), this.f, a2, this.h, false);
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public String b() {
        return "spotify_media_browser_voice_assistant_root";
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public yda c(String str) {
        return this.m.a(str);
    }

    @Override // com.spotify.music.libs.mediabrowserservice.u1
    public boolean d(String str) {
        return this.d.b().contains(str);
    }

    public Set<Long> e() {
        ImmutableSet<Long> immutableSet = u1.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        builder.addAll((Iterable) immutableSet);
        builder.addAll((Iterable) n);
        return builder.build();
    }
}
