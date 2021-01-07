package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class LinearLayoutCompat extends ViewGroup {
    private boolean a;
    private int b;
    private int c;
    private int f;
    private int n;
    private int o;
    private float p;
    private boolean q;
    private int[] r;
    private int[] s;
    private Drawable t;
    private int u;
    private int v;
    private int w;
    private int x;

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* access modifiers changed from: package-private */
    public void g(Canvas canvas, int i) {
        this.t.setBounds(getPaddingLeft() + this.x, i, (getWidth() - getPaddingRight()) - this.x, this.v + i);
        this.t.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.b;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.c;
                if (this.f == 1 && (i = this.n & 112) != 48) {
                    if (i == 16) {
                        i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.o) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.o;
                    }
                }
                return i3 + ((ViewGroup.MarginLayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
            } else if (this.b == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.b;
    }

    public Drawable getDividerDrawable() {
        return this.t;
    }

    public int getDividerPadding() {
        return this.x;
    }

    public int getDividerWidth() {
        return this.u;
    }

    public int getGravity() {
        return this.n;
    }

    public int getOrientation() {
        return this.f;
    }

    public int getShowDividers() {
        return this.w;
    }

    /* access modifiers changed from: package-private */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public void i(Canvas canvas, int i) {
        this.t.setBounds(i, getPaddingTop() + this.x, this.u + i, (getHeight() - getPaddingBottom()) - this.x);
        this.t.draw(canvas);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public LayoutParams generateDefaultLayoutParams() {
        int i = this.f;
        if (i == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    /* renamed from: k */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public int m() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int n() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int o() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.t != null) {
            int i6 = 0;
            if (this.f == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i6 < virtualChildCount) {
                    View childAt = getChildAt(i6);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !p(i6))) {
                        g(canvas, (childAt.getTop() - ((ViewGroup.MarginLayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin) - this.v);
                    }
                    i6++;
                }
                if (p(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        i5 = (getHeight() - getPaddingBottom()) - this.v;
                    } else {
                        i5 = childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) ((LayoutParams) childAt2.getLayoutParams())).bottomMargin;
                    }
                    g(canvas, i5);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean b2 = o0.b(this);
            while (i6 < virtualChildCount2) {
                View childAt3 = getChildAt(i6);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !p(i6))) {
                    LayoutParams layoutParams = (LayoutParams) childAt3.getLayoutParams();
                    if (b2) {
                        i4 = childAt3.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    } else {
                        i4 = (childAt3.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.u;
                    }
                    i(canvas, i4);
                }
                i6++;
            }
            if (p(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt4.getLayoutParams();
                    if (b2) {
                        i3 = childAt4.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                        i2 = this.u;
                    } else {
                        i = childAt4.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        i(canvas, i);
                    }
                } else if (b2) {
                    i = getPaddingLeft();
                    i(canvas, i);
                } else {
                    i3 = getWidth() - getPaddingRight();
                    i2 = this.u;
                }
                i = i3 - i2;
                i(canvas, i);
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01ab  */
    @Override // android.view.ViewGroup, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
        // Method dump skipped, instructions count: 483
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04be  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04e6  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x04f3  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0504  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x051b  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0593  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x062e  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x06f8  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0715  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x08cb  */
    /* JADX WARNING: Removed duplicated region for block: B:428:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r39, int r40) {
        /*
        // Method dump skipped, instructions count: 2316
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public boolean p(int i) {
        if (i == 0) {
            return (this.w & 1) != 0;
        }
        if (i == getChildCount()) {
            if ((this.w & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.w & 2) == 0) {
            return false;
        } else {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void q(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    public int r() {
        return 0;
    }

    public void setBaselineAligned(boolean z) {
        this.a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder V0 = je.V0("base aligned child index out of range (0, ");
            V0.append(getChildCount());
            V0.append(")");
            throw new IllegalArgumentException(V0.toString());
        }
        this.b = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.t) {
            this.t = drawable;
            boolean z = false;
            if (drawable != null) {
                this.u = drawable.getIntrinsicWidth();
                this.v = drawable.getIntrinsicHeight();
            } else {
                this.u = 0;
                this.v = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.x = i;
    }

    public void setGravity(int i) {
        if (this.n != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.n = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.n;
        if ((8388615 & i3) != i2) {
            this.n = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.q = z;
    }

    public void setOrientation(int i) {
        if (this.f != i) {
            this.f = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.w) {
            requestLayout();
        }
        this.w = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.n;
        if ((i3 & 112) != i2) {
            this.n = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.p = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.n = 8388659;
        int[] iArr = h0.n;
        h0 v2 = h0.v(context, attributeSet, iArr, i, 0);
        q4.H(this, context, iArr, attributeSet, v2.r(), i, 0);
        int k = v2.k(1, -1);
        if (k >= 0) {
            setOrientation(k);
        }
        int k2 = v2.k(0, -1);
        if (k2 >= 0) {
            setGravity(k2);
        }
        boolean a2 = v2.a(2, true);
        if (!a2) {
            setBaselineAligned(a2);
        }
        this.p = v2.i(4, -1.0f);
        this.b = v2.k(3, -1);
        this.q = v2.a(7, false);
        setDividerDrawable(v2.g(5));
        this.w = v2.k(8, 0);
        this.x = v2.f(6, 0);
        v2.w();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public float a;
        public int b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h0.o);
            this.a = obtainStyledAttributes.getFloat(3, 0.0f);
            this.b = obtainStyledAttributes.getInt(0, -1);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.b = -1;
            this.a = 0.0f;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = -1;
        }
    }
}
