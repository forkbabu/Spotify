package android.support.wearable.complications.rendering;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.Gravity;

public class i {
    private static final Class<?>[] u = {ForegroundColorSpan.class, LocaleSpan.class, SubscriptSpan.class, SuperscriptSpan.class, StrikethroughSpan.class, StyleSpan.class, TypefaceSpan.class, UnderlineSpan.class};
    private final Rect a = new Rect();
    private TextPaint b;
    private String c;
    private CharSequence d;
    private CharSequence e;
    private float f;
    private float g;
    private float h;
    private float i;
    private StaticLayout j;
    private int k = 17;
    private int l = 1;
    private int m = 7;
    private TextUtils.TruncateAt n = TextUtils.TruncateAt.END;
    private Layout.Alignment o = Layout.Alignment.ALIGN_CENTER;
    private final Rect p = new Rect();
    private final Rect q = new Rect();
    private boolean r = false;
    private boolean s;
    private boolean t;

    public void a(Canvas canvas, Rect rect) {
        String str;
        if (!TextUtils.isEmpty(this.e)) {
            if (!(!this.s && this.a.width() == rect.width() && this.a.height() == rect.height())) {
                int width = rect.width();
                int height = rect.height();
                if (this.b == null) {
                    this.b = new TextPaint();
                    this.s = true;
                }
                int i2 = (int) (((1.0f - this.f) - this.g) * ((float) width));
                TextPaint textPaint = new TextPaint(this.b);
                textPaint.setTextSize(Math.min((float) (height / this.l), textPaint.getTextSize()));
                CharSequence charSequence = this.e;
                float f2 = (float) i2;
                if (textPaint.measureText(charSequence, 0, charSequence.length()) > f2) {
                    int i3 = this.m;
                    TextUtils.TruncateAt truncateAt = this.n;
                    if (!(truncateAt == null || truncateAt == TextUtils.TruncateAt.MARQUEE)) {
                        i3++;
                    }
                    CharSequence subSequence = this.e.subSequence(0, Math.min(i3, this.e.length()));
                    for (float measureText = textPaint.measureText(subSequence, 0, subSequence.length()); measureText > f2; measureText = textPaint.measureText(subSequence, 0, subSequence.length())) {
                        textPaint.setTextSize(textPaint.getTextSize() - 1.0f);
                    }
                }
                CharSequence charSequence2 = this.e;
                String str2 = charSequence2;
                if (this.r) {
                    if (charSequence2 == null) {
                        str = null;
                    } else {
                        StringBuilder sb = new StringBuilder(charSequence2.length());
                        int length = charSequence2.length();
                        int i4 = 0;
                        boolean z = false;
                        while (i4 < length) {
                            int codePointAt = Character.codePointAt(charSequence2, i4);
                            if (!g.a(codePointAt)) {
                                sb.appendCodePoint(codePointAt);
                            } else if (!z) {
                                sb.appendCodePoint(32);
                            }
                            z = g.a(codePointAt);
                            i4 += Character.charCount(codePointAt);
                        }
                        str = sb.toString();
                    }
                    this.c = str;
                    str2 = str;
                }
                StaticLayout.Builder obtain = StaticLayout.Builder.obtain(str2, 0, str2.length(), textPaint, i2);
                obtain.setBreakStrategy(1);
                obtain.setEllipsize(this.n);
                obtain.setHyphenationFrequency(2);
                obtain.setMaxLines(this.l);
                obtain.setAlignment(this.o);
                this.j = obtain.build();
                this.s = false;
                this.t = true;
            }
            if (this.t || !this.a.equals(rect)) {
                this.a.set(rect);
                int i5 = !b();
                int width2 = (int) (((float) this.a.width()) * (b() ? this.f : this.g));
                float width3 = (float) this.a.width();
                float f3 = b() ? this.g : this.f;
                Rect rect2 = this.p;
                Rect rect3 = this.a;
                rect2.set(rect3.left + width2, rect3.top + ((int) (((float) this.a.height()) * this.h)), rect3.right - ((int) (width3 * f3)), rect3.bottom - ((int) (((float) this.a.height()) * this.i)));
                Gravity.apply(this.k, this.j.getWidth(), this.j.getHeight(), this.p, this.q, i5);
                this.t = false;
            }
            canvas.save();
            Rect rect4 = this.q;
            canvas.translate((float) rect4.left, (float) rect4.top);
            this.j.draw(canvas);
            canvas.restore();
        }
    }

    public boolean b() {
        return this.j.getParagraphDirection(0) == 1;
    }

    public void c(Layout.Alignment alignment) {
        if (this.o != alignment) {
            this.o = alignment;
            this.s = true;
        }
    }

    public void d(int i2) {
        if (this.k != i2) {
            this.k = i2;
            this.t = true;
        }
    }

    public void e(boolean z) {
        if (this.r != z) {
            this.r = z;
            if (!TextUtils.equals(this.c, this.e)) {
                this.s = true;
            }
        }
    }

    public void f(int i2) {
        if (this.l != i2 && i2 > 0) {
            this.l = i2;
            this.s = true;
        }
    }

    public void g(TextPaint textPaint) {
        this.b = textPaint;
        this.s = true;
    }

    public void h(float f2, float f3, float f4, float f5) {
        if (this.f != f2 || this.h != f3 || this.g != f4 || this.i != f5) {
            this.f = f2;
            this.h = f3;
            this.g = f4;
            this.i = f5;
            this.s = true;
        }
    }

    public void i(CharSequence charSequence) {
        boolean z;
        if (!g.a(this.d, charSequence)) {
            this.d = charSequence;
            if (charSequence instanceof Spanned) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                Object[] spans = spannableStringBuilder.getSpans(0, charSequence.length(), Object.class);
                for (Object obj : spans) {
                    Class<?>[] clsArr = u;
                    int length = clsArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z = false;
                            break;
                        } else if (clsArr[i2].isInstance(obj)) {
                            z = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (!z) {
                        spannableStringBuilder.removeSpan(obj);
                    }
                }
                charSequence = spannableStringBuilder;
            }
            this.e = charSequence;
            this.s = true;
        }
    }
}
