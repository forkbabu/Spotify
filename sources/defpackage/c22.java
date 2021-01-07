package defpackage;

import androidx.fragment.app.c;
import com.google.common.base.Optional;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.mobile.android.rx.v;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.contextmenu.d4;
import com.spotify.mobile.android.ui.contextmenu.delegates.playlist.PlaylistMenuMaker;
import com.spotify.mobile.android.ui.contextmenu.s3;
import com.spotify.mobile.android.ui.contextmenu.u3;
import com.spotify.mobile.android.ui.view.y;
import com.spotify.music.libs.podcast.download.a0;
import com.spotify.music.libs.podcast.download.d0;
import com.spotify.music.libs.web.RxWebToken;
import com.spotify.music.offlinetrials.limited.uicomponents.u;
import com.spotify.music.playlist.service.b;
import com.spotify.music.premiummini.a;
import com.spotify.music.premiummini.k;
import com.spotify.playlist.endpoints.d;
import defpackage.f42;
import defpackage.ij9;
import defpackage.l32;
import defpackage.p22;
import defpackage.v32;
import defpackage.y22;
import io.reactivex.g;
import io.reactivex.s;

/* renamed from: c22  reason: default package */
public class c22 implements y22.a, l32.a, PlaylistMenuMaker.a, v32.a, f42.a, p22.a {
    private final boolean a;
    private final tka b;
    private final u3 c;
    private final c d;
    private final SnackbarManager e;
    private final t9b f;
    private final cqe g;
    private final g<SessionState> h;
    private final d i;
    private final d9c j;
    private final kzc k;
    private final ij9.b l;
    private final s<com.spotify.music.connection.g> m;
    private final RxWebToken n;
    private final boolean o;
    private final k p;
    private final a q;
    private final com.spotify.music.offlinetrials.limited.logging.a r;
    private final com.spotify.music.offlinetrials.limited.logging.c s;
    private final v t;
    private final w u;
    private final b v;
    private final com.spotify.music.libs.yourlibraryx.pin.a w;

    public c22(boolean z, tka tka, u3 u3Var, c cVar, SnackbarManager snackbarManager, t9b t9b, cqe cqe, g<SessionState> gVar, d dVar, d9c d9c, kzc kzc, ij9.b bVar, s<com.spotify.music.connection.g> sVar, RxWebToken rxWebToken, boolean z2, k kVar, a aVar, com.spotify.music.offlinetrials.limited.logging.a aVar2, com.spotify.music.offlinetrials.limited.logging.c cVar2, v vVar, w wVar, b.a aVar3, com.spotify.music.libs.yourlibraryx.pin.a aVar4) {
        this.t = vVar;
        this.b = tka;
        this.a = z;
        this.c = u3Var;
        this.d = cVar;
        this.e = snackbarManager;
        this.f = t9b;
        this.g = cqe;
        this.h = gVar;
        this.i = dVar;
        this.j = d9c;
        this.k = kzc;
        this.l = bVar;
        this.m = sVar;
        this.n = rxWebToken;
        this.o = z2;
        this.p = kVar;
        this.q = aVar;
        this.r = aVar2;
        this.s = cVar2;
        this.u = wVar;
        this.v = aVar3.a(cVar);
        this.w = aVar4;
    }

    @Override // defpackage.y22.a
    public y22 a(ifd ifd, com.spotify.music.libs.viewuri.c cVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, s3 s3Var) {
        return new a22(this.c, ifd, cVar, z, z2, z3, z4, z5, s3Var, this.l, this.t, this.w);
    }

    @Override // defpackage.f42.a
    public f42 b(ifd ifd, com.spotify.music.libs.viewuri.c cVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Optional<String> optional, boolean z7, s3 s3Var, Optional<String> optional2, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, Optional<d4> optional3, Optional<d4> optional4, boolean z14, boolean z15, Optional<qzc> optional5, boolean z16) {
        return new i22(this.c, this.d, ifd, cVar, this.b, z, z2, z3, z4, z5, z6 && this.a, optional, z7, s3Var, optional2, z8, z9, z10, z11, z12, z13, optional3, optional4, z14, z15, this.o, this.p.b(), this.q, this.n, this.i, this.j, this.k.a(this.d, cVar, this.l, optional5.orNull()), this.l, this.m, new u(this.d, this.r, this.s), z16, this.t);
    }

    @Override // defpackage.v32.a
    public v32 c(ifd ifd, com.spotify.music.libs.viewuri.c cVar, boolean z, s3 s3Var, boolean z2) {
        return new f22(this.c, this.d, ifd, cVar, z, s3Var, this.l, z2, this.t, this.w);
    }

    @Override // defpackage.p22.a
    public p22 d(ifd ifd, com.spotify.music.libs.viewuri.c cVar, boolean z, boolean z2, boolean z3, s3 s3Var) {
        return new z12(this.c, this.d, ifd, cVar, z, z2, z3, s3Var, this.l, this.t, this.w);
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.delegates.playlist.PlaylistMenuMaker.a
    public PlaylistMenuMaker e(ifd ifd, com.spotify.music.libs.viewuri.c cVar, boolean z, boolean z2, PlaylistMenuMaker.EditOption editOption, s3 s3Var) {
        return new e22(this.c, this.d, ifd, cVar, z, this.p.a(), z2, editOption, s3Var, this.e, new y(this.d), this.h, this.l, this.t, this.u, this.v, this.w);
    }

    @Override // defpackage.l32.a
    public l32 f(ifd ifd, com.spotify.music.libs.viewuri.c cVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, s3 s3Var, o32 o32, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Optional<String> optional, Optional<String> optional2, a0 a0Var, d0 d0Var, m8a m8a) {
        return new b22(this.c, this.d, ifd, cVar, this.e, this.f, this.b, z, z2, z3, z4, z5, z6, z7, s3Var, o32, z8, z9, z10, z11, z12, z13, z14, optional, optional2, this.g, a0Var, d0Var, m8a, this.l, this.t);
    }
}
