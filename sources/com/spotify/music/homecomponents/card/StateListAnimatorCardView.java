package com.spotify.music.homecomponents.card;

import android.content.Context;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;

public class StateListAnimatorCardView extends CardView implements zud {
    private yud s;

    public StateListAnimatorCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void o() {
        if (this.s == null) {
            this.s = new yud(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void drawableStateChanged() {
        super.drawableStateChanged();
        o();
        this.s.a();
    }

    @Override // defpackage.zud
    public l getStateListAnimatorCompat() {
        return this.s.b();
    }

    @Override // android.view.View, android.view.ViewGroup
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        o();
        this.s.c();
    }

    @Override // defpackage.zud
    public void setStateListAnimatorCompat(l lVar) {
        this.s.d(lVar);
    }

    public StateListAnimatorCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o();
    }
}
