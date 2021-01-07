package com.spotify.paste.widgets.internal;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.textview.MaterialTextView;

public class StateListAnimatorTextView extends MaterialTextView implements zud {
    private final yud mStateListAnimatorHelper = new yud(this);

    public StateListAnimatorTextView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.mStateListAnimatorHelper.a();
    }

    @Override // defpackage.zud
    public l getStateListAnimatorCompat() {
        return this.mStateListAnimatorHelper.b();
    }

    @Override // android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.mStateListAnimatorHelper.c();
    }

    @Override // defpackage.zud
    public void setStateListAnimatorCompat(l lVar) {
        this.mStateListAnimatorHelper.d(lVar);
    }

    public StateListAnimatorTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StateListAnimatorTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
