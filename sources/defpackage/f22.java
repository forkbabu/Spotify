package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.c;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.rx.v;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuEvent;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuHelper;
import com.spotify.mobile.android.ui.contextmenu.c4;
import com.spotify.mobile.android.ui.contextmenu.s3;
import com.spotify.mobile.android.ui.contextmenu.u3;
import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.music.libs.collection.util.AlbumCollectionState;
import com.spotify.music.libs.podcast.download.f0;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.yourlibraryx.pin.YourLibraryPinStatus;
import com.spotify.music.libs.yourlibraryx.pin.a;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.q;
import com.spotify.ubi.specification.factories.s0;
import defpackage.ij9;
import io.reactivex.g;
import io.reactivex.s;

/* renamed from: f22  reason: default package */
public class f22 implements v32 {
    private final u3 b;
    private final c c;
    private final ifd d;
    private final com.spotify.music.libs.viewuri.c e;
    private final boolean f;
    private final s3 g;
    private final ij9.b h;
    private final boolean i;
    private final v j;
    private final s0 k;
    private final a l;

    public f22(u3 u3Var, c cVar, ifd ifd, com.spotify.music.libs.viewuri.c cVar2, boolean z, s3 s3Var, ij9.b bVar, boolean z2, v vVar, a aVar) {
        this.i = z2;
        this.j = vVar;
        this.b = u3Var;
        cVar.getClass();
        this.c = cVar;
        ifd.getClass();
        this.d = ifd;
        cVar2.getClass();
        this.e = cVar2;
        this.f = z;
        s3Var.getClass();
        this.g = s3Var;
        this.h = bVar;
        this.k = new s0(cVar2.toString());
        this.l = aVar;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public s<ContextMenuViewModel> a(y3<Show> y3Var) {
        g<com.spotify.android.flags.c> b2 = this.j.b();
        b2.getClass();
        return s.n(new io.reactivex.internal.operators.observable.v(b2).N0(1), this.l.a(this.e, y3Var.j()), new j12(this, y3Var));
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public ContextMenuViewModel b(ContextMenuViewModel contextMenuViewModel, boolean z) {
        c4.a(contextMenuViewModel, z);
        return contextMenuViewModel;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.x3
    public ContextMenuViewModel c(y3<Show> y3Var) {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        contextMenuViewModel.w(new com.spotify.android.glue.patterns.contextmenu.model.a(y3Var.g(), "", Uri.EMPTY, SpotifyIconV2.PODCASTS, false));
        return contextMenuViewModel;
    }

    public /* synthetic */ void d(b bVar) {
        this.g.a(ContextMenuEvent.FIND_IN_SHOW);
    }

    public /* synthetic */ nqe e(String str) {
        return this.k.o().a(str);
    }

    public ContextMenuViewModel f(y3 y3Var, com.spotify.android.flags.c cVar, YourLibraryPinStatus yourLibraryPinStatus) {
        Show show = (Show) y3Var.f();
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        u3 u3Var = this.b;
        ifd ifd = this.d;
        ij9.b bVar = this.h;
        com.spotify.music.libs.viewuri.c cVar2 = this.e;
        s3 s3Var = this.g;
        s3Var.getClass();
        ContextMenuHelper a = u3Var.a(ifd, bVar, cVar2, contextMenuViewModel, s3Var, cVar);
        this.c.A().a(a);
        String c2 = q.c(show.c(), Covers.Size.NORMAL);
        com.spotify.android.glue.patterns.contextmenu.model.a aVar = new com.spotify.android.glue.patterns.contextmenu.model.a(show.h(), show.i(), !TextUtils.isEmpty(c2) ? Uri.parse(c2) : Uri.EMPTY, SpotifyIconV2.PODCASTS, false);
        if (this.f) {
            aVar.h(qoc.b(show.d()));
        }
        contextMenuViewModel.w(aVar);
        contextMenuViewModel.H(this.c.getResources().getInteger(C0707R.integer.show_and_episode_context_menu_title_max_rows));
        if (f0.b(cVar)) {
            a.J(show.k() ? AlbumCollectionState.YES : AlbumCollectionState.NO, show.getUri(), show.getUri(), this.k);
        }
        if (yourLibraryPinStatus == YourLibraryPinStatus.NOT_PINNED) {
            a.x(show.getUri());
        } else if (yourLibraryPinStatus == YourLibraryPinStatus.PINNED) {
            a.Y(show.getUri());
        }
        if (this.e == ViewUris.l1) {
            a.v(show.getUri(), this.k);
        }
        a.L(show.h(), "", show.getUri(), null, !TextUtils.isEmpty(c2) ? Uri.parse(c2) : Uri.EMPTY, this.k);
        if (this.i) {
            String k2 = l0.z(show.getUri()).k();
            s52 a2 = t52.a(LinkType.SHOW_FIND);
            a2.getClass();
            contextMenuViewModel.b(C0707R.id.context_menu_find_in_show, this.c.getText(C0707R.string.context_menu_find_in_show), l70.i(this.c, SpotifyIconV2.SEARCH)).n(new k12(this), new l12(this, a2.b().get(0) + ':' + k2));
        }
        return contextMenuViewModel;
    }
}
