package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.e;

public class MotionTelltales extends MockView {
    float A;
    private Paint u;
    MotionLayout v;
    float[] w;
    Matrix x;
    int y;
    int z;

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.u = new Paint();
        this.w = new float[2];
        this.x = new Matrix();
        this.y = 0;
        this.z = -65281;
        this.A = 0.25f;
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.r);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.z = obtainStyledAttributes.getColor(index, this.z);
                } else if (index == 2) {
                    this.y = obtainStyledAttributes.getInt(index, this.y);
                } else if (index == 1) {
                    this.A = obtainStyledAttributes.getFloat(index, this.A);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.u.setColor(this.z);
        this.u.setStrokeWidth(5.0f);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.x);
        if (this.v == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.v = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i = 0; i < 5; i++) {
            float f = fArr[i];
            for (int i2 = 0; i2 < 5; i2++) {
                float f2 = fArr[i2];
                this.v.getViewVelocity(this, f2, f, this.w, this.y);
                this.x.mapVectors(this.w);
                float f3 = ((float) width) * f2;
                float f4 = ((float) height) * f;
                float[] fArr2 = this.w;
                float f5 = fArr2[0];
                float f6 = this.A;
                float f7 = f4 - (fArr2[1] * f6);
                this.x.mapVectors(fArr2);
                canvas.drawLine(f3, f4, f3 - (f5 * f6), f7, this.u);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.o = charSequence.toString();
        requestLayout();
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = new Paint();
        this.w = new float[2];
        this.x = new Matrix();
        this.y = 0;
        this.z = -65281;
        this.A = 0.25f;
        a(context, attributeSet);
    }
}
