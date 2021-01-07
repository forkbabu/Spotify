package com.spotify.mobile.android.spotlets.tooltip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.spotify.mobile.android.spotlets.tooltip.e;
import com.spotify.music.C0707R;
import defpackage.uu1;

public class TooltipContainer extends FrameLayout {
    public static final /* synthetic */ int z = 0;
    private final e a;
    private int b;
    private final int c;
    private boolean f;
    private View n;
    private ImageView o;
    private c p;
    private MotionEvent q;
    private ViewGroup r;
    private boolean s;
    private boolean t;
    private View u;
    private AnimatorSet v;
    private Runnable w;
    private final d x;
    private final View.OnAttachStateChangeListener y;

    public enum ForcePositionTag {
        ABOVE,
        BELOW
    }

    /* access modifiers changed from: package-private */
    public class a implements uu1.a {
        a() {
        }

        @Override // defpackage.uu1.a
        public void a() {
            TooltipContainer tooltipContainer = TooltipContainer.this;
            int i = TooltipContainer.z;
            tooltipContainer.f();
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TooltipContainer tooltipContainer = TooltipContainer.this;
            tooltipContainer.n(tooltipContainer.n);
            TooltipContainer.this.m();
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements e.b {
        c() {
        }
    }

    class d implements d {
        d(TooltipContainer tooltipContainer) {
        }
    }

    class e implements View.OnAttachStateChangeListener {
        e() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (!TooltipContainer.this.a.getConfiguration().isPresent() || !TooltipContainer.this.a.getConfiguration().get().h()) {
                TooltipContainer.this.g();
            } else {
                TooltipContainer.this.f();
            }
        }
    }

    public TooltipContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void e() {
        c cVar = this.p;
        if (cVar != null) {
            cVar.c();
            this.p = null;
        }
        ImageView imageView = this.o;
        if (imageView != null) {
            removeView(imageView);
        }
        View view = this.n;
        if (view != null) {
            View view2 = this.u;
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(this.y);
            } else {
                view.removeOnAttachStateChangeListener(this.y);
            }
            removeCallbacks(this.w);
            this.n = null;
        }
        MotionEvent motionEvent = this.q;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.q = null;
        }
        this.r = null;
    }

    private d getOnScrollListener() {
        return this.x;
    }

    private static Point h(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    private boolean i() {
        return this.a.getConfiguration().isPresent() && this.a.getConfiguration().get().a();
    }

    private boolean k(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr2);
        int i2 = i - iArr2[1];
        if ((view.getTag() == ForcePositionTag.ABOVE) && (i2 - this.a.getHeight() >= 0)) {
            return true;
        }
        int measuredHeight = (getMeasuredHeight() - i2) - view.getHeight();
        if (!((view.getTag() == ForcePositionTag.BELOW) && (measuredHeight - this.a.getHeight() >= 0)) && i2 >= measuredHeight) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void n(View view) {
        float f2;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr2);
        int i2 = iArr2[1];
        if (k(view)) {
            this.a.setAbove(true);
            e eVar = this.a;
            eVar.setY((float) (((i - i2) - eVar.getHeight()) - this.b));
        } else {
            this.a.setAbove(false);
            this.a.setY((float) Math.max(view.getHeight() + (i - i2) + this.b, 0));
        }
        int g = nud.g(8.0f, getResources());
        int[] iArr3 = new int[2];
        view.getLocationOnScreen(iArr3);
        int i3 = iArr3[0];
        int width = getWidth() - this.a.getWidth();
        if (i() || i3 <= width) {
            f2 = i() ? 0.0f : (float) g;
        } else {
            f2 = (float) (width - g);
        }
        int i4 = h(view).x;
        int i5 = h(this).x;
        this.a.setX(f2);
        this.a.setArrowOffset((int) (((float) (i5 + ((view.getWidth() / 2) + i4))) - f2));
    }

    public void f() {
        e();
        if (!this.f) {
            this.f = true;
            this.a.setAnimationListener(new c());
            e eVar = this.a;
            eVar.getClass();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setDuration(300L);
            ofFloat.addUpdateListener(new f(eVar));
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar.x, PropertyValuesHolder.ofFloat(View.ALPHA, 1.0f, 0.0f), PropertyValuesHolder.ofFloat(View.SCALE_X, 1.0f, 0.5f), PropertyValuesHolder.ofFloat(View.SCALE_Y, 1.0f, 0.25f));
            ofPropertyValuesHolder.setDuration(100L);
            ofPropertyValuesHolder.setStartDelay(100);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofPropertyValuesHolder);
            animatorSet.addListener(new g(eVar));
            animatorSet.start();
            this.v = animatorSet;
        }
    }

    public void g() {
        e();
        this.f = true;
        this.a.setHidden(true);
    }

    /* access modifiers changed from: package-private */
    public e getTooltip() {
        return this.a;
    }

    public boolean j() {
        return !this.f;
    }

    public void l(View view, uu1 uu1) {
        this.a.getLayoutParams().width = uu1.a() ? -1 : -2;
        this.a.requestLayout();
        boolean z2 = true;
        if (this.n != view || !(!this.f)) {
            Integer c2 = uu1.c();
            if (c2 != null) {
                this.b = c2.intValue();
            } else {
                getResources().getDimensionPixelOffset(C0707R.dimen.tooltip_distance_from_view);
            }
            if (uu1.k()) {
                Integer g = uu1.g();
                if (g == null || g.intValue() <= 0) {
                    this.a.setCornerRadius((float) getResources().getDimensionPixelSize(C0707R.dimen.tooltip_corner_radius));
                } else {
                    this.a.setCornerRadius((float) g.intValue());
                }
            } else {
                this.a.setCornerRadius(0.0f);
                this.a.setSideMargin(0);
            }
            this.a.setDrawArrowEnabled(uu1.i());
            Integer b2 = uu1.b();
            if (b2 != null) {
                this.a.h(b2.intValue());
            }
            AnimatorSet animatorSet = this.v;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.v.end();
            }
            view.getClass();
            this.a.setAbove(k(view));
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int i = iArr[1];
            int measuredHeight = getMeasuredHeight();
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            int i2 = iArr2[1];
            int measuredHeight2 = view.getMeasuredHeight();
            int measuredHeight3 = this.a.getMeasuredHeight() / 2;
            int i3 = this.a.f() ? i2 - measuredHeight3 : i2 + measuredHeight2 + measuredHeight3;
            if (!(i3 >= i && i3 <= i + measuredHeight)) {
                e();
                return;
            }
            View view2 = this.u;
            if (view2 != null) {
                view2.addOnAttachStateChangeListener(this.y);
            } else {
                view.addOnAttachStateChangeListener(this.y);
            }
            this.a.setHidden(false);
            uu1.d(new a());
            this.a.setConfiguration(uu1);
            this.n = view;
            this.f = false;
            if (view != null) {
                if (!this.a.getConfiguration().isPresent() || !this.a.getConfiguration().get().e()) {
                    z2 = false;
                }
                if (z2) {
                    ImageView imageView = new ImageView(this.n.getContext());
                    this.o = imageView;
                    imageView.setImageDrawable(androidx.core.content.a.d(this.n.getContext(), C0707R.drawable.bg_highlight));
                    this.o.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    addView(this.o);
                    this.o.setLayoutParams(new FrameLayout.LayoutParams(this.n.getLayoutParams()));
                    this.o.invalidate();
                }
            }
            removeCallbacks(this.w);
            b bVar = new b();
            this.w = bVar;
            post(bVar);
            return;
        }
        n(view);
    }

    /* access modifiers changed from: protected */
    public void m() {
        this.a.g();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.q = MotionEvent.obtain(motionEvent);
        } else if (action == 2) {
            MotionEvent motionEvent2 = this.q;
            if (motionEvent2 != null && Math.abs(motionEvent2.getY() - motionEvent.getY()) > ((float) this.c)) {
                this.s = true;
                this.t = true;
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View, android.view.ViewGroup
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int top = this.a.getTop();
        int measuredHeight = this.a.getMeasuredHeight();
        this.a.layout(i, top, this.a.getMeasuredWidth() + i, measuredHeight + top);
        View view = this.n;
        if (view != null) {
            if (this.o != null) {
                Point h = h(this.n);
                ImageView imageView = this.o;
                int i5 = h.x;
                imageView.layout(i5, h.y - (view.getHeight() / 2), this.n.getWidth() + i5, (this.n.getHeight() * 2) + h.y);
            }
            n(this.n);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        MotionEvent motionEvent2;
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            this.s = false;
            this.t = false;
            MotionEvent motionEvent3 = this.q;
            if (motionEvent3 != null) {
                motionEvent3.recycle();
                this.q = null;
            }
        }
        if (!(!this.t || (viewGroup2 = this.r) == null || (motionEvent2 = this.q) == null)) {
            this.t = false;
            viewGroup2.dispatchTouchEvent(motionEvent2);
            this.q.recycle();
            this.q = null;
        }
        if (!this.s || (viewGroup = this.r) == null) {
            return super.onTouchEvent(motionEvent);
        }
        return viewGroup.dispatchTouchEvent(motionEvent);
    }

    public void setOnAttachStateChangeListenerOn(View view) {
        this.u = view;
    }

    public void setOnScrollerListenerOn(c cVar) {
        this.p = cVar;
        cVar.d(getOnScrollListener());
    }

    public TooltipContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = true;
        this.x = new d(this);
        this.y = new e();
        this.b = context.getResources().getDimensionPixelOffset(C0707R.dimen.tooltip_distance_from_view);
        this.c = ViewConfiguration.get(context).getScaledTouchSlop();
        e eVar = new e(context);
        this.a = eVar;
        addView(eVar, -1, -2);
        eVar.setHidden(true);
    }
}
