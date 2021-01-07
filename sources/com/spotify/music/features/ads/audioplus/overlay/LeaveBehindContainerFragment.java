package com.spotify.music.features.ads.audioplus.overlay;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.screensaver.p0;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;

public class LeaveBehindContainerFragment extends Fragment implements e, s, mfd, c.a {
    public static final String j0 = LeaveBehindContainerFragment.class.getCanonicalName();
    c g0;
    private p0.a h0;
    private FrameLayout i0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    public void K4() {
        p0.a aVar = this.h0;
        if (aVar != null && aVar.W() != null) {
            this.h0.W().b();
        }
    }

    public void L4(i iVar) {
        View a = iVar.a(LayoutInflater.from(F2()), this.i0);
        this.i0.removeAllViews();
        this.i0.addView(a);
    }

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.g0.f(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.g0.g();
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.ADS;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.g1;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return ViewUris.g1.toString();
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
        this.h0 = (p0.a) context;
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.ADS, ViewUris.g1.toString());
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(C0707R.layout.leave_behind_container, viewGroup, false);
        this.i0 = frameLayout;
        return frameLayout;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.a;
    }
}
