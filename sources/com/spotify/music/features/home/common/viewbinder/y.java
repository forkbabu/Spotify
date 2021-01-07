package com.spotify.music.features.home.common.viewbinder;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.mobile.android.spotlets.common.recyclerview.FrameLayoutManager;
import com.spotify.music.C0707R;
import com.spotify.music.features.home.experimental.e;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.remoteconfig.AndroidFeatureHomeProperties;
import com.spotify.remoteconfig.j8;
import io.reactivex.s;

public class y extends v {
    private final Context a;
    private final e b;
    private final m c;
    private final cr9 d;
    private final j8 e;
    private final AndroidFeatureHomeProperties f;
    private final e60 g;
    private final r h;
    private FrameLayout i;
    private RecyclerView j;
    private RecyclerView k;
    private FrameLayout l;
    private View m;
    private ConstraintLayout n;
    private ConstraintLayout o;
    private TextView p;
    private CoordinatorLayout q;
    private LinearLayout r;
    private AppBarLayout s;
    private AppBarLayout.Behavior t;
    private AppBarLayout.c u;
    private xi5 v;

    /* access modifiers changed from: package-private */
    public class a extends AppBarLayout.Behavior.a {
        final /* synthetic */ boolean a;

        a(y yVar, boolean z) {
            this.a = z;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.a
        public boolean a(AppBarLayout appBarLayout) {
            return this.a;
        }
    }

    public y(Context context, e eVar, m mVar, cr9 cr9, j8 j8Var, AndroidFeatureHomeProperties androidFeatureHomeProperties, e60 e60, r rVar) {
        this.a = context;
        this.b = eVar;
        this.c = mVar;
        this.d = cr9;
        this.e = j8Var;
        this.f = androidFeatureHomeProperties;
        this.g = e60;
        this.h = rVar;
    }

    private void R() {
        boolean z = this.r.getChildCount() > 0;
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(C0707R.dimen.home_toolbar_margin_32dp);
        int dimensionPixelSize2 = this.a.getResources().getDimensionPixelSize(C0707R.dimen.home_toolbar_margin_12dp);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.o.getLayoutParams();
        if (this.p.getVisibility() == 0 && !TextUtils.isEmpty(this.p.getText())) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = dimensionPixelSize;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = dimensionPixelSize2;
        }
        if (this.p.getVisibility() == 8 && !z) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = dimensionPixelSize2;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
        }
        if (this.p.getVisibility() == 8 && z) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = dimensionPixelSize;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
        }
        this.o.setLayoutParams(layoutParams);
    }

    private void V(boolean z) {
        if (this.t == null) {
            this.t = new AppBarLayout.Behavior();
        }
        CoordinatorLayout.e eVar = (CoordinatorLayout.e) this.s.getLayoutParams();
        this.t.x(new a(this, z));
        eVar.j(this.t);
        this.s.setLayoutParams(eVar);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.r51
    public RecyclerView F() {
        return this.j;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.r51
    public RecyclerView G() {
        return this.k;
    }

    @Override // com.spotify.music.features.home.common.viewbinder.v
    public void I(View view) {
        view.setBackgroundColor(this.a.getResources().getColor(C0707R.color.pasteTransparent));
        view.setLayoutParams(new LinearLayout.LayoutParams(this.a.getResources().getDimensionPixelSize(C0707R.dimen.home_toolbar_icon_width), this.a.getResources().getDimensionPixelSize(C0707R.dimen.home_toolbar_icon_size)));
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(C0707R.dimen.home_toolbar_icon_padding);
        view.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        this.r.setVisibility(0);
        this.r.addView(view);
        R();
    }

    @Override // com.spotify.music.features.home.common.viewbinder.v
    public View J(ViewGroup viewGroup, PageLoaderView<s<b91>> pageLoaderView) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) LayoutInflater.from(this.a).inflate(C0707R.layout.home_layout_v2, viewGroup, false);
        this.q = coordinatorLayout;
        this.s = (AppBarLayout) q4.G(coordinatorLayout, C0707R.id.home_topbar_container);
        V(false);
        this.n = (ConstraintLayout) q4.G(this.q, C0707R.id.home_topbar_view);
        this.o = (ConstraintLayout) q4.G(this.q, C0707R.id.home_topbar_content);
        this.p = (TextView) q4.G(this.n, C0707R.id.home_topbar_title);
        this.r = (LinearLayout) q4.G(this.q, C0707R.id.home_icon_container);
        View G = q4.G(this.n, C0707R.id.home_status_bar_placeholder);
        if (com.spotify.android.goldenpath.a.g(this.a)) {
            G.getLayoutParams().height = com.spotify.android.goldenpath.a.f(this.a);
        } else {
            G.setVisibility(8);
        }
        FrameLayout frameLayout = (FrameLayout) q4.G(this.q, C0707R.id.home_content);
        this.i = frameLayout;
        frameLayout.addView(pageLoaderView);
        RecyclerView recyclerView = new RecyclerView(this.a, null);
        this.j = recyclerView;
        recyclerView.setId(C0707R.id.home_body);
        this.j.setOverScrollMode(2);
        this.j.setLayoutManager(this.c.create());
        this.j.setHasFixedSize(true);
        RecyclerView recyclerView2 = new RecyclerView(this.a, null);
        this.k = recyclerView2;
        recyclerView2.setId(C0707R.id.home_overlay);
        this.k.setLayoutManager(new FrameLayoutManager());
        this.k.setHasFixedSize(true);
        FrameLayout frameLayout2 = new FrameLayout(this.a);
        this.l = frameLayout2;
        frameLayout2.addView(this.j);
        this.l.addView(this.k);
        this.m = q4.G(this.q, C0707R.id.home_gradient_view);
        if (this.f.h()) {
            this.h.h(this.q);
            this.h.f(this.j);
            this.h.f(this.k);
        } else {
            this.b.o(true);
            this.b.g(this.j);
            this.b.g(this.k);
        }
        if (this.e.a()) {
            this.g.g(this.j);
        }
        k kVar = new k(this);
        this.u = kVar;
        this.s.a(kVar);
        this.m.setVisibility(0);
        q4.J(this.p, true);
        this.v = new xi5(this.q, this.j);
        return this.q;
    }

    @Override // com.spotify.music.features.home.common.viewbinder.v
    public View K() {
        return this.l;
    }

    @Override // com.spotify.music.features.home.common.viewbinder.v
    public void L() {
        M();
        this.v.c();
    }

    @Override // com.spotify.music.features.home.common.viewbinder.v
    public void M() {
        RecyclerView.m layoutManager;
        RecyclerView recyclerView = this.j;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            a0 a0Var = new a0(this.a);
            a0Var.m(0);
            a0Var.u(new i(this));
            layoutManager.J1(a0Var);
        }
    }

    @Override // com.spotify.music.features.home.common.viewbinder.v
    public void N(p81 p81) {
        this.d.a(this.m, p81.bundle("gradient"));
    }

    @Override // com.spotify.music.features.home.common.viewbinder.v
    public void O(String str) {
        if (str.isEmpty()) {
            this.p.setVisibility(8);
            this.p.setText("");
        } else {
            this.p.setVisibility(0);
            this.p.setText(str);
        }
        R();
    }

    @Override // com.spotify.music.features.home.common.viewbinder.v
    public void P() {
        ((CoordinatorLayout.e) this.i.getLayoutParams()).j(new AppBarLayout.ScrollingViewBehavior());
        this.i.requestLayout();
    }

    @Override // com.spotify.music.features.home.common.viewbinder.v
    public void Q() {
        this.v.e();
    }

    public /* synthetic */ void S(AppBarLayout appBarLayout, int i2) {
        int height = this.n.getHeight();
        this.m.setAlpha(((float) Math.abs(Math.abs(i2) - height)) / ((float) height));
    }

    public void T(q61 q61) {
        View e2 = q61.e(this.q);
        View findViewById = this.n.findViewById(C0707R.id.free_tier_home_hubs_header);
        if (e2 instanceof GlueHeaderViewV2) {
            if (findViewById == null) {
                this.p.setText((CharSequence) null);
                this.p.setVisibility(8);
                b bVar = new b();
                e2.setId(C0707R.id.free_tier_home_hubs_header);
                this.n.addView(e2, 0);
                bVar.i(this.n);
                bVar.r(this.o.getId()).d.o = -1;
                bVar.c(this.n);
                double abs = (double) Math.abs(this.s.getTop());
                double totalScrollRange = (double) this.s.getTotalScrollRange();
                Double.isNaN(totalScrollRange);
                Double.isNaN(totalScrollRange);
                Double.isNaN(totalScrollRange);
                Double.isNaN(totalScrollRange);
                if (abs > totalScrollRange * 0.4d) {
                    this.s.i(false, false);
                }
                this.s.a(null);
                this.m.setVisibility(8);
                V(true);
            }
        } else if (findViewById != null) {
            this.p.setVisibility(0);
            this.n.removeView(findViewById);
            b bVar2 = new b();
            bVar2.i(this.n);
            bVar2.l(this.o.getId(), 4, 0, 4);
            bVar2.c(this.n);
            this.s.a(this.u);
            this.m.setVisibility(0);
            V(false);
        }
    }

    public /* synthetic */ void U() {
        this.s.i(true, true);
    }

    @Override // defpackage.e61
    public View b() {
        return this.q;
    }

    @Override // defpackage.r51, defpackage.e61
    public void k(q61 q61) {
        q61.i(new j(this, q61));
    }
}
