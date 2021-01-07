package android.support.wearable.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.RemoteViews;
import java.util.ArrayList;

@RemoteViews.RemoteView
@Deprecated
public class WearableFrameLayout extends ViewGroup {
    @ViewDebug.ExportedProperty(category = "measurement")
    boolean a;
    @ViewDebug.ExportedProperty(category = "drawing")
    private Drawable b;
    private ColorStateList c;
    private PorterDuff.Mode f;
    private boolean n;
    private boolean o;
    @ViewDebug.ExportedProperty(category = "padding")
    private int p;
    @ViewDebug.ExportedProperty(category = "padding")
    private int q;
    @ViewDebug.ExportedProperty(category = "padding")
    private int r;
    @ViewDebug.ExportedProperty(category = "padding")
    private int s;
    private final Rect t;
    private final Rect u;
    @ViewDebug.ExportedProperty(category = "drawing")
    private int v;
    @ViewDebug.ExportedProperty(category = "drawing")
    private boolean w;
    boolean x;
    private final ArrayList<View> y;
    private boolean z;

    public WearableFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a() {
        Drawable drawable = this.b;
        if (drawable == null) {
            return;
        }
        if (this.n || this.o) {
            Drawable mutate = drawable.mutate();
            this.b = mutate;
            if (this.n) {
                mutate.setTintList(this.c);
            }
            if (this.o) {
                this.b.setTintMode(this.f);
            }
            if (this.b.isStateful()) {
                this.b.setState(getDrawableState());
            }
        }
    }

    private int b(LayoutParams layoutParams) {
        return this.z ? layoutParams.g : ((FrameLayout.LayoutParams) layoutParams).bottomMargin;
    }

    private int c(LayoutParams layoutParams) {
        return this.z ? layoutParams.c : ((FrameLayout.LayoutParams) layoutParams).height;
    }

    private int d(LayoutParams layoutParams) {
        return this.z ? layoutParams.d : ((FrameLayout.LayoutParams) layoutParams).leftMargin;
    }

    private int e(LayoutParams layoutParams) {
        return this.z ? layoutParams.f : ((FrameLayout.LayoutParams) layoutParams).rightMargin;
    }

    private int f(LayoutParams layoutParams) {
        return this.z ? layoutParams.e : ((FrameLayout.LayoutParams) layoutParams).topMargin;
    }

    private int g(LayoutParams layoutParams) {
        return this.z ? layoutParams.b : ((FrameLayout.LayoutParams) layoutParams).width;
    }

    private int getPaddingBottomWithForeground() {
        if (this.w) {
            return Math.max(getPaddingBottom(), this.s);
        }
        return getPaddingBottom() + this.s;
    }

    private int getPaddingTopWithForeground() {
        if (this.w) {
            return Math.max(getPaddingTop(), this.q);
        }
        return getPaddingTop() + this.q;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.b;
        if (drawable != null) {
            if (this.x) {
                this.x = false;
                Rect rect = this.t;
                Rect rect2 = this.u;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.w) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.v, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2, getLayoutDirection());
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.b;
        if (drawable != null && drawable.isStateful()) {
            this.b.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.b;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.v;
    }

    @Override // android.view.View
    public ColorStateList getForegroundTintList() {
        return this.c;
    }

    @Override // android.view.View
    public PorterDuff.Mode getForegroundTintMode() {
        return this.f;
    }

    public boolean getMeasureAllChildren() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public int getPaddingLeftWithForeground() {
        if (this.w) {
            return Math.max(getPaddingLeft(), this.p);
        }
        return getPaddingLeft() + this.p;
    }

    /* access modifiers changed from: package-private */
    public int getPaddingRightWithForeground() {
        if (this.w) {
            return Math.max(getPaddingRight(), this.r);
        }
        return getPaddingRight() + this.r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + d(layoutParams) + e(layoutParams) + i2, g(layoutParams)), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + f(layoutParams) + b(layoutParams) + i4, c(layoutParams)));
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        boolean z2 = this.z != windowInsets.isRound();
        this.z = windowInsets.isRound();
        if (z2) {
            requestLayout();
        }
        return super.onApplyWindowInsets(windowInsets);
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
        accessibilityEvent.setClassName(WearableFrameLayout.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(WearableFrameLayout.class.getName());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0093  */
    @Override // android.view.ViewGroup, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            int r10 = r9.getChildCount()
            int r0 = r9.getPaddingLeftWithForeground()
            int r13 = r13 - r11
            int r11 = r9.getPaddingRightWithForeground()
            int r13 = r13 - r11
            int r11 = r9.getPaddingTopWithForeground()
            int r14 = r14 - r12
            int r12 = r9.getPaddingBottomWithForeground()
            int r14 = r14 - r12
            r12 = 1
            r9.x = r12
            r1 = 0
        L_0x001c:
            if (r1 >= r10) goto L_0x00ad
            android.view.View r2 = r9.getChildAt(r1)
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 == r4) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.support.wearable.view.WearableFrameLayout$LayoutParams r3 = (android.support.wearable.view.WearableFrameLayout.LayoutParams) r3
            int r4 = r2.getMeasuredWidth()
            int r5 = r2.getMeasuredHeight()
            boolean r6 = r9.z
            if (r6 == 0) goto L_0x003f
            int r6 = r3.a
            goto L_0x0041
        L_0x003f:
            int r6 = r3.gravity
        L_0x0041:
            r7 = -1
            if (r6 != r7) goto L_0x0047
            r6 = 8388659(0x800033, float:1.1755015E-38)
        L_0x0047:
            int r7 = r9.getLayoutDirection()
            int r7 = android.view.Gravity.getAbsoluteGravity(r6, r7)
            r6 = r6 & 112(0x70, float:1.57E-43)
            r7 = r7 & 7
            if (r7 == r12) goto L_0x0065
            r8 = 5
            if (r7 == r8) goto L_0x005e
            int r7 = r9.d(r3)
            int r7 = r7 + r0
            goto L_0x0075
        L_0x005e:
            int r7 = r13 - r4
            int r8 = r9.e(r3)
            goto L_0x0074
        L_0x0065:
            int r7 = r13 - r0
            int r7 = r7 - r4
            int r7 = r7 / 2
            int r7 = r7 + r0
            int r8 = r9.d(r3)
            int r7 = r7 + r8
            int r8 = r9.e(r3)
        L_0x0074:
            int r7 = r7 - r8
        L_0x0075:
            r8 = 16
            if (r6 == r8) goto L_0x0093
            r8 = 48
            if (r6 == r8) goto L_0x008d
            r8 = 80
            if (r6 == r8) goto L_0x0086
            int r3 = r9.f(r3)
            goto L_0x0091
        L_0x0086:
            int r6 = r14 - r5
            int r3 = r9.b(r3)
            goto L_0x00a2
        L_0x008d:
            int r3 = r9.f(r3)
        L_0x0091:
            int r3 = r3 + r11
            goto L_0x00a4
        L_0x0093:
            int r6 = r14 - r11
            int r6 = r6 - r5
            int r6 = r6 / 2
            int r6 = r6 + r11
            int r8 = r9.f(r3)
            int r6 = r6 + r8
            int r3 = r9.b(r3)
        L_0x00a2:
            int r3 = r6 - r3
        L_0x00a4:
            int r4 = r4 + r7
            int r5 = r5 + r3
            r2.layout(r7, r3, r4, r5)
        L_0x00a9:
            int r1 = r1 + 1
            goto L_0x001c
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.view.WearableFrameLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int childCount = getChildCount();
        boolean z2 = (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) ? false : true;
        this.y.clear();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (this.a || childAt.getVisibility() != 8) {
                measureChildWithMargins(childAt, i, 0, i2, 0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                i7 = Math.max(i7, childAt.getMeasuredWidth() + d(layoutParams) + e(layoutParams));
                i6 = Math.max(i6, childAt.getMeasuredHeight() + f(layoutParams) + b(layoutParams));
                i5 = ViewGroup.combineMeasuredStates(i5, childAt.getMeasuredState());
                if (z2 && (g(layoutParams) == -1 || c(layoutParams) == -1)) {
                    this.y.add(childAt);
                }
            }
        }
        int max = Math.max(getPaddingTopWithForeground() + getPaddingBottomWithForeground() + i6, getSuggestedMinimumHeight());
        int max2 = Math.max(getPaddingLeftWithForeground() + getPaddingRightWithForeground() + i7, getSuggestedMinimumWidth());
        Drawable foreground = getForeground();
        if (foreground != null) {
            max = Math.max(max, foreground.getMinimumHeight());
            max2 = Math.max(max2, foreground.getMinimumWidth());
        }
        setMeasuredDimension(ViewGroup.resolveSizeAndState(max2, i, i5), ViewGroup.resolveSizeAndState(max, i2, i5 << 16));
        int size = this.y.size();
        if (size > 1) {
            for (int i9 = 0; i9 < size; i9++) {
                View view = this.y.get(i9);
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                if (g(layoutParams2) == -1) {
                    i3 = View.MeasureSpec.makeMeasureSpec((((getMeasuredWidth() - getPaddingLeftWithForeground()) - getPaddingRightWithForeground()) - d(layoutParams2)) - e(layoutParams2), 1073741824);
                } else {
                    i3 = ViewGroup.getChildMeasureSpec(i, getPaddingLeftWithForeground() + getPaddingRightWithForeground() + d(layoutParams2) + e(layoutParams2), g(layoutParams2));
                }
                if (c(layoutParams2) == -1) {
                    i4 = View.MeasureSpec.makeMeasureSpec((((getMeasuredHeight() - getPaddingTopWithForeground()) - getPaddingBottomWithForeground()) - f(layoutParams2)) - b(layoutParams2), 1073741824);
                } else {
                    i4 = ViewGroup.getChildMeasureSpec(i2, getPaddingTopWithForeground() + getPaddingBottomWithForeground() + f(layoutParams2) + b(layoutParams2), c(layoutParams2));
                }
                view.measure(i3, i4);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.x = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.b;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.b);
            }
            this.b = drawable;
            this.p = 0;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                a();
                if (this.v == 119) {
                    Rect rect = new Rect();
                    if (drawable.getPadding(rect)) {
                        this.p = rect.left;
                        this.q = rect.top;
                        this.r = rect.right;
                        this.s = rect.bottom;
                    }
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.v != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.v = i;
            if (i != 119 || this.b == null) {
                this.p = 0;
                this.q = 0;
                this.r = 0;
                this.s = 0;
            } else {
                Rect rect = new Rect();
                if (this.b.getPadding(rect)) {
                    this.p = rect.left;
                    this.q = rect.top;
                    this.r = rect.right;
                    this.s = rect.bottom;
                }
            }
            requestLayout();
        }
    }

    public void setForegroundInPadding(boolean z2) {
        this.w = z2;
    }

    @Override // android.view.View
    public void setForegroundTintList(ColorStateList colorStateList) {
        this.c = colorStateList;
        this.n = true;
        a();
    }

    @Override // android.view.View
    public void setForegroundTintMode(PorterDuff.Mode mode) {
        this.f = mode;
        this.o = true;
        a();
    }

    public void setMeasureAllChildren(boolean z2) {
        this.a = z2;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setVisible(i == 0, false);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.b;
    }

    public WearableFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.a = false;
        this.c = null;
        this.f = null;
        this.n = false;
        this.o = false;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new Rect();
        this.u = new Rect();
        this.v = 119;
        this.w = true;
        this.x = false;
        this.y = new ArrayList<>(1);
        this.z = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.r, i, 0);
        this.v = obtainStyledAttributes.getInt(2, this.v);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        if (obtainStyledAttributes.getBoolean(1, false)) {
            setMeasureAllChildren(true);
        }
        if (obtainStyledAttributes.hasValue(3)) {
            this.c = obtainStyledAttributes.getColorStateList(3);
            this.n = true;
        }
        obtainStyledAttributes.recycle();
        a();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams((LayoutParams) layoutParams);
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {
        public int a = -1;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.r);
            this.a = obtainStyledAttributes.getInt(4, ((FrameLayout.LayoutParams) this).gravity);
            this.b = obtainStyledAttributes.getLayoutDimension(11, ((FrameLayout.LayoutParams) this).width);
            this.c = obtainStyledAttributes.getLayoutDimension(5, ((FrameLayout.LayoutParams) this).height);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(9, -1);
            if (dimensionPixelSize >= 0) {
                this.g = dimensionPixelSize;
                this.e = dimensionPixelSize;
                this.f = dimensionPixelSize;
                this.d = dimensionPixelSize;
            } else {
                this.d = obtainStyledAttributes.getDimensionPixelSize(7, ((FrameLayout.LayoutParams) this).leftMargin);
                this.e = obtainStyledAttributes.getDimensionPixelSize(10, ((FrameLayout.LayoutParams) this).topMargin);
                this.f = obtainStyledAttributes.getDimensionPixelSize(8, ((FrameLayout.LayoutParams) this).rightMargin);
                this.g = obtainStyledAttributes.getDimensionPixelSize(6, ((FrameLayout.LayoutParams) this).bottomMargin);
            }
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.b = i;
            this.c = i2;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((FrameLayout.LayoutParams) layoutParams);
            this.b = layoutParams.b;
            this.c = layoutParams.c;
            this.a = layoutParams.a;
            this.d = layoutParams.d;
            this.e = layoutParams.e;
            this.f = layoutParams.f;
            this.g = layoutParams.g;
        }
    }
}
