package com.spotify.music.marquee.overlay;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.common.base.Optional;
import com.spotify.music.marquee.q;
import java.util.Arrays;
import java.util.List;

public class k {
    private final Animator a;
    private final Animator b;
    private final Animator c;
    private final Animator d;
    private final Animator e;
    private final Animator f;
    private final Animator g;
    private final Animator h;
    private final Animator i;
    private final Animator j;
    private AnimatorSet k;

    public k(View view, View view2, View view3, View view4) {
        this.a = q.b(view3);
        this.b = q.c(view3);
        this.c = q.b(view);
        this.d = q.c(view);
        this.e = q.b(view4);
        this.f = q.c(view4);
        this.g = q.b(view2);
        this.h = q.c(view2);
        this.i = q.e(view4, 50.0f);
        this.j = q.d(view4, 50.0f);
    }

    private void d(List<Animator> list, Optional<Animator.AnimatorListener> optional, Interpolator interpolator, long j2) {
        AnimatorSet animatorSet = this.k;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.k.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(list);
        animatorSet2.setDuration(j2);
        animatorSet2.setInterpolator(interpolator);
        if (optional.isPresent()) {
            animatorSet2.addListener(optional.get());
        }
        animatorSet2.start();
        this.k = animatorSet2;
    }

    public void a(Animator.AnimatorListener animatorListener) {
        d(Arrays.asList(this.a, this.c, this.g, this.e, this.i), Optional.fromNullable(animatorListener), ta0.b, 350);
    }

    public void b(Animator.AnimatorListener animatorListener) {
        d(Arrays.asList(this.b, this.d, this.h, this.f, this.j), Optional.fromNullable(animatorListener), ta0.a, 300);
    }

    public void c() {
        AnimatorSet animatorSet = this.k;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.k.cancel();
        }
    }
}
