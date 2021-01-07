package com.spotify.libs.otp.ui;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.core.content.a;
import androidx.core.widget.c;
import com.google.common.base.MoreObjects;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class AnimatorHelper {

    @FunctionalInterface
    @Keep
    public interface AnimatorEndListener extends Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        void onAnimationCancel(Animator animator);

        void onAnimationEnd();

        @Override // android.animation.Animator.AnimatorListener
        void onAnimationEnd(Animator animator);

        @Override // android.animation.Animator.AnimatorListener
        void onAnimationEnd(Animator animator, boolean z);

        @Override // android.animation.Animator.AnimatorListener
        void onAnimationRepeat(Animator animator);

        @Override // android.animation.Animator.AnimatorListener
        void onAnimationStart(Animator animator);

        @Override // android.animation.Animator.AnimatorListener
        void onAnimationStart(Animator animator, boolean z);
    }

    /* access modifiers changed from: private */
    public enum Position {
        LEFT,
        RIGHT
    }

    private static SpotifyIconDrawable a(Context context, SpotifyIconV2 spotifyIconV2) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, context.getResources().getDimension(C0707R.dimen.text_view_icon_size));
        spotifyIconDrawable.r(a.b(context, R.color.white));
        return spotifyIconDrawable;
    }

    private static float b(View view, Position position) {
        ViewParent parent = view.getParent();
        MoreObjects.checkState(parent instanceof View);
        int width = ((View) parent).getWidth();
        int ordinal = position.ordinal();
        if (ordinal == 0) {
            return (float) (-width);
        }
        if (ordinal == 1) {
            return (float) width;
        }
        throw new AssertionError("Unsupported position");
    }

    public static void c(View view, boolean z) {
        if (view.getVisibility() == 0) {
            view.animate().translationX(b(view, z ^ true ? Position.RIGHT : Position.LEFT)).setDuration(500).setInterpolator(AnimationUtils.loadInterpolator(view.getContext(), C0707R.anim.in_out_interpolator)).setListener(new a(view)).start();
        }
    }

    public static void d(TextView textView, SpotifyIconV2 spotifyIconV2) {
        c.h(textView, null, null, a(textView.getContext(), spotifyIconV2), null);
    }

    public static void e(TextView textView, SpotifyIconV2 spotifyIconV2) {
        c.h(textView, a(textView.getContext(), spotifyIconV2), null, null, null);
    }

    public static void f(View view, boolean z, AnimatorEndListener animatorEndListener) {
        if (view.getVisibility() != 0) {
            view.setTranslationX(b(view, z ? Position.RIGHT : Position.LEFT));
            view.setVisibility(0);
            view.animate().translationX(0.0f).setDuration(500).setInterpolator(AnimationUtils.loadInterpolator(view.getContext(), C0707R.anim.in_out_interpolator)).setListener(animatorEndListener).start();
        }
    }
}
