package com.spotify.music.libs.connect.access.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;

public class PressableConnectCardView extends CardView implements zud {
    private final yud s = new yud(this);

    public PressableConnectCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.s.a();
    }

    @Override // defpackage.zud
    public l getStateListAnimatorCompat() {
        return this.s.b();
    }

    @Override // android.view.View, android.view.ViewGroup
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.s.c();
    }

    @Override // defpackage.zud
    public void setStateListAnimatorCompat(l lVar) {
        this.s.d(lVar);
    }

    public PressableConnectCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
