package com.spotify.music.features.ads.audioplus.video;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.audioplus.video.views.VideoRendererView;
import com.spotify.music.features.ads.screensaver.p0;
import com.spotify.music.features.ads.ui.OverlayBackgroundView;
import com.spotify.music.features.ads.ui.b;
import com.spotify.music.libs.viewuri.ViewUris;

public class VideoOverlayFragment extends Fragment implements s, mfd, b.AbstractC0214b {
    public static final String l0 = VideoOverlayFragment.class.getCanonicalName();
    private VideoRendererView g0;
    private TextView h0;
    private TextView i0;
    h j0;
    private p0.a k0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // com.spotify.music.features.ads.ui.b.AbstractC0214b
    public void M0(int[] iArr) {
    }

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.j0.c(this.g0);
    }

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.j0.d();
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.ADS;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return ViewUris.g1.toString();
    }

    @Override // com.spotify.music.features.ads.ui.b.AbstractC0214b
    public void j1() {
        p0.a aVar = this.k0;
        if (aVar != null && aVar.W() != null) {
            this.k0.W().e();
        }
    }

    @Override // com.spotify.music.features.ads.ui.b.AbstractC0214b
    public void m() {
        this.h0.animate().alpha(1.0f).setDuration(100).start();
        this.i0.animate().alpha(1.0f).setDuration(100).start();
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
        this.k0 = (p0.a) context;
    }

    @Override // com.spotify.music.features.ads.ui.b.AbstractC0214b
    public void s() {
        this.h0.animate().alpha(0.0f).setDuration(100).start();
        this.i0.animate().alpha(0.0f).setDuration(100).start();
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.ADS, ViewUris.g1.toString());
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(C0707R.layout.leave_behind_video_overlay, viewGroup, false);
        View findViewById = frameLayout.findViewById(C0707R.id.container_view_video);
        this.g0 = (VideoRendererView) frameLayout.findViewById(C0707R.id.video_ads_renderer);
        ((OverlayBackgroundView) frameLayout.findViewById(C0707R.id.overlay_view_video)).setOnTouchListener(new b(findViewById, this));
        this.h0 = (TextView) frameLayout.findViewById(C0707R.id.tv_header_video);
        this.i0 = (TextView) frameLayout.findViewById(C0707R.id.tv_footer_video);
        return frameLayout;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.a;
    }
}
