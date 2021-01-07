package android.support.wearable.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;

@Deprecated
public class BoxInsetLayout extends FrameLayout {
    private final int a;
    private final int b;
    private boolean c;
    private Rect f;
    private Rect n;

    public BoxInsetLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int a(LayoutParams layoutParams, int i, int i2) {
        if (!this.c || (layoutParams.a & 8) == 0 || (((FrameLayout.LayoutParams) layoutParams).height != -1 && i != 80)) {
            return ((FrameLayout.LayoutParams) layoutParams).bottomMargin;
        }
        return ((FrameLayout.LayoutParams) layoutParams).bottomMargin + i2;
    }

    private int b(LayoutParams layoutParams, int i, int i2) {
        if (!this.c || (layoutParams.a & 1) == 0 || (((FrameLayout.LayoutParams) layoutParams).width != -1 && i != 3)) {
            return ((FrameLayout.LayoutParams) layoutParams).leftMargin;
        }
        return ((FrameLayout.LayoutParams) layoutParams).leftMargin + i2;
    }

    private int c(LayoutParams layoutParams, int i, int i2) {
        if (!this.c || (layoutParams.a & 4) == 0 || (((FrameLayout.LayoutParams) layoutParams).width != -1 && i != 5)) {
            return ((FrameLayout.LayoutParams) layoutParams).rightMargin;
        }
        return ((FrameLayout.LayoutParams) layoutParams).rightMargin + i2;
    }

    private int d(LayoutParams layoutParams, int i, int i2) {
        if (!this.c || (layoutParams.a & 2) == 0 || (((FrameLayout.LayoutParams) layoutParams).height != -1 && i != 48)) {
            return ((FrameLayout.LayoutParams) layoutParams).topMargin;
        }
        return ((FrameLayout.LayoutParams) layoutParams).topMargin + i2;
    }

    private int e() {
        return (int) (((float) Math.max(Math.min(getMeasuredWidth(), this.b), Math.min(getMeasuredHeight(), this.a))) * 0.146467f);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public Rect getInsets() {
        return this.n;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        if (Build.VERSION.SDK_INT < 23) {
            boolean isRound = onApplyWindowInsets.isRound();
            if (isRound != this.c) {
                this.c = isRound;
                requestLayout();
            }
            this.n.set(onApplyWindowInsets.getSystemWindowInsetLeft(), onApplyWindowInsets.getSystemWindowInsetTop(), onApplyWindowInsets.getSystemWindowInsetRight(), onApplyWindowInsets.getSystemWindowInsetBottom());
        }
        return onApplyWindowInsets;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT < 23) {
            requestApplyInsets();
            return;
        }
        this.c = getResources().getConfiguration().isScreenRound();
        WindowInsets rootWindowInsets = getRootWindowInsets();
        this.n.set(rootWindowInsets.getSystemWindowInsetLeft(), rootWindowInsets.getSystemWindowInsetTop(), rootWindowInsets.getSystemWindowInsetRight(), rootWindowInsets.getSystemWindowInsetBottom());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009d  */
    @Override // android.widget.FrameLayout, android.view.View, android.view.ViewGroup
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r17.getChildCount()
            int r2 = r17.getPaddingLeft()
            android.graphics.Rect r3 = r0.f
            int r3 = r3.left
            int r2 = r2 + r3
            int r3 = r21 - r19
            int r4 = r17.getPaddingRight()
            int r3 = r3 - r4
            android.graphics.Rect r4 = r0.f
            int r4 = r4.right
            int r3 = r3 - r4
            int r4 = r17.getPaddingTop()
            android.graphics.Rect r5 = r0.f
            int r5 = r5.top
            int r4 = r4 + r5
            int r5 = r22 - r20
            int r6 = r17.getPaddingBottom()
            int r5 = r5 - r6
            android.graphics.Rect r6 = r0.f
            int r6 = r6.bottom
            int r5 = r5 - r6
            r6 = 0
        L_0x0031:
            if (r6 >= r1) goto L_0x00c0
            android.view.View r7 = r0.getChildAt(r6)
            int r8 = r7.getVisibility()
            r9 = 8
            if (r8 == r9) goto L_0x00b8
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            android.support.wearable.view.BoxInsetLayout$LayoutParams r8 = (android.support.wearable.view.BoxInsetLayout.LayoutParams) r8
            int r9 = r7.getMeasuredWidth()
            int r10 = r7.getMeasuredHeight()
            int r11 = r8.gravity
            r12 = -1
            if (r11 != r12) goto L_0x0055
            r11 = 8388659(0x800033, float:1.1755015E-38)
        L_0x0055:
            int r13 = r17.getLayoutDirection()
            int r13 = android.view.Gravity.getAbsoluteGravity(r11, r13)
            r14 = r11 & 112(0x70, float:1.57E-43)
            r11 = r11 & 7
            int r15 = r17.e()
            int r16 = r0.b(r8, r11, r15)
            int r11 = r0.c(r8, r11, r15)
            r18 = r1
            int r1 = r8.width
            if (r1 != r12) goto L_0x0078
        L_0x0073:
            int r16 = r2 + r16
        L_0x0075:
            r1 = r16
            goto L_0x008f
        L_0x0078:
            r1 = r13 & 7
            r13 = 1
            if (r1 == r13) goto L_0x0084
            r13 = 5
            if (r1 == r13) goto L_0x0081
            goto L_0x0073
        L_0x0081:
            int r1 = r3 - r9
            goto L_0x008c
        L_0x0084:
            int r1 = r3 - r2
            int r1 = r1 - r9
            int r1 = r1 / 2
            int r1 = r1 + r2
            int r1 = r1 + r16
        L_0x008c:
            int r16 = r1 - r11
            goto L_0x0075
        L_0x008f:
            int r11 = r0.d(r8, r14, r15)
            int r13 = r0.a(r8, r14, r15)
            int r8 = r8.height
            if (r8 != r12) goto L_0x009d
        L_0x009b:
            int r11 = r11 + r4
            goto L_0x00b2
        L_0x009d:
            r8 = 16
            if (r14 == r8) goto L_0x00a9
            r8 = 80
            if (r14 == r8) goto L_0x00a6
            goto L_0x009b
        L_0x00a6:
            int r8 = r5 - r10
            goto L_0x00b0
        L_0x00a9:
            int r8 = r5 - r4
            int r8 = r8 - r10
            int r8 = r8 / 2
            int r8 = r8 + r4
            int r8 = r8 + r11
        L_0x00b0:
            int r11 = r8 - r13
        L_0x00b2:
            int r9 = r9 + r1
            int r10 = r10 + r11
            r7.layout(r1, r11, r9, r10)
            goto L_0x00ba
        L_0x00b8:
            r18 = r1
        L_0x00ba:
            int r6 = r6 + 1
            r1 = r18
            goto L_0x0031
        L_0x00c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.view.BoxInsetLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (this.c) {
                    int i15 = layoutParams.a;
                    i9 = (i15 & 1) == 0 ? ((FrameLayout.LayoutParams) layoutParams).leftMargin : 0;
                    i8 = (i15 & 4) == 0 ? ((FrameLayout.LayoutParams) layoutParams).rightMargin : 0;
                    i7 = (i15 & 2) == 0 ? ((FrameLayout.LayoutParams) layoutParams).topMargin : 0;
                    if ((i15 & 8) == 0) {
                        i10 = ((FrameLayout.LayoutParams) layoutParams).bottomMargin;
                    } else {
                        i5 = i9;
                        i4 = i8;
                        i3 = i7;
                        i6 = 0;
                        measureChildWithMargins(childAt, i, 0, i2, 0);
                        i11 = Math.max(i11, childAt.getMeasuredWidth() + i5 + i4);
                        i12 = Math.max(i12, childAt.getMeasuredHeight() + i3 + i6);
                        i13 = FrameLayout.combineMeasuredStates(i13, childAt.getMeasuredState());
                    }
                } else {
                    i9 = ((FrameLayout.LayoutParams) layoutParams).leftMargin;
                    i7 = ((FrameLayout.LayoutParams) layoutParams).topMargin;
                    i8 = ((FrameLayout.LayoutParams) layoutParams).rightMargin;
                    i10 = ((FrameLayout.LayoutParams) layoutParams).bottomMargin;
                }
                i6 = i10;
                i5 = i9;
                i4 = i8;
                i3 = i7;
                measureChildWithMargins(childAt, i, 0, i2, 0);
                i11 = Math.max(i11, childAt.getMeasuredWidth() + i5 + i4);
                i12 = Math.max(i12, childAt.getMeasuredHeight() + i3 + i6);
                i13 = FrameLayout.combineMeasuredStates(i13, childAt.getMeasuredState());
            }
        }
        int paddingLeft = getPaddingLeft() + this.f.left;
        int max = Math.max(getPaddingBottom() + getPaddingTop() + this.f.top + this.f.bottom + i12, getSuggestedMinimumHeight());
        int max2 = Math.max(getPaddingRight() + paddingLeft + this.f.right + i11, getSuggestedMinimumWidth());
        Drawable foreground = getForeground();
        if (foreground != null) {
            max = Math.max(max, foreground.getMinimumHeight());
            max2 = Math.max(max2, foreground.getMinimumWidth());
        }
        setMeasuredDimension(FrameLayout.resolveSizeAndState(max2, i, i13), FrameLayout.resolveSizeAndState(max, i2, i13 << 16));
        int e = e();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            int i17 = ((FrameLayout.LayoutParams) layoutParams2).gravity;
            if (i17 == -1) {
                i17 = 8388659;
            }
            int i18 = i17 & 112;
            int i19 = i17 & 7;
            childAt2.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + this.f.left + getPaddingRight() + this.f.right + b(layoutParams2, i19, e) + c(layoutParams2, i19, e), ((FrameLayout.LayoutParams) layoutParams2).width), FrameLayout.getChildMeasureSpec(i2, getPaddingTop() + this.f.top + getPaddingBottom() + this.f.bottom + d(layoutParams2, i18, e) + a(layoutParams2, i18, e), ((FrameLayout.LayoutParams) layoutParams2).height));
        }
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        super.setForeground(drawable);
        if (this.f == null) {
            this.f = new Rect();
        }
        drawable.getPadding(this.f);
    }

    public BoxInsetLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (this.f == null) {
            this.f = new Rect();
        }
        if (this.n == null) {
            this.n = new Rect();
        }
        this.a = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.b = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public FrameLayout.LayoutParams mo0generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {
        public int a = 0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.e, 0, 0);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
