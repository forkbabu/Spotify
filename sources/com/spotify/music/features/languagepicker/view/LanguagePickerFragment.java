package com.spotify.music.features.languagepicker.view;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.encore.foundation.R;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.features.languagepicker.presenter.f;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;

public class LanguagePickerFragment extends LifecycleListenableFragment implements ws2, s, mfd, j, c.a {
    f h0;
    gm5 i0;
    int j0;
    private ViewGroup k0;
    private TextView l0;
    private RecyclerView m0;
    h n0;
    private ProgressBar o0;
    private int p0;
    private int q0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getString(C0707R.string.title_picker);
    }

    @Override // com.spotify.music.features.languagepicker.view.j
    public boolean F0(boolean z) {
        int i = 0;
        if ((this.k0.getVisibility() == 0) == z) {
            return false;
        }
        this.k0.setVisibility(z ? 0 : 8);
        this.l0.setEnabled(z);
        if (z) {
            i = this.q0;
        }
        RecyclerView recyclerView = this.m0;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), this.m0.getPaddingTop(), this.m0.getPaddingRight(), this.p0 + i);
        return true;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        super.N3(bundle);
        this.h0.n(bundle);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.h0.o(this);
    }

    @Override // com.spotify.music.features.languagepicker.view.g
    public void P(int i, boolean z) {
        this.n0.a(i, z);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.h0.p();
    }

    @Override // com.spotify.music.features.languagepicker.view.g
    public void U(boolean z) {
        this.o0.setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.ws2
    public boolean b() {
        return this.h0.i();
    }

    @Override // com.spotify.music.features.languagepicker.view.j
    public void b1(int i) {
        ((TextView) m4().findViewById(C0707R.id.header)).setText(i);
    }

    @Override // com.spotify.music.features.languagepicker.view.g
    public void d2() {
        new NoSkipDialog().Y4(K2(), NoSkipDialog.class.getName());
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.LANGUAGEPICKER;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.X;
    }

    @Override // com.spotify.music.features.languagepicker.view.g
    public void h() {
        this.n0.b.getView().setVisibility(8);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return kfd.K.getName();
    }

    @Override // androidx.fragment.app.Fragment
    public void m3(Bundle bundle) {
        super.m3(bundle);
        if (bundle != null) {
            this.h0.l(bundle);
        }
    }

    @Override // com.spotify.music.features.languagepicker.view.g
    public void p1(boolean z) {
        this.m0.setVisibility(z ? 0 : 4);
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.LANGUAGEPICKER, ViewUris.X.toString());
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C0707R.layout.fragment_language_picker, viewGroup, false);
        this.m0 = (RecyclerView) viewGroup2.findViewById(C0707R.id.recycler_view);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(C0707R.id.next_button_container);
        this.k0 = viewGroup3;
        this.l0 = (TextView) viewGroup3.findViewById(C0707R.id.btn_next);
        this.p0 = this.m0.getPaddingBottom();
        this.q0 = Math.round(R2().getDimension(C0707R.dimen.solar_button_height)) + ((ViewGroup.MarginLayoutParams) this.l0.getLayoutParams()).bottomMargin;
        this.l0.setOnClickListener(new b(this));
        F0(false);
        this.m0.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(viewGroup2.getContext(), this.j0);
        gridLayoutManager.K2(this.i0.k0());
        this.m0.setLayoutManager(gridLayoutManager);
        this.m0.setAdapter(this.i0);
        this.i0.j0(this.h0);
        a aVar = new a(this);
        RecyclerView recyclerView = this.m0;
        Context l4 = l4();
        DisplayMetrics displayMetrics = R2().getDisplayMetrics();
        int i = this.j0;
        f.e(aVar, recyclerView, Math.round(((float) ((displayMetrics.widthPixels - (((i + 1) * l4.getResources().getDimensionPixelSize(C0707R.dimen.grid_item_spacing_half)) * 2)) / i)) / 2.0f));
        Context l42 = l4();
        this.n0 = new h(l42, (ViewGroup) viewGroup2.findViewById(C0707R.id.error_view_container), new c(this));
        ProgressBar progressBar = (ProgressBar) viewGroup2.findViewById(C0707R.id.loading_view);
        this.o0 = progressBar;
        progressBar.getIndeterminateDrawable().setColorFilter(androidx.core.content.a.b(l42, R.color.white), PorterDuff.Mode.SRC_IN);
        return viewGroup2;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.K;
    }
}
