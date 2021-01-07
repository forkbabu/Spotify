package com.spotify.voice.experience.view.listening;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.spotify.music.C0707R;
import com.spotify.voice.experience.view.listening.c;

public class ListeningView extends View {
    private float a;
    private float b;
    private final c[] c;
    private final ValueAnimator f;
    private float n;

    public ListeningView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static c a(float f2, float f3, float f4, int i, float f5) {
        c.a aVar = new c.a(f2, f3, f4);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(f5);
        paint.setColor(i);
        return new c(aVar, paint);
    }

    public /* synthetic */ void b(ValueAnimator valueAnimator) {
        this.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = 0;
        while (true) {
            c[] cVarArr = this.c;
            if (i < cVarArr.length) {
                cVarArr[i].c(this.n);
                i++;
            } else {
                postInvalidate();
                return;
            }
        }
    }

    public /* synthetic */ void c(float f2) {
        this.f.cancel();
        this.f.setFloatValues(this.n, f2);
        this.f.start();
    }

    public void d(float f2) {
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new b(this, f2));
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = 0;
        while (true) {
            c[] cVarArr = this.c;
            if (i < cVarArr.length) {
                c cVar = cVarArr[i];
                canvas.drawCircle(this.a, this.b, cVar.b(), cVar.a());
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        this.a = ((float) View.MeasureSpec.getSize(i)) / 2.0f;
        this.b = ((float) View.MeasureSpec.getSize(i2)) / 2.0f;
        super.onMeasure(i, i2);
    }

    public ListeningView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c[] cVarArr = new c[3];
        this.c = cVarArr;
        Resources resources = getResources();
        cVarArr[0] = a(resources.getDimension(C0707R.dimen.circle_radius), resources.getDimension(C0707R.dimen.circle_radius), 1.0f, resources.getColor(C0707R.color.inner_circle_color), (float) resources.getDimensionPixelSize(C0707R.dimen.inner_circle_stroke_width));
        cVarArr[1] = a(resources.getDimension(C0707R.dimen.circle_radius), resources.getDimension(C0707R.dimen.middle_circle_max_radius), 1.4f, resources.getColor(C0707R.color.middle_circle_color), (float) resources.getDimensionPixelSize(C0707R.dimen.circle_stroke_width));
        cVarArr[2] = a(resources.getDimension(C0707R.dimen.circle_radius), resources.getDimension(C0707R.dimen.outer_circle_max_radius), 2.2f, resources.getColor(C0707R.color.outer_circle_color), (float) resources.getDimensionPixelSize(C0707R.dimen.circle_stroke_width));
        if (isInEditMode()) {
            cVarArr[0].c(1.0f);
            cVarArr[1].c(1.0f);
            cVarArr[2].c(1.0f);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f = valueAnimator;
        valueAnimator.setDuration(100L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new a(this));
    }
}
