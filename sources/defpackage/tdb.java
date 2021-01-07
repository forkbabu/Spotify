package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.h;

/* renamed from: tdb  reason: default package */
public final class tdb {

    /* access modifiers changed from: package-private */
    /* renamed from: tdb$a */
    public static final class a implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.e(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue("width");
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                Object animatedValue2 = valueAnimator.getAnimatedValue("height");
                if (animatedValue2 != null) {
                    int intValue2 = ((Integer) animatedValue2).intValue();
                    ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                    layoutParams.width = intValue;
                    layoutParams.height = intValue2;
                    this.a.setLayoutParams(layoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    public static final void a(AnimatorSet animatorSet, Bundle bundle, View view, View view2, View view3, View view4, View view5, View view6, View view7, View view8, int i) {
        h.e(animatorSet, "animatorSet");
        h.e(bundle, "bundle");
        h.e(view, "backgroundView");
        h.e(view2, "lyricsView");
        h.e(view3, "headerView");
        h.e(view4, "seekbarView");
        h.e(view5, "playPauseButtonView");
        h.e(view6, "vocalRemovalButtonView");
        h.e(view7, "vocalRemovalMenuButtonView");
        int i2 = bundle.getInt("start_y");
        int i3 = bundle.getInt("start_height");
        int i4 = bundle.getInt("end_height");
        int i5 = bundle.getInt("start_width");
        int i6 = bundle.getInt("end_width");
        int height = view3.getHeight();
        ArrayList arrayList = new ArrayList();
        Animator e = e(view, i2, 0, i3, (height * 2) + i4, i5, i6);
        int i7 = (i2 - height) + i;
        Animator d = d(view2, i7, 0, 0.0f, 1.0f);
        Animator c = c(view3, -height, 0);
        Animator d2 = d(view4, i7, 0, 0.0f, 1.0f);
        Animator d3 = d(view5, i7, 0, 0.0f, 1.0f);
        Animator d4 = d(view6, i7, 0, 0.0f, 1.0f);
        Animator d5 = d(view7, i7, 0, 0.0f, 1.0f);
        arrayList.add(e);
        arrayList.add(d);
        arrayList.add(c);
        arrayList.add(d2);
        arrayList.add(d3);
        arrayList.add(d4);
        arrayList.add(d5);
        if (view8 != null) {
            arrayList.add(d(view8, i7, 0, 0.0f, 1.0f));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration((long) 350);
    }

    public static final void b(AnimatorSet animatorSet, Bundle bundle, View view, View view2, View view3, View view4) {
        h.e(animatorSet, "animatorSet");
        h.e(bundle, "bundle");
        h.e(view, "backgroundView");
        h.e(view2, "lyricsView");
        h.e(view3, "headerView");
        int i = bundle.getInt("start_y");
        int i2 = bundle.getInt("start_height");
        int i3 = bundle.getInt("start_width");
        int height = view3.getHeight();
        Animator e = e(view, 0, i, view.getHeight(), i2, view.getWidth(), i3);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        h.d(ofFloat, "backgroundAlphaAnimation");
        ofFloat.setInterpolator(new AccelerateInterpolator());
        int i4 = -height;
        ArrayList arrayList = new ArrayList(Arrays.asList(e, ofFloat, d(view2, 0, i - ((int) view2.getY()), 1.0f, 0.0f), c(view3, 0, i4)));
        if (view4 != null) {
            arrayList.add(c(view4, 0, i4));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration((long) 350);
    }

    private static final Animator c(View view, int i, int i2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", (float) i, (float) i2);
        h.d(ofFloat, "ObjectAnimator.ofFloat(v…oFloat(), endY.toFloat())");
        return ofFloat;
    }

    private static final Animator d(View view, int i, int i2, float f, float f2) {
        Animator c = c(view, i, i2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", f, f2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(c, ofFloat);
        return animatorSet;
    }

    private static final Animator e(View view, int i, int i2, int i3, int i4, int i5, int i6) {
        Animator c = c(view, i, i2);
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofInt("width", i5, i6), PropertyValuesHolder.ofInt("height", i3, i4));
        ofPropertyValuesHolder.addUpdateListener(new a(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofPropertyValuesHolder, c);
        return animatorSet;
    }
}
