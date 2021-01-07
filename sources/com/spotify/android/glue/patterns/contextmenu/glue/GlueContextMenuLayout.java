package com.spotify.android.glue.patterns.contextmenu.glue;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.core.content.a;
import com.spotify.encore.foundation.R;
import java.util.ArrayList;
import java.util.List;

public class GlueContextMenuLayout extends LinearLayout {
    private StretchingGradientDrawable a;
    private ProgressBar b;
    private final List<View> c = new ArrayList();
    private n f;
    private final int n = nud.f(16.0f, getResources());
    private int o;
    private int p;

    public GlueContextMenuLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    private void b() {
        int b2 = a.b(getContext(), R.color.black);
        StretchingGradientDrawable stretchingGradientDrawable = new StretchingGradientDrawable(s2.h(b2, 0), b2);
        this.a = stretchingGradientDrawable;
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        setBackground(stretchingGradientDrawable);
        setClipToPadding(false);
    }

    private int getHeaderCount() {
        return this.f == null ? 0 : 1;
    }

    private int getVisibleItemsLimit() {
        return this.p;
    }

    public void a(View view) {
        this.c.add(view);
        addView(view);
    }

    public void c() {
        for (View view : this.c) {
            removeView(view);
        }
        this.c.clear();
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.View, android.view.ViewGroup
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int visibility = this.b.getVisibility();
        this.b.setVisibility(8);
        super.onLayout(z, i, i2, i3, i4);
        this.b.setVisibility(visibility);
        if (this.b.getVisibility() != 8) {
            int measuredHeight = ((View) getParent()).getMeasuredHeight();
            ProgressBar progressBar = this.b;
            int i5 = measuredHeight / 2;
            progressBar.layout(0, i5, progressBar.getMeasuredWidth(), this.b.getMeasuredHeight() + i5);
        }
        if (!this.c.isEmpty()) {
            this.a.setGradientHeight(this.f.a());
            return;
        }
        this.a.setGradientHeight(getMeasuredHeight() / 2);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int measuredHeight;
        int i4;
        int visibility = this.b.getVisibility();
        this.b.setVisibility(8);
        int i5 = this.n;
        int i6 = 0;
        setPadding(i5, 0, i5, i5);
        super.onMeasure(i, i2);
        if (!this.c.isEmpty()) {
            int max = Math.max(View.MeasureSpec.getSize(i2), ((View) getParent()).getMeasuredHeight());
            int measuredHeight2 = getMeasuredHeight();
            int size = this.c.size() + getHeaderCount();
            if (max <= measuredHeight2 || size > getVisibleItemsLimit()) {
                int min = Math.min(size, getVisibleItemsLimit());
                int i7 = 0;
                while (true) {
                    if (i6 > min) {
                        break;
                    }
                    measuredHeight = getChildAt(i6).getMeasuredHeight();
                    int i8 = i7 + measuredHeight;
                    int i9 = i6 + 1;
                    if (i9 <= min) {
                        i4 = (int) ((((float) getChildAt(i9).getMeasuredHeight()) * 0.465f) + ((float) i8));
                    } else {
                        i4 = i8;
                    }
                    if (i6 == min || i4 > max - this.o) {
                        break;
                    }
                    i7 = i8;
                    i6 = i9;
                }
                i7 = (int) ((((float) measuredHeight) * 0.465f) + ((float) i7));
                i3 = Math.max(max - i7, nud.g(16.0f, getResources()));
            } else {
                i3 = max - measuredHeight2;
            }
            int i10 = this.n;
            setPadding(i10, i3, i10, i10);
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        }
        this.b.measure(i, i2);
        this.b.setVisibility(visibility);
    }

    public void setHeader(n nVar) {
        n nVar2 = this.f;
        if (nVar2 != null) {
            removeView(nVar2.getView());
        }
        addView(nVar.getView(), 0);
        this.f = nVar;
    }

    public void setMinTopMarginPx(int i) {
        this.o = i;
    }

    public void setNumberOfVisibleItems(int i) {
        this.p = i;
    }

    public void setProgressBarVisibility(int i) {
        this.b.setVisibility(i);
    }

    public void setSpinner(View view) {
        this.b = (ProgressBar) view;
    }

    public GlueContextMenuLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }
}
