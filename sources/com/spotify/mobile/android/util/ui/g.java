package com.spotify.mobile.android.util.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.core.widget.c;
import com.google.common.base.MoreObjects;
import com.google.common.base.Supplier;
import com.spotify.music.C0707R;

public class g extends Drawable implements Drawable.Callback {
    private final SparseArray<Drawable> a = new SparseArray<>();
    private int b;
    private int c;
    private int f;
    private final boolean n;

    public g(Context context) {
        this.b = context.getResources().getDimensionPixelSize(C0707R.dimen.drawable_group_spacing);
        this.n = nud.m(context);
    }

    public static <T extends Drawable> T a(Context context, TextView textView, int i, int i2, Supplier<T> supplier) {
        g gVar;
        Drawable drawable = c.c(textView)[i];
        if (drawable instanceof g) {
            gVar = (g) drawable;
        } else {
            gVar = new g(context);
        }
        T t = (T) gVar.a.get(i2);
        if (t == null) {
            t = supplier.get();
            t.setBounds(0, 0, t.getIntrinsicWidth(), t.getIntrinsicHeight());
            gVar.b(i2);
            gVar.a.append(i2, t);
            t.setCallback(gVar);
            gVar.e();
        }
        d(textView, i, gVar);
        return t;
    }

    public static void c(TextView textView, int i, int i2) {
        Drawable drawable = c.c(textView)[i];
        g gVar = null;
        if (drawable instanceof g) {
            g gVar2 = (g) drawable;
            gVar2.b(i2);
            if (gVar2.a.size() != 0) {
                gVar = gVar2;
            }
        }
        d(textView, i, gVar);
    }

    private static void d(TextView textView, int i, Drawable drawable) {
        MoreObjects.checkArgument(i >= 0 && i <= 3, "Direction should be between 0 and 3.");
        Drawable[] c2 = c.c(textView);
        c2[i] = drawable;
        c.h(textView, c2[0], c2[1], c2[2], c2[3]);
    }

    private void e() {
        this.f = 0;
        this.c = 0;
        for (int i = 0; i < this.a.size(); i++) {
            Drawable valueAt = this.a.valueAt(i);
            this.f = Math.max(this.f, valueAt.getIntrinsicHeight());
            this.c = valueAt.getIntrinsicWidth() + this.c;
        }
        if (this.b > 0 && this.a.size() > 0) {
            this.c = ((this.a.size() - 1) * this.b) + this.c;
        }
        setBounds(0, 0, this.c, this.f);
        invalidateSelf();
    }

    public void b(int i) {
        Drawable drawable = this.a.get(i);
        if (drawable != null) {
            this.a.remove(i);
            drawable.setCallback(null);
            e();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = 0;
        if (this.n) {
            int size = this.a.size();
            while (true) {
                size--;
                if (size > -1) {
                    Drawable valueAt = this.a.valueAt(size);
                    canvas.save();
                    canvas.translate((float) i, (((float) this.f) / 2.0f) - (((float) valueAt.getIntrinsicHeight()) / 2.0f));
                    valueAt.draw(canvas);
                    i += valueAt.getIntrinsicWidth() + this.b;
                    canvas.restore();
                } else {
                    return;
                }
            }
        } else {
            int i2 = 0;
            while (i < this.a.size()) {
                Drawable valueAt2 = this.a.valueAt(i);
                canvas.save();
                canvas.translate((float) i2, (((float) this.f) / 2.0f) - (((float) valueAt2.getIntrinsicHeight()) / 2.0f));
                valueAt2.draw(canvas);
                i2 += valueAt2.getIntrinsicWidth() + this.b;
                canvas.restore();
                i++;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            this.a.valueAt(i2).setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        for (int i = 0; i < this.a.size(); i++) {
            this.a.valueAt(i).setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
