package com.spotify.music.features.hiddencontent;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.spotify.android.glue.components.toolbar.e;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.header.headers.GlueHeaderView;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.music.features.hiddencontent.model.BansResponse;
import com.spotify.music.features.hiddencontent.model.d;
import com.spotify.music.features.hiddencontent.presenter.HiddenContentFragmentPresenter;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.playlist.models.o;
import defpackage.ef5;
import defpackage.ff5;
import java.util.Collection;

public class HiddenContentFragment extends LifecycleListenableFragment implements NavigationItem, s, c.a, mfd, lf5, ToolbarConfig.d, ff5.a, ef5.b {
    HiddenContentFragmentPresenter h0;
    ff5 i0;
    ef5 j0;
    b42 k0;
    u22 l0;
    private RecyclerView m0;
    private LoadingView n0;
    private LinearLayout o0;
    private LinearLayout p0;
    private TextView q0;
    private TextView r0;
    private Parcelable s0;
    private RecyclerView.e<RecyclerView.b0> t0;
    private RecyclerView.e<RecyclerView.b0> u0;
    private final b4<com.spotify.music.features.hiddencontent.model.c> v0 = new a();
    private final b4<d> w0 = new b();

    class a implements b4<com.spotify.music.features.hiddencontent.model.c> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.spotify.mobile.android.ui.contextmenu.b4
        public r3 p0(com.spotify.music.features.hiddencontent.model.c cVar) {
            HiddenContentFragment hiddenContentFragment = HiddenContentFragment.this;
            return hiddenContentFragment.h0.f(cVar, hiddenContentFragment.l0);
        }
    }

    class b implements b4<d> {
        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.spotify.mobile.android.ui.contextmenu.b4
        public r3 p0(d dVar) {
            HiddenContentFragment hiddenContentFragment = HiddenContentFragment.this;
            return hiddenContentFragment.h0.g(dVar, hiddenContentFragment.k0);
        }
    }

    private v02 P4(String str) {
        gb0 a2 = e90.c().a(F2(), this.m0);
        a2.setSubtitle(str);
        return new v02(a2.getView(), false);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.h0.o();
    }

    public void K4() {
        this.p0.setSelected(false);
        this.o0.setSelected(true);
        this.m0.setAdapter(this.u0);
    }

    public void L4() {
        this.p0.setSelected(true);
        this.o0.setSelected(false);
        this.m0.setAdapter(this.t0);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.h0.n();
    }

    public b4<com.spotify.music.features.hiddencontent.model.c> M4() {
        return this.v0;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        super.N3(bundle);
        this.h0.h(bundle);
        RecyclerView recyclerView = this.m0;
        if (recyclerView != null) {
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            layoutManager.getClass();
            bundle.putParcelable("list", layoutManager.i1());
        }
    }

    public b4<d> N4() {
        return this.w0;
    }

    public void O4() {
        if (this.n0.p()) {
            this.n0.n();
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        super.Q3(view, bundle);
        this.h0.l(bundle);
        if (bundle != null) {
            this.s0 = bundle.getParcelable("list");
        }
    }

    public /* synthetic */ void Q4(Parcelable parcelable) {
        RecyclerView.m layoutManager = this.m0.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.h1(parcelable);
        }
    }

    public void R4(String str, int i) {
        this.h0.e(str, i);
    }

    public void S4(BansResponse bansResponse) {
        ImmutableList copyOf = ImmutableList.copyOf((Collection) bansResponse.getTracks());
        this.r0.setText(String.valueOf(copyOf.size()));
        this.i0.Z(copyOf);
        this.t0 = this.i0;
        ImmutableList list = FluentIterable.from(bansResponse.getArtists()).transform(e.a).toList();
        this.q0.setText(String.valueOf(list.size()));
        this.j0.Y(list);
        this.u0 = this.j0;
        Parcelable parcelable = this.s0;
        if (parcelable != null) {
            this.m0.post(new a(this, parcelable));
            this.s0 = null;
        }
    }

    public void T4(o oVar, int i) {
        this.h0.j(oVar, i);
    }

    public void U4(o oVar, int i) {
        this.h0.k(oVar, i);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.YOURLIBRARY_HIDDEN_CONTENT;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.y1;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "android-feature-hidden-content";
    }

    @Override // com.spotify.music.navigation.NavigationItem
    public NavigationItem.NavigationGroup k0() {
        return NavigationItem.NavigationGroup.HOME;
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.YOURLIBRARY_HIDDEN_CONTENT, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context l4 = l4();
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(l4).inflate(C0707R.layout.fragment_hidden_content_header_with_list, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(C0707R.id.recycler_view);
        this.m0 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        GlueHeaderLayout glueHeaderLayout = (GlueHeaderLayout) viewGroup2.findViewById(C0707R.id.glue_header_layout);
        GlueHeaderView glueHeaderView = (GlueHeaderView) viewGroup2.findViewById(C0707R.id.header_view);
        com.spotify.android.glue.components.toolbar.c c = l70.c(l4, viewGroup);
        glueHeaderView.setGlueToolbar(c);
        ub0 a2 = tb0.a(glueHeaderView);
        a2.setTitle(V2(C0707R.string.hidden_content_title_bans_only));
        ((e) c).setTitle(V2(C0707R.string.hidden_content_title_bans_only));
        rc0.a(glueHeaderView, a2);
        ViewGroup viewGroup3 = (ViewGroup) LayoutInflater.from(F2()).inflate(C0707R.layout.hidden_content_tabs, (ViewGroup) glueHeaderLayout, false);
        LinearLayout linearLayout = (LinearLayout) viewGroup3.findViewById(C0707R.id.tab_artists);
        this.o0 = linearLayout;
        linearLayout.setOnClickListener(new c(this));
        TextView textView = (TextView) viewGroup3.findViewById(C0707R.id.tab_artists_count);
        this.q0 = textView;
        textView.setText(Ad.DEFAULT_SKIPPABLE_AD_DELAY);
        LinearLayout linearLayout2 = (LinearLayout) viewGroup3.findViewById(C0707R.id.tab_songs);
        this.p0 = linearLayout2;
        linearLayout2.setOnClickListener(new b(this));
        TextView textView2 = (TextView) viewGroup3.findViewById(C0707R.id.tab_songs_count);
        this.r0 = textView2;
        textView2.setText(Ad.DEFAULT_SKIPPABLE_AD_DELAY);
        glueHeaderLayout.F(viewGroup3, true);
        LoadingView m = LoadingView.m(layoutInflater, B2(), glueHeaderLayout);
        this.n0 = m;
        viewGroup2.addView(m);
        this.n0.r();
        glueHeaderLayout.setVisibility(4);
        this.t0 = this.i0;
        this.u0 = this.j0;
        P4("");
        P4("");
        return viewGroup2;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.p0;
    }
}
