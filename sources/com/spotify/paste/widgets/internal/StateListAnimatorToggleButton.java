package com.spotify.paste.widgets.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatToggleButton;

public class StateListAnimatorToggleButton extends AppCompatToggleButton implements zud {
    private final yud mStateListAnimatorHelper = new yud(this);

    public StateListAnimatorToggleButton(Context context) {
        super(context);
        dvd.a(this).a();
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.ToggleButton, android.widget.TextView, android.widget.CompoundButton, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.mStateListAnimatorHelper.a();
    }

    @Override // defpackage.zud
    public l getStateListAnimatorCompat() {
        return this.mStateListAnimatorHelper.b();
    }

    @Override // android.widget.TextView, android.widget.CompoundButton, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.mStateListAnimatorHelper.c();
    }

    @Override // defpackage.zud
    public void setStateListAnimatorCompat(l lVar) {
        this.mStateListAnimatorHelper.d(lVar);
    }

    public StateListAnimatorToggleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        dvd.a(this).a();
    }

    public StateListAnimatorToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        dvd.a(this).a();
    }
}
