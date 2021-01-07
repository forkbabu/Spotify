package com.spotify.android.goldenpath;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;

public class GoldenPathTutorialStep02Fragment extends LifecycleListenableFragment implements s {
    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getString(C0707R.string.golden_path_title_goldenpathtutorial);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public Fragment e() {
        return this;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "golden-path-goldenpathtutorial";
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.DEBUG, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C0707R.layout.fragment_goldenpath_goldenpathtutorial, viewGroup, false);
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.n0;
    }
}
