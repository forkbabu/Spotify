package com.spotify.encore.consumer.elements.badge.util;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import androidx.core.content.a;
import com.spotify.encore.consumer.elements.R;
import com.spotify.mobile.android.util.Assertion;

public class TextBadgeDrawable extends Drawable {
    private static final int[] R_styleable_TextAppearance = {16842901, 16842904, 16843692};
    private static final int R_styleable_TextAppearance_fontFamily = 2;
    private static final int R_styleable_TextAppearance_textColor = 1;
    private static final int R_styleable_TextAppearance_textSize = 0;
    private final ColorStateList mColorStateList;
    private final int mDefaultColor;
    private final int mIntrinsicHeight;
    private final int mIntrinsicWidth;
    private final RectF mLabelBoundsF = new RectF();
    private final BoringLayout mLayout;
    private final int mRadius;
    private final Paint mRectPaint;
    private final String mText;

    public TextBadgeDrawable(Context context, int i, String str) {
        Paint paint = new Paint(1);
        this.mRectPaint = paint;
        this.mColorStateList = a.c(context, R.color.encore_accessory);
        int b = a.b(context, com.spotify.encore.foundation.R.color.gray_70);
        this.mDefaultColor = b;
        paint.setColor(b);
        this.mRadius = context.getResources().getDimensionPixelSize(R.dimen.encore_badge_radius);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.encore_badge_padding);
        this.mText = str;
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        applyStyle(context, textPaint, i);
        BoringLayout.Metrics isBoring = BoringLayout.isBoring(str, textPaint);
        int descent = (int) (textPaint.descent() - textPaint.ascent());
        this.mIntrinsicHeight = descent;
        int max = Math.max(descent, (dimensionPixelSize * 2) + isBoring.width);
        this.mIntrinsicWidth = max;
        this.mLayout = BoringLayout.make(str, textPaint, max, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, isBoring, false);
    }

    private static void applyStyle(Context context, TextPaint textPaint, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, R_styleable_TextAppearance);
        int resourceId = obtainStyledAttributes.getResourceId(2, -1);
        if (resourceId > 0) {
            try {
                textPaint.setTypeface(i2.e(context, resourceId));
            } catch (Resources.NotFoundException unused) {
                Assertion.g("TextBadgeDrawable:: Font cannot be loaded.");
            }
        }
        textPaint.setTextSize((float) obtainStyledAttributes.getDimensionPixelSize(0, -1));
        textPaint.setColor(obtainStyledAttributes.getColor(1, -16777216));
        obtainStyledAttributes.recycle();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.mLabelBoundsF.set(0.0f, 0.0f, (float) this.mIntrinsicWidth, (float) this.mIntrinsicHeight);
        RectF rectF = this.mLabelBoundsF;
        int i = this.mRadius;
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.mRectPaint);
        this.mLayout.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mIntrinsicHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mIntrinsicWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    public String getText() {
        return this.mText;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.mColorStateList.getColorForState(iArr, this.mDefaultColor);
        if (colorForState == this.mRectPaint.getColor()) {
            return super.onStateChange(iArr);
        }
        this.mRectPaint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.mRectPaint.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mRectPaint.setColorFilter(colorFilter);
    }
}
