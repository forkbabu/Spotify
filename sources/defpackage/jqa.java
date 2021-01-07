package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.adjust.sdk.Constants;
import com.google.common.base.MoreObjects;
import com.google.common.base.Supplier;
import com.spotify.encore.foundation.R;
import com.spotify.music.libs.podcast.download.f0;

/* renamed from: jqa  reason: default package */
public class jqa {
    private final Context a;
    private final Supplier<Drawable> b;

    /* access modifiers changed from: private */
    /* renamed from: jqa$a */
    public static class a extends Drawable {
        private static final float c = ((float) (1.0d / Math.sqrt(2.0d)));
        private final Drawable a;
        private final Drawable b;

        public a(Drawable drawable, Drawable drawable2) {
            this.a = drawable;
            this.b = drawable2;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            Rect bounds = getBounds();
            int width = bounds.width();
            int height = bounds.height();
            int intrinsicWidth = this.a.getIntrinsicWidth();
            int intrinsicHeight = this.a.getIntrinsicHeight();
            canvas.save();
            if (intrinsicWidth > 0 || intrinsicHeight > 0) {
                float f = 1.0f;
                float f2 = intrinsicWidth > 0 ? ((float) width) / ((float) intrinsicWidth) : 1.0f;
                if (intrinsicHeight > 0) {
                    f = ((float) height) / ((float) intrinsicHeight);
                }
                float max = Math.max(f2, f);
                float min = Math.min(((float) width) / f2, ((float) height) / f);
                canvas.scale(max, max);
                canvas.translate((-(((float) intrinsicWidth) - min)) / 2.0f, (-(((float) intrinsicHeight) - min)) / 2.0f);
                Drawable drawable = this.a;
                int i = bounds.left;
                int i2 = bounds.top;
                drawable.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            } else {
                this.a.setBounds(bounds);
            }
            this.a.draw(canvas);
            canvas.restore();
            int intrinsicWidth2 = this.b.getIntrinsicWidth();
            int intrinsicHeight2 = this.b.getIntrinsicHeight();
            float exactCenterX = bounds.exactCenterX();
            float f3 = c;
            int round = Math.round((((((float) width) / 2.0f) * f3) + exactCenterX) - (((float) intrinsicWidth2) / 2.0f));
            int round2 = Math.round((((((float) height) / 2.0f) * f3) + bounds.exactCenterY()) - (((float) intrinsicHeight2) / 2.0f));
            this.b.setBounds(round, round2, intrinsicWidth2 + round, intrinsicHeight2 + round2);
            this.b.draw(canvas);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return this.a.getOpacity();
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            this.a.setAlpha(i);
            this.b.setAlpha(i);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.a.setColorFilter(colorFilter);
            this.b.setColorFilter(colorFilter);
        }
    }

    /* renamed from: jqa$b */
    public static class b extends Drawable {
        private final String a;
        private final int b;
        private final int c;
        private final Paint d;
        private final Rect e = new Rect();

        public b(Context context, String str, int i) {
            Paint paint = new Paint();
            this.d = paint;
            boolean z = true;
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(i2.e(context, R.font.encore_font_circular_bold));
            this.a = f0.a(str);
            this.b = i;
            int i2 = iqa.b;
            this.c = ((Color.blue(i) * 114) + ((Color.green(i) * 587) + (Color.red(i) * 299))) / Constants.ONE_SECOND < 128 ? false : z ? -16777216 : -1;
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            Rect bounds = getBounds();
            int width = bounds.width();
            int height = bounds.height();
            float min = (float) Math.min(width, height);
            this.d.setColor(this.b);
            float f = ((float) width) / 2.0f;
            float f2 = ((float) height) / 2.0f;
            canvas.drawCircle(f, f2, min / 2.0f, this.d);
            this.d.setColor(-1);
            this.d.setColor(this.c);
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
        public void setBounds(int i, int i2, int i3, int i4) {
            if (i3 != -1 && i4 != -1) {
                super.setBounds(i, i2, i3, i4);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.d.setColorFilter(colorFilter);
        }
    }

    public jqa(Context context) {
        this.a = context;
        this.b = MoreObjects.memoize(new hqa(context));
    }

    public Drawable a(String str, boolean z, int i) {
        if (z) {
            return new a(new b(this.a, str, i), this.b.get());
        }
        return new b(this.a, str, i);
    }

    public /* synthetic */ Drawable b(Bitmap bitmap) {
        return new a(com.spotify.paste.graphics.drawable.b.a().createDrawable(bitmap), this.b.get());
    }
}
