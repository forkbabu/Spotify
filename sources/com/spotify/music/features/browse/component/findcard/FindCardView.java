package com.spotify.music.features.browse.component.findcard;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.internal.StateListAnimatorTextView;
import com.spotify.paste.widgets.layouts.PasteFrameLayout;

public class FindCardView extends PasteFrameLayout {
    private final v64 o;
    private final StateListAnimatorTextView p;
    private final Rect q;
    private boolean r;

    public FindCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: package-private */
    public void b(int i, int i2) {
        this.o.c(i, i2);
    }

    /* access modifiers changed from: package-private */
    public void c(Bitmap bitmap, boolean z) {
        this.o.b(bitmap, z);
    }

    public int getCurrentTextColor() {
        return this.p.getCurrentTextColor();
    }

    public View getLabelView() {
        return this.p;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View, android.view.ViewGroup
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        StateListAnimatorTextView stateListAnimatorTextView = this.p;
        if (stateListAnimatorTextView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) stateListAnimatorTextView.getLayoutParams();
            int k = e2.k(marginLayoutParams);
            int i5 = marginLayoutParams.topMargin;
            if (this.r) {
                k = e2.j(marginLayoutParams);
            }
            StateListAnimatorTextView stateListAnimatorTextView2 = this.p;
            stateListAnimatorTextView2.layout(k, i5, stateListAnimatorTextView2.getMeasuredWidth() + k, this.p.getMeasuredHeight() + i5);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.q.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        y64.c(this.q);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
        int k = e2.k(marginLayoutParams);
        int i3 = marginLayoutParams.topMargin;
        int i4 = marginLayoutParams.bottomMargin;
        int width = this.q.width();
        e2.s(marginLayoutParams, width);
        this.p.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - k) - width, 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - i3) - i4, 1073741824));
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundCornerRadius(float f) {
        this.o.a(f);
    }

    /* access modifiers changed from: package-private */
    public void setInnerImageCornerRadius(float f) {
        this.o.d(f);
    }

    public void setLabelText(String str) {
        this.p.setText(str);
    }

    public void setRtl(boolean z) {
        this.r = z;
        this.o.e(z);
    }

    public FindCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q = new Rect(0, 0, 0, 0);
        LayoutInflater.from(context).inflate(C0707R.layout.browse_category_card, this);
        v64 v64 = new v64(context);
        this.o = v64;
        setBackground(v64);
        this.p = (StateListAnimatorTextView) findViewById(16908308);
        vc0.b(this);
    }
}
