package com.spotify.music.playlist.extender;

import android.animation.ValueAnimator;
import android.widget.ImageButton;

/* access modifiers changed from: package-private */
public class b0 implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ ImageButton a;
    final /* synthetic */ d0 b;

    b0(d0 d0Var, ImageButton imageButton) {
        this.b = d0Var;
        this.a = imageButton;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator.getAnimatedFraction() > 0.2f) {
            valueAnimator.removeUpdateListener(this);
            this.a.setImageDrawable(this.b.b);
        }
    }
}
