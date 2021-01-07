package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;

/* renamed from: jc0  reason: default package */
public final class jc0 extends Drawable implements com.spotify.android.glue.patterns.header.headers.v2.a {
    private Drawable a;
    private Drawable b;
    private boolean c;

    /* renamed from: jc0$a */
    static class a extends Property<jc0, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public Float get(jc0 jc0) {
            return Float.valueOf(((float) jc0.getLevel()) / 255.0f);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(jc0 jc0, Float f) {
            jc0.e(f.floatValue());
        }
    }

    static {
        new a(Float.class, "fraction");
    }

    private void b(Canvas canvas, Drawable drawable) {
        float f;
        Rect bounds = getBounds();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int save = canvas.save();
        if (intrinsicWidth < 0 || intrinsicHeight < 0) {
            drawable.setBounds(bounds);
            drawable.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        float f2 = (float) intrinsicWidth;
        float f3 = (float) intrinsicHeight;
        if (f2 / f3 < ((float) bounds.width()) / ((float) bounds.height())) {
            f = ((float) bounds.width()) / f2;
        } else {
            f = ((float) bounds.height()) / f3;
        }
        float f4 = 0.0f;
        canvas.translate((float) bounds.centerX(), this.c ? 0.0f : (float) bounds.centerY());
        canvas.scale(f, f);
        float f5 = ((float) (-intrinsicWidth)) / 2.0f;
        if (!this.c) {
            f4 = ((float) (-intrinsicHeight)) / 2.0f;
        }
        canvas.translate(f5, f4);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // com.spotify.android.glue.patterns.header.headers.v2.a
    public void a(int i, float f) {
        e(f);
    }

    public void c(Drawable drawable, Drawable drawable2) {
        this.a = drawable;
        this.b = drawable2;
        drawable.setAlpha(BitmapRenderer.ALPHA_VISIBLE);
        Drawable drawable3 = this.a;
        drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), this.a.getIntrinsicHeight());
        Drawable drawable4 = this.b;
        if (drawable4 != null) {
            drawable4.setBounds(0, 0, drawable4.getIntrinsicWidth(), this.b.getIntrinsicHeight());
        }
        setLevel(0);
        invalidateSelf();
    }

    public void d(boolean z) {
        this.c = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int save = canvas.save();
        int level = getLevel();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(255 - level);
            b(canvas, this.a);
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.setAlpha(level);
            b(canvas, this.b);
        }
        canvas.restoreToCount(save);
    }

    public void e(float f) {
        if (f >= 0.0f && f <= 1.0f) {
            setLevel((int) (f * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.a;
        int i = -2;
        int opacity = drawable != null ? drawable.getOpacity() : -2;
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            i = drawable2.getOpacity();
        }
        return Drawable.resolveOpacity(opacity, i);
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }
}
