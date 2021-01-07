package com.spotify.paste.widgets.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageButton;

public class StateListAnimatorImageButton extends AppCompatImageButton implements zud {
    private final yud mStateListAnimatorHelper = new yud(this);

    public StateListAnimatorImageButton(Context context) {
        super(context);
        bvd a = dvd.a(this);
        a.f(this);
        a.a();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        yud yud = this.mStateListAnimatorHelper;
        if (yud != null) {
            yud.a();
        }
    }

    @Override // defpackage.zud
    public l getStateListAnimatorCompat() {
        return this.mStateListAnimatorHelper.b();
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        yud yud = this.mStateListAnimatorHelper;
        if (yud != null) {
            yud.c();
        }
    }

    @Override // defpackage.zud
    public void setStateListAnimatorCompat(l lVar) {
        this.mStateListAnimatorHelper.d(lVar);
    }

    public StateListAnimatorImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        bvd a = dvd.a(this);
        a.f(this);
        a.a();
    }

    public StateListAnimatorImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        bvd a = dvd.a(this);
        a.f(this);
        a.a();
    }
}
