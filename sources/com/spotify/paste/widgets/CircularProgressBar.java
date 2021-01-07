package com.spotify.paste.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import com.spotify.music.C0707R;

public class CircularProgressBar extends View {
    private float A;
    private float B;
    private float C;
    private boolean D;
    private final RectF E;
    private boolean F;
    private boolean a;
    private Paint b;
    private int c;
    private int f;
    private final RectF n;
    private int o;
    private Paint p;
    private int q;
    private float r;
    private Paint s;
    private float t;
    private Paint u;
    private boolean v;
    private final int w;
    private int x;
    private int y;
    private float z;

    public CircularProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.pasteDefaultsCircularProgressBarStyle);
    }

    private void a() {
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(this.q);
        this.b.setStyle(Paint.Style.STROKE);
        this.b.setStrokeWidth((float) this.c);
        invalidate();
    }

    private void b() {
        Paint paint = new Paint(1);
        this.u = paint;
        paint.setColor(this.q);
        this.u.setStyle(Paint.Style.STROKE);
        this.u.setStrokeWidth(((float) this.c) / 2.0f);
        invalidate();
    }

    private void c() {
        Paint paint = new Paint(1);
        this.p = paint;
        paint.setColor(this.o);
        this.p.setStyle(Paint.Style.STROKE);
        this.p.setStrokeWidth((float) this.c);
        Paint paint2 = new Paint(1);
        this.s = paint2;
        paint2.setColor(this.o);
        this.s.setStyle(Paint.Style.FILL_AND_STROKE);
        this.s.setStrokeWidth((float) this.c);
        invalidate();
    }

    private float getCurrentRotation() {
        return this.r * 360.0f;
    }

    private float getMarkerRotation() {
        return this.t * 360.0f;
    }

    private void setWheelSize(int i) {
        this.c = i;
    }

    public float getMarkerProgress() {
        return this.t;
    }

    public float getProgress() {
        return this.r;
    }

    public int getProgressColor() {
        return this.o;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.translate(this.z, this.A);
        float currentRotation = getCurrentRotation();
        if (!this.D) {
            canvas.drawArc(this.n, 270.0f, -(360.0f - currentRotation), false, this.b);
        }
        canvas.drawArc(this.n, 270.0f, this.D ? 360.0f : currentRotation, false, this.p);
        if (this.v) {
            float markerRotation = getMarkerRotation();
            canvas.save();
            canvas.rotate(markerRotation - 90.0f);
            float f2 = this.B;
            double d = (double) f2;
            int i = this.f;
            double d2 = (double) i;
            Double.isNaN(d2);
            Double.isNaN(d);
            float f3 = (float) (((d2 / 2.0d) * 1.4d) + d);
            float f4 = this.C;
            double d3 = (double) f2;
            double d4 = (double) i;
            Double.isNaN(d4);
            Double.isNaN(d3);
            canvas.drawLine(f3, f4, (float) (d3 - ((d4 / 2.0d) * 1.4d)), f4, this.u);
            canvas.restore();
        }
        if (this.F) {
            canvas.save();
            canvas.rotate(currentRotation - 90.0f);
            canvas.rotate(45.0f, this.B, this.C);
            RectF rectF = this.E;
            float f5 = this.B;
            int i2 = this.f;
            rectF.left = f5 - (((float) i2) / 3.0f);
            rectF.right = (((float) i2) / 3.0f) + f5;
            float f6 = this.C;
            rectF.top = f6 - (((float) i2) / 3.0f);
            rectF.bottom = (((float) i2) / 3.0f) + f6;
            canvas.drawRect(rectF, this.s);
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        int defaultSize2 = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        int min = Math.min(defaultSize2, defaultSize);
        setMeasuredDimension(min, defaultSize);
        float f2 = ((float) min) * 0.5f;
        float f3 = f2 - ((float) this.f);
        float f4 = -f3;
        this.n.set(f4, f4, f3, f3);
        this.B = f3;
        this.C = f3;
        int i3 = defaultSize2 - min;
        int i4 = defaultSize - min;
        int i5 = this.w;
        if (Build.VERSION.SDK_INT >= 17) {
            i5 = Gravity.getAbsoluteGravity(this.w, getLayoutDirection());
        }
        int i6 = i5 & 7;
        if (i6 == 3) {
            this.x = 0;
        } else if (i6 != 5) {
            this.x = i3 / 2;
        } else {
            this.x = i3;
        }
        int i7 = i5 & 112;
        if (i7 == 48) {
            this.y = 0;
        } else if (i7 != 80) {
            this.y = i4 / 2;
        } else {
            this.y = i4;
        }
        this.z = ((float) this.x) + f2;
        this.A = f2 + ((float) this.y);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            setProgress(bundle.getFloat("progress"));
            setMarkerProgress(bundle.getFloat("marker_progress"));
            int i = bundle.getInt("progress_color");
            if (i != this.o) {
                this.o = i;
                c();
            }
            int i2 = bundle.getInt("progress_background_color");
            if (i2 != this.q) {
                this.q = i2;
                a();
            }
            super.onRestoreInstanceState(bundle.getParcelable("saved_state"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_state", super.onSaveInstanceState());
        bundle.putFloat("progress", this.r);
        bundle.putFloat("marker_progress", this.t);
        bundle.putInt("progress_color", this.o);
        bundle.putInt("progress_background_color", this.q);
        return bundle;
    }

    public void setMarkerEnabled(boolean z2) {
        this.v = z2;
    }

    public void setMarkerProgress(float f2) {
        this.v = true;
        this.t = f2;
    }

    public void setProgress(float f2) {
        if (f2 != this.r) {
            if (f2 == 1.0f) {
                this.D = false;
                this.r = 1.0f;
            } else {
                if (f2 >= 1.0f) {
                    this.D = true;
                } else {
                    this.D = false;
                }
                this.r = f2 % 1.0f;
            }
            if (!this.a) {
                invalidate();
            }
        }
    }

    public void setProgressBackgroundColor(int i) {
        this.q = i;
        b();
        a();
    }

    public void setProgressColor(int i) {
        this.o = i;
        c();
    }

    public void setThumbEnabled(boolean z2) {
        this.F = z2;
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
        this.b = new Paint();
        this.c = 10;
        this.f = 20;
        this.n = new RectF();
        this.r = 0.3f;
        this.s = new Paint();
        this.E = new RectF();
        this.F = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b, i, 0);
        setProgressColor(obtainStyledAttributes.getColor(5, -16711681));
        setProgressBackgroundColor(obtainStyledAttributes.getColor(4, -65281));
        setProgress(obtainStyledAttributes.getFloat(3, 0.0f));
        setMarkerProgress(obtainStyledAttributes.getFloat(1, 0.0f));
        setWheelSize((int) obtainStyledAttributes.getDimension(6, 10.0f));
        this.F = obtainStyledAttributes.getBoolean(7, true);
        this.v = obtainStyledAttributes.getBoolean(2, true);
        this.w = obtainStyledAttributes.getInt(0, 17);
        obtainStyledAttributes.recycle();
        this.f = this.c * 2;
        a();
        b();
        c();
        this.a = false;
    }
}
