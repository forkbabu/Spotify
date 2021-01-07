package com.spotify.music.behindthelyrics.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.spotify.music.behindthelyrics.view.i;

public class d {
    d() {
    }

    public Animator a(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(ta0.a);
        return ofFloat;
    }

    public Animator b(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 1.0f);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(ta0.b);
        return ofFloat;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0031: APUT  (r3v2 float[]), (0 ??[int, short, byte, char]), (r6v1 float) */
    public Animator c(View view, i.f fVar, View view2) {
        AnimatorSet animatorSet = new AnimatorSet();
        float f = 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(ta0.a);
        ofFloat.addListener(fVar);
        Property property = View.ALPHA;
        float[] fArr = new float[2];
        if (view != view2) {
            f = view2.getAlpha();
        }
        fArr[0] = f;
        fArr[1] = 1.0f;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, property, fArr);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(ta0.b);
        animatorSet.playSequentially(ofFloat, ofFloat2);
        return animatorSet;
    }
}
