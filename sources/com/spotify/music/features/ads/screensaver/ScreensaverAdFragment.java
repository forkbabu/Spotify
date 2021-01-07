package com.spotify.music.features.ads.screensaver;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.spotify.ads.uicomponents.secondaryintent.BookmarkAdButton;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.api.SlotApi;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.music.features.ads.model.AdSlot;
import com.spotify.music.features.ads.screensaver.p0;
import com.spotify.music.features.ads.ui.b;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.squareup.picasso.g;

public class ScreensaverAdFragment extends LifecycleListenableFragment implements s, c.a {
    public static final String t0 = ScreensaverAdFragment.class.getCanonicalName();
    private Ad h0;
    private TextView i0;
    private TextView j0;
    private BookmarkAdButton k0;
    private io.reactivex.disposables.b l0;
    dv3 m0;
    SlotApi n0;
    n0 o0;
    i0 p0;
    d0 q0;
    private final b.AbstractC0214b r0 = new a();
    private p0.a s0;

    class a implements b.AbstractC0214b {
        a() {
        }

        @Override // com.spotify.music.features.ads.ui.b.AbstractC0214b
        public void M0(int[] iArr) {
        }

        @Override // com.spotify.music.features.ads.ui.b.AbstractC0214b
        public void j1() {
            ScreensaverAdFragment.this.s0.W().c();
        }

        @Override // com.spotify.music.features.ads.ui.b.AbstractC0214b
        public void m() {
            ScreensaverAdFragment.this.i0.animate().alpha(1.0f).setDuration(100).start();
            ScreensaverAdFragment.this.j0.animate().alpha(1.0f).setDuration(100).start();
        }

        @Override // com.spotify.music.features.ads.ui.b.AbstractC0214b
        public void s() {
            ScreensaverAdFragment.this.i0.animate().alpha(0.0f).setDuration(100).start();
            ScreensaverAdFragment.this.j0.animate().alpha(0.0f).setDuration(100).start();
        }
    }

    class b implements g {
        b() {
        }

        @Override // com.squareup.picasso.g
        public void onError(Exception exc) {
            ScreensaverAdFragment.this.s0.W().c();
            ScreensaverAdFragment screensaverAdFragment = ScreensaverAdFragment.this;
            screensaverAdFragment.m0.a("errored", screensaverAdFragment.h0.id());
        }

        @Override // com.squareup.picasso.g
        public void onSuccess() {
            ScreensaverAdFragment screensaverAdFragment = ScreensaverAdFragment.this;
            screensaverAdFragment.m0.a("viewed", screensaverAdFragment.h0.id());
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.l0 = this.n0.a(AdSlot.MOBILE_SCREENSAVER.getSlotId(), SlotApi.Intent.CLEAR).subscribe(e.a, f.a);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        io.reactivex.disposables.b bVar = this.l0;
        if (bVar != null && !bVar.d()) {
            this.l0.dispose();
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.q0.d(this.k0);
    }

    public /* synthetic */ void O4(View view) {
        this.s0.W().c();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.p0.b(this.h0);
    }

    public /* synthetic */ void P4(View view) {
        this.s0.W().c();
    }

    public /* synthetic */ void Q4(View view) {
        this.p0.a(this.h0, B2());
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.e1;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return ViewUris.e1.toString();
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
        this.s0 = (p0.a) context;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        this.h0 = (Ad) k4().getParcelable("ad");
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.ADS, ViewUris.e1.toString());
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(C0707R.layout.fragment_screensaver_ad, viewGroup, false);
        linearLayout.setOnClickListener(new h(this));
        this.i0 = (TextView) linearLayout.findViewById(C0707R.id.screensaver_ad_header);
        TextView textView = (TextView) linearLayout.findViewById(C0707R.id.screensaver_ad_footer);
        this.j0 = textView;
        textView.setOnClickListener(new g(this));
        this.k0 = (BookmarkAdButton) linearLayout.findViewById(C0707R.id.screensaver_ad_bookmark);
        Button button = (Button) linearLayout.findViewById(C0707R.id.screensaver_ad_banner_cta);
        button.setText(this.h0.getButtonText());
        button.setOnClickListener(new d(this));
        View findViewById = linearLayout.findViewById(C0707R.id.screensaver_ad_banner_container);
        ImageView imageView = (ImageView) linearLayout.findViewById(C0707R.id.screensaver_ad_banner);
        imageView.setOnTouchListener(new com.spotify.music.features.ads.ui.b(findViewById, this.r0));
        this.o0.e(this.h0).n(imageView, new b());
        return linearLayout;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.a;
    }
}
