package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.common.base.Optional;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.libs.glue.custom.playbutton.c;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.g;
import com.spotify.music.features.playlistentity.header.m0;
import com.spotify.music.features.playlistentity.t;
import com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: rq6  reason: default package */
public final class rq6 implements m0 {
    private final a a = new a();
    private final oq6 b;
    private com.spotify.libs.glue.custom.playbutton.c c;
    private Optional<Boolean> f;
    private AppBarLayout n;
    private nq6 o;
    private RecyclerView p;
    private TextView q;
    private u r;
    private CoordinatorLayout s;
    private final io.reactivex.a t;
    private final Activity u;
    private final c.a v;
    private final g w;

    /* renamed from: rq6$a */
    private static final class a extends RecyclerView.l {
        private int a;

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
            h.e(rect, "outRect");
            h.e(view, "view");
            h.e(recyclerView, "parent");
            h.e(yVar, "state");
            if (recyclerView.Z(view) == 0) {
                rect.top = this.a;
            }
        }

        public final void m(int i) {
            this.a = i;
        }
    }

    /* renamed from: rq6$b */
    static final class b implements Runnable {
        final /* synthetic */ rq6 a;
        final /* synthetic */ int b;

        /* renamed from: rq6$b$a */
        static final class a implements Runnable {
            final /* synthetic */ b a;

            a(b bVar) {
                this.a = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AppBarLayout appBarLayout = this.a.a.n;
                if (appBarLayout != null) {
                    appBarLayout.i(false, false);
                }
                RecyclerView.m layoutManager = rq6.y(this.a.a).getLayoutManager();
                int i = this.a.b;
                if (i > -1 && layoutManager != null) {
                    layoutManager.v1(i);
                }
            }
        }

        b(rq6 rq6, int i) {
            this.a = rq6;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            rq6.z(this.a).post(new a(this));
        }
    }

    /* renamed from: rq6$c */
    static final class c implements View.OnClickListener {
        final /* synthetic */ rq6 a;
        final /* synthetic */ com.spotify.android.glue.components.toolbar.d b;

        c(rq6 rq6, com.spotify.android.glue.components.toolbar.d dVar) {
            this.a = rq6;
            this.b = dVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.b.h();
        }
    }

    /* renamed from: rq6$d */
    static final class d implements AppBarLayout.c {
        final /* synthetic */ rq6 a;
        final /* synthetic */ com.spotify.android.glue.components.toolbar.d b;

        d(CoordinatorLayout coordinatorLayout, rq6 rq6, com.spotify.android.glue.components.toolbar.d dVar) {
            this.a = rq6;
            this.b = dVar;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            float f = (float) abs;
            View view = rq6.k(this.a).getView();
            h.d(view, "contentViewBinder.view");
            float height = f / ((float) view.getHeight());
            rq6.k(this.a).e0(abs, height);
            View view2 = rq6.k(this.a).getView();
            h.d(view2, "contentViewBinder.view");
            view2.setTranslationY(f);
            rq6.A(this.a).o(height);
        }
    }

    public rq6(Activity activity, pq6 pq6, c.a aVar, g gVar) {
        h.e(activity, "context");
        h.e(pq6, "presenterFactory");
        h.e(aVar, "playButtonFactory");
        h.e(gVar, "configuration");
        this.u = activity;
        this.v = aVar;
        this.w = gVar;
        oq6 b2 = pq6.b(gVar);
        h.d(b2, "presenterFactory.create(configuration)");
        this.b = b2;
        this.f = Optional.absent();
        this.t = b2.g();
    }

    public static final /* synthetic */ u A(rq6 rq6) {
        u uVar = rq6.r;
        if (uVar != null) {
            return uVar;
        }
        h.k("toolbarUpdater");
        throw null;
    }

    public static final /* synthetic */ nq6 k(rq6 rq6) {
        nq6 nq6 = rq6.o;
        if (nq6 != null) {
            return nq6;
        }
        h.k("contentViewBinder");
        throw null;
    }

    public static final /* synthetic */ RecyclerView y(rq6 rq6) {
        RecyclerView recyclerView = rq6.p;
        if (recyclerView != null) {
            return recyclerView;
        }
        h.k("recyclerView");
        throw null;
    }

    public static final /* synthetic */ CoordinatorLayout z(rq6 rq6) {
        CoordinatorLayout coordinatorLayout = rq6.s;
        if (coordinatorLayout != null) {
            return coordinatorLayout;
        }
        h.k("rootCoordinatorView");
        throw null;
    }

    public final void B(int i) {
        RecyclerView recyclerView = this.p;
        if (recyclerView != null) {
            recyclerView.post(new b(this, i));
        } else {
            h.k("recyclerView");
            throw null;
        }
    }

    public final void C(boolean z) {
        AppBarLayout appBarLayout = this.n;
        if (appBarLayout != null) {
            appBarLayout.i(z, false);
        } else {
            this.f = Optional.of(Boolean.valueOf(z));
        }
    }

    public final boolean D() {
        AppBarLayout appBarLayout = this.n;
        return appBarLayout != null && appBarLayout.getHeight() - appBarLayout.getBottom() == 0;
    }

    public final void E() {
        mc0 a2 = lc0.a(new ColorDrawable(androidx.core.content.a.b(this.u, C0707R.color.premium_mini_header_background_color)), new kc0(this.u));
        h.d(a2, "GlueCompositeDrawables.c…awable(context)\n        )");
        AppBarLayout appBarLayout = this.n;
        if (appBarLayout != null) {
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            appBarLayout.setBackground(a2);
        }
    }

    public final void F(boolean z) {
        com.spotify.libs.glue.custom.playbutton.c cVar = this.c;
        if (cVar != null) {
            h.c(cVar);
            cVar.a(z);
        }
    }

    public final void G(boolean z) {
        com.spotify.libs.glue.custom.playbutton.c cVar = this.c;
        if (cVar != null) {
            h.c(cVar);
            cVar.b(z);
        }
    }

    public final void H(int i, long j, long j2) {
        String str;
        CoordinatorLayout coordinatorLayout = this.s;
        if (coordinatorLayout != null) {
            Resources resources = coordinatorLayout.getResources();
            if (j > 0) {
                str = resources.getString(C0707R.string.premium_mini_playlist_subtitle_duration_hour_min, Long.valueOf(j), Long.valueOf(j2));
                h.d(str, "resources.getString(\n   …tionMinutes\n            )");
            } else {
                str = resources.getString(C0707R.string.premium_mini_playlist_subtitle_duration_min, Long.valueOf(j2));
                h.d(str, "resources.getString(\n   …tionMinutes\n            )");
            }
            String quantityString = resources.getQuantityString(C0707R.plurals.premium_mini_playlist_subtitle, i, Integer.valueOf(i), str);
            h.d(quantityString, "resources.getQuantityStr…s, durationText\n        )");
            TextView textView = this.q;
            if (textView != null) {
                textView.setText(quantityString);
            } else {
                h.k("subtitleText");
                throw null;
            }
        } else {
            h.k("rootCoordinatorView");
            throw null;
        }
    }

    public final void I(String str) {
        h.e(str, "title");
        nq6 nq6 = this.o;
        if (nq6 != null) {
            nq6.E2().setText(str);
            u uVar = this.r;
            if (uVar != null) {
                uVar.setTitle(str);
            } else {
                h.k("toolbarUpdater");
                throw null;
            }
        } else {
            h.k("contentViewBinder");
            throw null;
        }
    }

    @Override // defpackage.ar6
    public b66 b() {
        return this.w.b();
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void c(Bundle bundle) {
        h.e(bundle, "outState");
        this.b.j(bundle);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void d(Bundle bundle) {
        this.b.i(bundle);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void f() {
        this.b.f(null);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public io.reactivex.a g() {
        return this.t;
    }

    @Override // com.spotify.music.features.playlistentity.header.m0
    public RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.p;
        if (recyclerView != null) {
            return recyclerView;
        }
        h.k("recyclerView");
        throw null;
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void h() {
        this.b.f(this);
    }

    @Override // defpackage.ar6
    public boolean i() {
        return true;
    }

    @Override // defpackage.ar6
    public boolean j() {
        return false;
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void l(t.b bVar) {
        h.e(bVar, "dependencies");
        this.b.k(bVar);
    }

    @Override // com.spotify.music.features.playlistentity.header.m0
    public List<View> o(LayoutInflater layoutInflater, ViewGroup viewGroup, com.spotify.android.glue.components.toolbar.d dVar) {
        h.e(layoutInflater, "inflater");
        h.e(dVar, "glueToolbarContainer");
        View inflate = layoutInflater.inflate(C0707R.layout.premium_mini_playlist_header, viewGroup, false);
        if (inflate != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
            this.s = coordinatorLayout;
            View findViewById = coordinatorLayout.findViewById(C0707R.id.recycler_view);
            h.d(findViewById, "findViewById(R.id.recycler_view)");
            this.p = (RecyclerView) findViewById;
            this.n = (AppBarLayout) coordinatorLayout.findViewById(C0707R.id.header_view);
            FrameLayout frameLayout = (FrameLayout) coordinatorLayout.findViewById(C0707R.id.accessory_container);
            View findViewById2 = coordinatorLayout.findViewById(C0707R.id.subtitle_text_view);
            h.d(findViewById2, "findViewById(R.id.subtitle_text_view)");
            this.q = (TextView) findViewById2;
            RecyclerView recyclerView = this.p;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(coordinatorLayout.getContext()));
                RecyclerView recyclerView2 = this.p;
                if (recyclerView2 != null) {
                    recyclerView2.k(this.a, -1);
                    if (this.w.a()) {
                        View findViewById3 = coordinatorLayout.findViewById(C0707R.id.recycler_view_fast_scroll);
                        h.d(findViewById3, "findViewById(R.id.recycler_view_fast_scroll)");
                        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) findViewById3;
                        recyclerViewFastScroller.setVerticalScrollBarEnabled(true);
                        RecyclerView recyclerView3 = this.p;
                        if (recyclerView3 != null) {
                            recyclerViewFastScroller.setRecyclerView(recyclerView3);
                            recyclerViewFastScroller.setEnabled(true);
                            RecyclerView recyclerView4 = this.p;
                            if (recyclerView4 != null) {
                                recyclerView4.setVerticalScrollBarEnabled(false);
                            } else {
                                h.k("recyclerView");
                                throw null;
                            }
                        } else {
                            h.k("recyclerView");
                            throw null;
                        }
                    }
                    com.spotify.android.goldenpath.a.b(coordinatorLayout.getContext());
                    u R = dVar.R();
                    h.d(R, "glueToolbarContainer.toolbarUpdater");
                    this.r = R;
                    if (this.w.d()) {
                        com.spotify.libs.glue.custom.playbutton.c a2 = this.v.a(coordinatorLayout.getContext());
                        h.d(a2, "playButtonFactory.createRoundPlayButton(context)");
                        a2.setOnClickListener(new c(this, dVar));
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 8388629;
                        frameLayout.addView(a2.getView(), layoutParams);
                        this.c = a2;
                    }
                    float f2 = (float) 6;
                    AppBarLayout appBarLayout = this.n;
                    if (appBarLayout != null) {
                        appBarLayout.setPadding(0, nud.l(this.u, C0707R.attr.actionBarSize) + com.spotify.android.goldenpath.a.f(this.u), 0, nud.q(((float) 24) + f2, this.u.getResources()));
                    }
                    AppBarLayout appBarLayout2 = this.n;
                    if (appBarLayout2 != null) {
                        appBarLayout2.setClipToPadding(false);
                    }
                    this.a.m(nud.q(((float) 24) + f2, this.u.getResources()));
                    AppBarLayout appBarLayout3 = this.n;
                    if (appBarLayout3 != null) {
                        Context context = coordinatorLayout.getContext();
                        h.d(context, "context");
                        nq6 nq6 = new nq6(context, appBarLayout3);
                        this.o = nq6;
                        appBarLayout3.addView(nq6.getView());
                        appBarLayout3.a(new d(coordinatorLayout, this, dVar));
                        Optional<Boolean> optional = this.f;
                        h.d(optional, "restoredHeaderExpandedState");
                        if (optional.isPresent()) {
                            Boolean bool = this.f.get();
                            h.d(bool, "restoredHeaderExpandedState.get()");
                            appBarLayout3.i(bool.booleanValue(), false);
                            this.f = Optional.absent();
                        }
                    }
                    return kotlin.collections.d.t(coordinatorLayout);
                }
                h.k("recyclerView");
                throw null;
            }
            h.k("recyclerView");
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout");
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void onStop() {
        this.b.l();
    }
}
