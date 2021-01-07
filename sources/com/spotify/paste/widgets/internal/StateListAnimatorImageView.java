package com.spotify.paste.widgets.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

public class StateListAnimatorImageView extends AppCompatImageView implements zud {
    private final yud mStateListAnimatorHelper = new yud(this);

    public StateListAnimatorImageView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.mStateListAnimatorHelper.a();
    }

    @Override // defpackage.zud
    public l getStateListAnimatorCompat() {
        return this.mStateListAnimatorHelper.b();
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.mStateListAnimatorHelper.c();
    }

    @Override // defpackage.zud
    public void setStateListAnimatorCompat(l lVar) {
        this.mStateListAnimatorHelper.d(lVar);
    }

    public StateListAnimatorImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StateListAnimatorImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
