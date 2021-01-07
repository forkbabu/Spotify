package com.spotify.mobile.android.storytelling.controls.stories;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class ShareButton extends ConstraintLayout implements zud {
    private final yud a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShareButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        h.e(context, "context");
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.a();
    }

    @Override // defpackage.zud
    public l getStateListAnimatorCompat() {
        return this.a.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.a.c();
    }

    @Override // defpackage.zud
    public void setStateListAnimatorCompat(l lVar) {
        this.a.d(lVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        this.a = new yud(this);
        LayoutInflater.from(context).inflate(C0707R.layout.share_button, (ViewGroup) this, true);
        dvd.a(this).a();
    }
}
