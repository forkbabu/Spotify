package com.spotify.mobile.android.storytelling.controls.stories;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class StoriesProgressBar extends View {
    private int a;
    private int b;
    private float c;
    private int f;
    private int n;
    private int o;
    private int p;
    private int q;
    private final Rect r;
    private final Paint s;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StoriesProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        h.e(context, "context");
    }

    private final void a(int i, int i2) {
        int i3;
        int i4 = this.a;
        if (i4 > 0) {
            i3 = (((i - q4.r(this)) - q4.q(this)) - ((i4 - 1) * this.q)) / this.a;
        } else {
            i3 = 0;
        }
        this.o = i3;
        this.p = (i2 - getPaddingTop()) - getPaddingBottom();
    }

    public final void b(int i, float f2) {
        this.b = i;
        this.c = f2;
        invalidate();
    }

    public final int getBarsBackgroundColor() {
        return this.f;
    }

    public final int getBarsProgressColor() {
        return this.n;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f2;
        h.e(canvas, "canvas");
        super.onDraw(canvas);
        Rect rect = this.r;
        Integer valueOf = Integer.valueOf(q4.r(this));
        Integer valueOf2 = Integer.valueOf((getWidth() - q4.q(this)) - this.o);
        if (q4.o(this) == 1) {
            valueOf = valueOf2;
        }
        rect.left = valueOf.intValue();
        rect.top = getPaddingTop();
        rect.right = rect.left + this.o;
        rect.bottom = this.p;
        int i = this.a;
        int i2 = 0;
        while (i2 < i) {
            int i3 = this.b;
            if (i2 < i3) {
                f2 = 1.0f;
            } else {
                f2 = i2 == i3 ? this.c : 0.0f;
            }
            Rect rect2 = this.r;
            this.s.setColor(this.f);
            canvas.drawRect(rect2, this.s);
            Rect rect3 = this.r;
            this.s.setColor(this.n);
            canvas.drawRect((float) rect3.left, (float) rect3.top, (((float) rect3.width()) * f2) + ((float) rect3.left), (float) rect3.bottom, this.s);
            int i4 = this.o + this.q;
            Rect rect4 = this.r;
            Integer valueOf3 = Integer.valueOf(i4);
            Integer valueOf4 = Integer.valueOf(-i4);
            if (q4.o(this) == 1) {
                valueOf3 = valueOf4;
            }
            rect4.offset(valueOf3.intValue(), 0);
            i2++;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        a(i, i2);
    }

    public final void setBarsBackgroundColor(int i) {
        this.f = i;
    }

    public final void setBarsProgressColor(int i) {
        this.n = i;
    }

    public final void setStoriesCount(int i) {
        this.a = i;
        a(getWidth(), getHeight());
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoriesProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        this.r = new Rect();
        this.s = new Paint();
        h.e(context, "context");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, dx1.a, i, 0);
        try {
            this.a = obtainStyledAttributes.getInt(5, 10);
            this.b = obtainStyledAttributes.getInt(0, 4);
            this.c = obtainStyledAttributes.getFraction(1, 1, 1, 0.4f);
            this.q = obtainStyledAttributes.getDimensionPixelSize(3, context.getResources().getDimensionPixelSize(C0707R.dimen.default_progress_bar_padding));
            this.f = obtainStyledAttributes.getColor(2, i2.c(context.getResources(), C0707R.color.default_progress_bar_background_color, context.getTheme()));
            this.n = obtainStyledAttributes.getColor(4, i2.c(context.getResources(), C0707R.color.default_progress_bar_progress_color, context.getTheme()));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
