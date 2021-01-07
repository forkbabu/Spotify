package com.spotify.music.yourlibrary.quickscroll;

import android.animation.ValueAnimator;
import android.view.View;

public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ g a;
    public final /* synthetic */ View b;

    public /* synthetic */ a(g gVar, View view) {
        this.a = gVar;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.e(this.b, valueAnimator);
    }
}
