package com.spotify.paste.widgets.recyclerview.fastscroll;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.Constants;
import com.spotify.music.C0707R;

public class RecyclerViewFastScroller extends View {
    private RecyclerView a;
    private final Drawable b;
    private final int c;
    private final int f;
    private boolean n;
    private final int o;
    private LinearLayoutManager p;
    private final d q;
    private final Paint r;
    private boolean s;
    private final Handler t;
    private final Runnable u;
    private final RecyclerView.q v;
    private final Rect w;
    private int x;
    private ObjectAnimator y;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerViewFastScroller.this.s = false;
            RecyclerViewFastScroller.this.j();
        }
    }

    class b extends RecyclerView.q {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void a(RecyclerView recyclerView, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void c(RecyclerView recyclerView, int i, int i2) {
            if (RecyclerViewFastScroller.this.isEnabled()) {
                if (Math.abs(i2) > 15) {
                    RecyclerViewFastScroller.g(RecyclerViewFastScroller.this);
                }
                if (RecyclerViewFastScroller.this.s) {
                    RecyclerViewFastScroller.this.n();
                    RecyclerViewFastScroller.i(RecyclerViewFastScroller.this);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            RecyclerViewFastScroller.this.setVisibility(4);
            RecyclerViewFastScroller.this.setTranslationX(0.0f);
            RecyclerViewFastScroller.this.setAlpha(1.0f);
            RecyclerViewFastScroller.this.y = null;
        }
    }

    /* access modifiers changed from: private */
    public class d {
        private final Rect a = new Rect();
        private final Rect b = new Rect();
        private float c;

        d(a aVar) {
        }

        static boolean b(d dVar, MotionEvent motionEvent) {
            return dVar.b.contains((int) motionEvent.getX(), (int) motionEvent.getY());
        }

        static void c(d dVar, int i, int i2, int i3, int i4, int i5) {
            dVar.a.set(i, i2, i3, i4);
            dVar.b.set(0, 0, i3, i5);
            dVar.h();
        }

        private void h() {
            this.b.offsetTo(0, Math.round(((float) (this.a.height() - RecyclerViewFastScroller.this.c)) * this.c));
        }

        public void f(MotionEvent motionEvent) {
            g((motionEvent.getY() - (((float) this.b.height()) / 2.0f)) / ((float) this.a.height()));
        }

        public void g(float f) {
            this.c = f;
            if (f < 0.0f) {
                this.c = 0.0f;
            }
            if (this.c > 1.0f) {
                this.c = 1.0f;
            }
            h();
        }
    }

    public RecyclerViewFastScroller(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.pasteRecyclerFastScrollerStyle);
    }

    static void g(RecyclerViewFastScroller recyclerViewFastScroller) {
        if (!recyclerViewFastScroller.s) {
            ObjectAnimator objectAnimator = recyclerViewFastScroller.y;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                recyclerViewFastScroller.y.cancel();
                recyclerViewFastScroller.y = null;
            }
            recyclerViewFastScroller.setVisibility(0);
            recyclerViewFastScroller.setTranslationX((float) (nud.n(recyclerViewFastScroller) ? -recyclerViewFastScroller.getMeasuredWidth() : recyclerViewFastScroller.getMeasuredWidth()));
            recyclerViewFastScroller.setAlpha(0.0f);
            recyclerViewFastScroller.getViewTreeObserver().addOnPreDrawListener(new a(recyclerViewFastScroller));
        }
        recyclerViewFastScroller.s = true;
    }

    static void i(RecyclerViewFastScroller recyclerViewFastScroller) {
        if (!recyclerViewFastScroller.n) {
            recyclerViewFastScroller.l();
            float f2 = 0.0f;
            if (recyclerViewFastScroller.a.getChildCount() == 0) {
                recyclerViewFastScroller.q.g(0.0f);
                return;
            }
            int computeVerticalScrollRange = recyclerViewFastScroller.a.computeVerticalScrollRange();
            int computeVerticalScrollExtent = recyclerViewFastScroller.a.computeVerticalScrollExtent();
            int computeVerticalScrollOffset = recyclerViewFastScroller.a.computeVerticalScrollOffset();
            int i = computeVerticalScrollRange - computeVerticalScrollExtent;
            if (i > 0) {
                f2 = ((float) computeVerticalScrollOffset) / ((float) i);
            }
            recyclerViewFastScroller.q.g(f2);
            int i2 = q4.g;
            int i3 = Build.VERSION.SDK_INT;
            recyclerViewFastScroller.postInvalidateOnAnimation();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void j() {
        int i;
        if (nud.n(this)) {
            i = -getMeasuredWidth();
        } else {
            i = getMeasuredWidth();
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat(View.ALPHA, 1.0f, 0.0f), PropertyValuesHolder.ofFloat(View.TRANSLATION_X, (float) i));
        this.y = ofPropertyValuesHolder;
        ofPropertyValuesHolder.setDuration(200L);
        this.y.setInterpolator(xud.b(this.a.getContext()));
        this.y.addListener(new c());
        this.y.start();
    }

    private void l() {
        if (this.a.getLayoutManager() instanceof LinearLayoutManager) {
            this.p = (LinearLayoutManager) this.a.getLayoutManager();
            return;
        }
        throw new IllegalStateException("Must be instance of LinearLayoutManager!");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void n() {
        this.t.removeCallbacks(this.u);
        this.t.postDelayed(this.u, (long) this.o);
    }

    public void k() {
        boolean z = this.s;
        this.s = false;
        this.t.removeCallbacks(this.u);
        if (z) {
            j();
        }
    }

    public boolean m() {
        return this.n;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.t.removeCallbacks(this.u);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        canvas.drawRect(this.q.a, this.r);
        this.b.getPadding(this.w);
        Rect rect = this.q.b;
        int centerY = rect.centerY();
        int intrinsicHeight = centerY - (this.b.getIntrinsicHeight() / 2);
        int intrinsicHeight2 = (this.b.getIntrinsicHeight() / 2) + centerY;
        if (nud.n(this)) {
            i2 = rect.left + this.w.right;
            i = this.b.getIntrinsicWidth() + i2;
        } else {
            int intrinsicWidth = rect.right - this.b.getIntrinsicWidth();
            int i3 = this.w.right;
            int i4 = intrinsicWidth - i3;
            i = rect.right - i3;
            i2 = i4;
        }
        this.b.setBounds(i2, intrinsicHeight, i, intrinsicHeight2);
        this.b.draw(canvas);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(z42.A(this.f), i2);
        d.c(this.q, 0, 0, getMeasuredWidth(), getMeasuredHeight(), this.c);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.s && motionEvent.getAction() == 0 && d.b(this.q, motionEvent)) {
            this.n = true;
            getParent().requestDisallowInterceptTouchEvent(true);
            this.b.setState(new int[]{16842919});
            n();
            return true;
        } else if (motionEvent.getAction() == 2 && this.n) {
            n();
            this.q.f(motionEvent);
            l();
            int i0 = (int) (((float) this.p.i0()) * this.q.c);
            if (i0 != 0) {
                this.p.v1(i0);
            } else {
                this.p.t2(i0, -this.x);
            }
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            postInvalidateOnAnimation();
            return true;
        } else if (!this.n || (motionEvent.getAction() != 1 && motionEvent.getAction() != 3)) {
            return super.onTouchEvent(motionEvent);
        } else {
            n();
            this.b.setState(new int[0]);
            getParent().requestDisallowInterceptTouchEvent(false);
            this.n = false;
            return true;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            boolean z2 = this.s;
            this.s = false;
            this.t.removeCallbacks(this.u);
            if (z2) {
                j();
            }
        }
    }

    public void setFirstItemDecorationHeight(int i) {
        this.x = i;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 != null) {
            recyclerView2.D0(this.v);
            this.p = null;
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            recyclerView.n(this.v);
        }
    }

    public RecyclerViewFastScroller(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q = new d(null);
        Paint paint = new Paint();
        this.r = paint;
        this.t = new Handler();
        this.u = new a();
        this.v = new b();
        this.w = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.spotify.paste.widgets.c.h, i, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        this.b = drawable;
        this.c = obtainStyledAttributes.getDimensionPixelSize(3, nud.g(72.0f, getResources()));
        this.f = obtainStyledAttributes.getDimensionPixelSize(4, nud.g(32.0f, getResources()));
        this.o = obtainStyledAttributes.getInt(0, Constants.ONE_SECOND);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        drawable.getClass();
        paint.setColor(color);
        setVisibility(4);
    }
}
