package com.spotify.mobile.android.wrapped2020.views.gradient;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.spotify.encore.foundation.R;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public final class WrappedGradientView extends View {
    private final Paint a = new Paint();
    private final Path b = new Path();
    private int[] c;
    private PointF f = new PointF(Float.MIN_VALUE, Float.MIN_VALUE);
    private WrappedGradient n = WrappedGradient.GRADIENT_1;
    private WrappedGradientShape o = WrappedGradientShape.RECTANGLE;
    private float p;
    private float q = 1.0f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WrappedGradientView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        d();
        b(context, attributeSet);
    }

    private final void b(Context context, AttributeSet attributeSet) {
        String string = context.getTheme().obtainStyledAttributes(attributeSet, a.a, 0, 0).getString(0);
        if (string == null) {
            return;
        }
        if (h.a(string, "circle")) {
            this.o = WrappedGradientShape.CIRCLE;
            return;
        }
        this.a.setMaskFilter(new BlurMaskFilter(8.0f, BlurMaskFilter.Blur.NORMAL));
        setLayerType(1, null);
    }

    private final void c(float f2, float f3) {
        PointF pointF = this.f;
        float f4 = f2 - pointF.x;
        float f5 = f3 - pointF.y;
        float max = Math.max(f4, f2 - f4);
        float max2 = Math.max(f5, f3 - f5);
        double d = (double) 2;
        this.b.reset();
        Path path = this.b;
        PointF pointF2 = this.f;
        path.addCircle(pointF2.x, pointF2.y, ((((float) Math.sqrt((double) (((float) Math.pow((double) max, d)) + ((float) Math.pow((double) max2, d))))) - 0.0f) * this.q) + 0.0f, Path.Direction.CW);
    }

    private final void d() {
        int[] iArr;
        WrappedGradient wrappedGradient = this.n;
        Resources resources = getResources();
        h.d(resources, "resources");
        Context context = getContext();
        h.d(context, "context");
        Resources.Theme theme = context.getTheme();
        wrappedGradient.getClass();
        h.e(resources, "resources");
        int ordinal = wrappedGradient.ordinal();
        if (ordinal == 0) {
            int i = R.color.powder_green;
            iArr = new int[]{i2.c(resources, i, theme), i2.c(resources, R.color.factory_yellow, theme), i2.c(resources, R.color.tangerine, theme), i2.c(resources, R.color.black, theme), i2.c(resources, R.color.klein_blue, theme), i2.c(resources, R.color.storm, theme), i2.c(resources, i, theme)};
        } else if (ordinal == 1) {
            int i2 = R.color.klein_blue;
            iArr = new int[]{i2.c(resources, i2, theme), i2.c(resources, R.color.powder_green, theme), i2.c(resources, R.color.storm, theme), i2.c(resources, R.color.factory_yellow, theme), i2.c(resources, R.color.tangerine, theme), i2.c(resources, R.color.black, theme), i2.c(resources, i2, theme)};
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.c = iArr;
    }

    private final void e(float f2) {
        int[] iArr = this.c;
        if (iArr != null) {
            float length = (f2 / ((float) iArr.length)) + f2;
            float f3 = this.p * length;
            Paint paint = this.a;
            float f4 = -f3;
            float f5 = length - f3;
            int[] iArr2 = this.c;
            if (iArr2 != null) {
                paint.setShader(new LinearGradient(0.0f, f4, 0.0f, f5, iArr2, this.n.d(), Shader.TileMode.REPEAT));
            } else {
                h.k("gradientColors");
                throw null;
            }
        } else {
            h.k("gradientColors");
            throw null;
        }
    }

    public final Animator a() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "gradientOffset", 0.0f, 1.0f);
        ofFloat.setDuration(TimeUnit.SECONDS.toMillis(9));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        h.d(ofFloat, "ObjectAnimator.ofFloat(t…imator.INFINITE\n        }");
        return ofFloat;
    }

    public final float getCircleMaskProgression() {
        return this.q;
    }

    public final WrappedGradient getGradient() {
        return this.n;
    }

    public final float getGradientOffset() {
        return this.p;
    }

    public final WrappedGradientShape getShape() {
        return this.o;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        h.e(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        int ordinal = this.o.ordinal();
        if (ordinal == 0) {
            float f2 = (float) 2;
            canvas.drawCircle(((float) getWidth()) / f2, ((float) getHeight()) / f2, ((float) getWidth()) / f2, this.a);
        } else if (ordinal == 1) {
            if (this.q < 1.0f) {
                canvas.clipPath(this.b);
            }
            canvas.drawRect(-100.0f, -100.0f, ((float) getWidth()) + 200.0f, ((float) getHeight()) + 200.0f, this.a);
        }
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        float f2 = (float) i;
        float f3 = (float) i2;
        PointF pointF = this.f;
        if (pointF.x == Float.MIN_VALUE && pointF.y == Float.MIN_VALUE) {
            pointF.set(f2 / 2.0f, f3 / 2.0f);
        }
        e(f3);
        c(f2, f3);
    }

    public final void setCircleMaskProgression(float f2) {
        this.q = f2;
        c((float) getWidth(), (float) getHeight());
        invalidate();
    }

    public final void setGradient(WrappedGradient wrappedGradient) {
        h.e(wrappedGradient, "value");
        if (this.n != wrappedGradient) {
            this.n = wrappedGradient;
            d();
            e((float) getHeight());
            invalidate();
        }
    }

    public final void setGradientOffset(float f2) {
        this.p = f2;
        e((float) getHeight());
        invalidate();
    }

    public final void setShape(WrappedGradientShape wrappedGradientShape) {
        h.e(wrappedGradientShape, "<set-?>");
        this.o = wrappedGradientShape;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WrappedGradientView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        d();
        b(context, attributeSet);
    }
}
