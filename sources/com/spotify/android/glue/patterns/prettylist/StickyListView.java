package com.spotify.android.glue.patterns.prettylist;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.spotify.android.glue.patterns.prettylist.t;
import java.util.Iterator;
import java.util.LinkedList;

public class StickyListView extends ViewGroup implements t {
    private boolean a;
    private final FrameLayout b;
    private final b c;
    private final AbsListView.LayoutParams f;
    private final c n;
    private View o;
    private final Rect p;
    private boolean q;
    private boolean r;
    private int s;
    private View t;
    private int u;
    private final int[] v;
    private final int[] w;
    private boolean x;
    private final LinkedList<t.a> y;

    /* access modifiers changed from: private */
    public class b extends HidingHeaderListView {
        public b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            super.setOnScrollListener(StickyListView.this.n);
        }

        @Override // android.widget.AbsListView
        public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
            StickyListView.this.n.a(onScrollListener);
        }
    }

    /* access modifiers changed from: private */
    public class c implements AbsListView.OnScrollListener, Runnable {
        private AbsListView.OnScrollListener a;
        private int b;
        private boolean c;

        c(a aVar) {
        }

        private void b() {
            if (StickyListView.this.f() != StickyListView.this.h()) {
                StickyListView.this.requestLayout();
            }
        }

        public void a(AbsListView.OnScrollListener onScrollListener) {
            this.a = onScrollListener;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (!StickyListView.this.a) {
                b();
                StickyListView.this.g();
                AbsListView.OnScrollListener onScrollListener = this.a;
                if (onScrollListener != null) {
                    onScrollListener.onScroll(absListView, i, i2, i3);
                }
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (!StickyListView.this.a) {
                this.b = i;
                boolean z = this.c;
                this.c = i != 0;
                b();
                StickyListView.this.g();
                AbsListView.OnScrollListener onScrollListener = this.a;
                if (onScrollListener != null) {
                    onScrollListener.onScrollStateChanged(absListView, i);
                }
                if (!z && this.c) {
                    StickyListView stickyListView = StickyListView.this;
                    int i2 = q4.g;
                    int i3 = Build.VERSION.SDK_INT;
                    stickyListView.postOnAnimation(this);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!StickyListView.this.a) {
                b();
                StickyListView.this.g();
                if (this.c && StickyListView.this.getWindowToken() != null) {
                    StickyListView stickyListView = StickyListView.this;
                    int i = q4.g;
                    int i2 = Build.VERSION.SDK_INT;
                    stickyListView.postOnAnimation(this);
                }
            }
        }
    }

    public StickyListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void g() {
        int stickinessOffset = getStickinessOffset();
        int min = this.c.getFirstVisiblePosition() == 0 ? Math.min(-this.b.getTop(), stickinessOffset) : stickinessOffset;
        float f2 = stickinessOffset != 0 ? ((float) min) / ((float) stickinessOffset) : 0.0f;
        Iterator<t.a> it = this.y.iterator();
        while (it.hasNext()) {
            it.next().a(min, f2);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean h() {
        return this.q && (this.c.getFirstVisiblePosition() > 0 || this.b.getTop() <= (-getStickinessOffset()));
    }

    private void setStickingToTop(boolean z) {
        if (this.o != null && z != this.r) {
            this.r = z;
            g();
        }
    }

    @Override // com.spotify.android.glue.patterns.prettylist.t
    public void a(t.a aVar) {
        this.y.add(aVar);
    }

    public boolean f() {
        return this.r;
    }

    public View getHeaderView() {
        return this.o;
    }

    public ListView getListView() {
        return this.c;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.t
    public int getStickinessOffset() {
        return this.s;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View view = this.o;
        if (view == null || !this.r) {
            return false;
        }
        view.getHitRect(this.p);
        if (!this.p.contains((int) motionEvent.getX(), (int) motionEvent.getY()) || !this.c.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        this.x = true;
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = 0;
        this.c.layout(0, 0, i5, i4 - i2);
        ViewParent parent = this.o.getParent();
        FrameLayout frameLayout = this.b;
        boolean z2 = parent == frameLayout;
        boolean z3 = frameLayout.getParent() == this.c;
        if (z2 && !z3) {
            this.b.removeViewInLayout(this.o);
            addViewInLayout(this.o, -1, this.f);
            z2 = false;
        }
        if (!z2 && this.q) {
            View view = this.o;
            view.layout(0, 0, i5, view.getMeasuredHeight());
        }
        View view2 = this.o;
        if (view2 != null && this.q) {
            if (this.t == null) {
                i6 = view2.getMeasuredHeight() - this.u;
            } else {
                view2.getLocationInWindow(this.v);
                this.t.getLocationInWindow(this.w);
                i6 = Math.max(0, (this.w[1] - this.v[1]) - this.u);
            }
        }
        this.s = i6;
        boolean h = h();
        if (z3) {
            if (h && z2) {
                boolean hasFocus = this.o.hasFocus();
                this.b.removeViewInLayout(this.o);
                addViewInLayout(this.o, -1, this.f);
                if (hasFocus && !this.o.hasFocus()) {
                    this.o.requestFocus();
                }
            } else if (!h && !z2) {
                removeViewInLayout(this.o);
                this.b.addView(this.o);
            }
        }
        setStickingToTop(h);
        if (h) {
            this.o.offsetTopAndBottom(-this.s);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        this.o.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
        this.c.measure(i, i2);
        setMeasuredDimension(this.c.getMeasuredWidth(), this.c.getMeasuredHeight());
        this.f.width = this.o.getMeasuredWidth();
        this.f.height = this.o.getMeasuredHeight();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.x) {
            z = this.c.onTouchEvent(motionEvent);
        } else {
            z = super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.x = false;
        }
        return z;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.t
    public void setHeaderBackgroundColor(int i) {
        this.b.setBackgroundColor(i);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.t
    public void setHeaderView(View view) {
        View view2 = this.o;
        if (view2 != null) {
            removeView(view2);
            this.b.removeView(this.o);
        }
        if (view == null) {
            view = new View(getContext());
            view.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        }
        this.o = view;
        addView(view);
        requestLayout();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.t
    public void setSticky(boolean z) {
        this.q = z;
        requestLayout();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.t
    public void setStickyView(View view) {
        this.t = view;
        requestLayout();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.t
    public void setStickyViewOffset(int i) {
        this.u = i;
        requestLayout();
    }

    public StickyListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(0, 0);
        this.f = layoutParams;
        this.n = new c(null);
        this.p = new Rect();
        this.v = new int[2];
        this.w = new int[2];
        this.y = new LinkedList<>();
        this.a = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setLayoutParams(layoutParams);
        b bVar = new b(context, attributeSet, i);
        this.c = bVar;
        bVar.setId(16908298);
        bVar.setCanAlwaysHideHeader(true);
        addView(bVar);
        bVar.addHeaderView(frameLayout, null, false);
        this.a = false;
        View view = new View(getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        setHeaderView(view);
    }
}
