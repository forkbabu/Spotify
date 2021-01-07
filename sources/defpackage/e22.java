package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.c;
import com.google.common.base.MoreObjects;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.mobile.android.rx.v;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper;
import com.spotify.mobile.android.ui.contextmenu.c4;
import com.spotify.mobile.android.ui.contextmenu.delegates.playlist.PlaylistMenuMaker;
import com.spotify.mobile.android.ui.contextmenu.s3;
import com.spotify.mobile.android.ui.contextmenu.u3;
import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.mobile.android.ui.view.y;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.libs.collection.service.OffliningService;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.yourlibraryx.pin.YourLibraryPinStatus;
import com.spotify.music.libs.yourlibraryx.pin.a;
import com.spotify.music.playlist.service.b;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.p;
import com.spotify.playlist.models.q;
import com.spotify.ubi.specification.factories.s0;
import defpackage.ij9;
import io.reactivex.g;
import io.reactivex.s;

/* renamed from: e22  reason: default package */
public class e22 implements PlaylistMenuMaker {
    public static final /* synthetic */ int t = 0;
    private final u3 b;
    private final c c;
    private final ifd d;
    private final com.spotify.music.libs.viewuri.c e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final PlaylistMenuMaker.EditOption i;
    private final s3 j;
    private final SnackbarManager k;
    private final y l;
    private final g<SessionState> m;
    private final ij9.b n;
    private final v o;
    private final w p;
    private final s0 q;
    private final b r;
    private final a s;

    e22(u3 u3Var, c cVar, ifd ifd, com.spotify.music.libs.viewuri.c cVar2, boolean z, boolean z2, boolean z3, PlaylistMenuMaker.EditOption editOption, s3 s3Var, SnackbarManager snackbarManager, y yVar, g<SessionState> gVar, ij9.b bVar, v vVar, w wVar, b bVar2, a aVar) {
        this.o = vVar;
        this.b = u3Var;
        cVar.getClass();
        this.c = cVar;
        ifd.getClass();
        this.d = ifd;
        cVar2.getClass();
        this.e = cVar2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = editOption;
        s3Var.getClass();
        this.j = s3Var;
        this.k = snackbarManager;
        this.l = yVar;
        this.m = gVar;
        this.n = bVar;
        this.p = wVar;
        this.q = new s0(cVar2.toString());
        this.r = bVar2;
        this.s = aVar;
    }

    private void h(j jVar, boolean z) {
        String uri = jVar.getUri();
        if (!z) {
            this.l.a(d12.a, new e12(this, uri));
        } else if (!jVar.t()) {
            ((com.spotify.music.playlist.service.c) this.r).b(uri, true);
        } else {
            OffliningService.a(this.c, uri, true);
        }
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public s<ContextMenuViewModel> a(y3<j> y3Var) {
        MoreObjects.checkArgument(y3Var.m());
        g<SessionState> gVar = this.m;
        gVar.getClass();
        return s.l(new io.reactivex.internal.operators.observable.v(gVar), new io.reactivex.internal.operators.observable.v(this.o.b().h0(1)), this.p.b().j0(x12.a), this.s.a(this.e, y3Var.j()), new h12(this, y3Var.f(), y3Var));
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public ContextMenuViewModel b(ContextMenuViewModel contextMenuViewModel, boolean z) {
        c4.a(contextMenuViewModel, z);
        return contextMenuViewModel;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public ContextMenuViewModel c(y3<j> y3Var) {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        contextMenuViewModel.w(new com.spotify.android.glue.patterns.contextmenu.model.a(y3Var.g(), "", Uri.EMPTY, SpotifyIconV2.PLAYLIST, false));
        return contextMenuViewModel;
    }

    public /* synthetic */ void d(j jVar, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        h(jVar, true);
    }

    public /* synthetic */ void e(j jVar, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        h(jVar, false);
    }

    public ContextMenuViewModel f(j jVar, y3 y3Var, SessionState sessionState, com.spotify.android.flags.c cVar, Boolean bool, YourLibraryPinStatus yourLibraryPinStatus) {
        int i2;
        boolean booleanValue = bool.booleanValue();
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        u3 u3Var = this.b;
        ifd ifd = this.d;
        ij9.b bVar = this.n;
        com.spotify.music.libs.viewuri.c cVar2 = this.e;
        s3 s3Var = this.j;
        s3Var.getClass();
        ContextMenuHelper a = u3Var.a(ifd, bVar, cVar2, contextMenuViewModel, s3Var, cVar);
        this.c.A().a(a);
        p m2 = jVar.m();
        String str = "";
        if (m2 != null) {
            str = (String) x.n(m2.a(), str);
        }
        String c2 = q.c(jVar.c(), Covers.Size.SMALL);
        contextMenuViewModel.w(new com.spotify.android.glue.patterns.contextmenu.model.a(jVar.j(), str, !TextUtils.isEmpty(c2) ? Uri.parse(c2) : Uri.EMPTY, SpotifyIconV2.PLAYLIST, false));
        String j2 = y3Var.j();
        if (jVar.u() && !jVar.s() && !jVar.w()) {
            a.Q(j2, jVar.t(), jVar.j(), this.q);
        }
        if (this.f && (sessionState.connected() || jVar.q()) && !jVar.s() && !this.g) {
            i2 = 1;
            a.q(j2, jVar.k(), new f12(this, jVar), new g12(this, jVar), this.q);
        } else {
            i2 = 1;
        }
        boolean u = jVar.u();
        boolean connected = sessionState.connected();
        boolean q2 = jVar.q();
        boolean s2 = jVar.s();
        boolean w = jVar.w();
        boolean r2 = jVar.r();
        PlaylistMenuMaker.EditOption editOption = this.i;
        boolean z = w || r2;
        boolean z2 = u && (connected || q2) && !s2 && ((!booleanValue && z) || ((booleanValue && editOption == PlaylistMenuMaker.EditOption.SHOW_WHEN_CAN_MODIFY_CONTENTS && z) || (booleanValue && editOption == PlaylistMenuMaker.EditOption.SHOW_WHEN_OWNED_BY_SELF && w)));
        if (z2) {
            a.t(j2, this.q);
        }
        if (jVar.u() && (sessionState.connected() || jVar.q()) && !jVar.s() && jVar.w() && booleanValue && !z2) {
            a.F(j2, jVar.j(), this.q);
        }
        if (jVar.u() && !jVar.s() && !jVar.r() && jVar.w()) {
            a.T(j2, jVar.y(), this.q);
        }
        if (yourLibraryPinStatus == YourLibraryPinStatus.NOT_PINNED) {
            a.x(j2);
        } else if (yourLibraryPinStatus == YourLibraryPinStatus.PINNED) {
            a.Y(j2);
        }
        if (jVar.u() && !jVar.s() && (sessionState.connected() || jVar.q()) && jVar.w()) {
            a.S(j2, jVar.r(), this.q);
        }
        if (this.h && jVar.w() && !jVar.s()) {
            a.E(jVar.j(), j2, this.q);
        }
        if (jVar.u() && !jVar.s() && (sessionState.connected() || jVar.q())) {
            l0 A = l0.A(l0.z(j2).i());
            String j3 = jVar.j();
            c cVar3 = this.c;
            Object[] objArr = new Object[i2];
            objArr[0] = str;
            a.L(j3, cVar3.getString(C0707R.string.share_by_owner, objArr), A.B(), null, !TextUtils.isEmpty(c2) ? Uri.parse(c2) : Uri.EMPTY, this.q);
        }
        if (jVar.u() && (sessionState.connected() || jVar.q())) {
            s0 s0Var = this.q;
            String[] strArr = new String[i2];
            strArr[0] = j2;
            a.P(s0Var, strArr);
        }
        if (this.e == ViewUris.l1) {
            a.v(j2, this.q);
        }
        if (jVar.u()) {
            a.c(j2, y3Var.g(), c2, this.q);
        }
        a.p1(jVar.u());
        return contextMenuViewModel;
    }

    public void g(String str) {
        OffliningService.a(this.c, str, false);
        je.e(C0707R.string.toast_undownload, this.k);
    }
}
