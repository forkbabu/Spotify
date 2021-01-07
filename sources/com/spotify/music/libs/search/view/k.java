package com.spotify.music.libs.search.view;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Property;

public class k extends Drawable {
    public static final Property<k, Integer> h = new a(Integer.class, "level");
    private final gvd a;
    private final gvd b;
    private final gvd c;
    private gvd d = gvd.c(0.0f, 0.0f);
    private gvd e = gvd.c(0.0f, 0.0f);
    private final Paint f;
    private final RectF g;

    static class a extends Property<k, Integer> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public Integer get(k kVar) {
            return Integer.valueOf(kVar.getLevel());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(k kVar, Integer num) {
            kVar.setLevel(num.intValue());
        }
    }

    public k(int i, int i2, int i3, int i4) {
        Paint paint = new Paint();
        this.f = paint;
        this.g = new RectF();
        paint.setColor(i4);
        gvd c2 = gvd.c(0.0f, 255.0f);
        this.b = c2.g((float) i, 0.0f).b();
        this.a = c2.g((float) i2, 0.0f).b();
        this.c = c2.g((float) i3, 0.0f).b();
    }

    private void b() {
        float h2 = this.b.h((float) getLevel());
        float h3 = this.a.h((float) getLevel());
        float h4 = this.d.h((float) getLevel());
        float h5 = this.e.h((float) getLevel());
        this.g.set(getBounds());
        float f2 = h5 / 2.0f;
        float f3 = h4 / 2.0f;
        this.g.offset(f2 - f3, 0.0f);
        this.g.inset(h2 + f3 + f2, h3);
        invalidateSelf();
    }

    public void a(int i) {
        this.f.setColor(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float h2 = this.c.h((float) getLevel());
        canvas.drawRoundRect(this.g, h2, h2, this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        b();
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        b();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
