package com.spotify.music.nowplaying.drivingmode.view.backgroundgradients;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.a;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;

public class DrivingOverlayNpvGradientBackgroundView extends FrameLayout implements fqd {
    private final GradientDrawable a;
    private View b;
    private View c;

    public DrivingOverlayNpvGradientBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setClosePivotTouchArea(View view) {
        this.c = view;
    }

    @Override // defpackage.fqd
    public void setColor(int i) {
        if (i == a.b(getContext(), R.color.black)) {
            i = a.b(getContext(), C0707R.color.driving_npv_fallback_color);
        }
        int h = s2.h(i, 127);
        this.a.setColorFilter(h, PorterDuff.Mode.DST_OVER);
        View view = this.b;
        if (view != null) {
            view.setBackgroundColor(h);
        }
        View view2 = this.c;
        if (view2 != null) {
            view2.setBackgroundColor(h);
        }
    }

    public void setOpenPivotTouchArea(View view) {
        this.b = view;
    }

    public DrivingOverlayNpvGradientBackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{a.b(context, C0707R.color.bg_gradient_start_color), a.b(context, C0707R.color.bg_gradient_end_color)});
        this.a = gradientDrawable;
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        setBackground(gradientDrawable);
    }
}
