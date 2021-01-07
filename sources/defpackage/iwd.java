package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.squareup.picasso.Picasso;

/* renamed from: iwd  reason: default package */
final class iwd extends Drawable {
    private static final Paint i = new Paint();
    public static final /* synthetic */ int j = 0;
    private Drawable a;
    private final Drawable b;
    private long c;
    private boolean d;
    private int e = BitmapRenderer.ALPHA_VISIBLE;
    private final boolean f;
    private final float g;
    private final Picasso.LoadedFrom h;

    iwd(Context context, Drawable drawable, Drawable drawable2, Picasso.LoadedFrom loadedFrom, boolean z) {
        this.b = drawable;
        this.f = z;
        this.g = context.getResources().getDisplayMetrics().density;
        this.h = loadedFrom;
        if (loadedFrom != Picasso.LoadedFrom.MEMORY) {
            this.a = drawable2;
            this.d = true;
            this.c = SystemClock.uptimeMillis();
        }
    }

    private static Path a(Point point, int i2) {
        Point point2 = new Point(point.x + i2, point.y);
        Point point3 = new Point(point.x, point.y + i2);
        Path path = new Path();
        path.moveTo((float) point.x, (float) point.y);
        path.lineTo((float) point2.x, (float) point2.y);
        path.lineTo((float) point3.x, (float) point3.y);
        return path;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i2;
        if (!this.d) {
            this.b.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.c)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.d = false;
                this.a = null;
                this.b.draw(canvas);
            } else {
                Drawable drawable = this.a;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                this.b.setAlpha((int) (((float) this.e) * uptimeMillis));
                this.b.draw(canvas);
                this.b.setAlpha(this.e);
                invalidateSelf();
            }
        }
        if (this.f) {
            Paint paint = i;
            paint.setColor(-1);
            canvas.drawPath(a(new Point(0, 0), (int) (this.g * 16.0f)), paint);
            int ordinal = this.h.ordinal();
            if (ordinal == 0) {
                i2 = -16711936;
            } else if (ordinal == 1) {
                i2 = -256;
            } else if (ordinal == 2) {
                i2 = -65536;
            } else {
                throw new IllegalStateException("Unknown LoadedFrom type.");
            }
            paint.setColor(i2);
            canvas.drawPath(a(new Point(0, 0), (int) (this.g * 15.0f)), paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.b.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.b.isStateful();
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.b.setBounds(rect);
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        return this.b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.e = i2;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i2);
        }
        this.b.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        this.b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.b.setState(iArr);
    }
}
