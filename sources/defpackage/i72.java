package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.o;
import com.google.protobuf.u;
import com.spotify.mobile.android.video.exo.d;
import com.spotify.mobile.android.video.exo.m;
import com.spotify.mobile.android.video.exo.n;
import com.spotify.mobile.android.video.offline.e0;
import com.spotify.mobile.android.video.offline.h0;
import com.spotify.mobile.android.video.x;
import com.spotify.music.json.g;
import java.util.List;
import java.util.UUID;
import okhttp3.a0;
import okhttp3.d0;
import okhttp3.v;
import okhttp3.y;

/* renamed from: i72  reason: default package */
public class i72 implements c72 {
    private final Handler a = new Handler(Looper.getMainLooper());
    private y b;
    private final g c;
    private final o f;
    private final n n;
    private final gl0<u> o;
    private final com.spotify.mobile.android.video.drm.g p;
    private final p62 q;

    /* renamed from: i72$b */
    private static class b implements v {
        b(a aVar) {
        }

        @Override // okhttp3.v
        public d0 a(v.a aVar) {
            String replace = UUID.randomUUID().toString().replace("-", "");
            fof fof = (fof) aVar;
            a0.a h = fof.i().h();
            h.a("X-rid", replace);
            return fof.f(h.b());
        }
    }

    public i72(y yVar, g gVar, o oVar, n nVar, gl0<u> gl0, com.spotify.mobile.android.video.drm.g gVar2, p62 p62) {
        this.b = yVar;
        this.c = gVar;
        this.f = oVar;
        this.n = nVar;
        this.o = gl0;
        this.p = gVar2;
        this.q = p62;
    }

    private String d(String str) {
        if (!TextUtils.isEmpty(this.q.c())) {
            return this.q.c().replace("{type}", "json").replace("{source_id}", str);
        }
        throw new IllegalStateException("Unable to create Spotify Manifest url. Manifest url template not found");
    }

    @Override // defpackage.c72
    public t a(x xVar, com.spotify.mobile.android.video.u uVar, e0 e0Var, e72 e72) {
        String d = d(xVar.b().replace("spotify-video://", ""));
        y yVar = this.b;
        int f2 = this.q.f();
        h0 h0Var = null;
        if (f2 > 0 && xVar.d().hashCode() % f2 == 0) {
            y.b q2 = yVar.q();
            q2.h(new g72(this.o, this.n, d, xVar));
            q2.a(new b(null));
            yVar = q2.c();
        }
        this.b = yVar;
        if (e0Var != null) {
            d = e0Var.c();
        }
        List<com.google.android.exoplayer2.offline.x> b2 = e0Var != null ? e0Var.b() : null;
        if (e0Var != null) {
            h0Var = e0Var.a();
        }
        k.a d2 = z42.d(this.b, this.f, uVar);
        return new m(this.c, xVar, null, Uri.parse(d), d2, this.a, e72, 5, new d.a(d2, this.n), b2, this.q.b(), this.q.e(), this.p.a(e72, h0Var));
    }

    @Override // defpackage.c72
    public String b(x xVar) {
        return d(xVar.b().replace("spotify-video://", ""));
    }

    @Override // defpackage.c72
    public boolean c(x xVar) {
        return xVar.b().startsWith("spotify-video");
    }

    @Override // defpackage.c72
    public String getType() {
        return "spotifyAdaptive";
    }
}
