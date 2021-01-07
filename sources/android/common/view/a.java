package android.common.view;

import android.common.view.SlidingTabLayout;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class a extends LinearLayout {
    private final int a;
    private final Paint b;
    private final int c;
    private final Paint f = new Paint();
    private final boolean n = true;
    private final int o;
    private final Paint p;
    private final float q = 0.5f;
    private int r;
    private float s;
    private SlidingTabLayout.d t;
    private final b u;

    private static class b implements SlidingTabLayout.d {
        private int[] a;
        private int[] b;

        private b() {
        }

        public final int a(int i) {
            int[] iArr = this.b;
            return iArr[i % iArr.length];
        }

        public final int b(int i) {
            int[] iArr = this.a;
            return iArr[i % iArr.length];
        }

        /* access modifiers changed from: package-private */
        public void c(int... iArr) {
            this.b = iArr;
        }

        /* access modifiers changed from: package-private */
        public void d(int... iArr) {
            this.a = iArr;
        }

        b(C0003a aVar) {
        }
    }

    a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setWillNotDraw(false);
        setId(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oud.c, i, 0);
        int color = obtainStyledAttributes.getColor(0, -16777216);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        int color2 = obtainStyledAttributes.getColor(3, -1);
        int color3 = obtainStyledAttributes.getColor(4, -16711936);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(5, 2);
        obtainStyledAttributes.recycle();
        int argb = Color.argb(38, Color.red(color2), Color.green(color2), Color.blue(color2));
        this.o = argb;
        b bVar = new b(null);
        this.u = bVar;
        bVar.d(color3);
        bVar.c(Color.argb(32, Color.red(color2), Color.green(color2), Color.blue(color2)));
        this.a = dimensionPixelSize;
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(argb);
        this.c = dimensionPixelSize3;
        Paint paint2 = new Paint();
        this.p = paint2;
        paint2.setStrokeWidth((float) dimensionPixelSize2);
        setBackgroundColor(color);
    }

    public void a(int i, float f2) {
        getChildAt(this.r).setSelected(false);
        this.r = i;
        this.s = f2;
        getChildAt(i).setSelected(true);
        invalidate();
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        int height = getHeight();
        int childCount = getChildCount();
        float f2 = (float) height;
        int min = (int) (Math.min(Math.max(0.0f, this.q), 1.0f) * f2);
        Object obj = this.t;
        if (obj == null) {
            obj = this.u;
        }
        if (childCount > 0) {
            View childAt = getChildAt(this.r);
            int left = childAt.getLeft() + (this.n ? childAt.getPaddingLeft() : 0);
            int right = childAt.getRight() - (this.n ? childAt.getPaddingRight() : 0);
            b bVar = (b) obj;
            int b2 = bVar.b(this.r);
            if (this.s > 0.0f && this.r < getChildCount() - 1) {
                int b3 = bVar.b(this.r + 1);
                if (b2 != b3) {
                    float f3 = this.s;
                    float f4 = 1.0f - f3;
                    b2 = Color.rgb((int) ((((float) Color.red(b2)) * f4) + (((float) Color.red(b3)) * f3)), (int) ((((float) Color.green(b2)) * f4) + (((float) Color.green(b3)) * f3)), (int) ((((float) Color.blue(b2)) * f4) + (((float) Color.blue(b3)) * f3)));
                }
                View childAt2 = getChildAt(this.r + 1);
                float left2 = this.s * ((float) (childAt2.getLeft() + (this.n ? childAt2.getPaddingLeft() : 0)));
                float f5 = this.s;
                left = (int) (((1.0f - f5) * ((float) left)) + left2);
                right = (int) (((1.0f - this.s) * ((float) right)) + (f5 * ((float) (childAt2.getRight() - (this.n ? childAt2.getPaddingRight() : 0)))));
            }
            this.f.setColor(b2);
            canvas.drawRect((float) left, (float) (height - this.c), (float) right, f2, this.f);
        }
        int i = this.a;
        if (i > 0) {
            canvas.drawRect(0.0f, (float) (height - i), (float) getWidth(), f2, this.b);
        }
        if (this.p.getStrokeWidth() > 0.0f) {
            int i2 = (height - min) / 2;
            for (int i3 = 0; i3 < childCount - 1; i3++) {
                View childAt3 = getChildAt(i3);
                this.p.setColor(((b) obj).a(i3));
                canvas.drawLine((float) childAt3.getRight(), (float) i2, (float) childAt3.getRight(), (float) (i2 + min), this.p);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setCustomTabColorizer(SlidingTabLayout.d dVar) {
        this.t = dVar;
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void setDividerColors(int... iArr) {
        this.t = null;
        this.u.c(iArr);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void setSelectedIndicatorColors(int... iArr) {
        this.t = null;
        this.u.d(iArr);
        invalidate();
    }
}
