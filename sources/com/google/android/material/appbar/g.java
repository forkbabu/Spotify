package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.internal.j;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
public class g {
    private static final int[] a = {16843848};

    static void a(View view, float f) {
        int integer = view.getResources().getInteger(C0707R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, C0707R.attr.state_liftable, -2130969984}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    static void b(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray f = j.f(context, attributeSet, a, i, i2, new int[0]);
        try {
            if (f.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, f.getResourceId(0, 0)));
            }
        } finally {
            f.recycle();
        }
    }
}
