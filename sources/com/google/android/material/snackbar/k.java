package com.google.android.material.snackbar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;

class k implements Runnable {
    final /* synthetic */ BaseTransientBottomBar a;

    k(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public void run() {
        BaseTransientBottomBar.l lVar = this.a.c;
        if (lVar != null) {
            lVar.setVisibility(0);
            if (this.a.c.getAnimationMode() == 1) {
                BaseTransientBottomBar baseTransientBottomBar = this.a;
                baseTransientBottomBar.getClass();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(qw.a);
                ofFloat.addUpdateListener(new c(baseTransientBottomBar));
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                ofFloat2.setInterpolator(qw.d);
                ofFloat2.addUpdateListener(new d(baseTransientBottomBar));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.setDuration(150L);
                animatorSet.addListener(new a(baseTransientBottomBar));
                animatorSet.start();
                return;
            }
            BaseTransientBottomBar.c(this.a);
        }
    }
}
