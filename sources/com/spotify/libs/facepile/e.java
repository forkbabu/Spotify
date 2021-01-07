package com.spotify.libs.facepile;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.spotify.encore.foundation.R;

public class e extends Drawable {
    private final a a;
    private final Paint b;
    private final Paint c;
    private final Rect d = new Rect();

    /* access modifiers changed from: package-private */
    public static class a extends Drawable.ConstantState {
        Context a;
        String b;
        int c;
        int d;

        a(Context context, String str, int i) {
            this.a = context;
            this.b = str;
            this.c = i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.d;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new e(this.a, this.b, this.c);
        }
    }

    public e(Context context, String str, int i) {
        Paint paint = new Paint();
        this.c = paint;
        a aVar = new a(context, str, i);
        this.a = aVar;
        str.getClass();
        aVar.b = str;
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setColor(-1);
        paint2.setTypeface(i2.e(context, R.font.encore_font_circular_bold));
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint.setColor(i);
        paint.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.drawCircle(((float) bounds.width()) / 2.0f, ((float) bounds.height()) / 2.0f, ((float) bounds.height()) / 2.0f, this.c);
        this.b.setTextSize(((float) bounds.height()) * 0.55f);
        Paint paint = this.b;
        String str = this.a.b;
        paint.getTextBounds(str, 0, str.length(), this.d);
        canvas.drawText(this.a.b, (float) bounds.centerX(), ((float) bounds.bottom) - (((float) (bounds.height() - this.d.height())) / 2.0f), this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        this.a.d = getChangingConfigurations();
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        return getConstantState().newDrawable();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.b.setAlpha(i);
        this.c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        this.c.setColorFilter(colorFilter);
    }
}
