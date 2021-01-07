package com.spotify.music.libs.podcast.chartsv2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.libs.viewuri.c;

public class PodcastChartsFragment extends Fragment implements s, c.a, mfd, ToolbarConfig.d, ToolbarConfig.c {
    public static final /* synthetic */ int i0 = 0;
    ena g0;
    d h0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
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
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public a g1() {
        return qma.a(getViewUri().toString());
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return (c) k4().getParcelable("uri");
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return getViewUri().toString();
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(qma.a(getViewUri().toString()), null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.g0.b();
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        if (k4().getBoolean("is_root")) {
            return kfd.T0;
        }
        return kfd.S0;
    }
}
