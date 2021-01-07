package com.spotify.music.carmodehome.view.title;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.h;

public final class HomeTitleView extends AppCompatTextView {
    private float a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
    }

    private final AnimatorSet j(boolean z) {
        float f = z ? -this.a : this.a;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(400L);
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.TRANSLATION_Y, f, 0.0f), ObjectAnimator.ofFloat(this, View.ALPHA, 0.0f, 1.0f));
        return animatorSet;
    }

    @Override // android.widget.TextView
    public boolean isSingleLine() {
        return getMaxLines() == 1;
    }

    public final void k() {
        j(false).start();
    }

    public final void l() {
        j(true).start();
    }

    public final void m(float f, boolean z) {
        setAlpha(Math.abs(f));
        float f2 = (((float) 1) - f) * this.a;
        if (!z) {
            f2 = -f2;
        }
        setTranslationY(f2);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a = ((float) i2) * 0.3f;
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        int i = z ? 1 : 2;
        if (getMaxLines() != i) {
            setLines(i);
        }
    }

    public void setTitle(String str) {
        h.e(str, "title");
        setText(str);
    }
}
