package com.spotify.paste.widgets.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;

public class StateListAnimatorRadioButton extends AppCompatRadioButton implements zud {
    private final yud f = new yud(this);

    public StateListAnimatorRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        dvd.a(this).a();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatRadioButton, android.widget.TextView, android.widget.CompoundButton, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f.a();
    }

    @Override // defpackage.zud
    public l getStateListAnimatorCompat() {
        return this.f.b();
    }

    @Override // android.widget.TextView, android.widget.CompoundButton, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f.c();
    }

    @Override // defpackage.zud
    public void setStateListAnimatorCompat(l lVar) {
        this.f.d(lVar);
    }

    public StateListAnimatorRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        dvd.a(this).a();
    }
}
