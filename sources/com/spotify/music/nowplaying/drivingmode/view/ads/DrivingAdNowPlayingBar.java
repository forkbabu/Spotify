package com.spotify.music.nowplaying.drivingmode.view.ads;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.drivingmode.presenter.pivot.n0;
import com.spotify.music.nowplaying.drivingmode.view.ads.a;

public class DrivingAdNowPlayingBar extends ConstraintLayout implements a {
    private final Interpolator a = new y5();
    private View b;
    private View c;
    private TextView f;
    private TextView n;
    private AnimatorSet o;
    private AnimatorSet p;
    private boolean q;
    private a.AbstractC0312a r;

    /* access modifiers changed from: package-private */
    public static class a extends AnimatorListenerAdapter {
        final /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.a.setScaleY(1.0f);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            DrivingAdNowPlayingBar.this.setVisibility(0);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            DrivingAdNowPlayingBar.this.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public class d extends AnimatorListenerAdapter {
        final /* synthetic */ String a;

        d(String str) {
            this.a = str;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            DrivingAdNowPlayingBar.this.n.setText(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public class e extends AnimatorListenerAdapter {
        final /* synthetic */ String a;

        e(String str) {
            this.a = str;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            DrivingAdNowPlayingBar.this.n.setText(this.a);
            DrivingAdNowPlayingBar.this.f.setVisibility(4);
        }
    }

    /* access modifiers changed from: package-private */
    public class f extends AnimatorListenerAdapter {
        final /* synthetic */ String a;

        f(String str) {
            this.a = str;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            DrivingAdNowPlayingBar.this.c.setVisibility(0);
            DrivingAdNowPlayingBar.this.n.setText(this.a);
        }
    }

    public DrivingAdNowPlayingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        J();
    }

    private void J() {
        ViewGroup.inflate(getContext(), C0707R.layout.driving_pivot_ad_info, this);
        this.b = findViewById(C0707R.id.pivot_ads_npb);
        this.c = findViewById(C0707R.id.driving_mode_ad_up_next);
        TextView textView = (TextView) findViewById(C0707R.id.driving_ad_title);
        this.f = textView;
        androidx.core.widget.c.n(textView, C0707R.style.res_2132083362_textappearance_driving_npbadtitle);
        androidx.core.widget.c.n((TextView) findViewById(C0707R.id.driving_ad_up_next_title), C0707R.style.res_2132083362_textappearance_driving_npbadtitle);
        TextView textView2 = (TextView) findViewById(C0707R.id.driving_ad_next_context);
        this.n = textView2;
        androidx.core.widget.c.n(textView2, C0707R.style.res_2132083361_textappearance_driving_npbadnextcontext);
        Drawable r2 = fvb.r(getContext());
        r2.setBounds(0, 0, r2.getMinimumWidth(), r2.getMinimumHeight());
        ((ImageView) findViewById(C0707R.id.driving_up_next_icon)).setImageDrawable(r2);
        this.o = new AnimatorSet();
        this.p = new AnimatorSet();
    }

    private static Animator K(View view, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500L).playTogether(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f2, 0.0f));
        return animatorSet;
    }

    private static Animator P(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500L).playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.0f), ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, 0.0f, ((float) (-view.getHeight())) / 4.0f));
        animatorSet.addListener(new a(view));
        return animatorSet;
    }

    public void G() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500L).playTogether(ObjectAnimator.ofFloat(this, View.TRANSLATION_Y, 0.0f, (float) this.b.getHeight()));
        animatorSet.setInterpolator(this.a);
        animatorSet.addListener(new c());
        animatorSet.start();
        this.q = false;
        a.AbstractC0312a aVar = this.r;
        if (aVar != null) {
            ((n0) aVar).m(false);
        }
    }

    public void U(String str) {
        if (this.q) {
            Animator P = P(this.n);
            TextView textView = this.n;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(500L).playTogether(ObjectAnimator.ofFloat(textView, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, (float) textView.getHeight(), 0.0f));
            P.addListener(new d(str));
            this.o.setInterpolator(this.a);
            this.o.playSequentially(P, animatorSet);
            this.o.start();
            return;
        }
        Animator P2 = P(this.f);
        View view = this.c;
        Animator K = K(view, (float) view.getHeight());
        P2.addListener(new e(str));
        K.addListener(new f(str));
        this.p.setInterpolator(this.a);
        this.p.playTogether(P2, K);
        this.p.start();
        this.q = true;
    }

    public void V() {
        this.f.setTranslationY(0.0f);
        this.f.setVisibility(0);
        this.f.setAlpha(1.0f);
        this.c.setVisibility(4);
        Animator K = K(this, (float) this.b.getHeight());
        K.addListener(new b());
        K.setInterpolator(this.a);
        K.start();
        a.AbstractC0312a aVar = this.r;
        if (aVar != null) {
            ((n0) aVar).m(true);
        }
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.ads.a
    public void setListener(a.AbstractC0312a aVar) {
        this.r = aVar;
    }

    public DrivingAdNowPlayingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        J();
    }
}
