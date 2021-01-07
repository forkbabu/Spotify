package com.spotify.music.features.ads.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.core.content.a;
import com.spotify.music.C0707R;

public class OverlayBackgroundView extends FrameLayout implements pu3 {
    private final GradientDrawable a;

    public OverlayBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // defpackage.pu3
    public void setColor(int i) {
        this.a.setColorFilter(i, PorterDuff.Mode.DST_OVER);
    }

    public void setRadius(float f) {
        this.a.setCornerRadius(f);
    }

    public OverlayBackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.a = gradientDrawable;
        gradientDrawable.setColor(a.b(context, C0707R.color.modal_overlay_background));
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        setBackground(gradientDrawable);
    }
}
