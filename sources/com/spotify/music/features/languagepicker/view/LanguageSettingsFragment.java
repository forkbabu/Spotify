package com.spotify.music.features.languagepicker.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.features.languagepicker.presenter.g;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;

public class LanguageSettingsFragment extends LifecycleListenableFragment implements g, s, mfd, c.a {
    g h0;
    im5 i0;
    private RecyclerView j0;
    private View k0;
    h l0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getString(C0707R.string.title_settings);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        super.N3(bundle);
        this.h0.g(bundle);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.h0.h(this);
    }

    @Override // com.spotify.music.features.languagepicker.view.g
    public void P(int i, boolean z) {
        this.l0.a(i, z);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.h0.i();
    }

    @Override // com.spotify.music.features.languagepicker.view.g
    public void U(boolean z) {
        this.k0.setVisibility(z ? 0 : 8);
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
        return PageIdentifiers.SETTINGS_CONTENT_LANGUAGES;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.K1;
    }

    @Override // com.spotify.music.features.languagepicker.view.g
    public void h() {
        this.l0.b.getView().setVisibility(8);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return kfd.K.getName();
    }

    @Override // androidx.fragment.app.Fragment
    public void m3(Bundle bundle) {
        super.m3(bundle);
        if (bundle != null) {
            this.h0.a(bundle);
        }
    }

    @Override // com.spotify.music.features.languagepicker.view.g
    public void p1(boolean z) {
        this.j0.setVisibility(z ? 0 : 4);
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.SETTINGS_CONTENT_LANGUAGES, ViewUris.K1.toString());
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_language_settings, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0707R.id.languages);
        this.j0 = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.j0.setLayoutManager(new LinearLayoutManager(inflate.getContext()));
        this.j0.setAdapter(this.i0);
        this.i0.j0(this.h0);
        this.k0 = inflate.findViewById(C0707R.id.loading_view);
        this.l0 = new h(l4(), (ViewGroup) inflate.findViewById(C0707R.id.error_view_container), new d(this));
        return inflate;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.K;
    }
}
