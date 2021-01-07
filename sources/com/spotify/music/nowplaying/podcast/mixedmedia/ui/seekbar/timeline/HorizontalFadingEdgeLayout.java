package com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.util.UtilsKt;
import kotlin.jvm.internal.h;

public class HorizontalFadingEdgeLayout extends FrameLayout {
    private static final int[] q = {0, -16777216};
    private static final int[] r = {-16777216, 0};
    private int a;
    private final PorterDuffXfermode b;
    private final Paint c;
    private final Paint f;
    private final Rect n;
    private final Rect o;
    private final RectF p;

    public HorizontalFadingEdgeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchDraw(Canvas canvas) {
        int i;
        h.e(canvas, "canvas");
        if (getVisibility() == 8 || getWidth() == 0 || getHeight() == 0) {
            super.dispatchDraw(canvas);
            return;
        }
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int min = Math.min(this.a, width);
        HorizontalFadingEdgeLayout$addGradients$1 horizontalFadingEdgeLayout$addGradients$1 = HorizontalFadingEdgeLayout$addGradients$1.a;
        Rect rect = this.n;
        rect.top = getPaddingTop();
        rect.bottom = getHeight() - getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        rect.left = paddingLeft;
        int i2 = paddingLeft + min;
        rect.right = i2;
        this.c.setShader(horizontalFadingEdgeLayout$addGradients$1.a((float) paddingLeft, (float) rect.top, (float) i2, q));
        Rect rect2 = this.o;
        rect2.top = getPaddingTop();
        rect2.bottom = getHeight() - getPaddingBottom();
        int paddingLeft2 = (getPaddingLeft() + width) - min;
        rect2.left = paddingLeft2;
        int i3 = min + paddingLeft2;
        rect2.right = i3;
        this.f.setShader(horizontalFadingEdgeLayout$addGradients$1.a((float) paddingLeft2, (float) rect2.top, (float) i3, r));
        if (Build.VERSION.SDK_INT > 21) {
            this.p.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            i = canvas.saveLayer(this.p, null);
        } else {
            i = canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), null, 31);
        }
        super.dispatchDraw(canvas);
        canvas.drawRect(this.n, this.c);
        canvas.drawRect(this.o, this.f);
        canvas.restoreToCount(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalFadingEdgeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        this.a = UtilsKt.c(this, 48.0f);
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        this.b = porterDuffXfermode;
        Paint paint = new Paint(1);
        paint.setXfermode(porterDuffXfermode);
        this.c = paint;
        Paint paint2 = new Paint(1);
        paint2.setXfermode(porterDuffXfermode);
        this.f = paint2;
        this.n = new Rect();
        this.o = new Rect();
        this.p = new RectF();
    }
}
