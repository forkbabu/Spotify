package com.spotify.music.features.ads.audioplus.topbanner.carousel;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.features.ads.audioplus.d;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.t0;
import java.util.List;

public class TopBannerCarouselFragment extends Fragment implements s, mfd, c.a {
    t0<List<d>> g0;
    PageLoaderView.a<List<d>> h0;
    private PageLoaderView<List<d>> i0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.g0.start();
    }

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.g0.stop();
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
        return ViewUris.h1;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return ViewUris.h1.toString();
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        PageLoaderView<List<d>> a = this.h0.a(l4());
        this.i0 = a;
        a.j0(this, this.g0);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.ADS, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.i0;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.a;
    }
}
