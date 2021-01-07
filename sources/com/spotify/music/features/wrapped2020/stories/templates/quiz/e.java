package com.spotify.music.features.wrapped2020.stories.templates.quiz;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import kotlin.jvm.internal.h;

public final class e {
    public static final float a(View view, int i) {
        Context context = view.getContext();
        h.d(context, "context");
        Resources resources = context.getResources();
        h.d(resources, "context.resources");
        return ((float) i) * resources.getDisplayMetrics().density;
    }

    public static final void b(Animator animator, cmf cmf) {
        animator.addListener(new c(cmf));
    }

    public static final void c(Animator animator, cmf cmf) {
        animator.addListener(new d(cmf));
    }
}
