package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;

class a implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ View a;

    a(FabTransformationBehavior fabTransformationBehavior, View view) {
        this.a = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.invalidate();
    }
}
