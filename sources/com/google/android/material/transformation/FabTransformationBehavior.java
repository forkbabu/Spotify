package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.List;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    private final Rect c;
    private final RectF d;
    private final RectF e;
    private final int[] f;
    private float g;
    private float h;

    class a extends AnimatorListenerAdapter {
        final /* synthetic */ boolean a;
        final /* synthetic */ View b;
        final /* synthetic */ View c;

        a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.a = z;
            this.b = view;
            this.c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.a) {
                this.b.setVisibility(4);
                this.c.setAlpha(1.0f);
                this.c.setVisibility(0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.a) {
                this.b.setVisibility(0);
                this.c.setAlpha(0.0f);
                this.c.setVisibility(4);
            }
        }
    }

    /* access modifiers changed from: protected */
    public static class b {
        public xw a;
        public zw b;

        protected b() {
        }
    }

    public FabTransformationBehavior() {
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    private Pair<yw, yw> f(float f2, float f3, boolean z, b bVar) {
        yw ywVar;
        yw ywVar2;
        if (f2 == 0.0f || f3 == 0.0f) {
            ywVar2 = bVar.a.f("translationXLinear");
            ywVar = bVar.a.f("translationYLinear");
        } else if ((!z || f3 >= 0.0f) && (z || f3 <= 0.0f)) {
            ywVar2 = bVar.a.f("translationXCurveDownwards");
            ywVar = bVar.a.f("translationYCurveDownwards");
        } else {
            ywVar2 = bVar.a.f("translationXCurveUpwards");
            ywVar = bVar.a.f("translationYCurveUpwards");
        }
        return new Pair<>(ywVar2, ywVar);
    }

    private float g(View view, View view2, zw zwVar) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        j(view, rectF);
        rectF.offset(this.g, this.h);
        j(view2, rectF2);
        zwVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    private float h(View view, View view2, zw zwVar) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        j(view, rectF);
        rectF.offset(this.g, this.h);
        j(view2, rectF2);
        zwVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    private float i(b bVar, yw ywVar, float f2, float f3) {
        long c2 = ywVar.c();
        long d2 = ywVar.d();
        yw f4 = bVar.a.f("expansion");
        long c3 = f4.c();
        float interpolation = ywVar.e().getInterpolation(((float) (((f4.d() + c3) + 17) - c2)) / ((float) d2));
        TimeInterpolator timeInterpolator = qw.a;
        return je.a(f3, f2, interpolation, f2);
    }

    private void j(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    private void k(View view, long j, int i, int i2, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f2, f2);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    private ViewGroup m(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x011b: APUT  (r6v1 float[]), (0 ??[int, short, byte, char]), (r0v4 float) */
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x012a: APUT  (r6v2 float[]), (0 ??[int, short, byte, char]), (r1v5 float) */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x03a3 A[LOOP:0: B:92:0x03a1->B:93:0x03a3, LOOP_END] */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.AnimatorSet e(android.view.View r28, android.view.View r29, boolean r30, boolean r31) {
        /*
        // Method dump skipped, instructions count: 944
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.e(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    /* access modifiers changed from: protected */
    public abstract b l(Context context, boolean z);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(CoordinatorLayout.e eVar) {
        if (eVar.h == 0) {
            eVar.h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }
}
