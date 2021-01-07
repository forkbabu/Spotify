package defpackage;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.android.glue.components.toolbar.c;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarManager;
import com.spotify.android.paste.app.d;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistallsongs.i;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller;
import com.spotify.playlist.models.l;
import com.squareup.picasso.Picasso;
import defpackage.u06;
import java.util.List;

/* renamed from: a26  reason: default package */
public class a26 implements z16 {
    private final Picasso a;
    private final Activity b;
    private final l16 c;
    private final u06.a f;
    private final i n;
    private final w16 o;
    private final View.OnClickListener p = new a();
    private c q;
    private View r;
    private kb0 s;
    private AppBarLayout t;
    private RecyclerView u;
    private twd v;
    private u06 w;
    private u06 x;
    private v16 y;

    /* renamed from: a26$a */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a26.this.c.f();
        }
    }

    /* renamed from: a26$b */
    class b extends dwd {
        b() {
        }

        @Override // defpackage.dwd
        public void onColorExtracted(int i) {
            mc0 a = lc0.a(new ColorDrawable(i), new kc0(a26.this.b));
            AppBarLayout appBarLayout = a26.this.t;
            int i2 = q4.g;
            int i3 = Build.VERSION.SDK_INT;
            appBarLayout.setBackground(a);
        }
    }

    public a26(Picasso picasso, Activity activity, u06.a aVar, i iVar, w16 w16, l16 l16) {
        this.a = picasso;
        this.b = activity;
        this.c = l16;
        this.o = w16;
        this.f = aVar;
        this.n = iVar;
    }

    public void A(boolean z) {
        if (z) {
            this.v.l0(1);
        } else {
            this.v.i0(1);
        }
    }

    public void B(boolean z) {
        this.y.G2(z);
    }

    public void C() {
        this.r.setVisibility(0);
    }

    public void D(boolean z) {
        if (z) {
            this.v.l0(2);
        } else {
            this.v.i0(2);
        }
    }

    public void E(boolean z) {
        if (z) {
            this.v.l0(0);
        } else {
            this.v.i0(0);
        }
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void a(int i, l lVar) {
        this.c.a(i, lVar);
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void b(int i, l lVar) {
        this.c.h(lVar, i);
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void c(int i, l lVar, boolean z) {
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void d(int i, l lVar) {
        this.c.c(lVar, i);
    }

    @Override // defpackage.u06.b
    public void e(l lVar, int i) {
        this.c.e(lVar, i);
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void f(int i, l lVar) {
        this.c.m(lVar, i);
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void g(int i, l lVar) {
        this.c.j(lVar, i);
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void h(int i, l lVar) {
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void i(int i, l lVar) {
        this.c.i(lVar, i);
    }

    public void m() {
        this.b.finish();
    }

    public /* synthetic */ void n(View view) {
        this.c.l();
    }

    public /* synthetic */ void o(View view, ToolbarManager toolbarManager, AppBarLayout appBarLayout, int i) {
        int abs = Math.abs(i);
        float f2 = (float) abs;
        float height = f2 / ((float) view.getHeight());
        this.y.e0(abs, height);
        this.y.getView().setTranslationY(f2);
        toolbarManager.o(height);
    }

    public View p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0707R.layout.playlist_all_songs_activity, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C0707R.id.toolbar_wrapper);
        c c2 = l70.c(this.b, frameLayout);
        this.q = c2;
        d.d(c2.getView(), this.b);
        frameLayout.addView(this.q.getView(), 0);
        ToolbarManager toolbarManager = new ToolbarManager(this.b, this.q, this.p);
        toolbarManager.h(true);
        toolbarManager.g(true);
        toolbarManager.o(0.0f);
        com.spotify.android.goldenpath.a.b(this.b);
        this.t = (AppBarLayout) inflate.findViewById(C0707R.id.content).findViewById(C0707R.id.header_view);
        this.t.setPadding(0, nud.l(this.b, C0707R.attr.actionBarSize) + com.spotify.android.goldenpath.a.f(this.b), 0, 0);
        v16 b2 = this.o.b(this.b, this.t);
        this.y = b2;
        b2.E2().setOnClickListener(new t16(this));
        View view = this.y.getView();
        this.t.addView(view);
        this.t.a(new u16(this, view, toolbarManager));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0707R.id.recycler_view);
        this.u = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.b));
        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) inflate.findViewById(C0707R.id.recycler_view_fast_scroll);
        recyclerViewFastScroller.setVerticalScrollBarEnabled(true);
        recyclerViewFastScroller.setRecyclerView(this.u);
        recyclerViewFastScroller.setEnabled(true);
        this.u.setVerticalScrollBarEnabled(false);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(C0707R.id.container);
        View inflate2 = layoutInflater.inflate(C0707R.layout.playlist_all_songs_transition_view, viewGroup2, false);
        this.r = inflate2;
        inflate2.setVisibility(8);
        viewGroup2.addView(this.r);
        this.v = new twd(false);
        ia0 d = e90.e().d(this.b, null);
        d.setTitle(this.b.getString(C0707R.string.free_tier_section_header_you_added));
        this.v.Z(new v02(d.getView(), true), 0);
        ia0 d2 = e90.e().d(this.b, null);
        d2.setTitle(this.b.getString(C0707R.string.free_tier_section_header_includes));
        this.v.Z(new v02(d2.getView(), true), 1);
        u06 a2 = this.f.a(this, this, this.n);
        this.w = a2;
        this.v.Z(a2, Integer.MIN_VALUE);
        ia0 d3 = e90.e().d(this.b, null);
        d3.setTitle(this.b.getString(C0707R.string.free_tier_section_header_we_added));
        this.v.Z(new v02(d3.getView(), true), 2);
        u06 a3 = this.f.a(this, this, null);
        this.x = a3;
        a3.Z(false);
        this.x.Y(true);
        this.v.Z(this.x, Integer.MIN_VALUE);
        this.v.i0(0, 1, 2);
        gb0 a4 = e90.c().a(this.b, this.u);
        this.s = a4;
        a4.getTitleView().setSingleLine(false);
        this.s.getTitleView().setEllipsize(null);
        this.s.getSubtitleView().setVisibility(8);
        this.v.Z(new v02(this.s.getView(), false), 3);
        this.v.i0(3);
        this.c.n(this);
        return inflate;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.spotify.mobile.android.ui.contextmenu.b4
    public r3 p0(t06 t06) {
        return this.c.k(t06);
    }

    public void q(boolean z) {
        this.w.Y(z);
    }

    public void r(boolean z) {
        this.w.Z(z);
    }

    public void s(String str) {
        this.a.l(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).o(rwd.h(new ImageView(this.b), new b()));
    }

    public void t(List<l> list) {
        this.w.b0(list);
        if (this.u.getAdapter() == null) {
            this.u.setAdapter(this.v);
        }
    }

    public void u(String str) {
        this.y.setTitle(str);
        this.q.setTitle(str);
    }

    public void v(boolean z) {
        this.w.c0(z);
        this.x.c0(z);
    }

    public void w(List<l> list) {
        this.x.b0(list);
        if (this.u.getAdapter() == null) {
            this.u.setAdapter(this.v);
        }
    }

    public void x(ItemConfiguration.AddedBy addedBy) {
        this.w.f0(addedBy);
        this.x.f0(addedBy);
    }

    public void y(boolean z) {
        this.y.F2(z);
    }

    public void z(boolean z) {
        this.s.setTitle(this.b.getString(C0707R.string.playlist_all_songs_empty_view_title_with_episodes));
        if (z) {
            this.v.l0(3);
        } else {
            this.v.i0(3);
        }
    }
}
