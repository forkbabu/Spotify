package com.spotify.music.yourlibrary.quickscroll;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

/* access modifiers changed from: package-private */
public class g {
    private final k a;
    private final s b;

    g(k kVar, s sVar) {
        this.a = kVar;
        this.b = sVar;
    }

    private void a(View view, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        alphaAnimation.setDuration((long) this.a.a());
        alphaAnimation.setAnimationListener(new f(this, view, f2));
        view.startAnimation(alphaAnimation);
    }

    private static boolean d(View view) {
        Animation animation = view.getAnimation();
        return animation == null || !animation.hasStarted() || animation.hasEnded();
    }

    /* access modifiers changed from: package-private */
    public void b(View view, int i) {
        ValueAnimator ofInt = ValueAnimator.ofInt(this.b.a(view), i);
        ofInt.setDuration((long) this.a.k());
        ofInt.addUpdateListener(new a(this, view));
        ofInt.start();
    }

    /* access modifiers changed from: package-private */
    public void c(View view) {
        if (d(view) && view.getVisibility() == 0) {
            a(view, 1.0f, 0.0f);
        }
    }

    public /* synthetic */ void e(View view, ValueAnimator valueAnimator) {
        this.b.b(view, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* access modifiers changed from: package-private */
    public void f(View view) {
        if (d(view) && view.getVisibility() == 4) {
            a(view, 0.0f, 1.0f);
        }
    }
}
