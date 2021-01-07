package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.squareup.picasso.Picasso;

/* access modifiers changed from: package-private */
public final class w extends BitmapDrawable {
    private static final Paint h = new Paint();
    private final boolean a;
    private final float b;
    private final Picasso.LoadedFrom c;
    Drawable d;
    long e;
    boolean f;
    int g = BitmapRenderer.ALPHA_VISIBLE;

    w(Context context, Bitmap bitmap, Drawable drawable, Picasso.LoadedFrom loadedFrom, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.a = z2;
        this.b = context.getResources().getDisplayMetrics().density;
        this.c = loadedFrom;
        if (loadedFrom != Picasso.LoadedFrom.MEMORY && !z) {
            this.d = drawable;
            this.f = true;
            this.e = SystemClock.uptimeMillis();
        }
    }

    private static Path a(int i, int i2, int i3) {
        Path path = new Path();
        float f2 = (float) i;
        float f3 = (float) i2;
        path.moveTo(f2, f3);
        path.lineTo((float) (i + i3), f3);
        path.lineTo(f2, (float) (i2 + i3));
        return path;
    }

    static void b(ImageView imageView, Context context, Bitmap bitmap, Picasso.LoadedFrom loadedFrom, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new w(context, bitmap, drawable, loadedFrom, z, z2));
    }

    static void c(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!this.f) {
            super.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.e)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f = false;
                this.d = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (((float) this.g) * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.g);
            }
        }
        if (this.a) {
            Paint paint = h;
            paint.setColor(-1);
            canvas.drawPath(a(0, 0, (int) (this.b * 16.0f)), paint);
            paint.setColor(this.c.debugColor);
            canvas.drawPath(a(0, 0, (int) (this.b * 15.0f)), paint);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.g = i;
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
