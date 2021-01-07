package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.drm.n;
import com.google.android.exoplayer2.drm.q;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.source.u;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.upstream.o;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.video.drm.g;
import com.spotify.mobile.android.video.offline.e0;
import com.spotify.mobile.android.video.offline.h0;
import com.spotify.mobile.android.video.x;
import java.io.IOException;
import java.util.List;
import okhttp3.y;

/* renamed from: n72  reason: default package */
public class n72 implements c72, v {
    private final Handler a = new Handler(Looper.getMainLooper());
    private final y b;
    private final o c;
    private final g f;
    private x n;
    private e72 o;

    public n72(y yVar, o oVar, g gVar) {
        this.b = yVar;
        this.c = oVar;
        this.f = gVar;
    }

    @Override // com.google.android.exoplayer2.source.v
    public void B(int i, t.a aVar, v.c cVar) {
        e72 e72 = this.o;
        if (e72 != null) {
            e72.Y(this.n, cVar.b, cVar.c, cVar.e);
        }
    }

    @Override // com.google.android.exoplayer2.source.v
    public void D(int i, t.a aVar, v.b bVar, v.c cVar) {
        e72 e72 = this.o;
        if (e72 != null && cVar.a == 4) {
            e72.x(this.n, ImmutableList.of());
        }
    }

    @Override // com.google.android.exoplayer2.source.v
    public /* synthetic */ void E(int i, t.a aVar) {
        u.d(this, i, aVar);
    }

    @Override // com.google.android.exoplayer2.source.v
    public /* synthetic */ void J(int i, t.a aVar, v.b bVar, v.c cVar) {
        u.a(this, i, aVar, bVar, cVar);
    }

    @Override // com.google.android.exoplayer2.source.v
    public void K(int i, t.a aVar, v.b bVar, v.c cVar, IOException iOException, boolean z) {
        e72 e72 = this.o;
        if (e72 != null && cVar.a == 4) {
            e72.w(this.n, iOException);
        }
    }

    @Override // com.google.android.exoplayer2.source.v
    public /* synthetic */ void L(int i, t.a aVar) {
        u.c(this, i, aVar);
    }

    @Override // defpackage.c72
    public t a(x xVar, com.spotify.mobile.android.video.u uVar, e0 e0Var, e72 e72) {
        this.n = xVar;
        this.o = e72;
        String b2 = xVar.b();
        y yVar = this.b;
        o oVar = this.c;
        if (e0Var != null) {
            b2 = e0Var.c();
        }
        Uri parse = Uri.parse(b2);
        h0 h0Var = null;
        List<com.google.android.exoplayer2.offline.x> b3 = e0Var != null ? e0Var.b() : null;
        if (e0Var != null) {
            h0Var = e0Var.a();
        }
        HlsMediaSource.Factory factory = new HlsMediaSource.Factory(z42.d(yVar, oVar, uVar));
        Optional<n<q>> a2 = this.f.a(e72, h0Var);
        if (a2.isPresent()) {
            factory.c(a2.get());
        }
        factory.d(b3);
        HlsMediaSource b4 = factory.a(parse);
        b4.b(this.a, this);
        return b4;
    }

    @Override // defpackage.c72
    public String b(x xVar) {
        return xVar.b();
    }

    @Override // defpackage.c72
    public boolean c(x xVar) {
        String path = Uri.parse(xVar.b()).getPath();
        if (path != null) {
            return path.endsWith(".m3u8");
        }
        return false;
    }

    @Override // defpackage.c72
    public String getType() {
        return "hls";
    }

    @Override // com.google.android.exoplayer2.source.v
    public /* synthetic */ void s(int i, t.a aVar, v.c cVar) {
        u.e(this, i, aVar, cVar);
    }

    @Override // com.google.android.exoplayer2.source.v
    public void t(int i, t.a aVar, v.b bVar, v.c cVar) {
        e72 e72 = this.o;
        if (e72 != null && cVar.a == 4) {
            e72.v(this.n);
        }
    }

    @Override // com.google.android.exoplayer2.source.v
    public /* synthetic */ void u(int i, t.a aVar) {
        u.b(this, i, aVar);
    }
}
