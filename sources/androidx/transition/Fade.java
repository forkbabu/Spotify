package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class Fade extends Visibility {

    /* access modifiers changed from: package-private */
    public class a extends t {
        final /* synthetic */ View a;

        a(Fade fade, View view) {
            this.a = view;
        }

        @Override // androidx.transition.Transition.d
        public void d(Transition transition) {
            g0.g(this.a, 1.0f);
            g0.a(this.a);
            transition.P(this);
        }
    }

    /* access modifiers changed from: private */
    public static class b extends AnimatorListenerAdapter {
        private final View a;
        private boolean b = false;

        b(View view) {
            this.a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g0.g(this.a, 1.0f);
            if (this.b) {
                this.a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            View view = this.a;
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            if (view.hasOverlappingRendering() && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, null);
            }
        }
    }

    public Fade(int i) {
        k0(i);
    }

    private Animator l0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        g0.g(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, g0.b, f2);
        ofFloat.addListener(new b(view));
        b(new a(this, view));
        return ofFloat;
    }

    @Override // androidx.transition.Visibility
    public Animator g0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        Float f;
        float f2 = 0.0f;
        float floatValue = (xVar == null || (f = (Float) xVar.a.get("android:fade:transitionAlpha")) == null) ? 0.0f : f.floatValue();
        if (floatValue != 1.0f) {
            f2 = floatValue;
        }
        return l0(view, f2, 1.0f);
    }

    @Override // androidx.transition.Visibility
    public Animator i0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        g0.d(view);
        Float f = (Float) xVar.a.get("android:fade:transitionAlpha");
        return l0(view, f != null ? f.floatValue() : 1.0f, 0.0f);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void n(x xVar) {
        super.n(xVar);
        xVar.a.put("android:fade:transitionAlpha", Float.valueOf(g0.b(xVar.b)));
    }

    public Fade() {
    }

    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.e);
        k0(i2.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, e0()));
        obtainStyledAttributes.recycle();
    }
}
