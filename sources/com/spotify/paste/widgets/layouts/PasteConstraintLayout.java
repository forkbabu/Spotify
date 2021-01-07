package com.spotify.paste.widgets.layouts;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.paste.widgets.internal.b;
import com.spotify.paste.widgets.internal.c;

public class PasteConstraintLayout extends ConstraintLayout implements zud, b, c {
    private static final int[] f = {16842914};
    private static final int[] n = {-16842910};
    private boolean a;
    private boolean b;
    private yud c;

    public PasteConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void C() {
        if (this.c == null) {
            this.c = new yud(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C();
        this.c.a();
    }

    @Override // defpackage.zud
    public l getStateListAnimatorCompat() {
        return this.c.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        C();
        this.c.c();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.a) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f);
        }
        if (this.b) {
            for (int i2 = 0; i2 < onCreateDrawableState.length; i2++) {
                if (onCreateDrawableState[i2] == 16842910) {
                    onCreateDrawableState[i2] = -16842910;
                }
            }
            ViewGroup.mergeDrawableStates(onCreateDrawableState, n);
        }
        return onCreateDrawableState;
    }

    @Override // com.spotify.paste.widgets.internal.b
    public void setActive(boolean z) {
        this.a = z;
        refreshDrawableState();
    }

    @Override // com.spotify.paste.widgets.internal.c
    public void setAppearsDisabled(boolean z) {
        this.b = z;
        refreshDrawableState();
    }

    @Override // defpackage.zud
    public void setStateListAnimatorCompat(l lVar) {
        this.c.d(lVar);
    }

    public PasteConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C();
    }
}
