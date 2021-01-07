package com.spotify.music.features.tasteonboarding.updatetaste.view;

import android.animation.ObjectAnimator;
import android.view.ViewTreeObserver;

class a implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ ObjectAnimator a;
    final /* synthetic */ ObjectAnimator b;
    final /* synthetic */ ObjectAnimator c;
    final /* synthetic */ ProgressIndicator f;

    a(ProgressIndicator progressIndicator, ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2, ObjectAnimator objectAnimator3) {
        this.f = progressIndicator;
        this.a = objectAnimator;
        this.b = objectAnimator2;
        this.c = objectAnimator3;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f.getViewTreeObserver().removeOnPreDrawListener(this);
        this.a.start();
        this.b.start();
        this.c.start();
        return false;
    }
}
