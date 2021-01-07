package android.support.wearable.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;

@Deprecated
public class ActionLabel extends View {
    private final TextPaint a;
    private float b;
    private float c;
    private Layout f;
    private int n;
    private ColorStateList o;
    private int p;
    private CharSequence q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private int w;
    private int x;

    public ActionLabel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private Layout a(int i, int i2, Layout.Alignment alignment) {
        if (i2 <= 0 || i <= 0) {
            return null;
        }
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        float f2 = this.u;
        this.v = f2;
        this.a.setTextSize(f2);
        StaticLayout staticLayout = new StaticLayout(this.q, this.a, paddingRight, alignment, this.r, this.s, true);
        boolean z = staticLayout.getLineCount() > this.w;
        boolean z2 = staticLayout.getLineTop(staticLayout.getLineCount()) > paddingBottom;
        boolean z3 = this.a.getTextSize() > this.t;
        if (z || z2) {
            while (true) {
                if ((!z && !z2) || !z3) {
                    break;
                }
                float f3 = this.v - 1.0f;
                this.v = f3;
                this.a.setTextSize(f3);
                staticLayout = new StaticLayout(this.q, this.a, paddingRight, alignment, this.r, this.s, true);
                z2 = staticLayout.getLineTop(staticLayout.getLineCount()) > paddingBottom;
                z = staticLayout.getLineCount() > this.w;
                z3 = this.a.getTextSize() > this.t;
            }
        }
        this.x = Math.min(this.w, staticLayout.getLineCount());
        return staticLayout;
    }

    private void f() {
        int colorForState = this.o.getColorForState(getDrawableState(), 0);
        if (colorForState != this.p) {
            this.p = colorForState;
            invalidate();
        }
    }

    private int getAvailableHeight() {
        return getHeight() - (getPaddingBottom() + getPaddingTop());
    }

    private Layout.Alignment getLayoutAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            int i = this.n & 8388615;
            if (i == 1) {
                return Layout.Alignment.ALIGN_CENTER;
            }
            if (i == 3) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            if (i == 5) {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            if (i == 8388611) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            if (i != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        } else if (textAlignment == 2) {
            return Layout.Alignment.ALIGN_NORMAL;
        } else {
            if (textAlignment == 3) {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            if (textAlignment != 4) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_CENTER;
        }
    }

    public void b(float f2, float f3) {
        if (this.s != f2 || this.r != f3) {
            this.s = f2;
            this.r = f3;
            if (this.f != null) {
                this.f = null;
                requestLayout();
                invalidate();
            }
        }
    }

    public void c(int i, float f2) {
        float applyDimension = TypedValue.applyDimension(i, f2, getContext().getResources().getDisplayMetrics());
        if (applyDimension != this.u) {
            this.f = null;
            this.u = applyDimension;
            requestLayout();
            invalidate();
        }
    }

    public void d(int i, float f2) {
        float applyDimension = TypedValue.applyDimension(i, f2, getContext().getResources().getDisplayMetrics());
        if (applyDimension != this.t) {
            this.f = null;
            this.t = applyDimension;
            requestLayout();
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList colorStateList = this.o;
        if (colorStateList != null && colorStateList.isStateful()) {
            f();
        }
    }

    /* access modifiers changed from: package-private */
    public void e(String str, int i, int i2) {
        Typeface typeface;
        Typeface typeface2;
        if (str != null) {
            typeface = Typeface.create(str, i2);
            if (typeface != null) {
                setTypeface(typeface);
                return;
            }
        } else {
            typeface = null;
        }
        boolean z = true;
        if (i == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i == 2) {
            typeface = Typeface.SERIF;
        } else if (i == 3) {
            typeface = Typeface.MONOSPACE;
        }
        float f2 = 0.0f;
        if (i2 > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i2);
            } else {
                typeface2 = Typeface.create(typeface, i2);
            }
            setTypeface(typeface2);
            int style = ((typeface2 != null ? typeface2.getStyle() : 0) ^ -1) & i2;
            TextPaint textPaint = this.a;
            if ((style & 1) == 0) {
                z = false;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.a;
            if ((style & 2) != 0) {
                f2 = -0.25f;
            }
            textPaint2.setTextSkewX(f2);
            return;
        }
        this.a.setFakeBoldText(false);
        this.a.setTextSkewX(0.0f);
        setTypeface(typeface);
    }

    public final int getCurrentTextColor() {
        return this.p;
    }

    public int getGravity() {
        return this.n;
    }

    public float getLineSpacingExtra() {
        return this.s;
    }

    public float getLineSpacingMultiplier() {
        return this.r;
    }

    public int getMaxLines() {
        return this.w;
    }

    public final ColorStateList getTextColors() {
        return this.o;
    }

    public Typeface getTypeface() {
        return this.a.getTypeface();
    }

    /* access modifiers changed from: package-private */
    public int getVerticalOffset() {
        int availableHeight = getAvailableHeight();
        int lineTop = this.f.getLineTop(this.x);
        int i = this.n & 112;
        if (i == 16) {
            return (availableHeight - lineTop) / 2;
        }
        if (i == 48 || i != 80) {
            return 0;
        }
        return availableHeight - lineTop;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f != null) {
            canvas.save();
            this.a.setColor(this.p);
            this.a.drawableState = getDrawableState();
            canvas.translate((float) getPaddingLeft(), (float) (getPaddingTop() + getVerticalOffset()));
            canvas.clipRect(0, 0, getWidth() - getPaddingRight(), this.f.getLineTop(this.x));
            this.f.draw(canvas);
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = mode == 1073741824 ? size : -1;
        int i4 = mode2 == 1073741824 ? size2 : -1;
        if (i3 == -1) {
            this.a.setTextSize(this.u);
            i3 = (int) Math.ceil((double) Layout.getDesiredWidth(this.q, this.a));
            this.a.setTextSize(this.v);
        }
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(i3, size);
        }
        Layout.Alignment layoutAlignment = getLayoutAlignment();
        if (i4 == -1) {
            i4 = mode2 == Integer.MIN_VALUE ? size2 : Integer.MAX_VALUE;
        }
        Layout layout = this.f;
        if (layout == null) {
            this.f = a(i3, i4, layoutAlignment);
        } else {
            boolean z = true;
            boolean z2 = layout.getWidth() != i3;
            if (this.f.getHeight() == i4) {
                z = false;
            }
            if (z2 || z) {
                this.f = a(i3, i4, layoutAlignment);
            }
        }
        Layout layout2 = this.f;
        if (layout2 == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (mode2 != 1073741824) {
            i4 = layout2.getLineTop(layout2.getLineCount());
        }
        if (mode2 == Integer.MIN_VALUE) {
            i4 = Math.min(i4, size2);
        }
        setMeasuredDimension(i3, i4);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        this.f = null;
        requestLayout();
        invalidate();
    }

    public void setGravity(int i) {
        if (this.n != i) {
            this.n = i;
            invalidate();
        }
    }

    public void setMaxLines(int i) {
        if (this.w != i) {
            this.w = i;
            this.f = null;
            requestLayout();
            invalidate();
        }
    }

    public void setMaxTextSize(float f2) {
        c(2, f2);
    }

    public void setMinTextSize(float f2) {
        d(2, f2);
    }

    public void setText(CharSequence charSequence) {
        if (charSequence == null) {
            throw new RuntimeException("Can not set ActionLabel text to null");
        } else if (!g.a(this.q, charSequence)) {
            this.f = null;
            this.q = charSequence;
            requestLayout();
            invalidate();
        }
    }

    public void setTextColor(int i) {
        this.o = ColorStateList.valueOf(i);
        f();
    }

    public void setTypeface(Typeface typeface) {
        if (!g.a(this.a.getTypeface(), typeface)) {
            this.a.setTypeface(typeface);
            if (this.f != null) {
                requestLayout();
                invalidate();
            }
        }
    }

    public ActionLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.n = 8388659;
        this.r = 1.0f;
        this.s = 0.0f;
        this.w = Integer.MAX_VALUE;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float f2 = displayMetrics.density;
        float f3 = displayMetrics.scaledDensity;
        this.t = 10.0f * f3;
        this.u = f3 * 60.0f;
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, r.c, i, 0);
        this.q = obtainStyledAttributes.getText(4);
        this.t = obtainStyledAttributes.getDimension(10, this.t);
        this.u = obtainStyledAttributes.getDimension(9, this.u);
        this.o = obtainStyledAttributes.getColorStateList(2);
        this.w = obtainStyledAttributes.getInt(5, 2);
        if (this.o != null) {
            f();
        }
        textPaint.setTextSize(this.u);
        e(obtainStyledAttributes.getString(8), obtainStyledAttributes.getInt(0, -1), obtainStyledAttributes.getInt(1, -1));
        this.n = obtainStyledAttributes.getInt(3, this.n);
        this.c = (float) obtainStyledAttributes.getDimensionPixelSize(6, (int) this.c);
        this.b = obtainStyledAttributes.getFloat(7, this.b);
        obtainStyledAttributes.recycle();
        if (this.q == null) {
            this.q = "";
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        colorStateList.getClass();
        this.o = colorStateList;
        f();
    }
}
