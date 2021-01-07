package com.spotify.voice.results.impl.view;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.music.C0707R;

public final class d implements ViewPager2.i {
    private final float a;
    private float b = -1.0f;
    private float c = -1.0f;

    public d(Resources resources) {
        this.a = (float) resources.getDimensionPixelSize(C0707R.dimen.row_height_and_padding);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void a(View view, float f) {
        if (this.b == -1.0f) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                if (viewGroup.getChildAt(i2).getVisibility() == 0) {
                    i++;
                }
            }
            this.b = ((float) i) * this.a;
        }
        if (this.c == -1.0f) {
            this.c = (float) view.getHeight();
        }
        float f2 = this.c;
        float f3 = this.b;
        if (f2 - f3 > this.a) {
            view.setTranslationY(((-(f2 - f3)) * f) / 2.0f);
        }
        view.setAlpha(Math.max(0.4f, 1.0f - Math.abs(f)));
    }
}
