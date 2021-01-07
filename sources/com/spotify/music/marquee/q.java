package com.spotify.music.marquee;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.view.View;
import com.spotify.music.navigation.c;

public final class q {
    public static c a(Intent intent) {
        return new c(intent.getBooleanExtra("extra_crossfade", false), intent.getIntExtra("extra_animation_in", 0), intent.getIntExtra("extra_animation_out", 0));
    }

    public static Animator b(View view) {
        return ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f);
    }

    public static Animator c(View view) {
        return ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.0f);
    }

    public static Animator d(View view, float f) {
        return ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, 0.0f, f);
    }

    public static Animator e(View view, float f) {
        return ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f, 0.0f);
    }
}
