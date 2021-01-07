package com.spotify.mobile.android.hubframework.defaults.components.glue;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class HubsCarouselView extends RecyclerView {
    private final e O0;

    public HubsCarouselView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        RecyclerView.e adapter = getAdapter();
        if (size > 0 && adapter != null && adapter.u() > 0) {
            i2 = this.O0.a(size, adapter.w(0));
        }
        super.onMeasure(i, i2);
    }

    public HubsCarouselView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.O0 = new e(getResources());
    }
}
