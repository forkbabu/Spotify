package com.spotify.music.features.ads.screensaver;

import android.os.Bundle;
import android.os.Parcelable;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.ads.audioplus.d;
import com.spotify.music.features.ads.audioplus.e;
import com.spotify.music.features.ads.audioplus.overlay.LeaveBehindContainerFragment;
import com.spotify.music.features.ads.audioplus.video.VideoOverlayFragment;
import com.spotify.music.features.ads.model.Ad;

public class p0 {
    private FrameLayout a;
    private final o b;
    private final ys2 c;
    private final com.spotify.music.features.ads.audioplus.topbanner.a d;
    private final n0 e;
    private final jp3 f;
    private final e g;
    private Ad h;

    public interface a {
        p0 W();
    }

    public p0(o oVar, ys2 ys2, com.spotify.music.features.ads.audioplus.topbanner.a aVar, n0 n0Var, jp3 jp3, e eVar) {
        this.b = oVar;
        this.c = ys2;
        this.d = aVar;
        this.e = n0Var;
        this.f = jp3;
        this.g = eVar;
    }

    private void a(Fragment fragment) {
        if (fragment != null) {
            FrameLayout frameLayout = this.a;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            x i = this.b.i();
            i.p(fragment);
            i.k();
        }
    }

    public void b() {
        Fragment U = this.b.U(LeaveBehindContainerFragment.j0);
        this.c.I1(null);
        a(U);
    }

    public void c() {
        Fragment U = this.b.U(ScreensaverAdFragment.t0);
        this.c.I1(null);
        a(U);
    }

    public void d() {
        this.d.close();
    }

    public void e() {
        Fragment U = this.b.U(VideoOverlayFragment.l0);
        this.c.I1(null);
        a(U);
    }

    public boolean f() {
        return this.e.f();
    }

    /* access modifiers changed from: package-private */
    public void g(Fragment fragment, String str, FrameLayout frameLayout) {
        this.a = frameLayout;
        frameLayout.bringToFront();
        x i = this.b.i();
        i.c(this.a.getId(), fragment, str);
        i.i();
    }

    public void h(Ad ad) {
        this.h = ad;
    }

    public void i(FrameLayout frameLayout) {
        Ad ad = this.h;
        if (ad != null) {
            if (ad.isAudioPlus()) {
                Ad ad2 = this.h;
                frameLayout.getClass();
                d a2 = this.g.a(ad2);
                if (this.f.d()) {
                    this.d.a(a2);
                } else if (this.f.c()) {
                    Fragment leaveBehindContainerFragment = new LeaveBehindContainerFragment();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("ad", a2);
                    leaveBehindContainerFragment.r4(bundle);
                    g(leaveBehindContainerFragment, LeaveBehindContainerFragment.j0, frameLayout);
                    this.c.I1(t.a);
                } else {
                    Logger.b("[AudioPlus] - received audio+ ad for control group", new Object[0]);
                }
            } else if (this.h.getVideos().isEmpty() || !this.f.f()) {
                Parcelable parcelable = this.h;
                frameLayout.getClass();
                if (parcelable == null) {
                    Assertion.p("Need an ad to open screensaver ad fragment");
                }
                String str = ScreensaverAdFragment.t0;
                if (parcelable == null) {
                    Assertion.p("Need an ad to display");
                }
                Fragment screensaverAdFragment = new ScreensaverAdFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("ad", parcelable);
                screensaverAdFragment.r4(bundle2);
                g(screensaverAdFragment, ScreensaverAdFragment.t0, frameLayout);
                this.c.I1(u.a);
            } else {
                Parcelable parcelable2 = this.h;
                frameLayout.getClass();
                Fragment videoOverlayFragment = new VideoOverlayFragment();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("ad", parcelable2);
                videoOverlayFragment.r4(bundle3);
                g(videoOverlayFragment, VideoOverlayFragment.l0, frameLayout);
                this.c.I1(s.a);
            }
            this.h = null;
        }
    }
}
