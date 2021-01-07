package defpackage;

import android.net.Uri;
import androidx.fragment.app.c;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.glue.patterns.contextmenu.model.a;
import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.mobile.android.rx.v;
import com.spotify.mobile.android.ui.contextmenu.c4;
import com.spotify.mobile.android.ui.contextmenu.s3;
import com.spotify.mobile.android.ui.contextmenu.u3;
import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.music.C0707R;
import com.spotify.music.libs.podcast.download.a0;
import com.spotify.music.libs.podcast.download.c0;
import com.spotify.music.libs.podcast.download.d0;
import com.spotify.music.podcast.episode.util.j;
import com.spotify.playlist.models.Episode;
import com.spotify.ubi.specification.factories.s0;
import defpackage.ij9;
import io.reactivex.s;
import java.util.Iterator;
import java.util.List;

/* renamed from: b22  reason: default package */
public class b22 implements l32 {
    private final boolean A;
    private final a0 B;
    private final d0 C;
    private final m8a D;
    private final ij9.b E;
    private final v F;
    private final s0 G;
    private final u3 b;
    private final c c;
    private final ifd d;
    private final com.spotify.music.libs.viewuri.c e;
    private final SnackbarManager f;
    private final t9b g;
    private final tka h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    private final Optional<String> v;
    private final Optional<String> w;
    private final j x;
    private final s3 y;
    private final o32 z;

    public b22(u3 u3Var, c cVar, ifd ifd, com.spotify.music.libs.viewuri.c cVar2, SnackbarManager snackbarManager, t9b t9b, tka tka, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, s3 s3Var, o32 o32, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Optional<String> optional, Optional<String> optional2, cqe cqe, a0 a0Var, d0 d0Var, m8a m8a, ij9.b bVar, v vVar) {
        this.F = vVar;
        this.b = u3Var;
        this.c = cVar;
        this.d = ifd;
        this.e = cVar2;
        this.f = snackbarManager;
        this.g = t9b;
        tka.getClass();
        this.h = tka;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.s = z12;
        this.A = z8;
        s3Var.getClass();
        this.y = s3Var;
        o32.getClass();
        this.z = o32;
        this.q = z9;
        this.r = z13;
        this.t = z14;
        this.u = z15;
        this.v = optional;
        this.w = optional2;
        this.x = new j(cVar.getResources(), cqe, new com.spotify.music.podcast.episode.util.c(cVar.getResources()));
        this.o = z10;
        this.p = z11;
        this.B = a0Var;
        this.C = d0Var;
        this.D = m8a;
        this.E = bVar;
        this.G = new s0(cVar2.toString());
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public s<ContextMenuViewModel> a(y3<Episode> y3Var) {
        MoreObjects.checkArgument(y3Var.m());
        Episode f2 = y3Var.f();
        return s.n(this.C.a(f2.getUri()), new io.reactivex.internal.operators.observable.v(this.F.b().h0(1)), new z02(this, f2, y3Var));
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public ContextMenuViewModel b(ContextMenuViewModel contextMenuViewModel, boolean z2) {
        c4.a(contextMenuViewModel, z2);
        return contextMenuViewModel;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public ContextMenuViewModel c(y3<Episode> y3Var) {
        boolean z2 = this.A;
        SpotifyIconV2 spotifyIconV2 = z2 ? SpotifyIconV2.VIDEO : SpotifyIconV2.PODCASTS;
        ContextMenuViewModel.HeaderViewType headerViewType = z2 ? ContextMenuViewModel.HeaderViewType.TWO_LINE_LANDSCAPE_IMAGE : ContextMenuViewModel.HeaderViewType.TWO_LINE_SQUARE_IMAGE;
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        contextMenuViewModel.y(headerViewType);
        contextMenuViewModel.w(new a(y3Var.g(), "", Uri.EMPTY, spotifyIconV2, false));
        return contextMenuViewModel;
    }

    public /* synthetic */ void d(Episode episode, c0 c0Var, b bVar) {
        this.B.f(episode.o(), c0Var, new c12(this, episode), new a12(this, episode));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0211, code lost:
        if ((r9 instanceof com.spotify.playlist.models.offline.a.f) == false) goto L_0x0213;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel e(com.spotify.playlist.models.Episode r18, com.spotify.mobile.android.ui.contextmenu.y3 r19, com.spotify.music.libs.podcast.download.c0 r20, com.spotify.android.flags.c r21) {
        /*
        // Method dump skipped, instructions count: 820
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b22.e(com.spotify.playlist.models.Episode, com.spotify.mobile.android.ui.contextmenu.y3, com.spotify.music.libs.podcast.download.c0, com.spotify.android.flags.c):com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel");
    }

    public void f(Episode episode) {
        this.D.a(episode.getUri());
        if (!this.q) {
            je.e(C0707R.string.toast_saved_to_collection_your_library, this.f);
        }
    }

    public void g(Episode episode, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.D.b((String) it.next());
        }
        this.D.b(episode.getUri());
        if (!this.q) {
            je.e(C0707R.string.toast_undownload, this.f);
        }
    }
}
