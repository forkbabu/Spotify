package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.spotify.encore.foundation.R;

/* renamed from: tq4  reason: default package */
public class tq4 {
    private final Context a;

    /* renamed from: tq4$b */
    private static class b extends Drawable {
        private final String a;
        private final int b;
        private final int c;
        private final Paint d;
        private final Rect e = new Rect();

        b(Context context, String str, int i, int i2, a aVar) {
            Paint paint = new Paint();
            this.d = paint;
            this.a = str;
            this.b = i;
            this.c = i2;
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(i2.e(context, R.font.encore_font_circular_bold));
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            Rect bounds = getBounds();
            int width = bounds.width();
            int height = bounds.height();
            float min = (float) Math.min(width, height);
            this.d.setColor(this.c);
            float f = ((float) width) / 2.0f;
            float f2 = ((float) height) / 2.0f;
            canvas.drawCircle(f, f2, min / 2.0f, this.d);
            this.d.setColor(this.b);
            this.d.setTextSize(min / 3.0f);
            Paint paint = this.d;
            String str = this.a;
            paint.getTextBounds(str, 0, str.length(), this.e);
            canvas.drawText(this.a, f, f2 - this.e.exactCenterY(), this.d);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            this.d.setAlpha(i);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.d.setColorFilter(colorFilter);
        }
    }

    public tq4(Context context) {
        this.a = context;
    }

    public Drawable a(String str, int i) {
        return new b(this.a, str, -1, i, null);
    }
}
