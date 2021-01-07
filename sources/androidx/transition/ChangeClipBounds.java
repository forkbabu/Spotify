package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

public class ChangeClipBounds extends Transition {
    private static final String[] O = {"android:clipBounds:clip"};

    class a extends AnimatorListenerAdapter {
        final /* synthetic */ View a;

        a(ChangeClipBounds changeClipBounds, View view) {
            this.a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            q4.M(this.a, null);
        }
    }

    public ChangeClipBounds() {
    }

    private void c0(x xVar) {
        View view = xVar.b;
        if (view.getVisibility() != 8) {
            Rect j = q4.j(view);
            xVar.a.put("android:clipBounds:clip", j);
            if (j == null) {
                xVar.a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
            }
        }
    }

    @Override // androidx.transition.Transition
    public String[] I() {
        return O;
    }

    @Override // androidx.transition.Transition
    public void j(x xVar) {
        c0(xVar);
    }

    @Override // androidx.transition.Transition
    public void n(x xVar) {
        c0(xVar);
    }

    @Override // androidx.transition.Transition
    public Animator r(ViewGroup viewGroup, x xVar, x xVar2) {
        ObjectAnimator objectAnimator = null;
        if (xVar != null && xVar2 != null && xVar.a.containsKey("android:clipBounds:clip") && xVar2.a.containsKey("android:clipBounds:clip")) {
            Rect rect = (Rect) xVar.a.get("android:clipBounds:clip");
            Rect rect2 = (Rect) xVar2.a.get("android:clipBounds:clip");
            boolean z = rect2 == null;
            if (rect == null && rect2 == null) {
                return null;
            }
            if (rect == null) {
                rect = (Rect) xVar.a.get("android:clipBounds:bounds");
            } else if (rect2 == null) {
                rect2 = (Rect) xVar2.a.get("android:clipBounds:bounds");
            }
            if (rect.equals(rect2)) {
                return null;
            }
            q4.M(xVar2.b, rect);
            objectAnimator = ObjectAnimator.ofObject(xVar2.b, (Property<View, V>) g0.c, (TypeEvaluator) new m(new Rect()), (Object[]) new Rect[]{rect, rect2});
            if (z) {
                objectAnimator.addListener(new a(this, xVar2.b));
            }
        }
        return objectAnimator;
    }

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
