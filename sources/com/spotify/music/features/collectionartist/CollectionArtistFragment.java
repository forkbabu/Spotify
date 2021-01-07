package com.spotify.music.features.collectionartist;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.spotify.android.glue.patterns.prettylist.compat.c;
import com.spotify.android.glue.patterns.prettylist.compat.i;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.d0;
import com.spotify.android.glue.patterns.toolbarmenu.e0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.glue.custom.playbutton.c;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.p;
import com.spotify.music.C0707R;
import com.spotify.music.connection.l;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.features.collectionartist.adapter.AlbumsWithTracksAdapter;
import com.spotify.music.follow.j;
import com.spotify.music.follow.m;
import com.spotify.music.follow.resolver.RxFollowersCountResolver;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import com.spotify.music.libs.performance.tracking.h0;
import com.spotify.music.navigation.n;
import com.spotify.music.navigation.t;
import com.spotify.music.premiummini.k;
import com.spotify.music.spotlets.offline.util.OffliningLogger;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.PlayabilityRestriction;
import com.spotify.playlist.models.o;
import com.spotify.playlist.models.offline.a;
import com.spotify.rxjava2.q;
import defpackage.d42;
import defpackage.n22;
import io.reactivex.v;
import io.reactivex.y;
import java.util.Collections;

public class CollectionArtistFragment extends LifecycleListenableFragment implements s, mfd, yod, d0, ToolbarConfig.d, ToolbarConfig.c {
    public static final /* synthetic */ int z1 = 0;
    private ToggleButton A0;
    private boolean B0;
    private boolean C0;
    private j D0;
    private io.reactivex.disposables.b E0;
    private com.spotify.playlist.models.offline.a F0 = a.f.a;
    private final q G0 = new q();
    private int H0;
    private com.spotify.music.libs.viewuri.c I0;
    h0 J0;
    com.spotify.music.spotlets.scannables.c K0;
    e0 L0;
    l M0;
    y N0;
    PlayOrigin O0;
    x9a P0;
    ExplicitContentFacade Q0;
    AgeRestrictedContentFacade R0;
    com.spotify.music.settings.a S0;
    io.reactivex.g<PlayerState> T0;
    bec U0;
    private ViewLoadingTracker V0;
    private com.spotify.android.flags.c W0;
    private w9a X0;
    t Y0;
    jzc Z0;
    com.spotify.android.glue.patterns.toolbarmenu.h0 a1;
    b42 b1;
    l22 c1;
    ys2 d1;
    m e1;
    RxFollowersCountResolver f1;
    com.spotify.mobile.android.util.ui.h g1;
    private ListView h0;
    d0 h1;
    private String i0;
    com.spotify.music.features.collectionartist.adapter.a i1;
    private String j0;
    c.a j1;
    private String k0;
    zec k1;
    private String l0;
    OffliningLogger l1;
    private boolean m0;
    a0 m1;
    private boolean n0;
    bre n1;
    private boolean o0;
    cqe o1;
    private v42 p0;
    k p1;
    private AlbumsWithTracksAdapter q0;
    private final b4<o> q1 = new a();
    private gb0 r0;
    private final b4<AlbumsWithTracksAdapter.a> r1 = new b();
    private DownloadHeaderView s0;
    private final AdapterView.OnItemClickListener s1 = new c();
    private com.spotify.libs.glue.custom.playbutton.c t0;
    private final DownloadHeaderView.a t1 = new d();
    private View u0;
    private final View.OnClickListener u1 = new e();
    private LoadingView v0;
    private final io.reactivex.functions.g<RxFollowersCountResolver.Count> v1 = new t(this);
    private View w0;
    private final io.reactivex.functions.g<Throwable> w1 = new s(this);
    private com.spotify.android.glue.patterns.prettylist.compat.c<i> x0;
    private final Runnable x1 = new f();
    private int y0;
    private final com.spotify.music.follow.l y1 = new g();
    private Handler z0;

    class a implements b4<o> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.spotify.mobile.android.ui.contextmenu.b4
        public r3 p0(o oVar) {
            o oVar2 = oVar;
            d42.f w = CollectionArtistFragment.this.b1.a(oVar2.getUri(), oVar2.getName(), CollectionArtistFragment.this.k0).a(CollectionArtistFragment.this.I0).t(CollectionArtistFragment.this.o0).g(CollectionArtistFragment.this.o0).r(true).w(false);
            w.e(kfd.x);
            return w.b();
        }
    }

    class b implements b4<AlbumsWithTracksAdapter.a> {
        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.spotify.mobile.android.ui.contextmenu.b4
        public r3 p0(AlbumsWithTracksAdapter.a aVar) {
            AlbumsWithTracksAdapter.a aVar2 = aVar;
            n22.e d = CollectionArtistFragment.this.c1.a(aVar2.d(), aVar2.b()).a(CollectionArtistFragment.this.I0).g(CollectionArtistFragment.this.o0).c(true).d(true ^ CollectionArtistFragment.this.p1.a());
            d.e(kfd.x);
            return d.b();
        }
    }

    class c implements AdapterView.OnItemClickListener {
        c() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int headerViewsCount = i - CollectionArtistFragment.this.h0.getHeaderViewsCount();
            if (headerViewsCount >= 0) {
                int i2 = CollectionArtistFragment.this.p0.i(headerViewsCount);
                if (i2 == 0) {
                    CollectionArtistFragment.Y4(CollectionArtistFragment.this, view.getTag(), j, i);
                    return;
                }
                throw new AssertionError(je.p0("Unexpected section ", i2));
            }
        }
    }

    class d implements DownloadHeaderView.a {
        d() {
        }

        @Override // com.spotify.mobile.android.ui.view.DownloadHeaderView.a
        public void a() {
            CollectionArtistFragment.this.Y0.d("spotify:internal:preferences");
        }

        @Override // com.spotify.mobile.android.ui.view.DownloadHeaderView.a
        public void b(boolean z) {
            CollectionArtistFragment.this.G0.a(CollectionArtistFragment.this.X0.a(z).subscribe());
            CollectionArtistFragment collectionArtistFragment = CollectionArtistFragment.this;
            collectionArtistFragment.l1.a(collectionArtistFragment.j0, OffliningLogger.SourceElement.HEADER_TOGGLE, z);
            CollectionArtistFragment collectionArtistFragment2 = CollectionArtistFragment.this;
            collectionArtistFragment2.m1.a(collectionArtistFragment2.j0, z);
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionArtistFragment collectionArtistFragment = CollectionArtistFragment.this;
            CollectionArtistFragment.c5(CollectionArtistFragment.this, collectionArtistFragment.m1.h(collectionArtistFragment.j0));
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectionArtistFragment.this.r5();
        }
    }

    class g implements com.spotify.music.follow.l {
        g() {
        }

        @Override // com.spotify.music.follow.l
        public void g(j jVar) {
            CollectionArtistFragment.this.D0 = jVar;
            CollectionArtistFragment collectionArtistFragment = CollectionArtistFragment.this;
            collectionArtistFragment.B0 = collectionArtistFragment.D0.g();
            CollectionArtistFragment collectionArtistFragment2 = CollectionArtistFragment.this;
            collectionArtistFragment2.C0 = collectionArtistFragment2.D0.f();
            CollectionArtistFragment.this.z0.post(CollectionArtistFragment.this.x1);
        }
    }

    public static abstract class h {

        public interface a {
        }

        public abstract li0 a();

        public abstract boolean b();
    }

    static void Y4(CollectionArtistFragment collectionArtistFragment, Object obj, long j, int i) {
        collectionArtistFragment.getClass();
        if (obj instanceof AlbumsWithTracksAdapter.a) {
            AlbumsWithTracksAdapter.a aVar = (AlbumsWithTracksAdapter.a) obj;
            String d2 = aVar.d();
            collectionArtistFragment.m1.f(d2, i, j);
            t tVar = collectionArtistFragment.Y0;
            n.a a2 = n.a(d2);
            a2.h(aVar.b());
            tVar.e(a2.a());
        } else if (obj instanceof o) {
            o oVar = (o) obj;
            if (z42.C(collectionArtistFragment.W0)) {
                String g2 = collectionArtistFragment.m1.g(oVar.getUri(), i, j);
                if (oVar.getPlayabilityRestriction() == PlayabilityRestriction.EXPLICIT_CONTENT) {
                    collectionArtistFragment.Q0.e(oVar.getUri(), collectionArtistFragment.I0.toString());
                } else if (oVar.getPlayabilityRestriction() == PlayabilityRestriction.AGE_RESTRICTED) {
                    collectionArtistFragment.R0.d(oVar.getUri(), com.spotify.playlist.models.q.e(oVar, Covers.Size.LARGE));
                } else {
                    collectionArtistFragment.G0.a(collectionArtistFragment.U0.a(oVar.getUri()).t(new n(collectionArtistFragment, PreparePlayOptions.builder().skipTo(SkipToTrack.builder().trackUri(oVar.getUri()).pageIndex(0L).trackIndex(0L).build()).build(), LoggingParams.builder().commandInitiatedTime(Long.valueOf(collectionArtistFragment.o1.d())).interactionId(g2).pageInstanceId(collectionArtistFragment.n1.get()).build())).subscribe());
                }
            }
        }
    }

    static void c5(CollectionArtistFragment collectionArtistFragment, String str) {
        collectionArtistFragment.getClass();
        collectionArtistFragment.G0.a(collectionArtistFragment.X0.d(PreparePlayOptions.builder().playerOptionsOverride(PlayerOptionOverrides.builder().shufflingContext(Boolean.TRUE).build()).build(), collectionArtistFragment.O0, Collections.emptyMap(), LoggingParams.builder().commandInitiatedTime(Long.valueOf(collectionArtistFragment.o1.d())).interactionId(str).pageInstanceId(collectionArtistFragment.n1.get()).build()).subscribe());
    }

    public static void d5(CollectionArtistFragment collectionArtistFragment, boolean z) {
        collectionArtistFragment.o0 = z;
        collectionArtistFragment.r5();
        if (z && collectionArtistFragment.j0 != null) {
            io.reactivex.disposables.b bVar = collectionArtistFragment.E0;
            if (bVar != null) {
                bVar.dispose();
            }
            collectionArtistFragment.E0 = collectionArtistFragment.f1.a(collectionArtistFragment.j0).o0(collectionArtistFragment.N0).subscribe(collectionArtistFragment.v1, collectionArtistFragment.w1);
        }
        collectionArtistFragment.d1.P();
    }

    public static void e5(CollectionArtistFragment collectionArtistFragment, h hVar) {
        String str;
        com.spotify.playlist.models.offline.a aVar;
        collectionArtistFragment.getClass();
        com.spotify.playlist.models.b a2 = hVar.a().a();
        collectionArtistFragment.q0.b(hVar.a().b());
        collectionArtistFragment.i0 = a2.f();
        collectionArtistFragment.j0 = a2.getUri();
        String c2 = com.spotify.playlist.models.q.c(a2.d(), Covers.Size.NORMAL);
        collectionArtistFragment.l0 = c2;
        if (collectionArtistFragment.x0 != null) {
            Uri parse = !TextUtils.isEmpty(c2) ? Uri.parse(collectionArtistFragment.l0) : Uri.EMPTY;
            collectionArtistFragment.g1.b(collectionArtistFragment.x0.e(), parse);
            ImageView f2 = collectionArtistFragment.x0.f();
            f2.getClass();
            collectionArtistFragment.g1.g(f2, parse, collectionArtistFragment.x0.a());
            f2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        collectionArtistFragment.F0 = a2.h();
        collectionArtistFragment.H0 = a2.g();
        collectionArtistFragment.s5();
        collectionArtistFragment.m0 = hVar.b();
        collectionArtistFragment.D2().putString("title", collectionArtistFragment.i0);
        com.spotify.android.glue.patterns.prettylist.compat.c<i> cVar = collectionArtistFragment.x0;
        if (cVar == null) {
            collectionArtistFragment.d1.k(collectionArtistFragment, collectionArtistFragment.i0);
        } else {
            cVar.j().a(collectionArtistFragment.i0);
        }
        j c3 = collectionArtistFragment.e1.c(collectionArtistFragment.j0);
        collectionArtistFragment.D0 = c3;
        if (c3 != null) {
            collectionArtistFragment.B0 = c3.g();
            collectionArtistFragment.C0 = collectionArtistFragment.D0.f();
        } else {
            collectionArtistFragment.B0 = a2.j();
            collectionArtistFragment.C0 = a2.i();
            io.reactivex.disposables.b bVar = collectionArtistFragment.E0;
            if (bVar != null) {
                bVar.dispose();
            }
            collectionArtistFragment.E0 = collectionArtistFragment.f1.a(collectionArtistFragment.j0).o0(collectionArtistFragment.N0).subscribe(collectionArtistFragment.v1, collectionArtistFragment.w1);
        }
        collectionArtistFragment.e1.b(collectionArtistFragment.j0, collectionArtistFragment.y1);
        collectionArtistFragment.r5();
        collectionArtistFragment.n0 = true;
        collectionArtistFragment.d1.P();
        if (collectionArtistFragment.s0 != null) {
            AlbumsWithTracksAdapter albumsWithTracksAdapter = collectionArtistFragment.q0;
            boolean z = albumsWithTracksAdapter != null && albumsWithTracksAdapter.getCount() > 0;
            DownloadHeaderView downloadHeaderView = collectionArtistFragment.s0;
            if (z) {
                aVar = collectionArtistFragment.F0;
            } else {
                aVar = a.f.a;
            }
            downloadHeaderView.r(aVar);
        }
        if (collectionArtistFragment.v0.p()) {
            collectionArtistFragment.v0.n();
            if (collectionArtistFragment.x0 != null) {
                collectionArtistFragment.z0.post(new y(collectionArtistFragment));
            }
        }
        boolean z2 = collectionArtistFragment.q0.getCount() > 0;
        if (!z2) {
            collectionArtistFragment.p0.o(1);
            if (!collectionArtistFragment.B0) {
                str = "not_followed";
            } else if (collectionArtistFragment.H0 == 0) {
                str = "no_songs";
            } else {
                AlbumsWithTracksAdapter albumsWithTracksAdapter2 = collectionArtistFragment.q0;
                str = (albumsWithTracksAdapter2 == null || albumsWithTracksAdapter2.getCount() != 0) ? "no_reason_available" : "no_playable";
            }
            collectionArtistFragment.m1.b(str);
            View view = collectionArtistFragment.u0;
            if (view != null) {
                view.setEnabled(false);
            }
            if (collectionArtistFragment.x0 != null) {
                collectionArtistFragment.z0.post(new j(collectionArtistFragment));
            }
        } else {
            collectionArtistFragment.p0.k(1);
            View view2 = collectionArtistFragment.u0;
            if (view2 != null) {
                view2.setEnabled(true);
            }
        }
        if (!collectionArtistFragment.v0.p()) {
            collectionArtistFragment.w0.setVisibility(0);
        }
        if (collectionArtistFragment.y0 > 0 && z2) {
            collectionArtistFragment.h0.post(new q(collectionArtistFragment));
        }
        collectionArtistFragment.p0.p(0);
        collectionArtistFragment.d1.P();
        collectionArtistFragment.A0.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void r5() {
        j jVar;
        s5();
        if (this.x0 != null) {
            boolean a2 = p.a(this.i0);
            this.A0.setText(this.B0 ? C0707R.string.artist_header_following : C0707R.string.artist_header_follow);
            this.A0.setChecked(this.B0);
            this.A0.setEnabled(this.o0 && this.D0 != null);
            if (a2 || (jVar = this.D0) == null) {
                this.x0.j().c().setVisibility(8);
            } else {
                int c2 = jVar.c();
                this.x0.j().c().setVisibility(0);
                this.x0.j().f(R2().getQuantityString(C0707R.plurals.artist_header_followers_count, c2, Integer.valueOf(c2)));
            }
            this.x0.h().getListView().requestLayout();
        }
        this.d1.P();
    }

    private void s5() {
        String str;
        if (this.B0 || !this.o0) {
            str = B2().getString(C0707R.string.placeholder_collection_empty_artist_only_body, new Object[]{this.i0});
        } else {
            str = B2().getString(c0.a(this.W0, C0707R.string.placeholder_collection_empty_artist_only_not_following_body), new Object[]{this.i0});
        }
        AlbumsWithTracksAdapter albumsWithTracksAdapter = this.q0;
        if (albumsWithTracksAdapter != null && this.H0 > albumsWithTracksAdapter.getCount()) {
            str = B2().getString(C0707R.string.placeholder_collection_empty_artist_only_no_available_songs_body, new Object[]{this.i0});
        }
        this.r0.setSubtitle(str);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        String str = this.i0;
        return str == null ? context.getString(C0707R.string.collection_artist_default_title) : str;
    }

    @Override // defpackage.yod
    public Uri L0() {
        return Uri.parse(this.k0);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        super.N3(bundle);
        ListView listView = this.h0;
        if (listView != null) {
            bundle.putInt("list_position", listView.getFirstVisiblePosition());
        }
        this.V0.t(bundle);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        w wVar = w.a;
        super.O3();
        this.w0.setVisibility(4);
        this.v0.r();
        this.G0.a(this.M0.b().o0(this.N0).subscribe(new d(this), m.a));
        if (z42.y(this.W0)) {
            this.G0.a(this.S0.a().j0(wVar).E().J0(new c(this)).o0(this.N0).subscribe(new k(this), h.a));
        } else {
            this.G0.a(this.S0.a().j0(wVar).E().J0(new b(this)).o0(this.N0).subscribe(new k(this), i.a));
        }
        this.G0.a(this.T0.Q(this.N0).subscribe(new e(this), a.a));
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.G0.c();
        this.v0.q();
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    public void f5() {
        String str = this.l0;
        androidx.fragment.app.c B2 = B2();
        String str2 = this.i0;
        if (str2 == null) {
            str2 = B2.getString(C0707R.string.collection_artist_default_title);
        }
        this.Z0.c(pzc.e(str, str2, "", this.j0).build(), rzc.a, C0707R.string.integration_id_context_menu);
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.d0
    public void g(a0 a0Var) {
        AlbumsWithTracksAdapter albumsWithTracksAdapter = this.q0;
        boolean z = albumsWithTracksAdapter != null && albumsWithTracksAdapter.getCount() > 0;
        if (e3() && this.j0 != null) {
            com.spotify.android.glue.patterns.prettylist.compat.c<i> cVar = this.x0;
            if (cVar != null) {
                cVar.k(a0Var, B2());
            }
            a0Var.a(this.K0.a(this.l0, this.j0, true), SpotifyIconV2.ARTIST, false, true);
            a0Var.h(this.i0);
            if (z && !this.p1.a()) {
                this.L0.b(a0Var, this.I0, this.F0, C0707R.string.options_menu_download, new f(this), C0707R.string.options_menu_undownload, new o(this));
            }
            if (this.o0 && this.j0 != null && !p.a(this.i0) && this.D0 != null) {
                this.a1.k(a0Var, this.I0, this.j0, this.B0);
            }
            if (this.j0 != null && !p.a(this.i0) && this.n0) {
                d0 d0Var = this.h1;
                String str = this.j0;
                d0Var.getClass();
                a0Var.j(C0707R.id.options_menu_browse_artist, C0707R.string.options_menu_browse_artist, l70.i(a0Var.getContext(), SpotifyIconV2.BROWSE)).a(new v(d0Var, str));
            }
            this.a1.p(a0Var, new r(this));
            if (this.m0) {
                this.L0.m(a0Var, getViewUri(), this.j0, this.W0, F2());
            }
        }
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.COLLECTION_ARTISTS_ARTIST;
    }

    public void g5(View view) {
        boolean z = this.B0;
        if (this.o0) {
            this.e1.e(this.j0, !z);
            if (z) {
                this.m1.i(this.j0);
            } else {
                this.m1.c(this.j0);
            }
        }
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public com.spotify.music.libs.viewuri.c getViewUri() {
        Parcelable parcelable = k4().getParcelable("artist_collection_uri");
        parcelable.getClass();
        return (com.spotify.music.libs.viewuri.c) parcelable;
    }

    public /* synthetic */ void h5(RxFollowersCountResolver.Count count) {
        j c2 = this.e1.c(this.j0);
        this.D0 = c2;
        if (c2 == null) {
            this.D0 = j.b(this.j0, count.getFollowersCount(), count.getFollowingCount(), this.B0, this.C0);
        } else {
            j.a h2 = c2.h();
            h2.c(count.getFollowersCount());
            h2.e(count.getFollowingCount());
            this.D0 = h2.a();
        }
        this.e1.g(this.D0);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        StringBuilder V02 = je.V0("collection:artist:");
        V02.append(this.k0);
        return V02.toString();
    }

    public /* synthetic */ void i5(Throwable th) {
        Logger.e(th, "Failed to get followed count for %s", this.j0);
    }

    public /* synthetic */ void j5() {
        this.G0.a(this.X0.a(true).subscribe());
    }

    public /* synthetic */ void k5() {
        this.G0.a(this.X0.a(false).subscribe());
    }

    public /* synthetic */ v l5(Boolean bool) {
        w9a b2 = this.P0.b(this.k0);
        w9a b3 = this.P0.b(this.k0);
        b3.f(!bool.booleanValue());
        return io.reactivex.s.m(b2.b(), b3.c(), this.M0.b(), p.a);
    }

    public /* synthetic */ v m5(Boolean bool) {
        w9a b2 = this.P0.b(this.k0);
        b2.f(!bool.booleanValue());
        return io.reactivex.s.n(b2.b(), this.M0.b(), l.a);
    }

    public /* synthetic */ void n5(PlayerState playerState) {
        Optional<ContextTrack> track = playerState.track();
        if (l0.z(playerState.contextUri()).q() != LinkType.COLLECTION_ARTIST || !track.isPresent()) {
            this.q0.a(null);
        } else {
            this.q0.a(track.get().uri());
        }
    }

    public /* synthetic */ void o5() {
        this.x0.m(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    public /* synthetic */ void p5() {
        this.h0.setSelectionFromTop(this.y0, 0);
        this.y0 = 0;
    }

    public /* synthetic */ io.reactivex.e q5(PreparePlayOptions preparePlayOptions, LoggingParams loggingParams, Boolean bool) {
        if (bool.booleanValue()) {
            return this.X0.d(preparePlayOptions, this.O0, Collections.emptyMap(), loggingParams);
        }
        return io.reactivex.internal.operators.completable.b.a;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        this.I0 = getViewUri();
        if (bundle != null) {
            bundle.setClassLoader(B2().getClassLoader());
            if (bundle.containsKey("list_position")) {
                this.y0 = bundle.getInt("list_position", 0);
            }
        }
        Bundle D2 = D2();
        this.k0 = this.I0.toString();
        this.i0 = D2.getString("title");
        this.X0 = this.P0.b(this.k0);
        this.W0 = com.spotify.android.flags.d.c(this);
        u4(true);
        this.z0 = new Handler();
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.COLLECTION_ARTISTS_ARTIST, getViewUri().toString());
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void v3(Menu menu, MenuInflater menuInflater) {
        ToolbarConfig.c(this, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.W0 = com.spotify.android.flags.d.c(this);
        androidx.fragment.app.c B2 = B2();
        if (this.k1.d()) {
            com.spotify.libs.glue.custom.playbutton.c a2 = this.j1.a(B2);
            this.t0 = a2;
            a2.b(!this.k1.c());
            this.u0 = this.t0.getView();
        } else {
            this.u0 = x42.a(B2, null, null, C0707R.string.header_shuffle_play);
        }
        this.u0.setOnClickListener(this.u1);
        c.b a3 = com.spotify.android.glue.patterns.prettylist.compat.c.b(B2).a(1);
        ToggleButton toggleButton = (ToggleButton) LayoutInflater.from(B2()).inflate(C0707R.layout.header_toggle_button, (ViewGroup) null);
        this.A0 = toggleButton;
        toggleButton.setOnClickListener(new g(this));
        c.a<i> e2 = a3.e(this.A0, 0);
        e2.c(true);
        e2.f(this.u0);
        com.spotify.android.glue.patterns.prettylist.compat.c<i> a4 = e2.a(this);
        this.x0 = a4;
        a4.o(nud.h(B2, C0707R.attr.pasteColorSubHeaderBackground));
        this.x0.j().a(this.i0);
        this.w0 = this.x0.i();
        ListView listView = this.x0.h().getListView();
        this.h0 = listView;
        listView.setOnItemClickListener(this.s1);
        FrameLayout frameLayout = new FrameLayout(B2());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(this.w0);
        this.V0 = this.J0.b(frameLayout, this.I0.toString(), bundle, u0());
        this.h0.setFastScrollEnabled(true);
        LoadingView m = LoadingView.m(layoutInflater, B2(), this.w0);
        this.v0 = m;
        frameLayout.addView(m);
        this.A0.setVisibility(4);
        this.q0 = this.i1.b(z42.C(this.W0), this.q1, this.r1);
        androidx.fragment.app.c B22 = B2();
        gb0 a5 = e90.c().a(B22, null);
        a5.b2(false);
        TextView titleView = a5.getTitleView();
        TextView subtitleView = a5.getSubtitleView();
        titleView.setSingleLine(false);
        titleView.setEllipsize(null);
        subtitleView.setSingleLine(false);
        subtitleView.setEllipsize(null);
        a5.getTitleView().setVisibility(8);
        a5.setSubtitle(B22.getString(C0707R.string.placeholder_collection_empty_artist_only_body));
        this.r0 = a5;
        a5.setSubtitle(B2().getString(C0707R.string.placeholder_collection_empty_artist_only_body, new Object[]{this.i0}));
        this.p0 = new v42(B2());
        this.p0.d(this.q0, B2().getString(c0.a(this.W0, C0707R.string.collection_artist_section_my_albums)), 0);
        this.p0.d(new w02(this.r0.getView(), false), null, 1);
        this.p0.k(1, 0);
        if (!this.p1.a()) {
            DownloadHeaderView a6 = DownloadHeaderView.a(B2(), null);
            this.s0 = a6;
            a6.setObserver(this.t1);
            this.h0.addHeaderView(this.s0, null, false);
        }
        this.h0.setAdapter((ListAdapter) this.p0);
        this.h0.setOnItemLongClickListener(new j42(B2(), this.I0));
        return frameLayout;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void x3() {
        super.x3();
        this.z0.removeCallbacks(this.x1);
        String str = this.j0;
        if (str != null) {
            this.e1.d(str, this.y1);
        }
        io.reactivex.disposables.b bVar = this.E0;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        this.V0.f();
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.x;
    }
}
