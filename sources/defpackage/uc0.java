package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.widget.TextView;
import com.spotify.android.paste.app.c;

/* renamed from: uc0  reason: default package */
public class uc0 extends ReplacementSpan {
    private final int a;
    private final Paint b;
    private final Drawable c;
    private final Rect f = new Rect();

    public uc0(Context context, int i, int i2) {
        this.a = i2;
        TextView textView = (TextView) c.b(context, TextView.class, null, i);
        TextPaint paint = textView.getPaint();
        this.b = paint;
        paint.setColor(textView.getTextColors().getDefaultColor());
        this.c = textView.getBackground();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, Paint paint) {
        canvas.save();
        paint.getTextBounds("X", 0, 1, this.f);
        float measureText = this.b.measureText(charSequence, i, i2) + ((float) (this.a * 2));
        canvas.translate(0.0f, -this.b.descent());
        canvas.translate(0.0f, (((float) ((int) (this.b.descent() - this.b.ascent()))) - ((float) this.f.height())) / 2.0f);
        float f3 = (float) i4;
        RectF rectF = new RectF(f2, this.b.ascent() + f3, measureText + f2, this.b.descent() + f3);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setBounds(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
            this.c.draw(canvas);
        }
        canvas.translate((float) this.a, 0.0f);
        canvas.drawText(charSequence, i, i2, f2, f3, this.b);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            fontMetricsInt.ascent = (int) fontMetrics.ascent;
            fontMetricsInt.bottom = (int) fontMetrics.bottom;
            fontMetricsInt.descent = (int) fontMetrics.descent;
            fontMetricsInt.leading = (int) fontMetrics.leading;
            fontMetricsInt.top = (int) fontMetrics.top;
        }
        return (int) (this.b.measureText(charSequence, i, i2) + ((float) (this.a * 2)));
    }
}
