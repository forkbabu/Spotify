package com.spotify.music.features.goldenpath.referencetoplist;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import dagger.android.support.a;

public class ReferenceTopListFragment extends Fragment implements ToolbarConfig.d, s, c.a {
    g g0;
    o h0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getString(C0707R.string.golden_path_title_reference_top_list);
    }

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.h0.a();
    }

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.h0.b();
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public Fragment e() {
        return this;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.Y0;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "golden-path-reference-top-list";
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.GOLDENPATH_REFERENCETOPLIST, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.g0.b();
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.n0;
    }
}
