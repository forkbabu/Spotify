package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.c;
import com.google.common.base.MoreObjects;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.rx.v;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper;
import com.spotify.mobile.android.ui.contextmenu.c4;
import com.spotify.mobile.android.ui.contextmenu.s3;
import com.spotify.mobile.android.ui.contextmenu.u3;
import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.p;
import com.spotify.music.C0707R;
import com.spotify.music.libs.collection.util.AlbumCollectionState;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.yourlibraryx.pin.YourLibraryPinStatus;
import com.spotify.music.libs.yourlibraryx.pin.a;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.q;
import com.spotify.ubi.specification.factories.s0;
import defpackage.ij9;
import io.reactivex.g;
import io.reactivex.s;

/* renamed from: z12  reason: default package */
public class z12 implements p22 {
    private final u3 b;
    private final c c;
    private final ifd d;
    private final com.spotify.music.libs.viewuri.c e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final s3 i;
    private final ij9.b j;
    private final v k;
    private final s0 l;
    private final a m;

    z12(u3 u3Var, c cVar, ifd ifd, com.spotify.music.libs.viewuri.c cVar2, boolean z, boolean z2, boolean z3, s3 s3Var, ij9.b bVar, v vVar, a aVar) {
        this.k = vVar;
        this.b = u3Var;
        this.c = cVar;
        this.d = ifd;
        this.e = cVar2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = s3Var;
        this.j = bVar;
        this.l = new s0(cVar2.toString());
        this.m = aVar;
    }

    private boolean d() {
        if (!this.e.equals(ViewUris.q1)) {
            if (!(l0.z(this.e.toString()).q() == LinkType.COLLECTION_ARTIST)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public s<ContextMenuViewModel> a(y3<com.spotify.music.libs.collection.model.a> y3Var) {
        MoreObjects.checkArgument(y3Var.m());
        if (y3Var.f() != null) {
            g<com.spotify.android.flags.c> b2 = this.k.b();
            b2.getClass();
            return s.n(new io.reactivex.internal.operators.observable.v(b2).N0(1), this.m.a(this.e, y3Var.j()), new x02(this, y3Var));
        }
        throw new IllegalArgumentException("Menu Model should be complete");
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public ContextMenuViewModel b(ContextMenuViewModel contextMenuViewModel, boolean z) {
        c4.a(contextMenuViewModel, z);
        return contextMenuViewModel;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public ContextMenuViewModel c(y3<com.spotify.music.libs.collection.model.a> y3Var) {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        contextMenuViewModel.w(new com.spotify.android.glue.patterns.contextmenu.model.a(y3Var.g(), "", Uri.EMPTY, SpotifyIconV2.ALBUM, false));
        return contextMenuViewModel;
    }

    public ContextMenuViewModel e(y3 y3Var, com.spotify.android.flags.c cVar, YourLibraryPinStatus yourLibraryPinStatus) {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        u3 u3Var = this.b;
        ifd ifd = this.d;
        ij9.b bVar = this.j;
        com.spotify.music.libs.viewuri.c cVar2 = this.e;
        s3 s3Var = this.i;
        s3Var.getClass();
        ContextMenuHelper a = u3Var.a(ifd, bVar, cVar2, contextMenuViewModel, s3Var, cVar);
        this.c.A().a(a);
        com.spotify.music.libs.collection.model.a aVar = (com.spotify.music.libs.collection.model.a) y3Var.f();
        com.spotify.playlist.models.a b2 = aVar.b();
        String d2 = b2.d();
        Covers e2 = b2.e();
        Covers.Size size = Covers.Size.NORMAL;
        String c2 = q.c(e2, size);
        contextMenuViewModel.w(new com.spotify.android.glue.patterns.contextmenu.model.a(b2.g(), b2.c().f(), !TextUtils.isEmpty(c2) ? Uri.parse(c2) : Uri.EMPTY, SpotifyIconV2.ALBUM, false));
        AlbumCollectionState d3 = AlbumCollectionState.d(b2.h(), b2.k());
        a.I(d3, this.g, b2.getUri(), b2.getUri(), ContextMenuHelper.ItemType.TRACK_OR_ALBUM_OR_EPISODE, this.l);
        if (!(!this.h || d3 == AlbumCollectionState.NO || d2 == null)) {
            a.r(d2, b2.i(), this.l);
        }
        if (yourLibraryPinStatus == YourLibraryPinStatus.NOT_PINNED) {
            a.x(b2.getUri());
        } else if (yourLibraryPinStatus == YourLibraryPinStatus.PINNED) {
            a.Y(b2.getUri());
        }
        a.e(b2.getUri(), this.e.toString(), y3Var.e(), this.l);
        a.R(b2.getUri(), aVar.c(), this.l);
        boolean z = b2.j() && z42.C(cVar);
        if (d() && z) {
            a.z(d2, this.l);
        } else if (z) {
            a.z(b2.getUri(), this.l);
        }
        if (d()) {
            a.l(b2.getUri(), b2.g(), this.l);
        }
        if (this.f && !p.a(b2.c().f())) {
            a.i(b2.c().getUri(), b2.c().f(), this.l);
        }
        a.L(b2.g(), this.c.getString(C0707R.string.share_subtitle, new Object[]{b2.c().f()}), b2.getUri(), null, !TextUtils.isEmpty(c2) ? Uri.parse(c2) : Uri.EMPTY, this.l);
        a.P(this.l, b2.getUri());
        if (this.e == ViewUris.l1) {
            a.v(b2.getUri(), this.l);
        }
        a.c(b2.getUri(), b2.g(), q.c(b2.e(), size), this.l);
        return contextMenuViewModel;
    }
}
