package com.spotify.encore.mobile.utils;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.text.style.TextAppearanceSpan;
import com.spotify.mobile.android.util.Assertion;

public class TextAppearanceSpanCompat extends MetricAffectingSpan {
    private static final int[] R_styleable_TextAppearance = {16843692};
    private static final int R_styleable_TextAppearance_fontFamily = 0;
    private final TextAppearanceSpan mTextAppearanceSpan;
    private sud mTypefaceSpan;

    public TextAppearanceSpanCompat(Context context, int i) {
        Typeface typeface;
        this.mTextAppearanceSpan = new TextAppearanceSpan(context, i);
        if (Build.VERSION.SDK_INT < 26 && (typeface = getTypeface(context, i)) != null) {
            this.mTypefaceSpan = new sud(typeface);
        }
    }

    private static Typeface getTypeface(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, R_styleable_TextAppearance);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        if (resourceId > 0) {
            try {
                return i2.e(context, resourceId);
            } catch (Resources.NotFoundException unused) {
                Assertion.g("TextAppearanceSpanCompat:: Font cannot be loaded.");
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        return null;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        this.mTextAppearanceSpan.updateDrawState(textPaint);
        sud sud = this.mTypefaceSpan;
        if (sud != null) {
            sud.updateDrawState(textPaint);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        this.mTextAppearanceSpan.updateMeasureState(textPaint);
        sud sud = this.mTypefaceSpan;
        if (sud != null) {
            sud.updateMeasureState(textPaint);
        }
    }
}
