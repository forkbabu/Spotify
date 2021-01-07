package com.spotify.music.sociallistening.facepile;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.spotify.encore.foundation.R;
import kotlin.jvm.internal.h;

public final class b implements a {

    public static final class a extends Drawable {
        private final Paint a;
        private final Rect b = new Rect();
        private final String c;
        private final int d;
        private final int e;

        public a(Context context, String str, int i, int i2) {
            h.e(context, "context");
            h.e(str, "text");
            this.c = str;
            this.d = i;
            this.e = i2;
            Paint paint = new Paint();
            this.a = paint;
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(i2.e(context, R.font.encore_font_circular_bold));
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            h.e(canvas, "canvas");
            Rect bounds = getBounds();
            h.d(bounds, "bounds");
            int width = bounds.width();
            int height = bounds.height();
            float min = (float) Math.min(width, height);
            this.a.setColor(this.e);
            float f = ((float) width) / 2.0f;
            float f2 = ((float) height) / 2.0f;
            canvas.drawCircle(f, f2, min / 2.0f, this.a);
            this.a.setColor(this.d);
            this.a.setTextSize(min / 3.0f);
            Paint paint = this.a;
            String str = this.c;
            paint.getTextBounds(str, 0, str.length(), this.b);
            canvas.drawText(this.c, f, f2 - this.b.exactCenterY(), this.a);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
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

    @Override // com.spotify.music.sociallistening.facepile.a
    public Drawable a(Context context, String str, int i) {
        h.e(context, "context");
        h.e(str, "text");
        return new a(context, str, -1, i);
    }
}
