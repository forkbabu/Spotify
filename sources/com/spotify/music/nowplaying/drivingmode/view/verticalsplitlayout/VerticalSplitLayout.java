package com.spotify.music.nowplaying.drivingmode.view.verticalsplitlayout;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.o5;

public class VerticalSplitLayout extends FrameLayout implements fqd, e {
    private View a;
    private View b;
    private View c;
    private o5 f;
    private int n;
    private b o;
    private b p;
    private int q;
    private int r;
    private boolean s;
    public o5.c t;

    class a extends o5.c {
        a() {
        }

        @Override // defpackage.o5.c
        public int b(View view, int i, int i2) {
            return i;
        }

        @Override // defpackage.o5.c
        public int d(View view) {
            return VerticalSplitLayout.this.getHeight();
        }

        @Override // defpackage.o5.c
        public void i(int i) {
            if (i != 0) {
                return;
            }
            if (VerticalSplitLayout.this.c == VerticalSplitLayout.this.a) {
                if (VerticalSplitLayout.this.a.getBottom() > VerticalSplitLayout.this.getHeight() / 2) {
                    VerticalSplitLayout verticalSplitLayout = VerticalSplitLayout.this;
                    verticalSplitLayout.c = verticalSplitLayout.b;
                }
            } else if (VerticalSplitLayout.this.b.getTop() < VerticalSplitLayout.this.getHeight() / 2) {
                VerticalSplitLayout verticalSplitLayout2 = VerticalSplitLayout.this;
                verticalSplitLayout2.c = verticalSplitLayout2.a;
            }
        }

        @Override // defpackage.o5.c
        public void j(View view, int i, int i2, int i3, int i4) {
            if (view == VerticalSplitLayout.this.a) {
                float height = ((float) ((-VerticalSplitLayout.this.n) - i2)) / (((float) VerticalSplitLayout.this.getHeight()) - (((float) VerticalSplitLayout.this.n) * 2.0f));
                if (VerticalSplitLayout.this.o != null) {
                    VerticalSplitLayout.this.o.a(1.0f - height, VerticalSplitLayout.this.s);
                }
                if (VerticalSplitLayout.this.p != null) {
                    VerticalSplitLayout.this.p.a(height, VerticalSplitLayout.this.s);
                }
                if (height == 0.0f) {
                    VerticalSplitLayout.this.s = true;
                }
                q4.A(VerticalSplitLayout.this.b, i4);
            }
            if (view == VerticalSplitLayout.this.b) {
                float height2 = ((float) (i2 - VerticalSplitLayout.this.n)) / (((float) VerticalSplitLayout.this.getHeight()) - (((float) VerticalSplitLayout.this.n) * 2.0f));
                if (VerticalSplitLayout.this.o != null) {
                    VerticalSplitLayout.this.o.a(height2, VerticalSplitLayout.this.s);
                }
                if (VerticalSplitLayout.this.p != null) {
                    VerticalSplitLayout.this.p.a(1.0f - height2, VerticalSplitLayout.this.s);
                }
                if (height2 == 0.0f) {
                    VerticalSplitLayout.this.s = true;
                }
                q4.A(VerticalSplitLayout.this.a, i4);
            }
            VerticalSplitLayout verticalSplitLayout = VerticalSplitLayout.this;
            verticalSplitLayout.q = verticalSplitLayout.a.getTop();
            VerticalSplitLayout verticalSplitLayout2 = VerticalSplitLayout.this;
            verticalSplitLayout2.r = verticalSplitLayout2.b.getTop();
        }

        @Override // defpackage.o5.c
        public void k(View view, float f, float f2) {
            if (view == VerticalSplitLayout.this.a) {
                VerticalSplitLayout.o(VerticalSplitLayout.this, view, f2);
            } else {
                VerticalSplitLayout.p(VerticalSplitLayout.this, view, f2);
            }
        }

        @Override // defpackage.o5.c
        public boolean l(View view, int i) {
            return view == VerticalSplitLayout.this.c;
        }
    }

    public interface b {
        void a(float f, boolean z);
    }

    public VerticalSplitLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static void o(VerticalSplitLayout verticalSplitLayout, View view, float f2) {
        int i;
        verticalSplitLayout.getClass();
        double d = (double) f2;
        boolean z = true;
        if (d <= 1000.0d && (d < -1000.0d || view.getBottom() <= verticalSplitLayout.getHeight() / 2)) {
            z = false;
        }
        if (z) {
            i = (verticalSplitLayout.getHeight() - verticalSplitLayout.n) - (view.getBottom() - view.getTop());
        } else {
            i = verticalSplitLayout.n + (-(view.getBottom() - view.getTop()));
        }
        if (verticalSplitLayout.f.H(0, i)) {
            int i2 = q4.g;
            int i3 = Build.VERSION.SDK_INT;
            verticalSplitLayout.postInvalidateOnAnimation();
        }
    }

    static void p(VerticalSplitLayout verticalSplitLayout, View view, float f2) {
        verticalSplitLayout.getClass();
        double d = (double) f2;
        boolean z = true;
        if (d > 1000.0d || (d >= -1000.0d && view.getTop() >= verticalSplitLayout.getHeight() / 2)) {
            z = false;
        }
        if (verticalSplitLayout.f.H(0, z ? verticalSplitLayout.n : verticalSplitLayout.getHeight() - verticalSplitLayout.n)) {
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            verticalSplitLayout.postInvalidateOnAnimation();
        }
    }

    /* access modifiers changed from: private */
    public void v() {
        this.a.setTop(-this.n);
        this.a.setBottom(getHeight() - this.n);
        this.b.setTop(getHeight() - this.n);
        this.b.setBottom((getHeight() * 2) - this.n);
        this.q = this.a.getTop();
        this.r = this.b.getTop();
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.f.k(true)) {
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            postInvalidateOnAnimation();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a = getChildAt(0);
        View childAt = getChildAt(1);
        this.b = childAt;
        this.c = childAt;
        postInvalidateOnAnimation();
        this.f = o5.l(this, 1.0f, this.t);
        getViewTreeObserver().addOnPreDrawListener(new c(this));
        setOnSystemUiVisibilityChangeListener(new b(this));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f.I(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f.y(motionEvent);
        return true;
    }

    public boolean r() {
        View view = this.c;
        if (view != null && view == this.a) {
            return true;
        }
        return false;
    }

    public void s(int i) {
        View view = this.c;
        boolean z = false;
        if (view != null && view == this.a) {
            z = true;
        }
        if (z) {
            this.a.setTop((-getHeight()) + this.n);
            this.a.setBottom(this.n);
            this.b.setTop(this.n);
            this.b.setBottom(getHeight());
            this.q = this.a.getTop();
            this.r = this.b.getTop();
            return;
        }
        v();
    }

    public void setBottomListener(b bVar) {
        this.p = bVar;
    }

    @Override // defpackage.fqd
    public void setColor(int i) {
        setBackgroundColor(i);
    }

    public void setTopListener(b bVar) {
        this.o = bVar;
    }

    public void t() {
        this.s = false;
        this.f.J(this.b, 0, this.n);
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        postInvalidateOnAnimation();
    }

    public void u() {
        this.s = false;
        this.f.J(this.a, 0, -this.n);
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        postInvalidateOnAnimation();
    }

    public VerticalSplitLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.s = true;
        this.t = new a();
    }
}
