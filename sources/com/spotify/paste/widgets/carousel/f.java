package com.spotify.paste.widgets.carousel;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.carousel.c;

public class f implements g {
    private final int a;

    public f(Context context) {
        this.a = (int) TypedValue.applyDimension(1, 16.0f, context.getResources().getDisplayMetrics());
    }

    private void e(View view, float f, boolean z) {
        float f2;
        float measuredWidth = 1.0f - ((((float) (this.a * 2)) / ((float) view.getMeasuredWidth())) * f);
        view.setScaleX(measuredWidth);
        view.setScaleY(measuredWidth);
        if (z) {
            f2 = Math.max(0.0f, 1.0f - f);
        } else {
            f2 = Math.max(0.6f, 1.0f - (f * 0.4f));
        }
        c.b bVar = (c.b) view.getTag(C0707R.id.paste_carousel_animation_info);
        if (bVar == null) {
            view.setAlpha(f2);
        } else {
            bVar.a = f2;
        }
    }

    @Override // com.spotify.paste.widgets.carousel.g
    public int a() {
        return this.a;
    }

    @Override // com.spotify.paste.widgets.carousel.g
    public int b() {
        return this.a;
    }

    @Override // com.spotify.paste.widgets.carousel.g
    public void c(View view, float f, int i) {
        e(view, f, false);
    }

    @Override // com.spotify.paste.widgets.carousel.g
    public void d(View view, float f, int i) {
        e(view, f, false);
    }
}
