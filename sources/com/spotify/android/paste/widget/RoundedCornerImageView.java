package com.spotify.android.paste.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import androidx.core.content.a;
import com.spotify.encore.foundation.R;
import com.spotify.paste.widgets.internal.StateListAnimatorImageView;

@Deprecated
public class RoundedCornerImageView extends StateListAnimatorImageView {
    private final int a;
    private Paint b;
    private RectF c;
    Bitmap f;
    private final Xfermode n;
    private int o;
    private int p;
    private int q;

    public RoundedCornerImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f == null) {
            this.f = Bitmap.createBitmap(this.p, this.q, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(this.f);
            this.b.setXfermode(null);
            RectF rectF = this.c;
            float f2 = (float) this.o;
            canvas2.drawRoundRect(rectF, f2, f2, this.b);
        }
        this.b.setXfermode(this.n);
        canvas.drawBitmap(this.f, 0.0f, 0.0f, this.b);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.p = i;
        this.q = i2;
        this.c = new RectF(0.0f, 0.0f, (float) i, (float) i2);
    }

    public void setRoundedCorners(boolean z) {
        this.o = z ? this.a : 0;
    }

    public RoundedCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = nud.f(4.0f, getResources());
        this.n = new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(a.b(getContext(), R.color.black_60));
        setLayerType(2, null);
    }
}
