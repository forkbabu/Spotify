package defpackage;

import android.content.Context;
import androidx.fragment.app.c;
import com.google.common.base.Optional;
import com.spotify.mobile.android.util.o0;
import com.spotify.music.share.logging.ShareMenuLogger;
import com.spotify.music.share.logging.a;
import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.sa;
import com.spotify.share.util.m;
import defpackage.ij9;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: lzc  reason: default package */
public class lzc implements kzc {
    private final g<PlayerState> a;
    private final jz1 b;
    private final c1d c;
    private final y d;
    private final c2d e;
    private final o0 f;
    private final r4e g;
    private final m h;
    private final v0d i;
    private final sa j;
    private final ShareMenuLogger k;
    private final Context l;

    public lzc(g<PlayerState> gVar, jz1 jz1, r4e r4e, c1d c1d, y yVar, c2d c2d, o0 o0Var, m mVar, v0d v0d, sa saVar, ShareMenuLogger shareMenuLogger, Context context) {
        this.a = gVar;
        this.b = jz1;
        this.c = c1d;
        this.d = yVar;
        this.f = o0Var;
        this.g = r4e;
        this.h = mVar;
        this.i = v0d;
        this.j = saVar;
        this.k = shareMenuLogger;
        this.e = c2d;
        this.l = context;
    }

    @Override // defpackage.kzc
    public jzc a(c cVar, com.spotify.music.libs.viewuri.c cVar2, ij9.b bVar, qzc qzc) {
        c8e c8e = new c8e(cVar, this.g, this.h);
        a aVar = new a(cVar, this.b, Optional.of(cVar2));
        q0d q0d = new q0d(cVar, cVar2);
        return new nzc(cVar, this.a, c8e, aVar, new y0d(cVar, new a1d(this.c, q0d), this.i, this.k), this.d, q0d, this.e, this.f, bVar, this.j, qzc, this.k, this.l);
    }

    @Override // defpackage.kzc
    public jzc b(c cVar, com.spotify.music.libs.viewuri.c cVar2, ij9.b bVar) {
        return a(cVar, cVar2, bVar, null);
    }
}
