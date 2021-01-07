package com.spotify.android.glue.gradients;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

public final class GradientDrawable extends Drawable {
    private final Paint a;
    private final b b;
    private b c;

    public enum Type {
        LINEAR {
            /* access modifiers changed from: package-private */
            @Override // com.spotify.android.glue.gradients.GradientDrawable.Type
            public b d(int i, int i2, float f) {
                return new c(i, i2, f);
            }
        },
        BURST_TRIANGLES {
            /* access modifiers changed from: package-private */
            @Override // com.spotify.android.glue.gradients.GradientDrawable.Type
            public b d(int i, int i2, float f) {
                return new e(i, i2);
            }
        },
        BURST_CIRCLES {
            /* access modifiers changed from: package-private */
            @Override // com.spotify.android.glue.gradients.GradientDrawable.Type
            public b d(int i, int i2, float f) {
                return new a(i, i2);
            }
        },
        BURST_RECTS {
            /* access modifiers changed from: package-private */
            @Override // com.spotify.android.glue.gradients.GradientDrawable.Type
            public b d(int i, int i2, float f) {
                return new d(i, i2);
            }
        };

        static {
            values();
        }

        Type(a aVar) {
        }

        /* access modifiers changed from: package-private */
        public abstract b d(int i, int i2, float f);
    }

    /* access modifiers changed from: package-private */
    public static class b extends Drawable.ConstantState {
        Type a;
        int b;
        int c;
        boolean d;
        float e;
        int f;

        b(Type type, int i, int i2, boolean z, float f2) {
            this.a = type;
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = f2;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new GradientDrawable(this.a, this.b, this.c, this.d, this.e);
        }
    }

    public static GradientDrawable a(Type type, int i, int i2) {
        return new GradientDrawable(type, i, i2, true, 0.0f);
    }

    public static GradientDrawable b(Type type, int i, int i2) {
        return new GradientDrawable(type, i, i2, false, 0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.c.a(canvas, bounds);
        if (this.b.d) {
            canvas.save();
            canvas.scale((float) bounds.width(), (float) (bounds.height() + 1));
            canvas.drawRect(0.0f, 0.0f, 1.0f, 1.0f, this.a);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        this.b.f = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        return getConstantState().newDrawable();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    private GradientDrawable(Type type, int i, int i2, boolean z, float f) {
        Paint paint = new Paint();
        this.a = paint;
        b bVar = new b(type, i, i2, z, f);
        this.b = bVar;
        bVar.b = i;
        bVar.c = i2;
        bVar.e = f;
        this.c = bVar.a.d(i, i2, f);
        invalidateSelf();
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, -15592942, Shader.TileMode.REPEAT));
    }
}
