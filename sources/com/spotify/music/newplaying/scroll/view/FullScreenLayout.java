package com.spotify.music.newplaying.scroll.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class FullScreenLayout extends FrameLayout {
    public FullScreenLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static int a(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 0) {
            return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int height = getRootView().getHeight();
        super.onMeasure(a(i, Math.max(getRootView().getWidth(), View.MeasureSpec.getSize(i))), a(i2, Math.max(height, View.MeasureSpec.getSize(i2))));
    }

    public FullScreenLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
