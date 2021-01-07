package com.spotify.music.features.ads.audioplus.overlay;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.common.base.Optional;
import java.util.Arrays;
import java.util.List;

public class f {
    private AnimatorSet a;

    private static Animator a(View view, float... fArr) {
        return ObjectAnimator.ofFloat(view, View.ALPHA, fArr);
    }

    private void b(List<Animator> list, Interpolator interpolator, long j, Optional<Animator.AnimatorListener> optional) {
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.a.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(list);
        animatorSet2.setDuration(j);
        animatorSet2.setInterpolator(interpolator);
        if (optional.isPresent()) {
            animatorSet2.addListener(optional.get());
        }
        animatorSet2.start();
        this.a = animatorSet2;
    }

    public void c(View view, View view2, View view3, View view4) {
        b(Arrays.asList(a(view, 0.0f, 1.0f), a(view2, 0.0f, 1.0f), a(view3, 0.0f, 1.0f), a(view4, 0.0f, 1.0f), ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 50.0f, 0.0f)), ta0.b, 350, Optional.absent());
    }

    public void d(View view, View view2, View view3, View view4, Animator.AnimatorListener animatorListener) {
        b(Arrays.asList(a(view, 1.0f, 0.0f), a(view2, 1.0f, 0.0f), a(view3, 1.0f, 0.0f), a(view4, 1.0f, 0.0f), ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f, 50.0f)), ta0.a, 300, Optional.fromNullable(animatorListener));
    }
}
