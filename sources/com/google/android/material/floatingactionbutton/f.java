package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public class f {
    static final TimeInterpolator F = qw.c;
    static final int[] G = {16842919, 16842910};
    static final int[] H = {16843623, 16842908, 16842910};
    static final int[] I = {16842908, 16842910};
    static final int[] J = {16843623, 16842910};
    static final int[] K = {16842910};
    static final int[] L = new int[0];
    private final Rect A = new Rect();
    private final RectF B = new RectF();
    private final RectF C = new RectF();
    private final Matrix D = new Matrix();
    private ViewTreeObserver.OnPreDrawListener E;
    dy a;
    yx b;
    Drawable c;
    c d;
    Drawable e;
    boolean f;
    boolean g = true;
    float h;
    float i;
    float j;
    int k;
    private final com.google.android.material.internal.g l;
    private xw m;
    private xw n;
    private Animator o;
    private xw p;
    private xw q;
    private float r;
    private float s = 1.0f;
    private int t;
    private int u = 0;
    private ArrayList<Animator.AnimatorListener> v;
    private ArrayList<Animator.AnimatorListener> w;
    private ArrayList<g> x;
    final FloatingActionButton y;
    final qx z;

    /* access modifiers changed from: package-private */
    public class a extends AnimatorListenerAdapter {
        private boolean a;
        final /* synthetic */ boolean b;
        final /* synthetic */ h c;

        a(boolean z, h hVar) {
            this.b = z;
            this.c = hVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.u = 0;
            f.this.o = null;
            if (!this.a) {
                FloatingActionButton floatingActionButton = f.this.y;
                boolean z = this.b;
                floatingActionButton.e(z ? 8 : 4, z);
                h hVar = this.c;
                if (hVar != null) {
                    e eVar = (e) hVar;
                    eVar.a.a(eVar.b);
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.y.e(0, this.b);
            f.this.u = 1;
            f.this.o = animator;
            this.a = false;
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends AnimatorListenerAdapter {
        final /* synthetic */ boolean a;
        final /* synthetic */ h b;

        b(boolean z, h hVar) {
            this.a = z;
            this.b = hVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.u = 0;
            f.this.o = null;
            h hVar = this.b;
            if (hVar != null) {
                e eVar = (e) hVar;
                eVar.a.b(eVar.b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.y.e(0, this.a);
            f.this.u = 2;
            f.this.o = animator;
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends ww {
        c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
        @Override // android.animation.TypeEvaluator
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            f.this.s = f;
            return super.a(f, matrix, matrix2);
        }
    }

    private class d extends j {
        d(f fVar) {
            super(null);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.f.j
        public float a() {
            return 0.0f;
        }
    }

    private class e extends j {
        e() {
            super(null);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.f.j
        public float a() {
            f fVar = f.this;
            return fVar.h + fVar.i;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.f$f  reason: collision with other inner class name */
    private class C0108f extends j {
        C0108f() {
            super(null);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.f.j
        public float a() {
            f fVar = f.this;
            return fVar.h + fVar.j;
        }
    }

    /* access modifiers changed from: package-private */
    public interface g {
        void a();

        void b();
    }

    /* access modifiers changed from: package-private */
    public interface h {
    }

    private class i extends j {
        i() {
            super(null);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.f.j
        public float a() {
            return f.this.h;
        }
    }

    private abstract class j extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private boolean a;
        private float b;
        private float c;

        j(a aVar) {
        }

        /* access modifiers changed from: protected */
        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.P((float) ((int) this.c));
            this.a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.a) {
                yx yxVar = f.this.b;
                this.b = yxVar == null ? 0.0f : yxVar.q();
                this.c = a();
                this.a = true;
            }
            f fVar = f.this;
            float f2 = this.b;
            fVar.P((float) ((int) ((valueAnimator.getAnimatedFraction() * (this.c - f2)) + f2)));
        }
    }

    f(FloatingActionButton floatingActionButton, qx qxVar) {
        this.y = floatingActionButton;
        this.z = qxVar;
        com.google.android.material.internal.g gVar = new com.google.android.material.internal.g();
        this.l = gVar;
        gVar.a(G, i(new C0108f()));
        gVar.a(H, i(new e()));
        gVar.a(I, i(new e()));
        gVar.a(J, i(new e()));
        gVar.a(K, i(new i()));
        gVar.a(L, i(new d(this)));
        this.r = floatingActionButton.getRotation();
    }

    private boolean J() {
        return q4.w(this.y) && !this.y.isInEditMode();
    }

    private void g(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.y.getDrawable();
        if (drawable != null && this.t != 0) {
            RectF rectF = this.B;
            RectF rectF2 = this.C;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i2 = this.t;
            rectF2.set(0.0f, 0.0f, (float) i2, (float) i2);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i3 = this.t;
            matrix.postScale(f2, f2, ((float) i3) / 2.0f, ((float) i3) / 2.0f);
        }
    }

    private AnimatorSet h(xw xwVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.y, View.ALPHA, f2);
        xwVar.f("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.y, View.SCALE_X, f3);
        xwVar.f("scale").a(ofFloat2);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 26) {
            ofFloat2.setEvaluator(new g(this));
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.y, View.SCALE_Y, f3);
        xwVar.f("scale").a(ofFloat3);
        if (i2 == 26) {
            ofFloat3.setEvaluator(new g(this));
        }
        arrayList.add(ofFloat3);
        g(f4, this.D);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.y, new vw(), new c(), new Matrix(this.D));
        xwVar.f("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        rw.q(animatorSet, arrayList);
        return animatorSet;
    }

    private ValueAnimator i(j jVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(F);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(jVar);
        valueAnimator.addUpdateListener(jVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* access modifiers changed from: package-private */
    public void A() {
        ArrayList<g> arrayList = this.x;
        if (arrayList != null) {
            Iterator<g> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean B() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void C(xw xwVar) {
        this.q = xwVar;
    }

    /* access modifiers changed from: package-private */
    public final void D(float f2) {
        this.s = f2;
        Matrix matrix = this.D;
        g(f2, matrix);
        this.y.setImageMatrix(matrix);
    }

    /* access modifiers changed from: package-private */
    public final void E(int i2) {
        if (this.t != i2) {
            this.t = i2;
            D(this.s);
        }
    }

    /* access modifiers changed from: package-private */
    public void F(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.i(drawable, ox.c(colorStateList));
        }
    }

    /* access modifiers changed from: package-private */
    public final void G(dy dyVar) {
        this.a = dyVar;
        yx yxVar = this.b;
        if (yxVar != null) {
            yxVar.setShapeAppearanceModel(dyVar);
        }
        Drawable drawable = this.c;
        if (drawable instanceof gy) {
            ((gy) drawable).setShapeAppearanceModel(dyVar);
        }
        c cVar = this.d;
        if (cVar != null) {
            cVar.e(dyVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void H(xw xwVar) {
        this.p = xwVar;
    }

    /* access modifiers changed from: package-private */
    public boolean I() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean K() {
        return !this.f || this.y.getSizeDimension() >= this.k;
    }

    /* access modifiers changed from: package-private */
    public void L(h hVar, boolean z2) {
        if (!r()) {
            Animator animator = this.o;
            if (animator != null) {
                animator.cancel();
            }
            if (J()) {
                if (this.y.getVisibility() != 0) {
                    this.y.setAlpha(0.0f);
                    this.y.setScaleY(0.0f);
                    this.y.setScaleX(0.0f);
                    D(0.0f);
                }
                xw xwVar = this.p;
                if (xwVar == null) {
                    if (this.m == null) {
                        this.m = xw.b(this.y.getContext(), C0707R.animator.design_fab_show_motion_spec);
                    }
                    xwVar = this.m;
                    xwVar.getClass();
                }
                AnimatorSet h2 = h(xwVar, 1.0f, 1.0f, 1.0f);
                h2.addListener(new b(z2, hVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.v;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h2.addListener(it.next());
                    }
                }
                h2.start();
                return;
            }
            this.y.e(0, z2);
            this.y.setAlpha(1.0f);
            this.y.setScaleY(1.0f);
            this.y.setScaleX(1.0f);
            D(1.0f);
            if (hVar != null) {
                e eVar = (e) hVar;
                eVar.a.b(eVar.b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void M() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.r % 90.0f != 0.0f) {
                if (this.y.getLayerType() != 1) {
                    this.y.setLayerType(1, null);
                }
            } else if (this.y.getLayerType() != 0) {
                this.y.setLayerType(0, null);
            }
        }
        yx yxVar = this.b;
        if (yxVar != null) {
            yxVar.O((int) this.r);
        }
    }

    /* access modifiers changed from: package-private */
    public final void N() {
        D(this.s);
    }

    /* access modifiers changed from: package-private */
    public final void O() {
        Rect rect = this.A;
        m(rect);
        e2.c(this.e, "Didn't initialize content background");
        if (I()) {
            InsetDrawable insetDrawable = new InsetDrawable(this.e, rect.left, rect.top, rect.right, rect.bottom);
            FloatingActionButton.b bVar = (FloatingActionButton.b) this.z;
            bVar.getClass();
            f.super.setBackgroundDrawable(insetDrawable);
        } else {
            qx qxVar = this.z;
            Drawable drawable = this.e;
            FloatingActionButton.b bVar2 = (FloatingActionButton.b) qxVar;
            bVar2.getClass();
            if (drawable != null) {
                f.super.setBackgroundDrawable(drawable);
            }
        }
        qx qxVar2 = this.z;
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        FloatingActionButton.b bVar3 = (FloatingActionButton.b) qxVar2;
        FloatingActionButton.this.v.set(i2, i3, i4, i5);
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        floatingActionButton.setPadding(i2 + floatingActionButton.s, i3 + FloatingActionButton.this.s, i4 + FloatingActionButton.this.s, i5 + FloatingActionButton.this.s);
    }

    /* access modifiers changed from: package-private */
    public void P(float f2) {
        yx yxVar = this.b;
        if (yxVar != null) {
            yxVar.G(f2);
        }
    }

    public void d(Animator.AnimatorListener animatorListener) {
        if (this.w == null) {
            this.w = new ArrayList<>();
        }
        this.w.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    public void e(Animator.AnimatorListener animatorListener) {
        if (this.v == null) {
            this.v = new ArrayList<>();
        }
        this.v.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    public void f(g gVar) {
        if (this.x == null) {
            this.x = new ArrayList<>();
        }
        this.x.add(gVar);
    }

    /* access modifiers changed from: package-private */
    public yx j() {
        dy dyVar = this.a;
        dyVar.getClass();
        return new yx(dyVar);
    }

    /* access modifiers changed from: package-private */
    public float k() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public final xw l() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public void m(Rect rect) {
        int sizeDimension = this.f ? (this.k - this.y.getSizeDimension()) / 2 : 0;
        float k2 = this.g ? k() + this.j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil((double) k2));
        int max2 = Math.max(sizeDimension, (int) Math.ceil((double) (k2 * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* access modifiers changed from: package-private */
    public final xw n() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public void o(h hVar, boolean z2) {
        if (!q()) {
            Animator animator = this.o;
            if (animator != null) {
                animator.cancel();
            }
            if (J()) {
                xw xwVar = this.q;
                if (xwVar == null) {
                    if (this.n == null) {
                        this.n = xw.b(this.y.getContext(), C0707R.animator.design_fab_hide_motion_spec);
                    }
                    xwVar = this.n;
                    xwVar.getClass();
                }
                AnimatorSet h2 = h(xwVar, 0.0f, 0.0f, 0.0f);
                h2.addListener(new a(z2, hVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.w;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h2.addListener(it.next());
                    }
                }
                h2.start();
                return;
            }
            this.y.e(z2 ? 8 : 4, z2);
            if (hVar != null) {
                e eVar = (e) hVar;
                eVar.a.a(eVar.b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void p(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        yx j2 = j();
        this.b = j2;
        j2.setTintList(colorStateList);
        if (mode != null) {
            this.b.setTintMode(mode);
        }
        this.b.N(-12303292);
        this.b.C(this.y.getContext());
        nx nxVar = new nx(this.b.w());
        nxVar.setTintList(ox.c(colorStateList2));
        this.c = nxVar;
        yx yxVar = this.b;
        yxVar.getClass();
        this.e = new LayerDrawable(new Drawable[]{yxVar, nxVar});
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        if (this.y.getVisibility() == 0) {
            if (this.u == 1) {
                return true;
            }
            return false;
        } else if (this.u != 2) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean r() {
        if (this.y.getVisibility() != 0) {
            if (this.u == 2) {
                return true;
            }
            return false;
        } else if (this.u != 1) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void s() {
        this.l.b();
    }

    /* access modifiers changed from: package-private */
    public void t() {
        yx yxVar = this.b;
        if (yxVar != null) {
            zx.b(this.y, yxVar);
        }
        if (B()) {
            ViewTreeObserver viewTreeObserver = this.y.getViewTreeObserver();
            if (this.E == null) {
                this.E = new h(this);
            }
            viewTreeObserver.addOnPreDrawListener(this.E);
        }
    }

    /* access modifiers changed from: package-private */
    public void u() {
    }

    /* access modifiers changed from: package-private */
    public void v() {
        ViewTreeObserver viewTreeObserver = this.y.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.E = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void w(int[] iArr) {
        this.l.c(iArr);
    }

    /* access modifiers changed from: package-private */
    public void x(float f2, float f3, float f4) {
        O();
        yx yxVar = this.b;
        if (yxVar != null) {
            yxVar.G(f2);
        }
    }

    /* access modifiers changed from: package-private */
    public void y() {
        float rotation = this.y.getRotation();
        if (this.r != rotation) {
            this.r = rotation;
            M();
        }
    }

    /* access modifiers changed from: package-private */
    public void z() {
        ArrayList<g> arrayList = this.x;
        if (arrayList != null) {
            Iterator<g> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }
}
