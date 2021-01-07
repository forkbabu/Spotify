package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.base.MoreObjects;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.rx.v;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper;
import com.spotify.mobile.android.ui.contextmenu.c4;
import com.spotify.mobile.android.ui.contextmenu.s3;
import com.spotify.mobile.android.ui.contextmenu.u3;
import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.music.follow.j;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.libs.yourlibraryx.pin.YourLibraryPinStatus;
import com.spotify.music.libs.yourlibraryx.pin.a;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.b;
import com.spotify.playlist.models.q;
import com.spotify.ubi.specification.factories.s0;
import defpackage.ij9;
import io.reactivex.g;
import io.reactivex.s;

/* renamed from: a22  reason: default package */
public class a22 implements y22 {
    private final u3 b;
    private final ifd c;
    private final c d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final s3 j;
    private final ij9.b k;
    private final v l;
    private final s0 m;
    private final a n;

    public a22(u3 u3Var, ifd ifd, c cVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, s3 s3Var, ij9.b bVar, v vVar, a aVar) {
        this.l = vVar;
        this.b = u3Var;
        ifd.getClass();
        this.c = ifd;
        cVar.getClass();
        this.d = cVar;
        s3Var.getClass();
        this.j = s3Var;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.k = bVar;
        this.m = new s0(cVar.toString());
        this.n = aVar;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public s<ContextMenuViewModel> a(y3<b> y3Var) {
        MoreObjects.checkArgument(y3Var.m());
        if (y3Var.f() != null) {
            g<com.spotify.android.flags.c> b2 = this.l.b();
            b2.getClass();
            return s.n(new io.reactivex.internal.operators.observable.v(b2).N0(1), this.n.a(this.d, y3Var.j()), new y02(this, y3Var));
        }
        throw new IllegalArgumentException("Menu Model should be complete");
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public ContextMenuViewModel b(ContextMenuViewModel contextMenuViewModel, boolean z) {
        c4.a(contextMenuViewModel, z);
        return contextMenuViewModel;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public ContextMenuViewModel c(y3<b> y3Var) {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        contextMenuViewModel.w(new com.spotify.android.glue.patterns.contextmenu.model.a(y3Var.g(), "", Uri.EMPTY, SpotifyIconV2.ARTIST, true));
        return contextMenuViewModel;
    }

    public ContextMenuViewModel d(y3 y3Var, com.spotify.android.flags.c cVar, YourLibraryPinStatus yourLibraryPinStatus) {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        u3 u3Var = this.b;
        ifd ifd = this.c;
        ij9.b bVar = this.k;
        c cVar2 = this.d;
        s3 s3Var = this.j;
        s3Var.getClass();
        ContextMenuHelper a = u3Var.a(ifd, bVar, cVar2, contextMenuViewModel, s3Var, cVar);
        b bVar2 = (b) y3Var.f();
        Covers d2 = bVar2.d();
        String c2 = bVar2.c();
        Covers.Size size = Covers.Size.NORMAL;
        String c3 = q.c(d2, size);
        contextMenuViewModel.w(new com.spotify.android.glue.patterns.contextmenu.model.a(bVar2.f(), "", !TextUtils.isEmpty(c3) ? Uri.parse(c3) : Uri.EMPTY, SpotifyIconV2.ARTIST, true));
        if (this.g || this.h) {
            j b2 = j.b(bVar2.getUri(), 0, 0, bVar2.j(), bVar2.i());
            if (this.g) {
                a.w(b2, this.m);
            }
            if (this.h) {
                a.f(b2, this.i, this.m);
            }
            contextMenuViewModel.d();
        }
        if ((this.e && bVar2.g() != 0) && c2 != null) {
            a.r(c2, bVar2.h(), this.m);
        }
        if (yourLibraryPinStatus == YourLibraryPinStatus.NOT_PINNED) {
            a.x(bVar2.getUri());
        } else if (yourLibraryPinStatus == YourLibraryPinStatus.PINNED) {
            a.Y(bVar2.getUri());
        }
        if (this.d.equals(ViewUris.p1)) {
            a.i(bVar2.getUri(), bVar2.f(), this.m);
        }
        a.L(bVar2.f(), "", bVar2.getUri(), null, !TextUtils.isEmpty(c3) ? Uri.parse(c3) : Uri.EMPTY, this.m);
        if (!this.f) {
            a.P(this.m, bVar2.getUri());
        }
        if (this.d == ViewUris.l1) {
            a.v(bVar2.getUri(), this.m);
        }
        a.c(bVar2.getUri(), bVar2.f(), q.c(d2, size), this.m);
        return contextMenuViewModel;
    }
}
