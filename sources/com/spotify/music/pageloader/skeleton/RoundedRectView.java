package com.spotify.music.pageloader.skeleton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

public class RoundedRectView extends View {
    private final Paint a;
    private float b;
    private final RectF c = new RectF();

    public RoundedRectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.a = paint;
        paint.setAntiAlias(true);
        paint.setColor(-65536);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gbc.a);
        for (int i = 0; i < obtainStyledAttributes.getIndexCount(); i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                setColor(obtainStyledAttributes.getColor(index, this.a.getColor()));
            } else if (index == 1) {
                setCornerRadius((float) obtainStyledAttributes.getDimensionPixelSize(index, 0));
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() + 0;
        int height = getHeight() + 0;
        if (Build.VERSION.SDK_INT >= 21) {
            float f = this.b;
            canvas.drawRoundRect(0.0f, 0.0f, (float) width, (float) height, f, f, this.a);
            return;
        }
        this.c.set(0.0f, 0.0f, (float) width, (float) height);
        RectF rectF = this.c;
        float f2 = this.b;
        canvas.drawRoundRect(rectF, f2, f2, this.a);
    }

    public void setColor(int i) {
        this.a.setColor(i);
    }

    public void setCornerRadius(float f) {
        this.b = f;
    }
}
