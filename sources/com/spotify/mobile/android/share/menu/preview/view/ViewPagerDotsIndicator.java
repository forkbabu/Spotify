package com.spotify.mobile.android.share.menu.preview.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.mobile.android.share.menu.preview.c;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class ViewPagerDotsIndicator extends View {
    private int a;
    private int b;
    private int c;
    private int f;
    private int n;
    private float o;
    private float p;
    private int q;
    private float r;
    private final Paint s;
    private b t;
    private a u;

    /* access modifiers changed from: private */
    public final class a extends RecyclerView.g {
        private final RecyclerView.e<RecyclerView.b0> a;
        final /* synthetic */ ViewPagerDotsIndicator b;

        public a(ViewPagerDotsIndicator viewPagerDotsIndicator, RecyclerView.e<RecyclerView.b0> eVar) {
            h.e(eVar, "adapter");
            this.b = viewPagerDotsIndicator;
            this.a = eVar;
        }

        private final void g(int i) {
            this.b.q = i;
            this.b.postInvalidate();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void a() {
            g(this.a.u());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void b(int i, int i2) {
            this.b.q = i2;
            this.b.postInvalidate();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void c(int i, int i2, Object obj) {
            this.b.q = i2;
            this.b.postInvalidate();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void d(int i, int i2) {
            this.b.q = i2;
            this.b.postInvalidate();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void e(int i, int i2, int i3) {
            this.b.q = i3;
            this.b.postInvalidate();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void f(int i, int i2) {
            this.b.q = i2;
            this.b.postInvalidate();
        }
    }

    /* access modifiers changed from: private */
    public final class b extends ViewPager2.g {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void b(int i, float f, int i2) {
            ViewPagerDotsIndicator.this.r = Math.max(f, 0.0f) + ((float) i);
            ViewPagerDotsIndicator.this.postInvalidate();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void c(int i) {
            ViewPagerDotsIndicator.this.r = (float) i;
            ViewPagerDotsIndicator.this.postInvalidate();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ViewPagerDotsIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        h.e(context, "context");
    }

    private final int c(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            int size = View.MeasureSpec.getSize(i2);
            return i > size ? size : i;
        } else if (mode != 1073741824) {
            return i;
        } else {
            return View.MeasureSpec.getSize(i2);
        }
    }

    private final int getDotSize() {
        return Math.max(this.a, this.b);
    }

    private final int getDotsWidth() {
        return ((this.c - getDotSize()) * (this.q - 1)) + (this.q * getDotSize());
    }

    public final void d(ViewPager2 viewPager2) {
        h.e(viewPager2, "viewPager");
        RecyclerView.e adapter = viewPager2.getAdapter();
        if (adapter != null) {
            h.d(adapter, "viewPager.adapter ?: err…dapter while connecting\")");
            this.q = adapter.u();
            a aVar = new a(this, adapter);
            this.u = aVar;
            this.t = new b();
            if (aVar != null) {
                adapter.T(aVar);
                b bVar = this.t;
                if (bVar != null) {
                    viewPager2.e(bVar);
                    postInvalidate();
                    return;
                }
                h.k("pagesCallback");
                throw null;
            }
            h.k("adapterCallback");
            throw null;
        }
        throw new IllegalStateException("ViewPager without adapter while connecting".toString());
    }

    public final void e(ViewPager2 viewPager2) {
        h.e(viewPager2, "viewPager");
        RecyclerView.e adapter = viewPager2.getAdapter();
        if (adapter != null) {
            h.d(adapter, "viewPager.adapter ?: err…ter while disconnecting\")");
            a aVar = this.u;
            if (aVar != null) {
                adapter.W(aVar);
                b bVar = this.t;
                if (bVar != null) {
                    viewPager2.j(bVar);
                } else {
                    h.k("pagesCallback");
                    throw null;
                }
            } else {
                h.k("adapterCallback");
                throw null;
            }
        } else {
            throw new IllegalStateException("ViewPager without adapter while disconnecting".toString());
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f2;
        h.e(canvas, "canvas");
        super.onDraw(canvas);
        float f3 = ((float) this.b) / 2.0f;
        this.s.setColor(this.n);
        int i = this.q;
        for (int i2 = 0; i2 < i; i2++) {
            canvas.drawCircle(this.o + ((float) (this.c * i2)), this.p, f3, this.s);
        }
        this.s.setColor(this.f);
        if (q4.o(this) == 1) {
            f2 = (((float) getWidth()) - this.o) - (this.r * ((float) this.c));
        } else {
            f2 = this.o + (this.r * ((float) this.c));
        }
        canvas.drawCircle(f2, this.p, ((float) this.a) / 2.0f, this.s);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        if (this.q > 1) {
            i4 = getPaddingLeft() + getDotsWidth() + getPaddingRight();
            i3 = getPaddingBottom() + getPaddingTop() + getDotSize();
        } else {
            i3 = 0;
        }
        int c2 = c(i4, i);
        int c3 = c(i3, i2);
        float dotSize = ((float) getDotSize()) / 2.0f;
        this.o = (((float) (c2 - getDotsWidth())) / 2.0f) + dotSize;
        this.p = (((float) (c3 - getDotSize())) / 2.0f) + dotSize;
        setMeasuredDimension(c2, c3);
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewPagerDotsIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        this.f = -1;
        this.n = -1;
        this.q = isInEditMode() ? 3 : 0;
        Paint paint = new Paint();
        this.s = paint;
        h.e(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0707R.dimen.view_pager_dots_indicator_default_size);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0707R.dimen.view_pager_dots_indicator_default_spacing);
        int c2 = i2.c(getResources(), C0707R.color.view_pager_dots_indicator_default_active_color, context.getTheme());
        int c3 = i2.c(getResources(), C0707R.color.view_pager_dots_indicator_default_inactive_color, context.getTheme());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a, i, 0);
        h.d(obtainStyledAttributes, "context.obtainStyledAttr…    defStyleRes\n        )");
        try {
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
            this.a = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize3);
            this.b = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize3);
            this.c = obtainStyledAttributes.getDimensionPixelSize(5, dimensionPixelSize2);
            this.f = obtainStyledAttributes.getColor(0, c2);
            this.n = obtainStyledAttributes.getColor(2, c3);
            obtainStyledAttributes.recycle();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
