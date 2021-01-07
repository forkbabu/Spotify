package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;

/* renamed from: ndb  reason: default package */
public final class ndb implements LineHeightSpan.WithDensity {
    private final int a;

    public ndb(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        chooseHeight(charSequence, i, i2, i3, i4, fontMetricsInt, null);
    }

    @Override // android.text.style.LineHeightSpan.WithDensity
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt, TextPaint textPaint) {
        if (fontMetricsInt != null) {
            int i5 = fontMetricsInt.descent;
            int i6 = fontMetricsInt.ascent;
            int i7 = i5 - i6;
            int i8 = this.a;
            if (i7 < i8) {
                int i9 = i6 - (i8 - i7);
                fontMetricsInt.ascent = i9;
                fontMetricsInt.top = i9;
            } else if (i7 > i8) {
                int i10 = i5 - (i7 - i8);
                fontMetricsInt.descent = i10;
                fontMetricsInt.bottom = i10;
            }
        }
    }
}
