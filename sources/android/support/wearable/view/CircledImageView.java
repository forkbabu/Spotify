package android.support.wearable.view;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
public class CircledImageView extends View {
    private static final ArgbEvaluator O = new ArgbEvaluator();
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private final g E;
    private long F;
    private float G;
    private float H;
    private Integer I;
    private Integer J;
    private final Drawable.Callback K;
    private int L;
    private final ValueAnimator.AnimatorUpdateListener M;
    private ValueAnimator N;
    final RectF a;
    final Rect b;
    private final Paint c;
    private final c f;
    private ColorStateList n;
    private Drawable o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private int u;
    private Paint.Cap v;
    private float w;
    private boolean x;
    private final float y;
    private float z;

    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            CircledImageView.this.invalidate();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (intValue != CircledImageView.this.L) {
                CircledImageView.this.L = intValue;
                CircledImageView.this.invalidate();
            }
        }
    }

    private static class c {
        private final int[] a = {-16777216, 0};
        private final float[] b = {0.6f, 1.0f};
        private final RectF c = new RectF();
        private final float d;
        private final Paint e;
        private float f;
        private float g;
        private float h;
        private float i;

        c(float f2, float f3, float f4, float f5) {
            Paint paint = new Paint();
            this.e = paint;
            this.d = f2;
            this.g = f3;
            this.h = f4;
            this.i = f5;
            this.f = (f2 * f3) + f4 + f5;
            paint.setColor(-16777216);
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            h();
        }

        private void h() {
            float f2 = (this.d * this.g) + this.h + this.i;
            this.f = f2;
            if (f2 > 0.0f) {
                this.e.setShader(new RadialGradient(this.c.centerX(), this.c.centerY(), this.f, this.a, this.b, Shader.TileMode.MIRROR));
            }
        }

        /* access modifiers changed from: package-private */
        public void c(Canvas canvas, float f2) {
            if (this.d > 0.0f && this.g > 0.0f) {
                Paint paint = this.e;
                paint.setAlpha(Math.round(((float) paint.getAlpha()) * f2));
                canvas.drawCircle(this.c.centerX(), this.c.centerY(), this.f, this.e);
            }
        }

        /* access modifiers changed from: package-private */
        public void d(int i2, int i3, int i4, int i5) {
            this.c.set((float) i2, (float) i3, (float) i4, (float) i5);
            h();
        }

        /* access modifiers changed from: package-private */
        public void e(float f2) {
            this.i = f2;
            h();
        }

        /* access modifiers changed from: package-private */
        public void f(float f2) {
            this.h = f2;
            h();
        }

        /* access modifiers changed from: package-private */
        public void g(float f2) {
            this.g = f2;
            h();
        }
    }

    public CircledImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void c() {
        int colorForState = this.n.getColorForState(getDrawableState(), this.n.getDefaultColor());
        if (this.F > 0) {
            ValueAnimator valueAnimator = this.N;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            } else {
                this.N = new ValueAnimator();
            }
            this.N.setIntValues(this.L, colorForState);
            this.N.setEvaluator(O);
            this.N.setDuration(this.F);
            this.N.addUpdateListener(this.M);
            this.N.start();
        } else if (colorForState != this.L) {
            this.L = colorForState;
            invalidate();
        }
    }

    public void d(boolean z2) {
        this.B = z2;
        g gVar = this.E;
        if (gVar == null) {
            return;
        }
        if (!z2 || !this.C || !this.D) {
            gVar.d();
        } else {
            gVar.c();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        c();
    }

    public ColorStateList getCircleColorStateList() {
        return this.n;
    }

    public float getCircleRadius() {
        float f2 = this.p;
        if (f2 <= 0.0f && this.q > 0.0f) {
            f2 = ((float) Math.max(getMeasuredHeight(), getMeasuredWidth())) * this.q;
        }
        return f2 - this.t;
    }

    public float getCircleRadiusPercent() {
        return this.q;
    }

    public float getCircleRadiusPressed() {
        float f2 = this.r;
        if (f2 <= 0.0f && this.s > 0.0f) {
            f2 = ((float) Math.max(getMeasuredHeight(), getMeasuredWidth())) * this.s;
        }
        return f2 - this.t;
    }

    public float getCircleRadiusPressedPercent() {
        return this.s;
    }

    public long getColorChangeAnimationDuration() {
        return this.F;
    }

    public int getDefaultCircleColor() {
        return this.n.getDefaultColor();
    }

    public Drawable getImageDrawable() {
        return this.o;
    }

    public float getInitialCircleRadius() {
        return this.y;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        float circleRadiusPressed = this.A ? getCircleRadiusPressed() : getCircleRadius();
        this.f.c(canvas, getAlpha());
        this.a.set((float) paddingLeft, (float) paddingTop, (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
        RectF rectF = this.a;
        rectF.set(rectF.centerX() - circleRadiusPressed, this.a.centerY() - circleRadiusPressed, this.a.centerX() + circleRadiusPressed, this.a.centerY() + circleRadiusPressed);
        if (this.w > 0.0f) {
            this.c.setColor(this.u);
            Paint paint = this.c;
            paint.setAlpha(Math.round(getAlpha() * ((float) paint.getAlpha())));
            this.c.setStyle(Paint.Style.STROKE);
            this.c.setStrokeWidth(this.w);
            this.c.setStrokeCap(this.v);
            if (this.B) {
                this.a.roundOut(this.b);
                Rect rect = this.b;
                float f2 = this.w;
                rect.inset((int) ((-f2) / 2.0f), (int) ((-f2) / 2.0f));
                this.E.setBounds(this.b);
                this.E.a(this.u);
                this.E.b(this.w);
                this.E.draw(canvas);
            } else {
                canvas.drawArc(this.a, -90.0f, this.z * 360.0f, false, this.c);
            }
        }
        if (!this.x) {
            this.c.setColor(this.L);
            Paint paint2 = this.c;
            paint2.setAlpha(Math.round(getAlpha() * ((float) paint2.getAlpha())));
            this.c.setStyle(Paint.Style.FILL);
            canvas.drawCircle(this.a.centerX(), this.a.centerY(), circleRadiusPressed, this.c);
        }
        Drawable drawable = this.o;
        if (drawable != null) {
            drawable.setAlpha(Math.round(getAlpha() * 255.0f));
            Integer num = this.I;
            if (num != null) {
                this.o.setTint(num.intValue());
            }
            this.o.draw(canvas);
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        Drawable drawable = this.o;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.o.getIntrinsicHeight();
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f2 = this.G;
            if (f2 <= 0.0f) {
                f2 = 1.0f;
            }
            float f3 = (float) intrinsicWidth;
            float f4 = (float) intrinsicHeight;
            float min = Math.min(1.0f, Math.min(f3 != 0.0f ? (((float) measuredWidth) * f2) / f3 : 1.0f, f4 != 0.0f ? (f2 * ((float) measuredHeight)) / f4 : 1.0f));
            int round = Math.round(f3 * min);
            int round2 = Math.round(min * f4);
            int round3 = Math.round(this.H * ((float) round)) + ((measuredWidth - round) / 2);
            int i5 = (measuredHeight - round2) / 2;
            this.o.setBounds(round3, i5, round + round3, round2 + i5);
        }
        super.onLayout(z2, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        float circleRadius = ((this.f.d * this.f.g) + getCircleRadius() + this.w) * 2.0f;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? (int) Math.min(circleRadius, (float) size) : (int) circleRadius;
        }
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? (int) Math.min(circleRadius, (float) size2) : (int) circleRadius;
        }
        Integer num = this.J;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 1) {
                size = size2;
            } else if (intValue == 2) {
                size2 = size;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public boolean onSetAlpha(int i) {
        return true;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i != i3 || i2 != i4) {
            this.f.d(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.C = i == 0;
        d(this.B);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.D = i == 0;
        d(this.B);
    }

    public void setCircleBorderCap(Paint.Cap cap) {
        if (cap != this.v) {
            this.v = cap;
            invalidate();
        }
    }

    public void setCircleBorderColor(int i) {
        this.u = i;
    }

    public void setCircleBorderWidth(float f2) {
        if (f2 != this.w) {
            this.w = f2;
            this.f.e(f2);
            invalidate();
        }
    }

    public void setCircleColor(int i) {
        setCircleColorStateList(ColorStateList.valueOf(i));
    }

    public void setCircleColorStateList(ColorStateList colorStateList) {
        if (!g.a(colorStateList, this.n)) {
            this.n = colorStateList;
            c();
            invalidate();
        }
    }

    public void setCircleHidden(boolean z2) {
        if (z2 != this.x) {
            this.x = z2;
            invalidate();
        }
    }

    public void setCircleRadius(float f2) {
        if (f2 != this.p) {
            this.p = f2;
            this.f.f(this.A ? getCircleRadiusPressed() : getCircleRadius());
            invalidate();
        }
    }

    public void setCircleRadiusPercent(float f2) {
        if (f2 != this.q) {
            this.q = f2;
            this.f.f(this.A ? getCircleRadiusPressed() : getCircleRadius());
            invalidate();
        }
    }

    public void setCircleRadiusPressed(float f2) {
        if (f2 != this.r) {
            this.r = f2;
            invalidate();
        }
    }

    public void setCircleRadiusPressedPercent(float f2) {
        if (f2 != this.s) {
            this.s = f2;
            this.f.f(this.A ? getCircleRadiusPressed() : getCircleRadius());
            invalidate();
        }
    }

    public void setColorChangeAnimationDuration(long j) {
        this.F = j;
    }

    public void setImageCirclePercentage(float f2) {
        float max = Math.max(0.0f, Math.min(1.0f, f2));
        if (max != this.G) {
            this.G = max;
            invalidate();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        Drawable drawable2 = this.o;
        if (drawable != drawable2) {
            this.o = drawable;
            if (!(drawable == null || drawable.getConstantState() == null)) {
                this.o = this.o.getConstantState().newDrawable(getResources(), getContext().getTheme()).mutate();
            }
            if (drawable != null && drawable2 != null && drawable2.getIntrinsicHeight() == drawable.getIntrinsicHeight() && drawable2.getIntrinsicWidth() == drawable.getIntrinsicWidth()) {
                this.o.setBounds(drawable2.getBounds());
            } else {
                requestLayout();
            }
            invalidate();
        }
    }

    public void setImageHorizontalOffcenterPercentage(float f2) {
        if (f2 != this.H) {
            this.H = f2;
            invalidate();
        }
    }

    public void setImageResource(int i) {
        setImageDrawable(i == 0 ? null : getContext().getDrawable(i));
    }

    public void setImageTint(int i) {
        Integer num = this.I;
        if (num == null || i != num.intValue()) {
            this.I = Integer.valueOf(i);
            invalidate();
        }
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        if (!(i == getPaddingLeft() && i2 == getPaddingTop() && i3 == getPaddingRight() && i4 == getPaddingBottom())) {
            this.f.d(i, i2, getWidth() - i3, getHeight() - i4);
        }
        super.setPadding(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        super.setPressed(z2);
        if (z2 != this.A) {
            this.A = z2;
            this.f.f(z2 ? getCircleRadiusPressed() : getCircleRadius());
            invalidate();
        }
    }

    public void setProgress(float f2) {
        if (f2 != this.z) {
            this.z = f2;
            invalidate();
        }
    }

    public void setShadowVisibility(float f2) {
        if (f2 != this.f.g) {
            this.f.g(f2);
            invalidate();
        }
    }

    public CircledImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new Rect();
        this.x = false;
        this.z = 1.0f;
        this.A = false;
        this.F = 0;
        this.G = 1.0f;
        this.H = 0.0f;
        a aVar = new a();
        this.K = aVar;
        this.M = new b();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.o = drawable;
        if (!(drawable == null || drawable.getConstantState() == null)) {
            if (Build.VERSION.SDK_INT >= 21) {
                this.o = this.o.getConstantState().newDrawable(context.getResources(), context.getTheme());
            } else {
                this.o = this.o.getConstantState().newDrawable(context.getResources());
            }
            this.o = this.o.mutate();
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(4);
        this.n = colorStateList;
        if (colorStateList == null) {
            this.n = ColorStateList.valueOf(17170432);
        }
        float dimension = obtainStyledAttributes.getDimension(6, 0.0f);
        this.p = dimension;
        this.y = dimension;
        this.r = obtainStyledAttributes.getDimension(8, dimension);
        this.u = obtainStyledAttributes.getColor(2, -16777216);
        this.v = Paint.Cap.values()[obtainStyledAttributes.getInt(1, 0)];
        float dimension2 = obtainStyledAttributes.getDimension(3, 0.0f);
        this.w = dimension2;
        if (dimension2 > 0.0f) {
            this.t = (dimension2 / 2.0f) + this.t;
        }
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        if (dimension3 > 0.0f) {
            this.t += dimension3;
        }
        this.G = obtainStyledAttributes.getFloat(10, 0.0f);
        this.H = obtainStyledAttributes.getFloat(11, 0.0f);
        if (obtainStyledAttributes.hasValue(12)) {
            this.I = Integer.valueOf(obtainStyledAttributes.getColor(12, 0));
        }
        if (obtainStyledAttributes.hasValue(14)) {
            this.J = Integer.valueOf(obtainStyledAttributes.getInt(14, 0));
        }
        float fraction = obtainStyledAttributes.getFraction(7, 1, 1, 0.0f);
        this.q = fraction;
        this.s = obtainStyledAttributes.getFraction(9, 1, 1, fraction);
        float dimension4 = obtainStyledAttributes.getDimension(13, 0.0f);
        obtainStyledAttributes.recycle();
        this.a = new RectF();
        Paint paint = new Paint();
        this.c = paint;
        paint.setAntiAlias(true);
        this.f = new c(dimension4, 0.0f, getCircleRadius(), this.w);
        g gVar = new g();
        this.E = gVar;
        gVar.setCallback(aVar);
        setWillNotDraw(false);
        c();
    }
}
