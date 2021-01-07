package com.spotify.music.features.browse.component.findcard.deprecated;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.internal.StateListAnimatorTextView;
import com.spotify.paste.widgets.layouts.PasteFrameLayout;

@Deprecated
public class FindCardView extends PasteFrameLayout {
    private final a o;
    private final StateListAnimatorTextView p;
    private final Rect q;
    private boolean r;

    public FindCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextView getLabel() {
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
        a.b(this.q);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
        int k = e2.k(marginLayoutParams);
        int i3 = marginLayoutParams.topMargin;
        int i4 = marginLayoutParams.bottomMargin;
        int width = this.q.width();
        e2.s(marginLayoutParams, width);
        this.p.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - k) - width, 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - i3) - i4, 1073741824));
    }

    public void setCornerRadius(float f) {
        this.o.c(f);
    }

    public void setLabel(String str) {
        this.p.setText(str);
        this.p.getViewTreeObserver().addOnPreDrawListener(new b(this));
    }

    public void setRtl(boolean z) {
        this.r = z;
        this.o.d(z);
    }

    public FindCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q = new Rect(0, 0, 0, 0);
        LayoutInflater.from(context).inflate(C0707R.layout.browse_category_card, this);
        a aVar = new a(context);
        this.o = aVar;
        setBackground(aVar);
        this.p = (StateListAnimatorTextView) findViewById(16908308);
    }
}
