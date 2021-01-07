package com.spotify.music.carmode.nowplaying.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.a;
import com.spotify.music.C0707R;

public class BackgroundColorView extends View implements fqd {
    public BackgroundColorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // defpackage.fqd
    public void setColor(int i) {
        setBackgroundColor(s2.e(s2.h(i, (int) 76.5f), a.b(getContext(), C0707R.color.car_mode_paint_layer_under_extracted_color)));
    }

    public BackgroundColorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
