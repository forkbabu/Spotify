package com.spotify.music.podcast.ui.topic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.List;

public class OverFlowLayout extends ViewGroup {
    private final List<Integer> a = new ArrayList(3);
    private final List<Integer> b = new ArrayList(3);
    private int c;
    private int f;
    private int n = getResources().getDimensionPixelSize(C0707R.dimen.overflow_layout_default_inner_spacing);

    public OverFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private int getTotalHeight() {
        int i = this.c;
        int i2 = this.f;
        int i3 = this.n;
        return getPaddingBottom() + getPaddingTop() + ((i2 * i3) - i3) + (i * i2);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (nud.n(this)) {
                i5 = (i3 - this.a.get(i7).intValue()) - i;
                i6 = i5 - childAt.getMeasuredWidth();
            } else {
                i6 = this.a.get(i7).intValue();
                i5 = childAt.getMeasuredWidth() + i6;
            }
            int intValue = this.b.get(i7).intValue();
            childAt.layout(i6, intValue, i5, childAt.getMeasuredHeight() + intValue);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            childAt.measure(makeMeasureSpec, makeMeasureSpec);
            this.c = childAt.getMeasuredHeight();
        }
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f = 0;
        int childCount2 = getChildCount();
        int i4 = paddingLeft;
        for (int i5 = 0; i5 < childCount2; i5++) {
            View childAt2 = getChildAt(i5);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt2.getLayoutParams();
            int measuredWidth = childAt2.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            if (measuredWidth + i4 > size) {
                this.f++;
                i4 = paddingLeft;
            }
            this.a.add(Integer.valueOf(i4));
            i4 += measuredWidth;
            this.b.add(Integer.valueOf(((this.c + this.n) * this.f) + paddingTop));
        }
        this.f++;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getTotalHeight(), 1073741824));
    }

    public void setRowInnerPadding(int i) {
        this.n = getResources().getDimensionPixelSize(i);
    }
}
