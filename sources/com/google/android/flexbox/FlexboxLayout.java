package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.flexbox.d;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayout extends ViewGroup implements a {
    private int a;
    private int b;
    private int c;
    private int f;
    private int n;
    private int o;
    private Drawable p;
    private Drawable q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int[] v;
    private SparseIntArray w;
    private d x;
    private List<c> y;
    private d.b z;

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(Canvas canvas, boolean z2, boolean z3) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.y.size();
        for (int i5 = 0; i5 < size; i5++) {
            c cVar = this.y.get(i5);
            for (int i6 = 0; i6 < cVar.h; i6++) {
                int i7 = cVar.o + i6;
                View f2 = f(i7);
                if (!(f2 == null || f2.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) f2.getLayoutParams();
                    if (g(i7, i6)) {
                        if (z2) {
                            i4 = f2.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        } else {
                            i4 = (f2.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.u;
                        }
                        e(canvas, i4, cVar.b, cVar.g);
                    }
                    if (i6 == cVar.h - 1 && (this.s & 4) > 0) {
                        if (z2) {
                            i3 = (f2.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.u;
                        } else {
                            i3 = f2.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        }
                        e(canvas, i3, cVar.b, cVar.g);
                    }
                }
            }
            if (i(i5)) {
                if (z3) {
                    i2 = cVar.d;
                } else {
                    i2 = cVar.b - this.t;
                }
                d(canvas, paddingLeft, i2, max);
            }
            if (m(i5) && (this.r & 4) > 0) {
                if (z3) {
                    i = cVar.b - this.t;
                } else {
                    i = cVar.d;
                }
                d(canvas, paddingLeft, i, max);
            }
        }
    }

    private void b(Canvas canvas, boolean z2, boolean z3) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.y.size();
        for (int i5 = 0; i5 < size; i5++) {
            c cVar = this.y.get(i5);
            for (int i6 = 0; i6 < cVar.h; i6++) {
                int i7 = cVar.o + i6;
                View f2 = f(i7);
                if (!(f2 == null || f2.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) f2.getLayoutParams();
                    if (g(i7, i6)) {
                        if (z3) {
                            i4 = f2.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        } else {
                            i4 = (f2.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.t;
                        }
                        d(canvas, cVar.a, i4, cVar.g);
                    }
                    if (i6 == cVar.h - 1 && (this.r & 4) > 0) {
                        if (z3) {
                            i3 = (f2.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.t;
                        } else {
                            i3 = f2.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        }
                        d(canvas, cVar.a, i3, cVar.g);
                    }
                }
            }
            if (i(i5)) {
                if (z2) {
                    i2 = cVar.c;
                } else {
                    i2 = cVar.a - this.u;
                }
                e(canvas, i2, paddingTop, max);
            }
            if (m(i5) && (this.s & 4) > 0) {
                if (z2) {
                    i = cVar.a - this.u;
                } else {
                    i = cVar.c;
                }
                e(canvas, i, paddingTop, max);
            }
        }
    }

    private void d(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3 + i, this.t + i2);
            this.p.draw(canvas);
        }
    }

    private void e(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.setBounds(i, i2, this.u + i, i3 + i2);
            this.q.draw(canvas);
        }
    }

    private boolean g(int i, int i2) {
        boolean z2;
        int i3 = 1;
        while (true) {
            if (i3 > i2) {
                z2 = true;
                break;
            }
            View f2 = f(i - i3);
            if (f2 != null && f2.getVisibility() != 8) {
                z2 = false;
                break;
            }
            i3++;
        }
        if (z2) {
            if (s()) {
                if ((this.s & 1) != 0) {
                    return true;
                }
                return false;
            } else if ((this.r & 1) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (s()) {
            if ((this.s & 2) != 0) {
                return true;
            }
            return false;
        } else if ((this.r & 2) != 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean i(int i) {
        boolean z2;
        if (i < 0 || i >= this.y.size()) {
            return false;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z2 = true;
                break;
            } else if (this.y.get(i2).a() > 0) {
                z2 = false;
                break;
            } else {
                i2++;
            }
        }
        if (z2) {
            if (s()) {
                if ((this.r & 1) != 0) {
                    return true;
                }
                return false;
            } else if ((this.s & 1) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (s()) {
            if ((this.r & 2) != 0) {
                return true;
            }
            return false;
        } else if ((this.s & 2) != 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean m(int i) {
        if (i < 0 || i >= this.y.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.y.size(); i2++) {
            if (this.y.get(i2).a() > 0) {
                return false;
            }
        }
        if (s()) {
            if ((this.r & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.s & 4) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void q(boolean r26, int r27, int r28, int r29, int r30) {
        /*
        // Method dump skipped, instructions count: 522
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.q(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void t(boolean r28, boolean r29, int r30, int r31, int r32, int r33) {
        /*
        // Method dump skipped, instructions count: 514
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.t(boolean, boolean, int, int, int, int):void");
    }

    private void u(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            i5 = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            i6 = getLargestMainSize();
        } else if (i == 2 || i == 3) {
            i5 = getLargestMainSize();
            i6 = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        } else {
            throw new IllegalArgumentException(je.p0("Invalid flex direction: ", i));
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < i6) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = i6;
            }
            i7 = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            i7 = View.resolveSizeAndState(i6, i2, i4);
        } else if (mode == 1073741824) {
            if (size < i6) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            i7 = View.resolveSizeAndState(size, i2, i4);
        } else {
            throw new IllegalStateException(je.p0("Unknown width mode is set: ", mode));
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < i5) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = i5;
            }
            i8 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            i8 = View.resolveSizeAndState(i5, i3, i4);
        } else if (mode2 == 1073741824) {
            if (size2 < i5) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            i8 = View.resolveSizeAndState(size2, i3, i4);
        } else {
            throw new IllegalStateException(je.p0("Unknown height mode is set: ", mode2));
        }
        setMeasuredDimension(i7, i8);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.w == null) {
            this.w = new SparseIntArray(getChildCount());
        }
        this.v = this.x.h(view, i, layoutParams, this.w);
        super.addView(view, i, layoutParams);
    }

    @Override // com.google.android.flexbox.a
    public void c(View view, int i, int i2, c cVar) {
        if (!g(i, i2)) {
            return;
        }
        if (s()) {
            int i3 = cVar.e;
            int i4 = this.u;
            cVar.e = i3 + i4;
            cVar.f += i4;
            return;
        }
        int i5 = cVar.e;
        int i6 = this.t;
        cVar.e = i5 + i6;
        cVar.f += i6;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public View f(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.v;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // com.google.android.flexbox.a
    public int getAlignContent() {
        return this.n;
    }

    @Override // com.google.android.flexbox.a
    public int getAlignItems() {
        return this.f;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.p;
    }

    public Drawable getDividerDrawableVertical() {
        return this.q;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexDirection() {
        return this.a;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<c> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.y.size());
        for (c cVar : this.y) {
            if (cVar.a() != 0) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.a
    public List<c> getFlexLinesInternal() {
        return this.y;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexWrap() {
        return this.b;
    }

    public int getJustifyContent() {
        return this.c;
    }

    @Override // com.google.android.flexbox.a
    public int getLargestMainSize() {
        int i = Integer.MIN_VALUE;
        for (c cVar : this.y) {
            i = Math.max(i, cVar.e);
        }
        return i;
    }

    @Override // com.google.android.flexbox.a
    public int getMaxLine() {
        return this.o;
    }

    public int getShowDividerHorizontal() {
        return this.r;
    }

    public int getShowDividerVertical() {
        return this.s;
    }

    @Override // com.google.android.flexbox.a
    public int getSumOfCrossSize() {
        int i;
        int i2;
        int size = this.y.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            c cVar = this.y.get(i4);
            if (i(i4)) {
                if (s()) {
                    i2 = this.t;
                } else {
                    i2 = this.u;
                }
                i3 += i2;
            }
            if (m(i4)) {
                if (s()) {
                    i = this.t;
                } else {
                    i = this.u;
                }
                i3 += i;
            }
            i3 += cVar.g;
        }
        return i3;
    }

    @Override // com.google.android.flexbox.a
    public int h(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.google.android.flexbox.a
    public View j(int i) {
        return getChildAt(i);
    }

    @Override // com.google.android.flexbox.a
    public int k(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.google.android.flexbox.a
    public int l(View view) {
        return 0;
    }

    @Override // com.google.android.flexbox.a
    public void n(c cVar) {
        if (s()) {
            if ((this.s & 4) > 0) {
                int i = cVar.e;
                int i2 = this.u;
                cVar.e = i + i2;
                cVar.f += i2;
            }
        } else if ((this.r & 4) > 0) {
            int i3 = cVar.e;
            int i4 = this.t;
            cVar.e = i3 + i4;
            cVar.f += i4;
        }
    }

    @Override // com.google.android.flexbox.a
    public View o(int i) {
        return f(i);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.q != null || this.p != null) {
            if (this.r != 0 || this.s != 0) {
                int o2 = q4.o(this);
                int i = this.a;
                boolean z2 = false;
                boolean z3 = true;
                if (i == 0) {
                    boolean z4 = o2 == 1;
                    if (this.b == 2) {
                        z2 = true;
                    }
                    a(canvas, z4, z2);
                } else if (i == 1) {
                    boolean z5 = o2 != 1;
                    if (this.b == 2) {
                        z2 = true;
                    }
                    a(canvas, z5, z2);
                } else if (i == 2) {
                    if (o2 != 1) {
                        z3 = false;
                    }
                    if (this.b == 2) {
                        z3 = !z3;
                    }
                    b(canvas, z3, false);
                } else if (i == 3) {
                    if (o2 == 1) {
                        z2 = true;
                    }
                    if (this.b == 2) {
                        z2 = !z2;
                    }
                    b(canvas, z2, true);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int o2 = q4.o(this);
        int i5 = this.a;
        boolean z3 = false;
        if (i5 == 0) {
            q(o2 == 1, i, i2, i3, i4);
        } else if (i5 == 1) {
            q(o2 != 1, i, i2, i3, i4);
        } else if (i5 == 2) {
            if (o2 == 1) {
                z3 = true;
            }
            if (this.b == 2) {
                z3 = !z3;
            }
            t(z3, false, i, i2, i3, i4);
        } else if (i5 == 3) {
            if (o2 == 1) {
                z3 = true;
            }
            if (this.b == 2) {
                z3 = !z3;
            }
            t(z3, true, i, i2, i3, i4);
        } else {
            StringBuilder V0 = je.V0("Invalid flex direction is set: ");
            V0.append(this.a);
            throw new IllegalStateException(V0.toString());
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.w == null) {
            this.w = new SparseIntArray(getChildCount());
        }
        if (this.x.w(this.w)) {
            this.v = this.x.g(this.w);
        }
        int i3 = this.a;
        if (i3 == 0 || i3 == 1) {
            this.y.clear();
            this.z.a();
            this.x.b(this.z, i, i2, Integer.MAX_VALUE, 0, -1, null);
            this.y = this.z.a;
            this.x.j(i, i2, 0);
            if (this.f == 3) {
                for (c cVar : this.y) {
                    int i4 = Integer.MIN_VALUE;
                    for (int i5 = 0; i5 < cVar.h; i5++) {
                        View f2 = f(cVar.o + i5);
                        if (!(f2 == null || f2.getVisibility() == 8)) {
                            LayoutParams layoutParams = (LayoutParams) f2.getLayoutParams();
                            if (this.b != 2) {
                                i4 = Math.max(i4, f2.getMeasuredHeight() + Math.max(cVar.l - f2.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                            } else {
                                i4 = Math.max(i4, f2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max(f2.getBaseline() + (cVar.l - f2.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                            }
                        }
                    }
                    cVar.g = i4;
                }
            }
            this.x.i(i, i2, getPaddingBottom() + getPaddingTop());
            this.x.D(0);
            u(this.a, i, i2, this.z.b);
        } else if (i3 == 2 || i3 == 3) {
            this.y.clear();
            this.z.a();
            this.x.b(this.z, i2, i, Integer.MAX_VALUE, 0, -1, null);
            this.y = this.z.a;
            this.x.j(i, i2, 0);
            this.x.i(i, i2, getPaddingRight() + getPaddingLeft());
            this.x.D(0);
            u(this.a, i, i2, this.z.b);
        } else {
            StringBuilder V0 = je.V0("Invalid value for the flex direction is set: ");
            V0.append(this.a);
            throw new IllegalStateException(V0.toString());
        }
    }

    @Override // com.google.android.flexbox.a
    public void p(int i, View view) {
    }

    @Override // com.google.android.flexbox.a
    public int r(View view, int i, int i2) {
        int i3;
        int i4 = 0;
        if (s()) {
            if (g(i, i2)) {
                i4 = 0 + this.u;
            }
            if ((this.s & 4) <= 0) {
                return i4;
            }
            i3 = this.u;
        } else {
            if (g(i, i2)) {
                i4 = 0 + this.t;
            }
            if ((this.r & 4) <= 0) {
                return i4;
            }
            i3 = this.t;
        }
        return i4 + i3;
    }

    @Override // com.google.android.flexbox.a
    public boolean s() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    public void setAlignContent(int i) {
        if (this.n != i) {
            this.n = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.f != i) {
            this.f = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable != this.p) {
            this.p = drawable;
            if (drawable != null) {
                this.t = drawable.getIntrinsicHeight();
            } else {
                this.t = 0;
            }
            if (this.p == null && this.q == null) {
                setWillNotDraw(true);
            } else {
                setWillNotDraw(false);
            }
            requestLayout();
        }
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable != this.q) {
            this.q = drawable;
            if (drawable != null) {
                this.u = drawable.getIntrinsicWidth();
            } else {
                this.u = 0;
            }
            if (this.p == null && this.q == null) {
                setWillNotDraw(true);
            } else {
                setWillNotDraw(false);
            }
            requestLayout();
        }
    }

    public void setFlexDirection(int i) {
        if (this.a != i) {
            this.a = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.a
    public void setFlexLines(List<c> list) {
        this.y = list;
    }

    public void setFlexWrap(int i) {
        if (this.b != i) {
            this.b = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.o != i) {
            this.o = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.r) {
            this.r = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.s) {
            this.s = i;
            requestLayout();
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = -1;
        this.x = new d(this);
        this.y = new ArrayList();
        this.z = new d.b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.a, i, 0);
        this.a = obtainStyledAttributes.getInt(5, 0);
        this.b = obtainStyledAttributes.getInt(6, 0);
        this.c = obtainStyledAttributes.getInt(7, 0);
        this.f = obtainStyledAttributes.getInt(1, 0);
        this.n = obtainStyledAttributes.getInt(0, 0);
        this.o = obtainStyledAttributes.getInt(8, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = obtainStyledAttributes.getInt(9, 0);
        if (i2 != 0) {
            this.s = i2;
            this.r = i2;
        }
        int i3 = obtainStyledAttributes.getInt(11, 0);
        if (i3 != 0) {
            this.s = i3;
        }
        int i4 = obtainStyledAttributes.getInt(10, 0);
        if (i4 != 0) {
            this.r = i4;
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements b {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();
        private int a = 1;
        private float b = 0.0f;
        private float c = 1.0f;
        private int f = -1;
        private float n = -1.0f;
        private int o = -1;
        private int p = -1;
        private int q = 16777215;
        private int r = 16777215;
        private boolean s;

        static class a implements Parcelable.Creator<LayoutParams> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.b);
            this.a = obtainStyledAttributes.getInt(8, 1);
            this.b = obtainStyledAttributes.getFloat(2, 0.0f);
            this.c = obtainStyledAttributes.getFloat(3, 1.0f);
            this.f = obtainStyledAttributes.getInt(0, -1);
            this.n = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
            this.o = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            this.p = obtainStyledAttributes.getDimensionPixelSize(6, -1);
            this.q = obtainStyledAttributes.getDimensionPixelSize(5, 16777215);
            this.r = obtainStyledAttributes.getDimensionPixelSize(4, 16777215);
            this.s = obtainStyledAttributes.getBoolean(9, false);
            obtainStyledAttributes.recycle();
        }

        @Override // com.google.android.flexbox.b
        public boolean G0() {
            return this.s;
        }

        @Override // com.google.android.flexbox.b
        public int I() {
            return this.f;
        }

        @Override // com.google.android.flexbox.b
        public float M() {
            return this.c;
        }

        @Override // com.google.android.flexbox.b
        public int Q() {
            return this.o;
        }

        @Override // com.google.android.flexbox.b
        public int T0() {
            return this.q;
        }

        @Override // com.google.android.flexbox.b
        public int X1() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.b
        public int a2() {
            return this.p;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.b
        public int e2() {
            return this.r;
        }

        @Override // com.google.android.flexbox.b
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.b
        public int getOrder() {
            return this.a;
        }

        @Override // com.google.android.flexbox.b
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.b
        public int h0() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.b
        public void m0(int i) {
            this.p = i;
        }

        @Override // com.google.android.flexbox.b
        public float o0() {
            return this.b;
        }

        @Override // com.google.android.flexbox.b
        public float v0() {
            return this.n;
        }

        @Override // com.google.android.flexbox.b
        public void v1(int i) {
            this.o = i;
        }

        @Override // com.google.android.flexbox.b
        public int w1() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeFloat(this.b);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.f);
            parcel.writeFloat(this.n);
            parcel.writeInt(this.o);
            parcel.writeInt(this.p);
            parcel.writeInt(this.q);
            parcel.writeInt(this.r);
            parcel.writeByte(this.s ? (byte) 1 : 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.b
        public int z1() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.a = layoutParams.a;
            this.b = layoutParams.b;
            this.c = layoutParams.c;
            this.f = layoutParams.f;
            this.n = layoutParams.n;
            this.o = layoutParams.o;
            this.p = layoutParams.p;
            this.q = layoutParams.q;
            this.r = layoutParams.r;
            this.s = layoutParams.s;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        protected LayoutParams(Parcel parcel) {
            super(0, 0);
            boolean z = false;
            this.a = parcel.readInt();
            this.b = parcel.readFloat();
            this.c = parcel.readFloat();
            this.f = parcel.readInt();
            this.n = parcel.readFloat();
            this.o = parcel.readInt();
            this.p = parcel.readInt();
            this.q = parcel.readInt();
            this.r = parcel.readInt();
            this.s = parcel.readByte() != 0 ? true : z;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}
