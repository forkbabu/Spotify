package com.spotify.music.features.tasteonboarding.artistsearch.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView;
import com.spotify.music.libs.search.view.l;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import java.util.List;

public class ArtistSearchFragment extends LifecycleListenableFragment implements hp8, c.a, s, mfd, uq8, ws2 {
    gp8 h0;
    bp8 i0;
    private hr8 j0;
    private RecyclerView k0;
    private kb0 l0;
    private final l.b m0 = new a();

    class a implements l.b {
        a() {
        }

        @Override // com.spotify.music.libs.search.view.l.b
        public void L(boolean z) {
        }

        @Override // com.spotify.music.libs.search.view.l.b
        public void f(String str) {
            ArtistSearchFragment.this.h0.f(str);
        }

        @Override // com.spotify.music.libs.search.view.l.b
        public void n() {
            ArtistSearchFragment.this.h0.u(null);
        }

        @Override // com.spotify.music.libs.search.view.l.b
        public void r(String str) {
            ArtistSearchFragment.this.h0.r(str);
        }
    }

    class b extends com.spotify.mobile.android.spotlets.common.recyclerview.a {
        b() {
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.spotlets.common.recyclerview.a
        public boolean e() {
            return ArtistSearchFragment.this.h0.w();
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.spotlets.common.recyclerview.a
        public int f() {
            return 6;
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.spotlets.common.recyclerview.a
        public void g(int i, int i2) {
            ArtistSearchFragment.this.h0.s(i, i2);
        }
    }

    private void K4(kb0 kb0, int i) {
        kb0.getSubtitleView().setText(i);
    }

    private void L4() {
        this.k0.setVisibility(8);
        this.l0.getView().setVisibility(0);
    }

    private void M4(kb0 kb0) {
        kb0.getSubtitleView().setVisibility(0);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // defpackage.hp8
    public void E() {
        this.l0.getTitleView().setText(C0707R.string.free_tier_taste_onboarding_error_view_general_title);
        K4(this.l0, C0707R.string.free_tier_taste_onboarding_error_view_general_subtitle);
        M4(this.l0);
        L4();
    }

    @Override // defpackage.hp8
    public void G0(String str) {
        this.l0.getTitleView().setText(W2(C0707R.string.free_tier_taste_onboarding_search_empty_state_no_result_title, str));
        K4(this.l0, C0707R.string.free_tier_taste_onboarding_search_empty_state_no_result_body);
        M4(this.l0);
        L4();
    }

    @Override // defpackage.uq8
    public List<String> K1() {
        return ImmutableList.of("search_field");
    }

    @Override // defpackage.hp8
    public void O() {
        InputMethodManager inputMethodManager;
        View currentFocus = j4().getCurrentFocus();
        if (currentFocus != null && (inputMethodManager = (InputMethodManager) l4().getSystemService("input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.h0.t(this);
        this.j0.g(this.m0);
        this.j0.l(250);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.j0.q(this.m0);
        this.h0.a();
    }

    @Override // defpackage.uq8
    public View W(String str) {
        hr8 hr8;
        if (!"search_field".equals(str) || (hr8 = this.j0) == null) {
            return null;
        }
        return hr8.z().findViewById(C0707R.id.search_toolbar);
    }

    @Override // defpackage.ws2
    public boolean b() {
        this.h0.b();
        return true;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.FREETIER_TASTEONBOARDING_ARTISTSEARCH;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.S;
    }

    @Override // defpackage.uq8
    public boolean h0(String str) {
        return "search_field".equals(str);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return kfd.k0.getName();
    }

    @Override // defpackage.hp8
    public void i1(List<TasteOnboardingItem> list, boolean z) {
        if (z) {
            bp8 bp8 = this.i0;
            int i = ImmutableList.a;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            builder.addAll((Iterable) this.i0.b0());
            builder.addAll((Iterable) list);
            bp8.f0(builder.build());
        } else {
            this.i0.f0(list);
        }
        this.i0.z();
    }

    @Override // defpackage.hp8
    public void m1() {
        this.l0.getView().setVisibility(8);
        this.k0.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.hp8
    public void s2() {
        kb0 kb0 = this.l0;
        kb0.getTitleView().setText(V2(C0707R.string.free_tier_taste_onboarding_error_view_no_internet_connection));
        K4(this.l0, C0707R.string.free_tier_taste_onboarding_error_view_go_online_and_try_again);
        M4(this.l0);
        L4();
    }

    @Override // defpackage.hp8
    public void t0() {
        this.l0.getTitleView().setText(C0707R.string.free_tier_taste_onboarding_search_empty_state_no_query_title);
        this.l0.getSubtitleView().setVisibility(4);
        L4();
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.FREETIER_TASTEONBOARDING_ARTISTSEARCH, ViewUris.S.toString());
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_free_tier_taste_onboarding_search_artist_sthlm_blk, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0707R.id.container);
        Context l4 = l4();
        hr8 hr8 = new hr8(l4, (ToolbarSearchFieldView) linearLayout.findViewById(C0707R.id.search_toolbar));
        this.j0 = hr8;
        hr8.A();
        this.j0.u(new a(this));
        this.k0 = new RecyclerView(l4, null);
        this.i0.k0(new b(this));
        this.k0.setLayoutManager(new LinearLayoutManager(1, false));
        this.k0.setAdapter(this.i0);
        this.k0.n(new b());
        linearLayout.addView(this.k0);
        nb0 b2 = pb0.b(l4, linearLayout);
        this.l0 = b2;
        linearLayout.addView(b2.getView());
        kb0 kb0 = this.l0;
        kb0.getView().setBackgroundColor(0);
        kb0.getTitleView().setTextSize(2, 24.0f);
        int f = nud.f((float) 16, R2());
        View view = kb0.getView();
        view.setPadding(f, view.getPaddingTop(), f, view.getPaddingBottom());
        t0();
        return inflate;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.k0;
    }
}
