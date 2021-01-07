package com.spotify.encore.consumer.elements.badge.contentrestriction;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import androidx.core.content.a;
import com.spotify.encore.consumer.elements.R;
import com.spotify.mobile.android.util.Assertion;

/* access modifiers changed from: package-private */
public class AgeRestrictionDrawable extends Drawable {
    private static final String OVER_19_TEXT = "19";
    private static final int[] R_styleable_TextAppearance = {16843692};
    private static final int R_styleable_TextAppearance_fontFamily = 0;
    private final ColorStateList mCircleColorStateList;
    private final Paint mCirclePaint;
    private final int mDefaultCircleColor;
    private final int mDefaultHeight;
    private final int mDefaultTextColor;
    private final int mStrokeWidth;
    private final String mText;
    private final Rect mTextBounds = new Rect();
    private final ColorStateList mTextColorStateList;
    private final int mTextPadding;
    private final TextPaint mTextPaint;

    public enum Restriction {
        OVER_19
    }

    public AgeRestrictionDrawable(Context context, int i, Restriction restriction) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.age_restriction_badge_stroke_width);
        this.mStrokeWidth = dimensionPixelSize;
        this.mDefaultHeight = resources.getDimensionPixelSize(R.dimen.age_restriction_badge_size);
        this.mTextPadding = resources.getDimensionPixelSize(R.dimen.age_restriction_badge_text_padding);
        this.mTextColorStateList = a.c(context, R.color.encore_accessory);
        this.mCircleColorStateList = a.c(context, R.color.age_restriction_red);
        int b = a.b(context, com.spotify.encore.foundation.R.color.gray_70);
        this.mDefaultTextColor = b;
        int b2 = a.b(context, com.spotify.encore.foundation.R.color.red);
        this.mDefaultCircleColor = b2;
        this.mText = resolveText(restriction);
        Paint paint = new Paint(1);
        this.mCirclePaint = paint;
        paint.setColor(b2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) dimensionPixelSize);
        TextPaint textPaint = new TextPaint();
        this.mTextPaint = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setColor(b);
        applyStyle(context, textPaint, i);
    }

    private static void applyStyle(Context context, TextPaint textPaint, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, R_styleable_TextAppearance);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        if (resourceId > 0) {
            try {
                textPaint.setTypeface(i2.e(context, resourceId));
            } catch (Resources.NotFoundException unused) {
                Assertion.g("AgeRestrictionDrawable:: Font cannot be loaded.");
            }
        }
        obtainStyledAttributes.recycle();
    }

    private int getSize() {
        return super.getIntrinsicHeight() != -1 ? super.getIntrinsicHeight() : this.mDefaultHeight;
    }

    private static String resolveText(Restriction restriction) {
        return restriction == Restriction.OVER_19 ? OVER_19_TEXT : "";
    }

    private void updateTextSize() {
        this.mTextPaint.setTextSize((float) (getIntrinsicHeight() - (this.mTextPadding * 2)));
        TextPaint textPaint = this.mTextPaint;
        String str = this.mText;
        textPaint.getTextBounds(str, 0, str.length(), this.mTextBounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        float intrinsicWidth = ((float) getIntrinsicWidth()) / 2.0f;
        canvas.drawCircle(intrinsicWidth, ((float) getIntrinsicHeight()) / 2.0f, intrinsicWidth - (((float) this.mStrokeWidth) * 0.5f), this.mCirclePaint);
        canvas.translate(((float) (getIntrinsicWidth() - (this.mTextBounds.width() + this.mTextBounds.left))) / 2.0f, ((float) (this.mTextBounds.height() + getIntrinsicHeight())) / 2.0f);
        canvas.drawText(this.mText, 0.0f, 0.0f, this.mTextPaint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return getSize();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return getSize();
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

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        updateTextSize();
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z;
        int colorForState = this.mTextColorStateList.getColorForState(iArr, this.mDefaultTextColor);
        if (colorForState != this.mTextPaint.getColor()) {
            this.mTextPaint.setColor(colorForState);
            z = true;
        } else {
            z = false;
        }
        int colorForState2 = this.mCircleColorStateList.getColorForState(iArr, this.mDefaultCircleColor);
        if (colorForState2 != this.mCirclePaint.getColor()) {
            this.mCirclePaint.setColor(colorForState2);
            z = true;
        }
        if (z || super.onStateChange(iArr)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.mCirclePaint.setAlpha(i);
        this.mTextPaint.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mCirclePaint.setColorFilter(colorFilter);
        this.mTextPaint.setColorFilter(colorFilter);
    }
}
