package com.spotify.music.features.ads.audioplus.overlay.brandads;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.spotify.music.C0707R;

public class BrandAdsCTAButton extends AppCompatButton implements pu3 {
    public BrandAdsCTAButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.style.res_2132083057_leavebehind_button_cta);
    }

    @Override // defpackage.pu3
    public void setColor(int i) {
        getBackground().setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public BrandAdsCTAButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
