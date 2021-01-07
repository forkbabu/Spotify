package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

public class ChangeBounds extends Transition {
    private static final String[] Q = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> R = new a(PointF.class, "boundsOrigin");
    private static final Property<j, PointF> S = new b(PointF.class, "topLeft");
    private static final Property<j, PointF> T = new c(PointF.class, "bottomRight");
    private static final Property<View, PointF> U = new d(PointF.class, "bottomRight");
    private static final Property<View, PointF> V = new e(PointF.class, "topLeft");
    private static final Property<View, PointF> W = new f(PointF.class, "position");
    private static m X = new m();
    private int[] O;
    private boolean P;

    static class a extends Property<Drawable, PointF> {
        private Rect a = new Rect();

        a(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.a);
            Rect rect = this.a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            drawable2.copyBounds(this.a);
            this.a.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(this.a);
        }
    }

    static class b extends Property<j, PointF> {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(j jVar) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(j jVar, PointF pointF) {
            jVar.b(pointF);
        }
    }

    static class c extends Property<j, PointF> {
        c(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(j jVar) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(j jVar, PointF pointF) {
            jVar.a(pointF);
        }
    }

    static class d extends Property<View, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            g0.f(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    static class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            g0.f(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    static class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            g0.f(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    }

    class g extends AnimatorListenerAdapter {
        final /* synthetic */ j a;
        private j mViewBounds;

        g(ChangeBounds changeBounds, j jVar) {
            this.a = jVar;
            this.mViewBounds = jVar;
        }
    }

    class h extends AnimatorListenerAdapter {
        private boolean a;
        final /* synthetic */ View b;
        final /* synthetic */ Rect c;
        final /* synthetic */ int f;
        final /* synthetic */ int n;
        final /* synthetic */ int o;
        final /* synthetic */ int p;

        h(ChangeBounds changeBounds, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.b = view;
            this.c = rect;
            this.f = i;
            this.n = i2;
            this.o = i3;
            this.p = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.a) {
                q4.M(this.b, this.c);
                g0.f(this.b, this.f, this.n, this.o, this.p);
            }
        }
    }

    class i extends t {
        boolean a = false;
        final /* synthetic */ ViewGroup b;

        i(ChangeBounds changeBounds, ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // androidx.transition.t, androidx.transition.Transition.d
        public void a(Transition transition) {
            d0.c(this.b, true);
        }

        @Override // androidx.transition.t, androidx.transition.Transition.d
        public void c(Transition transition) {
            d0.c(this.b, false);
        }

        @Override // androidx.transition.Transition.d
        public void d(Transition transition) {
            if (!this.a) {
                d0.c(this.b, false);
            }
            transition.P(this);
        }

        @Override // androidx.transition.t, androidx.transition.Transition.d
        public void e(Transition transition) {
            d0.c(this.b, false);
            this.a = true;
        }
    }

    private static class j {
        private int a;
        private int b;
        private int c;
        private int d;
        private View e;
        private int f;
        private int g;

        j(View view) {
            this.e = view;
        }

        /* access modifiers changed from: package-private */
        public void a(PointF pointF) {
            this.c = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            this.d = round;
            int i = this.g + 1;
            this.g = i;
            if (this.f == i) {
                g0.f(this.e, this.a, this.b, this.c, round);
                this.f = 0;
                this.g = 0;
            }
        }

        /* access modifiers changed from: package-private */
        public void b(PointF pointF) {
            this.a = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            this.b = round;
            int i = this.f + 1;
            this.f = i;
            if (i == this.g) {
                g0.f(this.e, this.a, round, this.c, this.d);
                this.f = 0;
                this.g = 0;
            }
        }
    }

    public ChangeBounds() {
        this.O = new int[2];
        this.P = false;
    }

    private void c0(x xVar) {
        View view = xVar.b;
        if (q4.w(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            xVar.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            xVar.a.put("android:changeBounds:parent", xVar.b.getParent());
            if (this.P) {
                xVar.a.put("android:changeBounds:clip", q4.j(view));
            }
        }
    }

    @Override // androidx.transition.Transition
    public String[] I() {
        return Q;
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
        int i2;
        boolean z;
        View view;
        Animator animator;
        ObjectAnimator objectAnimator;
        int i3;
        Rect rect;
        ObjectAnimator objectAnimator2;
        if (xVar == null || xVar2 == null) {
            return null;
        }
        Map<String, Object> map = xVar.a;
        Map<String, Object> map2 = xVar2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = xVar2.b;
        Rect rect2 = (Rect) xVar.a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) xVar2.a.get("android:changeBounds:bounds");
        int i4 = rect2.left;
        int i5 = rect3.left;
        int i6 = rect2.top;
        int i7 = rect3.top;
        int i8 = rect2.right;
        int i9 = rect3.right;
        int i10 = rect2.bottom;
        int i11 = rect3.bottom;
        int i12 = i8 - i4;
        int i13 = i10 - i6;
        int i14 = i9 - i5;
        int i15 = i11 - i7;
        Rect rect4 = (Rect) xVar.a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) xVar2.a.get("android:changeBounds:clip");
        if ((i12 == 0 || i13 == 0) && (i14 == 0 || i15 == 0)) {
            i2 = 0;
        } else {
            i2 = (i4 == i5 && i6 == i7) ? 0 : 1;
            if (!(i8 == i9 && i10 == i11)) {
                i2++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i2++;
        }
        if (i2 <= 0) {
            return null;
        }
        if (!this.P) {
            view = view2;
            g0.f(view, i4, i6, i8, i10);
            if (i2 == 2) {
                if (i12 == i14 && i13 == i15) {
                    animator = a.e(view, W, D().a((float) i4, (float) i6, (float) i5, (float) i7));
                } else {
                    j jVar = new j(view);
                    ObjectAnimator e2 = a.e(jVar, S, D().a((float) i4, (float) i6, (float) i5, (float) i7));
                    ObjectAnimator e3 = a.e(jVar, T, D().a((float) i8, (float) i10, (float) i9, (float) i11));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(e2, e3);
                    animatorSet.addListener(new g(this, jVar));
                    animator = animatorSet;
                }
            } else if (i4 == i5 && i6 == i7) {
                animator = a.e(view, U, D().a((float) i8, (float) i10, (float) i9, (float) i11));
            } else {
                animator = a.e(view, V, D().a((float) i4, (float) i6, (float) i5, (float) i7));
            }
            z = true;
        } else {
            view = view2;
            g0.f(view, i4, i6, Math.max(i12, i14) + i4, Math.max(i13, i15) + i6);
            if (i4 == i5 && i6 == i7) {
                objectAnimator = null;
            } else {
                objectAnimator = a.e(view, W, D().a((float) i4, (float) i6, (float) i5, (float) i7));
            }
            if (rect4 == null) {
                i3 = 0;
                rect = new Rect(0, 0, i12, i13);
            } else {
                i3 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i3, i3, i14, i15) : rect5;
            if (!rect.equals(rect6)) {
                q4.M(view, rect);
                m mVar = X;
                Object[] objArr = new Object[2];
                objArr[i3] = rect;
                objArr[1] = rect6;
                ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", mVar, objArr);
                z = true;
                ofObject.addListener(new h(this, view, rect5, i5, i7, i9, i11));
                objectAnimator2 = ofObject;
            } else {
                z = true;
                objectAnimator2 = null;
            }
            animator = w.b(objectAnimator, objectAnimator2);
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            d0.c(viewGroup4, z);
            b(new i(this, viewGroup4));
        }
        return animator;
    }

    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.O = new int[2];
        this.P = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.c);
        boolean h2 = i2.h(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        this.P = h2;
    }
}
