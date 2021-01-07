package com.spotify.paste.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.music.C0707R;

public final class ViewPagerIndicator extends View implements ViewPager.i {
    private final int a;
    private final int b;
    private float c;
    private final Paint f;
    private final Paint n;
    private ViewPager o;
    private ViewPager2 p;
    private final ViewPager2.g q;

    class a extends ViewPager2.g {
        a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void a(int i) {
            ViewPagerIndicator.this.getClass();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void b(int i, float f, int i2) {
            ViewPagerIndicator.this.f(i, f, i2);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void c(int i) {
            ViewPagerIndicator.this.g(i);
        }
    }

    public ViewPagerIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.pasteDefaultsViewPagerIndicatorStyle);
    }

    private void b() {
        ViewPager viewPager = this.o;
        if (viewPager != null) {
            viewPager.w(this);
            this.o = null;
        }
        ViewPager2 viewPager2 = this.p;
        if (viewPager2 != null) {
            viewPager2.j(this.q);
            this.p = null;
        }
    }

    private int getItemCount() {
        RecyclerView.e adapter;
        androidx.viewpager.widget.a adapter2;
        ViewPager viewPager = this.o;
        if (viewPager != null && (adapter2 = viewPager.getAdapter()) != null) {
            return adapter2.d();
        }
        ViewPager2 viewPager2 = this.p;
        if (viewPager2 == null || (adapter = viewPager2.getAdapter()) == null) {
            return 0;
        }
        return adapter.u();
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void a(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void f(int i, float f2, int i2) {
        if (f2 <= 0.0f) {
            f2 = 0.0f;
        }
        this.c = ((float) i) + f2;
        postInvalidate();
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void g(int i) {
        this.c = (float) i;
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int itemCount = getItemCount();
        boolean z = true;
        if (itemCount > 1) {
            int save = canvas.save();
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            float f2 = ((float) this.a) / 2.0f;
            if (q4.o(this) != 1) {
                z = false;
            }
            int width = getWidth();
            for (int i = 0; i < itemCount; i++) {
                float f3 = ((float) ((this.a + this.b) * i)) + f2;
                if (z) {
                    f3 = ((float) width) - f3;
                }
                canvas.drawCircle(f3, f2, f2, this.f);
            }
            float f4 = (this.c * ((float) (this.a + this.b))) + f2;
            if (z) {
                f4 = ((float) width) - f4;
            }
            canvas.drawCircle(f4, f2, f2, this.n);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int itemCount = getItemCount();
        if (itemCount <= 1) {
            setVisibility(8);
            setMeasuredDimension(0, 0);
            return;
        }
        int i3 = this.a;
        int paddingRight = getPaddingRight() + getPaddingLeft() + ((itemCount - 1) * this.b) + (itemCount * i3);
        int paddingTop = getPaddingTop();
        setVisibility(0);
        setMeasuredDimension(paddingRight, getPaddingBottom() + paddingTop + i3);
    }

    @Deprecated
    public void setupWithViewPager(ViewPager viewPager) {
        b();
        this.o = viewPager;
        viewPager.c(this);
        this.c = (float) this.o.getCurrentItem();
        invalidate();
    }

    public ViewPagerIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q = new a();
        int g = nud.g(10.0f, context.getResources());
        int f2 = nud.f(6.0f, context.getResources());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.i, i, 0);
        this.a = obtainStyledAttributes.getDimensionPixelSize(2, g);
        this.b = obtainStyledAttributes.getDimensionPixelOffset(3, f2);
        int color = obtainStyledAttributes.getColor(1, -7829368);
        int color2 = obtainStyledAttributes.getColor(0, -1);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);
        Paint paint2 = new Paint();
        this.n = paint2;
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(color2);
    }

    public void setupWithViewPager(ViewPager2 viewPager2) {
        b();
        this.p = viewPager2;
        viewPager2.e(this.q);
        this.c = (float) this.p.getCurrentItem();
        invalidate();
    }
}
