package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.common.base.Optional;
import com.spotify.android.glue.components.toolbar.d;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.libs.glue.custom.playbutton.c;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.g;
import com.spotify.music.features.playlistentity.t;
import com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller;
import java.util.Collections;
import java.util.List;

/* renamed from: sl6  reason: default package */
public class sl6 implements rl6 {
    private final ol6 a;
    private final g b;
    private final Context c;
    private final c.a f;
    private RecyclerView n;
    private c o;
    private u p;
    private CoordinatorLayout q;
    private AppBarLayout r;
    private ViewGroup s;
    private Optional<Boolean> t = Optional.absent();
    private nl6 u;
    private final b v = new b(null);

    /* access modifiers changed from: private */
    /* renamed from: sl6$b */
    public static final class b extends RecyclerView.l {
        private int a;

        b(a aVar) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
            if (recyclerView.Z(view) == 0) {
                rect.top = this.a;
            }
        }

        public void m(int i) {
            this.a = i;
        }
    }

    public sl6(Context context, pl6 pl6, c.a aVar, g gVar) {
        this.a = pl6.b(gVar);
        this.f = aVar;
        this.b = gVar;
        this.c = context;
    }

    private void k(boolean z) {
        int l = nud.l(this.c, C0707R.attr.actionBarSize) + com.spotify.android.goldenpath.a.f(this.c);
        int i = 0;
        if (z) {
            float f2 = (float) ((this.b.b().d() ? 6 : 0) + 24);
            this.r.setPadding(0, l, 0, nud.q(f2, this.c.getResources()));
            this.r.setClipToPadding(false);
            this.v.m(nud.q(f2, this.c.getResources()));
        } else {
            this.r.setPadding(0, l, 0, 0);
            this.v.m(0);
        }
        ViewGroup viewGroup = this.s;
        if (!z) {
            i = 8;
        }
        viewGroup.setVisibility(i);
    }

    public /* synthetic */ void A(int i) {
        this.r.i(false, false);
        RecyclerView.m layoutManager = this.n.getLayoutManager();
        if (i > -1 && layoutManager != null) {
            layoutManager.v1(i);
        }
    }

    public void B(boolean z) {
        AppBarLayout appBarLayout = this.r;
        if (appBarLayout != null) {
            appBarLayout.i(z, false);
        } else {
            this.t = Optional.of(Boolean.valueOf(z));
        }
    }

    public boolean C() {
        AppBarLayout appBarLayout = this.r;
        if (appBarLayout == null || appBarLayout.getHeight() - this.r.getBottom() != 0) {
            return false;
        }
        return true;
    }

    public void D() {
        mc0 a2 = lc0.a(new ColorDrawable(androidx.core.content.a.b(this.c, C0707R.color.header_background_color)), new kc0(this.c));
        AppBarLayout appBarLayout = this.r;
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        appBarLayout.setBackground(a2);
    }

    public void E(boolean z) {
        c cVar = this.o;
        if (cVar != null) {
            cVar.a(z);
        }
    }

    public void F(boolean z) {
        c cVar = this.o;
        if (cVar != null) {
            cVar.b(z);
        }
    }

    public void G(boolean z) {
        boolean z2 = true;
        boolean z3 = z && this.o != null;
        if (this.s.getVisibility() != 0) {
            z2 = false;
        }
        if (z3 != z2) {
            k(z3);
        }
    }

    public void H(String str) {
        this.u.setTitle(str);
        this.p.setTitle(str);
    }

    @Override // defpackage.ar6
    public b66 b() {
        return this.b.b();
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void c(Bundle bundle) {
        this.a.i(bundle);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void d(Bundle bundle) {
        this.a.h(bundle);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void f() {
        this.a.a(null);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public io.reactivex.a g() {
        return this.a.b();
    }

    @Override // com.spotify.music.features.playlistentity.header.m0
    public RecyclerView getRecyclerView() {
        return this.n;
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void h() {
        this.a.a(this);
    }

    @Override // defpackage.ar6
    public boolean i() {
        return true;
    }

    @Override // defpackage.ar6
    public boolean j() {
        return x.f(this.c) && !this.c.getResources().getBoolean(C0707R.bool.showPlayButtonInHeader);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void l(t.b bVar) {
        this.a.j(bVar);
    }

    @Override // com.spotify.music.features.playlistentity.header.m0
    public List<View> o(LayoutInflater layoutInflater, ViewGroup viewGroup, d dVar) {
        c cVar;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) layoutInflater.inflate(C0707R.layout.offline_user_mix_playlist_header, viewGroup, false);
        this.q = coordinatorLayout;
        this.n = (RecyclerView) coordinatorLayout.findViewById(C0707R.id.recycler_view);
        this.r = (AppBarLayout) this.q.findViewById(C0707R.id.header_view);
        this.s = (ViewGroup) this.q.findViewById(C0707R.id.accessory);
        this.n.setLayoutManager(new LinearLayoutManager(this.c));
        this.n.k(this.v, -1);
        if (this.b.a()) {
            RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) this.q.findViewById(C0707R.id.recycler_view_fast_scroll);
            recyclerViewFastScroller.setVerticalScrollBarEnabled(true);
            recyclerViewFastScroller.setRecyclerView(this.n);
            recyclerViewFastScroller.setEnabled(true);
            this.n.setVerticalScrollBarEnabled(false);
        }
        com.spotify.android.goldenpath.a.b(this.c);
        this.p = dVar.R();
        boolean z = this.c.getResources().getBoolean(C0707R.bool.showPlayButtonInHeader);
        this.p.o(0.0f);
        if (!this.b.d() || !z) {
            k(false);
        } else {
            if (this.b.b().d()) {
                cVar = this.f.a(this.c);
            } else {
                cVar = this.f.b(com.spotify.android.paste.app.c.g().a(this.c));
            }
            cVar.setOnClickListener(new ll6(this));
            this.s.addView(cVar.getView());
            this.o = cVar;
            k(true);
        }
        nl6 nl6 = new nl6(this.c, this.r);
        this.u = nl6;
        View view = nl6.getView();
        this.r.addView(view);
        this.r.a(new kl6(this, view));
        if (this.t.isPresent()) {
            this.r.i(this.t.get().booleanValue(), false);
            this.t = Optional.absent();
        }
        return Collections.singletonList(this.q);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void onStop() {
        this.a.k();
    }

    public void u(int i) {
        this.n.post(new jl6(this, i));
    }

    public /* synthetic */ void w(int i) {
        this.q.post(new il6(this, i));
    }

    public /* synthetic */ void y(View view) {
        this.a.g();
    }

    public /* synthetic */ void z(View view, AppBarLayout appBarLayout, int i) {
        int abs = Math.abs(i);
        float f2 = (float) abs;
        float height = f2 / ((float) view.getHeight());
        this.u.e0(abs, height);
        this.u.getView().setTranslationY(f2);
        this.p.o(height);
    }
}
