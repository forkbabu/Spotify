package com.spotify.paste.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageButton;

public class CheckableImageButton extends AppCompatImageButton implements Checkable, zud {
    private static final int[] c = {16842912};
    private boolean a;
    private final yud b = new yud(this);

    public CheckableImageButton(Context context) {
        super(context);
        dvd.a(this).a();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.b.a();
    }

    @Override // defpackage.zud
    public l getStateListAnimatorCompat() {
        return this.b.b();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.b.c();
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            ImageButton.mergeDrawableStates(onCreateDrawableState, c);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.a != z) {
            this.a = z;
            refreshDrawableState();
        }
    }

    @Override // defpackage.zud
    public void setStateListAnimatorCompat(l lVar) {
        this.b.d(lVar);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        dvd.a(this).a();
    }
}
