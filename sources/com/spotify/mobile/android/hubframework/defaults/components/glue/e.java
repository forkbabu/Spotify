package com.spotify.mobile.android.hubframework.defaults.components.glue;

import android.content.res.Resources;
import com.spotify.music.C0707R;

final class e {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final float f;

    public e(Resources resources) {
        this.a = resources.getDimensionPixelSize(C0707R.dimen.hub_card_default_text_area);
        this.b = resources.getDimensionPixelSize(C0707R.dimen.hub_card_normal_image_height);
        this.c = resources.getDimensionPixelSize(C0707R.dimen.hub_card_small_image_height);
        this.d = resources.getDimensionPixelSize(C0707R.dimen.hub_carousel_item_spacing);
        this.e = resources.getDimensionPixelSize(C0707R.dimen.category_card_max_height);
        this.f = resources.getFraction(C0707R.fraction.category_card_width_to_height_ratio, 1, 1);
    }

    /* access modifiers changed from: package-private */
    public int a(int i, int i2) {
        int i3;
        float f2;
        int i4;
        if (i2 == C0707R.id.hub_glue_card_title || i2 == C0707R.id.hub_glue_card_title_metadata || i2 == C0707R.id.hub_glue_card_title_subtitle || i2 == C0707R.id.hub_glue2_regular_card_title || i2 == C0707R.id.hub_glue2_regular_card_title_metadata || i2 == C0707R.id.hub_glue2_regular_card_title_subtitle) {
            int i5 = this.a;
            i3 = this.b;
            i4 = i5;
        } else {
            if (i2 == C0707R.id.hub_glue_card_category || i2 == C0707R.id.hub_glue2_card_category) {
                i3 = this.e;
                f2 = this.f;
                i4 = 0;
                return z42.A(nud.a(i, (i / ((int) (((float) i3) * f2))) + 1, i3 + i4, i4, this.d, f2));
            }
            if (!(i2 == C0707R.id.hub_glue_card_no_text)) {
                return z42.B();
            }
            i3 = this.c;
            i4 = 0;
        }
        f2 = 1.0f;
        return z42.A(nud.a(i, (i / ((int) (((float) i3) * f2))) + 1, i3 + i4, i4, this.d, f2));
    }
}
