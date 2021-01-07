package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.spotify.music.homecomponents.promotionv2.g;

/* renamed from: jq9  reason: default package */
public class jq9 extends Drawable {
    private final qq9 a;
    private final rq9 b;
    private final Paint c = new Paint(1);
    private final Matrix d;
    private final int e;
    private final g f;

    public jq9(Context context, int i) {
        qq9 qq9 = new qq9();
        rq9 rq9 = new rq9(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Matrix matrix = new Matrix();
        this.e = dimensionPixelSize;
        this.a = qq9;
        this.b = rq9;
        this.d = matrix;
        this.f = new g(this);
    }

    public void a(Bitmap bitmap, boolean z) {
        this.a.c(bitmap, getBounds());
        this.b.b(getBounds());
        this.f.c(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ValueAnimator a2;
        g gVar = this.f;
        float f2 = 0.0f;
        if (!(gVar == null || (a2 = gVar.a()) == null)) {
            f2 = a2.getAnimatedFraction();
        }
        if (this.a.b()) {
            this.a.a(canvas, this.c, f2, (float) this.e);
        }
        this.b.a(canvas, this.c, f2, (float) this.e);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Rect bounds = getBounds();
        this.a.d(bounds);
        this.b.b(bounds);
        RectF rectF = new RectF(bounds);
        this.d.reset();
        this.d.setScale(rectF.width(), rectF.height());
        this.b.c(this.d);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
