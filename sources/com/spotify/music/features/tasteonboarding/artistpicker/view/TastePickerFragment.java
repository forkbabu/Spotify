package com.spotify.music.features.tasteonboarding.artistpicker.view;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.a;
import androidx.fragment.app.Fragment;
import androidx.transition.ChangeBounds;
import androidx.transition.u;
import com.google.android.material.appbar.AppBarLayout;
import com.google.common.collect.ImmutableList;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.encore.foundation.R;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.features.tasteonboarding.artistpicker.rendertype.PickerViewType;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView;
import com.spotify.music.libs.search.view.l;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import defpackage.ql8;
import java.util.List;

public class TastePickerFragment extends LifecycleListenableFragment implements ql8, c.a, s, mfd, l.b, uq8 {
    ql8.a h0;
    xo8 i0;
    private ProgressBar j0;
    private kb0 k0;
    private CoordinatorLayout l0;
    private ViewGroup m0;
    private sl8 n0;
    private ConstraintLayout o0;
    private TextView p0;
    private TextView q0;
    private Button r0;
    private hr8 s0;
    private AppBarLayout t0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // defpackage.uq8
    public List<String> K1() {
        return ImmutableList.of("search_field");
    }

    public void K4() {
        ConstraintLayout constraintLayout = this.o0;
        b bVar = new b();
        bVar.i(constraintLayout);
        bVar.g(this.r0.getId(), 4);
        bVar.l(C0707R.id.done_button, 3, 0, 4);
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.c(C0707R.id.done_button);
        u.a(constraintLayout, changeBounds);
        bVar.c(constraintLayout);
    }

    @Override // com.spotify.music.libs.search.view.l.b
    public void L(boolean z) {
        if (z) {
            this.h0.i2();
        }
    }

    public void L4() {
        this.k0.getView().setVisibility(8);
        this.t0.setVisibility(0);
    }

    public void M4() {
        this.j0.setVisibility(8);
    }

    public void N4() {
        sl8 sl8 = this.n0;
        if (sl8 != null) {
            sl8.c();
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.s0.g(this);
    }

    public /* synthetic */ void O4(AppBarLayout appBarLayout, int i) {
        this.q0.setAlpha(Math.abs(((float) i) / ((float) appBarLayout.getTotalScrollRange())));
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.s0.q(this);
    }

    public void P4(String str) {
        this.r0.setText(str);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        this.h0.E(this);
        this.l0 = (CoordinatorLayout) view.findViewById(C0707R.id.root_view);
        this.m0 = (ViewGroup) view.findViewById(C0707R.id.picker_container);
        this.p0 = (TextView) view.findViewById(C0707R.id.title);
        this.r0 = (Button) view.findViewById(C0707R.id.done_button);
        this.q0 = (TextView) view.findViewById(C0707R.id.toolbar_title);
        this.o0 = (ConstraintLayout) view.findViewById(C0707R.id.done_button_container);
        ToolbarSearchFieldView toolbarSearchFieldView = (ToolbarSearchFieldView) m4().findViewById(C0707R.id.search_toolbar);
        this.s0 = new hr8(toolbarSearchFieldView.getContext(), toolbarSearchFieldView);
        ProgressBar progressBar = (ProgressBar) m4().findViewById(C0707R.id.loading_view);
        this.j0 = progressBar;
        progressBar.getIndeterminateDrawable().setColorFilter(a.b(this.j0.getContext(), R.color.white), PorterDuff.Mode.SRC_IN);
        nb0 b = pb0.b(this.l0.getContext(), this.l0);
        this.k0 = b;
        b.getView().setId(C0707R.id.empty_view);
        this.k0.getView().setVisibility(8);
        this.k0.getTitleView().setTextSize(2, 24.0f);
        this.k0.getTitleView().setTypeface(this.k0.getTitleView().getTypeface(), 1);
        this.k0.getView().setBackgroundColor(0);
        this.l0.addView(this.k0.getView());
        this.r0.setOnClickListener(new a(this));
        AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(C0707R.id.app_bar_layout);
        this.t0 = appBarLayout;
        appBarLayout.a(new b(this));
    }

    public void Q4(String str) {
        this.p0.setText(str);
        this.q0.setText(str);
    }

    public void R4() {
        ConstraintLayout constraintLayout = this.o0;
        b bVar = new b();
        bVar.i(constraintLayout);
        bVar.g(this.r0.getId(), 3);
        bVar.l(C0707R.id.done_button, 4, C0707R.id.done_button_start_guideline, 4);
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.c(C0707R.id.done_button);
        u.a(constraintLayout, changeBounds);
        bVar.c(constraintLayout);
    }

    public void S4(String str, String str2) {
        this.k0.setTitle(str);
        this.k0.setSubtitle(str2);
        this.k0.getView().setVisibility(0);
        this.t0.setVisibility(8);
    }

    public void T4(List<TasteOnboardingItem> list, PickerViewType pickerViewType, boolean z) {
        if (this.n0 == null) {
            sl8 a = this.i0.a(list, pickerViewType);
            this.n0 = a;
            this.m0.addView(a.getView());
        }
        this.n0.z();
        if (!z) {
            this.n0.i();
        }
        Bundle D2 = D2();
        TasteOnboardingItem tasteOnboardingItem = D2 != null ? (TasteOnboardingItem) D2.getParcelable("key_item_clicked_from_search") : null;
        if (tasteOnboardingItem != null) {
            this.n0.setItemClickedFromSearch(tasteOnboardingItem);
            D2.remove("key_item_clicked_from_search");
        }
    }

    @Override // defpackage.uq8
    public View W(String str) {
        hr8 hr8;
        if (!"search_field".equals(str) || (hr8 = this.s0) == null) {
            return null;
        }
        return hr8.z().findViewById(C0707R.id.search_toolbar);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.music.libs.search.view.l.b
    public void f(String str) {
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.FREETIER_TASTEONBOARDING_ARTISTPICKER;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.R;
    }

    @Override // defpackage.uq8
    public boolean h0(String str) {
        return "search_field".equals(str);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return kfd.k0.getName();
    }

    @Override // com.spotify.music.libs.search.view.l.b
    public void n() {
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.music.libs.search.view.l.b
    public void r(String str) {
    }

    public void s1() {
        this.j0.setVisibility(0);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.FREETIER_TASTEONBOARDING_ARTISTPICKER, ViewUris.R.toString());
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C0707R.layout.taste_picker_fragment_stockholm_black_with_sticky_search, viewGroup, false);
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.k0;
    }
}
