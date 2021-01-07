package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.music.C0707R;

public class ShapeableImageView extends AppCompatImageView implements gy {
    private final ey a;
    private final RectF b;
    private final RectF c;
    private final Paint f;
    private final Paint n;
    private final Path o;
    private ColorStateList p;
    private dy q;
    private float r;
    private Path s;
    private final yx t;

    class a extends ViewOutlineProvider {
        private final Rect a = new Rect();

        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.q != null) {
                ShapeableImageView.this.b.round(this.a);
                ShapeableImageView.this.t.setBounds(this.a);
                ShapeableImageView.this.t.getOutline(outline);
            }
        }
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void f(int i, int i2) {
        this.b.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (i - getPaddingRight()), (float) (i2 - getPaddingBottom()));
        this.a.a(this.q, 1.0f, this.b, this.o);
        this.s.rewind();
        this.s.addPath(this.o);
        this.c.set(0.0f, 0.0f, (float) i, (float) i2);
        this.s.addRect(this.c, Path.Direction.CCW);
    }

    public dy getShapeAppearanceModel() {
        return this.q;
    }

    public ColorStateList getStrokeColor() {
        return this.p;
    }

    public float getStrokeWidth() {
        return this.r;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        setLayerType(0, null);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.s, this.n);
        if (this.p != null) {
            this.f.setStrokeWidth(this.r);
            int colorForState = this.p.getColorForState(getDrawableState(), this.p.getDefaultColor());
            if (this.r > 0.0f && colorForState != 0) {
                this.f.setColor(colorForState);
                canvas.drawPath(this.o, this.f);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        f(i, i2);
    }

    @Override // defpackage.gy
    public void setShapeAppearanceModel(dy dyVar) {
        this.q = dyVar;
        this.t.setShapeAppearanceModel(dyVar);
        f(getWidth(), getHeight());
        invalidate();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.p = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(i0.a(getContext(), i));
    }

    public void setStrokeWidth(float f2) {
        if (this.r != f2) {
            this.r = f2;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth((float) getResources().getDimensionPixelSize(i));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        super(iy.a(context, attributeSet, i, C0707R.style.res_2132083901_widget_materialcomponents_shapeableimageview), attributeSet, i);
        this.a = new ey();
        this.o = new Path();
        Context context2 = getContext();
        Paint paint = new Paint();
        this.n = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.b = new RectF();
        this.c = new RectF();
        this.s = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, pw.H, i, C0707R.style.res_2132083901_widget_materialcomponents_shapeableimageview);
        this.p = jx.a(context2, obtainStyledAttributes, 2);
        this.r = (float) obtainStyledAttributes.getDimensionPixelSize(3, 0);
        Paint paint2 = new Paint();
        this.f = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.q = dy.c(context2, attributeSet, i, C0707R.style.res_2132083901_widget_materialcomponents_shapeableimageview, new rx((float) 0)).m();
        this.t = new yx(this.q);
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new a());
        }
    }
}
