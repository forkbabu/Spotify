package android.support.wearable.complications.rendering;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
public class h extends Drawable {
    final Paint a;
    private Drawable b;
    private int c;
    private final RectF d = new RectF();

    public h() {
        Paint paint = new Paint();
        this.a = paint;
        paint.setAntiAlias(true);
    }

    private void c() {
        if (this.b != null) {
            Rect bounds = getBounds();
            if (!bounds.isEmpty()) {
                Drawable drawable = this.b;
                int width = bounds.width();
                int height = bounds.height();
                Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth > intrinsicHeight) {
                    int i = (((int) (((float) width) * (((float) intrinsicWidth) / ((float) intrinsicHeight)))) - width) / 2;
                    drawable.setBounds(-i, 0, width + i, height);
                } else {
                    int i2 = (((int) (((float) height) * (((float) intrinsicHeight) / ((float) intrinsicWidth)))) - height) / 2;
                    drawable.setBounds(0, -i2, width, height + i2);
                }
                drawable.draw(canvas);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.a.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
            }
        }
    }

    public void a(Drawable drawable) {
        if (!g.a(this.b, drawable)) {
            this.b = drawable;
            c();
        }
    }

    public void b(int i) {
        this.c = i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (this.b != null && !bounds.isEmpty()) {
            canvas.save();
            canvas.translate((float) bounds.left, (float) bounds.top);
            RectF rectF = this.d;
            int i = this.c;
            canvas.drawRoundRect(rectF, (float) i, (float) i, this.a);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.d.right = (float) rect.width();
        this.d.bottom = (float) rect.height();
        c();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
