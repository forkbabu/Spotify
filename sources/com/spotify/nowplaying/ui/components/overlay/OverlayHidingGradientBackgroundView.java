package com.spotify.nowplaying.ui.components.overlay;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.a;
import com.spotify.music.C0707R;

public class OverlayHidingGradientBackgroundView extends OverlayHidingFrameLayout implements fqd {
    private final GradientDrawable w;

    public OverlayHidingGradientBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // defpackage.fqd
    public void setColor(int i) {
        this.w.setColorFilter(i, PorterDuff.Mode.DST_OVER);
    }

    public OverlayHidingGradientBackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{a.b(context, C0707R.color.bg_gradient_start_color), a.b(context, C0707R.color.bg_gradient_end_color)});
        this.w = gradientDrawable;
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        setBackground(gradientDrawable);
    }
}
