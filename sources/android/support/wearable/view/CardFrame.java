package android.support.wearable.view;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.spotify.music.C0707R;

@Deprecated
public class CardFrame extends ViewGroup {
    private boolean a;
    private boolean b;
    private float c;
    private int f;
    private final int n;
    private final Rect o;
    private int p;
    private boolean q;
    private int r;
    private final Rect s;
    private final Rect t;
    private boolean u;
    private final a v;

    private static class a {
        private final Shader a;
        private final Paint b;
        private final Matrix c = new Matrix();

        public a() {
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, -16777216, 0, Shader.TileMode.CLAMP);
            this.a = linearGradient;
            Paint paint = new Paint();
            this.b = paint;
            paint.setShader(linearGradient);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
    }

    public CardFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int a(int i, int i2, boolean z) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return i;
            }
        } else if (!z) {
            return i;
        }
        return size;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("CardFrame can host only one direct child");
    }

    public boolean b() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00e9  */
    @Override // android.view.ViewGroup
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean drawChild(android.graphics.Canvas r15, android.view.View r16, long r17) {
        /*
        // Method dump skipped, instructions count: 342
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.view.CardFrame.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public int getContentPaddingBottom() {
        return this.t.bottom;
    }

    public int getContentPaddingLeft() {
        return this.t.left;
    }

    public int getContentPaddingRight() {
        return this.t.right;
    }

    public int getContentPaddingTop() {
        return this.t.top;
    }

    public int getExpansionDirection() {
        return this.f;
    }

    public float getExpansionFactor() {
        return this.c;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        boolean isRound = windowInsets.isRound();
        if (isRound != this.q) {
            this.q = isRound;
            requestLayout();
        }
        boolean z = windowInsets.getSystemWindowInsetBottom() > 0;
        if (z != this.u) {
            this.u = z;
            requestLayout();
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(CardFrame.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(CardFrame.class.getName());
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            int i6 = i4 - i2;
            int paddingLeft = getPaddingLeft() + this.s.left + this.t.left;
            int measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
            if (this.f == -1) {
                i5 = i6 - (((getPaddingBottom() + childAt.getMeasuredHeight()) + this.s.bottom) + this.t.bottom);
            } else {
                i5 = getPaddingTop() + this.s.top + this.t.top;
                i6 = childAt.getMeasuredHeight() + i5;
            }
            childAt.layout(paddingLeft, i5, measuredWidth, i6);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z2 = false;
        if (this.q) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            this.s.setEmpty();
            int i9 = marginLayoutParams.leftMargin;
            if (i9 < 0) {
                i6 = -i9;
                size -= i6;
            } else {
                i6 = 0;
            }
            int i10 = marginLayoutParams.rightMargin;
            if (i10 < 0) {
                i7 = -i10;
                size -= i7;
            } else {
                i7 = 0;
            }
            int i11 = marginLayoutParams.bottomMargin;
            if (i11 < 0) {
                i8 = -i11;
                size2 -= i8;
            } else {
                i8 = 0;
            }
            int max = (int) (((float) Math.max(size, size2)) * 0.146467f);
            this.r = max;
            this.s.left = max - (getPaddingLeft() - i6);
            this.s.right = this.r - (getPaddingRight() - i7);
            if (!this.u) {
                this.s.bottom = this.r - (getPaddingBottom() - i8);
            }
        }
        int a2 = a(getSuggestedMinimumWidth(), i, true);
        int a3 = a(getSuggestedMinimumHeight(), i2, false);
        if (getChildCount() == 0) {
            setMeasuredDimension(a2, a3);
            return;
        }
        View childAt = getChildAt(0);
        int size3 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        boolean z3 = this.b;
        this.a = z3;
        if (mode == 0 || size3 == 0) {
            this.a = false;
            this.p = 0;
            i3 = 0;
            size3 = 0;
            i4 = 0;
            z = true;
        } else {
            if (mode == 1073741824) {
                this.a = false;
                this.p = size3;
                i4 = size3;
                i3 = 1073741824;
            } else {
                this.p = size3;
                if (z3) {
                    size3 = (int) (((float) size3) * this.c);
                }
                if (this.f == -1) {
                    i4 = size3;
                    i3 = 0;
                    size3 = 0;
                } else {
                    i3 = Integer.MIN_VALUE;
                    z = false;
                    i4 = size3;
                    size3 = getPaddingBottom() + size3;
                }
            }
            z = false;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Rect rect = this.t;
        int i12 = paddingRight + rect.left + rect.right;
        Rect rect2 = this.s;
        int i13 = i12 + rect2.left + rect2.right;
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        Rect rect3 = this.t;
        int i14 = paddingBottom + rect3.top + rect3.bottom;
        Rect rect4 = this.s;
        int i15 = i14 + rect4.top + rect4.bottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(a2 - i13, 1073741824);
        childAt.measure(ViewGroup.getChildMeasureSpec(makeMeasureSpec, 0, childAt.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(size3 - i15, i3));
        if (z) {
            i5 = childAt.getMeasuredHeight() + i15;
        } else {
            i5 = Math.min(i4, childAt.getMeasuredHeight() + i15);
            boolean z4 = this.a;
            if (childAt.getMeasuredHeight() > i5 - i15) {
                z2 = true;
            }
            this.a = z4 & z2;
        }
        setMeasuredDimension(a2, i5);
    }

    public void setExpansionDirection(int i) {
        this.f = i;
        requestLayout();
        invalidate();
    }

    public void setExpansionEnabled(boolean z) {
        this.b = z;
        requestLayout();
        invalidate();
    }

    public void setExpansionFactor(float f2) {
        this.c = f2;
        requestLayout();
        invalidate();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public CardFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = true;
        this.c = 1.0f;
        this.f = 1;
        this.o = new Rect();
        this.s = new Rect();
        Rect rect = new Rect();
        this.t = rect;
        this.v = new a();
        float f2 = context.getResources().getDisplayMetrics().density;
        this.n = (int) (40.0f * f2);
        setBackgroundResource(C0707R.drawable.card_background);
        int i2 = (int) (12.0f * f2);
        rect.set(i2, (int) (f2 * 8.0f), i2, i2);
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("CardFrame can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("CardFrame can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("CardFrame can host only one direct child");
    }
}
