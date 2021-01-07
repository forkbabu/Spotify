package com.spotify.paste.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

public class SquareImageView extends AppCompatImageView implements zud {
    private final yud a = new yud(this);

    public SquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
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
        boolean z = false;
        boolean z2 = View.MeasureSpec.getSize(i) == 0 || getLayoutParams().width == -2;
        if (View.MeasureSpec.getSize(i2) == 0 || getLayoutParams().height == -2) {
            z = true;
        }
        if (z2) {
            i = z42.A(ImageView.getDefaultSize(getSuggestedMinimumWidth(), i2));
        } else if (z) {
            i2 = z42.A(ImageView.getDefaultSize(getSuggestedMinimumHeight(), i));
        }
        super.onMeasure(i, i2);
    }

    @Override // defpackage.zud
    public void setStateListAnimatorCompat(l lVar) {
        this.a.d(lVar);
    }

    public SquareImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
