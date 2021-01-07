package com.spotify.paste.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.common.base.MoreObjects;

public class FlexibleSquareImageView extends AppCompatImageView implements zud {
    private final yud a;
    private float b;

    public FlexibleSquareImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.a();
    }

    @Override // defpackage.zud
    public l getStateListAnimatorCompat() {
        return this.a.b();
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.a.c();
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int max = (int) Math.max(((float) View.MeasureSpec.getSize(i)) * this.b, (float) getSuggestedMinimumWidth());
        setMeasuredDimension(max, max);
    }

    @Override // defpackage.zud
    public void setStateListAnimatorCompat(l lVar) {
        this.a.d(lVar);
    }

    public FlexibleSquareImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new yud(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.d, i, 0);
        MoreObjects.checkArgument(obtainStyledAttributes.hasValue(0));
        this.b = obtainStyledAttributes.getFraction(0, 1, 1, 1.0f);
        obtainStyledAttributes.recycle();
    }
}
