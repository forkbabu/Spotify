package com.spotify.mobile.android.spotlets.tooltip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.common.base.Optional;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;

public class e extends FrameLayout {
    private final Paint a;
    private b b;
    private int c;
    private int f;
    private int n;
    private int o;
    private int p;
    private float q;
    private float r;
    private int s;
    private boolean t;
    private float u;
    private boolean v;
    private Optional<uu1> w = Optional.absent();
    FrameLayout x;
    private final RectF y = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    private final RectF z = new RectF(0.0f, 0.0f, 0.0f, 0.0f);

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            e.a(e.this, floatValue);
            e.b(e.this, floatValue);
            e.this.invalidate();
        }
    }

    public interface b {
    }

    public e(Context context) {
        super(context);
        Paint paint = new Paint();
        this.a = paint;
        setId(C0707R.id.tooltip_view);
        setWillNotDraw(false);
        Resources resources = getResources();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(androidx.core.content.a.b(getContext(), R.color.blue_light));
        int dimensionPixelSize = resources.getDimensionPixelSize(C0707R.dimen.tooltip_arrow_height);
        this.p = dimensionPixelSize;
        this.q = ((float) dimensionPixelSize) / ((float) Math.sqrt(2.0d));
        this.x = (FrameLayout) LayoutInflater.from(getContext()).inflate(C0707R.layout.tooltip_configuration_frame, (ViewGroup) this, true).findViewById(C0707R.id.tinkerbell_configuration_container);
    }

    static void a(e eVar, float f2) {
        int i = eVar.o;
        float f3 = ((1.0f - f2) * ((float) i)) / 2.0f;
        RectF rectF = eVar.y;
        rectF.left = (float) eVar.c;
        int i2 = eVar.f;
        rectF.top = ((float) i2) + f3;
        rectF.right = (float) eVar.n;
        rectF.bottom = ((float) (i2 + i)) - f3;
    }

    static void b(e eVar, float f2) {
        float f3 = eVar.q * f2;
        RectF rectF = eVar.z;
        float f4 = -f3;
        rectF.left = f4;
        rectF.top = f4;
        rectF.right = f3;
        rectF.bottom = f3;
    }

    public boolean f() {
        return this.v;
    }

    /* access modifiers changed from: protected */
    public void g() {
        Rect rect = new Rect();
        getDrawingRect(rect);
        int i = rect.left;
        int i2 = this.s;
        int i3 = i + i2;
        this.c = i3;
        int i4 = rect.right - i2;
        this.n = i4;
        int i5 = rect.top;
        int i6 = this.p;
        int i7 = i5 + i6;
        this.f = i7;
        this.o = (rect.bottom - i6) - i7;
        float f2 = this.u;
        float f3 = this.r;
        float f4 = ((float) (i3 + i6)) + f3;
        if (f2 < f4) {
            this.u = f4;
        } else {
            float f5 = (((float) i4) - f3) - ((float) i6);
            if (f2 > f5) {
                this.u = f5;
            }
        }
        setVisibility(0);
        RectF rectF = this.z;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = 0.0f;
        rectF.bottom = 0.0f;
        if (this.w.isPresent()) {
            this.x.setScaleX(1.0f);
            this.x.setScaleY(0.25f);
            this.x.setAlpha(0.0f);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new a());
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.x, PropertyValuesHolder.ofFloat(View.ALPHA, 0.0f, 1.0f), PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.25f, 1.0f));
        ofPropertyValuesHolder.setDuration(250L);
        ofPropertyValuesHolder.setStartDelay(50);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofPropertyValuesHolder);
        animatorSet.start();
    }

    public Optional<uu1> getConfiguration() {
        return this.w;
    }

    public void h(int i) {
        this.a.setColor(i);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.y;
        float f2 = this.r;
        canvas.drawRoundRect(rectF, f2, f2, this.a);
        if (this.t) {
            canvas.save();
            if (this.v) {
                canvas.translate(this.u, this.y.bottom);
            } else {
                canvas.translate(this.u, this.y.top);
            }
            canvas.rotate(45.0f);
            canvas.drawRect(this.z, this.a);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setAbove(boolean z2) {
        if (this.v != z2) {
            this.v = z2;
            invalidate();
        }
    }

    public void setAnimationListener(b bVar) {
        this.b = bVar;
    }

    public void setArrowOffset(int i) {
        this.u = (float) i;
    }

    public void setConfiguration(uu1 uu1) {
        this.w = Optional.of(uu1);
        uu1.j(LayoutInflater.from(getContext()), this.x);
    }

    public void setCornerRadius(float f2) {
        this.r = f2;
    }

    public void setDrawArrowEnabled(boolean z2) {
        this.t = z2;
    }

    public void setHidden(boolean z2) {
        if (z2) {
            setVisibility(8);
            if (this.w.isPresent()) {
                this.w.get().f(this.x);
                this.w = Optional.absent();
                return;
            }
            return;
        }
        setVisibility(4);
    }

    public void setSideMargin(int i) {
        this.s = i;
        FrameLayout frameLayout = this.x;
        frameLayout.setPadding(i, frameLayout.getPaddingTop(), i, this.x.getPaddingBottom());
    }
}
