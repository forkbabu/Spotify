package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import androidx.core.content.a;
import com.spotify.music.C0707R;

/* renamed from: ipc  reason: default package */
public class ipc extends Drawable {
    private final tpc a;
    private final rpc b;
    private final Paint c = new Paint(1);
    private final Paint d = new Paint(1);
    private Shader e;
    private final Matrix f;
    private final int g;
    private ValueAnimator h;
    private RectF i;
    private final int j;
    private final int k;

    public ipc(Context context, TextPaint textPaint, int i2) {
        upc upc = new upc(textPaint, context.getResources().getDimensionPixelSize(C0707R.dimen.episode_card_corner_radius), i2);
        spc spc = new spc();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0707R.dimen.episode_card_corner_radius);
        Matrix matrix = new Matrix();
        this.j = a.b(context, C0707R.color.episode_card_gradient_start);
        this.k = a.b(context, C0707R.color.episode_card_gradient_end);
        this.g = dimensionPixelSize;
        this.a = upc;
        upc.c(100);
        this.b = spc;
        this.f = matrix;
        d();
    }

    private void d() {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{this.j, this.k}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.e = linearGradient;
        this.d.setShader(linearGradient);
        this.e.setLocalMatrix(this.f);
    }

    private void g(boolean z) {
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.h = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.setDuration(400L);
        this.h.setInterpolator(ta0.b);
        this.h.addUpdateListener(new bpc(this));
        if (z) {
            this.h.start();
        } else {
            this.h.end();
        }
        invalidateSelf();
    }

    public void a() {
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.h = null;
        }
        ((upc) this.a).b();
        ((spc) this.b).c();
        d();
        invalidateSelf();
    }

    public void b(int i2, int i3, boolean z) {
        ((upc) this.a).f(i2, i3);
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{s2.h(i2, 0), i2}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.e = linearGradient;
        this.d.setShader(linearGradient);
        this.e.setLocalMatrix(this.f);
        g(z);
    }

    public void c(int i2, int i3, boolean z) {
        ((upc) this.a).f(i2, i3);
        d();
        g(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ValueAnimator valueAnimator = this.h;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        if (animatedFraction < 1.0f || !((spc) this.b).b()) {
            ((upc) this.a).a(canvas, this.c, this.i, animatedFraction, (float) this.g);
        }
        if (((spc) this.b).b()) {
            ((spc) this.b).a(canvas, this.c, this.i, animatedFraction, (float) this.g);
        }
        this.d.setAlpha((int) (animatedFraction * 255.0f));
        RectF rectF = this.i;
        int i2 = this.g;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, this.d);
    }

    public void e(Bitmap bitmap, boolean z) {
        ((spc) this.b).d(bitmap, getBounds());
        g(z);
    }

    public void f(String str) {
        if (((upc) this.a).d(str)) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i2, int i3, int i4, int i5) {
        super.setBounds(i2, i3, i4, i5);
        Rect bounds = getBounds();
        this.i = new RectF(bounds);
        ((upc) this.a).e(bounds);
        ((spc) this.b).e(bounds);
        RectF rectF = this.i;
        this.f.reset();
        this.f.setScale(rectF.width(), rectF.height());
        this.e.setLocalMatrix(this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
