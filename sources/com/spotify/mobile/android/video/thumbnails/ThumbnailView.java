package com.spotify.mobile.android.video.thumbnails;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class ThumbnailView extends View {
    private Rect a;

    public ThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getBitmapHeight() {
        return 0;
    }

    public int getBitmapWidth() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a = new Rect(0, 0, i, i2);
    }

    public ThumbnailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
