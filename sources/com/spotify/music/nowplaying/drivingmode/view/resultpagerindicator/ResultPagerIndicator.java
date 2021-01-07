package com.spotify.music.nowplaying.drivingmode.view.resultpagerindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.a;
import androidx.viewpager.widget.ViewPager;
import com.spotify.encore.foundation.R;

public class ResultPagerIndicator extends View implements ViewPager.i {
    private final int a;
    private final int b;
    private int c;
    private final Paint f;
    private final Paint n;
    private ViewPager o;

    public ResultPagerIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getItemCount() {
        ViewPager viewPager = this.o;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return 0;
        }
        return this.o.getAdapter().d();
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void a(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void f(int i, float f2, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void g(int i) {
        this.c = i;
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int itemCount;
        if (this.o != null && (itemCount = getItemCount()) > 2) {
            int saveCount = canvas.getSaveCount();
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            int measuredWidth = getMeasuredWidth() / itemCount;
            for (int i = 0; i < itemCount; i++) {
                int i2 = (this.b + measuredWidth) * i;
                canvas.drawRect((float) i2, 0.0f, (float) (i2 + measuredWidth), (float) this.a, this.f);
            }
            int i3 = (this.b + measuredWidth) * this.c;
            canvas.drawRect((float) i3, 0.0f, (float) (i3 + measuredWidth), (float) this.a, this.n);
            canvas.restoreToCount(saveCount);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getItemCount() <= 2) {
            setVisibility(8);
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int paddingTop = getPaddingTop() + this.a;
        setVisibility(0);
        setMeasuredDimension(size, getPaddingBottom() + paddingTop);
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.o;
        if (viewPager2 != null) {
            viewPager2.w(this);
        }
        this.o = viewPager;
        viewPager.c(this);
        this.c = this.o.getCurrentItem();
        invalidate();
    }

    public ResultPagerIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = nud.g(8.0f, context.getResources());
        this.b = nud.f(4.0f, context.getResources());
        Paint paint = new Paint();
        this.f = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(a.b(context, R.color.white_30));
        Paint paint2 = new Paint();
        this.n = paint2;
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(a.b(context, R.color.white));
    }
}
