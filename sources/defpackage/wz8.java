package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

/* renamed from: wz8  reason: default package */
public final class wz8 {

    /* access modifiers changed from: package-private */
    /* renamed from: wz8$a */
    public static final class a implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ View a;

        a(View view, long j, long j2) {
            this.a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.d(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                this.a.setTranslationY(((Float) animatedValue).floatValue());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public static final Animator a(View view, int i) {
        h.e(view, "$this$createAnimator");
        Animator loadAnimator = AnimatorInflater.loadAnimator(view.getContext(), i);
        loadAnimator.setTarget(view);
        return loadAnimator;
    }

    public static final void b(Animator animator) {
        h.e(animator, "$this$dispose");
        animator.removeAllListeners();
        if (animator instanceof ValueAnimator) {
            ((ValueAnimator) animator).removeAllUpdateListeners();
        }
        animator.cancel();
        if (animator instanceof AnimatorSet) {
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            h.d(childAnimations, "childAnimations");
            for (T t : childAnimations) {
                h.d(t, "animator");
                b(t);
            }
        }
    }

    public static final float c(float f, Resources resources) {
        h.e(resources, "resources");
        return (((float) resources.getDisplayMetrics().densityDpi) / ((float) 160)) * f;
    }

    public static final Animator d(View view, float f, long j, long j2) {
        h.e(view, "view");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", f);
        b09 b09 = b09.d;
        ofFloat.setInterpolator(b09.b());
        ofFloat.setDuration(j);
        ofFloat.setStartDelay(TimeUnit.MILLISECONDS.toMillis(j2));
        h.d(ofFloat, "ObjectAnimator.ofFloat(v…NDS.toMillis(delay)\n    }");
        return ofFloat;
    }

    public static /* synthetic */ Animator e(View view, float f, long j, long j2, int i) {
        float f2 = (i & 2) != 0 ? 1.0f : f;
        if ((i & 4) != 0) {
            j = 0;
        }
        return d(view, f2, j, (i & 8) != 0 ? 0 : j2);
    }

    public static final Animator f(View view, float f, float f2, long j, long j2) {
        h.e(view, "view");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", f);
        b09 b09 = b09.d;
        ofFloat.setInterpolator(b09.a());
        ofFloat.setDuration(j);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", f2);
        ofFloat2.setInterpolator(b09.a());
        ofFloat2.setDuration(j);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setStartDelay(j2);
        return animatorSet;
    }

    public static /* synthetic */ Animator g(View view, float f, float f2, long j, long j2, int i) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        if ((i & 4) != 0) {
            f2 = 1.0f;
        }
        if ((i & 8) != 0) {
            j = 0;
        }
        if ((i & 16) != 0) {
            j2 = 0;
        }
        return f(view, f, f2, j, j2);
    }

    public static final Animator h(View view, float f, float f2, long j, long j2) {
        h.e(view, "view");
        Context context = view.getContext();
        h.d(context, "view.context");
        Resources resources = context.getResources();
        h.d(resources, "view.context.resources");
        h.e(resources, "resources");
        Context context2 = view.getContext();
        h.d(context2, "view.context");
        Resources resources2 = context2.getResources();
        h.d(resources2, "view.context.resources");
        h.e(resources2, "resources");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(TypedValue.applyDimension(1, f, resources.getDisplayMetrics()), TypedValue.applyDimension(1, f2, resources2.getDisplayMetrics()));
        ofFloat.addUpdateListener(new a(view, j, j2));
        b09 b09 = b09.d;
        ofFloat.setInterpolator(b09.a());
        ofFloat.setDuration(j);
        ofFloat.setStartDelay(j2);
        h.d(ofFloat, "ValueAnimator.ofFloat(\n … startDelay = delay\n    }");
        return ofFloat;
    }

    public static /* synthetic */ Animator i(View view, float f, float f2, long j, long j2, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        if ((i & 8) != 0) {
            j = 0;
        }
        if ((i & 16) != 0) {
            j2 = 0;
        }
        return h(view, f, f2, j, j2);
    }

    public static final AnimatorSet j(Animator... animatorArr) {
        h.e(animatorArr, "animators");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially((Animator[]) Arrays.copyOf(animatorArr, animatorArr.length));
        return animatorSet;
    }

    public static final AnimatorSet k(Animator... animatorArr) {
        h.e(animatorArr, "animators");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether((Animator[]) Arrays.copyOf(animatorArr, animatorArr.length));
        return animatorSet;
    }
}
