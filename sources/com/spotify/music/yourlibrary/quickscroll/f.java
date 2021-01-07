package com.spotify.music.yourlibrary.quickscroll;

import android.view.View;
import android.view.animation.Animation;

/* access modifiers changed from: package-private */
public class f implements Animation.AnimationListener {
    final /* synthetic */ View a;
    final /* synthetic */ float b;

    f(g gVar, View view, float f) {
        this.a = view;
        this.b = f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        View view = this.a;
        float f = this.b;
        if (f == 0.0f) {
            view.setVisibility(4);
        } else if (f == 1.0f) {
            view.setVisibility(0);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
