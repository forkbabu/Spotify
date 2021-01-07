package com.spotify.android.glue.patterns.prettylist;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.android.glue.patterns.prettylist.t;

public abstract class o<T extends View & t> extends ViewGroup implements m {
    protected final T a;
    protected final PrettyHeaderView b;
    private final int c;
    private int f;
    private View n;
    private View o;
    private float p;
    private boolean q;
    private final t.a r;

    static class a extends Property<o<?>, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public Float get(o<?> oVar) {
            return Float.valueOf(((o) oVar).p);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(o<?> oVar, Float f) {
            oVar.setFilterModeLevel(f.floatValue());
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            o.this.q = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            o.this.q = false;
        }
    }

    class c implements t.a {
        c() {
        }

        @Override // com.spotify.android.glue.patterns.prettylist.t.a
        public void a(int i, float f) {
            o.this.f = i;
            o.this.b.a(i, f);
            if (!o.g(o.this)) {
                o.this.o();
                o.this.n();
                o.this.m();
            }
        }
    }

    static {
        new a(Float.class, "filterModeLevel");
    }

    public o(Context context, View view, int i) {
        super(context);
        new b();
        c cVar = new c();
        this.r = cVar;
        this.c = i;
        T l = l(context);
        this.a = l;
        l.a(cVar);
        PrettyHeaderView prettyHeaderView = new PrettyHeaderView(context, view);
        this.b = prettyHeaderView;
        prettyHeaderView.setTopPadding(i);
        l.setHeaderView(prettyHeaderView);
        l.setStickyViewOffset(i);
        addView(l);
        setHeaderSticky(true);
    }

    static boolean g(o oVar) {
        return oVar.q;
    }

    private int k() {
        float f2;
        View view = this.n;
        int i = 0;
        if (view == null) {
            return 0;
        }
        int measuredHeight = view.getMeasuredHeight();
        float f3 = ((float) this.f) / ((float) measuredHeight);
        if (f3 <= 1.0f) {
            f2 = nud.o(0.0f, 1.0f, 0.0f, (float) this.c, nud.o(0.0f, 1.0f, 1.0f, 0.4f, nud.c(0.0f, 1.0f, f3)));
        } else {
            View view2 = this.o;
            if (view2 != null) {
                i = view2.getMeasuredHeight();
            }
            f2 = (float) (((this.b.getMeasuredHeight() - (i / 2)) - this.f) - measuredHeight);
        }
        return (int) f2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void m() {
        View view = this.o;
        if (view != null) {
            View view2 = this.n;
            float f2 = 1.0f;
            if (view2 != null && this.q) {
                float c2 = nud.c(0.0f, 1.0f, nud.o(2.0f, 1.0f, 1.0f, 0.0f, ((float) Math.max(0, this.a.getStickinessOffset() - this.f)) / ((float) view2.getMeasuredHeight())));
                if (this.q) {
                    c2 = Math.max(c2, 1.0f - this.p);
                }
                f2 = c2;
            }
            view.setAlpha(f2);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void n() {
        float f2;
        View view = this.n;
        if (view != null) {
            float f3 = 0.0f;
            if (view == null) {
                f2 = 0.0f;
            } else {
                f2 = nud.c(0.0f, 1.0f, nud.o(0.75f, 0.1f, 0.0f, 1.0f, ((float) this.f) / ((float) view.getMeasuredHeight())));
            }
            View view2 = this.n;
            if (view2 != null && this.q) {
                f3 = this.p * nud.c(0.0f, 1.0f, nud.o(1.5f, 0.5f, 0.0f, 1.0f, ((float) Math.max(0, this.a.getStickinessOffset() - this.f)) / ((float) view2.getMeasuredHeight())));
            }
            float max = Math.max(f2, f3);
            if (max < 0.01f) {
                this.n.setVisibility(4);
            } else {
                this.n.setVisibility(0);
            }
            this.n.setAlpha(max);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void o() {
        View view = this.n;
        if (view != null) {
            view.offsetTopAndBottom(k() - this.n.getTop());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setFilterModeLevel(float f2) {
        this.p = f2;
        o();
        n();
        m();
    }

    public View getFilterView() {
        return this.n;
    }

    public View getHeaderAccessory() {
        return this.o;
    }

    public ImageView getHeaderBackgroundView() {
        return this.b.getBackgroundView();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public PrettyHeaderView getPrettyHeaderView() {
        return this.b;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public View getView() {
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract T l(Context context);

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        this.a.layout(0, 0, i5, i4 - i2);
        if (this.n != null) {
            int k = k();
            View view = this.n;
            view.layout(0, k, i5, view.getMeasuredHeight() + k);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 0) {
            int size = View.MeasureSpec.getSize(i);
            View view = this.n;
            int i3 = 0;
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                i3 = this.n.getMeasuredHeight();
            }
            this.b.setScrollingTopPadding(i3);
            this.a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
            setMeasuredDimension(size, this.a.getMeasuredHeight());
            return;
        }
        throw new RuntimeException(je.m0(o.class, new StringBuilder(), " doesn't support unspecified width."));
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public void setFilterView(View view) {
        View view2 = this.n;
        if (view2 != null) {
            removeView(view2);
        }
        this.n = view;
        if (view != null) {
            addView(view);
            o();
            n();
        }
        requestLayout();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public void setHeaderAccessory(View view) {
        this.o = view;
        this.b.setAccessory(view);
        this.a.setStickyView(view);
        if (view != null) {
            m();
        }
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public void setHeaderBackgroundColor(int i) {
        this.a.setHeaderBackgroundColor(i);
    }

    public void setHeaderCompactMode(boolean z) {
        this.b.setHeaderVisible(!z);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public void setHeaderSticky(boolean z) {
        this.a.setSticky(z);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public void setTitle(String str) {
        this.b.setTitle(str);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.m
    public void setToolbarUpdater(u uVar) {
        this.b.setToolbarUpdater(uVar);
    }
}
