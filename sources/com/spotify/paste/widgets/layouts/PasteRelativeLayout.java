package com.spotify.paste.widgets.layouts;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.spotify.paste.widgets.internal.b;
import com.spotify.paste.widgets.internal.c;

public class PasteRelativeLayout extends RelativeLayout implements b, c, zud {
    private static final int[] f = {16842914};
    private static final int[] n = {-16842910};
    private yud a;
    private boolean b;
    private boolean c;

    public PasteRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a() {
        if (this.a == null) {
            this.a = new yud(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void drawableStateChanged() {
        super.drawableStateChanged();
        a();
        this.a.a();
    }

    @Override // defpackage.zud
    public l getStateListAnimatorCompat() {
        return this.a.b();
    }

    @Override // android.view.View, android.view.ViewGroup
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        a();
        this.a.c();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.b) {
            RelativeLayout.mergeDrawableStates(onCreateDrawableState, f);
        }
        if (this.c) {
            for (int i2 = 0; i2 < onCreateDrawableState.length; i2++) {
                if (onCreateDrawableState[i2] == 16842910) {
                    onCreateDrawableState[i2] = -16842910;
                }
            }
            RelativeLayout.mergeDrawableStates(onCreateDrawableState, n);
        }
        return onCreateDrawableState;
    }

    @Override // com.spotify.paste.widgets.internal.b
    public void setActive(boolean z) {
        this.b = z;
        refreshDrawableState();
    }

    @Override // com.spotify.paste.widgets.internal.c
    public void setAppearsDisabled(boolean z) {
        this.c = z;
        refreshDrawableState();
    }

    @Override // defpackage.zud
    public void setStateListAnimatorCompat(l lVar) {
        this.a.d(lVar);
    }

    public PasteRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
