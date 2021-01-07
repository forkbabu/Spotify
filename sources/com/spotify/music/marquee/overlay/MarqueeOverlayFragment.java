package com.spotify.music.marquee.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.common.base.MoreObjects;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.encore.foundation.R;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.ui.b;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.marquee.ui.OverlayBackgroundView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.g;

public class MarqueeOverlayFragment extends LifecycleListenableFragment implements s, mfd, m, ws2 {
    private View h0;
    private OverlayBackgroundView i0;
    private TextView j0;
    private TextView k0;
    private ImageView l0;
    private TextView m0;
    private Button n0;
    private TextView o0;
    private View p0;
    private View q0;
    private k r0;
    private boolean s0;
    Picasso t0;
    j u0;
    private final b.AbstractC0214b v0 = new a();
    private final View.OnLayoutChangeListener w0 = new b();

    class a extends b.c {
        a() {
        }

        @Override // com.spotify.music.features.ads.ui.b.AbstractC0214b
        public void M0(int[] iArr) {
            int left = MarqueeOverlayFragment.this.l0.getLeft();
            int top = MarqueeOverlayFragment.this.l0.getTop();
            int width = MarqueeOverlayFragment.this.l0.getWidth();
            int height = MarqueeOverlayFragment.this.l0.getHeight();
            if (iArr[0] >= left && iArr[0] <= left + width && iArr[1] >= top && iArr[1] <= top + height) {
                MarqueeOverlayFragment.this.u0.i();
            }
        }

        @Override // com.spotify.music.features.ads.ui.b.AbstractC0214b
        public void j1() {
            MarqueeOverlayFragment.this.u0.m();
        }

        @Override // com.spotify.music.features.ads.ui.b.AbstractC0214b
        public void m() {
            je.g(MarqueeOverlayFragment.this.p0, 1.0f, 100);
            je.g(MarqueeOverlayFragment.this.q0, 1.0f, 100);
        }

        @Override // com.spotify.music.features.ads.ui.b.AbstractC0214b
        public void s() {
            je.g(MarqueeOverlayFragment.this.p0, 0.0f, 100);
            je.g(MarqueeOverlayFragment.this.q0, 0.0f, 100);
        }
    }

    class b implements View.OnLayoutChangeListener {
        b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int f = nud.f(24.0f, MarqueeOverlayFragment.this.R2());
            int top = MarqueeOverlayFragment.this.p0.getTop();
            int bottom = i4 - MarqueeOverlayFragment.this.q0.getBottom();
            int i9 = 0;
            int abs = top < f ? Math.abs(f - top) : 0;
            if (bottom < f) {
                i9 = Math.abs(f - bottom);
            }
            int max = Math.max(abs, i9);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) MarqueeOverlayFragment.this.l0.getLayoutParams();
            e2.t(layoutParams, e2.k(layoutParams) + max);
            e2.s(layoutParams, e2.j(layoutParams) + max);
            MarqueeOverlayFragment.this.l0.setLayoutParams(layoutParams);
            MarqueeOverlayFragment.this.h0.removeOnLayoutChangeListener(this);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            MarqueeOverlayFragment.this.s0 = true;
        }
    }

    class d implements g {
        d() {
        }

        @Override // com.squareup.picasso.g
        public void onError(Exception exc) {
            MarqueeOverlayFragment.this.u0.g();
        }

        @Override // com.squareup.picasso.g
        public void onSuccess() {
            MarqueeOverlayFragment.this.u0.h();
        }
    }

    class e extends AnimatorListenerAdapter {
        final /* synthetic */ com.spotify.music.marquee.ui.a a;

        e(com.spotify.music.marquee.ui.a aVar) {
            this.a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.a();
            if (MarqueeOverlayFragment.this.B2() != null) {
                MarqueeOverlayFragment.this.B2().overridePendingTransition(0, 0);
            }
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.r0.c();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        if (!this.s0) {
            this.r0.a(new c());
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        bundle.putBoolean("animation_completed", this.s0);
        super.N3(bundle);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.u0.l(this);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.u0.n();
    }

    public void P4(com.spotify.music.marquee.ui.a aVar) {
        this.r0.b(new e(aVar));
    }

    public void Q4(String str) {
        this.t0.m(str).n(this.l0, new d());
    }

    public void R4(String str) {
        this.m0.setText(str);
    }

    public void S4(String str) {
        this.k0.setText(str);
    }

    public void T4(njb njb) {
        ((mjb) njb).c(this.i0);
    }

    public void U4(String str) {
        this.n0.setText(str);
    }

    public void V4(String str) {
        this.j0.setText(str);
    }

    public void W4(String str) {
        this.o0.setText(str);
    }

    public void X4(String str, String str2) {
        int b2 = androidx.core.content.a.b(B2(), R.color.white_70);
        g gVar = new g(this);
        int length = str2.length();
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(new sjb(b2, gVar), 0, length, 17);
        SpannableStringBuilder spannableStringBuilder = spannableString;
        if (!MoreObjects.isNullOrEmpty(str)) {
            spannableStringBuilder = SpannableStringBuilder.valueOf(str).append((CharSequence) " ").append((CharSequence) spannableString);
        }
        this.o0.setHighlightColor(0);
        this.o0.setMovementMethod(LinkMovementMethod.getInstance());
        this.o0.setText(spannableStringBuilder);
    }

    @Override // defpackage.ws2
    public boolean b() {
        this.u0.j();
        return true;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.ADS;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return ViewUris.f1.toString();
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.ADS, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle != null) {
            this.s0 = bundle.getBoolean("animation_completed", false);
        }
        View inflate = layoutInflater.inflate(C0707R.layout.marquee, viewGroup, false);
        this.h0 = inflate.findViewById(C0707R.id.marquee_overlay_view);
        this.p0 = inflate.findViewById(C0707R.id.marquee_overlay_header);
        OverlayBackgroundView overlayBackgroundView = (OverlayBackgroundView) inflate.findViewById(C0707R.id.marquee_modal_background_view);
        this.i0 = overlayBackgroundView;
        overlayBackgroundView.setRadius((float) nud.g(8.0f, R2()));
        this.i0.setColor(androidx.core.content.a.b(B2(), C0707R.color.marquee_background_default_color));
        this.i0.setOnTouchListener(new com.spotify.music.features.ads.ui.b(this.h0, this.v0));
        this.j0 = (TextView) inflate.findViewById(C0707R.id.marquee_new_release_description);
        this.k0 = (TextView) inflate.findViewById(C0707R.id.marquee_artist_name);
        this.l0 = (ImageView) inflate.findViewById(C0707R.id.marquee_new_release_cover_art);
        this.m0 = (TextView) inflate.findViewById(C0707R.id.marquee_new_release_title);
        Button button = (Button) inflate.findViewById(C0707R.id.marquee_cta);
        this.n0 = button;
        button.setOnClickListener(new i(this));
        this.o0 = (TextView) inflate.findViewById(C0707R.id.marquee_overlay_legal_text);
        View findViewById = inflate.findViewById(C0707R.id.marquee_overlay_footer_text);
        this.q0 = findViewById;
        findViewById.setOnClickListener(new h(this));
        this.r0 = new k(this.p0, this.q0, inflate.findViewById(C0707R.id.marquee_overlay_background), (ConstraintLayout) inflate.findViewById(C0707R.id.marquee_overlay_content));
        this.h0.addOnLayoutChangeListener(this.w0);
        return inflate;
    }

    public void z() {
        if (B2() != null) {
            B2().finish();
        }
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.a;
    }
}
