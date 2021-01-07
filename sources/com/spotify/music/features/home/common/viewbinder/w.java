package com.spotify.music.features.home.common.viewbinder;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.header.behavior.GlueScrollingViewBehavior;
import com.spotify.android.glue.patterns.header.behavior.HeaderBehavior;
import com.spotify.android.glue.patterns.header.headers.a;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderV2Behavior;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.mobile.android.spotlets.common.recyclerview.FrameLayoutManager;
import com.spotify.music.C0707R;
import com.spotify.music.features.home.experimental.e;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.remoteconfig.AndroidFeatureHomeProperties;
import com.spotify.remoteconfig.j8;
import io.reactivex.s;

public class w extends v {
    private FrameLayout a;
    private GlueHeaderLayout b;
    private FadingHomeHeaderView c;
    private FrameLayout d;
    private RecyclerView e;
    private RecyclerView f;
    private FrameLayout g;
    private View h;
    private xi5 i;
    private final Context j;
    private final cr9 k;
    private final wlf<u> l;
    private final p m;
    private final e n;
    private final r o;
    private final m p;
    private final n q;
    private final FadingHomeHeaderViewBehavior r;
    private final GlueHeaderV2Behavior s;
    private final e60 t;
    private final j8 u;
    private final AndroidFeatureHomeProperties v;

    public w(Context context, p pVar, wlf<u> wlf, e eVar, r rVar, m mVar, cr9 cr9, n nVar, FadingHomeHeaderViewBehavior fadingHomeHeaderViewBehavior, GlueHeaderV2Behavior glueHeaderV2Behavior, e60 e60, j8 j8Var, AndroidFeatureHomeProperties androidFeatureHomeProperties) {
        this.j = context;
        this.m = pVar;
        this.n = eVar;
        this.o = rVar;
        this.p = mVar;
        this.q = nVar;
        this.l = wlf;
        this.k = cr9;
        this.r = fadingHomeHeaderViewBehavior;
        this.s = glueHeaderV2Behavior;
        this.t = e60;
        this.u = j8Var;
        this.v = androidFeatureHomeProperties;
    }

    private void T() {
        this.b.G(this.c, this.r, true);
        this.c.setScrollObserver(new h(this));
        this.h.setVisibility(0);
        this.b.setFakeActionBarWhenNoHeader(false);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.r51
    public RecyclerView F() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.r51
    public RecyclerView G() {
        return this.f;
    }

    @Override // com.spotify.music.features.home.common.viewbinder.v
    public void I(View view) {
    }

    @Override // com.spotify.music.features.home.common.viewbinder.v
    public View J(ViewGroup viewGroup, PageLoaderView<s<b91>> pageLoaderView) {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.j).inflate(C0707R.layout.home_layout, viewGroup, false);
        this.a = frameLayout;
        GlueHeaderLayout glueHeaderLayout = (GlueHeaderLayout) q4.G(frameLayout, C0707R.id.home_glue_header);
        this.b = glueHeaderLayout;
        this.h = q4.G(glueHeaderLayout, C0707R.id.home_gradient_view);
        this.c = (FadingHomeHeaderView) q4.G(this.b, C0707R.id.home_fading_header);
        FrameLayout frameLayout2 = (FrameLayout) q4.G(this.a, C0707R.id.home_content);
        this.d = frameLayout2;
        frameLayout2.addView(pageLoaderView);
        RecyclerView recyclerView = new RecyclerView(this.j, null);
        this.e = recyclerView;
        recyclerView.setId(C0707R.id.home_body);
        this.e.setOverScrollMode(2);
        this.e.setLayoutManager(this.p.create());
        this.e.setHasFixedSize(true);
        RecyclerView recyclerView2 = new RecyclerView(this.j, null);
        this.f = recyclerView2;
        recyclerView2.setId(C0707R.id.home_overlay);
        this.f.setLayoutManager(new FrameLayoutManager());
        this.f.setHasFixedSize(true);
        FrameLayout frameLayout3 = new FrameLayout(this.j);
        this.g = frameLayout3;
        frameLayout3.addView(this.e);
        this.g.addView(this.f);
        T();
        if (this.v.h()) {
            this.o.h(this.a);
            this.o.f(this.e);
            this.o.f(this.f);
        } else {
            this.n.o(true);
            this.n.g(this.e);
            this.n.g(this.f);
        }
        if (this.u.a()) {
            this.t.g(this.e);
        }
        this.i = new xi5(this.a, this.e);
        return this.a;
    }

    @Override // com.spotify.music.features.home.common.viewbinder.v
    public View K() {
        return this.g;
    }

    @Override // com.spotify.music.features.home.common.viewbinder.v
    public void L() {
        M();
        this.i.b();
    }

    @Override // com.spotify.music.features.home.common.viewbinder.v
    public void M() {
        n nVar = this.q;
        GlueHeaderLayout glueHeaderLayout = this.b;
        RecyclerView recyclerView = this.e;
        nVar.getClass();
        glueHeaderLayout.getClass();
        recyclerView.getClass();
        View C = glueHeaderLayout.C(false);
        C.getClass();
        a aVar = (a) C;
        HeaderBehavior headerBehavior = (HeaderBehavior) ((CoordinatorLayout.e) aVar.getView().getLayoutParams()).c();
        if (headerBehavior != null) {
            headerBehavior.v(glueHeaderLayout, aVar, true);
        }
        recyclerView.N0(0);
    }

    @Override // com.spotify.music.features.home.common.viewbinder.v
    public void N(p81 p81) {
        this.k.a(this.h, p81.bundle("gradient"));
    }

    @Override // com.spotify.music.features.home.common.viewbinder.v
    public void O(String str) {
    }

    @Override // com.spotify.music.features.home.common.viewbinder.v
    public void P() {
        ((CoordinatorLayout.e) this.d.getLayoutParams()).j(new GlueScrollingViewBehavior());
        this.d.requestLayout();
    }

    @Override // com.spotify.music.features.home.common.viewbinder.v
    public void Q() {
        this.i.d();
    }

    public void R(q61 q61) {
        View e2 = q61.e(this.b);
        if (!(e2 instanceof GlueHeaderViewV2)) {
            T();
            return;
        }
        this.b.G((GlueHeaderViewV2) e2, this.s, false);
        this.b.setToolbarUpdater(this.l.get());
        this.h.setVisibility(4);
        this.c.setScrollObserver(null);
    }

    public /* synthetic */ void S(float f2) {
        float f3 = 1.0f - f2;
        this.l.get().a(f3);
        this.h.setAlpha(f3);
    }

    @Override // defpackage.e61
    public View b() {
        return this.a;
    }

    @Override // defpackage.r51, defpackage.e61
    public Parcelable e() {
        p pVar = this.m;
        GlueHeaderLayout glueHeaderLayout = this.b;
        RecyclerView recyclerView = this.e;
        RecyclerView recyclerView2 = this.f;
        pVar.getClass();
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        layoutManager.getClass();
        Parcelable i1 = layoutManager.i1();
        RecyclerView.m layoutManager2 = recyclerView2.getLayoutManager();
        layoutManager2.getClass();
        Parcelable i12 = layoutManager2.i1();
        Parcelable onSaveInstanceState = glueHeaderLayout.onSaveInstanceState();
        boolean z = true;
        View C = glueHeaderLayout.C(true);
        if (C != null && C.getTop() == 0) {
            z = false;
        }
        return new m(i1, i12, onSaveInstanceState, z);
    }

    @Override // defpackage.r51, defpackage.e61
    public void f(Parcelable parcelable) {
        p pVar = this.m;
        GlueHeaderLayout glueHeaderLayout = this.b;
        RecyclerView recyclerView = this.e;
        RecyclerView recyclerView2 = this.f;
        pVar.getClass();
        if (parcelable instanceof m) {
            m mVar = (m) parcelable;
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            layoutManager.getClass();
            layoutManager.h1(mVar.a);
            RecyclerView.m layoutManager2 = recyclerView2.getLayoutManager();
            layoutManager2.getClass();
            layoutManager2.h1(mVar.b);
            Parcelable parcelable2 = mVar.c;
            if (parcelable2 != null) {
                glueHeaderLayout.onRestoreInstanceState(parcelable2);
            }
            if (mVar.f) {
                glueHeaderLayout.post(new b(glueHeaderLayout));
            }
        }
    }

    @Override // defpackage.r51, defpackage.e61
    public void k(q61 q61) {
        q61.i(new g(this, q61));
    }
}
