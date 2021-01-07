package com.spotify.music.nowplaying.drivingmode.view.voiceinputanimation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import androidx.core.content.a;
import com.spotify.encore.foundation.R;
import java.util.ArrayList;

public class VoiceInputAnimationView extends View implements b, ValueAnimator.AnimatorUpdateListener {
    private final Paint a;
    private final ArrayList<RectF> b;
    private float c;
    private float f;
    private float n;
    private float o;
    private float p;
    private ValueAnimator q;

    public VoiceInputAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(float f2) {
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.q.setFloatValues(this.c, f2);
            this.q.start();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        float f2;
        float f3;
        super.draw(canvas);
        for (int i = 0; i < this.b.size(); i++) {
            RectF rectF = this.b.get(i);
            float f4 = this.o;
            float f5 = this.n;
            float f6 = ((this.f + f5) * ((float) i)) + f4;
            rectF.left = f6;
            rectF.right = f6 + f5;
            if (i == 1) {
                f3 = this.p;
                f2 = 0.75f;
            } else if (i == 2) {
                f3 = this.p;
                f2 = 0.5f;
            } else {
                f3 = this.p;
                f2 = 0.25f;
            }
            float f7 = f3 * f2 * this.c;
            float f8 = f5 / 2.0f;
            if (f7 < f8) {
                f7 = f8;
            }
            float f9 = this.p;
            rectF.top = f9 - f7;
            rectF.bottom = f9 + f7;
            canvas.drawRoundRect(rectF, f5, f5, this.a);
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.q.removeAllUpdateListeners();
        this.q = null;
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        float size = (float) View.MeasureSpec.getSize(i);
        this.o = (size - (((((float) this.b.size()) - 1.0f) * this.f) + (this.n * ((float) this.b.size())))) / 2.0f;
        float f2 = size * 0.07f;
        this.n = f2;
        this.f = f2;
        this.p = ((float) View.MeasureSpec.getSize(i2)) / 2.0f;
        super.onMeasure(i, i2);
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.voiceinputanimation.b
    public void setVoiceAudioPeak(float f2) {
        if (getHandler() != null && this.q != null) {
            getHandler().post(new a(this, f2));
        }
    }

    public VoiceInputAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ArrayList<RectF> arrayList = new ArrayList<>(4);
        this.b = arrayList;
        Paint paint = new Paint();
        this.a = paint;
        paint.setColor(a.b(context, R.color.green_light));
        paint.setAntiAlias(true);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.q = valueAnimator;
        valueAnimator.addUpdateListener(this);
        this.q.setInterpolator(new AccelerateInterpolator());
        this.q.setDuration(50L);
        arrayList.add(new RectF());
        arrayList.add(new RectF());
        arrayList.add(new RectF());
        arrayList.add(new RectF());
    }
}
